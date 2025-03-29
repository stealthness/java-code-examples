package allones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndividualTest {


    @Test
    void testAllZeroGenerationOfSize10(){
        int testSize = 10;
        Individual individual = new Individual(testSize);
        assertEquals(testSize, individual.size());
        for(int i = 0; i < testSize; i++){
            assertEquals(0, individual.getChromosomeAtIndex(i));
        }
    }

    @Test
    void testGetChromosomeAtIndexIllegalArgumentIndex(){
        int testSize = 10;
        Individual individual = new Individual(testSize);
        assertThrows(IllegalArgumentException.class, () -> individual.getChromosomeAtIndex(-1));
        assertThrows(IllegalArgumentException.class, () -> individual.getChromosomeAtIndex(testSize+1));
    }

}