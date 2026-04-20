/*import java.util.Scanner;
class ProducerConsumer {
    private static int mutex = 1;
    private static int full = 0;
    private static int empty = 10;
    private static int x = 0;
    
    // Method for producing an item
    public static void producer() {
        --mutex;
        ++full;
        --empty;
        x++;
        System.out.println("\nProducer produces item " + x);
        ++mutex;
    }
    
    // Method for consuming an item
    public static void consumer() {
        --mutex;
        --full;
        ++empty;
        System.out.println("\nConsumer consumes item " + x);
        x--;
        ++mutex;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        System.out.println("1. Press 1 for Producer");
        System.out.println("2. Press 2 for Consumer");
        System.out.println("3. Press 3 for Exit");
        
        while (true) {
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    if (mutex == 1 && empty != 0) {
                        producer();
                    } else {
                        System.out.println("Buffer is full!");
                    }
                    break;
                
                case 2:
                    if (mutex == 1 && full != 0) {
                        consumer();
                    } else {
                        System.out.println("Buffer is empty!");
                    }
                    break;
                
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }
    }
}*/
import java.util.Scanner;
class ProducerConsumer
{
    static int mutex=1;
    static int empty=10;
    static int full=0;
    static int x=0;
    void producer()
    {
        empty--;
        mutex--;
        x++;
        System.out.println("Producer produces : "+x);
        mutex++;
        full++;
    }
    void consumer()
    {
        full--;
        mutex--;
        x--;
        System.out.println("Consumer consumes : "+x);
        mutex++;
        empty++;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char inp;
        System.out.println("1. Press 1 for Producer");
        System.out.println("2. Press 2 for Consumer");
        System.out.println("3. Press 3 for Exit");
        boolean condtn=true;
        ProducerConsumer pc=new ProducerConsumer();
        while(condtn)
        {
            System.out.println("Enter your choice : ");
            inp=sc.next().charAt(0);
            switch(inp)
            {
                case '1': 
                if(mutex==1&&empty!=0)
                {
                    pc.producer();
                }
                else
                {
                    System.out.println("OVERFLOW !");
                }
                break;
                case '2': 
                if(mutex==1&&full!=0)
                {
                    pc.consumer();
                }
                else
                {
                    System.out.println("UNDERFLOW !");
                }
                break;
                case 'q' : 
                condtn=false;
                break;
                default : 
                System.out.println("Enter valid choice 1,2 or q::>>");
                break;
            }
        }
    }
}
