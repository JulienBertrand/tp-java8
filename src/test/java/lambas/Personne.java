package lambas;

public class Personne {
	private String nom;
	private Double solde;

	public Personne(double solde) {
		this.solde = solde;
	}

	public Double getSolde() {
		return solde;
	}
}