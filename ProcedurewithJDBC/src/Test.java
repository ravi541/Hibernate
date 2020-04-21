import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;



public class Test {

	public static void main(String[] args) {
		
		try 
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle09");
		java.sql.CallableStatement cst=con.prepareCall("{call getsal(?,?)}");
		cst.setInt(1,6);
		cst.registerOutParameter(2, Types.FLOAT);
		cst.executeQuery();
		System.out.println(cst.getFloat(2));
		
			
			
		} catch (Exception e) {
			
		}

	}

}
