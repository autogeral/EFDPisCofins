/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 17/11/2011 20:52:13
 * @author Jonas
 */
public class RegistroF129Test {
    
     public RegistroF129Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void registroF129test() throws ParseException {
        
        RegistroF129 reg = new RegistroF129();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();
        
        line.setFieldValue(RegistroF129.REG, "F001");
        line.setFieldValue(RegistroF129.NUM_PROC, rm.GeraStringRandom(20));
        line.setFieldValue(RegistroF129.IND_PROC, "e");
        
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
    
}
