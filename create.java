/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ECS;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author Kenneth
 */
/* 
This is a PDF genterator program.
But we have asumme that we have created a online submition system,
which have include a function of downloaing coversheet.
Therefore this program have been used for download the actual file.
*/
public class create {
    
    
    
    create(){
        //geting the file path from Page.
        String dpath= Page.dpath;
        try{ 
            //define program "information" as data
            information data = new information();
            
            //crate a PDF File
            Document cs  = new Document();
            //locate where the PDF save.
            FileOutputStream local = new FileOutputStream(dpath);
            //New PDF location
            PdfWriter writer = PdfWriter.getInstance(cs,local);
            
            
            //Edit Propety of the PDF
            cs.addTitle("Title@CoverSheet");  
            cs.addAuthor("Author@rensanning");  
            cs.addSubject("Subject@iText sample");  
            cs.addKeywords("Keywords@iText");  
            cs.addCreator("Creator@iText");  
            
            //Seting the Font of the text in the PDF
            Font title = new Font(Font.FontFamily.HELVETICA, 25, Font.BOLD);
            //Font stitle = new Font(Font.FontFamily.COURIER, 18,Font.ITALIC | Font.UNDERLINE);
            Font stitle = new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD);
            Font usual = new Font(Font.FontFamily.TIMES_ROMAN, 18);
      
            // open the PDF File
            cs.open();
            
            PdfContentByte canvas = writer.getDirectContent();
            
            // insert the information in the PDF
            //group the information into paragrph
            Paragraph sinfo = new Paragraph(); 
            //using the data form the database which geting by program "information"
            sinfo.add(new Chunk("Name: " + data.fn + " " + data.ln, title));
            //cs.add(Chunk.NEWLINE);
            sinfo.add(new Chunk("               "));
            sinfo.add(new Chunk("SID: " + data.sid, title));
            sinfo.setLeading(40);
            //sinfo.add(Chunk.NEWLINE);
            cs.add(sinfo);
            
            Paragraph cinfo = new Paragraph();  
            cinfo.add(new Chunk("Course: " + data.cid + "   " + data.cn, stitle));
            cinfo.setLeading(30);  
            cinfo.add(Chunk.NEWLINE);
            cs.add(cinfo);
            
            Paragraph minfo = new Paragraph();  
            minfo.add(new Chunk("Module: " , stitle));
            minfo.add(new Chunk( data.mid + " " + data.mn, usual));
            minfo.setLeading(30);  
            minfo.add(Chunk.NEWLINE);
            cs.add(minfo);
            
            // insert the information in the PDF
            Paragraph cwinfo = new Paragraph();  
            cwinfo.add(new Chunk("Coursework ID: ", stitle));
            cwinfo.add(new Chunk( data.cwid, usual));
            cwinfo.add(Chunk.NEWLINE);
            cwinfo.add(new Chunk("Coursework Tile: ", stitle));
            cwinfo.add(new Chunk( data.cwt, usual));
            cwinfo.add(Chunk.NEWLINE);
            cwinfo.add(new Chunk("Coursework Deadline is on ", stitle));
            cwinfo.add(new Chunk( data.cwed, usual));
            cwinfo.setLeading(30);
            cs.add(cwinfo);
            
            cs.add(new Paragraph("Rule: \n"+" I am the Boss", usual));
            
            
            
            //Phrase phrase1= new Phrase("This is sentence 1. ", title);
            //ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, phrase1, 30, 600, 0); 
            //cs.add(new Paragraph("Name: " + data.fn + " " + data.ln, title));
            //cs.add(new Chunk("SID: " + data.sid));
            
            
            //Close the PDF file
            cs.close();
        }catch(DocumentException | FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}

