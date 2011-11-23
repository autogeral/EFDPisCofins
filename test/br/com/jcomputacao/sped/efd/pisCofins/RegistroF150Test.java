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
 * 17/11/2011 22:42:59
 * @author Jonas
 */
public class RegistroF150Test {

    public RegistroF150Test() {
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
    public void registroF150test() throws ParseException {


        RegistroF150 reg = new RegistroF150();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(RegistroF150.REG, "F001");
        line.setFieldValue(RegistroF150.NAT_BC_CRED, "18");
        line.setFieldValue(RegistroF150.VL_TOT_EST, rm.GeraDoubleRandom(19));
        line.setFieldValue(RegistroF150.EST_IMP, rm.GeraDoubleRandom(19));
        line.setFieldValue(RegistroF150.VL_BC_EST, rm.GeraDoubleRandom(19));
        line.setFieldValue(RegistroF150.VL_BC_MEN_EST, rm.GeraDoubleRandom(19));
        line.setFieldValue(RegistroF150.CST_PIS, 23l);
        line.setFieldValue(RegistroF150.ALIQ_PIS, rm.GeraDoubleRandom(8));
//        line.setFieldValue(RegistroF150.VL_CRED_PIS, );
//        line.setFieldValue(RegistroF150.CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
//        line.setFieldValue(RegistroF150.ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8, 2));
//        line.setFieldValue(RegistroF150.VL_CRED_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
//        line.setFieldValue(RegistroF150.DESC_EST, new FieldStringMaximumLengthArchetype(100));
//        line.setFieldValue(RegistroF150.COD_CTA, new FieldStringMaximumLengthArchetype(60));

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
