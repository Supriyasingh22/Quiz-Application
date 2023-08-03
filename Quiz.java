import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Quiz extends JFrame implements ActionListener{

    String questions[][]= new String[10][5];//10 questions + columns = 1 quesyion+ 4 options ;
    String answers[][] = new String[10][2];
    String Player_ans[][] = new String[10][1];

     JLabel qno,que;
     JRadioButton opt1,opt2,opt3,opt4 ;
     JButton b1,b2,b3;
     ButtonGroup groupoptions;
     int cnt = 1;
     int count = 0;
     public static int score = 0 ;
     String username ;


     public static int timer = 20;  
     public static int given_ans = 0 ;

  
    Quiz(String username)
    {
        this.username = username;
        getContentPane().setBackground(Color.WHITE);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("assests/quiz4.jpeg"));
        JLabel i1 = new JLabel(image);
        i1.setBounds(0,0,1100,200);
        add(i1);

       qno = new JLabel();
        qno.setBounds(150,300,300,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(qno);

        que = new JLabel();
        que.setBounds(190,300,700,30);
        que.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(que);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";


        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";


       opt1 = new JRadioButton();
       opt1.setBounds(170,350,400,40);
       opt1.setBackground(Color.WHITE);
       opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
       add(opt1);

       opt2 = new JRadioButton();
       opt2.setBounds(170,400,400,40);
       opt2.setBackground(Color.WHITE);
       opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
       add(opt2);

       opt3 = new JRadioButton();
       opt3.setBounds(170,450,400,40);
       opt3.setBackground(Color.WHITE);
       opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
       add(opt3);

       opt4 = new JRadioButton();
       opt4.setBounds(170,500,400,40);
       opt4.setBackground(Color.WHITE);
       opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
       add(opt4);

       //now for grouping these option so that if one get selected other 
    //    deselcted 

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        b1 = new JButton("Next");
        b1.setBounds(150,580,150,40);
        b1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        b1.setBackground(Color.BLUE.darker());
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Hint");
        b2.setBounds(380,580,150,40);
        b2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        b2.setBackground(Color.BLUE.darker());
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Submit");
        b3.setBounds(610,580,150,40);
        b3.setFont(new Font("Tahoma", Font.PLAIN, 22));
        b3.setBackground(Color.BLUE.darker());
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        b3.setEnabled(false);
        add(b3);

        

        start(count);//to dsiplay first question 




        setLayout(null);
        setBounds(50,0,1100,800);
        setVisible(true);

    }

    //Action Listener event 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            repaint();//for new timer in each question we use rapaint()

            //if previously used hint then enable all the options after that 
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            b2.setEnabled(true);

            given_ans=1; //for clicking on next button 

            if(groupoptions.getSelection()==null)   // if no option seleccted 
            {
                Player_ans[count][0] = ""; //set empty string
            }
            else{
                Player_ans[count][0] = groupoptions.getSelection().getActionCommand(); //getActionCommand() tells tha values 
            }

            if(count==8) //if question no. is 9 we will diabled the next button and activate submit buttton 
            {
                b1.setEnabled(false);
                b3.setEnabled(true);

            }
            count++;
           start(count);

        }
        else if(e.getSource()==b2)
        {

            if(count==2 || count==4||count==6||count==8||count == 9)
            {
                opt2.setEnabled(false);
                opt3.setEnabled(false);

            }
            else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            b2.setEnabled(false);

        }
        else{

            given_ans = 1;

              if(groupoptions.getSelection()==null)
                {
                Player_ans[count][0]="";
                }
                else
                {
                    Player_ans[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for(int i = 0 ;i<Player_ans.length;i++)
                {
                    if(Player_ans[i][0].equals(answers[i][1]))
                    {
                        score+=10;
                    }
                }

                setVisible(false);
                // call new class object where score will be dispalyed 
                new Score(username,score);
        }
        
    }


    // for setting timer paint method is used 

    public void paint(Graphics g)
    {
        super.paint(g);

        String time = "Left Time : "+timer+" seconds";// This is graphic to be shown on frame

        g.setColor(Color.RED);

        g.setFont(new Font("Tahoma",Font.BOLD,14));

        if(timer > 0)
        {
            g.drawString(time,850,300);
        }
        else{
            g.drawString("Times Up !!",850,300);// after time is up it must move tonext question 

        }
        timer--;

        try{
            Thread.sleep(1000); //for giving 1 second gap 
            repaint();//calling paint methid 

        }catch(Exception e)
        {
            e.printStackTrace();
        }

        if(given_ans == 1)
        {
            given_ans=0;
            timer = 20 ;
        }
        else if(timer<0)
        {
            timer = 20 ;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            b2.setEnabled(true);

            if(count==8)
            {
                b1.setEnabled(false);
                b3.setEnabled(true);
            }

            if(count==9)
            {
                // when user will not click on submit button it must automatically submit that 

                if(groupoptions.getSelection()==null)
                {
                Player_ans[count][0]="";
                }
                else
                {
                    Player_ans[count][0] = groupoptions.getSelection().getActionCommand();
                }
                

                for(int i = 0 ;i<Player_ans.length;i++)
                {
                    if(Player_ans[i][0].equals(answers[i][1]))
                    {
                        score+=10;
                    }
                    

                }

                setVisible(false);
                // call new class object where score will be dispalyed 
                new Score(username,score);

            }
            else{
            if(groupoptions.getSelection()==null)
            {
                Player_ans[count][0]="";
            }
            else
            {
                Player_ans[count][0] = groupoptions.getSelection().getActionCommand();
            }
            count++;
            start(count);
        }
    }

    }

    

    //  start function to dynamically change the question no. and answers 
    public void  start(int count)
    {
        qno.setText(""+(count+1)+". ");
        que.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();

    }

    public static void main(String[]args)
    {
        new Quiz("username");
    }
}
