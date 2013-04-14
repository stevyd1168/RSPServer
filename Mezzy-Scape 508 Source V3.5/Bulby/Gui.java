/*
 * Class Gui
 *
 * Version 1.0
 *
 * Wednesday September 23, 2009
 *
 * Created by Hunter
 */

package Bulby;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Gui extends JFrame {

	private JButton button1;
	private JLabel text1;
        private JButton button2;
        private JLabel text2;
	private JButton button3;
	private JLabel text3;
        private JButton button4;
        private JLabel text4;

	public Gui() {
		super("Mezzy-Scape 508 JPanel"); // The title bar
		setLayout(new FlowLayout()); // This is the layout of the Gui

		button1 = new JButton("Closed"); //button on the gui
		button1.setToolTipText("This is what shows up when you hover over it."); //Hover text

		text1 = new JLabel("Under Construction"); //Text on the gui
		text1.setToolTipText("This is what shows up when you hover over it."); //Hover text

		button2 = new JButton("Closed"); //button on the gui
		button2.setToolTipText("This is what shows up when you hover over it."); //Hover text

		text2 = new JLabel("Under Construction"); //Text on the gui
		text2.setToolTipText("This is what shows up when you hover over it."); //Hover text

		button3 = new JButton("Closed"); //button on the gui
		button3.setToolTipText("This is what shows up when you hover over it."); //Hover text

		text3 = new JLabel("Under Construction"); //Text on the gui
		text3.setToolTipText("This is what shows up when you hover over it."); //Hover text

		button4 = new JButton("Closed"); //button on the gui
		button4.setToolTipText("This is what shows up when you hover over it."); //Hover text

		text4 = new JLabel("Under Construction"); //Text on the gui
		text4.setToolTipText("This is what shows up when you hover over it."); //Hover text

		add(button1); //Adds it to the gui
		add(text1);   //Adds it to the gui
                add(button2);
                add(text2);
                add(button3);
                add(text3);
                add(button4);
                add(text4);
		}
	}