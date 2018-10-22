class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int result=0;
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0,j=0;j<s.length();j++)
        {
            if(hm.containsKey(s.charAt(j)))
            {
                i=Math.max(hm.get(s.charAt(j)),i);
            }
            result=Math.max(result,j-i+1);
            hm.put(s.charAt(j),j+1);
        }
        return result;
    }
    
}