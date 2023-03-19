import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calci extends JApplet implements ActionListener{
    JLabel j1,j2,j3;
    JTextField f1,f2,f3;
    JButton b1,b2,b3,b4;
    public void init()
    {
        try
        {
          SwingUtilities.invokeAndWait(new Runnable(){
              public void run()
              {
                  MakeGUI();
              }
          });
        }
        catch(Exception e)
        {
            System.out.println("Can't be performed because"+e);
        }
    }
    public void MakeGUI()
    {
        setLayout(new GridLayout(5,2));
        j1=new JLabel("enter  a");
        add(j1);
        f1 = new JTextField(10);
        add(f1);
        j2=new JLabel("enter  b");
        add(j2);
        f2 = new JTextField(10);
        add(f2);
        j3=new JLabel("Result");
        add(j3);
        f3 = new JTextField(10);
        f3.setEditable(false);
        add(f3);
        b1= new JButton("+");
        b1.setActionCommand("+");
        b1.addActionListener(this);
        add(b1);
        b2= new JButton("-");
        b2.setActionCommand("-");
        b2.addActionListener(this);
        add(b2);
        b3= new JButton("*");
        b3.setActionCommand("*");
        b3.addActionListener(this);
        add(b3);
        b4= new JButton("/");
        b4.setActionCommand("/");
        b4.addActionListener(this);
        add(b4);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String ch=ae.getActionCommand();
        double a= Double.parseDouble(f1.getText());
        double b= Double.parseDouble(f2.getText());
        double ans = 0;
        switch(ch)
        {
            case "+":ans=a+b;
                    break;
            case "-":ans=a-b;
                    break;
            case "*":ans=a*b;
                    break;
            case "/":ans=a/b;
                    break;
        }
        
        f3.setText(ans+" ");
    }
}
