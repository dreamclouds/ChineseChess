package window;

import java.awt.*;

import java.util.*;
import java.util.Timer;

import javax.swing.*;  
import javax.swing.JFrame;


public class LoadingFrame extends JFrame{

	public LoadingFrame()
	{
		setUndecorated(true);
		this.setBackground(new Color(0, 0, 0, 0));
		setTitle("loading");
		setSize(1366 ,768);
    }
	 public void paint(Graphics g) {
	        super.paint(g);
    		System.out.print("run3");
	        Graphics2D g2 = (Graphics2D)g; //Ç¿×ª³É2D
    		System.out.print("run4");
	        g2.drawImage(new ImageIcon("image\\chinesechess.png").getImage(), 340, 84, 1366 ,768,null);
    		System.out.print("run5");
	        Timer timer = new Timer();  
	        timer.schedule(new MyTask(g2), 2000);
	    }
	 
    public static void main(String[] args)
    {
		System.out.print("run1");
    	LoadingFrame frame = new LoadingFrame();
		System.out.print("run2");
        frame.setTitle("loading");
        frame.setSize(1366 ,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.print("run55");
    }
    
	    static class MyTask extends java.util.TimerTask{      
	    	Graphics2D g;
	        MyTask(Graphics2D gg)
	        {
	        	g = gg;
	        }
	    	public void run(){    
	    		System.out.print("run");
	    		g.drawImage(new ImageIcon("image\\login_bgp.jpg").getImage(), 340, 84, 1366 ,768,null);
	    		System.out.print("run");
	        }     
	    }
}
