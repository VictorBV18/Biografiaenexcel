package biografiaenexcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Biografiaenexcel {

    public static void main(String[] args) {

        crearExcel();
    }

    public static void crearExcel() {

        Workbook book = new XSSFWorkbook();
        org.apache.poi.ss.usermodel.Sheet sheet = book.createSheet("Hola java");

        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("BERNABE VAZQUEZ VICTOR 2002-ACTUALIDAD [FUTURO INGENIERO EN SISTEMAS] ");
        Row row1 = sheet.createRow(2);
        row1.createCell(0).setCellValue("Naci un jueves 18 de abril del 2002 en el transcurso de la tarde, soy de la CDMX, aunque actualmente vivo en Toluca EDOMEX.");
        Row row2 = sheet.createRow(3);
        row2.createCell(0).setCellValue("Creci con mis padres, mi hermana mi abuelita y mi tio,desde siempre me gustaba ver la television y me encantaban mucho los power rangers");
        Row row3 = sheet.createRow(4);
        row3.createCell(0).setCellValue("de pequeño me gustaba mucho jugar con cosas armables, Desde pequeño me gustaba mucho Spiderman, de echo tengo una cicatriz en la cara por andar jugando a ser Spiderman.");
        Row row4 = sheet.createRow(5);
        row4.createCell(0).setCellValue("Estudie en un kinder con un uniforme muy bonito, la cual no termine porque me cai, me lastime muy feo y ya no fui el ultimo año,");
        Row row5 = sheet.createRow(6);
        row5.createCell(0).setCellValue("entre a una bonita primaria, aunque para llegar tenia que subir demasiadas escaleras, en esos años casi no hablaba, ");
        Row row6 = sheet.createRow(7);
        row6.createCell(0).setCellValue("tambien en ultimo año de primaria estuve en la escolta, cuando entre a la secundaria empece a socializar mas, ");

        Row row7 = sheet.createRow(8);
        row7.createCell(0).setCellValue("en estas epocas mi abuelita fallecio y fue algo complicado e incluso confuso pues fue de gran impacto ahi estudie una carrera tecnica de informatica,");

        Row row8 = sheet.createRow(9);
        row8.createCell(0).setCellValue("al entrar a la prepa conoci mucha mas gente y me reencontre con una compañera de la secundaria que me caia mal y actualmente es mi novia y hasta vive conmigo ");

        Row row9 = sheet.createRow(10);
        row9.createCell(0).setCellValue("en la prepa jugaba demasido fronton y baraja porque a ambas cosas les podia sacar dinero, a finales de la preparatoria empezo la pandemia y en ese tiempo no hice mucho,");

        Row row10 = sheet.createRow(11);
        row10.createCell(0).setCellValue("solamente hice examenes para la universidad y me quede en la UAEMEX y actualmente cruzo 3er Semestre de la carrera de INGENIERIA EN COMPUTACION, ");

        Row row11 = sheet.createRow(12);
        row11.createCell(0).setCellValue("y bueno, algunas materias se me dificultan mas que otras en la universidad, aunque se que si puedo llegar a pasar se que me puedo llegar a graduar, todo reprobado pero graduado :) ");

        try {
            FileOutputStream fileout = new FileOutputStream("biografia_en_excel.xlsx");
            book.write(fileout);

            fileout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Biografiaenexcel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Biografiaenexcel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Se CREO EL EXCEL ");
    }
}
