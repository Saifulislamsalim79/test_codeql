package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.C2974l;
import com.google.firebase.C5988g;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.g0 */
/* loaded from: classes2.dex */
public class C6498g0 {

    /* renamed from: a */
    private final Context f15666a;

    /* renamed from: b */
    private String f15667b;

    /* renamed from: c */
    private String f15668c;

    /* renamed from: d */
    private int f15669d;

    /* renamed from: e */
    private int f15670e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6498g0(Context context) {
        this.f15666a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m21822c(C5988g c5988g) {
        String m23066e = c5988g.m23089m().m23066e();
        if (m23066e != null) {
            return m23066e;
        }
        String m23068c = c5988g.m23089m().m23068c();
        if (m23068c.startsWith("1:")) {
            String[] split = m23068c.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return m23068c;
    }

    /* renamed from: f */
    private PackageInfo m21819f(String str) {
        try {
            return this.f15666a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m21817h() {
        PackageInfo m21819f = m21819f(this.f15666a.getPackageName());
        if (m21819f != null) {
            this.f15667b = Integer.toString(m21819f.versionCode);
            this.f15668c = m21819f.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m21824a() {
        if (this.f15667b == null) {
            m21817h();
        }
        return this.f15667b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized String m21823b() {
        if (this.f15668c == null) {
            m21817h();
        }
        return this.f15668c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int m21821d() {
        PackageInfo m21819f;
        if (this.f15669d == 0 && (m21819f = m21819f("com.google.android.gms")) != null) {
            this.f15669d = m21819f.versionCode;
        }
        return this.f15669d;
    }

    /* renamed from: e */
    synchronized int m21820e() {
        int i = this.f15670e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f15666a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!C2974l.m31515h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f15670e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f15670e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (C2974l.m31515h()) {
            this.f15670e = 2;
            i2 = 2;
        } else {
            this.f15670e = 1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m21818g() {
        return m21820e() != 0;
    }
}
