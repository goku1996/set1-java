import java.util.Scanner;
public class New {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%4==0 && a%100!=0)
        {
            System.out.println("a leap year");   
        }   else{
  System.out.println("not a leap year");
    }
    }
}
