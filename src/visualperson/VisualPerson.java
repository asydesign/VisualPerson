/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualperson;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author fmi
 */
public class VisualPerson extends JFrame{ 

    /**
     * @param args the command line arguments
     */
    PersonHashMap myMap = new PersonHashMap();
    JTextField fNameField = new JTextField("first name",20);
    JTextField lNameField = new JTextField("last name",20);
    JTextField ageField = new JTextField("age",20);
    JTextField mailField = new JTextField("mail",20);
    String [] comboContent = {"","Male","Female"};
    JComboBox genderCombo = new JComboBox(comboContent);
    JButton addButton = new JButton ("Add");
    JButton printButton = new JButton ("Print");
    JButton printAllButton = new JButton ("Print All");
    
    public VisualPerson(){
        super();
        init();
    }
    public void init(){
        this.setSize(300, 300);
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.add(fNameField);//pravi gi vidimi
        this.add(lNameField);
        this.add(ageField);
        this.add(mailField);
        this.add(genderCombo);
        this.add(addButton);
        this.add(printButton);
        this.add(printAllButton);
        addButton.addActionListener(new AddAction());
        printButton.addActionListener(new PrintAction());
        printAllButton.addActionListener(new PrintAllAction());
        
    }
    public void clearForm(){
        fNameField.setText("");
        lNameField.setText("");
        ageField.setText("");
        mailField.setText("");
        genderCombo.setSelectedIndex(0);
    }
    
    class AddAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String fName = fNameField.getText();
            String lName = lNameField.getText();
            String mail = mailField.getText();
            
            char gender;
            int age = Integer.parseInt(ageField.getText());
            int index = genderCombo.getSelectedIndex();
            if(index == 1){
                gender = 'm';
            }else{
                gender = 'f';
            }
            Person temp = new Person (fName, lName, gender, age, mail);
            myMap.addPerson(temp);
            myMap.printPerson(mail);
            //clearForm();
        }
        
    }
    class PrintAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String mail = mailField.getText();
            myMap.printPerson(mail);
            //clearForm();
        }
        
    }
    class PrintAllAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
           
           myMap.printAllPerson();
            //clearForm();
          
        }
        
    }
    
    public static void main(String[] args) {
        VisualPerson myFrame = new VisualPerson();
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
