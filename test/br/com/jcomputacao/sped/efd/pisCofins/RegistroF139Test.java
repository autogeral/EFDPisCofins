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
 * 17/11/2011 22:16:22
 * @author Jonas
 */
public class RegistroF139Test {
    
    public RegistroF139Test() {
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
    public void registroF139test() throws ParseException {
        
        RegistroF139 reg = new RegistroF139();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();
        
        line.setFieldValue(RegistroF139.REG, "F001");
        line.setFieldValue(RegistroF139.NUM_PROC, rm.GeraStringRandom(20));
        line.setFieldValue(RegistroF139.IND_PROC, "3");
        
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
