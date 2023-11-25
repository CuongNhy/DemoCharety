package model.bo;

import java.util.ArrayList;

import model.dao.XemDanhSachSinhVienDAO;
import modle.bean.SinhVien;

public class XemDanhSachSinhVienBO {
	XemDanhSachSinhVienDAO xemDanhSachSinhVienDAO = new XemDanhSachSinhVienDAO();
	
	public ArrayList<SinhVien> getAllSinhVien() {
		return xemDanhSachSinhVienDAO.getAllSinhVien();
	}
}

