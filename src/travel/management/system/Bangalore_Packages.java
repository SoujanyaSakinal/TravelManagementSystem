package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*; 

public class Bangalore_Packages extends JFrame implements ActionListener{
    JButton bookpackage1,bookpackage2,bookpackage3,back;
    String username;
    JPanel textPanel;
    JRadioButton date1, date2;
    ButtonGroup bg;
    JLabel lbldate ;

    Bangalore_Packages(String username){
        
        setUndecorated(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.username=username;
        setBounds(220,50,1080,750);
        
        String[] package1={"GOLD PACKAGE (Bangalore)","(7 Days and 8 Nights)","(All Meals Included)","3 Star Hotel Stay- FabHotel Astra Suites","Day-1 Tipu Sultan's summer Palace, Lalbagh Botanical Garden","Day-2 Wonderla Amusement Park, Nandi Hills, Iskcon Temple Bangalore","Day-3 National Gallery of Modern Art, Innovative Film City","Day-4 Snow City, Brigade Road and MG Road (Shopping)","Day 5: Maysore- Maysore Palace,Chamundeshwari Temple, Somnathpur Temple","Day 6: Maysore: Brindavan Gardern, Karanji Lake(Boating), Nagarhole National Park ","Day 7: Maysore- Maysore Sand Sculpture Museum, Shivanasamudra Falls.","15,000/- Per Person"};
        String[] package2 ={"SILVER PACKAGE (Bangalore)","(5 Days and 6 Nights)","(All Meals Included)","3 Star Hotel Stay- Hotel Tap Gold Crest","Day-1 Tipu Sultan's summer Palace, Lalbagh Botanical Garden","Day-2 Wonderla Amusement Park, National Gallery of Modern Art","Day-3 Snow City, Innovative Film City, Departing for Maysore in the Evening","Day-4 Maysore- Maysore Palace,Chamundeshwari Temple, Somnathpur Templ","Day 5: Maysore- Maysore Sand Sculpture Museum, Shivanasamudra Falls."," "," ","12,000/- Per Person"};
        String[] package3 ={"BRONZE PACKAGE (Bangalore)","(4 Days and 5 Nights)","(All Meals Included)","3 Star Hotel Stay-Hotel Swagat","Day-1 Tipu Sultan's summer Palace, Lalbagh Botanical Garden","Day-2 Wonderla Amusement Park, National Gallery of Modern Art","Day-3 Snow City, Innovative Film City, Departing for Maysore in the Evening","Day-4 Maysore- Maysore Palace,Chamundeshwari Temple, Somnathpur Templ,","          Shivanasamudra Falls. "," "," ","10,000/- Per Person"};
        
        JTabbedPane tab = new JTabbedPane();
        JPanel p1=createPackage(package1);
        tab.addTab("Package 1",null,p1); 
        
        back = new JButton("Back");
        back.setBounds(850,580,100,40);
        back.setFont(new Font("Tahoma", Font.PLAIN, 20));
        back.setBackground(new Color(0,0,50)); 
        back.setForeground(Color.WHITE);
        back.setMargin(new Insets(0,0,0,5));
        back.addActionListener(this);
        textPanel.add(back);
        
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
        
        back = new JButton("Back");
        back.setBounds(850,580,100,40);
        back.setFont(new Font("Tahoma", Font.PLAIN, 20));
        back.setBackground(new Color(0,0,50)); 
        back.setForeground(Color.WHITE);
        back.setMargin(new Insets(0,0,0,5));
        back.addActionListener(this);
        textPanel.add(back);
        
        
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
        
        back = new JButton("Back");
        back.setBounds(850,580,100,40);
        back.setFont(new Font("Tahoma", Font.PLAIN, 20));
        back.setBackground(new Color(0,0,50)); 
        back.setForeground(Color.WHITE);
        back.setMargin(new Insets(0,0,0,5));
        back.addActionListener(this);
        textPanel.add(back);
        
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
    ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icons/Bangalore.jpg"));
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
    l1.setBounds(30, 10, 600, 35);
    l1.setForeground(Color.YELLOW);
    l1.setFont(new Font("Verdana", Font.BOLD, 30));
    textPanel.add(l1);

    JLabel l2 = new JLabel(pack[1]);
    l2.setBounds(30, 50, 400, 30);
    l2.setForeground(Color.YELLOW);
    l2.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l2);

    JLabel l3 = new JLabel(pack[2]);
    l3.setBounds(30, 90, 500, 30);
    l3.setForeground(Color.YELLOW);
    l3.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l3);

    JLabel l4 = new JLabel(pack[3]);
    l4.setBounds(30, 130, 500, 30);
    l4.setForeground(Color.YELLOW);
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
    
    JLabel l11 = new JLabel(pack[10]);       //Day 7
    l11.setBounds(30, 410, 900, 30);
    l11.setForeground(Color.WHITE);
    l11.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l11);

    JLabel l12 = new JLabel(pack[11]);       //price
    l12.setBounds(750, 470, 500, 30);
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
                else{
                    setVisible(false);
                }
    }
    public static void main(String[] args){
        new Bangalore_Packages("");
    }
}

