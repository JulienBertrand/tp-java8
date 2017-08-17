package lambas;

@FunctionalInterface
public interface Mapper {

	public Personne map (CompteCourant t);
}
