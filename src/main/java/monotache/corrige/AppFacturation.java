package monotache.corrige;

public class AppFacturation {

	public static void main(String[] args) {
		Facturation facturation = new Facturation();
		facturation.creerFacture(18.5, DateUtils.parse("18/11/2017"));

	}

}
