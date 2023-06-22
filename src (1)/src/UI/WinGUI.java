package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinGUI extends JFrame {
    public WinGUI(){
        setTitle("Winner");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,80);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        final JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        final JLabel textLabel = new JLabel("YOU WIN!!!         ");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.BLACK);
        mainPanel.add(textLabel, BorderLayout.WEST);

        final JButton startButton = new JButton("NEXT");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        mainPanel.add(startButton, BorderLayout.EAST);
        add(mainPanel);

    }
}
