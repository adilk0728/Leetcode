// We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)

// A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

// Return a list of all uncommon words. 

// You may return the list in any order.

 

// Example 1:

// Input: A = "this apple is sweet", B = "this apple is sour"
// Output: ["sweet","sour"]
// Example 2:

// Input: A = "apple apple", B = "banana"
// Output: ["banana"]


class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String [] str1 = A.split(" ");
        List <String> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();        
        for(int i =0; i<str1.length; i++){
            if(map.containsKey(str1[i])) {
            int count = map.get(str1[i]);
            count++;
            map.put(str1[i], count);
            } else {
            map.put(str1[i], 1);
        } 
    }
     String [] str2 = B.split(" ");   
     
    for(int i =0; i<str2.length; i++){
        if(map.containsKey(str2[i])){
            int count = map.get(str2[i]);
            count++;
            map.put(str2[i], count);
        } else {
            map.put(str2[i], 1);
        }
    }
        
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            String res = (String) it.next();
            if(map.get(res)==1){
                result.add(res);
            }
            
        }
        
        String [] finalResult = new String[result.size()];
        finalResult = result.toArray(finalResult);
        
     
   return finalResult;}     
   }
