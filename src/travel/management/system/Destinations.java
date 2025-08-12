
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class Destinations extends JFrame implements ActionListener{
    
    String username;
    HashMap<JButton, String> buttonMap = new HashMap<>(); // Store button references

    //JButton button;
    Destinations(String username) {
        setUndecorated(true);
        
        this.username=username;
        // Set frame properties

        setTitle("Destinations");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBackground(Color.WHITE);
        setLayout(new BorderLayout(10, 30)); // Creates spacing between components

        // Main container for top two panels
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 20)); // Adds gap between panels
        topPanel.add(createDestinationPanel("Goa", "src/icons/Goa1.jpg"));
        topPanel.add(createDestinationPanel("Bangalore", "src/icons/Bangalore.jpg"));
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/GoaTitle.png"));
        Image i5 = i4.getImage().getScaledInstance(150,300, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image1 = new JLabel(i6);
        image1.setBounds(200,25, 195, 250);
        add(image1);
      
        ImageIcon b4 = new ImageIcon(ClassLoader.getSystemResource("icons/BangaloreTitle.jpg"));
        Image b5 = b4.getImage().getScaledInstance(150,250, Image.SCALE_DEFAULT);
        ImageIcon b6 = new ImageIcon(b5);
        JLabel imageb = new JLabel(b6);
        imageb.setBounds(800,25, 195, 250);
        add(imageb);
        
        ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("icons/KeralaTitle.jpg"));
        Image k2 = k1.getImage().getScaledInstance(150,250, Image.SCALE_DEFAULT);
        ImageIcon k3 = new ImageIcon(k2);
        JLabel kimage = new JLabel(k3);
        kimage.setBounds(374,375, 450, 292);
        add(kimage);
              

        // Bottom panel (centered)
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));  //  align,hgap,vgap
        bottomPanel.add(createDestinationPanel("Kerala", "src/icons/Kerala.jpg"));

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JButton back = new JButton("Back");
        back.setFont(new Font("Verdana", Font.BOLD, 20));
        back.setBackground(Color.BLUE );
        back.setForeground(Color.WHITE);
        back.setPreferredSize(new Dimension(150,40));
        back.addActionListener(this);
        btnPanel.add(back);
      
        
        // Adding to main frame
        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.CENTER);
        add(btnPanel,BorderLayout.SOUTH);
       
        setVisible(true);
    }

    // Method to create a destination panel with a label, image, and button
    private JPanel createDestinationPanel(String destination, String imagePath) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 300)); // Set fixed size
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Label for destination name
        JLabel label = new JLabel(destination, SwingConstants.CENTER);
        label.setFont(new Font("Tahoma", Font.BOLD, 16));

      
        // Load and scale image properly
        ImageIcon icon = new ImageIcon(imagePath); // Load image
        Image img = icon.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH); 
        ImageIcon scaledIcon = new ImageIcon(img);

        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);


        // Button
        JButton button = new JButton("Open");
        button.setBackground(Color.BLACK );
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Verdana", Font.BOLD, 18));
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setPreferredSize(new Dimension(110, 40));
        button.addActionListener(this);
        add(button);
        buttonMap.put(button, destination);

        
        // Create content panel (left side)
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(label, BorderLayout.CENTER);
        contentPanel.add(button, BorderLayout.SOUTH);

        // Split content and image side-by-side
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, contentPanel, imageLabel);
        splitPane.setDividerLocation(150);
        splitPane.setResizeWeight(0.5);

        panel.add(splitPane, BorderLayout.CENTER);
        return panel;
        
    }

    public void actionPerformed(ActionEvent e) {
    JButton clickedButton = (JButton) e.getSource();
    String destination = buttonMap.get(clickedButton);

    if (destination != null) {
        switch (destination) {
            case "Goa":
                dispose();
                new Goa_Packages(username);
                break;
            case "Bangalore":
                dispose();
                new Bangalore_Packages(username);
                break;
            case "Kerala":
                dispose();
                new Kerala_Packages(username);
                break;
            default:
                System.out.println("Unknown destination: " + destination);
        }
    } else {
        dispose(); // For "Back" button
    }
}

    public static void main(String[] args) {
        new Destinations("");
    }
}

