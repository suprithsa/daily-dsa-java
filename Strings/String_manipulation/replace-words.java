class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        Set<String> set = new HashSet<>(dictionary);

        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {

            String prefix = "";

            for (int i = 0; i < word.length(); i++) {
                prefix += word.charAt(i);

                if (set.contains(prefix)) {
                    word = prefix;
                    break;
                }
            }

            ans.append(word).append(" ");
        }

        return ans.toString().trim();
    }
}