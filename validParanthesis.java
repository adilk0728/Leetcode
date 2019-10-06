// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Note that an empty string is also considered valid.

// Example 1:

// Input: "()"
// Output: true
// Example 2:

// Input: "()[]{}"
// Output: true
// Example 3:

// Input: "(]"
// Output: false


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='('||a=='{'||a=='['){
                stack.push(a);   
            }
            else{
                if(!stack.empty()){
                    char popped = stack.pop();
                    if((popped == '(' && a==')') || (popped == '[' && a==']') || (popped == '{' && a=='}'))
                        continue;
                    else
                        return false;
                }
                else
                    return false;
            }
        }
        if(!stack.empty())
            return false;
        else
            return true;        
    }
}