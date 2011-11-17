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
 * 17/11/2011 19:37:48
 * @author William Antunes
 */
public class Registro1101Test extends Randomize {
    
    public Registro1101Test() {
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
    public void Registro1101Test() throws ParseException{
        Registro1101 reg = new Registro1101();
        LineModel line = reg.createModel();
                SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
       
        line.setFieldValue(Registro1101.REG, GeraStringRandom(4));
        line.setFieldValue(Registro1101.COD_PART, GeraStringRandom(60));
        line.setFieldValue(Registro1101.COD_ITEM, GeraStringRandom(60));
        line.setFieldValue(Registro1101.COD_MOD, GeraStringRandom(2));
        line.setFieldValue(Registro1101.SER, GeraStringRandom(4));
        line.setFieldValue(Registro1101.SUB_SER, GeraStringRandom(3));
        line.setFieldValue(Registro1101.NUM_DOC, GeraLongRandom(9));
        line.setFieldValue(Registro1101.DT_OPER,data );
        line.setFieldValue(Registro1101.CHV_NFE, GeraStringRandom(44));
        line.setFieldValue(Registro1101.VL_OPER, 11111111111111111111.11);
        line.setFieldValue(Registro1101.CFOP, GeraLongRandom(4));
        line.setFieldValue(Registro1101.NAT_BC_CRED, GeraStringRandom(2));
        line.setFieldValue(Registro1101.IND_ORIG_CRED, GeraStringRandom(1));
        line.setFieldValue(Registro1101.CST_PIS, GeraLongRandom(2));
        line.setFieldValue(Registro1101.VL_BC_PIS, 11111111111111111111.111);
        line.setFieldValue(Registro1101.ALIQ_PIS, 11111111111111111111.1111);
        line.setFieldValue(Registro1101.VL_PIS, 11111111111111111111.11);
        line.setFieldValue(Registro1101.COD_CTA, GeraStringRandom(60));        
        line.setFieldValue(Registro1101.COD_CCUS, GeraStringRandom(60));
        line.setFieldValue(Registro1101.DESC_COMPL, GeraStringRandom(255));
        line.setFieldValue(Registro1101.PER_ESCRIT, GeraLongRandom(6));
        line.setFieldValue(Registro1101.CNPJ, GeraLongRandom(14));

        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
    
}
