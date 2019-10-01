// Write a function that takes a string as input and reverse only the vowels of a string.

// Example 1:

// Input: "hello"
// Output: "holle"
// Example 2:

// Input: "leetcode"
// Output: "leotcede"
// Note:
// The vowels does not include the letter "y".


class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] characters = s.toCharArray();
        
        set.add('A');
        set.add('a');
        set.add('E');
        set.add('e');
        set.add('I');
        set.add('i');
        set.add('O');
        set.add('o');
        set.add('U');
        set.add('u');
        
        int start = 0;
        int end = s.length() - 1;
        
        while(start < end){
            while(start < end && !set.contains(characters[start])){
                start++;
            }
            while(start < end && !set.contains(characters[end])){
                end--;
            }
            
            char temp = characters[start];
            characters[start++] = characters[end];
            characters[end--] = temp;
        }
     String str = new String(characters);
    return str;}
}