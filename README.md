# primes

Calculate 10 primes and print out a matrix

## Installation

Will require you have lein/clojure/java installed

```
$ lein uberjar
```

## Usage

    $ java -jar primes-0.1.0-standalone.jar [args]

## Further work

There is alot of scope for optimization here. 2 areas that could yield good runtime benefits would be how the range of numbers inside prime? is created. The implementation at the moment removes even number, more rules could be introduced to reduce the number tests to figure out if the number is prime (various sifting algorithms are mentioned on wiki). An example would be only testing up to square root of the candidate prime, this would necessite changing from the count method to prove it is a prime and introducing special cases for 1. 

## License

Copyright © 2018 Lachlanh

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
