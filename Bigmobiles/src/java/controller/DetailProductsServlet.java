/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import beans.BrandFacadeLocal;
import beans.CategoryFacadeLocal;
import beans.ProductsFacadeLocal;
import beans.RatingFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Products;

/**
 *
 * @author An
 */
public class DetailProductsServlet extends HttpServlet {
    @EJB
    private CategoryFacadeLocal categoryFacade;
    @EJB
    private BrandFacadeLocal brandFacade;
    @EJB
    private ProductsFacadeLocal productsFacade;
    @EJB
    private RatingFacadeLocal ratingFacade;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String id = request.getParameter("productID");
           HttpSession session = request.getSession(false);
           String code = (String) session.getAttribute("cusId");
           Products product = productsFacade.find(id);
           request.setAttribute("product", product);
           double rating = ratingFacade.agvStar(id);
           request.setAttribute("rating", rating);
           long total = ratingFacade.totalvote(id);
           request.setAttribute("total", total);
           long [] vote = new long[10];
            for (int i = 1; i <= 5; i++) {
                vote[i] = ratingFacade.countvote(i, id);
                request.setAttribute("star"+i,vote[i]);
            }
            if (code==null) {
                request.getRequestDispatcher("details.jsp").forward(request, response);
            }
            else{
                String code1  = request.getSession(false).getAttribute("cusId").toString();
                int madanhgia = ratingFacade.madanhgia(code1, id);
                //Rating ratings = ratingFacade.find(madanhgia);
                int sao = (int) ratingFacade.sao(code1, id);
                request.setAttribute("ratings",madanhgia);
                request.setAttribute("sao", sao);
                request.getRequestDispatcher("details.jsp").forward(request, response);
                
            }
           request.getRequestDispatcher("details.jsp").forward(request, response);
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
