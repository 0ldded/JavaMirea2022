import java.util.Scanner;

public class Program
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] MyArray = new int[5];
        for(int i = 0; i < MyArray.length; i++)
        {
            MyArray[i] = sc.nextInt();
        }


        int num_for = 0;

        //==FOR==
        for (int i = 0; i < MyArray.length; i++)
        {
            num_for += MyArray[i];
        }
        System.out.println("Подсчет в for: " + num_for);

        //==while==
        int num_while = 0;
        int i = 0;
        while(i < MyArray.length)
        {
            num_while += MyArray[i];
            i++;
        }
        System.out.println("Подсчет в while: "+num_while);

        //==do while==
        int num_do_while = 0;
        i = 0;
        do
        {
            num_do_while += MyArray[i];
            i++;
        }while (i + 1<= MyArray.length);
        System.out.println("Подсчет в do while: "+num_do_while);
    }
}