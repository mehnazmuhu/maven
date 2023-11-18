package utilities;

import java.io.IOException;

public class Excellogin_run {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String excel[][]=ExcelLogin.exceldata();
		for(int i=0;i<excel.length;i++) {
			for(int j=0;j<excel[0].length;j++) {
				System.out.println(excel[i][j]);
			}
				
		}
	}

}
