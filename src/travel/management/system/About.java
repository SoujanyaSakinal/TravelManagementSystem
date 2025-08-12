
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    About() {
        setUndecorated(true);
        setBounds(600, 200, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("About Us");
        l1.setBounds(180, 10, 200, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
        add(l1);

        String s = "1. Introduction / Overview\n" +
                   "Welcome to our Travel and Tourism Management System. Our platform is designed to simplify and enhance the way you plan, book, and manage your travel experiences.\n\n" +

                   "2. Mission Statement\n" +
                   "Our mission is to revolutionize the travel industry by offering a comprehensive, user-friendly system that ensures convenient and seamless travel planning for everyone.\n\n" +

                   "3. What We Offer\n" +
                   "- Customized travel packages\n" +
                   "- Hotel and transport bookings\n" +
                   "- Real-time updates and notifications\n" +
                   "- Secure online transactions\n\n" +

                   "4. Why We're Unique\n" +
                   "- User-centric design with easy navigation\n" +
                   "- Reliable customer support\n" +
                   "- Integration of latest technologies\n" +
                   "- Consistent updates to improve your experience\n\n" +

                   "5. Call to Action\n" +
                   "Join us today and turn your dream vacation into a reality with just a few clicks!";

        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 60, 450, 370);
        area.setFont(new Font("Arial", Font.PLAIN, 14));
        add(area);

        JButton back = new JButton("Back");
        back.setBounds(200, 450, 100, 30);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
       dispose();
    }

    public static void main(String[] args) {
        new About();
    }
}
