import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.ElementNotVisibleException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class ExcelReader {
	public static void main(String[] args) throws FileNotFoundException, IOException, ElementNotVisibleException,
			InterruptedException, BiffException, WriteException {

		// Accessing keywords from Excel file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		File myfile = new File("C:\\TestcaseOne.xls");
		Excel objExcel = new Excel();
		Workbook objwork = Workbook.getWorkbook(myfile);
		Sheet objsheet = objwork.getSheet("TC001");
		CallingFunction obj1 = new CallingFunction();
		for (int i = 1; i < 5; i++) {
			Cell objcell = objsheet.getCell(2, i);
			String a = objcell.getContents();

			if (a.equals("LaunchOpenCart")) {
				boolean value = obj1.LaunchOpenCart(); // Launching OpenCart using function
				if (value == true) {
					objExcel.Export(5, 1, "User is able to launch the open cart application Successfully");
					objExcel.Export(6, 1, "Passed");

				} else {
					objExcel.Export(5, 1, "User is not able to launch the open cart application");
					objExcel.Export(6, 1, "Failed");
				}
			}

			else if (a.equals("LinkLogin"))

			{

				boolean value = obj1.LinkLogin();

				// Click on Login link in OpenCart using function

				if (value == true) {

					objExcel.Export(5, 2, "Account Login Page is displayed  successfully");
					objExcel.Export(6, 2, "Passed");

				} else {
					objExcel.Export(5, 2, "Account Login Page is not displayed ");
					objExcel.Export(6, 2, "Failed");
				}

			}

			else if (a.equals("Login")) {

				boolean value = obj1.Login(); // Enter Username and Password and click Login using function

				if (value == true) {
					objExcel.Export(5, 3, "User is able to login to Opencart Application Successfully");
					objExcel.Export(6, 3, "Passed");
				} else {
					objExcel.Export(5, 3, "User is not able to login to Opencart Application");
					objExcel.Export(6, 3, "failed");
				} // Click on Login link in OpenCart using function

			}

			else if (a.equals("LinkLogout"))

			{

				boolean value = obj1.LinkLogout();
				// Click on Logout link in OpenCart using function

				if (value == true) {

					objExcel.Export(5, 4, "User is able to logout  Successfully");
					objExcel.Export(6, 4, "Passed");

				} else {

					System.out.println("Application Not Launched");
					objExcel.Export(5, 4, "User is not able to logout");
					objExcel.Export(6, 4, "Failed");
				}

			}
		}
	}
}
