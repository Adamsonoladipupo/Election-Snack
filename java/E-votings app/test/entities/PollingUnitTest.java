package entities;

import exceptions.MultipleVotingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PollingUnitTest {
    PollingUnit pollingUnit;

    @BeforeEach
    public void setUp(){
        pollingUnit = new PollingUnit();
    }

    @Test
    public void CreateANewVoterAndCastAVoteTest(){
        Voter voter1 = new Voter("Adams", "adams@gmail.com");
        voter1.setBallot(Ballot.CANDIDATEA);
        assertEquals(1, voter1.getCount());
        pollingUnit.castVote(voter1);
        assertEquals(1, pollingUnit.getCandidateAVoteCount());
    }

    @Test
    public void CreateMultipleVoterAndCastVoteForTheSameCandidateTest(){
        Voter voter1 = new Voter("Adams", "adams@gmail.com");
        Voter voter2 = new Voter("Emma", "emma@gmail.com");
        Voter voter3 = new Voter("samuel", "samuel@gmail.com");
        assertEquals(3, voter1.getCount());
        voter1.setBallot(Ballot.CANDIDATEA);
        voter2.setBallot(Ballot.CANDIDATEA);
        voter3.setBallot(Ballot.CANDIDATEA);
        pollingUnit.castVote(voter1);
        pollingUnit.castVote(voter2);
        pollingUnit.castVote(voter3);
        assertEquals(3, pollingUnit.getCandidateAVoteCount());
    }

    @Test
    public void CreateNewVoterAndVoteMoreThanOnceTest(){
        Voter voter1 = new Voter("Adams", "adams@gmail.com");
        assertEquals(1, voter1.getCount());
        voter1.setBallot(Ballot.CANDIDATEA);
        pollingUnit.castVote(voter1);
        assertEquals(1, pollingUnit.getCandidateAVoteCount());
        assertThrows(MultipleVotingException.class, () -> pollingUnit.castVote(voter1));
    }


}