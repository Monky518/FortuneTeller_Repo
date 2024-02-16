import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FortuneTellerViewer
{
    public static String[] fortunes = new String[12];
    public static int lastFortune, newFortune = 30;

    public static void main(String[] args)
    {
        JFrame inheritFrame = new FortuneTellerFrame();
        JPanel panelNorth = new JPanel();
        JPanel panelCenter = new JPanel();
        JPanel panelSouth = new JPanel();
        Font title = new Font("Title", Font.BOLD, 28);
        Font button = new Font("Button", Font.ITALIC, 20);
        Font fortuneDisplay = new Font("fortuneDisplay", Font.PLAIN, 24);

        // TOP PANEL
        // A JLabel with text “Fortune Teller” (or something similar!) and an ImageIcon
        // Find an appropriate non-commercial Fortune Teller image for your ImageIcon
            // The JLabel has a constructor that takes a String and the ImageIcon
            // Figure out from the Swing API or the content in Canvas how to display the text either above or below the ImageIcon
        // Select a font face that works with your image and set the size to a larger value (try 36 and 48)
        // Note that you have to add the image file to your IntelliJ project directory

        // Note: panel.add(object, BorderLayout.NORTH);
        panelNorth.add(new JLabel("Fortune Teller"));
        // panelNorth.add(new ImageIcon("f:/fortuneTellerImage.jpg"));
        // set text above or below image, set font, set image size (suggestion: 36/48)

        // MIDDLE PART
        // A JTextArea within a JScrollPane where the fortunes will be displayed one per line
        // Again, set the font values so that it works
            // Should be smaller than the large text of the Top panel

        panelCenter.add(new JScrollPane(new JTextArea("This is a test")));
        // set font smaller than top panel

        // BOTTOM PART
        // A button with the label “Read My Fortune!”
        panelSouth.add(new JButton("Read My Fortune!"));
        panelSouth.add(new JButton("Quit"));

        // finally, set JFrame as panel
        inheritFrame.add(panelNorth, BorderLayout.NORTH);
        inheritFrame.add(panelCenter, BorderLayout.CENTER);
        inheritFrame.add(panelSouth, BorderLayout.SOUTH);

        inheritFrame.show();
    }

    public static void NewFortune(ActionEvent e)
    {
        boolean done = false;

        do
        {
            newFortune = new Random().nextInt(12);
            if (newFortune != lastFortune)
            {
                System.out.println(fortunes[newFortune]);
                lastFortune = newFortune;
                done = true;
            }
        } while(!done);
    }

    public void SetFortunes()
    {
        fortunes[0] = "Test";
        fortunes[1] = "";
        fortunes[2] = "";
        fortunes[3] = "";
        fortunes[4] = "";
        fortunes[5] = "";
        fortunes[6] = "";
        fortunes[7] = "";
        fortunes[8] = "";
        fortunes[9] = "";
        fortunes[10] = "";
        fortunes[11] = "";
    }
}
