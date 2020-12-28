class uniqChInStr {

    public int firstUniqChar(String s) {

        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a'] += 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}