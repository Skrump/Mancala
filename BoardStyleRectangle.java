import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.*;

public class BoardStyleRectangle implements BoardStyle
{
    public void draw(Graphics2D g, int width, int height)
    {
        double diameter = (width * .73)/8;
        double edgeWidth = (width * .27)/9;
        double personalPitLength = height * .7;
        double rowOneHeight = height * .15;
        
        //Row 1 and personal pit 1
        RoundRectangle2D.Double personalPit1 = new RoundRectangle2D.Double(edgeWidth,
                rowOneHeight,diameter, personalPitLength, diameter/10, diameter/10);
        RoundRectangle2D.Double pit1 = new RoundRectangle2D.Double(2*edgeWidth + diameter,
                rowOneHeight, diameter, diameter, diameter/10, diameter/10);
        RoundRectangle2D.Double pit2 = new RoundRectangle2D.Double(3*edgeWidth + 2*diameter, rowOneHeight, diameter, diameter, diameter/10, diameter/10);
        RoundRectangle2D.Double pit3 = new RoundRectangle2D.Double(4*edgeWidth + 3*diameter, rowOneHeight, diameter, diameter, diameter/10, diameter/10);
        RoundRectangle2D.Double pit4 = new RoundRectangle2D.Double(5*edgeWidth + 4*diameter, rowOneHeight, diameter, diameter, diameter/10, diameter/10);
        RoundRectangle2D.Double pit5 = new RoundRectangle2D.Double(6*edgeWidth + 5*diameter, rowOneHeight, diameter, diameter, diameter/10, diameter/10);
        RoundRectangle2D.Double pit6 = new RoundRectangle2D.Double(7*edgeWidth + 6*diameter, rowOneHeight, diameter, diameter, diameter/10, diameter/10);
       
        double rowTwoHeight = height - rowOneHeight - diameter;
        
        //Row 2 and personal pit 2
        RoundRectangle2D.Double personalPit2 = new RoundRectangle2D.Double(8*edgeWidth + 7*diameter, rowOneHeight, diameter, personalPitLength, diameter/10, diameter/10);
        RoundRectangle2D.Double pit7 = new RoundRectangle2D.Double(2*edgeWidth + diameter, rowTwoHeight, diameter, diameter, diameter/10, diameter/10);
        RoundRectangle2D.Double pit8 = new RoundRectangle2D.Double(3*edgeWidth + 2*diameter, rowTwoHeight, diameter, diameter, diameter/10, diameter/10);
        RoundRectangle2D.Double pit9 = new RoundRectangle2D.Double(4*edgeWidth + 3*diameter, rowTwoHeight, diameter, diameter, diameter/10, diameter/10);
        RoundRectangle2D.Double pit10 = new RoundRectangle2D.Double(5*edgeWidth + 4*diameter, rowTwoHeight, diameter, diameter, diameter/10, diameter/10);
        RoundRectangle2D.Double pit11 = new RoundRectangle2D.Double(6*edgeWidth + 5*diameter, rowTwoHeight, diameter, diameter, diameter/10, diameter/10);
        RoundRectangle2D.Double pit12 = new RoundRectangle2D.Double(7*edgeWidth + 6*diameter, rowTwoHeight, diameter, diameter, diameter/10, diameter/10);

        g.setColor(Color.LIGHT_GRAY);
        g.draw(personalPit1);
        g.draw(pit1);
        g.draw(pit2);
        g.draw(pit3);
        g.draw(pit4);
        g.draw(pit5);
        g.draw(pit6);
        g.draw(personalPit2);
        g.draw(pit7);
        g.draw(pit8);
        g.draw(pit9);
        g.draw(pit10);
        g.draw(pit11);
        g.draw(pit12);
        
        Color c = new Color(153, 79, 0);
        g.setColor(c);
        g.fill(personalPit1);
        g.fill(pit1);
        g.fill(pit2);
        g.fill(pit3);
        g.fill(pit4);
        g.fill(pit5);
        g.fill(pit6);
        g.fill(personalPit2);
        g.fill(pit7);
        g.fill(pit8);
        g.fill(pit9);
        g.fill(pit10);
        g.fill(pit11);
        g.fill(pit12);
    }
}