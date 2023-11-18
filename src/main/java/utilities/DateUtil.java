package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String getTimestamp() {
		return new SimpleDateFormat ("yyyy.MM.DD.HH.mm.ss").format(new Date());
	}

}
