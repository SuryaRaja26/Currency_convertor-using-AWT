package CurrencyConvertor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        convertor obj=new convertor();
    }
}
class convertor implements ActionListener{
    JFrame j=new JFrame("converter");

    JLabel l1,l2,l3;
    JTextField f1,f2;
    JButton b1,b2;


    convertor(){
        l1=new JLabel("Rupees:");
        l2=new JLabel("Dollar:");
        f1=new JTextField(5);
        f2=new JTextField(5);
        b1=new JButton("INR");
        b2=new JButton("Dollar");
        l3=new JLabel("Result");

        j.add(l1);
        j.add(f1);
        j.add(l2);
        j.add(f2);
        j.add(b1);
        j.add(b2);
        j.add(l3);

        l1.setBounds(20, 40, 60, 30);
        l2.setBounds(170, 40, 60, 30);
        f1.setBounds(80, 40, 50, 30);
        f2.setBounds(240, 40, 50, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        j.setVisible(true);
        j.setLayout(new FlowLayout());
        j.setSize(400,400);
    }
    public void actionPerformed(ActionEvent e){
         double value=0;
        int inr=65;
        int dollar=1;
        if(e.getSource()==b1){
            value=inr*(Double.parseDouble(f2.getText()));
            l3.setText(value+" RS");

        }
        else if(e.getSource()==b2){
            value=Double.parseDouble(f1.getText())/inr;
            l3.setText(value+" DLR");
        }

    }


}
