import java.sql.*;
import java.util.Scanner;
public class MyConnect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MySql connection example");
		Connection conn = null;
		
        
        try{
        	
        	String userName = "root";
            String password = "monu";
            String url = "jdbc:mysql://localhost/testdb";
        	Class.forName("com.mysql.jdbc.Driver").newInstance();
        	conn = DriverManager.getConnection(url,userName,password);
        	System.out.println("connected to database");
        	Statement st = conn.createStatement();
        //	Scanner sc = new Scanner(System.in);
        	//System.out.println("Enter the db name");
        //	String database = sc.next();
        	//st.executeUpdate("create database "+database);
        	//System.out.println(" db created");
        //	st.executeUpdate("create table student(id INT(5), name VARCHAR(20),email VARCHAR(20))");
        	//System.out.println("TABLE CREATED");
        
        /*	st.executeUpdate("insert into student values(1,'monu1','monu1@gmail')");
        	st.executeUpdate("insert into student values(2,'monu2','monu2@gmail')");
        	st.executeUpdate("insert into student values(3,'monu3','monu3@gmail')");
        	st.executeUpdate("insert into student values(4,'monu4','monu4@gmail')");
        	st.executeUpdate("insert into student values(5,'monu5','monu5@gmail')");
        	*/
        	st.executeUpdate("update student set email='abcded@gmail.com' where id=1");
        	st.executeQuery("select * from student");
        	ResultSet rs = st.getResultSet();
        	while(rs.next()){
        		int idval = rs.getInt("id");
        		String nameval =rs.getString("name");
        		String emval = rs.getString("email");
        		System.out.println("id: "+idval+"name: "+nameval+"email: "+emval);
        	}
        	
        	conn.close();
        	System.out.println("disconnected from database");
        }
        catch(Exception e){
        	e.printStackTrace();
        }

	}

}
