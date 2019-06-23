package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input: ");
    private JRadioButton radio1 = new JRadioButton("Select this: ");
    private JRadioButton radio2 = new JRadioButton("Select that: ");
    private JCheckBox check = new JCheckBox("Check", false);
}
