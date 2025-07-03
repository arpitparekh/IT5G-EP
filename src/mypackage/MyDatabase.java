package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyDatabase {

	public static void main(String[] args) {
		
		// create a connection
		// url
		// username // root
		// password // Walden0042$$
		String url = "jdbc:mysql://localhost:3306/paruldb";
		String username = "root";
		String password  = "Walden0042$$";
		
		try {
			Connection c = DriverManager.getConnection(url, username, password);
			
			Statement st = c.createStatement();
			
			// table create
			//String createtable = "create table Student(id int,name varchar(50))";
			//st.executeUpdate(createtable);
			// System.out.println("Table Created");
			
			// Insert data  old
//			Scanner sc = new Scanner(System.in);
//			String name = sc.nextLine();
//			int id = sc.nextInt();
//			
//			String insertData = "insert into Student(id,name) values ("+id+",'"+name+"')";
//			st.executeUpdate(insertData);
//			System.out.println("data inserted");
//			
			
			// Insert data new (preparestatement)
//			String insertData = "insert into Student(id,name) values (?,?)";
//			PreparedStatement pst = c.prepareStatement(insertData);
//			System.out.println("How many data you want to enter?");
//			
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();  // 5
//			sc.nextLine();
//			
//			for(int i=1;i<=num;i++) {
//				String name = sc.nextLine();
//				int id = sc.nextInt();
//				sc.nextLine();
//				pst.setInt(1, id);
//				pst.setString(2, name);
//				pst.addBatch();
//			}
//			
//			pst.executeBatch();
//			
//			System.out.println("Data inserted successfully");
			
			
			// update data
			// Scanner sc = new Scanner(System.in);
//			String name = sc.nextLine();
//			int id = sc.nextInt();
//			
//			String updateData = "update Student set name = '"+name+"' where id="+id;
//			
//			st.executeUpdate(updateData);
//			
//			System.out.println("Data Updated");
			
			// delete data
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			String deleteData = "delete from Student where id = "+id;
			st.executeUpdate(deleteData);
			System.out.println("Data Deleted");
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}

}
