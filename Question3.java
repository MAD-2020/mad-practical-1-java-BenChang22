import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
   public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
  int num;
  System.out.print("Enter value : ");
  num = in.nextInt();
  int value = num * num;
  System.out.println("calculated value is " + value);
    
    
  }
}
