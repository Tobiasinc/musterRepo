package swt;

public class Palindrom implements Strategie{

	@Override
	public String execute(String text) {
		if (text.isEmpty()) {
			return "";
		}
		text = text.replaceAll(" ", "").toLowerCase();
		if (text.equals(new StringBuilder(text).reverse().toString())) {
			return text;
		}
		return "";


		
		/*String[] str = text.split(" ");
		String result = "";
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(new StringBuilder(str[i]).reverse().toString())) {
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
		}*/
	}
}
