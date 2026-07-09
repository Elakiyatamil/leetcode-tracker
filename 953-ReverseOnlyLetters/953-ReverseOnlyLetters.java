// Last updated: 09/07/2026, 09:49:00
class Solution 
{
    public String reverseOnlyLetters(String s) 
    {
        ArrayList<Character> list = new ArrayList<>();
         for(char ch : s.toCharArray())
           {
             if(Character.isLetter(ch))
             {
                list.add(ch);
             }
           }
            StringBuilder result = new StringBuilder();
            for(char ch : s.toCharArray())
            {
                if (Character.isLetter(ch))
                {
                    result.append(list.remove(list.size()-1));
                } 
                else 
                {
                    result.append(ch);
                }
            }
          return result.toString();
    }
}