import java.beans.PropertyEditorManager;
import java.util.Scanner;
public class BasicPrograms {
    static int fact = 1, res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    /*Greatest of three numbers:

        System.out.print("Enter First Number: ");
        int a= sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b= sc.nextInt();
        System.out.print("Enter Third Number: ");
        int c= sc.nextInt();

        if(a>b)
        {
            if (a > c)
            {
                System.out.println("The Greatest Number is: " + a);
            } else {
                System.out.println("The Greatest Number is: " + c);
            }
        }
        else if(b>c)
        {
            System.out.println("The Greatest Number is: " +b);
        }
        else
        {
            System.out.println("The Greatest Number is: " +c);
        }
    */

    /*Even or Odd Number
    */
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
        {
            System.out.print("Even Number");
        }
        else
        {
            System.out.print("Odd Number");
        }
    //*/

    /*Leap Year
        System.out.print("Enter any Year: ");
        int n = sc.nextInt();
        if((n%400==0)||(n%4==0 && n%100!=0))
        {
            System.out.print("Leap Year");
        }
        else
        {
            System.out.print("Not a Leap Year");
        }
    */

    /*Swapping without using third variable:
        //int temp;
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;

        //Using third variable:
        //temp=a;
        //a=b;
        //b=temp;

        System.out.println("First Number: "+a);
        System.out.print("Second Number: "+b);
    */

    /*Calculator using switch:

        String con;

        do {
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();
            System.out.print("Enter Operation: ");
            char opt = sc.next().charAt(0);
            switch (opt) {
                case '+':
                    System.out.println("Addition: " + (a + b));
                    break;
                case '-':
                    System.out.println("Subtraction: +" + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication: " + (a * b));
                    break;
                case '/':
                    System.out.println("Division: " + (a / b));
                    break;
                default:
                    System.out.println("Enter a valid Operator ");
            }
            System.out.println("Do you want to Continue? ");
            con = sc.next();
        }while((con.equals("y")||con.equals("Y")));
    */

    /*Table of any Number:

        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        for(int i=1;i<11;i++)
        {
            System.out.println((num +"*" +i +"="+num*i));
        }
    */

    /*Factorial Program

        int fact=1;
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for(int i=num;i>1;i--)
        {
            fact = fact*i;
        }
        System.out.println("Factorial: "+fact);
    */

    /*Factorial using Recursion:

        int fact = 1;
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        BasicPrograms f = new BasicPrograms();
        f.factorial(num);
        System.out.print("Factorial: "+f.factorial(num));

    }
    int factorial(int no)
    {
        if(no>=1)
        {
            return no*factorial(no-1);
        }
        return 1;
    */

    /*Reverse a Number:

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int rev=0,rem;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.print("Reverse of the Number is: "+rev);
    */

    /*String Reversal:

        System.out.print("Enter any String: ");
        String st = sc.next();
        String rev="";
        for(int i=(st.length()-1);i>=0;i--)
        {
            rev=rev+st.charAt(i);
        }
        System.out.print("Reversed String is: "+rev);
    */

    /*Prime Number or Not:

        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        int temp=0;
        for(int i=2;i<=(num/2);i++)
        {
            if(num%i==0)
            {
                temp++;
            }

        }
        if(temp>0)
        {
            System.out.print("Not a Prime Number");
        }
        else
        {
            System.out.print("Prime Number");
        }
    */

    /*Prime Number between 1-100:

        System.out.print("Prime Numbers between 1 to 100: ");
        int temp=0;
        for(int i=1;i<100;i++)
        {
            for(int j=2;j<=(i/2);j++)
            {
                if(i%j==0)
                {
                    temp++;
                }

            }
            if(temp==0)
            {
                System.out.print(i+" ");
            }
            else
            {
                temp=0;
            }
        }
    */

    /*Fibonacci Series:

        System.out.print("Enter the length of series: ");
        int len = sc.nextInt();
        int a = 0,b=1,c;
        System.out.print("Fibonacci Series: 0 1 ");
        for(int i=1;i<len;i++)
        {
            c = a+b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    */

        /*Fibonacci using Recursion:

        System.out.print("Enter the length: ");
        int len = sc.nextInt();
        int m=0;
        BasicPrograms bc = new BasicPrograms();
        for(int i=0;i<len;i++)
        {
            System.out.print(" "+bc.fib(m));
            m++;
        }

    }
    int fib(int n)
    {
        if((n==0)||(n==1))
        {
            return n;
        }
        else
        return (fib(n-1)+fib(n-2));
    */

    /*Palindrome Number:

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int n=num,rev=0,rem=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==n)
            System.out.print("The Number is Palindrome");

        else
            System.out.print("The Number is not Palindrome");
    */

    /*Armstrong Number:

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int n=num,rem=0,arm=0;
        while(num!=0)
        {
           rem=num%10;
           arm=arm+(rem*rem*rem);
           num=num/10;
        }
        if(arm==n)
            System.out.print("Armstrong number");
        else
            System.out.print("Not an Armstrong Number");

    */
    }
}