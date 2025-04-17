class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        int n = s.length(); 
            
        int[] freq = new int[26];
        char answer = '$';
        
        // count frequency.
        for(int i =0; i<n; i++){
            freq[s.charAt(i) - 'a']++;
        }
        
        for(int i =0; i<n; i++){
             if(freq[s.charAt(i) - 'a'] == 1){
                 return s.charAt(i);
             }
        }
        
        return answer;
    }
}