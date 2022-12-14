/*
 * Created by JFormDesigner on Wed Dec 14 03:34:17 EET 2022
 */

package org.example;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
import net.miginfocom.swing.*;

/**
 * @author GruescuDaniel
 */
public class asd extends JPanel {
    public asd() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - GruescuDaniel
        frame1 = new Frame();
        textField1 = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label3 = new JLabel();
        passwordField1 = new JPasswordField();

        //======== frame1 ========
        {
            frame1.setTitle("Log In");
            frame1.setLayout(null);

            //---- textField1 ----
            textField1.setBackground(Color.white);
            frame1.add(textField1);
            textField1.setBounds(300, 230, 279, textField1.getPreferredSize().height);

            //---- label4 ----
            label4.setText("Username");
            label4.setFont(new Font("Ubuntu", Font.PLAIN, 22));
            label4.setBackground(Color.white);
            label4.setForeground(Color.red);
            frame1.add(label4);
            label4.setBounds(new Rectangle(new Point(315, 200), label4.getPreferredSize()));

            //---- label5 ----
            label5.setText("Password");
            label5.setFont(new Font("Ubuntu", Font.PLAIN, 22));
            label5.setForeground(new Color(0xff3333));
            frame1.add(label5);
            label5.setBounds(310, 280, 150, label5.getPreferredSize().height);

            //---- button1 ----
            button1.setText("Log In");
            button1.setForeground(new Color(0xff3300));
            button1.setBackground(Color.white);
            button1.setFont(new Font("Ubuntu", Font.PLAIN, 48));
            frame1.add(button1);
            button1.setBounds(new Rectangle(new Point(350, 355), button1.getPreferredSize()));

            //---- button2 ----
            button2.setText("Don't have an account? Sign in and join the race!");
            button2.setForeground(new Color(0xff3333));
            button2.setBackground(Color.white);
            frame1.add(button2);
            button2.setBounds(new Rectangle(new Point(265, 425), button2.getPreferredSize()));

            //---- label3 ----
            label3.setText("La Grage");
            label3.setFont(new Font("Z003", Font.PLAIN, 150));
            label3.setForeground(new Color(0xff0033));
            frame1.add(label3);
            label3.setBounds(25, 15, 560, 160);

            //---- passwordField1 ----
            passwordField1.setBackground(Color.white);
            frame1.add(passwordField1);
            passwordField1.setBounds(305, 310, 270, passwordField1.getPreferredSize().height);

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
    // Generated using JFormDesigner Evaluation license - GruescuDaniel
    private Frame frame1;
    private JTextField textField1;
    private JLabel label4;
    private JLabel label5;
    private JButton button1;
    private JButton button2;
    private JLabel label3;
    private JPasswordField passwordField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
