import java.sql.*;

public class DBAccess
{
    public static void main (String[] args)
    {
        Connection conn = null;

        try
        {
            String userName = "root";
            String password = "monu";
            String url = "jdbc:mysql://localhost/test";
            Class.forName ("com.mysql.jdbc.Driver"). newInstance ();
            conn = DriverManager.getConnection (url, userName, password);
        
            System.out.println ("Database connection established");
            PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
            ps.setObject(1,2);
            ps.setObject(2,"monu");            
            ps.setObject(3,"monu@gmail");
          //  Statement s = conn.createStatement ();
            @SuppressWarnings("unused")
			int  count;
           count = ps.executeUpdate ();
            ps.executeQuery ("SELECT * FROM student");
            ResultSet rs = ps.getResultSet ();
            while (rs.next ())
            {
                int idVal = rs.getInt ("id");
                String nameVal = rs.getString ("name");
                String catVal = rs.getString ("email");
                System.out.println (
                        "id = " + idVal
                        + ", name = " + nameVal
                        + ", email = " + catVal);
           //     ++count;
            }
            
            System.out.println("value "+ count);
            rs.close ();
            ps.close ();

           
            //s.close ();
            System.out.println (count + " rows were inserted");

        }
        catch (Exception e)
        {
            System.err.println ("Cannot connect to database server");
            System.out.println(e);
        }
        finally
        {
            if (conn != null)
            {
                try
                {
                    conn.close ();
                    System.out.println ("Database connection terminated");
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }
    }
} 
