/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 17/11/2011 21:25:00
 * @author William Antunes
 */
public class Registro1220Test extends Randomize {
    
            public Registro1220Test() {
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
    public void Registro1220Test() throws ParseException{
        Registro1220 reg = new Registro1220();
        LineModel line = reg.createModel();

       
        line.setFieldValue(Registro1220.REG, GeraStringRandom(4));
        line.setFieldValue(Registro1220.PER_APU_CRED, GeraLongRandom(6));
        line.setFieldValue(Registro1220.ORIG_CRED, GeraLongRandom(2));
        line.setFieldValue(Registro1220.COD_CRED, GeraLongRandom(3));
        line.setFieldValue(Registro1220.VL_CRED, 11111111111111111111.11);


        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
    
}
