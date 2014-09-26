package com.qa.utilities;

public class Util {
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Function: isSuiteExecutable
	//Parameter: Object of XL file, Name of Test Suite Sheet.
	//Description: Check weather Run mode is Yes(Y) or No(N). If Y then it will return True else False
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean isSuiteExecutable(ExcelUtils xls, String TestSuiteName){
		boolean isTestSuiteExecutable = false;
		for(int i=2;i<=xls.getRowCount("Test Suite");i++)
		{
			String SuiteName=xls.getCellData("Test Suite", "TSID", i);
			//System.out.println(SuiteName);
			String Run_Mode=xls.getCellData("Test Suite", "Runmode", i);
			//System.out.println(Run_Mode);
			if(SuiteName.equalsIgnoreCase(TestSuiteName))
			{
				if(Run_Mode.equalsIgnoreCase("Y"))
					{
						isTestSuiteExecutable=true;
					}
					else
						{
						isTestSuiteExecutable=false;
						}
			}
		}
		return isTestSuiteExecutable;	
	}
	//End of the Function
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		//Function: isSuiteExecutable
		//Parameter: Object of XL file, Name of Test Case Name
		//Description: Check weather Run mode of Test Case is Yes(Y) or No(N). If Y then it will return True else False
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean isTestCaseRunnable(ExcelUtils xls, String TestCaseName)
	{
		boolean isTestCaseExecutable = false;
		for(int i=2;i<=xls.getRowCount("Test Cases");i++){
		
			String TestCaseID=xls.getCellData("Test Cases", "TCID", i);
		
			String TCRunmode=xls.getCellData("Test Cases", "Runmode", i);
				if(TestCaseID.equalsIgnoreCase(TestCaseName))
					{
						if(TCRunmode.equalsIgnoreCase("Y"))
							{
								return isTestCaseExecutable=true;
							}
						else
						{
							return isTestCaseExecutable=false;
						}
					}
			}
		return 	isTestCaseExecutable;	
	}

	//End of the Function
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Function: ExtractData
	//Parameter: Object of XL file, Name of Test Case Name
	//Description: Returns data in form 2D array for data provider implementation.
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	public static Object[][] ExtractData(ExcelUtils xls, String testCaseName)
		{
			//Check weather sheet exist If "No" then return 1 row and 0 column 
			if(!xls.isSheetExist(testCaseName))
			{	
				xls=null;
				return new Object[1][0];
			}
	
		//Find the number of rows and column
			int rows=xls.getRowCount(testCaseName);
			int column=xls.getColumnCount(testCaseName);
			System.out.println("Number of Rows and Column in sheet" + testCaseName + "  Rows =" +rows+ " colums= " + column);
			Object data[][]= new Object [rows][column-3];
			for(int rowNum=2;rowNum<=rows;rowNum++){
				for(int columnNum=0;columnNum<column-3;columnNum++){
					data[rowNum-2][columnNum]=xls.getCellData(testCaseName, columnNum, rowNum);
					}
			}
		return data;
	}
	
	//End of the Function
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Function: addResult
//Parameter: Object of XL file, Name of Test Case Name, Row number in which we want to add result and result either Pass/Fail
//Description: Add result(Pass/Fail) in specify row
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	public static void addResult(ExcelUtils xls, String testCaseName, int rowNum, String result)
		{
				xls.setCellData(testCaseName, "Result", rowNum, result);
	}
//End of the Function
	

}
