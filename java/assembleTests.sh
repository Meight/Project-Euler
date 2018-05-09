#!/usr/bin/env bash

echo "Assembling all test files..."
java -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_74\jre\lib\*;C:\production\Project-Euler" Test.LogsFormatter &> "$1"

