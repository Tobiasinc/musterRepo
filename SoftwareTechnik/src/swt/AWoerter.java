package swt;

public class AWoerter implements Strategie{

	@Override
	public String execute(String text) {
		if (text.isEmpty()) {
			return "";
		}
		String[] str = text.split(" ");
		String result = "";
		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("a") || str[i].contains("A")) {
				result = result + str[i] + "; ";
			}
		}
		if (result.isEmpty()) {
			return "";
		} else if (result.charAt(result.length()-1) == ' ') {
			result = result.substring(0, result.length()-1);
			return result;
		} else {
			return result;
		}
	}
}
