/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 17/11/2011 20:30:55
 * @author William Antunes
 */
public class Registro1102Test extends Randomize {
                public Registro1102Test() {
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
    public void Registro1102Test(){
        Registro1102 reg = new Registro1102();
        LineModel line = reg.createModel();
       
        line.setFieldValue(Registro1102.REG, GeraStringRandom(4));
        line.setFieldValue(Registro1102.VL_CRED_PIS_TRIB_MI, 11111111111111111111.11);
        line.setFieldValue(Registro1102.VL_CRED_PIS_NT_MI, 11111111111111111111.11);
        line.setFieldValue(Registro1102.VL_CRED_PIS_EXP, 11111111111111111111.11);

        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
    
    
}
