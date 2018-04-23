package arrayandstring;

public class URLify {
	public static void main(String[] args) {
		url("Mr John Smith   ", 13);
	}
	
	static String url(String str, int length) {
		str = str.trim();
		str = str.replaceAll(" ", "%20");
		return str;
	}
}
