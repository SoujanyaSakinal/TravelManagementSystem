package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.table.JTableHeader;

public class ViewPackage extends JFrame {

    ViewPackage(String username) {
        setUndecorated(true);
        setTitle("Your Booking History");
        setBounds(220,50,1080,720);
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columnNames = {"Package Name", "Destination", "Price", "Booking Date"};
        String[][] data = fetchBookingData(username);

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        table.setRowHeight(70);
        table.setFont(new Font("SansSerif", Font.PLAIN, 20)); 
        table.setBackground(new Color(245, 245, 245)); 
        table.setForeground(Color.BLACK); 
        table.setGridColor(Color.LIGHT_GRAY); // Grid line color
        table.setSelectionBackground(new Color(173, 216, 230)); // Selected row color
        table.setSelectionForeground(Color.BLACK); 
      
        
        // Optional: Make column headers bold and larger
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("SansSerif", Font.BOLD, 20));
        header.setBackground(new Color(200, 200, 255));
        
        setVisible(true);
    }

    public String[][] fetchBookingData(String username) {
        String[][] data = new String[10][5]; // assuming max 10 bookings
        int row = 0;

            try {
            Connection c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root", "sv_2308");
            String q = "SELECT package, destination, price, date FROM finalbook WHERE username = '"+username+"'";
            PreparedStatement ps = c.prepareStatement(q);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                data[row][0] = rs.getString("package");
                data[row][1] = rs.getString("destination");
                data[row][2] = rs.getString("price");
                data[row][3] = rs.getString("date");
                row++;
            }

            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return data;
    }

    public static void main(String[] args) {
        new ViewPackage("");
    }
}


