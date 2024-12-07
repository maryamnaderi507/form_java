import javafx.scene.effect.Blend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;



public class Form implements ActionListener {
    JFrame form;
    JButton signupButton;
    JTextField nameText;
    JTextField firstAddress;
    JTextField SecondAddress;
    JTextField ageField;
    JTextField heightField;
    JTextField weightField;
    private int limit;
    public void setupAndShowMainFrame(){

        form = new JFrame();
        form.setVisible(true);
        form.setSize(400,700);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLayout(null);
        form.setBackground(Color.black);
        form.setTitle("فرم ثبت نام");
    }
    public void createButton(){

        signupButton = new JButton("ثبت نام");
        signupButton.setBounds(150,600,80,40);
        form.add(signupButton);

    }
    public void textfields(){

        nameText = new JTextField(3);
        nameText.setBounds(44,66,308,44);
        form.add(nameText);
        nameText.addActionListener(this);


        firstAddress = new JTextField();
        firstAddress.setBounds(44,154,308,44);
        form.add(firstAddress);
        firstAddress.addActionListener(this);

        SecondAddress = new JTextField();
        SecondAddress.setBounds(44,242,308,44);
        form.add(SecondAddress);
        SecondAddress.addActionListener(this);

        ageField = new JTextField();
        ageField.setBounds(44,330,308,44);
        form.add(ageField);
        ageField.addActionListener(this);

        heightField = new JTextField();
        heightField.setBounds(44,418,308,44);
        form.add(heightField);
        heightField.addActionListener(this);

        weightField = new JTextField();
        weightField.setBounds(44,506,308,44);
        form.add(weightField);
        weightField.addActionListener(this);


    }
    public void errorFrame(){
        JFrame error;
        error = new JFrame("error");
        error.setSize(100,50);
        error.setBackground(Color.red);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == nameText){
            System.out.println("name entered");
            nameText.setText(nameText.getText());
            if (nameText.getText().length()<3){
                showMessageDialog(null, "Error");
                nameText.setText("");
            }


        }
        if (e.getSource() == firstAddress){
            System.out.println("first address entered");
            firstAddress.setText(firstAddress.getText());
        }


        if(e.getSource() == SecondAddress){
            System.out.println("second address entered");
            SecondAddress.setText(SecondAddress.getText());
            if (SecondAddress == firstAddress){
                System.out.println("Error");
                SecondAddress.setText("");
                firstAddress.setText("");
            }

        }
        if (e.getSource() == ageField){
            System.out.println("age entered");
            ageField.setText(ageField.getText());
            double age = Double.parseDouble(ageField.getText());
            if (age <18){
                System.out.println("Error");
                ageField.setText("");
            }


        }
        if (e.getSource() == heightField){
            System.out.println("height entered");
            heightField.setText(heightField.getText());
            double height = Double.parseDouble(heightField.getText());
            if (height < 100 ){
                System.out.println("Error");
                heightField.setText("");
            }
        }
        if (e.getSource() == weightField){
            System.out.println("weight entered");
            weightField.setText(weightField.getText());
            double weight = Double.parseDouble(weightField.getText());
            if (weight < 40){
                System.out.println("Error");
                weightField.setText("");
            }

        }
        if (e.getSource() == signupButton){
            System.out.println("signup button entered");
        }

    }





}


