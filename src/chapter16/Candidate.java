package chapter16;

public class Candidate implements Comparable<Candidate> {

    private String name;
    private String party;

    public Candidate(String name, String party){
        this.name = name;
        this.party=party;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", party='" + party + '\'' +
                '}';
    }

    public void setParty(String party) {
        this.party = party;
    }
    public int compareTo(Candidate o){
            return 0;
    }
}
