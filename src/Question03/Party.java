package Question03;

public class Party {
    private String name;
    private int gampahaVotes;
    private int colomboVotes;
    private int kalutaraVotes;

    public Party(String name, int gampahaVotes, int colomboVotes, int kalutaraVotes) {
        this.name = name;
        this.gampahaVotes = gampahaVotes;
        this.colomboVotes = colomboVotes;
        this.kalutaraVotes = kalutaraVotes;
    }

    public String getName() {
        return name;
    }

    public int getGampahaVotes() {
        return gampahaVotes;
    }

    public int getColomboVotes() {
        return colomboVotes;
    }

    public int getKalutaraVotes() {
        return kalutaraVotes;
    }

    public int getTotalVotes() {
        return gampahaVotes + colomboVotes + kalutaraVotes;
    }

    @Override
    public String toString() {
        return "Party: " + name + ", Gampaha: " + gampahaVotes + ", Colombo: " + colomboVotes + ", Kalutara: " + kalutaraVotes + ", Total: " + getTotalVotes();
    }
}