public class data_types {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 9, 11};
        System.out.println(nums[2]);
        nums[2] = 10;
        System.out.println(nums[2]);
        for(int num : nums) {
            System.out.println(num);
        }
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(matrix[1][2]);
    }
}
