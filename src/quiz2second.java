public class quiz2second {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        print(nums);
    }

    public static void print(int[] nums) {
        System.out.println("Prime numbers in the array:");
        for (int i = 0; i < nums.length; i++) {
            if (checkprime(nums[i])) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    public static boolean checkprime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

