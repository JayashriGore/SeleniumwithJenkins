package MavenTestPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Data_Fetching {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//step 1:
				FileInputStream fs=new 	FileInputStream("C:\\Users\\Admin\\Eclipse Maven Workspace\\MavenFramework\\excelsheet\\jayashri.xlsx");
					//step 2:
				Workbook wb=WorkbookFactory.create(fs);

				//Number to text Converter Class 
			    String un=			NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		         System.out.println(un); // for this change Excel sheet value to mobile no or any numeric value, otp 0to9
					
		       //AnotherWay
		 		/*String id=	wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		 		System.out.println(id);  //changetostring
		 		*/

			String pwd=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
					System.out.println(pwd);
    }
}
