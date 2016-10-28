/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itext;

/**
 *
 * @author Kenneth
 */

import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;

public class IText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Document document  = new Document();
        
        try{
            Document document  = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Kenneth\\Desktop\\sample.pdf"));
            document.open();
            document.add(new Paragraph("Example"));
            document.close();
            //document.close();
        }catch (DocumentException | FileNotFoundException e) {
            System.err.println(e);
        }
        //document.close();
        System.out.println("Done");
    }
    
}
