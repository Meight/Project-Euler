/*
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Test;

import Problem.EulerSolution;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunTests {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        final List<Class<?>> solutions = ReflectionHelper.findClassesImplementing(EulerSolution.class,
                EulerSolution.class.getPackage());

        List<SolutionLog> solutionLogs = new ArrayList<>();

        for (Class solutionClass : solutions)
            solutionLogs.add(generateSolutionLog(solutionClass));

        LogsFormatter.formatLogs(solutionLogs);
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

                return new SolutionLog("java", solution.number(), isAnswerCorrect, executionTime);
            }
        }

        System.out.println("Class given is not an Euler solution.");
        return null;
    }


}
