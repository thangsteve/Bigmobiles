/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import beans.CategoryFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.OrderDetails;
import model.Products;
import tool.CategoryReport;

/**
 *
 * @author An
 */
public class AdminReportByCategory extends HttpServlet {
    @EJB
    private CategoryFacadeLocal categoryFacade;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ArrayList<CategoryReport> list = new ArrayList<CategoryReport>();
            double total = 0.0D;
             for (Category c : categoryFacade.findAll()) {
                String cate = c.getCategoryName();
                double income = 0.0D;
                for (Products p : c.getProductsCollection()) {
                    
                    for (OrderDetails od : p.getOrderDetailsCollection()) {
                        income += od.getTotal() * od.getQuantity();
                    }
                }
                CategoryReport ca = new CategoryReport(cate, income);
                list.add(ca);
                total += income;
                request.setAttribute("total", total);
            }
           
           
            request.setAttribute("list", list); //lưu tên hãng+doanh thu vào biến lista
            request.getRequestDispatcher("AdminReportByCategory.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
