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
 * 17/11/2011 21:00:12
 * @author William Antunes
 */
public class Registro1210Test extends Randomize {
        public Registro1210Test() {
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
    public void Registro1210Test() throws ParseException{
        Registro1210 reg = new Registro1210();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
       
       
        line.setFieldValue(Registro1210.REG, GeraStringRandom(4));
        line.setFieldValue(Registro1210.CNPJ, GeraLongRandom(14));
        line.setFieldValue(Registro1210.CST_PIS, GeraLongRandom(2));
        line.setFieldValue(Registro1210.COD_PART, GeraStringRandom(60));
        line.setFieldValue(Registro1210.DT_OPER, data);
        line.setFieldValue(Registro1210.VL_OPER, 11111111111111111111.11);
        line.setFieldValue(Registro1210.VL_BC_PIS, 11111111111111111111.111);
        line.setFieldValue(Registro1210.ALIQ_PIS,11111111111111111111.1111 );
        line.setFieldValue(Registro1210.VL_PIS, 11111111111111111111.11);
        line.setFieldValue(Registro1210.COD_CTA, GeraStringRandom(60));
        line.setFieldValue(Registro1210.DESC_COMPL, GeraStringRandom(255));

        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
    
}
