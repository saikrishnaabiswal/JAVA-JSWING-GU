import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JApplet implements ActionListener{
    JFrame frame;
    JTextField text;
    JButton[] num= new JButton[10];
    JButton[] fun= new JButton[9];
    JButton add,sub,mul,div;
    JButton dec,equ,del,clr,neg;
    JPanel panel;
    
    Font my = new Font("TimesRoman",Font.BOLD,30);
    double n1=0,n2=0,res=0;
    char op;
    public void init()
    {
        frame.setBackground(Color.yellow);
    }
    
  Calculator(){
      
      frame = new JFrame("Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(420,550);
      frame.setLayout(null);
      frame.setBackground(Color.yellow);
      
      text = new JTextField();
      text.setBounds(50,25,300,50);
      text.setFont(my);
      text.setEditable(false);
      add =new JButton("+");
      sub=new JButton("-");
      mul=new JButton("*");
      div=new JButton("/");
      dec=new JButton(".");
      equ=new JButton("=");
      del=new JButton("DEL");
      clr=new JButton("CLR");
      neg = new JButton("(+/-)");
      fun[0]=add;
      fun[1]=sub;
      fun[2]=mul;
      fun[3]=div;
      fun[4]=dec;
      fun[5]=equ;
      fun[6]=del;
      fun[7]=clr;
      fun[8]=neg;
      for(int i=0;i<9;i++){
          fun[i].addActionListener(this);
          fun[i].setFont(my);
          fun[i].setFocusable(false);
      }
        for(int i=0;i<10;i++){
         num[i]=new JButton(String.valueOf(i));
          num[i].addActionListener(this);
          num[i].setFont(my);
          num[i].setFocusable(false);
      }
        neg.setBounds(50,430,100,50);
        del.setBounds(150,430,100,50);
         clr.setBounds(250,430,100,50);
         panel =new JPanel();
         panel.setBackground(Color.yellow);
         panel.setBounds(50,100,300,300);
         panel.setLayout(new GridLayout(4,4,10,10));
         //frame.setBackground(Color.MAGENTA);
         panel.setBackground(Color.CYAN);
         frame.setBackground(Color.CYAN);
         text.setBackground(Color.WHITE);
         panel.add(num[1]);
         panel.add(num[2]);
         panel.add(num[3]);
         panel.add(add);
         panel.add(num[4]);
         panel.add(num[5]);
         panel.add(num[6]);
         panel.add(sub);
         panel.add(num[7]);
         panel.add(num[8]);
         panel.add(num[9]);
         panel.add(mul);
          panel.add(dec);
         panel.add(num[0]);
         panel.add(equ);
         panel.add(div);
          
         frame.add(panel);
         frame.add(del);
         frame.add(clr);
         frame.add(neg);
         frame.setBackground(Color.yellow);
      
      frame.add(text);
      
      frame.setVisible(true);
  }
  
    public static void main(String[] args) {
       Calculator calc =new Calculator();
    }
   public void actionPerformed(ActionEvent e)
{
    for(int i=0;i<10;i++)
    {
        if(e.getSource()== num[i])
        {
            text.setText(text.getText().concat(String.valueOf(i)));
        }
}
    if(e.getSource()==dec)
    {
         text.setText(text.getText().concat("."));
    }
    if(e.getSource()==add)
    {
        n1 = Double.parseDouble(text.getText());
        op ='+';
        text.setText("");
    }
        if(e.getSource()==sub)
    {
        n1 = Double.parseDouble(text.getText());
        op ='-';
        text.setText("");
    }
        if(e.getSource()==mul)
    {
        n1 = Double.parseDouble(text.getText());
        op ='*';
        text.setText("");
    }
        if(e.getSource()==div)
    {
        n1 = Double.parseDouble(text.getText());
        op ='/';
        text.setText("");
    }
    if(e.getSource()==equ)
    {
        n2=Double.parseDouble(text.getText());
        switch(op){
            case '+':res=n1+n2;
                        break;
            case '-':res=n1-n2;
                        break;
            case '*':res=n1*n2;
                        break; 
            case '/':res=n1/n2;
                        break;                        
        }
        text.setText(String.valueOf(res));
        n1=res;
    }
            if(e.getSource()==clr)
    {
      
        text.setText("");
    }
             if(e.getSource()==del)
    {
      String s=text.getText();
        text.setText("");
        for(int i=0;i<s.length()-1;i++)
        {
            text.setText(text.getText()+s.charAt(i));
        }
    }
             if(e.getSource()==neg)
             {
                 double t= Double.parseDouble(text.getText());
                 t*=-1;
                 text.setText(String.valueOf(t));
             } 
}
}

