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
 * 17/11/2011 20:23:56
 * @author Jonas
 */
public class RegistroF120Test {
    
     public RegistroF120Test() {
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
    public void registroF120test() throws ParseException {    
    
        RegistroF120 reg = new RegistroF120();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();        
        line.setFieldValue(RegistroF120.REG, "F004" );
        line.setFieldValue(RegistroF120.NAT_BC_CREDN, "q2" );
        line.setFieldValue(RegistroF120.IDENT_BEM_IMOB, 45l );
        line.setFieldValue(RegistroF120.IND_ORIG_CRED,"e" );
        line.setFieldValue(RegistroF120.IND_UTIL_BEM_IMOB, 2l); 
        line.setFieldValue(RegistroF120.VL_OPER_DEP, rm.GeraDoubleRandom(19));
        line.setFieldValue(RegistroF120.PARC_OPER_NAO_BC_CRED, rm.GeraDoubleRandom(19)); 
        line.setFieldValue(RegistroF120.CST_PIS, 23l );
        line.setFieldValue(RegistroF120.VL_BC_PIS, rm.GeraDoubleRandom(19));
        line.setFieldValue(RegistroF120.ALIQ_PIS, rm.GeraDoubleRandom(8));
        line.setFieldValue(RegistroF120.VL_PIS, rm.GeraDoubleRandom(19) );
        line.setFieldValue(RegistroF120.CST_COFINS, 12l);
        line.setFieldValue(RegistroF120.VL_BC_COFINS, rm.GeraDoubleRandom(19) );
        line.setFieldValue(RegistroF120.ALIQ_COFINS, rm.GeraDoubleRandom(8) );
        line.setFieldValue(RegistroF120.VL_COFINS, rm.GeraDoubleRandom(19) );
        line.setFieldValue(RegistroF120.COD_CTA, rm.GeraStringRandom(60) );
        line.setFieldValue(RegistroF120.COD_CCUS, rm.GeraStringRandom(60) );
        line.setFieldValue(RegistroF120.DESC_BEM_IMOB, rm.GeraStringRandom(255) );
        
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
