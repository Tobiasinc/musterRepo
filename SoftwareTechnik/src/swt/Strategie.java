package swt;

public interface Strategie {

	/**
	 * Analysiert den Text nach einer bestimmten Strategie und
	 * gibt  �bereinstimmenden W�rter wieder zur�ck.
	 * @param text der zu analysierende Text
	 * @return gefundene W�rter in der Abfolge "wort1; wort2; ... wortn;"
	 *         wenn keine �bereinstimmung gefunden wurde: leerer String ""
	 */
	public String execute(String text);
}
