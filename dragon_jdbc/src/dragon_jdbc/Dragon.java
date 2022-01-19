package dragon_jdbc;

public class Dragon {
	private String nom;
	private String sexe;
	private int taille;
	private int Ecaille;
	private String feu;
	private String compAmoureux;
/**
 * 
 * @return
 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getEcaille() {
		return Ecaille;
	}

	public void setEcaille(int ecaille) {
		Ecaille = ecaille;
	}

	public String getFeu() {
		return feu;
	}

	public void setFeu(String feu) {
		this.feu = feu;
	}

	public String getCompAmoureux() {
		return compAmoureux;
	}

	public void setCompAmoureux(String compAmoureux) {
		this.compAmoureux = compAmoureux;
	}

	public Dragon(String nom, String sexe, int taille, int ecaille, String feu, String compAmoureux) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.taille = taille;
		this.Ecaille = ecaille;
		this.feu = feu;
		this.compAmoureux = compAmoureux;
	}

	public Dragon() {

	}

	public void affichage() {
		System.out.println("Nom : " + getNom());
		System.out.println("sexe : " + getSexe());
		System.out.println("Taille : " + getTaille());
		System.out.println("Ecaille : " + getEcaille());
		System.out.println("Crache t'il du feu? : " + getFeu());
		System.out.println("et il est très : " + getCompAmoureux());

	}

}
