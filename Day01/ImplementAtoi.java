package Day01;

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        int ans =0;
        boolean isNegative = s.charAt(0) == '-';
        
        for(int i =0; i<n; i++){
            // check for negative and whitespace..
            if((isNegative && i ==0 ) || (s.charAt(i)== ' ')) continue;
 
            // non -zero charactor...
            if(!Character.isDigit(s.charAt(i))){
                break;
            }
            
            int digit = s.charAt(i) - '0';
            
            // overflwo check...
            if(ans > (Integer.MAX_VALUE - digit)/ 10){               
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE; 
            }
 
            ans = ans * 10 + digit;
        }
        
        return isNegative ? -ans : ans;
    }
}