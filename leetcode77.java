 class Treenode
{
    int dta;
    Treenode l;
    Treenode r;
    
    public Treenode() {
    }
    public Treenode(int dta){
        this.dta=dta;
    }
    public Treenode(int dta, Treenode l, Treenode r) {
        this.dta = dta;
        this.l = l;
        this.r = r;
    }
    
}
public class leetcode77 {

   
  boolean check(Treenode t,int dta){

    if(t==null){
        return true;
    }
    else if(t.dta!=dta){
        return false;
    }

    boolean left = check(t.l, dta);
    boolean right= check(t.r, dta);

    return left && right;
  }

  boolean isUniValued(Treenode t){
    return check(t, t.dta);
  }

    public static void main(String[] args) {
        Treenode t1=new Treenode(1);
        Treenode t2=new Treenode(1);
        Treenode t3=new Treenode(1);
        Treenode t4=new Treenode(1);
        Treenode t5=new Treenode(5);
        Treenode t6=new Treenode(1);

        t1.l=t2;   
        t1.r=t3;
        
        t2.l=t4;
        t2.r=t5;
 
        t3.r=t6;

        leetcode77 obj=new leetcode77();
        System.out.println("IS UNI VALUED : "+obj.isUniValued(t1));

    }
    
}
