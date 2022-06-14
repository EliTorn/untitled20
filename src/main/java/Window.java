import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Window extends JFrame {
    public static void main(String[] args) {
        new Window();
    }


    public Window() {
        this.setLayout(null);
        this.setBounds(0, 0, 500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int num = Chose();
        Point p = IsNumber(num);
        Player player = new Player();
        String s = player.newPlayer();
        GameLabel label = new GameLabel(s, p.getX(), p.getY());
        this.add(label);
        GamePanel gamePanel = new GamePanel();
        gamePanel.setBounds(0, 0, 500, 500);
        this.add(gamePanel);
        this.setVisible(true);
    }

    public int Chose() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0 && a < 10) {
            return a;
        }
        return -1;
    }

    public Point IsNumber(int x) {
        Point point = new Point();
        if (x == 1) {
            return new Point(40, 50);
        }
        if (x == 2) {
            return new Point(80, 50);
        }
        if (x == 3) {
            return new Point(150, 50);
        }
        if (x == 4) {
            return new Point(40, 200);
        }
        if (x == 5) {
            return new Point(80, 200);
        }
        if (x == 6) {
            return new Point(150, 200);
        }
        if (x == 7) {
            return new Point(100, 300);
        }
        if (x == 8) {
            return new Point(200, 280);
        }
        if (x == 9) {
            return new Point(300, 300);
        } else
            return null;
    }
    public ArrayList victoryX (int x){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(x);
        return arrayList;


    }
    public  ArrayList victoryY(int x){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(x);
        return arrayList;
    }
}
