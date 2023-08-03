
import javax.swing.*;
import java.awt.*;//color inside awt packet 
import java.awt.event.*;//for enabling click functinlaity of two buttons "rules " and back 

public class Login extends JFrame implements ActionListener{
    JButton b1,b2 ;
    String name ;
    JTextField tf1;

    Login()
    {
        getContentPane().setBackground(Color.WHITE);//getContentPane selects the entire frame and set is color to white 
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("assests/quiz.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);

        //heading

        JLabel heading = new JLabel("Quiz Time");
        heading.setBounds(800,20,300,50);
        heading.setFont(new Font("viner Hand ITC", Font.BOLD,40));//viner hand ITC needs to be installed where code is running 
        heading.setForeground(Color.BLUE.darker().darker());
        add(heading); //this add to the frame 

        //for name 
        JLabel name = new JLabel("Enter your Name");
        name.setBounds(815,110,300,50);
        name.setFont(new Font("viner Hand ITC", Font.BOLD,20));//viner hand ITC needs to be installed where code is running 
        name.setForeground(Color.BLACK.darker().darker());
        add(name); //this add to the frame 

     tf1 = new JTextField();
        tf1.setBounds(750,170,300,30);
        add(tf1);

         b1 = new JButton("Rules");
        b1.setBounds(750,220,80,40);
        b1.setBackground(Color.BLUE.darker());
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);//this tells that something happend on thisi buttoon 
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(970,220,80,40);
        b2.setBackground(Color.BLUE.darker());
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

       setSize(1200,600);//to set frame some size 
       setLocation(150,200) ;// to keep frame at centre 
       setLayout(null);
       setVisible(true);


    }

    //both button upon clicked willcall this fucntion and this fucntion 
    // identify which button has callwd via getSource 

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1) //b1 and b2 needs to be golbaally decalred 
        {   name = tf1.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(e.getSource()==b2)
        {
            setVisible(false);
        }
    }

    public static void main(String[]args)
    {
        new Login();
    }
}