package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*; 

public class CheckPackage extends JFrame implements ActionListener{
    JButton bookpackage1,bookpackage2,bookpackage3;
    String username;
    JPanel textPanel;
    JRadioButton date1, date2;
    ButtonGroup bg;
    JLabel lbldate ;

    CheckPackage(String username){
        setUndecorated(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.username=username;
        setBounds(220,50,1080,750);
        
        String[] package1={"GOLD PACKAGE (Goa)","(6 Days and 7 Nights)","(All Meals Included)","5 Star Hotel Stay- Holiday Inn Resort","Day-1 Dudhsagar Waterfall Trek (Morning) and Mahalaxmi Temple (Evening)","Day-2 Baga Beach(Mrng.) and Carambolim Lake:Peaceful Nature walk,Bird Watching heaven (Evng.)","Day-3 Cola Beach (Morning) and Naval Aviation Museum (Evening)","Day-4 Reis Magos Fort (Morning) and  Morjim Beach :Sunset Point (Evening)","Day-5 Sindhudurg Fort Trekking (Morning) and Shopping at Anjuna Flea Market (Evening)","Day-6 Divar Island Cycling Tour (Mrng.) and Birdwatching at Salim Ali Bird Sanctuary (Evng.)","Book Package Now","15,000/- Per Person"};
        String[] package2 ={"SILVER PACKAGE (Goa)","(4 Days and 5 Nights)","(All Meals Included)","3 Star Hotel Stay- Hotel Tito's","Day-1 Dudhsagar Waterfall Trek (Morning) and Mahalaxmi Temple (Evening)","Day-2 Baga Beach(Mrng.) and Naval Aviation Museum (Evening)","Day-3 Reis Magos Fort (Morning) and  Morjim Beach :Sunset Point (Evening)","Day-4 Sindhudurg Fort Trekking (Morning) and Shopping at Anjuna Flea Market (Evening))","","","Book Package Now","10,000/- Per Person"};
        String[] package3 ={"BRONZE PACKAGE (Goa)","(3 Days and 4 Nights)","(All Meals Included)","3 Star Hotel Stay-FabHotel Baga Tulip","Day-1 Dudhsagar Waterfall Trek (Morning) and Mahalaxmi Temple (Evening)","Day-2 Baga Beach(Mrng.) and Naval Aviation Museum visit and Salim Ali Bird Sanctuary (Evening)","Day-3 Sindhudurg Fort Trekking (Morning) and  Morjim Beach :Sunset Point (Evening)","","","","Book Package Now","8,000/- Per Person"};
        
        JTabbedPane tab = new JTabbedPane();
        JPanel p1=createPackage(package1);
        tab.addTab("Package 1",null,p1); 
         bookpackage1 = new JButton("Book Now");
                bookpackage1.setBounds(350,580,250,40);
                bookpackage1.setBackground(new Color(0,0,50)); 
                bookpackage1.setForeground(Color.WHITE);
                bookpackage1.setFont(new Font ("Tahoma",Font.PLAIN,20));
                bookpackage1.setMargin(new Insets(0,0,0,20));
                bookpackage1.addActionListener(this);
                textPanel.add(bookpackage1);
                
                lbldate = new JLabel("Select The Dates:");   //Date Selection
                lbldate.setBounds(30, 500, 500, 30);
                    lbldate.setForeground(Color.YELLOW);
                lbldate.setFont(new Font("Verdana", Font.BOLD, 20));
                textPanel.add(lbldate);

                date1 = new JRadioButton("15th May 2025");
                date1.setBounds(250, 500, 160, 30);
                date1.setFont(new Font("Verdana", Font.PLAIN, 16));
                date1.setBackground(Color.WHITE);
                textPanel.add(date1);

                date2 = new JRadioButton("3rd June 2025");
                date2.setBounds(450, 500, 160, 30);
                date2.setFont(new Font("Verdana", Font.PLAIN, 16));
                date2.setBackground(Color.WHITE);
                textPanel.add(date2);

                bg = new ButtonGroup();
                bg.add(date1);
                bg.add(date2);

        
        JPanel p2=createPackage(package2);
        tab.addTab("Package 2",null,p2);
        
         bookpackage2 = new JButton("Book Now");
                bookpackage2.setBounds(350,580,250,40);
                bookpackage2.setBackground(new Color(0,0,50)); 
                bookpackage2.setForeground(Color.WHITE);
                bookpackage2.setFont(new Font ("Tahoma",Font.PLAIN,20));
                bookpackage2.setMargin(new Insets(0,0,0,20));
                bookpackage2.addActionListener(this);
                textPanel.add(bookpackage2);
                
                lbldate = new JLabel("Select The Dates:");   //Date Selection
                lbldate.setBounds(30, 500, 500, 30);
                lbldate.setForeground(Color.YELLOW);
                lbldate.setFont(new Font("Verdana", Font.BOLD, 20));
                textPanel.add(lbldate);

                date1 = new JRadioButton("15th May 2025");
                date1.setBounds(250, 500, 160, 30);
                date1.setFont(new Font("Verdana", Font.PLAIN, 16));
                date1.setBackground(Color.WHITE);
                textPanel.add(date1);

                date2 = new JRadioButton("3rd June 2025");
                date2.setBounds(450, 500, 160, 30);
                date2.setFont(new Font("Verdana", Font.PLAIN, 16));
                date2.setBackground(Color.WHITE);
                textPanel.add(date2);

                bg = new ButtonGroup();
                bg.add(date1);
                bg.add(date2);

        
        JPanel p3=createPackage(package3);
        tab.addTab("Package 3",null,p3);
        
        bookpackage3 = new JButton("Book Now");
                bookpackage3.setBounds(350,580,250,40);
                bookpackage3.setBackground(new Color(0,0,50)); 
                bookpackage3.setForeground(Color.WHITE);
                bookpackage3.setFont(new Font ("Tahoma",Font.PLAIN,20));
                bookpackage3.setMargin(new Insets(0,0,0,20));
                bookpackage3.addActionListener(this);
                textPanel.add(bookpackage3);
        
                lbldate = new JLabel("Select The Dates:");   //Date Selection
                lbldate.setBounds(30, 500, 500, 30);
                lbldate.setForeground(Color.YELLOW);
                lbldate.setFont(new Font("Verdana", Font.BOLD, 20));
                textPanel.add(lbldate);

                date1 = new JRadioButton("15th May 2025");
                date1.setBounds(250, 500, 160, 30);
                date1.setFont(new Font("Verdana", Font.PLAIN, 16));
                date1.setBackground(Color.WHITE);
                textPanel.add(date1);

                date2 = new JRadioButton("3rd June 2025");
                date2.setBounds(450, 500, 160, 30);
                date2.setFont(new Font("Verdana", Font.PLAIN, 16));
                date2.setBackground(Color.WHITE);
                textPanel.add(date2);

                bg = new ButtonGroup();
                bg.add(date1);
                bg.add(date2);

        add(tab);
        
        setVisible(true);
    }
    
    public JPanel createPackage(String[] pack) {
    // Load the image
    ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icons/Goa1.jpg"));
    Image bgImage = bgIcon.getImage().getScaledInstance(870, 600, Image.SCALE_SMOOTH);

    // Custom JPanel with background image
    JPanel p1 = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);
        }
    };
    p1.setLayout(null);

    // Semi-transparent panel for text background
    textPanel = new JPanel();
    textPanel.setBounds(35, 15, 990, 650);
    textPanel.setBackground(new Color(0, 0, 0, 150)); // Black with 150 alpha for transparency
    textPanel.setLayout(null);
    p1.add(textPanel);

    // Labels on top of the transparent panel
    JLabel l1 = new JLabel(pack[0]);
    l1.setBounds(30, 10, 600, 30);
    l1.setForeground(Color.YELLOW);
    l1.setFont(new Font("Verdana", Font.BOLD, 30));
    textPanel.add(l1);

    JLabel l2 = new JLabel(pack[1]);
    l2.setBounds(30, 50, 400, 30);
    l2.setForeground(Color.WHITE);
    l2.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l2);

    JLabel l3 = new JLabel(pack[2]);
    l3.setBounds(30, 90, 500, 30);
    l3.setForeground(Color.WHITE);
    l3.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l3);

    JLabel l4 = new JLabel(pack[3]);
    l4.setBounds(30, 130, 500, 30);
    l4.setForeground(Color.WHITE);
    l4.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l4);

    JLabel l5 = new JLabel(pack[4]);   //Day 1
    l5.setBounds(30, 170, 800, 30);
    l5.setForeground(Color.WHITE);
    l5.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l5);

    JLabel l6 = new JLabel(pack[5]);    //Day 2
    l6.setBounds(30, 210, 950, 30);
    l6.setForeground(Color.WHITE);
    l6.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l6);

    JLabel l7 = new JLabel(pack[6]);    //Day 3
    l7.setBounds(30, 250, 900, 30);
    l7.setForeground(Color.WHITE);
    l7.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l7);

    JLabel l8 = new JLabel(pack[7]);     //Day 4
    l8.setBounds(30, 290, 900, 30);
    l8.setForeground(Color.WHITE);
    l8.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l8);
    
    JLabel l9 = new JLabel(pack[8]);   //Day 5
    l9.setBounds(30, 330, 900, 30);
    l9.setForeground(Color.WHITE);
    l9.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l9);

    JLabel l10 = new JLabel(pack[9]);   //Day 6
    l10.setBounds(30, 370, 900, 30);
    l10.setForeground(Color.WHITE);
    l10.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l10);
    
    JLabel l11 = new JLabel(pack[10]);       //Book package now
    l11.setBounds(350, 540, 500, 35);
    l11.setForeground(Color.YELLOW);
    l11.setFont(new Font("Tahoma", Font.BOLD, 25));
    textPanel.add(l11);

    JLabel l12 = new JLabel(pack[11]);       //price
    l12.setBounds(30, 450, 500, 30);
    l12.setBackground(Color.BLUE);
    l12.setForeground(Color.YELLOW);
    l12.setFont(new Font("Tahoma", Font.BOLD, 20));
    textPanel.add(l12);

    return p1;
}
    public void actionPerformed (ActionEvent ae) {              
		if(ae.getSource() == bookpackage1) {
                    String date = null;
                    if (date1.isSelected()) {
                        date = "15th May 2025";
                    } else {
                        date = "3rd June 2025";
                    }
                    new BookPackage(username);
                    setVisible(false);
		}
                else if(ae.getSource() == bookpackage2) {
                     String date = null;
                    if (date1.isSelected()) {
                        date = "15th May 2025";
                    } else {
                        date = "3rd June 2025";
                    }
                    new BookPackage(username);
                    setVisible(false);
		}
                else if(ae.getSource() == bookpackage3) {
                     String date = null;
                    if (date1.isSelected()) {
                        date = "15th May 2025";
                    } else {
                        date = "3rd June 2025";
                    }
                    new BookPackage(username);
                    setVisible(false);
		}
    }
    public static void main(String[] args){
        new CheckPackage("");
    }
}

