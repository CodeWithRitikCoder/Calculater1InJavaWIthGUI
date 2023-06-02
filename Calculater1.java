import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Calculater1 /*implements ActionListener*/{
	
	//Components are here.
	private JFrame jFrame;
	private JLabel jLabelForWelcome, jLabelForFirstNumber, jLabelForSecondNumber, jLabelForAnswer;
	private JTextField jTextFieldForFirstNumber, jTextFieldForSecondNumber;
	//private JButton jButtonForAddition= new JButton("+");
	private JButton jButtonForAddition, jButtonForSubtraction, jButtonForMultiplication, jButtonForDivision, jButtonForModulus;
	private JButton jB1, jB2, jB3, jB4, jB5, jB6, jB7, jB8, jB9, jB0, jB00, jBPoint, jBEqual, jBClear, jBDelete, jBExpend;
	private Font font= new Font("Normal", Font.BOLD, 18);
	
	//Importand variable is here.
	double a, b, result;
	char operator;
	boolean booleanForExpend= true;
	//Constructor is here.
	public Calculater1(){
		setComponents();
	}
	
	//SetComponents Method is here.
	public void setComponents(){
		System.out.println("My name is SetComponent");
		jFrame= new JFrame("My Calculater");
		jFrame.setBounds(950, 100, 282, 440);//440h
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setResizable(false);
		
		//Other components is here.
		jLabelForWelcome= new JLabel("Welcome to My Calculater");
		jLabelForWelcome.setBounds(10, 5, 350, 50);
		jLabelForWelcome.setFont(new Font("Normal", Font.BOLD, 20));
		
		jLabelForFirstNumber= new JLabel("First No : ");
		jLabelForFirstNumber.setBounds(10, 60, 190, 50);
		jLabelForFirstNumber.setFont(font);
		
		jTextFieldForFirstNumber= new JTextField();
		jTextFieldForFirstNumber.setBounds(10, 70, 247, 50);
		jTextFieldForFirstNumber.setFont(font);
		
		jLabelForSecondNumber= new JLabel("Second No : ");
		jLabelForSecondNumber.setBounds(10, 110, 210, 50);
		jLabelForSecondNumber.setFont(font);
		
		jTextFieldForSecondNumber= new JTextField();
		jTextFieldForSecondNumber.setBounds(135, 120, 120, 30);
		jTextFieldForSecondNumber.setFont(font);
		
		jLabelForAnswer= new JLabel();
		jLabelForAnswer.setBounds(20, 160, 250, 30);
		jLabelForAnswer.setFont(font);
		
		jButtonForAddition= new JButton("+");
		jButtonForAddition.setBounds(205, 280, 50, 30);//280y
		jButtonForAddition.setFont(font);
		
		jButtonForSubtraction= new JButton("-");
		jButtonForSubtraction.setBounds(205, 240, 50, 30);//240y
		jButtonForSubtraction.setFont(font);
		
		jButtonForMultiplication= new JButton("x");
		jButtonForMultiplication.setBounds(205, 200, 50, 30);//200y
		jButtonForMultiplication.setFont(font);
		
		jButtonForDivision= new JButton("/");
		jButtonForDivision.setBounds(140, 200, 50, 30);//200y
		jButtonForDivision.setFont(font);
		
		jButtonForModulus= new JButton("%");
		jButtonForModulus.setBounds(75, 200, 50, 30);//200y
		jButtonForModulus.setFont(new Font("Normal", Font.BOLD, 15));
		
		jB9= new JButton("9");
		jB9.setBounds(10, 240, 50, 30);//240y
		
		jB8= new JButton("8");
		jB8.setBounds(75, 240, 50, 30);//240y
		
		jB7= new JButton("7");
		jB7.setBounds(140, 240, 50, 30);//240y
		
		jB6= new JButton("6");
		jB6.setBounds(10, 280, 50, 30);//280y
		
		jB5= new JButton("5");
		jB5.setBounds(75, 280, 50, 30);//280y
		
		jB4= new JButton("4");
		jB4.setBounds(140, 280, 50, 30);//280y
		
		jB3= new JButton("3");
		jB3.setBounds(10, 320, 50, 30);//320y
		
		jB2= new JButton("2");
		jB2.setBounds(75, 320, 50, 30);//320y
		
		jB1= new JButton("1");
		jB1.setBounds(140, 320, 50, 30);//320y
		
		jB0= new JButton("0");
		jB0.setBounds(10, 360, 50, 30);//360y
		
		jB00= new JButton("00");
		jB00.setBounds(75, 360, 50, 30);//360y
		
		jBPoint= new JButton(".");
		jBPoint.setBounds(140, 360, 50, 30);//360y
		
		jBEqual= new JButton("=");
		jBEqual.setBounds(205, 320, 50, 30);//320y
		jBEqual.setFont(font);
		
		jBClear= new JButton("CL");
		jBClear.setBounds(10, 200, 50, 30);//200y
		
		jBDelete= new JButton("<x");
		jBDelete.setBounds(205, 360, 50, 30);//360y
		
		jBExpend= new JButton("---");
		jBExpend.setBounds(115, 130, 30, 10);
		
		
		
		jFrame.setLayout(null);
		
		jFrame.add(jLabelForWelcome);
		//jFrame.add(jLabelForFirstNumber);
		jFrame.add(jTextFieldForFirstNumber);
		//jFrame.add(jLabelForSecondNumber);
		//jFrame.add(jTextFieldForSecondNumber);
		//jFrame.add(jLabelForAnswer);
		jFrame.add(jButtonForAddition);
		jFrame.add(jButtonForSubtraction);
		jFrame.add(jButtonForMultiplication);
		jFrame.add(jButtonForDivision);
		jFrame.add(jButtonForModulus);
		jFrame.add(jB9);
		jFrame.add(jB8);
		jFrame.add(jB7);
		jFrame.add(jB6);
		jFrame.add(jB5);
		jFrame.add(jB4);
		jFrame.add(jB3);
		jFrame.add(jB2);
		jFrame.add(jB1);
		jFrame.add(jB0);
		jFrame.add(jB00);
		jFrame.add(jBPoint);
		jFrame.add(jBEqual);
		jFrame.add(jBClear);
		jFrame.add(jBDelete);
		jFrame.add(jBExpend);
		
		//action Performed is here.
		jButtonForAddition.addActionListener(new ActionClass());
		jButtonForSubtraction.addActionListener(new ActionClass());
		jButtonForMultiplication.addActionListener(new ActionClass());
		jButtonForDivision.addActionListener(new ActionClass());
		jButtonForModulus.addActionListener(new ActionClass());
		jB9.addActionListener(new ActionClass());
		jB8.addActionListener(new ActionClass());
		jB7.addActionListener(new ActionClass());
		jB6.addActionListener(new ActionClass());
		jB5.addActionListener(new ActionClass());
		jB4.addActionListener(new ActionClass());
		jB3.addActionListener(new ActionClass());
		jB2.addActionListener(new ActionClass());
		jB1.addActionListener(new ActionClass());
		jB0.addActionListener(new ActionClass());
		jB00.addActionListener(new ActionClass());
		jBPoint.addActionListener(new ActionClass());
		jBClear.addActionListener(new ActionClass());
		jBEqual.addActionListener(new ActionClass());
		jBDelete.addActionListener(new ActionClass());
		jBExpend.addActionListener(new ActionClass());
		
		jFrame.setVisible(true);
		
	}
	
	//This is the Inner Class of this class.
	class ActionClass implements ActionListener{
		//actionPerformed Method is here.
		public void actionPerformed(ActionEvent e){
			if(e.getSource()== jButtonForAddition){
				if(jTextFieldForFirstNumber.getText().trim().isEmpty()/* || jTextFieldForSecondNumber.getText().trim().isEmpty()*/){
					JOptionPane.showMessageDialog(null, "Enter something");
				}else{
					a= Double.parseDouble(jTextFieldForFirstNumber.getText());
					operator= '+';
					jTextFieldForFirstNumber.setText("");					
					
				}
			}
			else if(e.getSource()== jButtonForSubtraction){
				if(jTextFieldForFirstNumber.getText().trim().isEmpty() /*|| jTextFieldForSecondNumber.getText().trim().isEmpty()*/){
					JOptionPane.showMessageDialog(null, "Enter something");
				}else{
					a= Double.parseDouble(jTextFieldForFirstNumber.getText());
					operator= '-';
					jTextFieldForFirstNumber.setText("");
					
				}
			}
			else if(e.getSource()== jButtonForMultiplication){
				if(jTextFieldForFirstNumber.getText().trim().isEmpty() /*|| jTextFieldForSecondNumber.getText().trim().isEmpty()*/){
					JOptionPane.showMessageDialog(null, "Enter something");
				}else{
					a= Double.parseDouble(jTextFieldForFirstNumber.getText());
					operator= '*';
					jTextFieldForFirstNumber.setText("");
						
				}
			}
			else if(e.getSource()== jButtonForDivision){
				if(jTextFieldForFirstNumber.getText().trim().isEmpty() /*|| jTextFieldForSecondNumber.getText().trim().isEmpty()*/){
					JOptionPane.showMessageDialog(null, "Enter something"); 
				}else{
					a= Double.parseDouble(jTextFieldForFirstNumber.getText());
					operator= '/';
					jTextFieldForFirstNumber.setText("");
					
				}
			}
			else if(e.getSource()== jButtonForModulus){
				if(jTextFieldForFirstNumber.getText().trim().isEmpty()/* || jTextFieldForSecondNumber.getText().trim().isEmpty()*/){
					JOptionPane.showMessageDialog(null, "Enter something");
				}else{
					a= Double.parseDouble(jTextFieldForFirstNumber.getText());
					operator= '%';
					jTextFieldForFirstNumber.setText("");
					
				}
			}
			else if(e.getSource()== jB9){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat(String.valueOf(9)));
				
				
			}
			else if(e.getSource()== jB8){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat(String.valueOf(8)));
				
			}
			else if(e.getSource()== jB7){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat(String.valueOf(7)));
				
			}
			else if(e.getSource()== jB6){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat(String.valueOf(6)));
				
			}
			else if(e.getSource()== jB5){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat(String.valueOf(5)));
				
			}
			else if(e.getSource()== jB4){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat(String.valueOf(4)));
				
			}
			else if(e.getSource()== jB3){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat(String.valueOf(3)));
				
			}
			else if(e.getSource()== jB2){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat(String.valueOf(2)));
				
			}
			else if(e.getSource()== jB1){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat(String.valueOf(1)));
				
			}
			else if(e.getSource()== jB0){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat(String.valueOf(0)));
				
			}
			else if(e.getSource()== jB00){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat("00"));
				
			}
			else if(e.getSource()== jBPoint){
				jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText().concat("."));
				
			}
			else if(e.getSource()== jBEqual){
				if(jTextFieldForFirstNumber.getText().trim().isEmpty() /*|| jTextFieldForSecondNumber.getText().trim().isEmpty()*/){
					JOptionPane.showMessageDialog(null, "Enter something");
				}else{
					b= Double.parseDouble(jTextFieldForFirstNumber.getText());
					switch(operator){
						case '+':
							result= a+ b;
							break;
						case '-':
							result= a- b;
							break;
						case '*':
							result= a* b;
							break;
						case '/':
							result= a/ b;
							break;
						case '%':
							result= a% b;
							break;
						default:
							JOptionPane.showMessageDialog(null, "Some wrong in the Switch case.");
							break;
					}
					jTextFieldForFirstNumber.setText(String.valueOf(result));
					a= result;
					
				}
			}
			else if(e.getSource()== jBClear){
					//System.out.println("My name is Clear");
				if(jTextFieldForFirstNumber.getText().trim().isEmpty() && jTextFieldForSecondNumber.getText().trim().isEmpty()){
					JOptionPane.showMessageDialog(null, "Fields are already empty");
				}else{
					jTextFieldForFirstNumber.setText("");
					jTextFieldForSecondNumber.setText("");
					jLabelForAnswer.setText("");
				}
				
			}
			else if(e.getSource()== jBDelete){
				String stringForClear= jTextFieldForFirstNumber.getText();
				jTextFieldForFirstNumber.setText("");
				for(int i= 0; i< stringForClear.length()-1; i++){
					jTextFieldForFirstNumber.setText(jTextFieldForFirstNumber.getText()+ stringForClear.charAt(i));
					
				}
			}
			else if(e.getSource()== jBExpend){
				Calculater calculater= new Calculater();
				jFrame.setVisible(false);
				
			}
		}
	}
	
	public static void main(String [] args){
		System.out.println("This is my Calculater");
		new Calculater1();
		
	}
}