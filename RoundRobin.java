import java.util.Scanner;
public class RoundRobin {
      public static void main(String[] args) {
        int n,q;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the time quantumn :");
         q=sc.nextInt();
        System.out.println("Enter the number of Processes :");
        n=sc.nextInt();
        int process[]=new int[n];
        int bt[]=new int[n];
        int rembt[]=new int[n];
        int wt[]=new int[n];
        int tt[]=new int[n];
         for(int i=0;i<n;i++)
         {
            System.out.println("Enter process id of "+(i+1)+" :");
            process[i]=sc.nextInt();
            System.out.println("Enter brust time of "+(i+1)+" :");
            bt[i]=sc.nextInt();
            rembt[i]=bt[i];
         }
         RoundRobin r=new RoundRobin();
         r.rr(n, q, process, bt, rembt, wt, tt);
         System.out.println("Process\tBrust\tRemaining\tWaiting\tTurnAround");
         for(int i=0;i<n;i++)
         {
            System.out.println(process[i]+"\t"+bt[i]+"\t"+rembt[i]+"\t"+wt[i]+"\t"+tt[i]);
         }
       
    }
    void rr(int n,int q,int process[],int bt[],int rembt[],int wt[],int tt[])
    {
       int i,t=0;
       boolean done;
       while(true)
       {
          
         
            done=true;
          for(i=0;i<n;i++)
          {
            if(rembt[i]>0)
            {
               done=false;
                if(rembt[i]>q)
               {
                t+=q;
                rembt[i]-=q;
                }
                else
                {
                 t+=rembt[i];
                 tt[i]=t;
                 wt[i]=tt[i]-bt[i];
                 rembt[i]=0;
                
                
                }
            }          
           }
         
          
          if(done)
          {
            break;
          }
       }
             
       }
        
    }

