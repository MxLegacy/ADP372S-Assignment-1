package za.ac.cput;

/*
* Author @Michael Alex Dirks
* Student Number: 218306083
* CPUT: Applications Development third year
*
*
* */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.junit.jupiter.api.Assertions;

public class Calculator implements ActionListener {
    public static String add = "+";
    public static String sub = "-";
    public static String div = "/";
    public static String mul = "*";

    private Frame frame;
    private TextField txtField;
    private Button btn9, btn8, btn7, btn6, btn5, btn4,
            btn3, btn2, btn1, btn0, btnMultiplication,
            btnDivision, btnSubtract, btnAdd, btnEqual,
            btnClear;

    private Panel background, panel;
    public Label lblTitle;
    public static Label lblNone1;
    public static Label lblNone2;

    public Calculator()
    {
        frame = new Frame("This is a new frame");

        btn9 = new Button("9");
        btn8 = new Button("8");
        btn7 = new Button("7");
        btn6 = new Button("6");
        btn5 = new Button("5");
        btn4 = new Button("4");
        btn3 = new Button("3");
        btn2 = new Button("2");
        btn1 = new Button("1");
        btn0 = new Button("0");

        btnMultiplication = new Button("X");
        btnAdd = new Button("+");
        btnSubtract = new Button("-");
        btnDivision = new Button("/");
        btnEqual = new Button("=");
        btnClear = new Button("c");

        txtField = new TextField("");
        panel = new Panel();
        background = new Panel();
        lblNone1 = new Label("");
        lblNone2 = new Label("");
        lblTitle = new Label("Calculator!");

    }

    public void setGUI()
    {
        frame.setSize(550, 600);

        background.setLayout(new GridLayout(5,3));
        background.setPreferredSize(new Dimension(250,250));

        panel.setLayout((new GridLayout(3,2)));
        panel.setPreferredSize(new Dimension(100,100));

        frame.add(background, BorderLayout.WEST);
        frame.add(panel, BorderLayout.EAST);

        txtField.setSize(new Dimension(250, 100));
        background.add(txtField, BorderLayout.EAST);
        background.add(lblNone1);
        background.add(lblNone2);

        background.add(btn7, BorderLayout.WEST);
        background.add(btn8, BorderLayout.WEST);
        background.add(btn9, BorderLayout.WEST);

        background.add(btn4, BorderLayout.WEST);
        background.add(btn5, BorderLayout.WEST);
        background.add(btn6, BorderLayout.WEST);

        background.add(btn1, BorderLayout.WEST);
        background.add(btn2, BorderLayout.WEST);
        background.add(btn3, BorderLayout.WEST);

        background.add(btn0, BorderLayout.WEST);


        panel.add(btnAdd);
        panel.add(btnSubtract);
        panel.add(btnMultiplication);
        panel.add(btnDivision);
        panel.add(btnEqual);
        panel.add(btnClear);


        //actoinlistener
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //action listeners
        btnEqual.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiplication.addActionListener(this);
        btnDivision.addActionListener(this);
        btnClear.addActionListener(this);
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

        txtField.setEnabled(false);


        frame.pack();
        frame.show();

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("9")) {
            txtField.setText(txtField.getText() + "9");

        } else if (e.getActionCommand().equals("8")) {
            txtField.setText(txtField.getText() + "8");

        } else if (e.getActionCommand().equals("7")) {
            txtField.setText(txtField.getText() + "7");

        }else if (e.getActionCommand().equals("6")) {
            txtField.setText(txtField.getText() + "6");

        }else if (e.getActionCommand().equals("5")) {
            txtField.setText(txtField.getText() + "5");

        }else if (e.getActionCommand().equals("4")) {
            txtField.setText(txtField.getText() + "4");

        }else if (e.getActionCommand().equals("3")) {
            txtField.setText(txtField.getText() + "3");

        }else if (e.getActionCommand().equals("2")) {
            txtField.setText(txtField.getText() + "2");

        }else if (e.getActionCommand().equals("1")) {
            txtField.setText(txtField.getText() + "1");

        }else if (e.getActionCommand().equals("0")) {
            txtField.setText(txtField.getText() + "0");



        }else if (e.getActionCommand().equals("+")) {
            txtField.setText(txtField.getText() + " + ");

        }else if (e.getActionCommand().equals("-")) {
            txtField.setText(txtField.getText() + " - ");

        }else if (e.getActionCommand().equals("/")) {
            txtField.setText(txtField.getText() + " / ");

        }else if (e.getActionCommand().equals("X")) {
            txtField.setText(txtField.getText() + " * ");

        }else if (e.getActionCommand().equals("=")) {
            calculate();

        }else if (e.getActionCommand().equals("c")) {
            txtField.setText("");

        }
    }

    public void calculate()
    {
        String mainText = txtField.getText();
        String txt1, txt2;

        char check;
        String checkStopText = " ";


        char checkAdd, checkSub, checkDiv, checkMul;
        checkAdd = add.charAt(0);
        checkSub = sub.charAt(0);
        checkMul = mul.charAt(0);
        checkDiv = div.charAt(0);



        int math = 0;
        double answer = 0;
        boolean txtFirstSecond = true;

        char checkStop;

        checkStop = checkStopText.charAt(0);

        txt1 = "";
        txt2 = "";

        for(int i = 0; i < mainText.length(); i++)
        {
            check = mainText.charAt(i);


            if(check == checkStopText.charAt(0))
            {
                  //gets to space and stops

                if(mainText.charAt(i+1) == checkAdd)
                    math = 1;
                if(mainText.charAt(i+1) == checkSub)
                    math = 2;
                if(mainText.charAt(i+1) == checkDiv)
                    math = 3;
                if(mainText.charAt(i+1) == checkMul)
                    math = 4;


                    i = i+2;
                txtFirstSecond = false;
            }else
            {

                if(txtFirstSecond) {
                    txt1 = txt1 + check;
               }else
                {
                    txt2 = txt2 + check;

                }

            }
        }


        switch(math)
        {
            case 1:
                //add
                Assertions.assertEquals(add, "+");
                answer = Integer.parseInt(txt1) + Integer.parseInt(txt2);
                JOptionPane.showMessageDialog(null, "Answer: " + answer);

                break;

            case 2:
                //Subtract
                Assertions.assertEquals(Calculator.sub, "-");
                answer = Integer.parseInt(txt1) - Integer.parseInt(txt2);
                JOptionPane.showMessageDialog(null, "Answer: " + answer);

                break;

            case 3:
                //Divide
                Assertions.assertEquals(Calculator.div, "/");
                answer = Integer.parseInt(txt1) / Integer.parseInt(txt2);
                JOptionPane.showMessageDialog(null, "Answer: " + answer);

                break;

            case 4:
                //Multiply
                Assertions.assertEquals(Calculator.mul, "*");
                answer = Integer.parseInt(txt1) * Integer.parseInt(txt2);
                JOptionPane.showMessageDialog(null, "Answer: " + answer);

                break;

            default:
                //do nothing

                break;
        }
 }


    public TextField getTxtField() {
        return txtField;
    }

    public void setTxtField(TextField txtField) {
        this.txtField = txtField;
    }
}