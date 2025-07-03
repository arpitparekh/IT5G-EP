package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RevisionClass {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/paruldb";
		String user = "root";
		String password = "Walden0042$$";
		
		try {
			Connection c = DriverManager.getConnection(url, user, password);
			Statement st = c.createStatement();
			
//			String createTable = "create table Employee(id int,name varchar(50))";
//			st.executeUpdate(createTable);
//			System.out.println("table Created");
			
//			Scanner sc = new Scanner(System.in);
//			String name = sc.nextLine();
//			int id = sc.nextInt();
//			
//			String insertData = "insert into Employee(id,name) values ("+id+",'"+name+"')";
//			st.executeUpdate(insertData);
//			System.out.println("Data Inserted");
			
//			String insertData = "insert into Employee(id,name) values (?,?)";
//			
//			PreparedStatement pst = c.prepareStatement(insertData);
//			
//			System.out.println("How many data you want to enter?");
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();  // 5
//			sc.nextLine(); // consume the free space
//			
//			for(int i=1;i<=num;i++) {
//				System.out.println("Please Enter Name");
//				String name = sc.nextLine();
//				System.out.println("Please Enter ID");
//				int id = sc.nextInt();
//				sc.nextLine();  // add this 
//				pst.setInt(1, id);
//				pst.setString(2, name);
//				pst.addBatch();
//			}
//			
//			pst.executeBatch();
//			
//			System.out.println("Data inserted");

			String displayTable = "select * from Employee";
			
 			ResultSet result =  st.executeQuery(displayTable);
			
			while(result.next()) {
				System.out.println(result.getInt("id"));
				System.out.println(result.getString("name"));
			}
			
			
		}catch(SQLException e) {
			
		}
		

	}

}
