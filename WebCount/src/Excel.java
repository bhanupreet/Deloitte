
import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Excel {
	void Export(int Col1, int Row1, String Data) throws IOException, WriteException, BiffException {
		File file1 = new File("C:\\TestcaseOne.xls");
		Workbook workbook1 = Workbook.getWorkbook(file1);
		WritableWorkbook copy = Workbook.createWorkbook(file1, workbook1);
		WritableSheet sheet = copy.getSheet(0);
		Label lable1 = new Label(Col1, Row1, Data);
		System.out.println(lable1);
		sheet.addCell(lable1);
		copy.write();
		copy.close();
		workbook1.close();
	}
}
