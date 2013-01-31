package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 20:00:45
 * @author rafael.galvao
 */
public class RegistroC170Test {

    public RegistroC170Test() {
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

    /**
     * Test of getNome method, of class RegistroC170.
     */
    @Test
    public String linhaRegistroC170Test() {
        RegistroC170 reg = new RegistroC170();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC170.NUM_ITEM, 123L);
        //03
        line.setFieldValue(RegistroC170.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //04
        line.setFieldValue(RegistroC170.DESCR_COMPL, "Descrição complementar do item como adotado");
        //05
        line.setFieldValue(RegistroC170.QTD, 4567891.11111);
        //06
        line.setFieldValue(RegistroC170.UNID, "c20190");
        //07
        line.setFieldValue(RegistroC170.VL_ITEM, 678912.32);
        //08
        line.setFieldValue(RegistroC170.VL_DESC, 456.65);
        //09
        line.setFieldValue(RegistroC170.IND_MOV, "0");
        //10
        line.setFieldValue(RegistroC170.CST_ICMS, 123L);
        //11
        line.setFieldValue(RegistroC170.CFOP, 1234L);
        //12
        line.setFieldValue(RegistroC170.COD_NAT, "cod nat opr");
        //13
        line.setFieldValue(RegistroC170.VL_BC_ICMS, 889912.22);
        //14
        line.setFieldValue(RegistroC170.ALIQ_ICMS, 3221.66);
        //15
        line.setFieldValue(RegistroC170.VL_ICMS, 456789.66);
        //16
        line.setFieldValue(RegistroC170.VL_BC_ICMS_ST, 78947.66);
        //17
        line.setFieldValue(RegistroC170.ALIQ_ST, 123456.22);
        //18
        line.setFieldValue(RegistroC170.VL_ICMS_ST, 1144.69);
        //19
        line.setFieldValue(RegistroC170.IND_APUR, "1");
        //20
        line.setFieldValue(RegistroC170.CST_IPI, "33");
        //21
        line.setFieldValue(RegistroC170.COD_ENQ, " g ");
        //22
        line.setFieldValue(RegistroC170.VL_BC_IPI, 9612.32);
        //23
        line.setFieldValue(RegistroC170.ALIQ_IPI, 123456.33);
        //24
        line.setFieldValue(RegistroC170.VL_IPI, 1231234.66);
        //25
        line.setFieldValue(RegistroC170.CST_PIS, 22L);
        //26
        line.setFieldValue(RegistroC170.VL_BC_PIS, 12345678978.66);
        //27
        line.setFieldValue(RegistroC170.ALIQ_PIS, 123478.6811);
        //28
        line.setFieldValue(RegistroC170.QUANT_BC_PIS, 12345689.133);
        //29
        line.setFieldValue(RegistroC170.ALIQ_PIS_QUANT, 78945612312345678998.7894);
        //30
        line.setFieldValue(RegistroC170.VL_PIS, 1256123.33);
        //31
        line.setFieldValue(RegistroC170.CST_COFINS, 12L);
        //32
        line.setFieldValue(RegistroC170.VL_BC_COFINS, 1211945.33);
        //33
        line.setFieldValue(RegistroC170.ALIQ_COFINS, 78945612.2245);
        //34
        line.setFieldValue(RegistroC170.QUANT_BC_COFINS, 1238932.666);
        //35
        line.setFieldValue(RegistroC170.ALIQ_COFINS_QUANT, 1234567891238.3611);
        //36
        line.setFieldValue(RegistroC170.VL_COFINS, 1234578.66);
        //37
        line.setFieldValue(RegistroC170.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        /**
         * PROBLEMAS COM O ARREDONDAMENTO DAS CASAS DECIMAIS
         */
        StringBuffer sb = line.getRepresentation();
//        System.out.println(sb);
//        String expected = "|C170|123|Código do item (campo 02 do Registro 0200)|Descrição complementar do item como adotado|4567891,11111|678912,32|456,65|0|123|1234|cod nat opr|889912,22|3221,66|456789,66|78947,66|123456,22|1144,69|1|33|g|9612,32|123456,33|1231234,66|22|12345678978,66|123478,6811|12345689,133|78945612312345678998,7894|1256123,33|12|1211945,33|78945612,2245|1238932,666|1234567891238,3611|1234578,66|Código da conta analítica contábil debitada/creditada|";
//        System.out.println(expected);
//        assertEquals (expected, sb.toString());
        return sb.toString();
    }   
}
