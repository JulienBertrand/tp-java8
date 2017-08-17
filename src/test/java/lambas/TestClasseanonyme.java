package lambas;

public class TestClasseanonyme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ecriture JAVA 7
		Mapper mapper = new Mapper() {

			public Personne map(CompteCourant t) {
				// TODO Auto-generated method stub
				return new Personne(t.getSolde());
			}
		};

		// première étape : on supprime le code "administratif de la methode
		mapper = (CompteCourant t) -> {
			return new Personne(t.getSolde());
		};

		// Seconde étape je peux supprimer les accolades , ET le return, à droite de la
		// flèche
		// car le corps de ne contient qu'une seule ligne de code
		mapper = (CompteCourant t) -> new Personne(t.getSolde());

		// troisème étape je peux supprimer le typs des parametres d'entrée car JAVA les
		// connais deja

		//Mapper mapper = t -> new Personne(t.getSolde());

		CompteCourant cc = new CompteCourant();
		cc.setSolde(150.0);

		Personne personne = mapper.map(cc);
		System.out.println(personne.getSolde());

	}

}
