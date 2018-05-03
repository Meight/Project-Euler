(*
** This file contains a solution to the problem number 4 of the Project Euler, last modified on 5/3/2018.
** Copyright (c) Matthieu Le Boucher. All rights reserved.
*)

open System

// Tells whether or not a given number is a palindrome, by reversing and comparing its string representation.
let isPalindrome n =
    let figuresList = Seq.toList (sprintf "%d" n)
    figuresList = List.rev figuresList

// Build a sequence of all palindromic products of 3-digit numbers.
let palindromeProducts =
    seq {
        for i in 999 .. -1 .. 100 do
            for j in i .. -1 .. 100 do
                let product = i * j
                if isPalindrome product then yield product
        }

// Result is the maximum of these products.
let result = Seq.max palindromeProducts

printfn "%A" result