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
import static org.junit.Assert.*;

/**
 * 12/11/2011 10:54:15
 * @author rafael.galvao
 */
public class RegistroC195Test extends Randomize{
    
    public RegistroC195Test() {
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
     * Test of getNome method, of class RegistroC195.
     */
    @Test
    public void RegistroC195Test(){
        RegistroC195 reg = new RegistroC195();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC195.REG, "1234");
        line.setFieldValue(RegistroC195.CNPJ_CPF_PART, GeraStringRandom(14));
        line.setFieldValue(RegistroC195.CST_COFINS, 12L);
        line.setFieldValue(RegistroC195.CFOP, 1234L );
        line.setFieldValue(RegistroC195.VL_ITEM, 12345678912345678912.33 );
        line.setFieldValue(RegistroC195.VL_DESC, 12345678912345678912.33 );
        line.setFieldValue(RegistroC195.VL_BC_COFINS, 12345678912345678912.33 );
        line.setFieldValue(RegistroC195.ALIQ_COFINS, 12345678.4567 );
        line.setFieldValue(RegistroC195.QUANT_BC_COFINS, 12345678912345678912.333 );
        line.setFieldValue(RegistroC195.ALIQ_COFINS_QUANT, 12345678912345678912.3344 );
        line.setFieldValue(RegistroC195.VL_COFINS, 12345678912345678912.33 );
        line.setFieldValue(RegistroC195.COD_CTA, GeraStringRandom(60) );
        
        
        
        
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
        
        
        
        
        
    }
}
