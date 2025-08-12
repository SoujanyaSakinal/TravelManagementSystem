package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*; 

public class ViewBookedHotel extends JFrame implements ActionListener{
    
    JButton back;
    ViewBookedHotel(String username){
        setUndecorated(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setBounds(300,150,950,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("View Booked Hotel Details");
        text.setFont(new Font("Tahoma",Font.BOLD,25));
        text.setForeground(Color.BLUE);
        text.setBounds(60,10,400,30);
        add(text);
        
        JLabel lblusername = new JLabel("Username:");
        lblusername.setBounds(30,50,150,50);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,50);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelusername);
        
        JLabel lblpackage = new JLabel("Hotel Name:");
        lblpackage.setBounds(30,90,150,50);
        lblpackage.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblpackage);
        
        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220,90,150,50);
        labelpackage.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelpackage);
        
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(30,130,150,50);
        lblpersons.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblpersons);
        
        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220,130,150,50);
        labelpersons.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelpersons);
        
         JLabel lbldays = new JLabel("Total Days");
        lbldays.setBounds(30,170,150,50);
        lbldays.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lbldays);
        
        JLabel labeldays = new JLabel();
        labeldays.setBounds(220,170,150,50);
        labeldays.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labeldays);
        
        JLabel lblac = new JLabel("AC/Non-AC");
        lblac.setBounds(30,210,150,50);
        lblac.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblac);
        
        JLabel labelac = new JLabel();
        labelac.setBounds(220,210,150,50);
        labelac.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelac);
        
         JLabel lblfood = new JLabel("Food Included ?");
        lblfood.setBounds(30,250,150,50);
        lblfood.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblfood);
        
        JLabel labelfood = new JLabel();
        labelfood.setBounds(220,250,150,50);
        labelfood.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelfood);
        
        JLabel lblname = new JLabel("ID");
        lblname.setBounds(30,290,150,50);
        lblname.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblname);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220,290,150,50);
        labelid.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,330,150,50);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblnumber);
        
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,330,300,50);
        labelnumber.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelnumber);
        
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30,370,150,50);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220,370,150,50);
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelphone);
        
        JLabel lblprice = new JLabel("Total Cost");
        lblprice.setBounds(30,410,150,50);
        lblprice.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblprice);
        
        JLabel labelprice = new JLabel();
        labelprice.setBounds(220,410,150,50);
        labelprice.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelprice);
        
      
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(140,460,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = il.getImage().getScaledInstance(550, 520, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 0, 550, 520);
        add(image);
        
        try{
            Conn c=new Conn();
            String query="select *from bookhotel where username = '"+username+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelpackage.setText(rs.getString("name"));
                labelpersons.setText(rs.getString("persons"));
                labelphone.setText(rs.getString("phone"));
                labelprice.setText(rs.getString("price"));
                labelfood.setText(rs.getString("food"));
                labelac.setText(rs.getString("ac"));
                labeldays.setText(rs.getString("days"));
            }
                 
        }
        catch(Exception e){
            e.getStackTrace();
        }

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args){
        new ViewBookedHotel("souj");
    }
}
