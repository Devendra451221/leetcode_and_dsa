import java.net.Socket;

public final class Employee
{
    private final String pancard;
    Employee(String pancard)
    {
        this.pancard=pancard;
    }
    public String getPancard()
    {
        return this.pancard;
    }
    public static void main(String[] args) {
       Employee e= new Employee("HNLPP1234");
        System.out.println(e.getPancard());
    }
}