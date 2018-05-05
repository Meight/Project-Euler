(*
** This file contains a solution to the problem number 5 of the Project Euler, last modified on 5/5/2018.
** Copyright (c) Matthieu Le Boucher. All rights reserved.
*)

open System

// Computes the greater common divisor of two integers which are not all zero.
let rec gcd a b =
    match b with
    | 0 -> a
    | _ -> gcd b (a % b)

// Computes the lowest common multiplier (LCM) of {1, 2, ..., 20}.
// Assumes i <= 20.
let rec compute answer i =
    match i with
    | 20 -> answer
    | _ -> compute (answer * i / (gcd answer i)) (i + 1)

let result = compute 1 1

printfn "%A" result