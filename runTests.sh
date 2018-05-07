#!/usr/bin/env bash

RED='\033[0;31m'
NC='\033[0m' # No Color
printf "I ${RED}love${NC} Stack Overflow\n"

genericScriptName="runTests.sh"
folders="java"
testsOutputDestination="tests.txt"

echo "Running all tests..."

for folder in $folders; do
    echo "Running tests from folder '$folder'"...
    $folder/$genericScriptName "$testsOutputDestination"
done

read -p "Press any key to continue... " -n1 -s