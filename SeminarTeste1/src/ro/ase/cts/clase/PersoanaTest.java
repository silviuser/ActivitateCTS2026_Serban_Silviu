package ro.ase.cts.clase;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetGen() {
        Persoana persoana = new Persoana("Matei","10406297257");
        Assert.assertEquals("M",persoana.getGen());
    }
    @Test
    public void testGetGenDupa2000(){
        Persoana persoana = new Persoana("Matei","60406297257");
        Assert.assertEquals("F",persoana.getGen());
    }
    @Test
    public void testPersoanaBounderyInferior2000(){
        Persoana persoana = new Persoana("Mircea","5000101297257");
        Assert.assertEquals("M",persoana.getGen());
    }
    @Test
    public void testGetGenCrossCheck(){
        Persoana perosna = new Persoana("Andreea","60406297257");

        assertEquals(
                (perosna.CNP.charAt(0)%2 == 0)?"F":"M",
                perosna.getGen()
        );
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCheckLungimeCNP(){
        Persoana perosna = new Persoana("Andreea","60407257");
        perosna.checkCNP();
    }
    @Test
    public void testCheckCNP() {
        Persoana persoana = new Persoana("Matei","50406297257");
        assertEquals(true,persoana.checkCNP());
    }
}