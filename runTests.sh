#!/usr/bin/env bash

RED='\033[1;31m'
GREEN='\033[1;32m'
NC='\033[0m' # No Color

genericScriptName="runTests.sh"
folders="java python"
testsOutputDestination="tests"

printf "Running all tests...\n\n"

for folder in $folders; do
    printf "Running tests from folder '${RED}$folder${NC}'...\n"

    $folder/$genericScriptName "$testsOutputDestination"_"$folder".dat

    printf "> ${GREEN} Done. Results saved to $testsOutputDestination.${NC}\n\n"
done

read -p "Press any key to continue... " -n1 -s