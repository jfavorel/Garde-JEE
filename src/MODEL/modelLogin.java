package MODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import MODEL.modelConnectionBDD;
import BEANS.beansLogin;


public class modelLogin {

	private Connection connexion;

	/*public List<beansLogin> recupererUtilisateurs() {
		List<beansLogin> utilisateurs = new ArrayList<beansLogin>();
		
	
		Statement statement = null;
		ResultSet resultat = null;

		modelConnectionBDD.loadDataBase();
		
		try {

			statement = connexion.createStatement();
			resultat = statement.executeQuery("select nom,prenom from user;");

			while (resultat.next()) {
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				beansLogin utilisateur = new beansLogin();
				utilisateur.setNom(nom);
				utilisateur.setPrenom(prenom);

				utilisateurs.add(utilisateur);
			}
		} catch (SQLException e) {
		} finally {
			try {
				if (resultat != null)
					resultat.close();
				if (statement != null)
					statement.close();
				if (connexion != null)
					;
				connexion.close();
			} catch (SQLException ignore) {

			}
		}
		return utilisateurs;
	}
	
	
	
	
	public void ajouterUtilisateur(beansLogin utilisateur){
		modelConnectionBDD.loadDataBase();
		
		try {
			PreparedStatement preparedStatement = connexion.prepareStatement("insert into users(nom,prenom,) values (?,?)");
			preparedStatement.setString(1, utilisateur.getNom());
			preparedStatement.setString(2, utilisateur.getPrenom());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	public boolean testConnection(beansLogin utilisateur ){
		boolean exist=false;

		
		
		try {
			
			PreparedStatement testLogin = modelConnectionBDD.loadDataBase().prepareStatement("select id from users where nom=? and prenom=?;");
			testLogin.setString(1, utilisateur.getNom());
			testLogin.setString(2, utilisateur.getPrenom());
			ResultSet rs=testLogin.executeQuery();
			exist=rs.next();
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exist;
	}}
	

