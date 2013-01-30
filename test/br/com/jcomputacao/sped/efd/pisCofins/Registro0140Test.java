/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 09/11/2011 09:51:25
 * @author WILL
 */
public class Registro0140Test {
     public Registro0140Test() {
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
    public String linhaRegistro0140Test() throws ParseException{
        Registro0140 reg = new Registro0140();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0140.COD_EST, "Código de identificação do estabelecimento");
        //03
        line.setFieldValue(Registro0140.NOME, "Nome empresarial do estabelecimento");
        //04
        line.setFieldValue(Registro0140.CNPJ, 11111111111111L);
        //05
        line.setFieldValue(Registro0140.UF, "SP");
        //06
        line.setFieldValue(Registro0140.IE, "11111111111111");
        //07
        line.setFieldValue(Registro0140.COD_MUN, 1111111L);
        //08
        line.setFieldValue(Registro0140.IM, "Inscrição Municipal do estabelecimento, se contribuinte do ISS.");
        //09
        line.setFieldValue(Registro0140.SUFRAMA, "111111111");
        
        
        StringBuffer sb = line.getRepresentation();
        //String expected = "|0140|Código de identificação do estabelecimento|Nome empresarial do estabelecimento|11111111111111|SP|11111111111111|1111111|Inscrição Municipal do estabelecimento, se contribuinte do ISS.|111111111|";
        //System.out.println(sb);
        //System.out.print(expected);
        //assertEquals (expected, sb.toString());
        return sb.toString();
    }
}
