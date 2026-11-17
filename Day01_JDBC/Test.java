import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//driver register
		String driver="com.mysql.jdbc.Driver";
		
		Class.forName(driver);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kunaldb","root","abc123");
		
		Statement st=con.createStatement();
		
		String sql="insert into emp values(103,'ved','nagpur')";
		//String sql="delete from emp where eid=102";
		int a = st.executeUpdate(sql);  //table add data /delete /update 
		
		if(a>0)
			System.out.println("Data is inserted");
		else
			System.out.println("Data is Not inserted");
		
		
		con.close();
		
		System.out.println("done");

	}

}
