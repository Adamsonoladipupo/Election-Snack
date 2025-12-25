package entities;

import exceptions.MultipleVotingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallotBoxTest {
    Voter voter;
    BallotBox ballotBox;

    @BeforeEach
    public void setUp(){
        voter = new Voter("adams", "adams@gmail.com");
        ballotBox = new BallotBox();
    }

    @Test
    public void CheckIfBallotBoxIsEmptyTest(){
        assertEquals(0, ballotBox.getVoteCount());
    }

    @Test
    public void CastAVoteForCandidateATest(){
        voter.setBallot(Ballot.CANDIDATEA);
        ballotBox.castVote(voter);
        assertEquals(1, ballotBox.getVoteCount());
    }

    @Test
    public void CastMoreThanOneVoteForACandidateAndThrowErrorTest(){
        voter.setBallot(Ballot.CANDIDATEA);
        ballotBox.castVote(voter);
        assertEquals(1, ballotBox.getVoteCount());
        assertThrows(MultipleVotingException.class, () -> ballotBox.castVote(voter));
    }


}