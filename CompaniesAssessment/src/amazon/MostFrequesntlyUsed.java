package amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequesntlyUsed {
	List<String> retrieveMostFrequentlyUsedWords(String literatureText, List<String> wordsToExclude) {
        literatureText = formatLiterature(literatureText);
        Set<String> exclWords = getExcludedWords(wordsToExclude);
        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<>();
        int maxCount = 0;
        for (String word: literatureText.split(" ")) {
            word = formatWord(word);
            if (exclWords.contains(word) || "".equals(word) || " ".equals(word)) {
                continue;
            }
            int count = 0;
            if (!wordCount.containsKey(word)) {
                count = 1;
            } else {
                count = wordCount.get(word) + 1;
            }
            wordCount.put(word, count);
            if (count > maxCount) {
                maxCount = count;
            }
        }
        List<String> retStr = new ArrayList<>();
        for (Entry<String, Integer> wordEntry : wordCount.entrySet()) {
            if (wordEntry.getValue() == maxCount) {
                retStr.add(wordEntry.getKey());
            }
        }
        System.out.println(wordCount);
        return retStr;
    }
    
    private static String formatLiterature(String str) {
        str = str.trim().toLowerCase();
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                sb.append(ch);
            } else {
                sb.append(' ');
            }
        }
        return sb.toString().replaceAll("  ", " ");
    }
    
    private static String nextWord(String str, int index) {
        StringBuilder sb = new StringBuilder();
        for (int i=index;i<str.length();i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                sb.append(ch);
            } else {
                break;
            }
        }
        return sb.toString().trim();
    }

    private static String formatWord(String word) {
        word = word.replaceAll("\\p{Punct}", "");
        return word;
    }

    private static Set<String> getExcludedWords(List<String> wordsToExclude) {
        Set<String> exclWords = new HashSet<>(wordsToExclude);
        for (String wordToExclude:wordsToExclude) {
            if (wordToExclude!=null) {
            exclWords.add(wordToExclude.toLowerCase());
            }
        }
        exclWords.add(".");
        exclWords.add(",");
        exclWords.add(":");
        exclWords.add(";");
        exclWords.add("-");
        exclWords.add("\"");
        exclWords.add("'");
        return exclWords;
    }
}
