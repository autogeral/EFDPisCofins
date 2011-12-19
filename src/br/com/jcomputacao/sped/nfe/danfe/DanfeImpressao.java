/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.nfe.danfe;

import br.inf.portalfiscal.nfe.TNFe;
import br.inf.portalfiscal.nfe.TNfeProc;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author William
 */
public class DanfeImpressao {

    private Document document = null;
    private PdfWriter writer = null;
    private Font headerFont = new Font(FontFamily.HELVETICA, 11, Font.BOLD);
    private Font headerSubFont = new Font(FontFamily.HELVETICA, 10, Font.NORMAL);
    private Font titleFont = new Font(FontFamily.HELVETICA, 14, Font.BOLD);
    private Font normalFont = new Font(FontFamily.HELVETICA, 8, Font.NORMAL);
    private Font normalBold = new Font(FontFamily.HELVETICA, 5, Font.BOLD);
    private Font lowerBold = new Font(FontFamily.HELVETICA, 4, Font.BOLD);
    private Font upperFont = new Font(FontFamily.HELVETICA, 3, Font.NORMAL);
    private Font itemFont = new Font(FontFamily.HELVETICA, 5, Font.NORMAL);
    private Font smallFont = new Font(FontFamily.HELVETICA, 4, Font.NORMAL);
    private Font subTitle = new Font(FontFamily.HELVETICA, 7, Font.BOLD);
    private List<TNfeProc> nfes = null;
    private TNfeProc atual;

    public DanfeImpressao(TNfeProc nfe) {
        this.nfes = new ArrayList<TNfeProc>();
        this.nfes.add(nfe);
    }

    public DanfeImpressao(List<TNfeProc> nfes) {
        this.nfes = nfes;
    }

    public ByteArrayOutputStream execute() throws DocumentException, IOException {
        document = new Document(PageSize.A4);
        document.setMargins(20f, 20f, 20f, 20f);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        writer = PdfWriter.getInstance(document, baos);

        document.open();
        document.addTitle("DANFE");
        document.addSubject("Documento Auxiliar da Nota Fiscal Eletronica");

        for (TNfeProc nfe : nfes) {
            this.atual = nfe;
            printNfe();
        }

        document.close();
        return baos;
    }

