#!/usr/bin/env bash

echo "Running tests on Java solutions..."
java -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_74\jre\lib\*;C:\production\Project-Euler" Test.RunTests &> "$1"

read -p "Press any key to continue... " -n1 -s