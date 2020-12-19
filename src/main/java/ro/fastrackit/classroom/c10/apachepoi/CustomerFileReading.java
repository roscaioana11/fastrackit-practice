package ro.fastrackit.classroom.c10.apachepoi;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ro.fastrackit.classroom.c10.CustomerPurchase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class CustomerFileReading {

    //public static final String SAMPLE_XLSX_FILE_PATH = "D:\\FastTrackIT JAVA PROGRAMMING CURS\\book1.xlsx";
    private static final CustomerFileReading INSTANCE = new CustomerFileReading();

    public static CustomerFileReading getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws IOException, InvalidFormatException {

        try {
            File excel = new File("D:\\FastTrackIT JAVA PROGRAMMING CURS\\book1.xls");
            FileInputStream fis = new FileInputStream(excel);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);

            HSSFSheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.rowIterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                List<CustomerPurchase> customerPurchaseList = new ArrayList<>();
                CustomerPurchase customerObj = new CustomerPurchase((int) row.getCell(0).getNumericCellValue(),row.getCell(1).getStringCellValue(),row.getCell(2).getStringCellValue(),row.getCell(8).getStringCellValue());
                customerPurchaseList.add(customerObj);

                row.getCell(0);
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell next = cellIterator.next();


                    switch (next.getCellTypeEnum()) {
                        case STRING:
                            System.out.print(next.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(next.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(next.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.println("cell was another value type \t");
                    }
                }
                System.out.println(customerPurchaseList);

            }
            workbook.close();
            fis.close();

    } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}