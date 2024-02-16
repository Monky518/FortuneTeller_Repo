import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FortuneTellerViewer
{
    public static String[] fortunes = new String[12];
    public static int lastFortune, newFortune = 30;
    public static JTextArea textArea = new JTextArea();

    public static void main(String[] args)
    {
        JFrame inheritFrame = new FortuneTellerFrame();
        JPanel panelNorth = new JPanel();
        JPanel panelCenter = new JPanel();
        JPanel panelSouth = new JPanel();
        Font title = new Font("Title", Font.BOLD, 28);
        Font button = new Font("Button", Font.ITALIC, 20);
        Font fortuneDisplay = new Font("fortuneDisplay", Font.PLAIN, 20);
        new FortuneTellerViewer().SetFortunes();

        // TOP PANEL
        panelNorth.add(new JLabel("Fortune Teller", new ImageIcon("f:/fortuneTellerImage.jpg"), SwingConstants.LEADING));
        // set title font

        // MIDDLE PART
        panelCenter.add(new JScrollPane(textArea));
        // set display font
            // later, fortunes are added here and the user can scroll down to view all of them

        // BOTTOM PART
        // Make sure that you use the Java 8 Lambda Expressions for the actionlistener code for the buttons
        panelSouth.add(new JButton("Read My Fortune!").addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NewFortune();
            }
        } ));
        panelSouth.add(new JButton("Quit").addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Quit();
            }
        } ));


        // BORDER LAYOUT NOTES
        // Use a reasonable visually pleasing arrangement of your components using BorderLayout
        // Following the example that I have posted in Canvas
            // Get an instance of the Toolkit
            // Set your main JFrame to be ¾ of the width of the display
            // Centered on the screen
                // The example is in the Canvas Course Documents folder that contains the Java GUI materials


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
                // textArea(fortunes[newFortune]);
                lastFortune = newFortune;
                done = true;
            }
        } while(!done);
    }

    public static void Quit(ActionEvent e)
    {
        JFrame.dispose();
    }

    public void SetFortunes()
    {
        fortunes[0] = "Do not be afraid of competition";
        fortunes[1] = "An exciting opportunity lies ahead of you";
        fortunes[2] = "Confidence will lead you on";
        fortunes[3] = "You will always be surrounded my true friends";
        fortunes[4] = "You are wise beyond your years";
        fortunes[5] = "Your ability to juggle many tasks will take you far";
        fortunes[6] = "A routine task will turn into an enchanting adventure";
        fortunes[7] = "Be true to your work, your word, and your friend";
        fortunes[8] = "Goodness is the only investment that never fails";
        fortunes[9] = "A journey of a thousand miles begins with a single step";
        fortunes[10] = "Humans cannot be comfortable without their own approval";
        fortunes[11] = "It is easier to stay out than to get out";
    }
}
