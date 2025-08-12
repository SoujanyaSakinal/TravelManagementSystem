package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*; 

public class Kerala_Packages extends JFrame implements ActionListener{
    JButton bookpackage1,bookpackage2,bookpackage3,back;
    String username;
    JPanel textPanel;
    JRadioButton date1, date2;
    ButtonGroup bg;
    JLabel lbldate ;

    Kerala_Packages(String username){
        setUndecorated(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.username=username;
        setBounds(220,50,1080,750);
        
        String[] package1={"GOLD PACKAGE (Kerala)","(6 Days and 7 Nights)","(All Meals Included)","5 Star Hotel Stay","Day 1: Kochi- Fort Kochi,Jew Town, Mattancherry (Dutch) Palace","Day 2: Thiruvananthapuram- Padmanabhaswamy Temple, Chinnar Wildlife Sanctuary(Munnar)","Day 3: Munnar- Attukad Waterfall, Kolukkumalai Tea Estate, Kundala Lake (Boating)","Day 4: Munnar- Eravikulam National Park, Top Station, Lakkam Waterfalls (Trekking) ","Day 5: Alleppey- Check in to the houseboat cruise at the Alleppey backwaters,"," Shikara Boat Ride, Pathiramanal Island (Ideal for BirdWatching)","Day 6: Alleppey- Ambalappuzha Shree Krishna Temple, St.Mary's Forance Church, Coir Village Tour.","15,000/- Per Person"};
        String[] package2 ={"SILVER PACKAGE (Kerala)","(4 Days and 5 Nights)","(All Meals Included)","3 Star Hotel Stay","Day 1: Kochi- Fort Kochi,Jew Town, Mattancherry (Dutch) Palace","Day 2: Thiruvananthapuram- Padmanabhaswamy Temple, Chinnar Wildlife Sanctuary(Munnar)","Day 3: Munnar- Attukad Waterfall, Kolukkumalai Tea Estate, Kundala Lake (Boating)","Day 4: Alleppey- Check in to the houseboat cruise at the Alleppey backwaters, Shikara Boat Ride,","Pathiramanal Island (Ideal for BirdWatching).","","","12,000/- Per Person"};
        String[] package3 ={"BRONZE PACKAGE (Kerala)","(4 Days and 5 Nights)","(All Meals Included)","3 Star Hotel Stay","Day 1: Kochi- Fort Kochi,Jew Town, Mattancherry (Dutch) Palace","Day 2: Thiruvananthapuram- Padmanabhaswamy Temple, Chinnar Wildlife Sanctuary(Munnar)","Day 3: Munnar- Attukad Waterfall, Kolukkumalai Tea Estate","Day 4: Munnar- Eravikulam National Park, Top Station, Lakkam Waterfalls (Trekking).","","","","10,000/- Per Person"};
        
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
    ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icons/keralaBackimgjpg.jpg"));
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
    textPanel.setBackground(new Color(0, 0, 0, 180)); // Black with 150 alpha for transparency
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
    l8.setBounds(30, 290, 950, 30);
    l8.setForeground(Color.WHITE);
    l8.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l8);
    
    JLabel l9 = new JLabel(pack[8]);   //Day 5
    l9.setBounds(30, 330, 900, 30);
    l9.setForeground(Color.WHITE);
    l9.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l9);

    JLabel l10 = new JLabel(pack[9]);   //Day 5
    l10.setBounds(90, 360, 900, 30);
    l10.setForeground(Color.WHITE);
    l10.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l10);
    
    JLabel l13 = new JLabel(pack[10]);   //Day 6
    l13.setBounds(30, 400, 950, 30);
    l13.setForeground(Color.WHITE);
    l13.setFont(new Font("SansSerif", Font.BOLD, 20));
    textPanel.add(l13);
    

    JLabel l11 = new JLabel(pack[11]);       //price
    l11.setBounds(30, 450, 500, 30);
    l11.setBackground(Color.BLUE);
    l11.setForeground(Color.YELLOW);
    l11.setFont(new Font("Tahoma", Font.BOLD, 20));
    textPanel.add(l11);
    
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
        new Kerala_Packages("");
    }
}

