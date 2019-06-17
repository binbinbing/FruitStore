package com.itcast.dao;

import java.sql.SQLException;
import com.itcast.pojo.FruitDB;

public class AddResultSet {
	public AddResultSet(FruitDB fruit, java.sql.Connection connection) {
		java.sql.PreparedStatement preparedStatement = null;
		try {
			System.out.println("-----��������׼�����--------");
			String insertSql = "insert into fruit values (?,?,?,?)";
			preparedStatement = connection.prepareStatement(insertSql);
			preparedStatement.setInt(1, fruit.getId());
			preparedStatement.setString(2, fruit.getName());
			preparedStatement.setDouble(3, fruit.getPrice());
			preparedStatement.setString(4, fruit.getUnit());
			int check = preparedStatement.executeUpdate();
			if (check != 0)
				System.out.println("������ӳɹ�!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();

			System.out.println("�������ʧ��!");
		} finally {
			new DBReplease(preparedStatement, connection);
			System.out.println("���ݿ���Դ�رճɹ�!");
		}
	}

	public AddResultSet() {

	}
}
