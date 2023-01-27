public class Test3 {
    public int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i<words.length-1; i++) {
            for (int j = i+1; j<words.length; j++) {
                if (compare(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean compare(String word1, String word2) {
        for (int i = 0; i<word1.length(); i++) {
            if (!word2.contains(word1.substring(i,i+1))) {
                return false;
            }
        }
        for (int i = 0; i<word2.length(); i++) {
            if (!word1.contains(word2.substring(i,i+1))) {
                return false;
            }
        }
        return true;
    }


}
