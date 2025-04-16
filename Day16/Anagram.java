package Day16;

class Solution {
    static final int MAX_CHAR = 26;

    public static boolean areAnagrams(String s1, String s2) {
        
        if(s1.length() != s2.length()) return false;

        int [] alphabets = new int[MAX_CHAR];
        
        for(int i =0; i<s1.length(); i++){
            alphabets[s1.charAt(i)-'a']++;
            alphabets[s2.charAt(i)-'a']--;
        }
        
        for(int letter : alphabets){
            if(letter != 0) 
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
        areAnagrams(s1,  s2);
    }
}