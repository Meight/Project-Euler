package Test;

class SolutionLog {
    private String language;
    private int problemNumber;
    private long executionTime;
    private boolean isCorrect;

    public SolutionLog(String language, int problemName, boolean isCorrect, long executionTime) {
        this.language = language;
        this.problemNumber = problemName;
        this.executionTime = executionTime;
        this.isCorrect = isCorrect;
    }

    public String getLanguage() {
        return language;
    }

    public int getProblemNumber() {
        return problemNumber;
    }

    public long getExecutionTime() {
        return executionTime;
    }

    public long getExecutionTimeMilliseconds() {
        return executionTime / 1_000;
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}