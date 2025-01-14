import java.util.*;
class Multiple extends Thread 
{
    public void run()
    {
        for(int i=1;i<=10;i++)
            System.out.println(i+" * 5 = "+(i*5));
    }
}
class Prime extends Thread 
{
    int n;
    Prime(int limit)
    {
        n=limit;
    }
    int isprime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    public void run()
    {
        for(int i=2;i<=n;i++)
        {
            if(isprime(i)==1)
                System.out.println("Prime: "+i);
        }
    }
}
public class Multiple_thread
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Multiple m=new Multiple();
        System.out.print("Enter limit for generating prime: ");
        int n=sc.nextInt();
        Prime p=new Prime(n);
        m.start();
        p.start();
    }
}