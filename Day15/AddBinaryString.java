package Day15;
public class AddBinaryString {
    static public String addBinary(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();

        // add padding "0" to the short string. 
        if(n1 > n2){
            s2 = "0".repeat(n1-n2) + s2;
        }else if(n2 >  n1){
            s1 = "0".repeat(n2-n1) + s1;
        }

        int carry = 0;
        int n = Math.max(n1, n2);
        StringBuilder result = new StringBuilder();

        for (int i = n-1; i >=0; i--) {
            int bit1 = s1.charAt(i) - '0';
            int bit2 = s2.charAt(i) - '0';
    
            int sum = bit1 + bit2 + carry;
    
            result.append(sum % 2);  // append 0 or 1
            carry = sum / 2;  // carry 0 or 1
        }


        if (carry != 0) {
            result.append('1');
        }
    
        result.reverse();
    
        // Remove leading zeros (if any), but return "0" (i < n-1) if the result is all zeros
        int i = 0;
        while (i < result.length() - 1 && result.charAt(i) == '0') {
            i++;
        }
    
        return result.substring(i);
    }
    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";
        System.out.println(addBinary(s1, s2));
    }
}