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
 * 22/11/2011 20:15:22
 * @author rafael.galvao
 */
public class RegistroM200Test {
    
    public RegistroM200Test() {
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
     * Test of getNome method, of class RegistroM200.
     */
    @Test
    public void RegistroM200Test()  {
        RegistroM200 reg = new RegistroM200();
        LineModel line = reg.createModel();
                 
        line.setFieldValue(RegistroM200.REG, "0100");
        line.setFieldValue(RegistroM200.VL_TOT_CONT_NC_PER, 12135464895.66);
        line.setFieldValue(RegistroM200.VL_TOT_CRED_DESC, 23324848754.45);
        line.setFieldValue(RegistroM200.VL_TOT_CRED_DESC_ANT, 1213145646544.66);        
        line.setFieldValue(RegistroM200.VL_TOT_CONT_NC_DEV, 326598785564.66);
        line.setFieldValue(RegistroM200.VL_RET_NC, 3215467894564654.66);
        line.setFieldValue(RegistroM200.VL_OUT_DED_NC, 123456789456123.66);
        line.setFieldValue(RegistroM200.VL_CONT_NC_REC, 12135464895.66);
        line.setFieldValue(RegistroM200.VL_TOT_CONT_CUM_PER, 23324848754.45);
        line.setFieldValue(RegistroM200.VL_RET_CUM, 1213145646544.66);        
        line.setFieldValue(RegistroM200.VL_OUT_DED_CUM, 326598785564.66);
        line.setFieldValue(RegistroM200.VL_CONT_CUM_REC, 3215467894564654.66);
        line.setFieldValue(RegistroM200.VL_TOT_CONT_REC, 123456789456123.66);
        
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
