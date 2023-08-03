import  javax.swing.*;
import java.awt.*; 
import javax.swing.border.*;
import java.awt.event.* ;

public class Rules extends JFrame implements ActionListener{
    String name ;
    JButton b1 ;
    Rules(String name)
    {
        this.name = name ;
        getContentPane().setBackground(Color.WHITE);

        JLabel heading = new JLabel(" Welcome "+name);
        heading.setBounds(150,40,400,50);
        heading.setFont(new Font("viner Hand ITC", Font.BOLD,40));//viner hand ITC needs to be installed where code is running 
        heading.setForeground(Color.BLUE.darker().darker());
        add(heading); //this add to the frame 

        JLabel tf2 = new JLabel("to QUIZ");
        tf2.setBounds(250,100,400,50);
        tf2.setFont(new Font("viner Hand ITC", Font.BOLD,40));//viner hand ITC needs to be installed where code is running 
        tf2.setForeground(Color.BLUE.darker().darker());
        add(tf2); //this add to the frame 

        ImageIcon emojiIcon = new ImageIcon("assests/quiz2.gif");
        JLabel emoji = new JLabel(emojiIcon);
        emoji.setBounds(10,200,600,400);
        add(emoji);

        

        b1 = new JButton("Read More..");
        b1.setBounds(550,500,200,50);
        b1.setBackground(Color.BLUE.darker());
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        
        setLayout(null);
        setSize(800,650);
        setLocation(300,150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
        
        new Rules1(name);
        setVisible(false);
        }
    }

   
    

    public static void main(String[]args)
    {
        new Rules("userName");
    }
    
}
