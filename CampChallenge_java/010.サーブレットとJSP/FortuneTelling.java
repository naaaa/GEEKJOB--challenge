/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import org.camp.servlet.ResultData;

/**
 *
 * @author itounanako
 */
public class FortuneTelling extends HttpServlet {

    private String result = "/WEB-INF/jsp/FortuneTellingResult.jsp";
    private int index;
    private String[] luckList;

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
        PrintWriter out = response.getWriter();
        
    
    }
    
        
    @Override
     protected void doGet(HttpServletRequest request,HttpServletResponse response)
     throws ServletException,IOException{
         
             //大吉・中吉・小吉・半吉・末吉・末小吉・凶・小凶・半凶・末凶・大凶
            String luckList[]={"大吉","中吉","小吉","吉","半吉","末小吉","凶","小今日","半凶","末凶","大凶"};
            //乱数クラス生成
            Random rand=new Random();
            //乱数取得
            Integer index=rand.nextInt(luckList.length);
                        
     //リクエストスコープへ結果を設定  
        ResultData data=new ResultData();
        
        //ResultDataクラスのsetterを利用して実施日と運勢を記録
        data.setD(new Date());
        data.setLuck(luckList[index]);
        
        //占い結果をリクエストスコープに登録
        request.setAttribute("DATA",data);
          
        //SetvletクラスからJSPへ処理を移行
        RequestDispatcher rd=request.getRequestDispatcher(result);
        rd.forward(request,response);    
    }
     
    
     
    @Override
     protected void doPost(HttpServletRequest request,HttpServletResponse response)
     throws ServletException,IOException{     
     
            
         
    }
}

            
            
            
   
    