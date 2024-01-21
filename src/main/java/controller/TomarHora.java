package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.HoraDao;
import model.LoginDao;

/**
 * Servlet implementation class TomarHora
 */
@WebServlet("/TomarHora")
public class TomarHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TomarHora() {
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
		int idMascota = Integer.parseInt(request.getParameter("idMascota"));
        String rutDueno = request.getParameter("rutDueno");
        String nombreMascota = request.getParameter("nombreMascota");
        String hora = request.getParameter("hora");
        String minuto = request.getParameter("minuto");
        String dia = request.getParameter("dia");
        String mes = request.getParameter("mes");
        String ano = request.getParameter("ano");

        boolean success = HoraDao.guardarHora(idMascota, rutDueno, nombreMascota, hora, minuto, dia, mes, ano);

        if (success) {
            request.setAttribute("mensaje", "Hora tomada exitosamente");
        } else {
            request.setAttribute("mensaje", "Error al tomar la hora");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/mensaje.jsp");
        dispatcher.forward(request, response);
	}

}
