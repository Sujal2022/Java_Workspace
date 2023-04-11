package Task5_4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JFrameEx5 implements ItemListener
{
	
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JTextField t1,t2,t3,t4;
	JRadioButton r1,r2;
	ButtonGroup bg;
	JPasswordField p1,p2;
	JComboBox<String>combo;
	String courses[] = {"BBA","BCA","Bcom","BBA-Hons","BCA-Hons","Bcom-Hons"};
	JComboBox<String>combo1;
	String branch[] = {"Rajkot","Surat","Ahmedabad","Mumbai","Pune"};
	JComboBox<String>combo2;
	String semester[] = {"1","2","3","4","5","6"};
	JButton b1;
	String gender;
	String course;
	String Branch;
	String Semester;
	
	
	public JFrameEx5()
	{
		frame = new JFrame();
		
		l1 = new JLabel("Register A New Student");
		l1.setBounds(152, 23, 319, 35);
		l1.setFont(new Font("Tahoma",Font.BOLD, 25));
		
		
		l2 = new JLabel("Name");
		l2.setBounds(28, 65, 66, 19);
		l2.setFont(new Font("Tahoma",Font.BOLD, 15));
		t1 = new JTextField();
		t1.setBounds(139, 67, 313, 19);
		//t1.setFont(new Font("Verdana", Font.BOLD, 12));
		
		
		l3 = new JLabel("DOB");
		l3.setBounds(28, 105, 45, 19);
		t2 = new JTextField();
		l3.setFont(new Font("Tahoma",Font.BOLD, 15));
		t2.setBounds(139, 105, 313, 19);
		
		l4 = new JLabel("Gender");
		l4.setBounds(28, 145, 84, 13);
		l4.setFont(new Font("Tahoma",Font.BOLD, 15));
		r1 = new JRadioButton("Male");
		r1.setBounds(139, 143, 103, 21);
		r1.setFont(new Font("Tahoma",Font.BOLD, 15));
		r2 = new JRadioButton("Female");
		r2.setBounds(282, 143, 103, 21);
		r2.setFont(new Font("Tahoma",Font.BOLD, 15));
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		
		l5 = new JLabel("Mail id");
		l5.setBounds(28, 185, 92, 19);
		l5.setFont(new Font("Tahoma",Font.BOLD, 15));
		t3 = new JTextField();
		t3.setBounds(139, 187, 313, 19);
		
		
		l6 = new JLabel("Mobile No");
		l6.setBounds(28, 225, 84, 19);
		l6.setFont(new Font("Tahoma",Font.BOLD, 15));
		t4 = new JTextField();
		t4.setBounds(139, 227, 313, 19);
		
		l7 = new JLabel("Password");
		l7.setBounds(28, 265, 84, 19);
		l7.setFont(new Font("Tahoma",Font.BOLD, 15));
		p1 = new JPasswordField();
		p1.setBounds(139, 267, 313, 19);
		
		l8 = new JLabel("Re Password");
		l8.setBounds(28, 305, 106, 19);
		l8.setFont(new Font("Tahoma",Font.BOLD, 15));
		p2 = new JPasswordField();
		p2.setBounds(139, 307, 313, 19);
		
		l9 = new JLabel("Course");
		l9.setBounds(28, 345, 66, 19);
		l9.setFont(new Font("Tahoma",Font.BOLD, 15));
		combo = new JComboBox<String>(courses);
		combo.setBounds(139, 346, 313, 21);
		combo.addItemListener(this);
		
		
		l10 = new JLabel("Branch");
		l10.setBounds(28, 385, 77, 13);
		l10.setFont(new Font("Tahoma",Font.BOLD, 15));
		combo1 = new JComboBox<String>(branch);
		combo1.setBounds(139, 383, 313, 21);
		combo1.addItemListener(this);
		
		l11 = new JLabel("Semester");
		l11.setBounds(28, 425, 106, 13);
		l11.setFont(new Font("Tahoma",Font.BOLD, 15));
		combo2 = new JComboBox<String>(semester);
		combo2.setBounds(139, 423, 313, 21);
		combo2.addItemListener(this);
		
		b1 = new JButton("Register");
		b1.setBounds(139, 480, 307, 21);
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(l8);
		frame.add(l9);
		frame.add(l10);
		frame.add(l11);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(r1);
		frame.add(r2);
		frame.add(p1);
		frame.add(p2);
		frame.add(combo);
		frame.add(combo1);
		frame.add(combo2);
		frame.add(b1);
		frame.setSize(700,700);
		frame.setLayout(null);
		frame.setVisible(true);
		
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// TODO Auto-generated method stub
					try 
					{
						String name = t1.getText().toString();
						String dob = t2.getText().toString();
						String mail = t3.getText().toString();
						String mob = t4.getText().toString();
						String pass = p1.getText().toString();
						String repass = p2.getText().toString();
						// gender = bg.getSelection().toString();
						
						String name1 = "\n Your Name is: ";
						String dob1 = "\n Your DOB is: ";
						String gender1 = "\n Your Gender is: ";
						String mail1 = "\n Your Mail is: ";
						String mob1 = "\n Your Mobile is: ";
						String pass1 = "\n Your Password is: ";
						String repass1 = "\n Your Re Password is: ";						
						String course1 = " \n Your Course is: ";
						String Branch1 = "\n Your Branch is: ";
						String Semester1 = "\n Your Semester is: ";
						
						if(pass.equals(repass))
						{
							  FileOutputStream out = new FileOutputStream("E://Sujalp.txt"); 
								out.write(name1.getBytes());
								out.write(name.getBytes());
								out.write(mob1.getBytes());
								out.write(mob.getBytes());
								out.write(mail1.getBytes());
								out.write(mail.getBytes());
								out.write(pass1.getBytes());
								out.write(pass.getBytes());
								out.write(repass1.getBytes());
								out.write(repass.getBytes());
								out.write(gender1.getBytes());
								out.write(gender.getBytes());
								out.write(course1.getBytes());
								out.write(course.getBytes());
								out.write(Branch1.getBytes());
								out.write(Branch.getBytes());
								out.write(Semester1.getBytes());
								out.write(Semester.getBytes());
								
								System.out.println("Success");
							}
								
						
						else 
						{
							System.out.println("Error");
						}
					}
					catch (Exception e1) 
					{
						
						// TODO: handle exception
						e1.printStackTrace();
					}
				}
			});
	}
	public static void main(String[] args) 
	{
		new JFrameEx5();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource() == r1)
		{
			gender = "Male";
		}
		if (e.getSource() == r2)
		{
			gender ="Female";
		}
		if(e.getSource()==combo)
		{
			course =combo.getItemAt(combo.getSelectedIndex());
		}
		if(e.getSource() == combo1);
		{
			Branch = combo1.getItemAt(combo1.getSelectedIndex());
			
		}
		if(e.getSource() == combo2)
		{
			Semester = combo2.getItemAt(combo2.getSelectedIndex());
			
		}
		
	}
	
}
