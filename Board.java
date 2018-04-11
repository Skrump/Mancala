
import java.util.ArrayList;

/**
 *
 */
public class Board {
    private final int MAXUNDOS = 3; //maximum number of undos that a player can do
    private boolean playerTurn; //false = player 1's turn, true = player 2's turn
    private int undoCounter;    //simple counter that resets after each player ends their turn
    private ArrayList<Integer> holes = null;    //ArrList used to represent the holes in the board including each player's Mancala
    
    public Board()
    {
        playerTurn = false;
        undoCounter = 0;
        holes = new ArrayList<Integer>();   //in order to make this circular, need to extend arraylist or create our own circular array
        //add each element here
        
    }
    
    /**
     * Takes the number of stones in the given hole and distributes them to every
     * hole after it. Ignores the opposing player's Mancala
     * @param numStones the number of stones in the given hole
     */
    public void updateBoard(int numStones)  //might need to add the initial hole as a param
    {
        //logic: place stone in each hole starting from the hole after the chosen hole
        //make sure to ignore the opposing player's Mancala
    }
    
    /**
     * Changes to the next player turn
     */
    public void changePlayerTurn()
    {
        playerTurn = !playerTurn;
    }
    
    /**
     * When player attempts to undo, this method will check whether it is allowed
     * @return true if undo is allowed
     */
    public boolean undo()
    {
        if (undoCounter < 3)
            return true;
        else
            return false;
    }
    
    /**
     * 
     * @return 
     */
    public boolean getPlayerTurn(){return playerTurn;}
    
    /**
     * 
     * @return 
     */
    public int getUndoCounter(){return undoCounter;}
    
}
