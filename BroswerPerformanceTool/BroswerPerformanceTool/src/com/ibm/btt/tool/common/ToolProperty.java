package com.ibm.btt.tool.common;

public class ToolProperty {
	public static final String CONFIG_PATH="config/config.json";
	public static final String ALL_WIDGETS="config/all_widgets.json";
	public static final String RECORD_SINGLE="recordSingle";
	public static final String RECORD_BATCH="recordBatch";
	
	public static int totalTimes; //总次数(总共记录多少次数据)
	public static int recordInterval;//记录间隔(点击多少次记录一次)
	public static int waitTime;//等待时间(多少秒点击一次)
	public static String url;//网址
	public static String filePath;//文件存放路径
	public static Boolean singleThread;//是否是单线程
	public static String reportName="BTTBrowserPerformanceReport.xlsx";
	public static String recordType;
	public static String widgetIdOnTool;
	public static String processId; //IE process id
}
