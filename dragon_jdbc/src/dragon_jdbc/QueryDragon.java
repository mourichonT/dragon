package dragon_jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDragon extends MyConnexion {

	public static boolean create(String ingredient) {
		boolean flag = false;
		try {
			Statement declaration = accessDataBase.createStatement();
			String query = "INSERT INTO `ingredients`(`nom`) " + "VALUES (\"" + ingredient + "\")";
			int executeUpdate = declaration.executeUpdate(query);
			flag = (executeUpdate == 1);
		} catch (Exception e) {
			System.err.println("Erreur d'insertion ingredient: " + e.getMessage());
		}
		return flag;
	}

	public static void readAll() {
		try {
			Statement declaration = accessDataBase.createStatement();
			String query = "SELECT id_dragon, nom FROM dragons;";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */

			while (resultat.next()) {
				Dragon drag = new  Dragon(query, query, 0, 0, query, query);
				drag.setNom(resultat.getString("nom"));
				System.out.println(drag.toString());
			}
		} catch (Exception e) {
			System.err.println("Erreur d'affichage d'ing: " + e.getMessage());
		}
	}

	public static boolean delete(int id) {
		boolean success = false;
		try {
			Statement declaration = accessDataBase.createStatement();
			/* Requete */
			String query = "DELETE FROM `dragons` WHERE `id_dragon`= " + id + ";";
			/* Exécution d'une requête de lecture */
			int executeUpdate = declaration.executeUpdate(query);
			success = (executeUpdate == 1);
		} catch (SQLException e) {
			System.err.println("Erreur suppression ingredient: " + e.getMessage());
		}
		return success;
	}

	public static boolean deleteByName(String nom) {
		boolean success = false;
		try {
			Statement declaration = accessDataBase.createStatement();
			String query = "DELETE FROM `dragons` WHERE `nom`= \"" + nom + "\";";
			int executeUpdate = declaration.executeUpdate(query);
			success = (executeUpdate == 1);
		} catch (SQLException e) {
			System.err.println("Erreur suppression ingredient: " + e.getMessage());
		}
		return success;
	}

	public static boolean deleteByNamePrepared(String nom) {
		boolean success = false;
		try {
			String query = "DELETE FROM dragons WHERE nom = ?";
			PreparedStatement declaration = accessDataBase.prepareStatement(query);
			declaration.setString(1, nom);
			int executeUpdate = declaration.executeUpdate();
			success = (executeUpdate == 1);
		} catch (SQLException e) {
			System.err.println("Erreur suppression ingredient: " + e.getMessage());
		}
		return success;
	}


}
