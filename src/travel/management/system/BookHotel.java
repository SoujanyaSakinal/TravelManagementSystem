package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class BookHotel extends JFrame implements ActionListener{
    
    Choice chotel,cac,cfood;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    JButton checkprice,bookpackage,back;
    JTextField tfpersons,tfdays;
    String username;
    
    BookHotel(String username){
        this.username=username;
        setUndecorated(true);
        setBounds(330,100,900,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("BOOK HOTEL");
        text.setBounds(100,10,300,30);
        text.setFont(new Font("Tahoma",Font.BOLD,30));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,70,200,20);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(250,70,100,20);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelusername);
        
        JLabel lblpackage = new JLabel("Select Hotel");
        lblpackage.setBounds(40,110,150,20);
        lblpackage.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblpackage);
        
        chotel=new Choice();
        chotel.setBounds(250,120,120,30);
        add(chotel);
       
         try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
         
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(40,150,150,25);
        lblpersons.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblpersons);
        
        tfpersons =new JTextField("1");
        tfpersons.setBounds(250,150,120,25);
        add(tfpersons);
        
        JLabel lbldays = new JLabel("Number of Days");
        lbldays.setBounds(40,190,150,25);
        lbldays.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbldays);
        
        tfdays =new JTextField("1");
        tfdays.setBounds(250,190,120,25);
        add(tfdays);
        
        JLabel lblac = new JLabel("AC/ Non-AC");
        lblac.setBounds(40,230,150,20);
        lblac.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblac);
        
        cac=new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250,230,120,30);
        add(cac);
        
        JLabel lblfood = new JLabel("Food Included");
        lblfood.setBounds(40,270,150,20);
        lblfood.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblfood);
        
        cfood=new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,120,30);
        add(cfood);
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(40,300,150,50);
        lblid.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblid);
        
        labelid = new JLabel();
        labelid.setBounds(250,310,200,25);
        labelid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelid);
        
        JLabel lblnumber = new JLabel("Id Number");
        lblnumber.setBounds(40,340,150,50);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblnumber);
        
        labelnumber = new JLabel();
        labelnumber.setBounds(250,350,200,25);
        labelnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40,380,150,50);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(250,390,200,25);
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelphone);
        
        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setBounds(40,420,150,50);
        lbltotal.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbltotal);
        
        labelprice = new JLabel();
        labelprice.setBounds(250,430,200,25);
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
        checkprice.setBounds(60,470,120,25);
        checkprice.addActionListener(this);
        add(checkprice);

        bookpackage =new JButton("Book Hotel");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(200,470,120,25);
        bookpackage.addActionListener(this);
        add(bookpackage);
        
        back =new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(128,510,120,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = il.getImage().getScaledInstance(500, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 0, 500, 600);
        add(image);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==checkprice){
            try{
                Conn c=new Conn();
                ResultSet rs = c.s.executeQuery("select*from hotel where name='"+chotel.getSelectedItem()+"'");
                while(rs.next()){
                    int cost = Integer.parseInt(rs.getString("costperperson"));
                    int food = Integer.parseInt(rs.getString("foodincluded"));
                    int ac = Integer.parseInt(rs.getString("acroom"));
                    
                    int persons = Integer.parseInt(tfpersons.getText());
                    int days = Integer.parseInt(tfdays.getText());
                    
                    String acselected = cac.getSelectedItem();
                    String foodselected = cfood.getSelectedItem();
                    
                    if(persons * days > 0){
                        int total = 0;
                        total += acselected.equals("AC") ? ac : 0;
                        total += foodselected.equals("Yes")? food :0;
                        total += cost;
                        total = total * persons * days;
                        labelprice.setText("Rs."+total);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Please Enter Valid Number");
                    }
                }
            } 
                catch(Exception e){
                    e.printStackTrace();
            }
        }
        else if (ae.getSource()==bookpackage){
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
                
                JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
                setVisible(false);
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }
        else{
            dispose();
        }
    }
    
     public static void main(String[] args){
        new BookHotel("souj");
    }
}

