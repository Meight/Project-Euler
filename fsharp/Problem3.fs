(*
** This file contains a solution to the problem number 3 of the Project Euler, last modified on 5/2/2018.
** Copyright (c) Matthieu Le Boucher. All rights reserved.
*)

open System

// Target number 600851475143 is too big to fit on a 32-bit integer representation.
// We therefore use a 64-bit integer representation.
let primeFactors n =
    let rec nextPrimeFactor n proposition factors =
        if proposition = n then
            proposition::factors
        elif n % proposition = 0L then
            nextPrimeFactor (n / proposition) proposition (proposition::factors)
        else
            nextPrimeFactor n (proposition + 1L) factors
    nextPrimeFactor n 2L []

let result = List.max (primeFactors 600851475143L)

printfn "%A" result