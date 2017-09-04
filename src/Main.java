import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        new Main().getGoing();
    }

    private void getGoing()
    {
        ImageIcon imageIcon = new ImageIcon("src/spoon.png");
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        label.setIcon(imageIcon);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
    }
}
 /**********************************************************************************************************
  * Cannot apply image directly onto JFrame without using paint(Graphics g)
  **********************************************************************************************************/