#!/usr/bin/env bash

RED='\033[1;31m'
GREEN='\033[1;32m'
NC='\033[0m' # No Color

genericScriptName="runTests.sh"
folders="java"
testsOutputDestination="tests"
allTestFiles=""

printf "Running all tests...\n\n"

for folder in $folders; do
    printf "Running tests from folder '${RED}$folder${NC}'...\n"

    fileName="$(dirname "$0")/$testsOutputDestination"_"$folder".dat
    fileName="${fileName//\\//}"
    $folder/$genericScriptName $fileName
    allTestFiles="$allTestFiles $fileName"

    printf "> ${GREEN} Done. Results saved to $fileName.${NC}\n\n"
done

printf "Assembling tests from ${RED}$allTestFiles${NC}...\n\n"

java/assembleTests.sh "$allTestFiles" > report/tests.dat

printf "Refreshing graph with assembled test data..."

pdflatex -quiet -synctex=1 -interaction=nonstopmode -output-directory=report report/graph.tex

printf "${GREEN} Done.${NC}\n\n"

read -p "Press any key to continue... " -n1 -s