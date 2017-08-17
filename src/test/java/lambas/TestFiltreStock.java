package lambas;

public class TestFiltreStock implements IFiltre {

	public boolean accept(Article article) {

		if (article.isEnRupture() == false) {
			return true;
		} else
			return false;
	}

}
