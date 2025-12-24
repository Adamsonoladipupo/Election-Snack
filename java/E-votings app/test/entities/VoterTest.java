import entities.Voter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VoterTest {
    Voter voter;

    @BeforeEach
    public void setUp(){
        voter = new Voter();
    }

    @Test
    public void CreateANewVoterTest(){
        voter.setName("Adamson");
        voter.setEmail("adams@gmail.com");
        assertEquals("Adamson", voter.getName());
    }

}