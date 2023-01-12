//This is the main frame where you select the type of problems you want to try.

import javax.swing.*;
import java.awt.*;

public class MainScreenGUI extends JFrame
{
    CalculationsEvt eventAction = new CalculationsEvt(this);//updated term for event trigger - HD remove

    JPanel mainChoicesScreen = new JPanel();//The actual Selection Panel - to select which type, add or subtract
    ButtonGroup problemType = new ButtonGroup();//The selection button to select add or subtract
    JCheckBox add = new JCheckBox("Addition", true);//The add button, not selected by default
    JCheckBox subtract = new JCheckBox("Subtraction", false);//The subtract button, not selected by default
    JButton start = new JButton("Start");//The start button
   
    public MainScreenGUI()
    
    {
    	super("Math Quiz!");//The Title of the frame window

        setSize(400, 150);//The size of the frame window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Can close out the window
        setLocationRelativeTo(null);//Sets the main frame to show up in the center of the screen.
        setResizable(false);//Cannot resize the window

        add.addItemListener(eventAction);//When clicked and select start, triggers event
        subtract.addItemListener(eventAction);//When clicked and select start, triggers event
 
        start.addActionListener(eventAction);//when you click on start - opens up Quiz question window, based on which - add or subtract.

        problemType.add(add);//Add the check box on the frame window
        problemType.add(subtract);//Add the check box on the frame window
        problemType.add(start);//Add the check box on the frame window
 
        mainChoicesScreen.setLayout(new FlowLayout(FlowLayout.CENTER));//Center the 2 buttons - Add and Subtract
        mainChoicesScreen.setBackground(getForeground().yellow);//Make background color yellow
        mainChoicesScreen.add(add);//Add JCheckbox on the Frame window
        mainChoicesScreen.add(subtract);//Sub JCheckbox on the Frame window
        mainChoicesScreen.add(start);//Add Start JButton on the Frame window
 
        add(mainChoicesScreen, BorderLayout.CENTER);//Center the add, subtract, and start in the frame window
        setVisible(true);//Make sure frame window is visible
    }

    public static void main(String[] arguments)//Main entry into the application - runs this when the application starts
    {
       MainScreenGUI startScreen = new MainScreenGUI();//Calls for the main selection event
    }
}

