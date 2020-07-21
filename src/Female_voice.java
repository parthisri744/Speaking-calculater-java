import java.awt.EventQueue;
import javax.swing.border.LineBorder;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Color;
import javax.speech.EngineException;
import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Female_voice {

	private JFrame frame;
	private static JTextField input;
	private JButton   btnNewButton_14;
	private static final String  SayWhat = "kevin16";
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Female_voice window = new Female_voice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Female_voice() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");  
		frame.setIconImage(icon);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 
		input = new JTextField();
		input.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		input.setBounds(0, 0, 367, 122);
		input.setToolTipText("Enter Values");
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setBorder(new LineBorder(new Color(192, 192, 192), 12));
		frame.getContentPane().add(input);  
		input.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 110, 500, 353);
		panel.setForeground(Color.RED);
		panel.setBorder(new LineBorder(new Color(192, 192, 192), 13));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("1"));
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton.setBounds(12, 12, 116, 66);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("2"));
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_1.setBounds(128, 12, 116, 66);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("3"));
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_2.setBounds(244, 12, 116, 66);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("4"));
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_3.setBounds(12, 78, 116, 66);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("5"));
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_4.setBounds(128, 78, 116, 66);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("/");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("/"));
			}
		});
		btnNewButton_5.setForeground(Color.BLUE);
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_5.setBounds(360, 12, 126, 66);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("7"));
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_6.setBounds(12, 144, 116, 66);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("*");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("*"));
			}
		});
		btnNewButton_7.setForeground(Color.BLUE);
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_7.setBounds(360, 78, 126, 66);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("6");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("6"));
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_8.setBounds(244, 78, 116, 66);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("8");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("8"));
			}
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_9.setBounds(128, 144, 116, 66);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("9");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("9"));
			}
		});
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_10.setBounds(244, 144, 116, 66);
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("-"));
			}
		});
		btnNewButton_11.setForeground(Color.BLUE);
		btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_11.setBounds(360, 144, 126, 66);
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("0"));
			}
		});
		btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_12.setBounds(12, 210, 116, 66);
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton(".");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				input.setText(input.getText().concat(".")); 
			}
		});
		btnNewButton_13.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 56));
		btnNewButton_13.setBounds(128, 210, 116, 66);
		panel.add(btnNewButton_13);
		
		
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				 if(e.getSource()==btnNewButton_14)
					{                  
			         input.setText(evaluate(input.getText()));
			      }
			   }
			 
			   public String evaluate(String expression) {
			      char[] arr = expression.toCharArray();
			      String operand1 = "";String operand2 = "";String operator = "";
			      double result = 0;

			      for (int i = 0; i < arr.length; i++) {
			         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
			            if(operator.isEmpty()){
			               operand1 += arr[i];
			            }else{
			               operand2 += arr[i];
			            }
			         }  

			         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
			            operator += arr[i];
			         }
			      }

			      if (operator.equals("+"))
			         result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
			      else if (operator.equals("-"))
			         result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
			      else if (operator.equals("/"))
			         result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
			      else
			         result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));     
				return operand1 + operator + operand2 + "=" +result;	
                  
			}
		});
		btnNewButton_14.setForeground(Color.GREEN);
		btnNewButton_14.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_14.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_14.setBounds(244, 210, 116, 66);
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText().concat("+"));
			}
			
		});
		btnNewButton_15.setForeground(Color.BLUE);
		btnNewButton_15.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnNewButton_15.setBounds(360, 210, 126, 66);
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_17 = new JButton("Exit");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit ","Text to Speech" ,
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_17.setForeground(new Color(139, 0, 0));
		btnNewButton_17.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btnNewButton_17.setBounds(10, 276, 234, 66);
		panel.add(btnNewButton_17);
		
		
		System.setProperty("FreeTTSSynthEngineCentral", "com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		JButton btnNewButton_18 = new JButton("Speak Answer");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VoiceManager vm = VoiceManager.getInstance();
				com.sun.speech.freetts.Voice iTalk = vm.getVoice(SayWhat);
				 if (iTalk == null) {
			            System.err.println(
			                "Cannot find a voice named "
			                + iTalk + ".  Please specify a different voice.");
			            System.exit(1);
			        }

				iTalk.allocate();
				try {
					iTalk.speak(input.getText());
				}catch (Exception ex) {
					JOptionPane.showConfirmDialog(null, "Can't Talk Me, Have Error!");
				}	
			}
		});
		btnNewButton_18.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_18.setBounds(244, 276, 244, 66);
		panel.add(btnNewButton_18);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192), 12));
		panel_1.setBounds(367, 0, 134, 140);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_16 = new JButton("Clear");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnNewButton_16.setForeground(Color.RED);
		btnNewButton_16.setFont(new Font("Times New Roman", Font.BOLD, 34));
		btnNewButton_16.setBounds(0, 12, 122, 50);
		panel_1.add(btnNewButton_16);
		
		JButton btnNewButton_19 = new JButton("Delete");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=input.getText();
				input.setText("");
				for(int i=0;i<s.length()-1;i++)
				input.setText(input.getText()+s.charAt(i));
			}
		});
		btnNewButton_19.setForeground(Color.ORANGE);
		btnNewButton_19.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_19.setBounds(0, 62, 122, 48);
		panel_1.add(btnNewButton_19);
		
		
	}	 public void actionPerformed(ActionEvent e) throws EngineException {
		
		if(e.getSource()==btnNewButton_14) {
	          
		}	
	      
    }  
}
