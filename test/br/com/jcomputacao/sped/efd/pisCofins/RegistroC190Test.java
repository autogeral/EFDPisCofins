/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 11/11/2011 19:23:19
 * @author rafael.galvao
 */
public class RegistroC190Test extends Randomize{
    
    public RegistroC190Test() {
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
     * Test of getNome method, of class RegistroC190.
     */
    @Test
    public void RegistroC190Test() throws ParseException{
        RegistroC190 reg = new RegistroC190();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        line.setFieldValue(RegistroC190.REG, "1234");
        line.setFieldValue(RegistroC190.COD_MOD, "jj");
        line.setFieldValue(RegistroC190.DT_REF_INI, data);
        line.setFieldValue(RegistroC190.DT_REF_FIN, data);
        line.setFieldValue(RegistroC190.COD_ITEM, GeraStringRandom(60));
        line.setFieldValue(RegistroC190.COD_NCM, "zxcvbnm,");
        line.setFieldValue(RegistroC190.EX_IPI, "123");
        line.setFieldValue(RegistroC190.VL_TOT_ITEM, 12345678912345678912.33);
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
        
        
        
        
        
    }
}
