package com.paypad.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
/* loaded from: classes2.dex */
public class NetworkUtils {
    public static boolean isInternetAvailable(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            Log.d("Paypad", "No internet connection");
            return false;
        }
        if (activeNetworkInfo.isConnected()) {
        }
        return true;
    }
}
