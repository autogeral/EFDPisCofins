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
 * 10/11/2011 21:48:02
 * @author rafael.galvao
 */
public class RegistroC181Test extends Randomize {
    
    public RegistroC181Test() {
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

    /**
     * Test of getNome method, of class RegistroC181.
     */
    @Test
    public void RegistroC181Test(){
        RegistroC181 reg = new RegistroC181();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC181.REG, GeraStringRandom(4));
        line.setFieldValue(RegistroC181.CST_PIS, GeraLongRandom(2));
        line.setFieldValue(RegistroC181.CFOP, GeraLongRandom(4));
        line.setFieldValue(RegistroC181.VL_ITEM, 12345678912345678912.33);
        line.setFieldValue(RegistroC181.VL_DESC, 78945612378945612332.66);
        line.setFieldValue(RegistroC181.VL_BC_PIS, 12345612345612345612345612.33);
        line.setFieldValue(RegistroC181.ALIQ_PIS, 12345678.1234);
        line.setFieldValue(RegistroC181.QUANT_BC_PIS, 12345678912345678912.123);
        line.setFieldValue(RegistroC181.ALIQ_PIS_QUANT, 12345678912345678912.1234);
        line.setFieldValue(RegistroC181.VL_PIS, 45678912345678912345.12);
        line.setFieldValue(RegistroC181.COD_CTA, GeraStringRandom(60));
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
        
        
        
        
        
        
        
    }
}
