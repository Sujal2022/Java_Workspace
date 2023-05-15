package Module_3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Register implements ItemListener
{
	
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1,b2,b3,b4,b5,b6;
	JTextField t1,t2,t3,t4;
	JRadioButton r1,r2;
	ButtonGroup bg;
	JTable jt;
	JScrollPane jscroll;
	DefaultTableModel model;
	String Gender;
	
	public Register()
	{
		frame = new JFrame("Register Form");
		
		l1 = new JLabel("Registration Form");
		l1.setBounds(21, 10, 207, 23);
		l1.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		l2 = new JLabel("ID");
		l2.setBounds(10, 55, 84, 23);
		l2.setFont(new Font("Tahoma", Font.BOLD, 17));
		t1 = new JTextField();
		t1.setBounds(89, 55, 126, 24);
		
		l3 = new JLabel("Name");
		l3.setBounds(10, 95, 84, 23);
		l3.setFont(new Font("Tahoma", Font.BOLD, 17));
		t2 = new JTextField();
		t2.setBounds(89, 100, 126, 24);
		
		l4 = new JLabel("Gender");
		l4.setBounds(10, 135, 84, 23);
		l4.setFont(new Font("Tahoma", Font.BOLD, 17));
		r1 = new JRadioButton("Male");
		r1.setBounds(89, 139, 59, 21);
		r1.setFont(new Font("Tahoma", Font.BOLD, 14));
		r2 = new JRadioButton("Female");
		r2.setBounds(150, 139, 103, 21);
		r2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		
		l5 = new JLabel("Address");
		l5.setBounds(10, 175, 84, 23);
		l5.setFont(new Font("Tahoma", Font.BOLD, 17));
		t3 = new JTextField();
		t3.setBounds(89, 180, 126, 24);
		
		l6 = new JLabel("Contact");
		l6.setBounds(10, 215, 84, 23);
		l6.setFont(new Font("Tahoma", Font.BOLD, 17));
		t4 = new JTextField();
		t4.setBounds(89, 220, 126, 24);
		
		b1 =new JButton("Exit");
		b1.setBounds(10, 272, 99, 25);
		
		b2 =new JButton("Register");
		b2.setBounds(119, 272, 126, 25);
		b2.addItemListener(this);
		
		b3 = new JButton("Delete");
		b3.setBounds(10, 307, 99, 25);
		
		b4 = new JButton("Update");
		b4.setBounds(119, 307, 126, 25);
		
		b5 = new JButton("Reset");
		b5.setBounds(74, 341, 99, 21);
		
		b6 = new JButton("Refresh Table");
		b6.setBounds(500, 399, 300, 20);
		
		
		String column[] = {"S.No","ID","Name","Gender","Address","Contact"};
		
		model = new DefaultTableModel(column,0);
		jt = new JTable(model);
		jt.setBounds(350, 13, 650, 377);
		jt.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));
		jt.repaint();
		model.setColumnIdentifiers(column);
		jt.setModel(model);
		jscroll = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jscroll.setBounds(350, 13, 650, 377);
		
		frame.add(jscroll);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(r1);
		frame.add(r2);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		
		
		frame.setSize(913, 478);
		frame.setLayout(null);
		frame.setVisible(true);
		
		//Exit
		b1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(JOptionPane.showConfirmDialog(b1, "confirm if you want exit","Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}	
			}
		});
		
		//Register
		b2.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String host="jdbc:mysql://localhost:3306/";
				String db="registerform";
				String url = host+db;
				
				String ID = t1.getText().toString();
				String Name = t2.getText().toString();
				String Address = t3.getText().toString();
				String Contact = t4.getText().toString();
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String sql="insert into studendform value(null,'"+ID+"','"+Name+"','"+Gender+"','"+Address+"','"+Contact+"')";
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "Query Executed");
					if(status>0)
					{
						frame.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				}
				catch (Exception e2) 
				{
					JOptionPane.showMessageDialog(null, e2.getMessage());
					// TODO: handle exception
				}
			}
		});
		//Delete
		b3.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String host="jdbc:mysql://localhost:3306/";
				String db="registerform";
				String url = host+db;
				
				String ID = t1.getText().toString();
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String sql = "delete from studendform where ID = "+ID+"";
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
					if(status>0)
					{
						frame.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				}
				catch (Exception e1) 
				{
					
					//e1.printStackTrace();
					
				}
			}
		});
		
		// Update
		b4.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				String host="jdbc:mysql://localhost:3306/";
				String db="registerform";
				String url = host+db;
				
				String myID = t1.getText().toString();
				String myName = t2.getText().toString();
				String myGender;
				if(r1.isSelected())
				{
					myGender = r1.getText();
				}
				else
					myGender = r2.getText();
				
				String myAddress = t3.getText().toString();
				String myContact = t4.getText().toString();
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String sql = "update studendform set Name= '"+myName+"',Gender= '"+Gender+"',Address='"+myAddress+"',Contact= "+myContact+" where ID= '"+myID+"'";
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
					//JOptionPane.showMessageDialog(frame, "Updated Successfully");
					if(status>0)
					{
						frame.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
					
				} 
				catch (Exception e2) 
				{
					System.out.println(e2);
				}		
			}
		});
		
		// Reset
		b5.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				bg.clearSelection();
			}
			
		});
		//Refresh Table
		b6.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{ 
				try
				{
					String sqlviewdata = "select * from studendform ";
					try 
					{
						String host="jdbc:mysql://localhost:3306/";
						String db="registerform";
						String url = host+db;
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection(url, "root", "");
						Statement stmt = con.createStatement();
						ResultSet rs = stmt.executeQuery(sqlviewdata);
						model.setRowCount(0);
									
						while(rs.next())
						{
							model.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getLong(6)});
						}
					}
					catch (Exception e1) 
					{
						System.out.println(e1);
					}
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
					
	}
	public static void main(String[] args) 
	{
		new Register();
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource() == r1)
		{
			Gender = "Male";
		}
		if(e.getSource() == r2)
		{
			Gender = "Female";
		}
	} 
}
