
class VowelandConsonant
{
 public static void main(String[] args) {

 String s = new String("Ram12@2--=09 iip");
 int v=0,c=0;
 char ch;
 for(int i=0;i<s.length();i++)
 { ch=s.charAt(i);
    if(ch>=65&&ch<=122)
    {
       if(ch>90&&ch<97)
       {
        continue;
       }
       else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
       {
        v++;
       }
       else
       {
         c++;
       }
    }
   
 }
  System.out.println("Vowels : "+v);
    System.out.println("Consonant : "+c);
}
}
