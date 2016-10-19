package com.com.Calculator;

/**
 * Created by shane on 19/10/2016.
 */


import javax.swing.*;

public class CalculatorView extends JFrame {


    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    CalculatorView() {


        // Sets up the view and adds the components


        JPanel calcPanel = new JPanel();


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(600, 200);


        calcPanel.add(firstNumber);

        calcPanel.add(additionLabel);

        calcPanel.add(secondNumber);

        calcPanel.add(calculateButton);

        calcPanel.add(calcSolution);


        this.add(calcPanel);

        
    }




}
