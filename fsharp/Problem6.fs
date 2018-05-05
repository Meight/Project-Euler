(*
** This file contains a solution to the problem number 6 of the Project Euler, last modified on 5/5/2018.
** Copyright (c) Matthieu Le Boucher. All rights reserved.
*)

open System

let n = 100
// Using pown instead of ** operator avoids using exponentials and stuff.
let result = (3 * (pown n 4) + 2 * (pown n 3) - 3 * (pown n 2) - 2 * n) / 12

printfn "%A" result