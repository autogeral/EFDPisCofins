
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 26/11/2011 10:50:52
 * @author Douglas
 */
public class Registro1610Test{

    public Registro1610Test() {
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
    public void Registro1610Test() throws ParseException{
        Registro1610 reg = new Registro1610();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(Registro1610.REG, "1610");
        line.setFieldValue(Registro1610.CNPJ, rm.GeraLongRandom(14));
        line.setFieldValue(Registro1610.CST_COFINS, rm.GeraLongRandom(2));
        line.setFieldValue(Registro1610.COD_PART, rm.GeraStringRandom(60));
        line.setFieldValue(Registro1610.DT_OPER, rm.GeraLongRandom(8));
        line.setFieldValue(Registro1610.VL_OPER, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1610.VL_BC_COFINS, rm.GeraDoubleRandom(3));
        line.setFieldValue(Registro1610.ALIQ_COFINS, rm.GeraDoubleRandom(4));
        line.setFieldValue(Registro1610.VL_COFINS, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1610.COD_CTA, rm.GeraStringRandom(60));
        line.setFieldValue(Registro1610.DESC_COMPL, rm.GeraStringRandom(254));

        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }

}