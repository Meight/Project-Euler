(*
** This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/2/2018.
** Copyright (c) Matthieu Le Boucher. All rights reserved.
*)

open System

let result = Seq.sum (seq { for n in 1..999 do if n % 3 = 0 || n % 5 = 0 then yield n })
printfn "%A" result