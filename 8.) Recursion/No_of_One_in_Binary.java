public class No_of_One_in_Binary {

    public static int countOnes(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "10000100100010001000100010001000";
        int ans = countOnes(str);
        System.out.println("No of One are : " + ans);
    }
}
