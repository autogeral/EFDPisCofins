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
 * 17/11/2011 19:58:50
 * @author Jonas
 */
public class RegistroF111Test {

    public RegistroF111Test() {
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
    public void registroF111test() throws ParseException {
        
        RegistroF111 reg = new RegistroF111();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();
        
        line.setFieldValue(RegistroF111.REG, "F001");
        line.setFieldValue(RegistroF111.NUM_PROC, rm.GeraStringRandom(20));
        line.setFieldValue(RegistroF111.IND_PROC, "e");
        
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
