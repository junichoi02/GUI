package javaapplication10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class ListenerSample extends JFrame
{
    ListenerSample()
    {
        this.setTitle("Create Action Event Listener");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create a button component and then attatch(?) ActionListener.
        JButton btn = new JButton("Juni");
        MyActionListener listener = new MyActionListener();
        btn.addActionListener(listener);
        
        add(btn);//put button on a contentpane.
        
        this.setSize(300,150);
        this.setVisible(true);
    }
}

//Inherit the ActionListener and create the Action Listener..
class MyActionListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        JButton b = (JButton)e.getSource();//Identify the selected button.
        
        //If the string of the button is "Juni," replace it with "Choi" or "Juni" again..
        if(b.getText().equals("Juni"))
            b.setText("Choi");
        else
            b.setText("Juni");
    }
}
public class JavaApplication10 
{

    public static void main(String[] args) 
    {
        new ListenerSample();
    }
    
}
