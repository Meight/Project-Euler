cmake_minimum_required(VERSION 3.8)
project(cpp)

set(CMAKE_CXX_STANDARD 11)

set(SOURCE_FILES
        EulerUtils.h
        EulerUtils.cpp
        Problem004.cpp
        Problem005.cpp
        Problem006.cpp
        Problem007.cpp
        Problem008.cpp
        Problem009.cpp
        Problem010.cpp
        Problem014.cpp
        Problem019.cpp
        RunTests.cpp)

add_executable(RunTests ${SOURCE_FILES})