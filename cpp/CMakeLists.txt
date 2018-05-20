cmake_minimum_required(VERSION 3.8)
project(cpp)

set(CMAKE_CXX_STANDARD 11)

set(SOURCE_FILES
        RunTests.cpp)

add_executable(RunTests ${SOURCE_FILES})