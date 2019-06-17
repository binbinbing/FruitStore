package com.itcast.server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.itcast.dao.AddResultSet;
import com.itcast.dao.DBConnection;
import com.itcast.pojo.FruitDB;
import com.itcast.view.FruitMainPage;

public class AddButtonServer implements ActionListener {
	FruitMainPage fruitMainPage;

	public void setFruitMainPage(FruitMainPage fruitMainPage) {
		this.fruitMainPage = fruitMainPage;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		FruitDB fruitDB = new FruitDB();	//�½�һ��pojo�־û������
		fruitDB.setId(Integer.parseInt(fruitMainPage.addIdField.getText()));
		fruitDB.setName(fruitMainPage.addNameField.getText());
		fruitDB.setPrice(Double.parseDouble(fruitMainPage.addPriceField.getText()));
		fruitDB.setUnit(fruitMainPage.addUnitField.getText());
		DBConnection connection = new DBConnection();	//�������ݿ�����
		new AddResultSet(fruitDB, connection.getConnection());	//������Ӳ���
		fruitMainPage.setVisible(false);
		fruitMainPage.dispose();
		new FruitMainPage().setVisible(true);
	}
}
