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
    }
}