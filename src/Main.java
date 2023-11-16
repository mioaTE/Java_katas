import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


    }
    public class Kata {
//        Create a method called isStrictlyIncreasing that takes in an integer array called nums. Return true if the values in the array are strictly increasing. Return false otherwise.
//
//        For example:
//
//        isStrictlyIncreasing({5,7,8,10}) → true
//        isStrictlyIncreasing({5,7,7,10}) → false
//        isStrictlyIncreasing({-5,-3,0,17}) → true
        public boolean isStrictlyIncreasing(int[] nums){
            boolean isIncreasing = false;
            for(int i =0; i < nums.length-1; i++){
                if(nums[i] < nums[i+1]){
                    isIncreasing = true;
                }else if(nums[i] >= nums[i+1]){
                    isIncreasing = false;
                    return isIncreasing;
                }

            }
            return isIncreasing;
        }

//        Create a method called factorial that takes in an integer n and returns the factorial of the number. A factorial is the product of all positive integers less than or equal to n.
//
//        For example:
//
//        factorial(3) → 6 (since 1 * 2 * 3 = 6)
//        factorial(4) → 24 (since 1 * 2 * 3 * 4 = 24)
//        factorial(10) → 3628800
        public int factorial(int n){
            int result = 1;
            for(int i = 1; i <= n; i++){
                result *= i;
            }
            return result;
        }

//        Create a method called hasBad that takes in a string called str. Return true if "bad" appears starting at index 0 or 1 in str -- otherwise return false. str may be any length, including 0.
//
//        For example:
//
//        hasBad("badxx") → true
//        hasBad("xbadxx") → true
//        hasBad("xxbadxx") → false

        public boolean hasBad(String str) {
            if (str.length() >= 3 && (str.substring(0, 3).equals("bad") ||
                    (str.length() >= 4 && str.substring(1, 4).equals("bad")))) {
                return true;
            }
            return false;
        }

//        Create a method called frontTimes that takes in a string str and an integer n. The front of str is the first 3 characters, or whatever is there if str is less than length 3. Return a string made up of n copies of the front.
//
//        For example:
//
//        frontTimes("Chocolate", 2) → "ChoCho"
//        frontTimes("Chocolate", 3) → "ChoChoCho"
//        frontTimes("Ab", 3) → "AbAbAb"
        public String frontTimes(String str, int n){
            String result = "";
            if(str.length() >= 3){
                for(int i = 0; i < n; i++){
                    result += str.substring(0, 3);
                }
            }else if(str.length() == 2){
                for(int i = 0; i < n; i++){
                    result += str.substring(0, 2);
                }
            }else{
                for(int i = 0; i < n; i++){
                    result += str.substring(0, 1);
                }
            }
            return result;
        }
//        Create a method called reverseString that takes in a string called str.
//        Return a string containing str in reverse order. str may be empty, but not null.
//
//        For example:
//
//        reverseString(“Hello!”) → “!olleH”
//        reverseString(“Kata”) → “ataK”
//        reverseString(“”) → “”
        public String reverseString(String str){
            String result = "";
            if(str.length() == 0){
                return result;
            }
            for(int i = str.length()-1; i >= 0; i--){
                result += str.charAt(i);
            }
            return result;
        }
    }
//    Create a method called reverseList that takes in a List of strings called strings. Return a new List in reverse order of the original.
//
//    For example:
//
//    reverseList( ["purple", "green", "blue", "yellow", "green" ])  →  ["green", "yellow", "blue", green", "purple" ]
//    reverseList( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"} ) →
        public List<String> reverseList(List<String> strings){
            List<String> result = new ArrayList<>();
            for(int i = strings.size() -1; i >= 0; i--){
                result.add(strings.get(i));
            }

            return result;
        }
    /*Create a method called list2Array that takes in a List of strings called strings. Return an array containing the same strings in the same order. Avoid using a standard library method that does the conversion for you.

    For example:

    list2Array( ["aa", "ab", "ac"] ) →   {"aa", "ab", "ac"}
    list2Array( ["as", "df", "jk"] ) →   {"as", "df", "jk"}
    list2Array( ["aaa", "bbb", "ccc", "ddd"] ) →   {"aaa", "bbb", "ccc", "ddd"}*/
        public String[] list2Array(List<String> strings){
            String[] result = new String[strings.size()];
            for(int i = 0; i < result.length; i++){
                result[i] = strings.get(i);
            }
            return result;
        }

//    Create a method called findLargest that takes in a List of integers called nums. Return the largest value in nums.
//
//    For example:
//
//    findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) →  33333
//    findLargest( [987, 1234, 9381, 731, 43718, 8932] ) →  43718
//    findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) →  64362.

    public int findLargest(List<Integer> nums){
        int result = 0;
        for(int num: nums){
            if(num> result){
                result = num;
            }
        }
        return result;
    }

//    Create a method called distinctValues that takes in a List of strings called strings. Return a List that contains the distinct values in strings.
//
//    For example:
//
//    distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) →  ["red", "yellow", "green", "blue", "purple"]
//    distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) →  ["jingle", "bells", "all", "the", "way"]
    public List<String> distinctValues(List<String> strings){
            List<String> result = new ArrayList<>();
            for(String string: strings){
                if(!result.contains(string)){
                    result.add(string);
                }
            }
            return result;
    }
