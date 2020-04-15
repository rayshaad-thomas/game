package game;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends Canvas
{
    public Window (int width, int height, String title, Game game) 
    {
        JFrame frame = new JFrame(title); // creates the frame of the window
        
        frame.setPreferredSize(new Dimension(width, height)); // setting preferred size of the window
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allowing the user to close
        frame.setResizable(false); // not allowing the user to resize the window
        frame.setLocationRelativeTo(null); // makes our program start in the middle of the screen
        frame.add(game); // adds our game class into our frame
        frame.setVisible(true); //allows us to see the grame
        game.start(); // runs the start method
    }
}
