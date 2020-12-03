/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rajan;

import javax.swing.JFrame;

public class Frame {
	
    public Frame() {
    	
    	JFrame frame = new JFrame();
    	Screen screen = new Screen();
    	
    	frame.add(screen);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setTitle("Snake");
    	frame.setResizable(false);
    	frame.pack();
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);  	
    	
    }
    public static void main(String[] args) {
        new Frame();
    }
}