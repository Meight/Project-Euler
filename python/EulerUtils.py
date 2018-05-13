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
    """
    Returns the greater common divisor of two numbers that are not both zero.
    """
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def sieve(n):
    bound = int(n / 2)
    sieve = [False] * bound

    crossLimit = int((math.floor(math.sqrt(n)) - 1) / 2)

    for i in range(1, crossLimit):
        if not sieve[i]:
            # 2i + 1 is prime, mark its multiples.
            for j in range(2 * i * (i + 1), bound, 2 * i + 1):
                sieve[j] = True

    return sieve