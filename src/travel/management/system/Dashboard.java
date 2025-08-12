package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
	String username;
	JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackage,viewpackage,destinations;
        JButton loginbutton,payments,about,deletePersonalDetails;
	Dashboard (String username) {
            this.username=username;
            
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
                
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0,0,102));
		p1.setBounds(0,0,1600,65);
		add(p1);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
		Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel icon=new JLabel(i3);
		icon.setBounds(5,0,70,70);
		p1.add(icon);
		
		
		JLabel heading=new JLabel("Dashboard");
		heading.setBounds(80,10,300,40);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahona",Font.BOLD,30));
		p1.add(heading);
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,102));
		p2.setBounds(0,65,300,900);
		add(p2);
		
                loginbutton = new JButton("Login/Sign up");
                loginbutton.setBounds(0,0,300,50);
                loginbutton.setBackground(new Color(0,0,102)); 
                loginbutton.setForeground(Color.WHITE);
                loginbutton.setFont(new Font("Tahoma",Font.PLAIN,20));
                loginbutton.setMargin(new Insets(0,0,0,150));
                loginbutton.addActionListener(this);
                p2.add(loginbutton);
                
                addPersonalDetails = new JButton("Add Personal Details");
                addPersonalDetails.setBounds(0,50,300,50);
                addPersonalDetails.setBackground(new Color(0,0,102)); 
                addPersonalDetails.setForeground(Color.WHITE);
                addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
                addPersonalDetails.setMargin(new Insets(0,0,0,90));
                addPersonalDetails.addActionListener(this);
                p2.add(addPersonalDetails);
	    
                updatePersonalDetails = new JButton("Update Personal Details");
		updatePersonalDetails.setBounds(0,100,300,50);
                updatePersonalDetails.setBackground(new Color(0,0,102)); 
                updatePersonalDetails.setForeground(Color.WHITE);
                updatePersonalDetails.setFont(new Font ("Tahoma",Font.PLAIN,20));
                updatePersonalDetails.setMargin(new Insets(0,0,0,65));
                updatePersonalDetails.addActionListener(this);
                p2.add(updatePersonalDetails);
	    
                viewPersonalDetails = new JButton("View Personal Details");
		viewPersonalDetails.setBounds(0,150,300,50);
        	viewPersonalDetails.setBackground(new Color(0,0,102)); 
                viewPersonalDetails.setForeground(Color.WHITE);
                viewPersonalDetails.setFont(new Font ("Tahoma",Font.PLAIN,20));
                viewPersonalDetails.setMargin(new Insets(0,0,0,84));
                viewPersonalDetails.addActionListener(this);
                p2.add(viewPersonalDetails);
	    
                deletePersonalDetails = new JButton("Delete Personal Details");
		deletePersonalDetails.setBounds(0,200,300,50);
                deletePersonalDetails.setBackground(new Color(0,0,102)); 
                deletePersonalDetails.setForeground(Color.WHITE);
                deletePersonalDetails.setFont(new Font ("Tahoma",Font.PLAIN,20));
                deletePersonalDetails.setMargin(new Insets(0,0,0,75));
                deletePersonalDetails.addActionListener(this);
                p2.add(deletePersonalDetails);
	    
	    
                viewpackage = new JButton("Booking History");
                viewpackage.setBounds(0,300,300,50);
                viewpackage.setBackground(new Color(0,0,102)); 
                viewpackage.setForeground(Color.WHITE);
                viewpackage.setFont(new Font ("Tahoma",Font.PLAIN,20));
                viewpackage.setMargin(new Insets(0,0,0,140));
                viewpackage.addActionListener(this);
                p2.add(viewpackage);
	    
                destinations = new JButton("Destinations");
                destinations.setBounds(0,250,300,50);
                destinations.setBackground(new Color(0,0,102)); 
                destinations.setForeground(Color.WHITE);
                destinations.setFont(new Font ("Tahoma",Font.PLAIN,20));
                destinations.setMargin(new Insets(0,0,0,168));
                destinations.addActionListener(this);
                p2.add(destinations);
	    
                payments = new JButton("Payments");
                payments.setBounds(0,350,300,50);
                payments.setBackground(new Color(0,0,102)); 
                payments.setForeground(Color.WHITE);
                payments.setFont(new Font ("Tahoma",Font.PLAIN,20));
                payments.setMargin(new Insets(0,0,0,190));
                payments.addActionListener(this);
                p2.add(payments);
	  
	    
                about = new JButton("About");
                about.setBounds(0,400,300,50);
                about.setBackground(new Color(0,0,102)); 
                about.setForeground(Color.WHITE);
                about.setFont(new Font ("Tahoma",Font.PLAIN,20));
                about.setMargin(new Insets(0,0,0,215));
                about.addActionListener(this);
                p2.add(about);
	    
	    
                ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
                Image i5 =i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
                ImageIcon i6=new ImageIcon(i5);
                JLabel image=new JLabel(i6);
                image.setBounds(0,0,1650,1000);
                add(image);
	    
                JLabel text =new JLabel("GetSetTrip Travels");
                text.setBounds(650,400,1200,70);
                text.setForeground(Color.WHITE);
                text.setFont(new Font("Raleway",Font.PLAIN,55));
                image.add(text);
	    
                setVisible(true);

        }
	public void actionPerformed (ActionEvent ae) {
		if(ae.getSource() == addPersonalDetails) {
                    new AddCustomer(username);
		}
                else if(ae.getSource()==viewPersonalDetails){
                    new ViewCustomer(username);
                }
                else if(ae.getSource()==updatePersonalDetails){
                    new UpdateCustomer(username);
                }
                else if(ae.getSource()==checkpackages){
                    new CheckPackage(username);
                }
                else if(ae.getSource()== bookpackage){
                    new BookPackage(username);
                }
                else if(ae.getSource()== viewpackage){
                    new ViewPackage(username);
                }
                
                else if(ae.getSource()== destinations){
                    new Destinations(username);
                }
              
                else if(ae.getSource()== loginbutton){
                    new Login();
                }
                else if(ae.getSource()== payments){
                    new Payment();
                }   
                else if(ae.getSource()== about){
                    new About();
                } 
                else if(ae.getSource()== deletePersonalDetails){
                    new DeleteDetails(username);
                }
	}
    public static void main(String[] args) {
        new Dashboard("");
}
}





