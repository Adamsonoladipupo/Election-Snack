package entities;

public class Voter {
    private String name;
    private String email;
    private String voterID;
    private Ballot ballot;
    private static int count = 0;

    public Voter(String name, String email){
        this.name = name;
        this.email = email;
        this.voterID = generateVoterID();
    }

    public int getCount(){
        return count;
    }
    public Ballot getBallot() {
        return ballot;
    }

    public void setBallot(Ballot ballot) {
        this.ballot = ballot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVoterID() {
        return voterID;
    }

    private String generateVoterID(){
        String prefix = "";
        for (int gen = 0; gen < 3; gen++){
            char letter = this.name.charAt(gen);
            prefix += letter;
        }
        String voterID = prefix + count++;
        return voterID;
    }
}
