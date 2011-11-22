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
 * 22/11/2011 20:26:48
 * @author rafael.galvao
 */
public class RegistroM210Test {
    
    public RegistroM210Test() {
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
     * Test of getNome method, of class RegistroM210.
     */
    @Test
    public void RegistroM210Test()  {
        RegistroM210 reg = new RegistroM210();
        LineModel line = reg.createModel();
                 
        line.setFieldValue(RegistroM210.REG, "0100");
        line.setFieldValue(RegistroM210.COD_CONT, 12135464895.66);
        line.setFieldValue(RegistroM210.VL_REC_BRT, 23324848754.45);
        line.setFieldValue(RegistroM210.VL_BC_CONT, 121314.6612);        
        line.setFieldValue(RegistroM210.ALIQ_PIS, 326598785564.663);
        line.setFieldValue(RegistroM210.QUANT_BC_PIS, 3215467894564654.6655);
        line.setFieldValue(RegistroM210.ALIQ_PIS_QUANT, 123456789456123.66);
        line.setFieldValue(RegistroM210.VL_CONT_APUR, 12135464895.66);
        line.setFieldValue(RegistroM210.VL_AJUS_ACRES, 23324848754.45);
        line.setFieldValue(RegistroM210.VL_AJUS_REDUC, 1213145646544.66);        
        line.setFieldValue(RegistroM210.VL_CONT_DIFER, 326598785564.66);
        line.setFieldValue(RegistroM210.VL_CONT_DIFER_ANT, 3215467894564654.66);
        line.setFieldValue(RegistroM210.VL_CONT_PER, 123456789456123.66);
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
