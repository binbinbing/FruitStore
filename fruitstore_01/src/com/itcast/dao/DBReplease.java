package com.itcast.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;

public class DBReplease {
	// �ͷŽ������Դ
	public DBReplease(ResultSet resultSet) {
		if (resultSet != null)
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	// �ͷŽ��������Դ,
	public DBReplease(PreparedStatement preparedStatement) {

		if (preparedStatement != null)
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	} // �ͷ����Ӷ�����Դ,

	public DBReplease(Connection connection) {

		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	// �ͷ�������Դ,�������Դ,���������Դ
		public DBReplease(java.sql.PreparedStatement preparedStatement, Connection connection) {
			if (preparedStatement != null)
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	// �ͷ�������Դ,�������Դ,���������Դ
	public DBReplease(ResultSet resultSet, java.sql.PreparedStatement preparedStatement, Connection connection) {
		if (resultSet != null)
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (preparedStatement != null)
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
