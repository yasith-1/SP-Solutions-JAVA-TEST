import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFinder {

    public static String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }

        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = b + a;
                String order2 = a + b;
                return order1.compareTo(order2);
            }
        });

        if (strNums[0].equals("0")) {
            return "0";
        }

        // String සියල්ල එකට එකතු කර අවසන් ප්‍රතිඵලය සෑදීම
        StringBuilder largestNum = new StringBuilder();
        for (String str : strNums) {
            largestNum.append(str);
        }

        return largestNum.toString();
    }

    public static void main(String[] args) {
        int[] nums = {50, 20, 1, 9};
        String result = largestNumber(nums);
        System.out.println("Largest Formed Number: " + result);
    }

}
