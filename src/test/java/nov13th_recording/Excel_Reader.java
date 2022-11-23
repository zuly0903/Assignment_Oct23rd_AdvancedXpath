package nov13th_recording;

public class Excel_Reader {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "\\src\\test\\java\\nov13th_recording\\SampleData.xlsx";
		Xls_Reader xls = new Xls_Reader(path);
		
		// get the row count
		int row = xls.getRowCount("Browser"); // follow by sheets name
		System.out.println(row);
		
		int col = xls.getColumnCount("Shop");
		System.out.println(col);
		
		String data = xls.getCellData("Shop", 1, 3);
		System.out.println(data);
		
		String data1 = xls.getCellData("Shop", "MinCost", 2);
		System.out.println(data1);
		
		// write into excel sheet
		xls.setCellData("Shop", "MinCost", 5, "890");
		
	}

}
