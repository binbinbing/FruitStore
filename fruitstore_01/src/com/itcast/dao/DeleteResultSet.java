package com.itcast.dao;

import java.sql.SQLException;

public class DeleteResultSet {
	public DeleteResultSet(int deleteId,  java.sql.Connection connection) {
		java.sql.PreparedStatement preparedStatement = null;
		String deleteSQL="delete from fruit where id=?";
		try {
			preparedStatement=connection.prepareStatement(deleteSQL);
			preparedStatement.setInt(1, deleteId);
			int check = preparedStatement.executeUpdate();
			if (check!=0)
				System.out.println("����ɾ���ɹ�!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			new DBReplease(preparedStatement, connection);
			System.out.println("���ݿ���Դ�رճɹ�!");
		}
	}
}
