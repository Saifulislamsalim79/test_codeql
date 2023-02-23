package com.google.firebase.inappmessaging.p154j0;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.firebase.C5988g;
/* compiled from: SharedPreferencesUtils.java */
/* renamed from: com.google.firebase.inappmessaging.j0.q3 */
/* loaded from: classes2.dex */
public class C6248q3 {

    /* renamed from: a */
    private final C5988g f15162a;

    public C6248q3(C5988g c5988g) {
        this.f15162a = c5988g;
    }

    /* renamed from: a */
    public boolean m22486a(String str, boolean z) {
        SharedPreferences sharedPreferences = ((Application) this.f15162a.m23093i()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, z);
        }
        m22481f(str, z);
        return z;
    }

    /* renamed from: b */
    public boolean m22485b(String str, boolean z) {
        ApplicationInfo applicationInfo;
        Application application = (Application) this.f15162a.m23093i();
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey(str)) {
                return applicationInfo.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return z;
    }

    /* renamed from: c */
    public boolean m22484c(String str, boolean z) {
        SharedPreferences sharedPreferences = ((Application) this.f15162a.m23093i()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        return sharedPreferences.contains(str) ? sharedPreferences.getBoolean(str, z) : z;
    }

    /* renamed from: d */
    public boolean m22483d(String str) {
        ApplicationInfo applicationInfo;
        Application application = (Application) this.f15162a.m23093i();
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) == null || applicationInfo.metaData == null) {
                return false;
            }
            return applicationInfo.metaData.containsKey(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public boolean m22482e(String str) {
        return ((Application) this.f15162a.m23093i()).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains(str);
    }

    /* renamed from: f */
    public void m22481f(String str, boolean z) {
        SharedPreferences.Editor edit = ((Application) this.f15162a.m23093i()).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }
}
