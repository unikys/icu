package unikys.icu.util;

import java.util.UUID;

import android.content.Context;
import android.telephony.TelephonyManager;

public class UuidFactory {

	private static String deviceUuid = null;
	public static String getUuid(Context context) {
		if (deviceUuid != null) {
			return deviceUuid;
		}
		final TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
		
		final String tmDevice, tmSerial, androidId;
		
		tmDevice = "" + tm.getDeviceId();
		tmSerial = "" + tm.getSimSerialNumber();
		androidId = "" + android.provider.Settings.Secure.getString(context.getContentResolver(), android.provider.Settings.Secure.ANDROID_ID);
		
		UUID uuid = new UUID(androidId.hashCode(), ((long)tmDevice.hashCode() << 32) | tmSerial.hashCode());
		deviceUuid = uuid.toString();
		return deviceUuid;
	}	
}
