package org.layouttest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * Created by Shishkov A.V. on 23.03.2014.
 */

public class MyFrame extends JFrame {

    private boolean awake;
    Thread ticker;
    JLabel timeLabel;
    DateFormat dateFormat;

    public MyFrame(String title) throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 240);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        setDefaultLookAndFeelDecorated(true);
        setResizable(false);

        awake = false;
        ticker = new Ticker();

        dateFormat = new SimpleDateFormat("hh:mm:ss", Locale.GERMAN);
        Font frameFont = new Font("Arial", 0, 14);

        JButton startButton = new JButton("Старт");
        startButton.setSize(80, 35);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticker.start();
            }
        });
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        add(startButton, constraints);

        JButton stopButton = new JButton("Стоп");
        stopButton.setSize(80, 35);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                awake = false;
                JOptionPane.showMessageDialog(MyFrame.this, "Х*й ты жмешь?! Не видишь что ли - функционал еще не готов!!");
            }
        });
        add(stopButton, constraints);

        timeLabel = new JLabel("Hello World!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 0.0;
        constraints.ipady = 30;
        add(timeLabel, constraints);

        setVisible(true);
    }

    class Ticker extends Thread {

        @Override
        public void run() {
            while (true) {
                Random random = new Random();
                Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                timeLabel.setForeground(color);
                timeLabel.setText(dateFormat.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
