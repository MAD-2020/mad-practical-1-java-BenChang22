import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
  Scanner in = new Scanner(System.in);
  System.out.print("Enter number of values to calculate : ");
  int num = in.nextInt();
  int numlist[] = new int[num];
  for (int i = 0; i < num; i++){
     System.out.print("Enter values : ");
    numlist[i] = in.nextInt();
  }
  in.close();

   int mode = 0; 
    int total = 1 ; 

    for(int i = 0; i < numlist.length; i++)
    {
      int count = 0; 
      for(int j = 0; j < numlist.length; j++)
      {
        if(numlist[j] == numlist[i])
        {
          count += 1;
        }
      }
      if(count > total)
      {
        mode = numlist[i]; 
      }
    }
    System.out.println(mode);
    
  }
}
