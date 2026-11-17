import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	
	
	public static void getAllData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/kunaldb","root","abc123");

		
		String sql="SELECT * FROM emp";
		
		Statement st=co.createStatement();

		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		
		
		st.close();
		co.close();
	}

	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/kunaldb","root","abc123");
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee ID:");
		Integer id = Integer.parseInt(sc.next());

		System.out.println("Enter Employee Name:");
		String name = sc.next();

		System.out.println("Enter Employee City:");
		String city = sc.next();

		
		/*String sql="insert into emp values("+id+",'"+name+"','"+city+"')";
		
		Statement st=co.createStatement();

		int a = st.executeUpdate(sql);*/
		
		String sql="insert into emp values(?,?,?)";
		
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, city);
		
		
		int a = ps.executeUpdate();
		
		
		if(a>0)
			System.out.println("Data inserted !");
		else 
			System.out.println("Data Not inserted !");
		
		ps.close();
		co.close();
		
		getAllData();
		
	}

}
