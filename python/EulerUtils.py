import math

def isPrime(number):
    """
    Checks that a given number is a prime number.
    """
    if number == 1:
        return False

    if number < 4:
        return True

    if number % 2 == 0:
        return False

    if number < 9:
        return True

    if number % 3 == 0:
        return False

    for i in range(5, int(math.sqrt(number)) + 1, 6):
        if number % i == 0 or number % (i + 2) == 0:
            return False

    return True

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)