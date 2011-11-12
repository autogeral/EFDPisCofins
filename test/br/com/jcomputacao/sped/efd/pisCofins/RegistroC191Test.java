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
 * $[date] $[time]
 * @author rafael.galvao
 */
public class RegistroC191Test extends Randomize{
    
    public RegistroC191Test() {
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
     * Test of getNome method, of class RegistroC191.
     */
    @Test
    public void RegistroC191Test(){
        RegistroC191 reg = new RegistroC191();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC191.REG, "1234");
        line.setFieldValue(RegistroC191.CNPJ_CPF_PART, GeraStringRandom(14));
        line.setFieldValue(RegistroC191.CST_PIS, 12L);
        line.setFieldValue(RegistroC191.CFOP, 1234L );
        line.setFieldValue(RegistroC191.VL_ITEM, 12345678912345678912.33 );
        line.setFieldValue(RegistroC191.VL_DESC, 12345678912345678912.33 );
        line.setFieldValue(RegistroC191.VL_BC_PIS, 12345678912345678912.33 );
        line.setFieldValue(RegistroC191.ALIQ_PIS, 12345678.4567 );
        line.setFieldValue(RegistroC191.QUANT_BC_PIS, 12345678912345678912.333 );
        line.setFieldValue(RegistroC191.ALIQ_PIS_QUANT, 12345678912345678912.3344 );
        line.setFieldValue(RegistroC191.VL_PIS, 12345678912345678912.33 );
        line.setFieldValue(RegistroC191.COD_CTA, GeraStringRandom(60) );
        
        
        
        
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
        
        
        
        
        
    }
}
