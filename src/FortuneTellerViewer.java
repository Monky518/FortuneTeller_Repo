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
        Font titleF = new Font("Serif", Font.BOLD, 30);
        Font displayF = new Font("Serif", Font.PLAIN, 18);
        Font buttonF = new Font("Serif", Font.ITALIC, 20);
        new FortuneTellerViewer().SetFortunes();

        // TOP PANEL
        JLabel z = new JLabel("Fortune Teller", new ImageIcon("/fortuneTellerImage.jpg"), SwingConstants.LEADING);
        z.setFont(titleF);
        panelNorth.add(z);

        // MIDDLE PART
        JTextArea textArea = new JTextArea(10, 40);
        textArea.setFont(displayF);
        panelCenter.add(new JScrollPane(textArea));

        // BOTTOM PART
        JButton x = new JButton("Read My Fortune!");
        x.addActionListener
        (new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    boolean done = false;
                    do
                    {
                        newFortune = new Random().nextInt(12);
                        if (newFortune != lastFortune)
                        {
                            textArea.append(fortunes[newFortune] + "\n");
                            lastFortune = newFortune;
                            done = true;
                        }
                    } while(!done);
                }
            }
        );
        x.setFont(buttonF);
        panelSouth.add(x);

        JButton y = new JButton("Quit");
        y.addActionListener((ActionEvent ae) -> System.exit(0));
        y.setFont(buttonF);
        panelSouth.add(y);

        // finally, set JFrame as panel
        inheritFrame.add(panelNorth, BorderLayout.NORTH);
        inheritFrame.add(panelCenter, BorderLayout.CENTER);
        inheritFrame.add(panelSouth, BorderLayout.SOUTH);

        inheritFrame.show();
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
