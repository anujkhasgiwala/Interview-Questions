package problems;

public class ShortestWordDistance {
    public int shortestWordDistance(String[] wordDict, String word1, String word2) {
        int pos1 = 0, pos2 = 0;

        for(int i = 0; i < wordDict.length; i++) {
            if(wordDict[i].equals(word1))
                pos1 = i;
            if(wordDict[i].equals(word2))
                pos2 = i;
        }

        return Math.abs(pos1 - pos2);
    }
}
