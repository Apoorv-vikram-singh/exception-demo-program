import java.util.Scanner;
public class excedm1 {
    void fuct1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the first number");
        int var1=sc.nextInt();
        System.out.println("enter the second number");
        int var2=sc.nextInt();
        try{
        int result=var1/var2;
        System.out.println("fist fuct is working  "+result);
        }
        catch(Exception e){
            System.out.println("eception name  "+e);
        }
    }
    void fuct2()
    {
        System.out.println("second fuction is working");
    }
    public static void main(String args[])
    {
        excedm1 obj=new excedm1();
        obj.fuct1();
        obj.fuct2();
    }
}
