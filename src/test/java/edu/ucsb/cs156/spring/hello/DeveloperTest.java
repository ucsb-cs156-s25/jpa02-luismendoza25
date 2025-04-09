package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Luis M.", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubId(){
        assertEquals("luismendoza25", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("s25-11", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_Luis() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Luis M."),"Team should contain Luis M.");
    }

    @Test
    public void getTeam_returns_team_with_Saul() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Saul D."),"Team should contain Saul D.");
    }

    @Test
    public void getTeam_returns_team_with_Shuang() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Shuang L."),"Team should contain Shuang L.");
    }

    @Test
    public void getTeam_returns_team_with_Tristan() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Tristan R."),"Team should contain Tristam R.");
    }

    @Test
    public void getTeam_returns_team_with_Wendy() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Wendy S."),"Team should contain Wendy S.");
    }

    @Test
    public void getTeam_returns_team_with_Jonah() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Jonah S."),"Team should contain Jonah S.");
    }


}
