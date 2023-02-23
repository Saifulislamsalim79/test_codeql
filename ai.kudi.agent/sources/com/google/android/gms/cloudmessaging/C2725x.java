package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.p102o.C2956c;
import com.google.android.gms.common.util.C2974l;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.x */
/* loaded from: classes2.dex */
public final class C2725x {

    /* renamed from: a */
    private final Context f7676a;

    /* renamed from: b */
    private int f7677b;

    /* renamed from: c */
    private int f7678c = 0;

    public C2725x(Context context) {
        this.f7676a = context;
    }

    /* renamed from: a */
    public final synchronized int m32109a() {
        PackageInfo packageInfo;
        if (this.f7677b == 0) {
            try {
                packageInfo = C2956c.m31548a(this.f7676a).m31551e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                Log.w("Metadata", sb.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f7677b = packageInfo.versionCode;
            }
        }
        return this.f7677b;
    }

    /* renamed from: b */
    public final synchronized int m32108b() {
        int i = this.f7678c;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f7676a.getPackageManager();
        if (C2956c.m31548a(this.f7676a).m31554b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!C2974l.m31515h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f7678c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f7678c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (C2974l.m31515h()) {
            this.f7678c = 2;
            i2 = 2;
        } else {
            this.f7678c = 1;
        }
        return i2;
    }
}
