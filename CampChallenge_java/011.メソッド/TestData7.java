/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author itounanako
 */
public class TestData7 extends HttpServlet {

       //配列を返すメソッド 引数は文字列型
    String[] profile(String[] args) {
        
        //戻り値//
        return null;
       
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String a[]=new String[3];
        a[0]="ID:1111";
        a[1]="2018/6/8";
        a[2]="東京都九段下";
        out.println(a[0]+a[1]+a[2]);
        
        String b[]=new String[3];
        b[0]="ID:2222";
        b[1]="2018/6/9";
        b[2]="東京都";
        out.println(b[0]+b[1]+b[2]);
        
        String c[]=new String[3];
        c[0]="ID:3333";
        c[1]="2018/6/10";
        c[2]="null";
        
        for(int i=0;i<c.length;i++){
        //continue;で画面表示をスキップ
        if(i==2){
        continue;    
        }out.println(c[i]);       
        
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
