/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 12/11/2011 12:03:04
 * @author rafael.galvao
 */
public class RegistroM700Test {

    public RegistroM700Test() {
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
    public void RegistroM700Test() throws ParseException {
        RegistroM700 reg = new RegistroM700();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        line.setFieldValue(RegistroM700.REG, "1234");
        line.setFieldValue(RegistroM700.COD_CONT, "12");
        line.setFieldValue(RegistroM700.VL_CONT_APUR_DIFER, 123456789123456789.36);
        line.setFieldValue(RegistroM700.NAT_CRED_DESC, "12");
        line.setFieldValue(RegistroM700.VL_CRED_DESC_DIFER, 123456789123456789.45);
        line.setFieldValue(RegistroM700.VL_CONT_DIFER_ANT, 123456789123456789.25);
        line.setFieldValue(RegistroM700.PER_APUR, 123456L);
        line.setFieldValue(RegistroM700.DT_RECEB, data);

        StringBuffer r = line.getRepresentation();
        System.out.print(r);


    }
}
