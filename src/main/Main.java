/**
 * 
 */
package main;

import controller.DBConnecter;
import controller.ExcelImporter;
import view.MainFrame;

/**
 * 主类
 * 
 * @author WangZhiheng
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExcelImporter.importExcel("test.xlsx");
	}

}
