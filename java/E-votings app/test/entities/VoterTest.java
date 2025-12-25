package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VoterTest {
    Voter voter;

    @BeforeEach
    public void setUp(){
        voter = new Voter("Adamson", "adams@gmail.com");
    }

    @Test
    public void CreateANewVoterTest(){
        assertEquals("Adamson", voter.getName());
        assertEquals(1, voter.getCount());
    }

    @Test
    public void invalidEmailAddressTest(){

    }

}