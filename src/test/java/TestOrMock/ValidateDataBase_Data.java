package TestOrMock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ValidateDataBase_Data {
@Test
public void DBconnetion() throws SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name here : ");
    String expected = sc.next();
	
	Driver dbdriver=new Driver();
	DriverManager.registerDriver(dbdriver);
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
	Statement statement = connection.createStatement();
	


	String query="select*from employe";
	String query1 = "insert into employe values('"+expected+"')";
	//String expected = "prakash";
	boolean flag=false;
	ResultSet result = statement.executeQuery(query);
	while(result.next()) {
		if(result.getString(1).equals(expected)) {
			flag=true;
			break;
		}
	}if(flag) {
		System.out.println("Data is already present in DB");
	}else {
		System.out.println("Data is not present in DB, Updated here : ");
		statement.executeUpdate(query1);
	}
	
}
}
