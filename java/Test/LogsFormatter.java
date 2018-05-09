package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class LogsFormatter {
    public static void formatLogs(List<SolutionLog> solutionLogs) {
        for (SolutionLog solutionLog : solutionLogs) {
            System.out.println(solutionLog.getProblemNumber() + " " + String.format("%d",
                    TimeUnit.NANOSECONDS.toMicros(solutionLog.getExecutionTime())));
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<SolutionLog>> problemSolutions = new HashMap<>();
        List<String> languages = new ArrayList<>();

        for (String filePath : args) {
            // Create new entry in solutions hash map.
            String currentLanguage = filePath.split(".")[0];
            languages.add(currentLanguage);

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
                String currentLine;

                while ((currentLine = bufferedReader.readLine()) != null) {
                    String[] splitLine = currentLine.split(" ");

                    int problemNumber = Integer.parseInt(splitLine[0]);

                    if (!problemSolutions.containsKey(problemNumber))
                        problemSolutions.put(problemNumber, new ArrayList<>());

                    SolutionLog solutionLog =
                            new SolutionLog(
                                    currentLanguage,
                                    problemNumber,
                                    true, // All solutions here are always correct.
                                    Long.parseLong(splitLine[1]));

                    problemSolutions.get(problemNumber).add(solutionLog);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(parseFileHeader(languages));

        for (int problemNumber : problemSolutions.keySet()) {
            System.out.println(parseProblemLine(problemNumber, problemSolutions.get(problemNumber)));
        }
    }

    private static String parseFileHeader(List<String> languages) {
        StringBuilder header = new StringBuilder("problem ");

        for (String language : languages)
            header.append(language).append(" ");

        return header.toString();
    }

    private static String parseProblemLine(int problemNumber, List<SolutionLog> problemSolutions) {
        StringBuilder line = new StringBuilder(problemNumber + " ");

        problemSolutions.sort((o1, o2) -> {
            if (o1.getLanguage().equals(o2.getLanguage()))
                return 0;
            return o1.getLanguage().compareTo(o2.getLanguage());
        });

        for (SolutionLog solutionLog : problemSolutions)
            line.append(solutionLog.getExecutionTime()).append(" ");

        return line.toString();
    }
}
