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
 * 17/11/2011 21:30:02
 * @author Jonas
 */
public class RegistroF130Test {
    
     public RegistroF130Test() {
         
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
    public void registroF130test() throws ParseException {


        RegistroF130 reg = new RegistroF130();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();
        
        
        line.setFieldValue(RegistroF130.REG, "F130");
        line.setFieldValue(RegistroF130.NAT_BC_CRED, "w4");
        line.setFieldValue(RegistroF130.IDENT_BEM_IMOB, 99l);
        line.setFieldValue(RegistroF130.IND_ORIG_CRED, "1"); 
        line.setFieldValue(RegistroF130.IND_UTIL_BEM_IMOB, 3l );   
        line.setFieldValue(RegistroF130.MES_OPER_AQUIS, rm.GeraLongRandom(6));      
        line.setFieldValue(RegistroF130.VL_OPER_AQUIS, rm.GeraDoubleRandom(19)); 
        line.setFieldValue(RegistroF130.PARC_OPER_NAO_BC_CRED, rm.GeraDoubleRandom(19));
        line.setFieldValue(RegistroF130.VL_BC_CRED, rm.GeraDoubleRandom(19)); 
        line.setFieldValue(RegistroF130.IND_NR_PARC, 2l);    
        line.setFieldValue(RegistroF130.CST_PIS, 24l);  
        line.setFieldValue(RegistroF130.VL_BC_PIS, rm.GeraDoubleRandom(19));   
        line.setFieldValue(RegistroF130.ALIQ_PIS, rm.GeraDoubleRandom(8));      
        line.setFieldValue(RegistroF130.VL_PIS, rm.GeraDoubleRandom(19));   
        line.setFieldValue(RegistroF130.CST_COFINS, 57l);     
        line.setFieldValue(RegistroF130.VL_BC_COFINS, rm.GeraDoubleRandom(19));         
        line.setFieldValue(RegistroF130.ALIQ_COFINS, rm.GeraDoubleRandom(8));   
        line.setFieldValue(RegistroF130.VL_COFINS, rm.GeraDoubleRandom(19));      
        line.setFieldValue(RegistroF130.COD_CTA, rm.GeraStringRandom(60)); 
        line.setFieldValue(RegistroF130.COD_CCUS, rm.GeraStringRandom(60)); 
        line.setFieldValue(RegistroF130.DESC_BEM_IMOB, rm.GeraStringRandom(60)); 
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
        
    }
    
}
