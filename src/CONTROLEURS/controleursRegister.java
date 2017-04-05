package CONTROLEURS;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import BEANS.beansFamille;
import MODEL.modelCreationCpt;


@WebServlet("/Register")
public class controleursRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public controleursRegister() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/Register.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		beansFamille famille=new beansFamille();
		famille.setFamille(request.getParameter("type"));
		
		modelCreationCpt tableNoms = new modelCreationCpt();
		tableNoms.creationCptFamille(famille);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request,response);
	}

}
