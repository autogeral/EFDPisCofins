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
public class Registro0200Test {
    
    public Registro0200Test() {
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
    public void Registro0200Test(){
        Registro0200 reg = new Registro0200();
        LineModel line = reg.createModel();
        
         line.setFieldValue(Registro0200.REG, "0001");
         line.setFieldValue(Registro0200.COD_ITEM, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
         line.setFieldValue(Registro0200.DESCR_ITEM, "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
         line.setFieldValue(Registro0200.COD_BARRA, "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
         line.setFieldValue(Registro0200.COD_ANT_ITEM, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
         line.setFieldValue(Registro0200.UNID_INV, "kkkkkk");
         line.setFieldValue(Registro0200.TIPO_ITEM, 01L);
         line.setFieldValue(Registro0200.COD_NCM, "ssssssss");
         line.setFieldValue(Registro0200.EX_IPI, "kkk");
         line.setFieldValue(Registro0200.COD_GEN, 01L);
         line.setFieldValue(Registro0200.COD_LST, 0001L);
         line.setFieldValue(Registro0200.ALIQ_ICMS, 123456.12);
         
         StringBuffer as = line.getRepresentation();
         System.out.print(as);
         
         
         
         
         
         
         
    }
}
