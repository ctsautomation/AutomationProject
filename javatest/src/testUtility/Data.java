package testUtility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public static String LFSQAURL = "http://nwqame4.is.agilent.net:50200/manufacturing/com/sap/me/activity/client/ActivityManager.jsp";
	public static String ATSQAURL = "http://nwqame5.is.agilent.net:50200/manufacturing/com/sap/me/activity/client/ActivityManager.jsp";
	
	public static String username = "kargutka";
	public static String password = "bha@1608";
	
	//static DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
	static DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_hhmmss");
	public static String timeStamp = dateFormat.format(new Date());
	
	public static String ATSMaterial = "G3950-60000";
	public static String LFSMaterial = "G7003-60262";
	
	
	//Operation and resource
	//POD Door Assembly
	public static String op_DOOR_LUI_Assembly = "AQM_SUBASSY_DOOR_LUI";
	
	//Rework
	public static String op_DOOR_LUI_REWORK = "AQM_DOOR_LUI_REWORK";
	public static String res_DOOR_LUI = "AQM_SUBASSY_DOOR_LUI_01";
}
