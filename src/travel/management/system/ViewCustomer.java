
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*; 

public class ViewCustomer extends JFrame implements ActionListener{
    
    JButton back;
    ViewCustomer(String username){
        setUndecorated(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setBounds(330,120,870,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel lblusername = new JLabel("Username:");
        lblusername.setBounds(80,50,150,50);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,50);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelusername);
        
        JLabel lblid = new JLabel("ID:");
        lblid.setBounds(80,110,150,50);
        lblid.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220,110,150,50);
        labelid.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelid);
        
        JLabel lblnumber = new JLabel("ID Number:");
        lblnumber.setBounds(80,170,150,50);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblnumber);
        
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,170,150,50);
        labelnumber.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelnumber);
        
        JLabel lblname = new JLabel("Name:");
        lblname.setBounds(80,230,150,50);
        lblname.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblname);
        
        JLabel labelname = new JLabel();
        labelname.setBounds(220,230,150,50);
        labelname.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelname);
        
        JLabel lblemail = new JLabel("Email:");
        lblemail.setBounds(80,290,150,50);
        lblemail.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblemail);
        
        JLabel labelemail = new JLabel();
        labelemail.setBounds(220,290,300,50);
        labelemail.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelemail);
        
        
        JLabel lblcountry = new JLabel("Country:");
        lblcountry.setBounds(460,50,150,50);
        lblcountry.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblcountry);
        
        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(600,50,150,50);
        labelcountry.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelcountry);
        
        JLabel lbladdress = new JLabel("Address:");
        lbladdress.setBounds(460,110,150,50);
        lbladdress.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lbladdress);
        
        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(600,110,150,50);
        labeladdress.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labeladdress);
        
        JLabel lblphone = new JLabel("Phone:");
        lblphone.setBounds(460,170,150,50);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(600,170,150,50);
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelphone);
        
        JLabel lblgender = new JLabel("Gender:");
        lblgender.setBounds(460,230,150,50);
        lblgender.setFont(new Font("Tahoma",Font.BOLD,18));
        add(lblgender);
        
        JLabel labelgender = new JLabel();
        labelgender.setBounds(600,230,150,50);
        labelgender.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelgender);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = il.getImage().getScaledInstance(700, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(70, 400, 700, 200);
        add(image);
        
        try{
            Conn c=new Conn();
            String query="select *from customer where username = '"+username+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelcountry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
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
        new ViewCustomer("");
    }
}
