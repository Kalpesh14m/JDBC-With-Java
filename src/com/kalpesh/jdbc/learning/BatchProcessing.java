/*Batch Processing in JDBC:
 * Instead of executing a single query, we can execute a batch (group) of queries. 
 * It makes the performance fast.
 * 
 * The java.sql.Statement and java.sql.PreparedStatement interfaces provide methods for batch processing.
 * 
 * Methods of Statement interface:
		void addBatch(String query) :	It adds query into batch.
		int[] executeBatch() :	It executes the batch of queries.
*/

package com.kalpesh.jdbc.learning;

import java.sql.*;

class BatchProcessing {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcLearning", "root", "root");
		con.setAutoCommit(false);

		Statement stmt = con.createStatement();
		stmt.addBatch("insert into emp values(190,'abhi','ABC')");
		stmt.addBatch("insert into emp values(191,'umesh','PQR')");

		stmt.executeBatch();// executing the batch
		System.out.println("Batch Run Successfull!!");

		con.commit();
		con.close();
	}
}