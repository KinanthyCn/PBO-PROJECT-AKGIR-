package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGUI extends JFrame {

    public HomeGUI(){
        setTitle("Home Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        setLocationRelativeTo(null);
        setResizable(false);

        final JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new FlowLayout());

        final JButton startButton = new JButton("START");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Level2GUI();
            }
        });

        mainPanel.add(startButton, BorderLayout.CENTER);

        add(mainPanel);

        setVisible(true);

    }

}
