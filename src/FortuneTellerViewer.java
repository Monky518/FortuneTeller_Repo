import javax.swing.*;
import java.awt.*;

public class FortuneTellerViewer
{
    public static void main(String[] args)
    {
        JFrame inheritFrame = new FortuneTellerFrame();
        JPanel panel = new JPanel();

        panel.setLayout(new BorderLayout());

        // change title
        inheritFrame.setTitle("Fortune Teller");

        // TOP PANEL
        // A JLabel with text “Fortune Teller” (or something similar!) and an ImageIcon
        // Find an appropriate non-commercial Fortune Teller image for your ImageIcon
            // The JLabel has a constructor that takes a String and the ImageIcon
            // Figure out from the Swing API or the content in Canvas how to display the text either above or below the ImageIcon
        // Select a font face that works with your image and set the size to a larger value (try 36 and 48)
        // Note that you have to add the image file to your IntelliJ project directory

        // panel.add(object, BorderLayout.NORTH);

        panel.add(new JLabel("Fortune Teller", new ImageIcon("f:/fortuneTellerImage.jpg"), SwingConstants.LEADING));

        // finally, set JFrame as panel
        inheritFrame.add(panel);
    }
}
