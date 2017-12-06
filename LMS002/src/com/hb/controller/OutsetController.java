package com.hb.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/startweb.do")
public class OutsetController extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {

	
	File folders = new File("C:/Users/hb/git/HB6_2017_Project2/LMS002/WebContent/upload");
	String menulist="";
	if(folders.exists()){
//		System.out.println(folders.getCanonicalPath());
		String[] list= folders.list();
		System.out.println(list.length);
//		for(int i =0; i<list.length; i++){
//			System.out.println(list[i]);
//			menulist+=list[i]+"-";
//		}
		req.setAttribute("loadmenu", list);
		req.getRequestDispatcher("index01.jsp").forward(req, resp);
		
	}else{
		System.out.println("no upload folder");
		//File IO fail scenario...
	}
	
}
}
