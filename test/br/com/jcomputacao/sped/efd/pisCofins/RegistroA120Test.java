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
import static org.junit.Assert.*;
/**
 * 09/11/2011 21:57:53
 * @author Jonas
 */
public class RegistroA120Test {
    
     public RegistroA120Test(){
    }
     
    public String linhaRegistroA120Test() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data =  sdf.parse("29012013");
        
        RegistroA120 reg = new RegistroA120();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(RegistroA120.VL_TOT_SERV, 123.15);
        //03
        line.setFieldValue(RegistroA120.VL_BC_PIS,23.12);
        //04
        line.setFieldValue(RegistroA120.VL_PIS_IMP, 13.15);
        //05
        line.setFieldValue(RegistroA120.DT_PAG_PIS, data);
        //06
        line.setFieldValue(RegistroA120.VL_BC_COFINS,3.12);
        //07
        line.setFieldValue(RegistroA120.VL_COFINS_IMP, 5487.65);
        //08
        line.setFieldValue(RegistroA120.DT_PAG_COFINS, data);
        //09
        line.setFieldValue(RegistroA120.LOC_EXE_SERV, "0");
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|A120|123,15|23,12|13,15|29012013|3,12|5487,65|29012013|0|";
//        assertEquals (expected, sb.toString());
        return sb.toString();
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
    public void testSomeMethod() {
    }
}
