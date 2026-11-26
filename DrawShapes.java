
import java.awt.*;
import java.applet.*;

public class DrawShapes extends Applet {
    Font font;
    Color blackColor;
    Color whiteColor;
    Color grayColor;
    Color backgroundColor;

    public void init() {
        font = new Font("Arial", Font.ITALIC, 18);

        blackColor = Color.black;
        whiteColor = Color.white;
        grayColor = Color.gray;
        backgroundColor = Color.lightGray;

        setBackground(backgroundColor);
    }

    public void paint(Graphics graph) {
        graph.setFont(font);
        graph.setColor(blackColor);
        graph.drawString("Draw Shapes", 90, 20);

        graph.setColor(grayColor);
        graph.drawRect(120, 120, 120, 120);

        graph.setColor(whiteColor);
        graph.fillRect(115, 115, 90, 90);

        graph.setColor(blackColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);

        graph.setColor(grayColor);
        graph.drawRect(50, 50, 50, 50);

        graph.setColor(blackColor);
        graph.fillRect(50, 50, 60, 60);
    }
}
