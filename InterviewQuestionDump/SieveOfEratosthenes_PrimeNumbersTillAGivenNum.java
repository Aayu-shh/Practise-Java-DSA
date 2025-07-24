package InterviewQuestionDump;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes_PrimeNumbersTillAGivenNum {

        /**
         * Finds all prime numbers up to a given limit using the Sieve of Eratosthenes algorithm.
         *
         * @param limit The upper bound for finding prime numbers.
         * @return A List of integers representing prime numbers up to the limit.
         */
        public List<Integer> findPrimes(int limit) {
            if (limit < 2) {
                return new ArrayList<>(); // No primes less than 2
            }

            // Create a boolean array "isPrime" and initialize all entries it as true.
            // A value at isPrime[i] will be false if i is not a prime, else true.
            boolean[] isPrime = new boolean[limit + 1];
            Arrays.fill(isPrime, true); // Assume all numbers are prime initially

            // 0 and 1 are not prime numbers
            isPrime[0] = false;
            isPrime[1] = false;

            // Start from 2, as it is the first prime number
            for (int p = 2; p * p <= limit; p++) {
                // If isPrime[p] is still true, then it is a prime
                if (isPrime[p]) {
                    // Mark all multiples of p as not prime
                    for (int i = p * p; i <= limit; i += p) {
                        isPrime[i] = false;
                    }
                }
            }

            // Collect all prime numbers into a list
            List<Integer> primes = new ArrayList<>();
            for (int i = 2; i <= limit; i++) {
                if (isPrime[i]) {
                    primes.add(i);
                }
            }

            return primes;
        }

        public static void main(String[] args) {
            SieveOfEratosthenes_PrimeNumbersTillAGivenNum sieve = new SieveOfEratosthenes_PrimeNumbersTillAGivenNum();
            int limit = 50; // Example limit

            List<Integer> primeNumbers = sieve.findPrimes(limit);
            System.out.println("Prime numbers up to " + limit + ": " + primeNumbers);
        }
    }
