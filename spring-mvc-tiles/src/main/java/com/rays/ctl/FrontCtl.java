package com.rays.ctl;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class FrontCtl extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("FrontCtl");

		HttpSession session = request.getSession();

		/*
		 * String uri = request.getRequestURI(); request.setAttribute("uri", uri);
		 */

		if (session.getAttribute("user") == null) {
			request.setAttribute("error", "Session expired login again..");
			RequestDispatcher rd = request.getRequestDispatcher("/Login");
			rd.forward(request, response);
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

}
