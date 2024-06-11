import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;


public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
	JButton rightBracketButton,backButton,leftBracketButton,twoButton,oneButton,minusButton,sixButton,fiveButton,fourButton,plusButton,nineButton,divideButton,multipleButton,clearButton,sevenButton,eightButton,dotButton,zeroButton,equalsButton, threeButton;
	 public Calculator(){
	
		jf=new JFrame("calculator");
		jf.setSize(600,700);
		jf.setLayout(null);
		jf.setLocation(400,150);	
	     displayLabel = new JLabel();
	     displayLabel.setBounds(30,50,540,40);
	     displayLabel.setBackground(Color.GRAY);
	     displayLabel.setOpaque(true);
	     displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	     displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		
		clearButton=new JButton("C");
		clearButton.setBounds(30,130,80,80);
		clearButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(clearButton);
		clearButton.addActionListener(this);	
	
		
		divideButton=new JButton("/");
		divideButton.setBounds(130,130,80,80);
		divideButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(divideButton);
		divideButton.addActionListener(this);	
		
		multipleButton=new JButton("x");
		multipleButton.setBounds(230,130,80,80);
		multipleButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(multipleButton);	
		multipleButton.addActionListener(this);	
		
		equalsButton=new JButton("=");
		equalsButton.setBounds(330,130,80,80);
		equalsButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(equalsButton);
		equalsButton.addActionListener(this);	
			
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,230,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(sevenButton);
		sevenButton.addActionListener(this);	
	
		eightButton=new JButton("8");
		eightButton.setBounds(130,230,80,80);
		eightButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(eightButton);
		eightButton.addActionListener(this);	
			
		nineButton=new JButton("9");
		nineButton.setBounds(230,230,80,80);
		nineButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(nineButton);
		nineButton.addActionListener(this);	
		
		plusButton=new JButton("+");
		plusButton.setBounds(330,230,80,80);
		plusButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(plusButton);
		plusButton.addActionListener(this);
			
		fourButton=new JButton("4");
		fourButton.setBounds(30,330,80,80);
		fourButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(fourButton);
		fourButton.addActionListener(this);
														
		fiveButton=new JButton("5");
		fiveButton.setBounds(130,330,80,80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(fiveButton);
		fiveButton.addActionListener(this);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230,330,80,80);
		sixButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(sixButton);
		sixButton.addActionListener(this);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330,330,80,80);
		minusButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(minusButton);
		minusButton.addActionListener(this);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,430,80,80);
		oneButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(oneButton);
		oneButton.addActionListener(this);																
		
		twoButton=new JButton("2");
		twoButton.setBounds(130,430,80,80);
		twoButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(twoButton);
		twoButton.addActionListener(this);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230,430,80,80);
		threeButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(threeButton);
		threeButton.addActionListener(this);
		
		backButton=new JButton("<-");
		backButton.setBounds(330,430,80,80);
		backButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(backButton);
		backButton.addActionListener(this);
		
 		zeroButton=new JButton("0");
		zeroButton.setBounds(30,530,80,80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
																
		dotButton=new JButton(".");
		dotButton.setBounds(130,530,80,80);
		dotButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(dotButton);
		dotButton.addActionListener(this);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==sevenButton){
			displayLabel.setText(displayLabel.getText()+"7");
		}
		else if(e.getSource()==clearButton){
				displayLabel.setText("");
		}
		else if(e.getSource()==eightButton){
			displayLabel.setText(displayLabel.getText()+"8");
		}
		else if(e.getSource()==nineButton){
			displayLabel.setText(displayLabel.getText()+"9");
		}
		else if(e.getSource()==sixButton){
			displayLabel.setText(displayLabel.getText()+"6");
		}
		else if(e.getSource()==fiveButton){
			displayLabel.setText(displayLabel.getText()+"5");
		}
		else if(e.getSource()==fourButton){
			displayLabel.setText(displayLabel.getText()+"4");
		}
		else if(e.getSource()==threeButton){
			displayLabel.setText(displayLabel.getText()+"3");
		}
		else if(e.getSource()==twoButton){
			displayLabel.setText(displayLabel.getText()+"2");
		}
		else if(e.getSource()==oneButton){
			displayLabel.setText(displayLabel.getText()+"1");
		}
		else if(e.getSource()==multipleButton){
			displayLabel.setText(displayLabel.getText()+"*");
		}
		else if(e.getSource()==divideButton){
			displayLabel.setText(displayLabel.getText()+"/");
		}
		else if(e.getSource()==zeroButton){
			displayLabel.setText(displayLabel.getText()+"0");
		}
		else if(e.getSource()==plusButton){
			displayLabel.setText(displayLabel.getText()+"+");			
		}
		else if(e.getSource()==minusButton){
			displayLabel.setText(displayLabel.getText()+"-");
		}
		else if(e.getSource()==dotButton){
			displayLabel.setText(displayLabel.getText()+".");			
		}		
		else if(e.getSource()==backButton){
			String backSpace=null;
			if(displayLabel.getText()!=null){			
				StringBuilder str =new StringBuilder(displayLabel.getText());
				str.deleteCharAt(displayLabel.getText().length()-1);
				backSpace=str.toString();
				displayLabel.setText(backSpace);
			}
		}		
		else if (e.getSource()==equalsButton){
			String display=displayLabel.getText();
			char[] elements=display.toCharArray();
			Stack<Float> values = new Stack<Float>();
			Stack<Character> operators=new Stack<Character>();
			float result = evaluateExpressions(elements,values,operators);	
			displayLabel.setText(Float.toString(result));		
		}	
	}

	public void applyoperators(Stack<Character> operators, Stack<Float> values){
		if(operators.peek()=='*'){							
			values.push(mul(operators.pop(),values.pop(),values.pop()));
		}
		else if(operators.peek()=='/'){
			values.push(div(operators.pop(),values.pop(),values.pop()));
		}
	}
	public void applyAlloperators(Stack<Character> operators, Stack<Float> values){
		applyoperators(operators,values);
		if(operators.peek()=='+'){
			values.push(add(operators.pop(),values.pop(),values.pop()));	
		}
		else if(operators.peek()=='-'){
			values.push(minus(operators.pop(),values.pop(),values.pop()));	
		}
	}
	public float evaluateExpressions(char[] elements, Stack<Float> values,Stack<Character> operators){
		for(int i=0;i<elements.length;i++){
				if(elements[i]>='0' || elements[i]=='.'){
					StringBuffer sb=new StringBuffer();
					while(i<elements.length && (elements[i]>='0'|| elements[i]=='.')){								   
				    	sb.append(elements[i]);
				    	i++;
					}
					values.push(Float.parseFloat(sb.toString()));
					i--;
				}
				else if(elements[i]=='('){
					operators.push(elements[i]);
				}
				else if(elements[i]==')'){
					while(!operators.empty() && operators.peek()!='('){
						if(operators.peek()=='+'){
							operators.pop();							
							applyoperators(operators,values);							
							operators.push('+');
						}
						else if(operators.peek()=='-'){
							operators.pop();							
							applyoperators(operators,values);							
							operators.push('-');					
						} 
						else if(operators.peek()=='*'){							
							values.push(mul(operators.pop(),values.pop(),values.pop()));
						}
						else {
							if(operators.peek()=='/'){							
								values.push(div(operators.pop(),values.pop(),values.pop()));
							}
						}
						while(!operators.empty() && operators.peek()!='('){
							applyAlloperators(operators,values);							
						}
					}
					operators.pop();			
				}				
				else if(elements[i]=='+'|| elements[i]=='-' || elements[i]=='*' || elements[i]=='/'){
					if(!operators.empty()==true){
						if(elements[i]=='+'){						
							applyoperators(operators,values);						
							operators.push(elements[i]);
						}
						else if(elements[i]=='-'){
							applyoperators(operators,values);							
							operators.push(elements[i]);					
						} 
						else if(elements[i]=='*'){								
							if(operators.peek()=='/'){
								values.push(div(operators.pop(),values.pop(),values.pop()));	
							}							
							operators.push(elements[i]);						
						}
						else if(elements[i]=='/'){	
							if(operators.peek()=='*'){
								values.push(mul(operators.pop(),values.pop(),values.pop()));
							}
							operators.push(elements[i]);
						} 
					}else{
						operators.push(elements[i]);
					}
				}
			}while(!operators.empty()==true){
				if(operators.peek()=='/'){
					values.push(div(operators.pop(),values.pop(),values.pop()));
				}
				else if(operators.peek()=='*'){
					values.push(mul(operators.pop(),values.pop(),values.pop()));
				}
				else if(operators.peek()=='+'){
					values.push(add(operators.pop(),values.pop(),values.pop()));
				}
				else if(operators.peek()=='-'){
					values.push(minus(operators.pop(),values.pop(),values.pop()));
				}
				
			}return values.pop();	
	}	
	public static void main(String args[]){
		new Calculator();		
	}
	public float add(char opr,float b,float a){
		return a+b;
	}
	public float minus(char opr,float b,float a){
		return a-b;
	}
	public float mul(char opr,float b,float a){
		return a*b;
	}
	public float div(char opr,float b,float a){
		if(b==0){
			displayLabel.setText("cannot divisible by zero");
			return Float.NaN;
		}
		else{
			return a/b;
		}
		
	}
}
