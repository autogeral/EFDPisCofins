/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 17/11/2011 20:43:11
 * @author William Antunes
 */
public class Registro1200Test extends Randomize {
       
    public Registro1200Test() {
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
    public void Registro1200Test() throws ParseException{
        Registro1200 reg = new Registro1200();
        LineModel line = reg.createModel();
       
        line.setFieldValue(Registro1200.REG, GeraStringRandom(4));
        line.setFieldValue(Registro1200.PER_APUR_ANT, GeraLongRandom(6));
        line.setFieldValue(Registro1200.NAT_CONT_REC, GeraStringRandom(2));
        line.setFieldValue(Registro1200.VL_CONT_APUR, 11111111111111111111.11);
        line.setFieldValue(Registro1200.VL_CRED_PIS_DESC, 11111111111111111111.11);
        line.setFieldValue(Registro1200.VL_CONT_DEV, 11111111111111111111.11);
        line.setFieldValue(Registro1200.VL_OUT_DED, 11111111111111111111.11);
        line.setFieldValue(Registro1200.VL_CONT_EXT,11111111111111111111.11 );
        line.setFieldValue(Registro1200.VL_MUL, 11111111111111111111.11);
        line.setFieldValue(Registro1200.VL_JUR, 11111111111111111111.11);
        line.setFieldValue(Registro1200.DT_RECOL, 11111111l);

        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
    
    
}
