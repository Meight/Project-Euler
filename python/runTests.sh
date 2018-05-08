#!/usr/bin/env bash

echo "Running tests on Python solutions..."
python "$(dirname "$0")/RunTests.py" "$1" > "$1"