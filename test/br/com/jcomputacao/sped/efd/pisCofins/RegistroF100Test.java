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
 * 10/11/2011 22:08:04
 * @author Jonas
 */
public class RegistroF100Test {

    public RegistroF100Test() {
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
    public void registroF100test() throws ParseException {


        RegistroF100 reg = new RegistroF100();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();
         SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date d =  sdf.parse("10101987");
        
        line.setFieldValue(RegistroF100.REG, "F001");
        line.setFieldValue(RegistroF100.IND_OPER, "1");
        line.setFieldValue(RegistroF100.COD_PART, rm.GeraStringRandom(60));
        line.setFieldValue(RegistroF100.COD_ITEM, rm.GeraStringRandom(60));
        line.setFieldValue(RegistroF100.DT_ITEM, d);
        line.setFieldValue(RegistroF100.VL_OPER, 13515496165654.34);
        line.setFieldValue(RegistroF100.CST_PIS, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF100.VL_BC_PIS, 54654564654654.87);
        line.setFieldValue(RegistroF100.ALIQ_PIS, 12345678.1234);
        line.setFieldValue(RegistroF100.VL_PIS, 54654546456456456654.02);
        line.setFieldValue(RegistroF100.CST_COFINS, rm.GeraLongRandom(2));
        line.setFieldValue(RegistroF100.VL_BC_COFINS, 5564564654654.2315);
        line.setFieldValue(RegistroF100.ALIQ_COFINS, 56456487.2132);       
        line.setFieldValue(RegistroF100.VL_COFINS, 21132168944.23);
        line.setFieldValue(RegistroF100.NAT_BC_CRED, rm.GeraStringRandom(2));
        line.setFieldValue(RegistroF100.IND_Orig_CRED, "t");
          line.setFieldValue(RegistroF100.COD_CTA, rm.GeraStringRandom(60));
        line.setFieldValue(RegistroF100.COD_CCUS, rm.GeraStringRandom(60));
        line.setFieldValue(RegistroF100.DESC_DOC_OPER, rm.GeraStringRandom(255)); 



        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
