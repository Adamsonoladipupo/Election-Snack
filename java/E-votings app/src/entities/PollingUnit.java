package entities;

public class PollingUnit {
    // the number of ballot boxes is determine by number of candidates
    private BallotBox CandidateA = new BallotBox();
    private BallotBox CandidateB = new BallotBox();
    private BallotBox CandidateC = new BallotBox();
    private int count = 0;

    public int getAllVotes(){
        return count;
    }

    public int getCandidateAVoteCount(){
        return CandidateA.getVoteCount();
    }

    public int getCandidateBVoteCount(){
        return CandidateB.getVoteCount();
    }

    public int getCandidateCVoteCount(){
        return CandidateC.getVoteCount();
    }

    public int votersSize() {
        return this.count;
    }

    public void castVote(Voter voter) {
        if (voter.getBallot() == Ballot.CANDIDATEA){
            CandidateA.castVote(voter);
            count++;
        }
        if (voter.getBallot() == Ballot.CANDIDATEB){
            CandidateB.castVote(voter);
            count++;
        }
        if (voter.getBallot() == Ballot.CANDIDATEC){
            CandidateC.castVote(voter);
            count++;
        }
    }

    public String getVoteCountInAllBallotBoxes(){
        int boxA = CandidateA.getVoteCount();
        int boxB = CandidateB.getVoteCount();
        int boxC = CandidateC.getVoteCount();
        String allBoxes = "boxA: " + boxA + " || BoxB: " + boxB + " || BoxC: " + boxC;
        return allBoxes;
    }




}
