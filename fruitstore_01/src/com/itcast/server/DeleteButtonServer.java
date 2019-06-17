package com.itcast.server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.itcast.dao.DBConnection;
import com.itcast.dao.DeleteResultSet;
import com.itcast.view.FruitMainPage;

public class DeleteButtonServer implements ActionListener{
	FruitMainPage fruitMainPage;	//����һ�����������

	public void setFruitMainPage(FruitMainPage fruitMainPage) {
		this.fruitMainPage = fruitMainPage;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int deleteId=Integer.parseInt(fruitMainPage.deleteIdField.getText());
		DBConnection connection = new DBConnection();	//�������ݿ�����
		new DeleteResultSet(deleteId, connection.getConnection());	//������Ӳ���
		fruitMainPage.setVisible(false);
		fruitMainPage.dispose();
		new FruitMainPage().setVisible(true);
	}
}
