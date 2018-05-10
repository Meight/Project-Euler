(*
** This file contains a solution to the problem number 7 of the Project Euler, last modified on 5/10/2018.
** Copyright (c) Matthieu Le Boucher. All rights reserved.
*)

open System

let checkFactors n =
    let rec checkFactor n i upperBound =
        if i >= upperBound then
            true
        else 
            if n % i = 0 || n % (i + 2) = 0 then false
            else checkFactor n (i + 6) upperBound
    checkFactor n 5 (int (sqrt (float n)))

let isPrime n =
    if n % 2 = 0 then false
    elif n < 9 then true
    elif n % 3 = 0 then false
    else checkFactors n

let findNthPrime n =
    let rec countPrimes counter currentNumber =
        if counter < n then
            let newNumber = currentNumber + 2
            countPrimes (if isPrime newNumber then counter + 1 else counter) newNumber
        else
            currentNumber
    countPrimes 1 1
    
printf "%A" (findNthPrime 10001)