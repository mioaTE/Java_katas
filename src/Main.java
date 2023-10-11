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
}