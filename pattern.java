
public class pattern
{
    public static void main(String[] args) {
        int i, j, k;
        /*
        *
        **
        ***
        ****

        for(i=1;i<5;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");

            }
        System.out.println("");
        }
        */

        /*
         ****
         ***
         **
         *

         */
        /*
        for(i=4;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }

         */

    /*

    *
    **
    ***
    ****
    ***
    **
    *


        for(i=1;i<5;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print("*");
        System.out.println("");
        }
        for(i=3;i>0;i--)
        {
            for(j=0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }
    */

    /*
       *
      **
     ***
    ****

         for (i = 1; i < 5; i++)
        {
            for (j = 3; j >= i; j--)
                System.out.print(" ");
            for (k = 1;k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
    */

    /*
    ****
     ***
      **
       *

        for(i=1;i<5;i++)
        {
            for(j=1;j<i;j++)
                System.out.print(" ");
            for(k=4;k>=i;k--)
                System.out.print("*");
            System.out.println();
        }
    */

    /*
       *
      **
     ***
    ****
     ***
      **
       *


        for(i=1;i<5;i++)
        {
            for(j=3;j>=i;j--)
                System.out.print(" ");
            for(k=1;k<=i;k++)
                System.out.print("*");
            System.out.println();
        }
        for(i=1;i<4;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(" ");
            for(k=3;k>=i;k--)
                System.out.print("*");
            System.out.println();
        }
    */

    /*
       *
      * *
     * * *
    * * * *

        for(i=1;i<5;i++)
        {
            for(j=3;j>=i;j--)
                System.out.print(" ");
            for(k=1;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }

        for(i=1;i<5;i++)
        {
            for(j=4;j>0;j--)
            {
                if(j>i)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
        System.out.println();
        }
    */

    /*
       *
      ***
     *****
    *******


        for(i=1;i<5;i++)
        {
            for(j=4;j>=i;j--)
                System.out.print(" ");
            for(k=1;k<(i*2);k++)
                System.out.print("*");
            System.out.println();
        }


        for (i = 4; i > 0; i--)
        {
            for(j=1;j<i;j++)
                System.out.print(" ");
            for(k=i+j;k<8;k++)
                System.out.print("*");
            System.out.println("*");
        }
    */

    /*
    *******
     *****
      ***
       *


        for(i=4;i>0;i--)
        {
            for(j=4;j>i;j--)
                System.out.print(" ");
            for(k=1;k<(i*2);k++)
                System.out.print("*");
            System.out.println();
        }
    */

     /*
     *
      *
       *
        *

        for(i=1;i<5;i++)
        {
            for(j=1;j<i;j++)
                System.out.print(" ");
            System.out.println("*");
        }
    */

    /*
       *
      *
     *
    *

        for(i=4;i>0;i--)
        {
            for(j=1;j<i;j++)
                System.out.print(" ");
            System.out.println("*");
        }
    */

    /*
       *
      * *
     *   *
    *     *


        for (i = 1; i < 5; i++)
        {
            for(j=4;j>i;j--)
                System.out.print(" ");
            for(k=1;k<(i*2);k++)
            {
                if((k>1) && (k<((i*2)-1)))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }

    */

    /*
    *     *
     *   *
      * *
       *

        for(i=4;i>0;i--)
        {
            for(j=4;j>i;j--)
                System.out.print(" ");
            for(k=1;k<(i*2);k++)
                {
                    if((k>1) && k<((i*2)-1))
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            System.out.println();
        }
    */

    /*
    *     *
     *   *
      * *
       *
      * *
     *   *
    *     *


        for(i=4;i>0;i--)
        {
            for(j=4;j>i;j--)
                System.out.print(" ");
            for(k=1;k<(i*2);k++)
            {
                if((k>1) && k<((i*2)-1))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        for(i=2;i<5;i++)
        {
            for(j=4;j>i;j--)
                System.out.print(" ");
            for(k=1;k<(2*i);k++)
            {
                if((k>1) && (k<((2*i)-1)))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }


        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if((i==j) || (i+j==4))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    */

    /*
    *****
    *   *
    *   *
    *   *
    *****


        for (i = 0; i < 5; i++)
        {
            for(j=0;j<5;j++)
            {
                if((i==0) || (j==0) || (i==4) || (j==4))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    */

    /*
    1
    12
    123
    1234
    12345

        for(i=1;i<6;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }

    */

    /*
    1
    23
    456
    78910

        int count=0;
        for(i=1;i<5;i++)
        {
            for(j=1;j<=i;j++)
            {
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    */

    /*
    1
    21
    321
    4321
    54321


        for(i=1;i<6;i++)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    */

    /*
    1
    2 6
    3 7 10
    4 8 11 13
    5 9 12 14 15
    */

        for(i=1;i<6;i++)
        {
            int no=i;
            for(j=1;j<=i;j++)
            {
                System.out.print(no+" ");
                no=no+5-j;
            }
            System.out.println();
        }



    }


}