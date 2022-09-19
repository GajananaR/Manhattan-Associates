package com.gj.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.TreeSet;
import com.gj.model.Book;

public class Database {
	
	public static  TreeSet<Book> data;
	static{
		data=new TreeSet<>();
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini-project","root","Itsmegaja14@");
			PreparedStatement pst = connection.prepareStatement("insert into book values(?,?,?,?)");
			pst.setInt(1,"'getId()'");
			pst.setString(2,"Game of Throne");
			pst.setString(3,"Sumit");
			pst.setDouble(4,789.99);
			int rows= pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini-project","root","Itsmegaja14@");
		PreparedStatement statement=con.prepareStatement("insert into book values(?,?,?,?)");
		int id=b.getBookId();
		String name=b.getName();
		String authorName=b.getAuthorName();
		double price=b.getPrice();
		statement.setInt(1,id);
		statement.setString(2,name);
		statement.setString(3, authorName);
		statement.setDouble(4, price);
		int row=statement.executeUpdate();
		if(row==1)
			System.out.println("New Row inserted Successfully");
		
		
	     data.add(new Book (1,"Game of Throne","Sumit",233.00));
	     data.add(new Book (2,"abc","gaja",278.00));
	     data.add(new Book (3,"Algebra","nithis",567.00));
	     data.add(new Book (4,"algorithms","abhyuday",876.00));
	     data.add(new Book (5,"Java","Chinmay",987.00));
	     data.add(new Book (6,"C program","vignesh",436.00));
	     
	     
	     //System.out.println(db);
	}


}
