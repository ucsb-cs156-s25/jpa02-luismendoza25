package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object(){
        assertTrue(team.equals(team), "Team should be equal to itself");
    }

    @Test 
    public void equals_different_class(){
        assertFalse(team.equals("not team"), "Team should not be equal to another class");
    }

    @Test
    public void equals_T_T(){
        team.addMember("Luis");
        Team other = new Team("test-team");
        other.addMember("Luis");
        assertTrue(team.equals(other), "Teams should be equal");

    }

    @Test
    public void equals_T_F(){
        team.addMember("Luis");
        Team other = new Team("test-team");
        other.addMember("Tristan");
        assertFalse(team.equals(other), "Teams should not be equal");

    }

    @Test
    public void equals_F_T(){
        team.addMember("Luis");
        Team other = new Team("new-team");
        other.addMember("Luis");
        assertFalse(team.equals(other), "Teams should not be equal");
    }

     @Test
    public void equals_F_F(){
        team.addMember("Luis");
        Team other = new Team("new-team");
        other.addMember("Tristan");
        assertFalse(team.equals(other), "Teams should not be equal");
    }

    @Test
    public void hashCode_is_working(){
        Team t1 = new Team();
        t1.setName("myTeam");
        t1.addMember("Luis");
        Team t2 = new Team();
        t2.setName("myTeam");
        t2.addMember("Luis");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test 
    public void hashCode_method(){
    Team t = new Team("test-team");
    int result = t.hashCode();
    int expectedResult = -1226298695;
    assertEquals(expectedResult, result);
    }
    

}
