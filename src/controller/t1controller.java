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
 * Servlet implementation class t1controller
 */
@WebServlet("/t1controller")
public class t1controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public t1controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			mhbo dsmh = new mhbo();
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
				mhbean nmh = new mhbean(mamh, tenmh, sotc, sob, sosvtt, sosvtd, sosvdk, ngaynh, ngayhh);
				int n =	dsmh.themMH(nmh);
				if(n==0)
					request.setAttribute("ktt", 0);
			}
			RequestDispatcher rd = request.getRequestDispatcher("index1.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
