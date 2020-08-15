
public class Mask {
	public String mask(String original) {
		String[] words = original.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 2) {
				char[] chars = words[i].toCharArray();
				for (int j = 1; j < chars.length - 1; j++) {
					chars[j] = '*';
				}
				words[i] = String.copyValueOf(chars);
			}
		}
		
		return String.join(" ", words);
	}
}
