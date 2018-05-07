/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/6/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Test;

import Problem.EulerSolution;

import java.lang.annotation.Annotation;
import java.util.List;


public class RunTests {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        final List<Class<?>> solutions = ReflectionHelper.findClassesImplementing(EulerSolution.class,
                EulerSolution.class.getPackage());

        for (Class solutionClass : solutions)
            readSolution(solutionClass);
    }

    public static void readSolution(Class solutionClass) throws IllegalAccessException, InstantiationException {
        if (EulerSolution.class.isAssignableFrom(solutionClass)) {
            EulerSolution eulerSolution = (EulerSolution) solutionClass.newInstance();
            if (solutionClass.isAnnotationPresent(Solution.class)) {
                Annotation annotation = solutionClass.getAnnotation(Solution.class);
                Solution solution = (Solution) annotation;

                long startTime = System.nanoTime();
                if (solution.answer() == eulerSolution.solution()) {
                    System.out.println("[" + solutionClass.getName() + "] Correct answer, " +
                            "obtained in " + (System.nanoTime() - startTime) / 1_000 + " ms.");
                } else
                    System.out.println("Incorrect answer.");
            }
        } else {
            System.out.println("Class given is not an Euler solution.");
        }
    }
}
