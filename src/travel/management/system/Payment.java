package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    private Image backgroundImage;
    JButton back;

    public Payment() {
        setUndecorated(true);
        // Load the background image
        backgroundImage = new ImageIcon("background.jpg").getImage();

        // Frame setup
        setTitle("Payment Portal");
        setSize(800, 600);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Using absolute positioning

        // Custom panel to draw background
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(null);
        setContentPane(panel);

        // Heading
        JLabel title = new JLabel("Payment Portal", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 36));
        title.setForeground(Color.BLUE);
        title.setBounds(220, 50, 400, 40);
        panel.add(title);

        // Instruction
        JLabel instruction = new JLabel("Click the button below to view the payment QR code and link", SwingConstants.CENTER);
        instruction.setFont(new Font("Serif", Font.BOLD, 18));
        instruction.setForeground(Color.BLACK);
        instruction.setBounds(130, 100, 600, 30);
        panel.add(instruction);

        // Button
        JButton showButton = new JButton("Show Payment Info");
        showButton.setBounds(320, 150, 160, 30);
        panel.add(showButton);

        // QR code and Pay Now link (hidden initially)
        JLabel qrLabel = new JLabel(new ImageIcon("src/icons/QRCode.png"));
        qrLabel.setBounds(300, 200, 200, 200);
        qrLabel.setVisible(false);
        panel.add(qrLabel);
       
        back=new JButton("Back");
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(350,500,100,25);
        back.addActionListener(this);
        add(back);
        
        JLabel payNow = new JLabel("<HTML><U>Pay Now</U></HTML>", SwingConstants.CENTER);
        payNow.setForeground(Color.BLUE);
        payNow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        payNow.setBounds(360, 450, 80, 30);
        payNow.setVisible(false);
        panel.add(payNow);

        // On button click, show QR code and link
        showButton.addActionListener(e -> {
            qrLabel.setVisible(true);
            payNow.setVisible(true);
        });

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }

    public static void main(String[] args) {
        new Payment();
    }
}

