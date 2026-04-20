public class leetsheet10 {
    boolean strongPasswordChecker(String s){
     int len = s.length();
     if(len <6 || len >=20){
        return false;
     }
     boolean lowercase=false,uppercase=false,digit=false,special=false;
     char prev=' ';
     String specialCharacters = "!@#$%^&*()-+.";
     for(int i=0;i<len;i++){
        char ch=s.charAt(i);
        if(ch==prev){
            return false;
        }
        prev = ch;
        if(Character.isUpperCase(ch) && (!uppercase)){
               uppercase=true;
        }else if(Character.isLowerCase(ch) && (!lowercase)){
               lowercase=true;
        }else if(Character.isDigit(ch) && (!digit)){
               digit=true;
        }else if(specialCharacters.indexOf(ch) != -1){
               special=true;
        }
     }
     if(lowercase&&uppercase&&digit&&special){
        return true;
     }
     return false;
    }
    public static void main(String[] args) {
        String password="@Devendra45.";
        leetsheet10 obj=new leetsheet10();
        System.out.println(obj.strongPasswordChecker(password));
    }
}
