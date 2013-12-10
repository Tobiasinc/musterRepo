package swt;

public interface Strategie {

	/**
	 * Analysiert den Text nach einer bestimmten Strategie und
	 * gibt  übereinstimmenden Wörter wieder zurück.
	 * @param text der zu analysierende Text
	 * @return gefundene Wörter in der Abfolge "wort1; wort2; ... wortn;"
	 *         wenn keine Übereinstimmung gefunden wurde: leerer String ""
	 */
	public String execute(String text);
}
