package CONTROLEURS;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BEANS.beansLogin;
import MODEL.modelLogin;


@WebServlet("/Login")
public class controleursLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public controleursLogin() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		beansLogin utilisateur=new beansLogin();
		utilisateur.setNom(request.getParameter("nom"));
		utilisateur.setPrenom(request.getParameter("prenom"));
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		
		{
			modelLogin tableNoms = new modelLogin();
			if(tableNoms.testConnection(utilisateur))
			{
				HttpSession session=request.getSession();
				session.setAttribute("Nom",nom);
				session.setAttribute("Prenom", prenom);
				this.getServletContext().getRequestDispatcher("/WEB-INF/Main.jsp").forward(request,response);
			}
		}
		
				
	}

}
