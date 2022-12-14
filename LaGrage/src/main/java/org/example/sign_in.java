/*
 * Created by JFormDesigner on Wed Dec 14 12:19:42 EET 2022
 */

package org.example;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

import static org.example.Main.changeFrame;

/**
 * @author GruescuDaniel
 */
public class sign_in extends JFrame {
    public sign_in() {
        initComponents();
    }


    private void sendRegister(MouseEvent e) throws IOException {
        //First Name - TextField1
        //Last Name - TextField5
        //Email - TextField2
        //Username - TextField3
        //Password - passwordFiel1
        //ConfirmPassword - passwordField2

        String username = textField3.getText();
        String email = textField2.getText();
        String firstName = textField1.getText();
        String lastName = textField5.getText();
        String password = passwordField1.getText();

        if(Database.registerUser(username,email,firstName,lastName,password ) == 1){
            System.out.println("User Registered");
            changeFrame(username);
        }
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    public void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Danziel
        frame1 = new JFrame();
        textField1 = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        button1 = new JButton();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label6 = new JLabel();
        label7 = new JLabel();
        textField5 = new JTextField();
        label8 = new JLabel();
        label9 = new JLabel();
        passwordField1 = new JPasswordField();
        passwordField2 = new JPasswordField();
        radioButton1 = new JRadioButton();

        //======== frame1 ========
        {
            frame1.setBackground(Color.white);
            frame1.setTitle("Sign In");
            frame1.setLayout(null);

            //---- textField1 ----
            textField1.setBackground(Color.white);
            frame1.add(textField1);
            textField1.setBounds(90, 190, 279, textField1.getPreferredSize().height);

            //---- label4 ----
            label4.setText("Username");
            label4.setFont(new Font("Ubuntu", Font.PLAIN, 22));
            label4.setBackground(Color.white);
            label4.setForeground(Color.red);
            frame1.add(label4);
            label4.setBounds(new Rectangle(new Point(510, 165), label4.getPreferredSize()));

            //---- label5 ----
            label5.setText("Password");
            label5.setFont(new Font("Ubuntu", Font.PLAIN, 22));
            label5.setForeground(new Color(0xff3333));
            frame1.add(label5);
            label5.setBounds(510, 225, 150, label5.getPreferredSize().height);

            //---- button1 ----
            button1.setText("Join The Race");
            button1.setForeground(new Color(0xff0033));
            button1.setBackground(Color.white);
            button1.setFont(new Font("Ubuntu", Font.PLAIN, 48));
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                    try {
                        sendRegister(e);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
            frame1.add(button1);
            button1.setBounds(new Rectangle(new Point(270, 420), button1.getPreferredSize()));

            //---- textField2 ----
            textField2.setBackground(Color.white);
            frame1.add(textField2);
            textField2.setBounds(90, 305, 279, 30);

            //---- label3 ----
            label3.setText("La Grage");
            label3.setFont(new Font("Z003", Font.PLAIN, 150));
            label3.setForeground(new Color(0xff0033));
            frame1.add(label3);
            label3.setBounds(20, 35, 560, 160);

            //---- textField3 ----
            textField3.setBackground(Color.white);
            frame1.add(textField3);
            textField3.setBounds(505, 190, 279, 30);

            //---- label6 ----
            label6.setText("First Name");
            label6.setFont(new Font("Ubuntu", Font.PLAIN, 22));
            label6.setBackground(Color.white);
            label6.setForeground(Color.red);
            frame1.add(label6);
            label6.setBounds(90, 165, 170, 26);

            //---- label7 ----
            label7.setText("Last Name");
            label7.setFont(new Font("Ubuntu", Font.PLAIN, 22));
            label7.setBackground(Color.white);
            label7.setForeground(Color.red);
            frame1.add(label7);
            label7.setBounds(90, 225, 135, 26);

            //---- textField5 ----
            textField5.setBackground(Color.white);
            frame1.add(textField5);
            textField5.setBounds(90, 250, 279, 30);

            //---- label8 ----
            label8.setText("Email");
            label8.setFont(new Font("Ubuntu", Font.PLAIN, 22));
            label8.setBackground(Color.white);
            label8.setForeground(Color.red);
            frame1.add(label8);
            label8.setBounds(90, 280, 135, 26);

            //---- label9 ----
            label9.setText("Confirm Password");
            label9.setFont(new Font("Ubuntu", Font.PLAIN, 22));
            label9.setForeground(new Color(0xff3333));
            frame1.add(label9);
            label9.setBounds(510, 285, 240, 26);

            //---- passwordField1 ----
            passwordField1.setBackground(Color.white);
            frame1.add(passwordField1);
            passwordField1.setBounds(510, 250, 270, passwordField1.getPreferredSize().height);

            //---- passwordField2 ----
            passwordField2.setBackground(Color.white);
            frame1.add(passwordField2);
            passwordField2.setBounds(510, 310, 270, 30);

            //---- radioButton1 ----
            radioButton1.setText("Ask for admin permissions");
            radioButton1.setFont(new Font("Ubuntu", Font.PLAIN, 22));
            radioButton1.setBackground(Color.white);
            radioButton1.setForeground(new Color(0xff0033));
            frame1.add(radioButton1);
            radioButton1.setBounds(new Rectangle(new Point(300, 355), radioButton1.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < frame1.getComponentCount(); i++) {
                    Rectangle bounds = frame1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = frame1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                frame1.setMinimumSize(preferredSize);
                frame1.setPreferredSize(preferredSize);
            }
            frame1.setSize(875, 645);
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Danziel
    public JFrame frame1;
    private JTextField textField1;
    private JLabel label4;
    private JLabel label5;
    private JButton button1;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField5;
    private JLabel label8;
    private JLabel label9;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JRadioButton radioButton1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
