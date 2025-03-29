package allones;

import java.util.Arrays;

public class Individual {

    private final int[] chromosomes;
    /**
     * the fitness of this individual, -1 if the fitness has not been evaluated
     */
    private double fitness = -1;

    public Individual(int populationSize) {
        chromosomes = new int[populationSize];
    }

    public Individual(int[] chromosomes) {
        this.chromosomes = chromosomes;
    }

    public Individual(int populationSize, boolean generateRandom) {
        chromosomes = new int[populationSize];
        if (generateRandom) {
            generateRandomChromosome();
        }
    }

    public double getFitness() {
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public int size() {
        return chromosomes.length;
    }

    public void setChromosomes(int[] chromosomes){
        System.arraycopy(chromosomes, 0, this.chromosomes, 0, chromosomes.length);
    }

    public void generateRandomChromosome() {
        Arrays.stream(this.chromosomes).forEach(chromosome -> chromosome = Math.random() > 0.5 ? 1 : 0);
    }

    public int getChromosomeAtIndex(int index){
        if(index < 0 || index >= chromosomes.length){
            throw new IllegalArgumentException("Index out of bounds");
        }
        return chromosomes[index];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int chromosome : chromosomes) {
            sb.append(chromosome).append(" ");
        }
        if (fitness != -1) {
            sb.append("Fitness: ").append(fitness);
        } else {
            sb.append("Fitness: not evaluated");
        }
        return sb.toString();
    }
}
