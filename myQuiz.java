/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GAYATHRI
 */
public class myQuiz extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet myQuiz</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet myQuiz at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        //processRequest(request, response
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int cnt=0;
        String tr="",sp="",ti="", am="", me="",la="",nu="",da="",qu="",dot="";
        tr=request.getParameter("train");
        sp=request.getParameter("speed");
        ti=request.getParameter("time");
        am=request.getParameter("amount");
        me=request.getParameter("meter");
        la=request.getParameter("lad");
        nu=request.getParameter("num");
        da=request.getParameter("day");
        qu=request.getParameter("ques");        
        dot=request.getParameter("dot");
       if(tr.equals("fraction4")){
           out.println("Your fourth answer is correct!<br/>");
           cnt++;
       }
           else
           out.println("The correct answer for the 1st question is 8/15.<br/>");
           
       if(sp.equals("fra3")){
           out.println("Your third answer is correct!<br/>");
           cnt++;
       }
           else
           out.println("The correct answer for the 2nd question is 9 3/5 days.<br/> ");
           
       if(ti.equals("number2")){
           out.println("Your 2nd answer is correct!<br/>");
           cnt++;
       }
           else
           out.println("The correct answer for the 1st question is 15 days.<br/>");
           

if(am.equals("count2")){
           out.println("Your second answer is correct!<br/>");
           cnt++;
       }
           else
           out.println("The correct answer for the 1st question is 400.<br/>");
           
        if(me.equals("meter1")){
           out.println("Your first answer is correct!<br/>");
           cnt++;
       }
           else
           out.println("The correct answer for the 5th question is 10.<br/>");
           
        if(la.equals("cost2")){
           out.println("Your second answer is correct!<br/>");
           cnt++;
       }
           else
           out.println("The correct answer for the 6th question is 2400.<br/>");
        
        if(nu.equals("num4")){
           out.println("Your fourth answer is correct!<br/>");
           cnt++;
       }
           else
           out.println("The correct answer for the 7th question is 19.<br/>");
           
        if(da.equals("days3")){
           out.println("Your third answer is correct!<br/>");
           cnt++;
       }
           else
           out.println("The correct answer for the 8th question is friday.<br/>");
        
        if(qu.equals("cou4")){
           out.println("Your fourth answer is correct!<br/>");
           cnt++;
       }
           else
           out.println("The correct answer for the 9th question is sunday.<br/>");
        
        if(dot.equals("week")){
                out.println("Your second answer is correct!<br/>");
                cnt++;
        }
            else
                 out.println("The correct answer for the 10th question is saturday.<br/>");
          
        if(cnt==10)
            out.println("<h1>Congratulation!!!</h1>");
        else
            out.println("<h1>You have scored "+cnt+" points.</h1>");
           
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
