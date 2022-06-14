import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel () {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(500/2,0,500/2,500);
        g.drawLine(500/4,0,500/4,500);
        g.drawLine(0,150,500,150);
        g.drawLine(0,300,500,300);
    }


}
