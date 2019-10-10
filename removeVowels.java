// Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.

 

// Example 1:

// Input: "leetcodeisacommunityforcoders"
// Output: "ltcdscmmntyfrcdrs"
// Example 2:

// Input: "aeiou"
// Output: ""

class Solution {
    public String removeVowels(String S) {
        
        if(S == null){
            return null;
        }
        
        HashSet<Character> map = new HashSet<>();
        List<Character> list = new ArrayList<>();
        
        
        map.add('a');
        map.add('A');
        map.add('e');
        map.add('E');
        map.add('i');
        map.add('I');
        map.add('o');
        map.add('O');
        map.add('u');
        map.add('U');
        
        char[] temp = S.toCharArray();
        
        for(int i=0; i<=temp.length -1; i++){
            if(!map.contains(temp[i])){
                list.add(temp[i]);
            }
        }
        
        String myString = "";
        
        for (Character c : list) {
            myString += c;
            }
        return myString;
    }
}