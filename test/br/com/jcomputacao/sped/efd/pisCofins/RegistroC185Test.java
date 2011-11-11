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
 * 11/11/2011 18:45:02
 * @author rafael.galvao
 */
public class RegistroC185Test extends Randomize {
    
    public RegistroC185Test(){
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
     * Test of getNome method, of class RegistroC185.
     */
    @Test
    public void RegistroC185Test(){
    RegistroC185 reg = new RegistroC185();
    LineModel line = reg.createModel();
    
    line.setFieldValue(RegistroC185.REG, "1234");
    line.setFieldValue(RegistroC185.CST_COFINS, 12L);
    line.setFieldValue(RegistroC185.CFOP, 1234L);
    line.setFieldValue(RegistroC185.VL_ITEM, 12345678912345678912.33);
    line.setFieldValue(RegistroC185.VL_DESC, 78945612378945612345.66);
    line.setFieldValue(RegistroC185.VL_BC_COFINS, 456789123456789123.99);
    line.setFieldValue(RegistroC185.ALIQ_COFINS, 12345678.6666);
    line.setFieldValue(RegistroC185.QUANT_BC_COFINS, 12345678912345678912.363);
    line.setFieldValue(RegistroC185.ALIQ_COFINS_QUANT, 12345678912345678912.1234 );
    line.setFieldValue(RegistroC185.VL_COFINS, 12345678912345678912.36);
    line.setFieldValue(RegistroC185.COD_CTA, GeraStringRandom(60));
    
    StringBuffer a = line.getRepresentation();
    System.out.print(a);
    
        
        
    }
}
