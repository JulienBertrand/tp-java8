package lambas;

public class TestFiltreStockPrix implements IFiltre {

	public boolean accept(Article article) {

		if (article.isEnRupture() == false && article.getPrix() <= 2) {
			return true;
		} else
			return false;
	}
}
