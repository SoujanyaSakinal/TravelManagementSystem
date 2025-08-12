package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class BookPackage extends JFrame implements ActionListener{
    
    String username;
    Choice cpackage,cdestination;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice,labeldate;
    JButton checkprice,bookpackage,back;
    JTextField tfpersons;
    ButtonGroup bg;
    JRadioButton date1,date2;
    
    BookPackage(String username){
        
        this.username=username;
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBounds(220,50,1080,750);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("BOOK PACKAGE");
        text.setBounds(100,10,600,50);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Tahoma",Font.BOLD,40));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,100,200,20);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(250,100,100,20);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelusername);
                 
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(40,150,150,20);
        lblid.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblid);
        
        labelid = new JLabel();
        labelid.setBounds(250,150,150,20);
        labelid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelid);
        
        JLabel lblnumber = new JLabel("Id Number");
        lblnumber.setBounds(40,200,150,20);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblnumber);
        
        labelnumber = new JLabel();
        labelnumber.setBounds(250,200,120,20);
        labelnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40,250,150,20);      
        lblphone.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(250,250,200,20);      
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelphone);
        
        JLabel lbldestination = new JLabel("Select Your Destination");
        lbldestination.setBounds(40,300,200,20);
        lbldestination.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbldestination);
        
        cdestination=new Choice();
        cdestination.add("Goa");
        cdestination.add("Bangalore");
        cdestination.add("Kerala");
        cdestination.setFont(new Font("Tahoma",Font.BOLD,16));
        cdestination.setBounds(250,300,150,25);
        add(cdestination);
        
        JLabel lblpackage = new JLabel("Select Package");
        lblpackage.setBounds(40,350,150,20);
        lblpackage.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblpackage);
        
        cpackage=new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setFont(new Font("Tahoma",Font.BOLD,14));
        cpackage.setBounds(250,350,200,25);
        add(cpackage);
       
        labeldate = new JLabel("Select The Date");   //Date Selection
                labeldate.setBounds(40,400,250,20);
                labeldate.setFont(new Font("Verdana", Font.BOLD, 16));
                add(labeldate);

                date1 = new JRadioButton("15th May 2025");
                date1.setBounds(250,400,160,25);
                date1.setFont(new Font("Verdana", Font.PLAIN, 16));
                date1.setBackground(Color.WHITE);
                add(date1);

                date2 = new JRadioButton("3rd June 2025");
                date2.setBounds(250,430,160,25);
                date2.setFont(new Font("Verdana", Font.PLAIN, 16));
                date2.setBackground(Color.WHITE);
                add(date2);

                bg = new ButtonGroup();
                bg.add(date1);
                bg.add(date2);

        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(40,480,150,20);
        lblpersons.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblpersons);
        
        tfpersons =new JTextField();
        tfpersons.setBounds(250,480,200,25);
        add(tfpersons);
       
       
        JLabel lbltotal = new JLabel("Total Price");       
        lbltotal.setBounds(40,530,150,20);
        lbltotal.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbltotal);
        
        labelprice = new JLabel();
        labelprice.setBounds(250,530,200,20);
        labelprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelprice);
        
        try{
            Conn c=new Conn();
            String query="select *from customer where username = '"+username+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
               
            }
                 
        }
        catch(Exception e){
            e.getStackTrace();
        }
        
        checkprice =new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(100,580,130,30);
        checkprice.addActionListener(this);
        add(checkprice);

        bookpackage =new JButton("Book Package");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(260,580,130,30);
        bookpackage.addActionListener(this);
        add(bookpackage);
        
        back =new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(175,640,130,30);
        back.addActionListener(this);
        add(back);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = il.getImage().getScaledInstance(650, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500,0, 650, 750);
        add(image);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==checkprice){
            String pack=cpackage.getSelectedItem();
            int cost=0;
            
            if(pack.equals("Gold Package")){
                cost+=15000;
            }else if(pack.equals("Silver Package")){
                cost+=12000;
            }else{
                cost+=10000;
            }
            
            int persons = Integer.parseInt(tfpersons.getText());
            cost *=persons;
            labelprice.setText("Rs."+cost);
        }
        else if (ae.getSource()==bookpackage){
            String date = null;
            if (date1.isSelected()) {
                date = "15th May 2025";
            } else {
                date = "3rd June 2025";
            }
            try{
                Conn c= new Conn();
                c.s.executeUpdate("insert into finalbook values('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+cdestination.getSelectedItem()+"','"+tfpersons.getText()+"','"+date+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
                setVisible(false);
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }
        else{
            dispose();
            new CheckPackage(username).setVisible(true); 
        }
    }
    
     public static void main(String[] args){
        new BookPackage("Koustubh_06");
    }
}
