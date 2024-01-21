package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginDao;

/**
 * Servlet implementation class Validator
 */
@WebServlet("/Validator")
public class Validator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username, password, msg ="";
		username = request.getParameter("username");
		password = request.getParameter("password");
		
		try {
			String rut = LoginDao.validar(username,password);
			if(rut!="") {
				msg = "Bienvenido: " + rut;
			} else {
				msg = "Usuario y/o contrasena incorrecta";
			}
			System.out.println(msg);
		} catch (Exception e) {}
		if(msg!="") {
			request.setAttribute("mensaje", msg);
			RequestDispatcher desp = request.getRequestDispatcher("/mensaje.jsp");
			desp.forward(request, response);
		}
	}

}
