package Day18;

import java.util.ArrayList;

class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> matchOccurences = new ArrayList<>();
        
        int  n1 = txt.length();
        int  n2 = pat.length();
        
        for(int i = 0; i<n1; i++){
            // first char matching...
            if(txt.charAt(i) == pat.charAt(0)){
                
                String temp = txt.substring(i, Math.min(i+n2, n1) );
                
                if( temp.equals(pat)){
                    matchOccurences.add(i);
                }
            }
        
        }
        
        return matchOccurences;
        
        
    }
}