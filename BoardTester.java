
import java.util.Scanner;


/**
 *
 */
public class BoardTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        boolean valid = false;
        Board myBoard = null;
                
        do{
                System.out.println("Please enter the initial number of stones in each hole (3 or 4): ");
                input = sc.nextLine();
                input = input.trim();
                try{
                    valid = Integer.valueOf(input) == 3 || Double.valueOf(input) == 4;
                    if (!valid)
                    {
                        System.out.println("Sorry, you must enter either 3 or 4.");
                        continue;
                    }

                    myBoard = new Board(Integer.valueOf(input));
                }
                catch(NumberFormatException e)
                {
                    System.err.println(e);
                    System.err.println("Format Exception error");
                }
            }while(!valid);
        
        myBoard.updateBoard(4);  //testing
        System.out.println(myBoard.getCircularList());  //testing
        
    }
    
}
