package lambas;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	private List<Article> articles;

	public Panier() {
		setArticles(new ArrayList<>());

	}

	public List<Article> articleFiltre() {
		List<Article> listeArticleFiltre = new ArrayList<Article>();

		for (Article articleAFiltre : articles) {
			if (articleAFiltre.isEnRupture() == false) {
				listeArticleFiltre.add(articleAFiltre);
				System.out.println(articleAFiltre.getReference());
			}
		}

		// for (Article i : listeArticleFiltre) {
		// System.out.println(i.getReference());

		// }
		return listeArticleFiltre;

	}

	public List<Article> articleFiltreGen(boolean stock, double prixMax) {
		List<Article> listeArticleFiltreGen = new ArrayList<Article>();
		for (Article articleAFiltre : articles) {
			if (articleAFiltre.isEnRupture() == stock && articleAFiltre.getPrix() <= prixMax) {
				listeArticleFiltreGen.add(articleAFiltre);
				// System.out.println(articleAFiltre.getReference());
			}

			else if (articleAFiltre.isEnRupture() == stock && articleAFiltre.getPrix() <= prixMax) {
				listeArticleFiltreGen.add(articleAFiltre);
				// System.out.println(articleAFiltre.getReference());
			}

		}
		return listeArticleFiltreGen;
	}

	public List<Article> articleFiltreFinal(IFiltre iFiltre) {
		List<Article> listeFiltreFinal = new ArrayList<Article>();
		for (Article articleAFiltre : articles) {
			if (iFiltre.accept(articleAFiltre) == true) {
				listeFiltreFinal.add(articleAFiltre);
				System.out.println(articleAFiltre.getReference());

			}

		}
		System.out.println("//////////////////////////////////////");
		return listeFiltreFinal;

	}

	// GETTERS ET SETTERS

	/**
	 * @return the articles
	 */
	public List<Article> getArticles() {
		return articles;
	}

	/**
	 * @param articles
	 *            the articles to set
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}