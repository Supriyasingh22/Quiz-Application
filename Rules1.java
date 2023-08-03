import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

public class Rules1 extends JFrame implements ActionListener {
    String name ;
    JButton  b1 ,b2;
    Rules1(String name)
    {   
        this.name = name ;

        JLabel l1 = new JLabel(" Rules To be Followed..");
        l1.setBounds(250,30,500,40);
        l1.setFont(new Font("viner Hand ITC", Font.BOLD,40));//viner hand ITC needs to be installed where code is running 
        l1.setForeground(Color.BLACK.darker().darker());
        add(l1); //this add to the frame 

        JLabel rules = new JLabel();
        rules.setBounds(100,90,700,400);
        rules.setFont(new Font("Tahona",Font.PLAIN,16));
        rules.setText(

        "<html>"+ 
        "1. Provide precise answers; this is a programming quiz." + "<br><br>" +
        "2. Answer all questions; none are optional." + "<br><br>" +
        "3. Avoid distractions; no unnecessary interactions with others." + "<br><br>" +
        "4. Stay calm; don't be discouraged by others' progress." + "<br><br>" +
        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
        "6. Prepare for a challenging quiz" + "<br><br>" +
        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
        "8. Strive to surpass your knowledge limit; best of luck!" + "<br><br>" +
    "<html>"
        );
        add(rules);

        b1 = new JButton("Back");
        b1.setBounds(450,500,100,40);
        b1.setBackground(Color.BLUE.darker());
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);//this tells that something happend on thisi buttoon 
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(590,500,100,40);
        b2.setBackground(Color.BLUE.darker());
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);


        setLayout(null);
        setSize(800,650);
        setLocation(300,150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== b1)
        {
            setVisible(false);
            new Login();

        }else if(e.getSource()==b2)
        {
            setVisible(false);
            new Quiz(name);
            
        }
    }
    public static void main(String[] args)
    {
        new Rules1("username");
    }


    
}
