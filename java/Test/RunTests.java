/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/6/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Test;

import Problem.EulerSolution;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RunTests {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        final List<Class<?>> solutions = ReflectionHelper.findClassesImplementing(EulerSolution.class,
                EulerSolution.class.getPackage());

        List<SolutionLog> solutionLogs = new ArrayList<>();

        for (Class solutionClass : solutions)
            solutionLogs.add(generateSolutionLog(solutionClass));

        formatLogs(solutionLogs);
    }

    private static void formatLogs(List<SolutionLog> solutionLogs) {
        for (SolutionLog solutionLog : solutionLogs) {
            System.out.println("[Problem " + solutionLog.getProblemNumber() + "] " + String.format("%d µs",
                    TimeUnit.NANOSECONDS.toMicros(solutionLog.getExecutionTime())));
        }
    }

    private static SolutionLog generateSolutionLog(Class solutionClass)
            throws IllegalAccessException, InstantiationException {
        if (EulerSolution.class.isAssignableFrom(solutionClass)) {
            EulerSolution eulerSolution = (EulerSolution) solutionClass.newInstance();
            if (solutionClass.isAnnotationPresent(Solution.class)) {
                Annotation annotation = solutionClass.getAnnotation(Solution.class);
                Solution solution = (Solution) annotation;

                long startTime = System.nanoTime();
                double answer = eulerSolution.solution();
                long executionTime = System.nanoTime() - startTime;
                boolean isAnswerCorrect = solution.answer() == answer;

                return new SolutionLog(eulerSolution.getClass().getName(), isAnswerCorrect, executionTime);
            }
        }

        System.out.println("Class given is not an Euler solution.");
        return null;
    }

    private static class SolutionLog {
        private int problemNumber;
        private long executionTime;
        private boolean isCorrect;

        public SolutionLog(String problemName, boolean isCorrect, long executionTime) {
            Matcher matcher = Pattern.compile("\\d+").matcher(problemName);
            matcher.find();

            this.problemNumber = Integer.valueOf(matcher.group());
            this.executionTime = executionTime;
            this.isCorrect = isCorrect;
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
}
