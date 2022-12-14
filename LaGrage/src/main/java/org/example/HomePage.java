/*
 * Created by JFormDesigner on Wed Dec 14 18:16:02 EET 2022
 */

package org.example;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Danziel
 */
public class HomePage extends JPanel {
    String userName;
    public HomePage(String username) {
        initComponents();
        this.userName = username;
    }

    public void setUserName(String userName){
        this.userName = userName;
        label4.setText("Welcome "+this.userName );
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Danziel
        frame1 = new JFrame();
        label3 = new JLabel();
        label4 = new JLabel();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //---- label3 ----
            label3.setText("La Grage");
            label3.setFont(new Font("Z003", Font.PLAIN, 150));
            label3.setForeground(new Color(0xff0033));
            frame1ContentPane.add(label3);
            label3.setBounds(180, 25, 560, 160);

            //---- label4 ----
            label4.setText("Welcome " + this.userName);
            label4.setFont(new Font("Cantarell", Font.PLAIN, 40));
            label4.setForeground(new Color(0xff0033));
            label4.setHorizontalAlignment(SwingConstants.CENTER);
            frame1ContentPane.add(label4);
            label4.setBounds(0, 200, 890, 90);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < frame1ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = frame1ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = frame1ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                frame1ContentPane.setMinimumSize(preferredSize);
                frame1ContentPane.setPreferredSize(preferredSize);
            }
            frame1.setSize(895, 660);
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Danziel
    public JFrame frame1;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
