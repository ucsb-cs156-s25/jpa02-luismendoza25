package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Luis M.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id
        return "luismendoza25";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-11");
        team.addMember("Luis M.");
        team.addMember("Saul D.");
        team.addMember("Shuang L.");
        team.addMember("Tristan R.");
        team.addMember("Wendy S.");
        team.addMember("Jonah S.");
        return team;
    }
}
