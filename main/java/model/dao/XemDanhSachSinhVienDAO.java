package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


import modle.bean.SinhVien;

public class XemDanhSachSinhVienDAO {
	public ArrayList<SinhVien> getAllSinhVien(){
		ArrayList<SinhVien> result = new ArrayList<SinhVien>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SINHVIEN","root","");
			Statement stm = cnn.createStatement();
			System.out.println("ketnoithanhcong");
			String sql = "SELECT * FROM sinhvien";
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				SinhVien sv = new SinhVien();
				sv.setIDSV(rs.getString(1));
				sv.setName(rs.getString(2));
				sv.setAge(rs.getString(3));
				sv.setUniversity(rs.getString(4));
				result.add(sv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
