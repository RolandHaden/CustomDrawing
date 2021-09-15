/*
Name: Davis Haden
Date: 9/15/2021
Description: Main class to construct a custom drawing.
*/

package com.company.davishaden;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    JFrame frame = new JFrame("Custom Drawing");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(new CustomPanel());
	    frame.pack();
	    frame.setVisible(true);
    }
}
