/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafael.galvao
 */
public class Registro0100Test {

    public Registro0100Test() {
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
    public void registro0100test() {
        Registro0100 reg = new Registro0100();
        LineModel line = reg.createModel();

        line.setFieldValue(Registro0100.REG, "1323");
        line.setFieldValue(Registro0100.NOME, "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll");
        line.setFieldValue(Registro0100.CPF, 12312312319L);
        line.setFieldValue(Registro0100.CRC, "aaaaaaaaaaaaaaa");
        line.setFieldValue(Registro0100.CNPJ, 11111111111111L);
        line.setFieldValue(Registro0100.CEP, 22222222L);
        line.setFieldValue(Registro0100.END, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        line.setFieldValue(Registro0100.NUM, "cccccccccccccccccccc");
        line.setFieldValue(Registro0100.COMPL, "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        line.setFieldValue(Registro0100.BAIRRO, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        line.setFieldValue(Registro0100.FONE, "EEEEEEEEEE");
        line.setFieldValue(Registro0100.FAX, "ffffffffff");
        line.setFieldValue(Registro0100.EMAIL, "dddddddddddddddddddd");
        line.setFieldValue(Registro0100.COD_MUN, 1234576L);

        StringBuffer sb = line.getRepresentation();
        //   String expected = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx    "+ "1323" + 22222222l + 1111111111111l;
        System.out.print(sb);
        // assertEquals(expected, sb.toString());

    }
}
