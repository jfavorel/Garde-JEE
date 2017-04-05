package MODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import BEANS.beansFamille;
import MODEL.modelConnectionBDD;

public class modelCreationCpt {
	

	public void creationCptFamille(beansFamille famille) {

		

		char[] letter = "azertyuiopqsdfghjklmwxcvbn123456789".toCharArray();
		StringBuilder user_Fam = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			char c = letter[random.nextInt(letter.length)];
			user_Fam.append(c);
		}
		String output = user_Fam.toString();

		try {
			PreparedStatement preparedStatement = modelConnectionBDD.loadDataBase().prepareStatement(
					"insert into cpt_famille (User_famille,famille) values ('" + output + "','?')");
			preparedStatement.setString(1, famille.getFamille());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

