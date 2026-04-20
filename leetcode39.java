import java.util.Stack;
public class leetcode39 {
    private Stack<Integer> main;
    private Stack<Integer> helper;
    leetcode39()
    {
        main=new Stack<>();
        helper=new Stack<>();
    }
    public void push(int n)
    {
        while (main.size()!=0) {
            int x=main.pop();
            helper.add(x);
        }
        main.add(n);
        while (helper.size()!=0) {
            int x=helper.pop();
            main.add(x);
        }
    }
    public int pop()
    {
        return main.pop();
    }
    public int peek()
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
        leetcode39 obj=new leetcode39();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);

        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());

        System.out.println(obj.isEmpty());

        System.out.println(obj.peek());

        System.out.println(obj.pop());
        System.out.println(obj.isEmpty());


    }
}
