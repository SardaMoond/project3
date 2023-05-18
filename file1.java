public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int targetNumber = 5;
        System.out.println(binarySearch(numbers, targetNumber));
    }
}
JavaScript - String Reversal:
javascript
Copy code
function reverseString(string) {
  return string.split("").reverse().join("");
}

let originalString = "Hello, World!";
let reversedString = reverseString(originalString);
console.log(reversedString);
C++ - Prime Number Check:
cpp
Copy code
#include <iostream>

bool isPrime(int number) {
    if (number < 2) {
        return false;
    }
