import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class JDBC_Frame extends JFrame {
   Statement stmt = null;
   Connection conn = null;
   ResultSet srs;
   
   JButton bt1 = new JButton("다음");
   JButton bt2 = new JButton("이전");
   JButton bt3 = new JButton("수정");
   JButton bt4 = new JButton("추가");
   JTextField txt1 = new JTextField(10);
   JTextField txt2 = new JTextField(10);
   JTextField txt3 = new JTextField(10);
   JLabel la1 = new JLabel("이름");
   JLabel la2 = new JLabel("학과");
   JLabel la3 = new JLabel("학번");
   String name;
   String dept;
   String id;
   
   MyActionNext lis = new MyActionNext();
   
   JDBC_Frame() {
      setTitle("JDBC EX");
      setSize(500, 400);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(null);
      add(bt1);
      bt1.setSize(80, 30);
      bt1.setLocation(30, 20);
      
      add(bt2);
      bt2.setSize(80, 30);
      bt2.setLocation(130, 20);
      
      add(bt3);
      bt3.setSize(80, 30);
      bt3.setLocation(230, 20);

      add(bt4);
      bt4.setSize(80, 30);
      bt4.setLocation(330, 20);
      
      add(la1);
      la1.setSize(80, 20);
      la1.setLocation(150, 80);
      la1.setFont(new Font("GoThic", Font.ROMAN_BASELINE, 20));
      
      add(la2);
      la2.setSize(80, 20);
      la2.setLocation(150, 140);
      la2.setFont(new Font("GoThic", Font.ROMAN_BASELINE, 20));
      
      add(la3);
      la3.setSize(80, 20);
      la3.setLocation(150, 200);
      la3.setFont(new Font("GoThic", Font.ROMAN_BASELINE, 20));
      
      add(txt1);
      txt1.setSize(100, 30);
      txt1.setLocation(200, 80);
      
      add(txt2);
      txt2.setSize(100, 30);
      txt2.setLocation(200, 140);
      
      add(txt3);
      txt3.setSize(100, 30);
      txt3.setLocation(200, 200);

      bt1.addActionListener(lis);
      bt2.addActionListener(lis);
      bt3.addActionListener(lis);
      bt4.addActionListener(lis);
      
      try {
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=Asia/Seoul&useSSL=false", "root", "1111");
         stmt = conn.createStatement();
         System.out.println("DB 연결 완료");
         srs = stmt.executeQuery("select * from student");
      }
      catch (ClassNotFoundException e) {
         System.out.println("JDBC 드라이버 로드 에러");
      }
      catch (SQLException e) {
         System.out.println("SQL 실행 에러");
      }
   }
   class MyActionNext implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         try {
        	if(e.getSource() == bt1)
        	{
	            if (srs.next()) {
	               name = srs.getString("name");
	               txt1.setText(name);;
	               dept = srs.getString("dept");
	               txt2.setText(dept);;
	               id = srs.getString("id");
	               txt3.setText(id);;
	            }
	            else {
	               txt1.setText("END");
	               txt2.setText("END");
	               txt3.setText("END");
	            }
        	}
        	
        	if(e.getSource() == bt2)
        	{
	            if (srs.previous()) {
	               name = srs.getString("name");
	               txt1.setText(name);;
	               dept = srs.getString("dept");
	               txt2.setText(dept);;
	               id = srs.getString("id");
	               txt3.setText(id);;
	            }
	            else {
	               txt1.setText("NULL");
	               txt2.setText("NULL");
	               txt3.setText("NULL");
	            }
        	}
        	
        	if(e.getSource() == bt3)
        	{
        		name = txt1.getText();
        		dept = txt2.getText();
        		id = txt3.getText();
        		stmt.executeUpdate("update student set name = '" + name + "', dept = '" + dept +"'where id = '" + id + "'");
        	}
        	
        	if(e.getSource() == bt4)
        	{
        		name = txt1.getText();
        		dept = txt2.getText();
        		id = txt3.getText();
        		stmt.executeUpdate("insert into student (name, dept, id) values ('" + name + "','" + dept +"','" + id +"')");
        	}
         }
         catch (SQLException e1) {
            System.out.println("SQL 실행 에러");
         }
      }
   }

}






public class Ex_20231123 {
   public static void main(String[] args) {
      new JDBC_Frame();
     
   }
}