//    Create a method called array2List that takes in a string array called strings. Return a List containing the elements of strings in the same order. Avoid using a standard library method that does the conversion for you. For example:
//
//    array2List( {"Apple", "Orange", "Banana"} ) →   ["Apple", "Orange", "Banana"]
//    array2List( {"Red", "Orange", "Yellow"} ) →   ["Red", "Orange", "Yellow"]
//    array2List( {"Left", "Right", "Forward", "Back"} ) →   ["Left", "Right", "Forward", "Back"]
    public List<String> array2List(String[] strings){
            List<String> result = new ArrayList<>();
            for(String string: strings){
                result.add(string);
            }
            return result;
    }
//    Create a method called arrayInt2ListDouble that takes in an integer array called ints. Divide each value in ints by 2, and return them in a List of Doubles.
//
//    For example:
//
//    arrayInt2ListDouble( {5, 8, 11, 200, 97} ) →  [2.5, 4.0, 5.5, 100, 48.5]
//    arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) →  [372.5, 11.5, 22, 4508.5, 3]
//    arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) →  [42, 49.5, 1642.5, 6.5, 438.5]
    public List<Double> arrayInt2ListDouble(int[] ints){
            List<Double> result = new ArrayList<>();
            for(int num: ints){
                result.add(num/2.0);
            }
            return result;

    }
//    Create a method called makeOutWord that takes in two strings, outword and word. Return a new string where the word is in the middle of the outword string. You can assume the length of outword is even.
//
//    For example:
//
//    makeOutWord("<<>>", "Yay") → "<<Yay>>"
//    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//    makeOutWord("[[]]", "word") → "[[word]]"
    public String makeOutWord(String outword, String word){
            String result = "";
            int length = outword.length()/2;
            result = outword.substring(0,length) + word + outword.substring(length);
            return result;
    }
//    Create a method called makeMiddle that takes in an integer array nums. Return a new array length 2 containing the middle two elements from nums. You can assume the length of nums is even and 2 or more.
//
//    For example:makeMiddle({1, 2, 3, 4}) → {2, 3}
//    makeMiddle({7, 1, 2, 3, 4, 9}) → {2, 3}
//    makeMiddle({1, 2}) → {1, 2}
    public int[] makeMiddle(int[] nums){
            if(nums.length == 2){
                return new int[]{nums[0], nums[1]};
            }
            int middle = nums.length/2;
            return new int[]{nums[middle-1], nums[middle]};
    }
//    Create a method called blackjack that takes in two integers, a and b. Return whichever value is nearest to 21 without going over. Return 0 if they both go over.
//
//    For example:
//
//    blackjack(19, 21) → 21
//    blackjack(21, 19) → 21
//    blackjack(19, 22) → 19
    public int blackjack(int a, int b){
            if(a > 21 && b > 21){
                return 0;
            }
            int aDiff = 21-a;
            int bDiff = 21-b;
            if(aDiff <0){
                return b;
            } else if (bDiff < 0) {
                return a;
            }
            if(aDiff < bDiff){
                   return a;
                }
            return b;
    }
//    Create a method called fizzBuzz with no parameters.
//    Return an array of 100 strings representing the values 1-100.
//    If the value is a multiple of both 3 and 5, put “FizzBuzz” in the array.
//    If the value is a multiple of 3 (but not 5), put “Fizz” in the array.
//    If the value is a multiple of 5 (but not 3), put “Buzz” in the array.
//    For all other values, put a string containing the value in the array.
//
//    For example:
//
//    fizzBuzz() → {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", ...}
    public String[] fizzBuzz(){
            String[] result = new String[100];
            for(int i = 1; i < 101; i++){
                if(i%15== 0){
                    result[i-1] = "FizzBuzz";
                } else if (i%3 == 0) {
                    result[i-1] = "Fizz";
                } else if (i%5 == 0) {
                    result[i-1] = "Buzz";
                }else{
                    result[i-1] = Integer.toString(i);
                }
            }
            return result;
    }
//    Create a method called fibonacci with no parameters.
//    In a Fibonacci sequence, every number after the first two is the sum of the two preceding ones.
//    Return an array of integers containing the Fibonacci sequence of 0, 1, 1, 2, 3,
//    and so on for the values less than 2000.
//
//    For example:
//
//    fibonacci() → {1, 1, 2, 3, 5, 8, 13, ... 987, 1597}
    public int[] fibonacci(){
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            newList.add(1);

            for(int i = 2; i< 2000; i++){
                newList.add(newList.get(i-1) + newList.get(i-2));
                if(newList.get(i) >= 2000){
                    break;
                }
            }
            int[] result = new int[newList.size()-1]; //last element is >= 2000
            for(int i = 0; i < result.length; i++){
                result[i] = newList.get(i);
            }
            return result;
    }
//    Create a method called primeFactors that takes in an integer n.
//    Return an integer array of the [prime factors] of n(https://www.mathsisfun.com/definitions/prime-factor.html).
//    Prime factors are the numbers you can multiply to get n that you can't break down into any smaller factors.
//    You can assume the input is greater than 1.
//
//            For example:
//
//            primeFactors(6) → {2, 3}
//    primeFactors(28) → {2, 2, 7}
//    primeFactors(667) → {23, 29}

    public int[] primeFactors(int n){
        ArrayList<Integer> primeFactorsList = new ArrayList<>();
        int divisor = 2;
        while (n > 1) {
            // Check if the number is divisible by the current divisor
            if (n % divisor == 0) {
                // If divisible, add the divisor to the list of prime factors
                primeFactorsList.add(divisor);

                // Divide the number by the divisor
                n /= divisor;
            } else {
                // If not divisible, move on to the next prime number
                divisor++;
            }
        }
        int[] result = new int[primeFactorsList.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = primeFactorsList.get(i);
        }
        return result;
    }

}