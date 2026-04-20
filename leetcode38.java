import java.util.LinkedList;
import java.util.Queue;

public class leetcode38 {
    private Queue<Integer> main;
    private Queue<Integer> helper;
    leetcode38()
    {
        main=new LinkedList<>();
        helper=new LinkedList<>();
    }
    public void push(int n)
    {
        //move all elements from main to helper
        while (main.size()!=0) {
            int x=main.remove();
            helper.add(x);
        }
        //add new element in main
        main.add(n);
        //mive all elements from helper to main
        while(helper.size()!=0)
        {
            int x=helper.remove();
            main.add(x);
        }
    }
    public int pop()
    {
        return main.remove();
    }
    public int top()
    {
        return main.peek();
    }
    public boolean isEmpty()
    {
        if(main.size()==0)
        return true;
        else 
        return false;
    }
    public static void main(String[] args) {
        leetcode38 obj=new leetcode38();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);

        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.isEmpty()
        );
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.isEmpty());


    }
}
