package Question03;

public class Functions {

    private List partyList;

    public Functions(List partyList) {
        this.partyList = partyList;
    }

    public void findWinningPartiesPerDistrict() {
        if (partyList.isListEmpty()) {
            System.out.println("No party data available.");
            return;
        }

        String[] districts = {"Gampaha", "Colombo", "Kalutara"};
        for (int i = 0; i < districts.length; i++) {
            Party winner = null;
            int maxVotes = -1;
            for (int j = 0; j < partyList.listSize(); j++) {
                Party currentParty = partyList.retrieveList(j);
                int currentVotes = 0;
                if (i == 0) currentVotes = currentParty.getGampahaVotes();
                else if (i == 1) currentVotes = currentParty.getColomboVotes();
                else currentVotes = currentParty.getKalutaraVotes();

                if (currentVotes > maxVotes) {
                    maxVotes = currentVotes;
                    winner = currentParty;
                }
            }
            if (winner != null) {
                System.out.println("Winning party in " + districts[i] + ": " + winner.getName() + " (" + maxVotes + " votes)");
            }
        }
    }

    public void findOverallWinner() {
        if (partyList.isListEmpty()) {
            System.out.println("No party data available.");
            return;
        }
        Party overallWinner = null;
        int maxTotalVotes = -1;
        for (int i = 0; i < partyList.listSize(); i++) {
            Party currentParty = partyList.retrieveList(i);
            if (currentParty.getTotalVotes() > maxTotalVotes) {
                maxTotalVotes = currentParty.getTotalVotes();
                overallWinner = currentParty;
            }
        }
        if (overallWinner != null) {
            System.out.println("Overall Provincial Election Winner: " + overallWinner.getName() + " (" + maxTotalVotes + " total votes)");
        }
    }

    public void findMinVotesPerDistrict() {
        if (partyList.isListEmpty()) {
            System.out.println("No party data available.");
            return;
        }
        String[] districts = {"Gampaha", "Colombo", "Kalutara"};
        for (int i = 0; i < districts.length; i++) {
            Party loser = null;
            int minVotes = Integer.MAX_VALUE;
            for (int j = 0; j < partyList.listSize(); j++) {
                Party currentParty = partyList.retrieveList(j);
                int currentVotes = 0;
                if (i == 0) currentVotes = currentParty.getGampahaVotes();
                else if (i == 1) currentVotes = currentParty.getColomboVotes();
                else currentVotes = currentParty.getKalutaraVotes();

                if (currentVotes < minVotes) {
                    minVotes = currentVotes;
                    loser = currentParty;
                }
            }
            if (loser != null) {
                System.out.println("Party with minimum votes in " + districts[i] + ": " + loser.getName() + " (" + minVotes + " votes)");
            }
        }
    }

    public void findEligibleParties() {
        if (partyList.isListEmpty()) {
            System.out.println("No party data available.");
            return;
        }
        System.out.println("Eligible parties (more than 100,000 total votes):");
        boolean found = false;
        for (int i = 0; i < partyList.listSize(); i++) {
            Party currentParty = partyList.retrieveList(i);
            if (currentParty.getTotalVotes() > 100000) {
                System.out.println("- " + currentParty.getName() + " (" + currentParty.getTotalVotes() + " total votes)");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No parties are eligible for a seat based on this criterion.");
        }
    }
}