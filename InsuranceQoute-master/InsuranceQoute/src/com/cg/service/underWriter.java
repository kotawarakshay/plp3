package com.cg.service;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.bean.PolicyBean;
import com.cg.bean.QuestionBean;
import com.cg.dao.DaoInsuranceImpl;
import com.cg.dao.IDaoInsurance;
import com.cg.util.DBConnection;

public class underWriter
{
	static IDaoInsurance iDao=new DaoInsuranceImpl();
	public ArrayList<PolicyBean> createPolicy(String businessSegment) throws ClassNotFoundException, IOException, SQLException{
		
		ArrayList<PolicyBean> al = new ArrayList<>();
		al = iDao.createPolicy(businessSegment);
		return al;
	}
	public int PolicyQuestion(QuestionBean question) {
		
		int al1 = 0;
		 al1=iDao.PolicyQuestion(question);
		 return al1;
	}
}


/*public ArrayList<PolicyBean> createPolicy(){
	Connection con = DBConnection.getConnection();
	PreparedStatemenet preparedStatement=null;  
	ResultSet rs= null;
	try {
		preparedStatement = con.prepareStatement("select * from businesssegment");
		rs = preparedStatemenet.executeQuery();
		ArrayList<PolicyBean> al = new ArrayList<>();
		while(rs.hasNext()) {
			BusinessSegement bs = new BusinessSegement();
			bs.setname(rs.getString(1));
			bs.setId(rs.getString(2));
			al.add(bs);
		}
		return al;
	}
	catch(Exception e) {
		
	}
}*/