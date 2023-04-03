package Task31_3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JframeEx2 implements ActionListener
{
	protected static final JPasswordField P1 = null;
	protected static final JPasswordField P2 = null;
	protected static final String Fliepath = null;
	JFrame frame;
	JPasswordField p1,p2;
	JLabel l1,l2,l3,l4,l5,l;
	JTextField t1,t2,t3;
	JButton b1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeEx2 window = new JframeEx2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public JframeEx2()
	{
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		l = new JLabel("   REGISTER A NEW STUDENT");
		l.setBounds(165, 21, 348, 13);
		l.setFont(new Font("Tahoma",Font.BOLD, 15));
		
		l1 = new JLabel("Name");
		l1.setBounds(74, 58, 114, 22);
		l1.setFont(new Font("Tahoma",Font.BOLD, 15));
		t1 = new  JTextField("");
		t1.setBounds(198, 59, 265, 22);
				

		l2 = new JLabel("Mail id");
		l2.setBounds(74, 122, 114, 22);
		l2.setFont(new Font("Tahoma",Font.BOLD, 15));
		t2 = new JTextField("");
		t2.setBounds(198, 91, 265, 22);
		
		
		l3 = new JLabel("Mobile no");
		l3.setBounds(74, 90, 114, 22);
		l3.setFont(new Font("Tahoma",Font.BOLD, 15));
		t3 = new JTextField("");
		t3.setBounds(198, 123, 265, 22);
		
		
		l4 = new JLabel("Password");
		l4.setBounds(74, 154, 114, 22);
		l4.setFont(new Font("Tahoma",Font.BOLD, 15));
		p1 = new JPasswordField("");
		p1.setBounds(198, 155, 265, 22);
		
		
		l5 = new JLabel("Re-Password");
		l5.setBounds(74, 186, 114, 22);
		l5.setFont(new Font("Tahoma",Font.BOLD, 15));
		p2 = new JPasswordField("");
		p2.setBounds(198, 187, 265, 22);
		
		b1 = new JButton("Register");
		b1.setBounds(243, 238, 157, 32);
		b1.setFont(new Font("Tahoma",Font.BOLD, 15));
		
		frame.getContentPane().add(l);
		frame.getContentPane().add(l1);
		frame.getContentPane().add(l2);
		frame.getContentPane().add(l3);
		frame.getContentPane().add(l4);
		frame.getContentPane().add(l5);
		frame.getContentPane().add(t1);	
		frame.getContentPane().add(t2);	
		frame.getContentPane().add(t3);	
		frame.getContentPane().add(p1);
		frame.getContentPane().add(p2);
		frame.getContentPane().add(b1);
		b1.addActionListener(new ActionListener() 
		{
			private OutputStreamWriter writer;
			private Throwable e1;

			public void actionPerformed1(ActionEvent s)
			{
				char[] password1 = p1.getPassword();
                String passwordString1 = new String(password1);
                char[] password2 = p2.getPassword();
                String passwordString2 = new String(password2);
                if(passwordString1.equals(passwordString2))
                {
                	String filepath = "E:sujalkhunt.txt";
                	String k1 = t1.getText();
                	String k2 = t2.getText();
                	String k3 = t3.getText();
					String textToSave = "\nName: "+k1+"\nMobile No: "+k2+"\nMail Id: "+k3;
                	try 
                	{
                		FileWriter write =  new FileWriter(Fliepath,true);
        			    writer = null;
						writer.write(textToSave);
    			        writer.close();
    			        System.out.println("Text saved to Notepad file successfully!");
                	}
					 catch (Exception e) 
                	{
						e1 = null;
						System.out.println("An error occurred: "+e1.getMessage());
					}	

                	t1.setText("");
                	t2.setText("");
                	t3.setText("");
                	p1.setText("");
                	p1.setText("");
                }
                else 
                {
                	System.out.println("Try Again");
                }
				
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	});



	