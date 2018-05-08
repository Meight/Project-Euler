package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LogsFormatter {
    public static void formatLogs(List<RunTests.SolutionLog> solutionLogs) {
        for (RunTests.SolutionLog solutionLog : solutionLogs) {
            System.out.println(solutionLog.getProblemNumber() + " " + String.format("%d",
                    TimeUnit.NANOSECONDS.toMicros(solutionLog.getExecutionTime())));
        }
    }
}
