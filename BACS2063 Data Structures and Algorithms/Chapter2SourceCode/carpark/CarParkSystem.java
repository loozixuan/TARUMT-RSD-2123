package carpark;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * CarParkSystem.java A client class that simulates a car park system.
 *
 * @author Kat Tan
 * @version 1.0
 */
public class CarParkSystem extends JFrame {

    private CounterInterface counterA;
    private CounterInterface counterB;

    private int totalBays = 100;

    private JButton westExit = new JButton("Open West Exit");
    private JButton westEntry = new JButton("Open West Entry");
    private JButton eastExit = new JButton("Open East Exit");
    private JButton eastEntry = new JButton("Open East Entry");

    private JLabel westCarPark = new JLabel("Car Park A");
    private JLabel eastCarPark = new JLabel("Car Park B");

    private JTextField westTotal = new JTextField();
    private JTextField eastTotal = new JTextField();

    public CarParkSystem() {
        counterA = new Counter();
        counterB = new Counter();

        JPanel westPanel = new JPanel(new BorderLayout());
        westPanel.add(westEntry, BorderLayout.SOUTH);
        westPanel.add(westExit, BorderLayout.NORTH);
        westPanel.add(westCarPark);
        westCarPark.setBorder(new LineBorder(Color.BLACK));
        westCarPark.setHorizontalAlignment(SwingConstants.CENTER);
        add(westPanel, BorderLayout.WEST);

        JPanel eastPanel = new JPanel(new BorderLayout());
        eastPanel.add(eastEntry, BorderLayout.SOUTH);
        eastPanel.add(eastExit, BorderLayout.NORTH);
        eastPanel.add(eastCarPark);
        eastCarPark.setBorder(new LineBorder(Color.BLACK));
        eastCarPark.setHorizontalAlignment(SwingConstants.CENTER);
        add(eastPanel, BorderLayout.EAST);

        add(new JLabel(), BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(10, 1));
        centerPanel.add(new JLabel());

        Font font = new Font("Arial", Font.BOLD, 16);

        centerPanel.add(new JLabel("Available Bays"));
        centerPanel.add(new JLabel("Car Park A: "));
        centerPanel.add(westTotal);
        westTotal.setEditable(false);
        westTotal.setHorizontalAlignment(SwingConstants.CENTER);
        westTotal.setFont(font);
        westTotal.setText(totalBays + "");

        centerPanel.add(new JLabel());
        centerPanel.add(new JLabel("Car Park B: "));
        centerPanel.add(eastTotal);
        eastTotal.setEditable(false);
        eastTotal.setHorizontalAlignment(SwingConstants.CENTER);
        eastTotal.setFont(font);
        eastTotal.setText(totalBays + "");

        add(centerPanel);

        ExitListener exitListener = new ExitListener();
        westExit.addActionListener(exitListener);
        eastExit.addActionListener(exitListener);

        EntryListener entryListener = new EntryListener();
        westEntry.addActionListener(entryListener);
        eastEntry.addActionListener(entryListener);

        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ExitListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == westExit) {
                counterA.decrement();
                westTotal.setText(totalBays - counterA.read() + "");
            } else if (e.getSource() == eastExit) {
                counterB.decrement();
                eastTotal.setText(totalBays - counterB.read() + "");
            }
        }
    }

    private class EntryListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == westEntry) {
                counterA.increment();
                westTotal.setText(totalBays - counterA.read() + "");
            } else if (e.getSource() == eastEntry) {
                counterB.increment();
                eastTotal.setText(totalBays - counterB.read() + "");
            }
        }
    }

    public static void main(String[] args) {
        new CarParkSystem();
    }

}
