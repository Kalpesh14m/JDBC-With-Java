package com.kalpesh.jdbc.learning;

import java.sql.*;

public class CallableStatementDemo {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcLearning", "root", "root");

		CallableStatement stmt = con.prepareCall("{call insertR(?,?)}");
		stmt.setInt(1, 10);
		stmt.setString(2, "Bunny");
		stmt.execute();

		System.out.println("success!!");
	}
}

//DELIMITER $$

//CREATE PROCEDURE insertR(IN id int,IN name varchar(200) )
//	BEGIN
//		INSERT INTO emp(id,name) VALUES(id,name);
//	END$$  

//DELIMITER ;
