package com.paypad.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import p272h.p273a.p274a.C8211a;
/* loaded from: classes2.dex */
public class MiscUtils {
    private static Context context;
    private static SharedPreferences preferences;
    private static ProgressDialog progressDialog;

    public static String getFromSharedPreferences(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = getSharedPreferences(str);
        preferences = sharedPreferences;
        return sharedPreferences.getString(str2, str3);
    }

    private static SharedPreferences getSharedPreferences(String str) {
        return context.getSharedPreferences(str, 0);
    }

    public static void initContext(Context context2) {
        context = context2;
    }

    public static boolean isActivated(Context context2) {
        initContext(context2);
        return getFromSharedPreferences("Configuration", C8211a.f19751i, false);
    }

    public static boolean isLoggedIn(Context context2) {
        initContext(context2);
        return getFromSharedPreferences("Configuration", C8211a.f19751i, false);
    }

    public static boolean nibssKeysDownloadStatus(Context context2) {
        initContext(context2);
        return (getFromSharedPreferences("Configuration", C8211a.f19752j, "").length() == 0 || getFromSharedPreferences("Configuration", C8211a.f19753k, "").length() == 0 || getFromSharedPreferences("Configuration", C8211a.f19754l, "").length() == 0) ? false : true;
    }

    public static ProgressDialog progressDialogConfig(Context context2, String str, String str2, boolean z) {
        ProgressDialog progressDialog2 = new ProgressDialog(context2);
        progressDialog = progressDialog2;
        progressDialog2.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setCancelable(z);
        return progressDialog;
    }

    public static void storeInSharedPreferences(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = getSharedPreferences(str);
        preferences = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str2, str3);
        edit.commit();
    }

    public static boolean getFromSharedPreferences(String str, String str2, boolean z) {
        SharedPreferences sharedPreferences = getSharedPreferences(str);
        preferences = sharedPreferences;
        return sharedPreferences.getBoolean(str2, z);
    }

    public static void storeInSharedPreferences(String str, String str2, boolean z) {
        SharedPreferences sharedPreferences = getSharedPreferences(str);
        preferences = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(str2, z);
        edit.commit();
    }
}
