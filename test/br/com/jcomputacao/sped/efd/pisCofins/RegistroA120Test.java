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
 * 09/11/2011 21:57:53
 * @author Jonas
 */
public class RegistroA120Test {
    
     public RegistroA120Test(){
        
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
    public void registroA110test() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date d =  sdf.parse("10101987");
        
        RegistroA120 reg = new RegistroA120();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroA120.REG, "0001");
        line.setFieldValue(RegistroA120.VL_TOT_SERV, 123.15);
        line.setFieldValue(RegistroA120.VL_BC_PIS,23.12);
        line.setFieldValue(RegistroA120.VL_PIS_IMP, 13.15);
         line.setFieldValue(RegistroA120.DT_PAG_PIS, d );
        line.setFieldValue(RegistroA120.VL_BC_COFINS,3.12);
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
    
    
}
