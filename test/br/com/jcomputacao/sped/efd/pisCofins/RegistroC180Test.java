/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 10/11/2011 21:21:26
 * @author rafael.galvao
 */
public class RegistroC180Test extends StringRandom {
    
    public RegistroC180Test() {
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
     * Test of getNome method, of class RegistroC180.
     */
    @Test
    public void RegistroC180Test() throws ParseException{
        RegistroC180 reg = new RegistroC180();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        line.setFieldValue(RegistroC180.REG, "1234");
        line.setFieldValue(RegistroC180.COD_MOD, "fd");
        line.setFieldValue(RegistroC180.DT_DOC_INI, data);
        line.setFieldValue(RegistroC180.DT_DOC_FIN, data);
        line.setFieldValue(RegistroC180.COD_ITEM, GeraStringRandom(60) );
        line.setFieldValue(RegistroC180.COD_NCM, GeraStringRandom(8) );
        line.setFieldValue(RegistroC180.EX_IPI, "asd");
        line.setFieldValue(RegistroC180.VL_TOT_ITEM, 12345678912345678912.35);
        
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
        
        
    }
}
