package com.itcast.server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.itcast.dao.DBConnection;
import com.itcast.dao.UpdateResultSet;
import com.itcast.pojo.FruitDB;
import com.itcast.view.FruitMainPage;

public class UpdateButtonServer implements ActionListener{
	FruitMainPage fruitMainPage;	//����һ�����������

	public void setFruitMainPage(FruitMainPage fruitMainPage) {
		this.fruitMainPage = fruitMainPage;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		FruitDB fruitDB = new FruitDB();	//�½�һ��pojo�־û������
		fruitDB.setId(Integer.parseInt(fruitMainPage.updatIdField.getText()));
		fruitDB.setName(fruitMainPage.updatNameField.getText());
		fruitDB.setPrice(Double.parseDouble(fruitMainPage.updatPriceField.getText()));
		fruitDB.setUnit(fruitMainPage.updatUnitField.getText());
		DBConnection connection = new DBConnection();	//�������ݿ�����
		new UpdateResultSet(fruitDB, connection.getConnection());	//������Ӳ���
		fruitMainPage.setVisible(false);
		fruitMainPage.dispose();
		new FruitMainPage().setVisible(true);
	}
}
