import javax.swing.*;
import java.awt.*;

/**
 * Board Panel
 * @author DaleS
 *
 */
public class BoardPanel extends JPanel
{
	private final int DEFAULT_WIDTH = 700;				//	Default width of the panel
	private final int DEFAULT_HEIGHT = 500;				//	Default height of the panel
	
	private int width;									//	Width of panel
	private int height;									//	Height of panel
	
	private BoardStyle style;							//	Reference to BoardStyle object
	
	/**
	 *	Default constructor. Sets style to null and dimensions to their default values.
	 */
	public BoardPanel()
	{
		style = null;
		width = DEFAULT_WIDTH;
		height = DEFAULT_HEIGHT;
		setSize(width, height);
		setLayout(new SpringLayout());
	}
	
	/**
	 * Constructor that has a BoardStyle parameter. Initializes style to parameter and the dimensions to their default values
	 * 
	 * @param _style BoardStyle object that will be referenced by instance variable.
	 */
	public BoardPanel(BoardStyle _style)
	{
		style = _style;
		width = DEFAULT_WIDTH;
		height = DEFAULT_HEIGHT;
		setSize(width, height);
		setLayout(new SpringLayout());
	}
	
	/**
	 * Constructor that has a Boardstyle parameter and two integers for dimensions. Initializes style to parameter and the dimension to the two given ints.
	 * @param _style BoardStyle object that will be referenced by BoardPanel
	 * @param _width The width of this BoardPanel
	 * @param _height The height of this BoardPanel
	 */
	public BoardPanel(BoardStyle _style, int _width, int _height)
	{
		style = _style;
		width = _width;
		height = _height;
		setSize(width, height);
		setLayout(new SpringLayout());
	}
	
	/**
	 * Mutator for BoardStyle instance variable
	 * @param _style BoardStyle object that will be referenced by instance variable.
	 */
	public void setBoardStyle(BoardStyle _style)
	{	style = _style;	}
	
	/**
	 * Accessor for BoardStyle instance variable
	 * @return
	 */
	public BoardStyle getBoardStyle()
	{	return style;	}
	
	/**
	 * Draws the Board with the chosen BoardStyle
	 */
	public void paintComponent(Graphics _pen)
	{
		Graphics2D pen = (Graphics2D) _pen;
		style.draw(pen, width, height);
		// Draw PitComponents and create listeners for them
	}
}