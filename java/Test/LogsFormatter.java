package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class LogsFormatter {
    private static final String NON_EXISTING_PROBLEM_PLACEHOLDER = "nan";

    public static void formatLogs(List<SolutionLog> solutionLogs) {
        for (SolutionLog solutionLog : solutionLogs) {
            System.out.println(solutionLog.getProblemNumber() + " " + String.format("%d",
                    TimeUnit.NANOSECONDS.toMicros((long) solutionLog.getExecutionTime())));
        }
    }

    public static void main(String[] args) {
        Map<Integer, Map<String, SolutionLog>> problemSolutions = new HashMap<>();
        List<String> languages = new ArrayList<>();

        for (String filePath : args) {
            parseFile(filePath, languages, problemSolutions);
        }

        Collections.sort(languages);

        System.out.println(parseFileHeader(languages));

        for (int problemNumber : problemSolutions.keySet()) {
            System.out.println(parseProblemLine(problemNumber, languages, problemSolutions.get(problemNumber)));
        }
    }

    private static void parseFile(String filePath,
                                  List<String> languages,
                                  Map<Integer, Map<String, SolutionLog>> problemSolutions) {
        filePath = filePath.trim();
        // Create new entry in solutions hash map.
        String currentLanguage = filePath.split("_")[1].split("\\.")[0];
        languages.add(currentLanguage);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            int problemsCount = 1;
            String currentLine;

            while ((currentLine = bufferedReader.readLine()) != null) {
                String[] splitLine = currentLine.split(" ");

                int problemNumber = Integer.parseInt(splitLine[0]);

                if (!problemSolutions.containsKey(problemNumber))
                    problemSolutions.put(problemNumber, new HashMap<>());

                SolutionLog solutionLog =
                        new SolutionLog(
                                currentLanguage,
                                problemNumber,
                                true, // All solutions here are always correct.
                                Double.parseDouble(splitLine[1]));

                problemSolutions.get(problemNumber).put(currentLanguage, solutionLog);

                problemsCount++;
            }
        } catch (IOException e) {
            System.out.println("Filename: " + filePath);
        }
    }

    private static String parseFileHeader(List<String> languages) {
        StringBuilder header = new StringBuilder("problem ");

        for (String language : languages)
            header.append(language).append(" ");

        return header.toString();
    }

    private static String parseProblemLine(int problemNumber,
                                           List<String> languages,
                                           Map<String, SolutionLog> problemSolutions) {
        StringBuilder line = new StringBuilder(problemNumber + " ");

        for (String language : languages) {
            if (problemSolutions.containsKey(language))
                line.append(problemSolutions.get(language).getExecutionTime()).append(" ");
            else
                line.append(NON_EXISTING_PROBLEM_PLACEHOLDER).append(" ");
        }

        return line.toString();
    }
}
