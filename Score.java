import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    String name ;
    int sc ;

    Score(String name,int sc)
    {
        this.name = name ;
        this.sc = sc ;

        getContentPane().setBackground(Color.WHITE);

        ImageIcon emojiIcon = new ImageIcon("quiz5.gif");
        JLabel emoji = new JLabel(emojiIcon);
        emoji.setBounds(500,20,500,500);
        add(emoji);

        JLabel heading =  new JLabel("ThankYou"+" "+name);
        heading.setBounds(100,50,500,40);
        heading.setFont(new Font("Thaoma", Font.BOLD,30));
        add(heading);

        JLabel score =  new JLabel("Your Score is "+sc);
        score.setBounds(20,150,500,40);
        score.setFont(new Font("Thaoma", Font.BOLD,30));
        add(score);

        JButton b = new JButton("Play Again") ;
        b.setBounds(30, 230,200,30);
        b.setBackground(Color.BLUE.darker());
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        add(b);

        setLayout(null);
        setBounds(200,150,1000,700);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        setVisible(false);
        new Login();
    }

    public static void main(String[]args)
    {
        new Score("username",0);
    }
    
}
