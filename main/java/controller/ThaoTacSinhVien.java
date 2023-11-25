package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bo.XemDanhSachSinhVienBO;
import modle.bean.SinhVien;


@WebServlet("/ThaoTacSinhVien")
public class ThaoTacSinhVien extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String modelParameter1 = request.getParameter("Model1");
        String modelParameter2 = request.getParameter("Model2");

        if (modelParameter1 != null && modelParameter1.equals("1")) {
            XemDanhSachSinhVienBO xemDanhSachSinhVienBO = new XemDanhSachSinhVienBO();
            ArrayList<SinhVien> sinhVienArray = xemDanhSachSinhVienBO.getAllSinhVien();
            request.setAttribute("sinhVienArray", sinhVienArray);
            String destination = "/XemThongTinSinhVien.jsp";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        } 
        else if (modelParameter2 != null && modelParameter2.equals("2")){
            // Xử lý khi không nhận được Model1 (hoặc không đúng giá trị)
            // Có thể chuyển hướng (redirect) hoặc xử lý khác tùy vào logic của bạn
            // Ví dụ:
            // response.sendRedirect("/errorPage.jsp");
        }
    }
}
