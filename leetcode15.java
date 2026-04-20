
class leetcode15 {
    static boolean isPerfect(int n)
    {
        int sq=(int)Math.sqrt(n);
        if(sq*sq==n)
        {
            return true;
        }
        return false;
    }
    int bulbSwitching(int b)
    {
        int ison=0;
        for(int i=1;i<=b;i++)
        {
            if(isPerfect(i))
            {
                ison++;
            }
        }
        return ison;
    }
    public static void main(String[] args) {
         int bulb=36;
         leetcode15 obj=new leetcode15();
         System.out.println(obj.bulbSwitching(bulb));        
    }
}
