import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
     Scanner in = new Scanner(System.in);
    int num;
    System.out.println("Input an integer for the base of the triangle");
    num = in.nextInt();
       for (int i = num; i > 0; i--){
      System.out.println(" ");
       for(int k = i;k > 0; k--){
       System.out.print("*");
        }
        System.out.println(" ");
       }
       in.close();
    }
    
  }

