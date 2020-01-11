package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.mhbean;
import bo.mhbo;

/**
 * Servlet implementation class t2controller
 */
@WebServlet("/t2controller")
public class t2controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public t2controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		mhbo dsmh = new mhbo();
		try {
			String m = request.getParameter("mmh");
			if(m!=null) {
				for(mhbean i : dsmh.getMH()) {
					if(i.getMamh().trim().equals(m.trim())) {
						request.setAttribute("mh", i);
					}
				}
			}
			String mamh = request.getParameter("mamh");
			if(mamh!=null) {
				String tenmh = request.getParameter("tenmh");
				int sotc = Integer.valueOf(request.getParameter("sotc"));
				int sob = Integer.valueOf(request.getParameter("sob"));
				int sosvtt = Integer.valueOf(request.getParameter("sosvtt"));
				int sosvtd = Integer.valueOf(request.getParameter("sosvtd"));
				int sosvdk = Integer.valueOf(request.getParameter("sosvdk"));
				Date ngaynh = Date.valueOf(request.getParameter("ngaynh"));
				Date ngayhh = Date.valueOf(request.getParameter("ngayhh"));
				mhbean emh = new mhbean(mamh, tenmh, sotc, sob, sosvtt, sosvtd, sosvdk, ngaynh, ngayhh);
				int n =	dsmh.suaMH(emh);
				if(n==0)
					request.setAttribute("kts", 0);
			}
			RequestDispatcher rd = request.getRequestDispatcher("index2.jsp");
			rd.forward(request, response);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
