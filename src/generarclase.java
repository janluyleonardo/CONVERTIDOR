
import java.io.File;
import jdk.nashorn.internal.ir.CatchNode;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yeferson Chaparro
 */
public class generarclase {
    
    public void generarExcel(String[][] entrada,String ruta){
     try {    
        WorkbookSettings conf= new WorkbookSettings();
        conf.setEncoding("ISO-8859-1");
       
         WritableWorkbook  workbook = Workbook.createWorkbook(new File(ruta),conf); 
         WritableSheet sheet=workbook.createSheet("Resultado", 0);
         
         WritableFont h=new WritableFont(WritableFont.COURIER, 16,WritableFont.NO_BOLD);
         WritableCellFormat hFormat= new WritableCellFormat(h);
        for(int i=0;i<entrada.length;i++){//filas
            for(int j=0;j<entrada[i].length;j++){
         
                
                try {
                    
                
            //columnas 
          
         
             sheet.addCell(new jxl.write.Label(j,i,entrada[i][j],hFormat)); 
             } catch (Exception e) {
                System.out.println("error"+e);
                } 
          }
        }
       
        workbook.write();
        workbook.close();
        } catch (Exception e) {
         System.out.println("error"+e);
            
        }
   
    }
}
