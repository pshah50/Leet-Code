public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] str = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(str));
	}

	public static String longestCommonPrefix(String[] strs) {
		String str = strs[0];
		String temp = "";
		for (int i = 1; i < strs.length; i++) {
			int j = 0;
			
			if (temp.equals("")) {
				if (str.charAt(j) == strs[i].charAt(j)) {
					temp = temp + str.charAt(j);
					j++;
				} else
					break;
			} else {
				if(str.charAt(j) == strs[i].charAt(j)) {
					temp = temp + str.charAt(j);
					j++;
				}
				else {
					break;
				}
			}

		}

		return temp;
	}
}
