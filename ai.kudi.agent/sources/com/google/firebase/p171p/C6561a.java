package com.google.firebase.p171p;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.C1335a;
import com.google.firebase.p167m.InterfaceC6472c;
/* compiled from: DataCollectionConfigStorage.java */
/* renamed from: com.google.firebase.p.a */
/* loaded from: classes2.dex */
public class C6561a {

    /* renamed from: a */
    private final Context f15833a;

    /* renamed from: b */
    private final SharedPreferences f15834b;

    /* renamed from: c */
    private boolean f15835c;

    public C6561a(Context context, String str, InterfaceC6472c interfaceC6472c) {
        Context m21637a = m21637a(context);
        this.f15833a = m21637a;
        this.f15834b = m21637a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f15835c = m21635c();
    }

    /* renamed from: a */
    private static Context m21637a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : C1335a.m36326b(context);
    }

    /* renamed from: c */
    private boolean m21635c() {
        if (this.f15834b.contains("firebase_data_collection_default_enabled")) {
            return this.f15834b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m21634d();
    }

    /* renamed from: d */
    private boolean m21634d() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = this.f15833a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f15833a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean m21636b() {
        return this.f15835c;
    }
}
