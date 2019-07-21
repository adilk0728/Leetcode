// Given two strings s and t , write a function to determine if t is an anagram of s.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
    HashMap <Character, Integer> map = new HashMap<>();   
    for(int i=0; i<s.length(); i++){
        if(map.containsKey(s.charAt(i))){
        int count = map.get(s.charAt(i));
         count++;
        map.put(s.charAt(i),count);
        } else {
            int count=1;
            map.put(s.charAt(i),count);
        }
    }
  for(int i =0; i<t.length(); i++){
      if(map.containsKey(t.charAt(i))){
          int count = map.get(t.charAt(i));
          count--;
          map.put(t.charAt(i), count);
      } else {
          return false;
      }
  }
   Iterator it = map.values().iterator();
   while(it.hasNext()){
       int count = (int) it.next();
       if(count!=0){
           return false;
       } 
   }
        return true;
 }
}