package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame  implements ActionListener{
    
    String username;
    JButton addpersonalDetails,updatepersonalDetails, viewpersonalDetails, checkpackages, bookpackages;
    JButton viewpackages,viewhotels, destinations, bookhotel, viewbookedhotel, payments, about;
    JButton deletepersonaldetails;
    
    Dashboard(String username){
       this.username = username;
 //    setBounds(0, 0, 1600, 1000);
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       setLayout(null);
       
       
       JPanel p1 = new JPanel();
       p1.setLayout(null);
       p1.setBackground(new Color(0, 0, 102));
       p1.setBounds(0, 0, 1600, 65);
       add(p1);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
       Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(5, 0, 70, 70);
       p1.add(icon);
       
       JLabel heading = new JLabel("Dashboard");
       heading.setBounds(80, 10, 300, 40);
       heading.setForeground(Color.white);
       heading.setFont(new Font("Tahoma", Font.BOLD, 30));
       p1.add(heading);
       
       JPanel p2 = new JPanel();
       p2.setLayout(null);
       p2.setBackground(new Color(0, 0, 102));
       p2.setBounds(0, 65, 300, 900);
       add(p2);
       
       addpersonalDetails = new JButton("Add Personal Details");
       addpersonalDetails.setBounds(0, 0, 300, 50);
       addpersonalDetails.setBackground(new Color(0,0, 102));
       addpersonalDetails.setForeground(Color.white);
       addpersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
       addpersonalDetails.setMargin(new Insets(0, 0, 0, 60));
       addpersonalDetails.addActionListener(this);
       p2.add(addpersonalDetails);
       
       updatepersonalDetails = new JButton("Update Personal Details");
       updatepersonalDetails.setBounds(0, 50, 300, 50);
       updatepersonalDetails.setBackground(new Color(0,0, 102));
       updatepersonalDetails.setForeground(Color.white);
       updatepersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
       updatepersonalDetails.setMargin(new Insets(0, 0, 0, 30));
       updatepersonalDetails.addActionListener(this);
       p2.add(updatepersonalDetails);
       
       viewpersonalDetails = new JButton("View Personal Details");
       viewpersonalDetails.setBounds(0, 100, 300, 50);
       viewpersonalDetails.setBackground(new Color(0,0, 102));
       viewpersonalDetails.setForeground(Color.white);
       viewpersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
       viewpersonalDetails.setMargin(new Insets(0, 0, 0, 50));
       viewpersonalDetails.addActionListener(this);
       p2.add(viewpersonalDetails);
       
       deletepersonaldetails = new JButton("Delete Personal Details");
       deletepersonaldetails.setBounds(0, 150, 300, 50);
       deletepersonaldetails.setBackground(new Color(0,0, 102));
       deletepersonaldetails.setForeground(Color.white);
       deletepersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
       deletepersonaldetails.setMargin(new Insets(0, 0, 0, 40));
       deletepersonaldetails.addActionListener(this);
       p2.add(deletepersonaldetails);
       
       checkpackages = new JButton("Check Packages");
       checkpackages.setBounds(0, 200, 300, 50);
       checkpackages.setBackground(new Color(0,0, 102));
       checkpackages.setForeground(Color.white);
       checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
       checkpackages.setMargin(new Insets(0, 0, 0, 110));
       checkpackages.addActionListener(this);
       p2.add(checkpackages);
       
       bookpackages = new JButton("Book Packages");
       bookpackages.setBounds(0, 250, 300, 50);
       bookpackages.setBackground(new Color(0,0, 102));
       bookpackages.setForeground(Color.white);
       bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
       bookpackages.setMargin(new Insets(0, 0, 0, 120));
       bookpackages.addActionListener(this);
       p2.add(bookpackages);
       
       viewpackages = new JButton("View Packages");
       viewpackages.setBounds(0, 300, 300, 50);
       viewpackages.setBackground(new Color(0,0, 102));
       viewpackages.setForeground(Color.white);
       viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
       viewpackages.setMargin(new Insets(0, 0, 0, 120));
       viewpackages.addActionListener(this);
       p2.add(viewpackages);
       
       viewhotels = new JButton("View Hotels");
       viewhotels.setBounds(0, 350, 300, 50);
       viewhotels.setBackground(new Color(0,0, 102));
       viewhotels.setForeground(Color.white);
       viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
       viewhotels.setMargin(new Insets(0, 0, 0, 145));
       viewhotels.addActionListener(this);
       p2.add(viewhotels);
       
       bookhotel = new JButton("Book Hotel");
       bookhotel.setBounds(0, 400, 300, 50);
       bookhotel.setBackground(new Color(0,0, 102));
       bookhotel.setForeground(Color.white);
       bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
       bookhotel.setMargin(new Insets(0, 0, 0, 150));
       bookhotel.addActionListener(this);
       p2.add(bookhotel);
       
       viewbookedhotel = new JButton("View Booked Hotel");
       viewbookedhotel.setBounds(0, 450, 300, 50);
       viewbookedhotel.setBackground(new Color(0,0, 102));
       viewbookedhotel.setForeground(Color.white);
       viewbookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
       viewbookedhotel.setMargin(new Insets(0, 0, 0, 85));
       viewbookedhotel.addActionListener(this);
       p2.add(viewbookedhotel);
       
       destinations = new JButton("Destinations");
       destinations.setBounds(0, 500, 300, 50);
       destinations.setBackground(new Color(0,0, 102));
       destinations.setForeground(Color.white);
       destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
       destinations.setMargin(new Insets(0, 0, 0, 140));
       destinations.addActionListener(this);
       p2.add(destinations);
       
       payments = new JButton("Payments");
       payments.setBounds(0, 550, 300, 50);
       payments.setBackground(new Color(0,0, 102));
       payments.setForeground(Color.white);
       payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
       payments.setMargin(new Insets(0, 0, 0, 160));
       payments.addActionListener(this);
       p2.add(payments);
       
       /*JButton calculators = new JButton("Calculators");
       calculators.setBounds(0, 600, 300, 50);
       calculators.setBackground(new Color(0,0, 102));
       calculators.setForeground(Color.white);
       calculators.setFont(new Font("Tahoma", Font.PLAIN, 20));
       calculators.setMargin(new Insets(0, 0, 0, 145));
       p2.add(calculators);
       
       JButton notepad = new JButton("Notepad");
       notepad.setBounds(0, 650, 300, 50);
       notepad.setBackground(new Color(0,0, 102));
       notepad.setForeground(Color.white);
       notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
       notepad.setMargin(new Insets(0, 0, 0, 155));
       p2.add(notepad);*/
       
       about = new JButton("About");
       about.setBounds(0, 600, 300, 50);
       about.setBackground(new Color(0,0, 102));
       about.setForeground(Color.white);
       about.setFont(new Font("Tahoma", Font.PLAIN, 20));
       about.setMargin(new Insets(0, 0, 0, 195));
       about.addActionListener(this);
       p2.add(about);
       
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
       ImageIcon i6 = new ImageIcon(i5);
       JLabel image = new JLabel(i6);
       image.setBounds(0, 0, 1650, 1000);
       add(image);
       
       JLabel text = new JLabel("Travel and Tourism Management System");
       text.setBounds(400, 70, 1200, 70);
       text.setForeground(Color.black);
       text.setFont(new Font("Raleway", Font.PLAIN, 30));
       image.add(text);
       
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == addpersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource() == viewpersonalDetails) {
            new ViewCustomer(username);
        }else if(ae.getSource() == updatepersonalDetails) {
             new UpdateCustomer(username);
        }else if (ae.getSource() == checkpackages ){
            new CheckPackage();
        }else if(ae.getSource() == bookpackages ){
            new BookPackage(username);
        }else if(ae.getSource() == viewpackages){
            new ViewPackage(username);
        }else if (ae.getSource() == viewhotels){
            new CheckHotels();
        }else if (ae.getSource() == destinations ){
            new Destinations ();
        }else if (ae.getSource() == bookhotel){
            new BookHotel(username);
        }else if (ae.getSource() == viewbookedhotel){
            new ViewBookedHotel(username);
        }else if (ae.getSource() == payments){
            new Payment();
        }else if(ae.getSource() == about){
            new About();
        }else if(ae.getSource() == deletepersonaldetails){
             new DeleteData(username);
        }
            
    }
    
    public static void main(String[] args){
        new Dashboard("takshak");
    }
}

