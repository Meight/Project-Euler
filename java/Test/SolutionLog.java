package Test;

class SolutionLog {
    private String language;
    private int problemNumber;
    private double executionTime;
    private boolean isCorrect;

    public SolutionLog(String language, int problemName, boolean isCorrect, double executionTime) {
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

    public double getExecutionTime() {
        return executionTime;
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}