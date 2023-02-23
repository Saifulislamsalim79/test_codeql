package com.google.firebase.crashlytics.p112h.p115j;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.p112h.p126r.InterfaceC5605b;
/* compiled from: AppData.java */
/* renamed from: com.google.firebase.crashlytics.h.j.h */
/* loaded from: classes2.dex */
public class C5361h {

    /* renamed from: a */
    public final String f13218a;

    /* renamed from: b */
    public final String f13219b;

    /* renamed from: c */
    public final String f13220c;

    /* renamed from: d */
    public final String f13221d;

    /* renamed from: e */
    public final String f13222e;

    /* renamed from: f */
    public final String f13223f;

    /* renamed from: g */
    public final InterfaceC5605b f13224g;

    public C5361h(String str, String str2, String str3, String str4, String str5, String str6, InterfaceC5605b interfaceC5605b) {
        this.f13218a = str;
        this.f13219b = str2;
        this.f13220c = str3;
        this.f13221d = str4;
        this.f13222e = str5;
        this.f13223f = str6;
        this.f13224g = interfaceC5605b;
    }

    /* renamed from: a */
    public static C5361h m25052a(Context context, C5347a0 c5347a0, String str, String str2, InterfaceC5605b interfaceC5605b) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String m25081g = c5347a0.m25081g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C5361h(str, str2, m25081g, packageName, num, str3, interfaceC5605b);
    }
}
