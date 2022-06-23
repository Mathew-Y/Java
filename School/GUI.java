import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener
{
    private static JLabel label1;
    private static JTextField text1;

    private static JLabel label2;
    private static JTextField text2;

    private static JLabel label3;
    private static JTextField text3;

    private static JLabel label4;
    private static JTextField text4;

    private static JLabel label5;
    private static JTextField text5;

    private static JLabel label6;
    private static JTextArea text6;

    private static JButton button1;
    private static JButton button2;
    private static JButton button3;

    public GUI(){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(650,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("FINAL EXAM CENG 217 - PART B");
        frame.add(panel);

        panel.setLayout(null);

        label1 = new JLabel("Student Name");
        label1.setBounds(20,60,80,25);
        panel.add(label1);

        text1 = new JTextField(20);
        text1.setBounds(100, 60,165,25);
        text1.setVisible(false);
        panel.add(text1);

        label2 = new JLabel("Course Code");
        label2.setBounds(20,100,80,25);
        panel.add(label2);

        text2 = new JTextField(20);
        text2.setBounds(100, 100,165,25);
        text2.setVisible(false);
        panel.add(text2);

        label3 = new JLabel("Test1(50%)");
        label3.setBounds(20,140,80,25);
        panel.add(label3);

        text3 = new JTextField(20);
        text3.setBounds(100, 140,165,25);
        text3.setVisible(false);
        panel.add(text3);

        label4 = new JLabel("Test2(50%)");
        label4.setBounds(20,180,80,25);
        panel.add(label4);

        text4 = new JTextField(20);
        text4.setBounds(100, 180,165,25);
        text4.setVisible(false);
        panel.add(text4);

        label5 = new JLabel("Final Grade");
        label5.setBounds(20,220,80,25);
        panel.add(label5);

        text5 = new JTextField(20);
        text5.setBounds(100, 220,165,25);
        text5.setVisible(false);
        panel.add(text5);

        label6 = new JLabel("Student Info:");
        label6.setBounds(320,150,80,25);
        panel.add(label6);

        text6 = new JTextArea();
        text6.setBounds(320,180,170,80);
        text6.setVisible(false);
        panel.add(text6);

        button1 = new JButton("Edit");
        button1.setBounds(15,250,80,20);
        button1.addActionListener(new GUI());
        panel.add(button1);

        button2 = new JButton("Display");
        button2.setBounds(100,250,80,20);
        button2.addActionListener(new GUI());
        panel.add(button2);

        button3 = new JButton("Reset");
        button3.setBounds(185,250,80,20);
        button3.addActionListener(new GUI());
        panel.add(button3);

        frame.setVisible(true);
    }
    public void repaint(){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        /*String name = text1.getText();
        String code = text2.getText();
        String test1 = text3.getText();
        String test2 = text4.getText();
        int no1 = Integer.parseInt(test1);
        int no2 = Integer.parseInt(test2);
        double fin = (double)no1*0.5 + (double)no2*0.5;*/
        if(obj == button1) {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(true);
            text5.setVisible(true);
            text6.setVisible(true);
            pack();
        }
        /*if(obj == button2){
             text5.setText(String.valueOf(fin));
             text6.append("Student Name: "+ name);
             text6.append("Course Code:"+ code);
             text6.append("Final Grade" + String.valueOf(fin));
            }*/
        if(obj == button3){
            super.getContentPane().removeAll();
            repaint();
        }
    }
    public static void main(String[] args){
        new GUI();
    }
}
