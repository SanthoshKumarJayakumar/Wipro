package Milestone2;
import java.sql.*;  
class InsertPrepared{  
	public static void main(String args[]){  
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.16.7.154:1521:orcl","cse36","cse36");
  			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from student");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
				con.close();  
		}
		catch(Exception e){
			System.out.println(e);
		}  
	}  
} 