package gui1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener{
    
    JLabel lInfo;
    JButton bShowGreetings;
    JTextField tfName;
    
    Window(){
        setTitle("Witaj");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        lInfo = new JLabel("Proszę wpisać imię:");
        lInfo.setSize(150, 20);
        lInfo.setLocation(10, 25);
        add(lInfo);
        
        tfName = new JTextField();
        tfName.setSize(130, 20);
        tfName.setLocation(170, 25);
        add(tfName);
        
        bShowGreetings = new JButton("Wciśnij mnie :)");
        bShowGreetings.setSize(150, 65);
        bShowGreetings.setLocation(50, 80);
        bShowGreetings.addActionListener(this);
        add(bShowGreetings);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Witaj " + tfName.getText().trim(),"Witaj!", JOptionPane.OK_OPTION);
    }
    
}
