// Last updated: 09/07/2026, 09:51:46
class Solution {
    public String reverseVowels(String s) 
    {
        ArrayList <Character> vowcount = new ArrayList<>();
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        for(char ch : s.toCharArray())
        {
            if(vowels.contains(ch))
            {
                vowcount.add(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) 
        {
           if (vowels.contains(ch)) 
           {
                result.append(vowcount.remove(vowcount.size() - 1)); // Pop from end
           } 
           else
           {
               result.append(ch); // Keep consonant
           }
        }
     return result.toString();
    }
}