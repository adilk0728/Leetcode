// Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return a sorted array of only the integers that appeared in all three arrays.

 

// Example 1:

// Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
// Output: [1,5]
// Explanation: Only 1 and 5 appeared in the three arrays.



class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        
        int freq = 0;
        List<Integer> values = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<=arr1.length-1; i++){
            map.put(arr1[i], 1);
        }
        
        for(int i=0; i<=arr2.length-1; i++){
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }
        
        for(int i = 0; i<=arr3.length-1;  i++){
            map.put(arr3[i], map.getOrDefault(arr3[i], 0) + 1);
        }
        
        System.out.println(map);
        
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            int key = (int) it.next();
            if(map.get(key) == 3){
                values.add(key);
            }
        }
            
         return values;
    }
       
}