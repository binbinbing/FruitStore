package com.itcast.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

//���ݿ��ѯ����
public class SelectResultSet {
	ResultSet resultSet = null;

	public String[][] selectResultSet(String selectSQL,  java.sql.Connection connection) {
		java.sql.PreparedStatement preparedStatement = null;
		String[][] tableData=new String[40][4];
		try {
			preparedStatement=connection.prepareStatement(selectSQL);
			resultSet = preparedStatement.executeQuery();
			int i=0;
			while(resultSet.next()) {
				tableData[i][0]=String.valueOf(resultSet.getInt("id"));
				tableData[i][1]=resultSet.getString("name");
				tableData[i][2]=String.valueOf(resultSet.getDouble("price"));
				tableData[i][3]=resultSet.getString("unit");
				i++;
			}
			System.out.println("����ʼ���ɹ�!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			tableData=null;
		} finally {
			new DBReplease(resultSet, preparedStatement, connection);
			System.out.println("���ݿ���Դ�رճɹ�!");
		}
		return tableData;
	}
}
