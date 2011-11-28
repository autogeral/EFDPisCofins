
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 26/11/2011 09:14:31
 * @author Douglas
 */
public class Registro1501Test{

    public Registro1501Test() {
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
    public void Registro1501Test() throws ParseException{
        Registro1501 reg = new Registro1501();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(Registro1501.REG, "1501");
        line.setFieldValue(Registro1501.COD_PART, rm.GeraStringRandom(60));
        line.setFieldValue(Registro1501.COD_ITEM, rm.GeraStringRandom(60));
        line.setFieldValue(Registro1501.COD_MOD, rm.GeraStringRandom(2));
        line.setFieldValue(Registro1501.SER, rm.GeraStringRandom(4));
        line.setFieldValue(Registro1501.SUB_SER, rm.GeraStringRandom(3));
        line.setFieldValue(Registro1501.NUM_DOC, rm.GeraLongRandom(9));
        line.setFieldValue(Registro1501.DT_OPER, rm.GeraLongRandom(8));
        line.setFieldValue(Registro1501.CHV_NFE, rm.GeraStringRandom(44));
        line.setFieldValue(Registro1501.VL_OPER, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1501.CFOP, rm.GeraLongRandom(4));
        line.setFieldValue(Registro1501.NAT_BC_CRED, rm.GeraStringRandom(2));
        line.setFieldValue(Registro1501.IND_ORIG_CRED, rm.GeraStringRandom(1));
        line.setFieldValue(Registro1501.CST_COFINS, rm.GeraLongRandom(2));
        line.setFieldValue(Registro1501.VL_BC_COFINS, rm.GeraDoubleRandom(3));
        line.setFieldValue(Registro1501.ALIQ_COFINS, rm.GeraDoubleRandom(4));
        line.setFieldValue(Registro1501.VL_COFINS, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1501.COD_CTA, rm.GeraStringRandom(60));
        line.setFieldValue(Registro1501.COD_CCUS, rm.GeraStringRandom(60));
        line.setFieldValue(Registro1501.DESC_COMPL, rm.GeraStringRandom(254));
        line.setFieldValue(Registro1501.PER_ESCRIT, rm.GeraLongRandom(6));
        line.setFieldValue(Registro1501.CNPJ, rm.GeraLongRandom(14));


        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }

}