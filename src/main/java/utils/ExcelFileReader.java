package utils;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.util.Iterator;

public class ExcelFileReader {

    // Hàm dùng để đọc file excel - sẽ enhance thêm vào lần code sau.
    public String getCellData(String url)
    {
        try
        {
            FileInputStream file = new FileInputStream(url);

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            for (Row row : sheet) {
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    System.out.print(cell.getStringCellValue() + "t");
                    return cell.getStringCellValue();
                }
                System.out.println(" ");
            }
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
      return null;
    }
}
