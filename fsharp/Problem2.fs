(*
** This file contains a solution to the problem number 2 of the Project Euler, last modified on 5/2/2018.
** Copyright (c) Matthieu Le Boucher. All rights reserved.
*)

open System

let result = Seq.unfold (fun (a, b) -> Some(a + b, (b, a + b))) (0, 1)
             |> Seq.takeWhile (fun x -> x <= 4000000)
             |> Seq.where (fun x -> x % 2 = 0)
             |> Seq.sum

printfn "%A" result