/*
Name: Davis Haden
Date: 9/15/2021
Description: Graphics class to construct a custom drawing.
*/

package com.company.davishaden;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    private final int MID = 150;
    private final int TOP = 50;
    private final int[] xpoints = {135,150,165};
    private final int[] ypoints = {90,70,90};
    public CustomPanel() {
        setPreferredSize(new Dimension(300,300));
        setBackground(Color.black);
    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        page.setColor(Color.yellow);
        page.fillOval(100,100, 100,100);
        page.fillPolygon(xValues(MID,20,0),yValues(80,20, 0), 3);
        page.fillPolygon(xValues(220,20,90),yValues(150,20, 90), 3);
        page.fillPolygon(xValues(MID,20,180),yValues(220,20, 180), 3);
        page.fillPolygon(xValues(80,20,270),yValues(150,20, 270), 3);
        page.drawString("The Sun", 125, 260);
    }
    //Note: Rotate angle can only be in variations of 90 degrees
    public static int[] xValues(int centerPoint, int scale, int rotateAngle) {
        if (rotateAngle == 0) {
            int[] values = {centerPoint - (int) (0.5 * scale), centerPoint, centerPoint + (int) (0.5 * scale)};
            return values;
        } else if (rotateAngle == 90) {
            int[] values = {centerPoint - (int) (0.5 * scale), centerPoint + (int) (0.5 * scale), centerPoint - (int) (0.5 * scale)};
            return values;
        } else if (rotateAngle == 180) {
            int[] values = {centerPoint - (int) (0.5 * scale), centerPoint, centerPoint + (int) (0.5 * scale)};
            return values;
        }else if (rotateAngle == 270) {
            int[] values = {centerPoint + (int) (0.5 * scale), centerPoint - (int) (0.5 * scale), centerPoint + (int) (0.5 * scale)};
            return values;
        }else{
            return null;
        }
    }
    public int[] yValues(int centerPoint, int scale, int rotateAngle) {
        if (rotateAngle == 0) {
            int[] values = {centerPoint + (int) (0.5 * scale), centerPoint - (int) (0.5 * scale), centerPoint + (int) (0.5 * scale)};
            return values;
        } else if (rotateAngle == 90) {
            int[] values = {centerPoint - (int) (0.5 * scale), centerPoint, centerPoint + (int) (0.5 * scale)};
            return values;
        } else if (rotateAngle == 180) {
            int[] values = {centerPoint - (int) (0.5 * scale), centerPoint + (int) (0.5 * scale), centerPoint - (int) (0.5 * scale)};
            return values;
        } else if (rotateAngle == 270){
            int[] values = {centerPoint + (int) (0.5 * scale), centerPoint, centerPoint - (int) (0.5 * scale)};
            return values;
        }else{
            return null;
        }
    }
}
