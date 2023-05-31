package excel;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.annotations.Test;

	public class readwrite {

		
		@Test
		public void rw() throws IOException
		{
			//apache poi, apache poi ooxml, apache poi ooxml schema
			
			File f= new File("C:\\Users\\sabna\\OneDrive\\Desktop\\sabna\\Kundrathur.xlsx");
			FileInputStream fis= new FileInputStream(f);
			
			// workbook
			XSSFWorkbook x= new XSSFWorkbook(fis);
			XSSFSheet sheet = x.getSheetAt(0);
			
			// number of rows
			int row=sheet.getLastRowNum();
			System.out.println("Number of rows "+ row);
			
			// number of columns in row 0
			int col=sheet.getRow(0).getLastCellNum();
			System.out.println("Number of columns "+ col);
			
			// read a particular cell: know the row index and col index
			//5,2
			XSSFCell data = sheet.getRow(5).getCell(2);
			System.out.println(data);
			
			
			//writing into the cell
			sheet.getRow(8).createCell(12).setCellValue("kunrathur");
			FileOutputStream fos= new FileOutputStream(f);
			x.write(fos);
		}

}
