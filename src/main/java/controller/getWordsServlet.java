package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Madlib;

/**
 * Servlet implementation class getWordsServlet
 */
@WebServlet("/getWordsServlet")
public class getWordsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWordsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNoun = request.getParameter("userNoun");
		String userProperNoun = request.getParameter("userProperNoun");
		String userAdj = request.getParameter("userAdj");
		String userVerb = request.getParameter("userVerb");
		String userPlace = request.getParameter("userPlace");
		
		Madlib madlibSentence = new Madlib(userNoun, userProperNoun, userAdj, userVerb, userPlace);
		
		request.setAttribute("userMadLib", madlibSentence);
		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
	}

}