    private void printNfe() throws DocumentException {
        if (this.document == null || this.writer == null) {
            throw new IllegalStateException("Documento pdf e writer em estados inválidos");
        }

        if (this.atual == null) {
            throw new IllegalStateException("Sem nfe atual");
        }



//        class RoundRectangle implements PdfPCellEvent {  
///** 
// * @see com.lowagie.text.pdf.PdfPCellEvent#cellLayout(com.lowagie.text.pdf.PdfPCell, 
// *      com.lowagie.text.Rectangle, 
// *      com.lowagie.text.pdf.PdfContentByte[]) 
// */  
//            @Override
//            public void cellLayout(PdfPCell cell, Rectangle rect,  
//            PdfContentByte[] canvas) {  
//            PdfContentByte cb = canvas[PdfPTable.LINECANVAS];  
//            cb.setColorStroke(new GrayColor(0.8f));  
//            cb.roundRectangle(rect.getLeft() + 4, rect.getBottom(), rect.getWidth() - 8,  
//            rect.getHeight() - 4, 25);  
//            cb.stroke();  
//            }  
//            }   



        PdfPTable table;
        PdfPCell cell8;




        //1ºlinha



        table = new PdfPTable(new float[]{0.78f, 0.22f});
        PdfPCell cell;
        table.setWidthPercentage(100);
        cell = new PdfPCell(new Phrase("RECEBEMOS DE      OS PRODUTOS/SERVIÇOS CONSTANTES DA NOTA FISCAL INDICADA AO LADO\n\n\n ", upperFont));
        cell.setVerticalAlignment(Element.ALIGN_TOP);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getSpace() + "NF-e \n\n\n    N° " + getNum(), upperFont));
        cell.setVerticalAlignment(Element.ALIGN_TOP);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setBorder(13);
        table.addCell(cell);

        document.add(table);


        table = new PdfPTable(new float[]{0.22f, 0.56f, 0.22f});
        table.setWidthPercentage(100);
        cell = new PdfPCell(new Phrase(" "));
        cell = new PdfPCell(new Phrase("DATA DE RECEBIMENTO\n\n\n", upperFont));
        cell.setVerticalAlignment(Element.ALIGN_TOP);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("IDENTIFICAÇÃO E ASSINATURA DO RECEBEDOR\n\n\n", upperFont));
        cell.setVerticalAlignment(Element.ALIGN_TOP);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("    SÉRIE : " + getSerie() + "\n\n\n", upperFont));
        cell.setVerticalAlignment(Element.ALIGN_TOP);
        cell.setBorder(14);
        table.addCell(cell);
        document.add(table);


        // linha 
        PdfContentByte cb = writer.getDirectContent();
        cb.setLineWidth(0f);
        float y = document.getPageSize().getHeight() - 53;
        cb.moveTo(20, y);
        cb.lineTo(document.getPageSize().getWidth() - 20, y);
        cb.stroke();




        table = new PdfPTable(new float[]{0.45f, 0.20f, 0.35f});
        cell.setMinimumHeight(60);
        table.setSpacingBefore(8);
        table.setWidthPercentage(100);
        PdfPTable table2 = new PdfPTable(new float[]{0.2f, 0.8f});
        PdfPCell cell2 = new PdfPCell();
        PdfPCell cell3 = new PdfPCell(new Phrase("\n\n" + getNomeEmit(), normalBold));


        Phrase frase1 = new Phrase(getNomeEmit(), normalBold);
        cell3.setHorizontalAlignment(Phrase.ALIGN_CENTER);
        cell3.setVerticalAlignment(Phrase.ALIGN_CENTER);


        cell2.setBorder(0);
        table2.addCell(cell2);
        cell3.setBorder(0);
        table2.addCell(cell3);
        table.setWidthPercentage(100);

        Phrase frase2 = new Phrase(getEnderEmit(), normalBold);
        Paragraph p2 = new Paragraph(frase2);
        p2.setAlignment(Phrase.ALIGN_CENTER);

        frase1 = new Phrase("\n\n\n\n\n" + getNomeEmit(), normalBold);
        Paragraph p1 = new Paragraph(frase1);
        Paragraph spc = new Paragraph(" ");
        p1.setAlignment(Phrase.ALIGN_LEFT);

        cell2.addElement(p1);
        cell = new PdfPCell();
        cell.addElement(table2);
        cell.addElement(spc);
        cell.addElement(p2);
        cell.setMinimumHeight(80);
        table.addCell(cell);
        document.add(table);


        cell = new PdfPCell();
        cell.setHorizontalAlignment(Phrase.ALIGN_CENTER);
        frase1 = new Phrase("DANFE", subTitle);
        p1 = new Paragraph(frase1);
        p1.setAlignment(Phrase.ALIGN_CENTER);
        frase2 = new Phrase("Documento Auxiliar da Nota\n Fiscal Eletrônica\n\n", itemFont);
        p2 = new Paragraph(frase2);
        PdfPTable table1 = new PdfPTable(new float[]{0.4f, 0.15f, 0.4f});
        table1.setWidthPercentage(100);
        PdfPCell cell1 = new PdfPCell(new Phrase("0 - Entrada\n1 - Saída", itemFont));
        PdfPCell cell4 = new PdfPCell(new Phrase("  " + getEntradaSaida(), subTitle));
        PdfPCell cell5 = new PdfPCell(new Phrase(" "));
        cell1.setBorder(0);
        table1.addCell(cell1);
        table1.addCell(cell4);
        cell5.setBorder(0);
        table1.addCell(cell5);

        Phrase frase4 = new Phrase("Nº " + getNum() + "\n" + "Série: " + getSerie(), subTitle);
        Paragraph p4 = new Paragraph(frase4);
        Phrase frase5 = new Phrase(atual.getNFe().getInfNFe().getIde().getIndPag(), subTitle);
        Paragraph p5 = new Paragraph(frase5);
        p5.setAlignment(Phrase.ALIGN_CENTER);
        p2.setAlignment(Phrase.ALIGN_CENTER);
        cell.addElement(p1);
        cell.addElement(p2);
        cell.addElement(table1);
        cell.addElement(p4);
        cell.addElement(p5);
        cell.setBorder(12);
        cell.setMinimumHeight(80);
        table.addCell(cell);


        cell = new PdfPCell();
        cell.addElement(new Paragraph("CONTROLE DO FISCO\n\n", upperFont));
        Barcode128 code128 = new Barcode128();
        code128.setSize(5);
        code128.setCode(getCodigodeBarras());
        code128.setCodeType(Barcode.CODE128_RAW);
        code128.setSize(0.8f);
        cell.addElement(code128.createImageWithBarcode(cb, null, null));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setMinimumHeight(80);
        table1 = new PdfPTable(new float[]{1f});
        table1.setWidthPercentage(90);
        Paragraph p = new Paragraph(new Phrase(getChaveAcesso(), lowerBold));
        Paragraph p6 = new Paragraph(new Phrase("CHAVE DE ACESSO\n", upperFont));
        p.setAlignment(Phrase.ALIGN_CENTER);
        Paragraph p7 = new Paragraph("Consulta de autenticidade no portal nacional da NF-e www.nfe.fazenda.gov.br/portal ou no site da Sefaz Autorizada", itemFont);
        cell1 = new PdfPCell();
        cell1.addElement(p6);
        cell1.addElement(p);
        table1.addCell(cell1);
        cell.addElement(table1);
        cell.addElement(p7);
        table.addCell(cell);
        document.add(table);


        table = new PdfPTable(new float[]{0.58f, 0.42f});
        table.setWidthPercentage(100);
        table.setSpacingBefore(4);
        p = new Paragraph("NATUREZA DA OPERAÇÃO\n ", upperFont);
        p.setAlignment(Element.ALIGN_TOP);
        p.add(new Chunk(getNaturezaOperacao(), itemFont));
        cell = new PdfPCell(p);
        table.addCell(cell);
        p = new Paragraph("PROTOCOLO DE AUTORIZAÇÃO DE USO\n ", upperFont);
        p.add(new Chunk("                                                                 " + getProtocoloAutorizacao(), lowerBold));
        cell = new PdfPCell(p);
        table.addCell(p);
        document.add(table);

        table = new PdfPTable(new float[]{0.25f, 0.25f, 0.50f});
        table.setWidthPercentage(100);
        Phrase frase = new Phrase("INSCRIÇÃO ESTADUAL\n", upperFont);
        frase.add(new Chunk(getInscricaoEstadualEmit(), itemFont));
        cell = new PdfPCell(frase);
        table.addCell(frase);
        frase = new Phrase("INSCRIÇÃO ESTADUAL DO SUBST. TRIB.\n ", upperFont);
        frase.add(new Chunk(getInscricaoEstadualSubst(), itemFont));
        table.addCell(frase);
        frase = new Phrase("CNPJ\n", upperFont);
        frase.add(new Chunk(getCNPJEmit(), itemFont));
        table.addCell(frase);
        document.add(table);



        p = new Paragraph("DESTINATÁRIO/REMETENTE", normalBold);
        p.setSpacingAfter(2);
        document.add(p);

        table = new PdfPTable(new float[]{0.70f, 0.1339f, 0.1671f});
        table.setWidthPercentage(100);
        frase = new Phrase("NOME/RAZÃO SOCIAL\n", upperFont);
        frase.add(new Chunk(getNomeEmit(), itemFont));
        table.addCell(frase);
        frase = new Phrase("CNPJ/CPF\n", upperFont);
        frase.add(new Chunk(getCpfCnpjRemetente(), itemFont));
        table.addCell(frase);
        frase = new Phrase("DATA DA EMISSÃO\n", upperFont);
        frase.add(new Chunk(getDataEmissao(), itemFont));
        table.addCell(frase);
        document.add(table);


        table = new PdfPTable(new float[]{0.50f, 0.15f, 0.1f, 0.15f});
        table.setWidthPercentage(100);
        frase = new Phrase("ENDEREÇO\n ", upperFont);
        frase.add(new Chunk(getEnderecoDest(), itemFont));
        table.addCell(frase);
        frase = new Phrase("BAIRRO/DISTRITO\n ", upperFont);
        frase.add(new Chunk(getBairro(), itemFont));
        table.addCell(frase);
        frase = new Phrase("CEP\n", upperFont);
        frase.add(new Chunk(getCEP(), itemFont));
        table.addCell(frase);
        frase = new Phrase("DATA DE ENTRADA/SAÍDA\n", upperFont);
        frase.add(new Chunk(getDataEntradaSaida(), itemFont));
        table.addCell(frase);
        document.add(table);

        table = new PdfPTable(new float[]{0.40f, 0.15f, 0.05f, 0.15f, 0.15f});
        table.setWidthPercentage(100);
        frase = new Phrase("MUNÍCIPIO\n", upperFont);
        frase.add(new Chunk(getMunicipioDest(), itemFont));
        table.addCell(frase);
        frase = new Phrase("FONE/FAX\n", upperFont);
        frase.add(new Chunk(getFoneFax(), itemFont));
        table.addCell(frase);
        frase = new Phrase("UF\n", upperFont);
        frase.add(new Chunk(getUFDest(), itemFont));
        table.addCell(frase);
        frase = new Phrase("INSCRIÇÃO ESTADUAL\n", upperFont);
        frase.add(new Chunk(getInscricaoEstadualDest(), itemFont));
        table.addCell(frase);
        frase = new Phrase("HORA DE ENTRADA/SAÍDA\n", upperFont);
        frase.add(new Chunk(getHoraEntradaSaida(), itemFont));
        table.addCell(frase);
        document.add(table);




        p = new Paragraph("FATURA", normalBold);
        p.setSpacingAfter(2);
        document.add(p);
        table = new PdfPTable(new float[]{1f});
        table.setWidthPercentage(100);
        cell = new PdfPCell(new Phrase(getFatura(), normalFont));
        table.addCell(cell);
        document.add(table);

        p = new Paragraph("CÁLCULO DO IMPOSTO", normalBold);
        p.setSpacingAfter(2);
        document.add(p);
        table = new PdfPTable(new float[]{0.18f, 0.18f, 0.28f, 0.18f, 0.18f});
        table.setWidthPercentage(100);
        frase = new Phrase("BASE DE CÁLCULO DO ICMS\n", upperFont);
        frase.add(new Chunk(getBaseCalculoICMS(), itemFont));
        table.addCell(frase);
        frase = new Phrase("VALOR DO ICMS\n", upperFont);
        frase.add(new Chunk(getValorICMS(), itemFont));
        table.addCell(frase);
        frase = new Phrase("BASE DE CÁLCULO DO ICMS ST\n", upperFont);
        frase.add(new Chunk(getBaseCalculoICMSST(), itemFont));
        table.addCell(frase);
        frase = new Phrase("VALOR DO ICMS ST\n", upperFont);
        frase.add(new Chunk(getValorICMSST(), itemFont));
        table.addCell(frase);
        frase = new Phrase("VALOR TOTAL DOS PRODUTOS\n", upperFont);
        frase.add(new Chunk(getValorTotalProdutos(), itemFont));
        table.addCell(frase);
        document.add(table);

        table = new PdfPTable(new float[]{0.16f, 0.16f, 0.16f, 0.16f, 0.16f, 0.16f});
        table.setWidthPercentage(100);
        frase = new Phrase("VALOR DO FRETE\n", upperFont);
        frase.add(new Chunk(getValorFrete(), itemFont));
        table.addCell(frase);
        frase = new Phrase("VALOR DO SEGURO\n", upperFont);
        frase.add(new Chunk(getValorSeguro(), itemFont));

        table.addCell(frase);
        frase = new Phrase("DESCONTO\n", upperFont);
        frase.add(new Chunk(getDesconto(), itemFont));
        table.addCell(frase);
        frase = new Phrase("OUTRAS DESPESAS ACESSÓRIAS\n", upperFont);
        frase.add(new Chunk(getOutrasDespesas(), itemFont));
        table.addCell(frase);
        frase = new Phrase("VALOR DO IPI\n", upperFont);
        frase.add(new Chunk(getValorIPI(), itemFont));
        table.addCell(frase);
        frase = new Phrase("VALOR TOTAL DA NOTA\n", upperFont);
        frase.add(new Chunk(getValorTotalNota(), itemFont));
        table.addCell(frase);
        document.add(table);

        p = new Paragraph("TRANSPORTADOR/VOLUMES TRANSPORTADOS", normalBold);
        p.setSpacingAfter(2);

        document.add(p);
        table = new PdfPTable(new float[]{0.3f, 0.15f, 0.15f, 0.15f, 0.05f, 0.20f});
        table.setWidthPercentage(100);
        frase = new Phrase("RAZÃO SOCIAL\n", upperFont);
        frase.add(new Chunk(getRazaoSocialTransp(), itemFont));
        table.addCell(frase);
        frase = new Phrase("FRETE POR CONTA\n", upperFont);
        frase.add(new Chunk(getFrete(), itemFont));
        table.addCell(frase);
        frase = new Phrase("CÓDIGO ANTT\n", upperFont);
        frase.add(new Chunk(getCodigoANTT(), itemFont));
        table.addCell(frase);
        frase = new Phrase("PLACA DO VEÍCULO\n", upperFont);
        frase.add(new Chunk(getPlacaVeiculo(), itemFont));
        table.addCell(frase);
        frase = new Phrase("UF\n", upperFont);
        frase.add(new Chunk(getUFTransporta(), itemFont));
        table.addCell(frase);
        frase = new Phrase("CNPJ/CPF\n", upperFont);
        frase.add(new Chunk(getCNPJTransportador(), itemFont));
        table.addCell(frase);
        document.add(table);

        table = new PdfPTable(new float[]{0.40f, 0.35f, 0.05f, 0.2f});
        cell = new PdfPCell(new Phrase(" "));
        table.setWidthPercentage(100);
        frase = new Phrase("ENDEREÇO\n", upperFont);
        frase.add(new Chunk(getEnderecoTransporta(), itemFont));
        table.addCell(frase);
        frase = new Phrase("MUNICÍPIO\n", upperFont);
        frase.add(new Chunk(getMunicipioTransporta(), itemFont));
        table.addCell(frase);
        frase = new Phrase("UF\n", upperFont);
        frase.add(new Chunk(getUFVolumeTransporta(), itemFont));
        table.addCell(frase);
        frase = new Phrase("INSCRIÇÃO ESTADUAL\n", upperFont);
        frase.add(new Chunk(getInscricaoTransporta(), itemFont));
        table.addCell(frase);
        document.add(table);

        table = new PdfPTable(new float[]{0.10f, 0.19f, 0.19f, 0.10f, 0.10f});
        table.setWidthPercentage(100);
        frase = new Phrase("QUANTIDADE\n", upperFont);
        frase.add(new Chunk(getQuantidadeVolume(), itemFont));
        table.addCell(frase);
        frase = new Phrase("ESPÉCIE\n", upperFont);
        frase.add(new Chunk(getEspecieVolume(), itemFont));
        table.addCell(frase);
        frase = new Phrase("MARCA\n", upperFont);
        frase.add(new Chunk(getMarcaVolume(), itemFont));
        table.addCell(frase);
        frase = new Phrase("NUMERAÇÃO\n", upperFont);
        frase.add(new Chunk(getNumeracao(), itemFont));
        table.addCell(frase);
        frase = new Phrase("PESO BRUTO\n", upperFont);
        frase.add(new Chunk(getPesoBruto(), itemFont));
        table.addCell(frase);
        frase = new Phrase("PESO LÍQUIDO\n", upperFont);
        frase.add(new Chunk(getPesoLiquido(), itemFont));
        table.addCell(frase);
        document.add(table);

        p = new Paragraph("DADOS DO PRODUTO/SERVIÇO", normalBold);
        p.setSpacingAfter(2);
        document.add(p);
        table = new PdfPTable(new float[]{0.05f, 0.4f, 0.06f, 0.03f, 0.03f, 0.03f, 0.03f, 0.06f, 0.06f, 0.06f, 0.06f, 0.06f, 0.03f, 0.03f});
        table.setWidthPercentage(100);
        cell = new PdfPCell(new Phrase("CÓDIGO\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("DESCRIÇÃO DO PRODUTO/SERVIÇO\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("NCM/SH\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("CST\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("CFOP\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("UNID.\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("QTD.\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("VLR. UNIT.\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("VLR. TOTAL\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("BC ICMS\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("VLR. ICMS\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("VLR. IPI\n", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("ALÍQ.\nICMS", smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("ALÍQ.\nIPI", smallFont));
        table.addCell(cell);
        document.add(table);

        table = new PdfPTable(new float[]{0.05f, 0.4f, 0.06f, 0.03f, 0.03f, 0.03f, 0.03f, 0.06f, 0.06f, 0.06f, 0.06f, 0.06f, 0.03f, 0.03f});
        table.setWidthPercentage(100);
        cell = new PdfPCell(new Phrase(getCodigo(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getDescricaoProdutoServico(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getNCMSH(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getCST(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getCFOP(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getUnid(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getQuantidadeProduto(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getVlrUnit(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getVlrTotal(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getBCICMS(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getVlrICMS(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getVlrIPI(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getVlrAliqICMS(), smallFont));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getAliqIPI(), smallFont));
        table.addCell(cell);

        document.add(table);



        p = new Paragraph(" ");
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);


        p = new Paragraph("CÁLCULO DO ISSQN", normalBold);
        document.add(p);
        table.setSpacingBefore(2);
        table = new PdfPTable(new float[]{0.25f, 0.25f, 0.25f, 0.25f});
        table.setWidthPercentage(100);
        frase = new Phrase("INSCRIÇÃO MUNICIPAL\n", upperFont);
        frase.add(new Chunk(getInscricaoMunicipal(), itemFont));
        table.addCell(frase);
        frase = new Phrase("VALOR TOTAL DOS SERVIÇOS\n", upperFont);
        frase.add(new Chunk(getValorTotalServicos(), itemFont));
        table.addCell(frase);
        frase = new Phrase("BASE DE CÁLCULO DO ISSQN\n", upperFont);
        frase.add(new Chunk(getBaseCalculoISSQN(), itemFont));
        table.addCell(frase);
        frase = new Phrase("VALOR DO ISSQN\n", upperFont);
        frase.add(new Chunk(getValorISSQN(), itemFont));
        table.addCell(frase);
        document.add(table);


        p = new Paragraph("DADOS ADICIONAIS", normalBold);
        p.setSpacingAfter(2);
        document.add(p);



        table = new PdfPTable(new float[]{0.5f, 0.5f});
        table.setSpacingBefore(7);
        table.setWidthPercentage(100);
        cell = new PdfPCell(new Phrase("INFORMAÇÕES COMPLEMENTARES ", upperFont));
        cell.setMinimumHeight(80);

        table.addCell(cell);
        cell = new PdfPCell(new Phrase("RESERVADO AO FISCO ", upperFont));
        cell.setMinimumHeight(80);
        table.addCell(cell);


        document.add(table);

    }

    private String getSpace() {
        return "                                                                  ";
    }

    private String getNum() {
        return atual.getNFe().getInfNFe().getIde().getNNF();
    }

    private String getNomeEmit() {
        return atual.getNFe().getInfNFe().getEmit().getXNome();
    }

    public String getSerie() {
        return atual.getNFe().getInfNFe().getIde().getSerie();
    }

    public String getEnderEmit() {
        return atual.getNFe().getInfNFe().getEmit().getEnderEmit().getXLgr() + ", " + atual.getNFe().getInfNFe().getEmit().getEnderEmit().getNro() + "\n" + atual.getNFe().getInfNFe().getEmit().getEnderEmit().getXBairro() + ", " + atual.getNFe().getInfNFe().getEmit().getEnderEmit().getXMun() + ", " + atual.getNFe().getInfNFe().getEmit().getEnderEmit().getUF() + " - " + "CEP: " + atual.getNFe().getInfNFe().getEmit().getEnderEmit().getCEP();


    }

    public String getTipo() {
        return atual.getNFe().getInfNFe().getIde().getTpEmis();
    }

//   public String getFatura()
//   {
//      return atual.getNFe().getInfNFe().getCobr().getFat().getNFat();
//   } NFat é o tipo da fatura?
    
    
    public String getNaturezaOperacao() {
        return atual.getNFe().getInfNFe().getIde().getNatOp();
    }

//   public String getProtocoloAutorizacao()
//   {
//// Protocolo de autorização
//   }
    public String getInscricaoEstadualEmit() {
        return atual.getNFe().getInfNFe().getEmit().getIE();
    }

//   public String getInscricaoEstadualSubst()
//   {
////Inscrição estadual do subs de trabalho
//   }
    public String getCNPJEmit() {
        return atual.getNFe().getInfNFe().getEmit().getCNPJ();
    }

    public String getCpfCnpjRemetente() {
        return atual.getNFe().getInfNFe().getEmit().getCNPJ();
    }
   
     public String getDataEmissao()
   {
         return atual.getNFe().getInfNFe().getIde().getDEmi();
   }

    public String getBairro() {
        return atual.getNFe().getInfNFe().getDest().getEnderDest().getXBairro();
    }

    public String getCEP() {
        return atual.getNFe().getInfNFe().getDest().getEnderDest().getCEP();
    }

    public String getMunicipioEmit() {
        return atual.getNFe().getInfNFe().getDest().getEnderDest().getXMun();
    }

    public String getFoneFax() {
        return atual.getNFe().getInfNFe().getDest().getEnderDest().getFone();
    }

    public String getUFEmit() {
        return atual.getNFe().getInfNFe().getEmit().getEnderEmit().getUF().value();

    }

   public String getDataEntradaSaida()
   {
     return atual.getNFe().getInfNFe().getIde().getDSaiEnt();
   }
   
    public String getBaseCalculoICMS() {
        return atual.getNFe().getInfNFe().getTotal().getICMSTot().getVBC();
    }

    public String getValorICMS() {
        return atual.getNFe().getInfNFe().getTotal().getICMSTot().getVICMS();
    }

    public String getBaseCalculoICMSST() {
        return atual.getNFe().getInfNFe().getTotal().getICMSTot().getVBCST();
    }

    public String getValorICMSST() {
        return atual.getNFe().getInfNFe().getTotal().getICMSTot().getVST();
    }

    public String getValorTotalProdutos() {
        return atual.getNFe().getInfNFe().getTotal().getICMSTot().getVProd();
    }

    public String getValorFrete() {
        return atual.getNFe().getInfNFe().getTotal().getICMSTot().getVFrete();
    }

    public String getValorSeguro() {
        return atual.getNFe().getInfNFe().getTotal().getICMSTot().getVSeg();
    }

    public String getDesconto() {
        return atual.getNFe().getInfNFe().getTotal().getICMSTot().getVDesc();
    }

    public String getOutrasDespesas() {
        return atual.getNFe().getInfNFe().getTotal().getICMSTot().getVOutro();
    }

    public String getValorIPI() {
        return atual.getNFe().getInfNFe().getTotal().getICMSTot().getVIPI();
    }

    public String getValorTotalNota() {
        return atual.getNFe().getInfNFe().getTotal().getICMSTot().getVNF();
    }

    public String getFrete() {
        return atual.getNFe().getInfNFe().getTransp().getModFrete();
    }

    public String getRazaoSocialTransp() {
        return atual.getNFe().getInfNFe().getTransp().getTransporta().getXNome();
    }

//   public String getCodigoANTT()
//   {
//       return atual.getNFe().getInfNFe().getTransp().getTransporta().
//   }
    //Ver com o Murilo
    public String getPlacaVeiculo() {
        return atual.getNFe().getInfNFe().getTransp().getVeicTransp().getPlaca();
    }

    public String getCNPJTransportador() {
        return atual.getNFe().getInfNFe().getTransp().getTransporta().getCNPJ();
    }

    public String getEnderecoDest() {
        return atual.getNFe().getInfNFe().getDest().getEnderDest().getXLgr() + ", " + atual.getNFe().getInfNFe().getDest().getEnderDest().getNro();
    }

    public String getEnderecoTransporta() {
        return atual.getNFe().getInfNFe().getTransp().getTransporta().getXEnder();
    }

    public String getMunicipioTransporta() {
        return atual.getNFe().getInfNFe().getTransp().getTransporta().getXMun();
    }

    public String getUFTransporta() {
        return atual.getNFe().getInfNFe().getTransp().getTransporta().getUF().value();

    }

    public String getInscricaoTransporta() {
        return atual.getNFe().getInfNFe().getTransp().getTransporta().getIE();
    }

    public String getUFDest() {
        return atual.getNFe().getInfNFe().getDest().getEnderDest().getUF().value();

    }
 

    public String getMunicipioDest() {
        return atual.getNFe().getInfNFe().getDest().getEnderDest().getXMun();
    }

    public String getInscricaoEstadualDest() {
        return atual.getNFe().getInfNFe().getDest().getIE();
    }

//    public List getQuantidadeVolume() {
//        return atual.getNFe().getInfNFe().getTransp().getVol();
//    }

    public String getQuantidadeProduto() {
        return "1,0000";
    }

    public String getEspecie() {
        return " ";
    }

    public String getMarca() {
        return " ";
    }

    public String getNumeracao() {
        return " ";
    }

    public String getPesoBruto() {
        return " ";
    }

    public String getPesoLiquido() {
        return " ";
    }

    public String getCodigo() {
        return "000123";
    }

    public String getDescricaoProdutoServico() {
        return "Relógio Pontto 110V  ";
    }

    public String getNCMSH() {
        return "91061000";
    }

    public String getCST() {
        return "000";
    }

    public String getCFOP() {
        return "5102";
    }

    public String getUnid() {
        return "UN";
    }

    public String getQtd() {
        return "1.0000";
    }

    public String getVlrUnit() {
        return "727.4000";
    }

    public String getVlrTotal() {
        return "727.00";
    }

    public String getBCICMS() {
        return "727.00";
    }

    public String getVlrICMS() {
        return "130,93";
    }

    public String getVlrIPI()
    {
        return " ";
    }

    public String getVlrAliqICMS() {
        return "18,00";
    }

    public String getAliqIPI()
    {
        return " ";
    }

    public String getInscricaoMunicipal() {
        return atual.getNFe().getInfNFe().getEmit().getIM();
    }

    public String getValorTotalServicos()
    {
        return atual.getNFe().getInfNFe().getTotal().getISSQNtot().getVServ();
    }

    public String getBaseCalculoISSQN()
    {
        return atual.getNFe().getInfNFe().getTotal().getISSQNtot().getVBC();
    }

    public String getValorISSQN()
    {
        return atual.getNFe().getInfNFe().getTotal().getISSQNtot().getVISS();
    }

    public String getInformacoes() {
        return atual.getNFe().getInfNFe().getInfAdic().getInfCpl();
    }

    public String getReservadoAoFisco() {
        return atual.getNFe().getInfNFe().getInfAdic().getInfAdFisco();
    }



//    public String getCodigodeBarras() {
//        return "01234567823456789087654323456789876543";
//    }
//
//    public String getChaveAcesso() {
//        return "3511 1009 3460 5200 0199 5500 1000 0000 1210 0003 0066";
//    }

    public String getEntradaSaida() {
        return atual.getNFe().getInfNFe().getIde().getTpEmis();
    }
    
    public String getHoraEntradaSaida()
    {
        return " ";
    }
}
