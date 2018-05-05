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
let compute upperBound =
    let rec loopIt answer i upperBound =
        if i = upperBound then answer
        else loopIt (answer * i / (gcd answer i)) (i + 1) upperBound

    loopIt 1 1 upperBound

printfn "%A" (compute 20)