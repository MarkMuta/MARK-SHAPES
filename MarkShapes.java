
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
public class MarkShapes extends JFrame{
static int option;
public MarkShapes()
{
	setTitle("Drawing of shapes");
	setSize(800,700);
	setBackground(Color.yellow);
	setLocationRelativeTo(null);
	setResizable(false);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void paint(Graphics g) {
	option = Integer.parseInt(JOptionPane.showInputDialog(null,"MAIN MENU\nPlease choose the shape of your choice\n 1. RECTANGLE \n 2. CIRCLE \n 3. TRIANGLE \n 4. EXIT"));
	if(!(option > 5) && !(option < 0)) {
		switch(option) {
		case 1:
		// draw a rectangle
		int width = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter  width's integral value of the rectangle\n from 9-70"));
		int height = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the height's integral value of the rectangle\n from 9-60"));
		if(!(width < 8) && !(height < 8)) {
			if(width <= 70 && height <=60) {
				if (width != height) {
					g.setColor(Color.YELLOW);
					g.fillRect((800-(width*10))/2, (700-(height*10))/2, width*10, height*10);
				}
				//displayed when dimension input are equal
				else {
					JOptionPane.showMessageDialog(null, "Width and height of a rectangle are never equal");
					System.exit(0);
				}
				}
			//displayed when value are greater than the ones specified( width<=70 && height <=60)
			else {
				JOptionPane.showInternalMessageDialog(null, "Enter the values in the range given");
			 System.exit(0);
			}	
		}
		//displayed when input is less than the one specified(<8)
		else {
			JOptionPane.showMessageDialog(null, "Please enter the values in the range given");
			System.exit(0);
		}
		//if the input the requirements the program proceeds to draw
		break;
		case 2:
			//draw a circle
		int radius = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the integral value of radius of the circle\n from 5 - 80"));
		if(radius <=80 && !(radius<	5)) {
			g.setColor(Color.BLACK);
			g.fillOval((400 -(radius*10)/2),(350-(radius*10)/2),radius*10,radius*10);
		}
		else {
			JOptionPane.showMessageDialog(null, "Enter the radius in the range given");
			System.exit(0);
		}
		break;
		case 3:
			//draw a triangle
			int widths = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the width's integral value of the triangle FROM 10-100"));
			int heights = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the height's integral value  of the triangle FROM 20-100"));
			if(!(widths<9)&& !( heights<20)) {
				if(widths <=100 && heights <=100) {
					g.setColor(Color.YELLOW);
					g.fillPolygon(new int [] {400,400-widths,widths+400}, new int [] {100,heights*6,heights*6},3);
					}
				//displayed when values are greater than the ones specified(width<=70 && height <=60)
				else {
					JOptionPane.showMessageDialog(null,"width and height should not be equal");
					System.exit(0);
				}
			}
			else {
				JOptionPane.showMessageDialog(null,"Enter the values in the range given");
				System.exit(0);
			}
			break;
			//exit the program
		case 4:
			JOptionPane.showMessageDialog(null,"Thanks");
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null,"You did not choose an option\n   The program will exit");
				System.exit(0);
				break;
		}
	}
	else {
		JOptionPane.showMessageDialog(null, " Enter the correct option");
		System.exit(0);
	}
}
public static void main(String [] args) {
	new MarkShapes();
}
}
