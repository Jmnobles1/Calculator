package mp3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calc implements ActionListener 
{
    private static final int HORIZONTAL = 0;
    private JFrame frame;
    private JButton Buttonone;
    private JButton Buttontwo; 
    private JButton Buttonthree;
    private JButton Buttonfour;
    private JButton Buttonfive;
    private JButton Buttonsix;
    private JButton Buttonseven;
    private JButton Buttoneight;
    private JButton Buttonnine;
    private JButton addition;
    private JButton subtraction;
    private JButton multiply;
    private JButton divide;
    private JButton ButtonZero;
    private JButton Equal;
    private JButton decimal;
    private JButton plusorminus;
    private JButton clear;
    private JButton xsqrt;
    private JButton sqrt  = new JButton("\u221A");;
    private JButton Cube;
    private JButton modulus;
    private JButton Percent;
    private JButton onedivn;
    
    private JButton cos;
    private JButton tan;
    private JButton sin;
    private JButton asin;
    private JButton atan;
    private JButton acos;
    private JButton hsin;
    private JButton htan;
    private JButton hcos;
    private JButton log;
    private JButton ln;
    private JButton abs;
    private JButton tenupn;
    private JButton exit;
   
    private boolean checkForOperation = false;
    private String text = "";
    private String num1 = "", num2 = "";
    private JTextField input;
    private double result;
    private JTextField calc_result;
    
    public static void main(String[] args)
    {
        Calc cal = new Calc();
    }
    
    
    public Calc() 
    {
        frame = new JFrame("My Calculator");
        
        frame.setSize(357,420);
        
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        frame.setLayout(gbl);
        
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);
        
        
       
        panel.setBounds(0, 0, 343, 30);
        
        Font font = new Font("Times New Roman", Font.PLAIN, 11);
        Color white = Color.white;
        Color blue = Color.green;
        Color red = Color.red;


        
        
        
        gbc.insets = new Insets(1,1,1,1);

        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=6;
        input = new JTextField(30);
        panel.add(input,gbc);
        input.setBackground(blue); 
       
       
        
        gbc.gridx=0;
        gbc.gridheight=1;
        gbc.gridy=1;
        gbc.gridwidth=6;
        calc_result = new JTextField(30);
        panel.add(calc_result,gbc);
        calc_result.setBackground(blue); 
        
        
        
       
        gbc.gridwidth = 1;
        
        gbc.gridx=5;
        gbc.gridy=2;
        clear = new JButton("C");
        panel.add(clear,gbc);
        clear.addActionListener(this);
        clear.setFont(font);   
        clear.setBackground(red); 
        
        
        gbc.gridwidth=1;
        gbc.gridx=5;
        gbc.gridy=3;
        xsqrt = new JButton("x^2");
        panel.add(xsqrt,gbc);
        xsqrt.addActionListener(this);
        xsqrt.setFont(font);   
        xsqrt.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=5;
        gbc.gridy=4;
        Cube = new JButton("x^3");
        panel.add(Cube,gbc);
        
        Cube.addActionListener(this);
        Cube.setFont(font);   
        Cube.setBackground(white); 
        
        
        
        gbc.gridwidth=1;
        gbc.gridx=5;
        gbc.gridy=5;
        modulus = new JButton("Mod");
        panel.add(modulus,gbc);
        
        modulus.addActionListener(this);
        modulus.setFont(font);   
        modulus.setBackground(white); 
        
        
        
        gbc.gridwidth=1;
        gbc.gridx=5;
        gbc.gridy=6;
        
        panel.add(sqrt,gbc);
        
        sqrt.addActionListener(this);
        sqrt.setFont(font);   
        sqrt.setBackground(white); 
        
        
        gbc.gridwidth=1;
        gbc.gridx=3;
        gbc.gridy=6;
        Percent = new JButton("%");
        panel.add(Percent,gbc);
        
        Percent.addActionListener(this);
        Percent.setFont(font);   
        Percent.setBackground(white); 
        
        
        gbc.gridwidth=1;
        gbc.gridx=4;
        gbc.gridy=6;
        onedivn = new JButton("1/n");
        panel.add(onedivn,gbc);
        
        onedivn.addActionListener(this);
        onedivn.setFont(font);   
        onedivn.setBackground(white); 
        
   
        gbc.gridwidth=1;
        gbc.gridx=0;
        gbc.gridy=3;
        Buttonone = new JButton("1");
        panel.add(Buttonone,gbc);
        
        
        Buttonone.addActionListener(this);
        Buttonone.setFont(font);   
        Buttonone.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=3;
        gbc.gridy=4;
        addition = new JButton("+");
        panel.add(addition,gbc);
        addition.addActionListener(this);
        addition.setFont(font);   
        addition.setBackground(white); 
        
        
        gbc.gridwidth=1;
        gbc.gridx=1;
        gbc.gridy=3;
        Buttontwo = new JButton("2");
        panel.add(Buttontwo,gbc);
        
        Buttontwo.addActionListener(this);
        Buttontwo.setFont(font);   
        Buttontwo.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=2;
        gbc.gridy=3;
        Buttonthree = new JButton("3");
        panel.add(Buttonthree,gbc);
        
        Buttonthree.addActionListener(this);
        Buttonthree.setFont(font);   
        Buttonthree.setBackground(white); 
        
        
        
        
        gbc.gridwidth=1;
        gbc.gridx=0;
        gbc.gridy=4;
        Buttonfour = new JButton("4");
        panel.add(Buttonfour,gbc);
        
        Buttonfour.addActionListener(this);
        Buttonfour.setFont(font);   
        Buttonfour.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=1;
        gbc.gridy=4;
        Buttonfive = new JButton("5");
        panel.add(Buttonfive,gbc);
        
        Buttonfive.addActionListener(this);
        Buttonfive.setFont(font);   
        Buttonfive.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=2;
        gbc.gridy=4;
        Buttonsix = new JButton("6");
        panel.add(Buttonsix,gbc);
        
        Buttonsix.addActionListener(this);
        Buttonsix.setFont(font);   
        Buttonsix.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=4;
        gbc.gridy=4;
        subtraction = new JButton("-");
        panel.add(subtraction,gbc);
        
        subtraction.addActionListener(this);
        subtraction.setFont(font);   
        subtraction.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=0;
        gbc.gridy=5;
        Buttonseven = new JButton("7");
        panel.add(Buttonseven,gbc);
        
        Buttonseven.addActionListener(this);
        Buttonseven.setFont(font);   
        Buttonseven.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=1;
        gbc.gridy=5;
        Buttoneight = new JButton("8");
        panel.add(Buttoneight,gbc);
        
        Buttoneight.addActionListener(this);
        Buttoneight.setFont(font);   
        Buttoneight.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=2;
        gbc.gridy=5;
        Buttonnine = new JButton("9");
        panel.add(Buttonnine,gbc);
       
        Buttonnine.addActionListener(this);
        Buttonnine.setFont(font);   
        Buttonnine.setBackground(white); 
        
        gbc.gridx=3;
        gbc.gridy=3;
        multiply = new JButton("x");
        panel.add(multiply,gbc);
        
        multiply.addActionListener(this);
        multiply.setFont(font);   
        multiply.setBackground(white); 
        
        
        gbc.gridwidth=1;
        gbc.gridx=0;
        gbc.gridy=6;
        ButtonZero = new JButton("0");
        panel.add(ButtonZero,gbc);
        
        ButtonZero.addActionListener(this);
        ButtonZero.setFont(font);   
        ButtonZero.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=1;
        gbc.gridy=6;
        decimal = new JButton(".");
        panel.add(decimal,gbc);
        
        decimal.addActionListener(this);
        decimal.setFont(font);   
        decimal.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=2;
        gbc.gridy=6;
        plusorminus = new JButton("+/-");
        panel.add(plusorminus,gbc);
       
        plusorminus.addActionListener(this);
        plusorminus.setFont(font);   
        plusorminus.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=4;
        gbc.gridy=3;
        divide = new JButton("/");
        panel.add(divide,gbc);
        
        divide.addActionListener(this);
        divide.setFont(font);   
        divide.setBackground(white); 
        
        gbc.gridwidth=2;
        gbc.fill = 2;
        gbc.gridx=3;
        gbc.gridy=5;
        Equal = new JButton("=");
        panel.add(Equal,gbc);
        
        Equal.addActionListener(this);
        Equal.setFont(font);   
        Equal.setBackground(white); 
        
        
        
        gbc.gridwidth = 1;
        
        gbc.gridx=0;
        gbc.gridy=10;
        sin = new JButton("sin");
        panel.add(sin,gbc);
        sin.addActionListener(this);
        sin.setFont(font);   
        sin.setBackground(white); 
        
        
        gbc.gridwidth=1;
        gbc.gridx=1;
        gbc.gridy=10;
        cos = new JButton("cos");
        panel.add(cos,gbc);
        
        cos.addActionListener(this);
        cos.setFont(font);   
        cos.setBackground(white); 
        
        gbc.gridwidth=2;
        gbc.gridx=2;
        gbc.gridy=10;
        tan = new JButton("tan");
        panel.add(tan,gbc);
        
        tan.addActionListener(this);
        tan.setFont(font);   
        tan.setBackground(white); 
        
        
        
        gbc.gridwidth=1;
        gbc.gridx=4;
        gbc.gridy=10;
        log = new JButton("log");
        panel.add(log,gbc);
        
        log.addActionListener(this);
        log.setFont(font);   
        log.setBackground(white); 
        
        
        
        gbc.gridwidth=1;
        gbc.gridx=5;
        gbc.gridy=10;
        ln = new JButton("ln");
        panel.add(ln,gbc);
        
        ln.addActionListener(this);
        ln.setFont(font);   
        ln.setBackground(white); 
        
        
        gbc.gridwidth=1;
        gbc.gridx=0;
        gbc.gridy=11;
        asin= new JButton("asin");
        panel.add(asin,gbc);
        
        asin.addActionListener(this);
        asin.setFont(font);   
        asin.setBackground(white); 
        
        
        gbc.gridwidth=1;
        gbc.gridx=1;
        gbc.gridy=11;
        acos = new JButton("acos");
        panel.add(acos,gbc);
        
        acos.addActionListener(this);
        acos.setFont(font);   
        acos.setBackground(white); 
        
   
        gbc.gridwidth=2;
        gbc.gridx=2;
        gbc.gridy=11;
        atan = new JButton("atan");
        panel.add(atan,gbc);
        
        
        atan.addActionListener(this);
        atan.setFont(font);   
        atan.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=4;
        gbc.gridy=11;
        tenupn = new JButton("10^n");
        panel.add(tenupn,gbc);
        tenupn.addActionListener(this);
        tenupn.setFont(font);   
        tenupn.setBackground(white); 
        
        
        gbc.gridwidth=1;
        gbc.gridx=5;
        gbc.gridy=11;
        abs = new JButton("abs");
        panel.add(abs,gbc);
        
        abs.addActionListener(this);
        abs.setFont(font);   
        abs.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=0;
        gbc.gridy=12;
        hsin = new JButton("sinh");
        panel.add(hsin,gbc);
        
        hsin.addActionListener(this);
        hsin.setFont(font);   
        hsin.setBackground(white); 
        
        
        
        
        gbc.gridwidth=2;
        gbc.gridx=1;
        gbc.gridy=12;
        hcos = new JButton("cosh");
        panel.add(hcos,gbc);
        
        hcos.addActionListener(this);
        hcos.setFont(font);   
        hcos.setBackground(white); 
        
        gbc.gridwidth=1;
        gbc.gridx=3;
        gbc.gridy=12;
        htan = new JButton("tanh");
        panel.add(htan,gbc);
        
        htan.addActionListener(this);
        htan.setFont(font);   
        htan.setBackground(white); 
        
        gbc.gridwidth=2;
        gbc.gridx=4;
        gbc.gridy=12;
        exit = new JButton("EXIT");
        panel.add(exit,gbc);
        
        exit.addActionListener(this);
        exit.setFont(font);   
        exit.setBackground(red); 
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        input.setText("0");
        calc_result.setHorizontalAlignment(JTextField.RIGHT);
        calc_result.setText("0");
     }
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == Buttonone) 
        {
            if(checkForOperation == false)
            {
                num1 += "1";
                text += "1";
                input.setText(text);
            }
            else
            {
                num2 += "1";
                text += "1";
                input.setText(text);
            }
        }      
        else if (e.getSource() == Buttontwo) 
        {
            if(checkForOperation == false)
            {
                num1 += "2";
                text += "2";
                input.setText(text);
            }
            else
            {
                num2 += "2";
                text += "2";
                input.setText(text);
            }
        } 
        else if (e.getSource() == Buttonthree)
        {
            if(checkForOperation == false)
            {
                num1 += "3";
                text += "3";
                input.setText(text);
            }
            else
            {
                num2 += "3";
                text += "3";
                input.setText(text);
            }
        } 
        else if (e.getSource() == Buttonfour) 
        {
            if(checkForOperation == false)
            {
                num1 += "4";
                text += "4";
                input.setText(text);
            }
            else
            {
                num2 += "4";
                text += "4";
                input.setText(text);
            }
        } 
        else if (e.getSource() == Buttonfive) 
        {
            if(checkForOperation == false)
            {
                num1 += "5";
                text += "5";
                input.setText(text);
            }
            else
            {
                num2 += "5";
                text += "5";
                input.setText(text);
            }
        }
        else if (e.getSource() == Buttonsix) 
        {
            if(checkForOperation == false)
            {
                num1 += "6";
                text += "6";
                input.setText(text);
            }
            else
            {
                num2 += "6";
                text += "6";
                input.setText(text);
            }
        } 
        else if (e.getSource() == Buttonseven) 
        {
            if(checkForOperation == false)
            {
                num1 += "7";
                text += "7";
                input.setText(text);
            }
            else
            {
                num2 += "7";
                text += "7";
                input.setText(text);
            }
        } 
        else if (e.getSource() == Buttoneight) 
        {
            if(checkForOperation == false)
            {
                num1 += "8";
                text += "8";
                input.setText(text);
            }
            else
            {
                num2 += "8";
                text += "8";
                input.setText(text);
            }
        } 
        else if (e.getSource() == Buttonnine) 
        {
            if(checkForOperation == false)
            {
                num1 += "9";
                text += "9";
                input.setText(text);
            }
            else
            {
                num2 += "9";
                text += "9";
                input.setText(text);
            }
        } 
        else if (e.getSource() == ButtonZero) 
        {
            if(checkForOperation == false)
            {
                num1 += "0";
                text += "0";
                input.setText(text);
            }
            else
            {
                num2 += "0";
                text += "0";
                input.setText(text);
            }
        }
        else if(e.getSource() == Percent)
        {
            if(checkForOperation == false)
            {
                result = Double.parseDouble(num1) * .01;
                num1 = String.valueOf(result);
                text += "%";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Double.parseDouble(num2) * .01;
                num2 = String.valueOf(result);
                text += "%";
                input.setText(text);
            }
        }
        else if(e.getSource() == xsqrt)
        {
            if(checkForOperation == false)
            {
                result = Double.parseDouble(num1) * Double.parseDouble(num1);
                num1 = String.valueOf(result);
                text += "x^2";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Double.parseDouble(num2) * Double.parseDouble(num1);
                num2 = String.valueOf(result);
                text += "x^2";
                input.setText(text);
            }
        }
        else if(e.getSource() == Cube)
        {
            if(checkForOperation == false)
            {
                result = Double.parseDouble(num1) * Double.parseDouble(num1) * Double.parseDouble(num1);
                num1 = String.valueOf(result);
                text += "x^3";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Double.parseDouble(num2) * Double.parseDouble(num1) * Double.parseDouble(num1);
                num2 = String.valueOf(result);
                text += "x^3";
                input.setText(text);
            }
        }
        else if(e.getSource() == decimal)
        {
            if(checkForOperation == false)
            {
                result = Double.parseDouble(num1);
                num1 = String.valueOf(result);
                text += ".";
                input.setText(text);
                
                
                
            }
            else
            {
                result = Double.parseDouble(num2);
                num2 = String.valueOf(result);
                text += ".";
                input.setText(text);
            }
        }
        else if(e.getSource() == sqrt)
        {
            if(checkForOperation == false)
            {
                result = Math.sqrt(Double.parseDouble(num1));
                num1 = String.valueOf(result);
                text += "sqrt";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.sqrt(Double.parseDouble(num1));
                num2 = String.valueOf(result);
                text += "sqrt"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == onedivn)
        {
            if(checkForOperation == false)
            {
                result = 1/Double.parseDouble(num1);
                num1 = String.valueOf(result);
                text += "1/n";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = 1/Double.parseDouble(num1);
                num2 = String.valueOf(result);
                text += "1/n"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == plusorminus)
        {
            if(checkForOperation == false)
            {
                result = -1 * Double.parseDouble(num1);
                num1 = String.valueOf(result);
                text += "+/-";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = -1 * Double.parseDouble(num1);
                num2 = String.valueOf(result);
                text += "+/-"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == sin)
        {
            if(checkForOperation == false)
            {
                result = Math.sin(Math.toRadians(Double.parseDouble(num1)));
                num1 = String.valueOf(result);
                text += "sin";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.sin(Math.toRadians(Double.parseDouble(num1)));
                num2 = String.valueOf(result);
                text += "sin"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == tan)
        {
            if(checkForOperation == false)
            {
                result = Math.tan(Math.toRadians(Double.parseDouble(num1)));
                num1 = String.valueOf(result);
                text += "tan";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.tan(Math.toRadians(Double.parseDouble(num1)));
                num2 = String.valueOf(result);
                text += "tan"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == cos)
        {
            if(checkForOperation == false)
            {
                result = Math.cos(Math.toRadians(Double.parseDouble(num1)));
                num1 = String.valueOf(result);
                text += "cos";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.cos(Math.toRadians(Double.parseDouble(num1)));
                num2 = String.valueOf(result);
                text += "cos"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == asin)
        {
            if(checkForOperation == false)
            {
                result = Math.asin(Math.toRadians(Double.parseDouble(num1)));
                num1 = String.valueOf(result);
                text += "asin";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.asin(Math.toRadians(Double.parseDouble(num1)));
                num2 = String.valueOf(result);
                text += "asin"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == atan)
        {
            if(checkForOperation == false)
            {
                result = Math.atan(Math.toRadians(Double.parseDouble(num1)));
                num1 = String.valueOf(result);
                text += "atan";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.atan(Math.toRadians(Double.parseDouble(num1)));
                num2 = String.valueOf(result);
                text += "atan"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == acos)
        {
            if(checkForOperation == false)
            {
                result = Math.acos(Math.toRadians(Double.parseDouble(num1)));
                num1 = String.valueOf(result);
                text += "acos";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.acos(Math.toRadians(Double.parseDouble(num1)));
                num2 = String.valueOf(result);
                text += "acos"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == hsin)
        {
            if(checkForOperation == false)
            {
                result = Math.sinh(Math.toRadians(Double.parseDouble(num1)));
                num1 = String.valueOf(result);
                text += "sinh";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.sinh(Math.toRadians(Double.parseDouble(num1)));
                num2 = String.valueOf(result);
                text += "sinh"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == htan)
        {
            if(checkForOperation == false)
            {
                result = Math.tanh(Math.toRadians(Double.parseDouble(num1)));
                num1 = String.valueOf(result);
                text += "tanh";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.tanh(Math.toRadians(Double.parseDouble(num1)));
                num2 = String.valueOf(result);
                text += "tanh"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == hcos)
        {
            if(checkForOperation == false)
            {
                result = Math.cosh(Math.toRadians(Double.parseDouble(num1)));
                num1 = String.valueOf(result);
                text += "cosh";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.cosh(Math.toRadians(Double.parseDouble(num1)));
                num2 = String.valueOf(result);
                text += "cosh"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == tenupn)
        {
            if(checkForOperation == false)
            {
                result = Math.pow(Double.parseDouble(num1),10);
                num1 = String.valueOf(result);
                text += "10^n";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.pow(Double.parseDouble(num1),10);
                num2 = String.valueOf(result);
                text += "10^n"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == abs)
        {
            if(checkForOperation == false)
            {
                result = Math.abs(Double.parseDouble(num1));
                num1 = String.valueOf(result);
                text += "abs";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.abs(Double.parseDouble(num1));
                num2 = String.valueOf(result);
                text += "abs"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == log)
        {
            if(checkForOperation == false)
            {
                result = Math.log10(Double.parseDouble(num1));
                num1 = String.valueOf(result);
                text += "log";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.log10(Double.parseDouble(num1));
                num2 = String.valueOf(result);
                text += "log"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == ln)
        {
            if(checkForOperation == false)
            {
                result = Math.log(Double.parseDouble(num1));
                num1 = String.valueOf(result);
                text += "ln";
                input.setText(text);
                
                calc_result.setText(num1);
                
            }
            else
            {
                result = Math.log(Double.parseDouble(num1));
                num2 = String.valueOf(result);
                text += "ln"; 
                input.setText(text);
            }
        }
        else if(e.getSource() == addition)
        {
            checkForOperation = true;
            text += " + ";
            input.setText(text);
        }
        else if(e.getSource() == multiply)
        {
            checkForOperation = true;
            text += " * ";
            input.setText(text);
        }
        else if(e.getSource() == divide)
        {
            checkForOperation = true;
            text += " / ";
            input.setText(text);
        }
        else if(e.getSource() == subtraction)
        {
            checkForOperation = true;
            text += " - ";
            input.setText(text);
        }
        else if(e.getSource() == modulus)
        {
            checkForOperation = true;
            text += " Mod ";
            input.setText(text);
        }
        else if(e.getSource() == xsqrt)
        {
            checkForOperation = true;
            text += " x^2 ";
            input.setText(text);
        }
        else if(e.getSource() == Equal)
        {
            if(input.getText().contains(" + "))
            {
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                calc_result.setText(String.valueOf(result));
            }
            else if(input.getText().contains(" - "))
            {
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                calc_result.setText(String.valueOf(result));
            }
            else if(input.getText().contains(" / "))
            {
                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                calc_result.setText(String.valueOf(result));
            }
            else if(input.getText().contains(" * "))
            {
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                calc_result.setText(String.valueOf(result));
            }
            else if(input.getText().contains(" Mod "))
            {
                result = Double.parseDouble(num1) % Double.parseDouble(num2);
                calc_result.setText(String.valueOf(result));
            }
            
        }
        else if(e.getSource() == clear)
        {
            checkForOperation = false;
            text = "";
            num1 = "";
            num2 = "";
            result = 0;
            calc_result.setText(String.valueOf(result));
            input.setText("0");
        }
        else if(e.getSource() == exit)
        {
            System.exit(0);
        }
        
        
        
        
    }
}

