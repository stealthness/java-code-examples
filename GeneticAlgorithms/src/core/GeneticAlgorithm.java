package core;

/**
 * This is the main class that represents the genetic algorithm.
 *
 *  This code is developed as part of the "Genetic Algorithms in Java" series of tutorials.
 */
public class GeneticAlgorithm {
    /**
     * The size of the population
     */
    private int populationSize;
    /**
     * The mutation rate
     */
    private double mutationRate;
    private double crossoverRate;
    private int elitismCount;

    public GeneticAlgorithm(int populationSize, double mutationRate, double crossoverRate, int elitismCount) {
        this.populationSize = populationSize;
        this.mutationRate = mutationRate;
        this.crossoverRate = crossoverRate;
        this.elitismCount = elitismCount;
    }

    /*
     * Many more methods implemented later...
     */
}