class Solution {
    public int vowelConsonantScore(String s) {
        
       
        String str="aeiouAEIOU";
        int v=0;
        int c=0;
		
		for(char ch: s.toCharArray())
		{
			if(Character.isLetter(ch)&& str.indexOf(ch)==-1)
			{
				c++;
			}
            else if(Character.isLetter(ch)&& str.indexOf(ch)!=-1)
            {
                v++;
            }
		}
         int score=0;
        if(c>0)
        {
        score=(v/c);
        }
        else
        {
            score=0;
        }
        return score;
    }
}
