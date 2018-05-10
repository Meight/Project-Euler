let checkFactors n =
    let rec checkFactor n i upperBound =
        if i = upperBound then
            if n % i = 0 then false
            else true
        else
            if n % i = 0 || n % (i + 2) = 0 then false
            else checkFactor n (i + 6) upperBound
    checkFactor n 5 (int (sqrt (float n)))


let isPrime n =
    if n % 2 = 0 then false
    elif n < 9 then true
    elif n % 3 = 0 then false
    else true

