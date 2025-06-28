package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
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
			
			// Insert data
			// Scanner sc = new Scanner(System.in);
			// String name = sc.nextLine();
			// int id = sc.nextInt();
			
			// String insertData = "insert into Student(id,name) values ("+id+",'"+name+"')";
			// st.executeUpdate(insertData);
			// System.out.println("data inserted");
			
			// update data
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			int id = sc.nextInt();
			
			String updateData = "update Student set name = '"+name+"' where id="+id;
			
			st.executeUpdate(updateData);
			
			System.out.println("Data Updated");
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}

}
