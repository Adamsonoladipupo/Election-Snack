package entities;

import exceptions.MultipleVotingException;

import java.util.ArrayList;

public class BallotBox {
    private ArrayList<Voter> ballotBox = new ArrayList<>();
    private int count = 0;

    public void castVote(Voter newVoter){
        if (ballotBox.contains(newVoter)){
            throw new MultipleVotingException("Multiple voting detected, you can only vote once");
        } else {
            ballotBox.add(newVoter);
            count++;
        }
    }

    public int getVoteCount(){
        return count;
    }

    public void getAllVoters(){
        for (Voter voter : ballotBox){
            System.out.println(voter.getName());
        }
    }
}
