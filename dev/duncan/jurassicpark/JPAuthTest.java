package dev.duncan.jurassicpark;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class JPAuthTest {

    @Test
    void canReadPasswords () {
        //tests the reading of passwords
        JPAuth jpAuth = new JPAuth();
        assertEquals(1, jpAuth.getNumberOfPasswords());
    }
    @Test
    void testAuthenticateFailsForNull() {
        JPAuth jpAuth = new JPAuth();
        assertEquals(false, jpAuth.authenticate(null, null)); 
    }

    @Test
    void testNullPassFails() {
        JPAuth jpAuth = new JPAuth();
        assertEquals(false, jpAuth.authenticate("UserExample", null));
        
    }

    @Test
    void testNullUserFails() {
        JPAuth jpAuth = new JPAuth();
        assertEquals(false, jpAuth.authenticate(null, "P@55word"));
        
    }

    @Test
    void testDennisNedrySucceedes() {
        JPAuth jpAuth = new JPAuth();
        assertEquals(true, jpAuth.authenticate("Dennis_Nedry", "ThankYou:1993"));
        
    }

    @Test
    void testMuppetLoginFails() {
        JPAuth jpAuth = new JPAuth();
        assertEquals(false, jpAuth.authenticate("Muppet", "AWOO"));
        
    }

}
