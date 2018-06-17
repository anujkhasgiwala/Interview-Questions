package amazon;

import java.util.*;

public class LogSorting {
	
	public static List<String> reorderLines(int logFileSize, List<String> logLines) 
	{
		List<String> numericLogs = new ArrayList<String>(), wordLogs = new ArrayList<String>();
		
		for (String log : logLines) {
			String keywords[] = log.split(" ");
			
			if(keywords[1].matches(".*\\d.*")) {
				numericLogs.add(log);
			} else {
				wordLogs.add(log);
			}
		}
		
		//logic for lexicographic order word logs
		Collections.sort(wordLogs, new LogComparator<>());
		logLines = new ArrayList<>();
		logLines.addAll(wordLogs);
		logLines.addAll(numericLogs);
		
		return logLines;
	}
	
	private static class LogComparator<T> implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            String s1 = o1.substring(o1.indexOf(' '));
            String s2 = o2.substring(o2.indexOf(' '));
            return s1.compareTo(s2);
        }

    }
	
	public static void main(String[] args) {
		List<String> logLines = new ArrayList<>();
		logLines.add("a1 9 2 3 1");
		logLines.add("g1 act car");
		logLines.add("zo4 4 7");
		logLines.add("ab1 off key dog");
		logLines.add("a8 act zoo");
		reorderLines(5, logLines);
	}
}
