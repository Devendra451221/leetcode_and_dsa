class Listnode {
    int dta;
    Listnode nxt;
    Listnode(int dta)
    {
        this.dta=dta;
    }
    Listnode(int dta, Listnode nxt)
    {
        this.dta=dta;
        this.nxt=nxt;
    }
    Listnode()
    {
        super();
    }
}

public class leetcode64 {

    
Listnode sumOfListsInReverse(Listnode l1,Listnode l2)
{
    if(l1==null)
    {
        return l2;
    }
    else if(l2==null)
    {
        return l1;
    }

    Listnode d=new Listnode(-1);
    Listnode ans=d;

    Listnode p1=l1;
    Listnode p2=l2;
    int sum=0;
    int carry=0;
    while (p1!=null || p2!=null) {
 
        int a=p1!=null?p1.dta:0;
        int b=p2!=null?p2.dta:0;

        carry=sum/10;
        sum=a+b+carry;
        int digit=sum%10;
 
        Listnode t=new Listnode(digit);
        d.nxt=t;
        d=d.nxt;

        p1=p1!=null?p1.nxt:null;
        p2=p2!=null?p2.nxt:null;

    }
    if(carry>0)
    {
        Listnode t=new Listnode(carry);
        d.nxt=t;
        d=d.nxt;
    }
    return ans.nxt;
}

    public static void main(String [] args)
    {
          Listnode l1=new Listnode(4);
    Listnode l11=new Listnode(3);
    Listnode l12=new Listnode(1);
    Listnode l13=new Listnode(9);

    Listnode l2=new Listnode(5);
    Listnode l21=new Listnode(7);
    Listnode l22=new Listnode(9);
    Listnode l23=new Listnode(2);

    l1.nxt=l11;
    l11.nxt=l12;
    l12.nxt=l13;
    l13.nxt=null;

     l2.nxt=l21;
    l21.nxt=l22;
    l22.nxt=l23;
    l23.nxt=null;

    leetcode64 obj=new leetcode64();
    Listnode ans=obj.sumOfListsInReverse(l1,l2);
    while (ans!=null) {
        System.out.print(ans.dta+" ");
        ans=ans.nxt;
    }
    }
}
