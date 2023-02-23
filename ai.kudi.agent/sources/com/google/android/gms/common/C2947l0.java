package com.google.android.gms.common;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.l0 */
/* loaded from: classes2.dex */
public class C2947l0 {

    /* renamed from: d */
    private static final C2947l0 f8120d = new C2947l0(true, null, null);

    /* renamed from: a */
    final boolean f8121a;

    /* renamed from: b */
    final String f8122b;

    /* renamed from: c */
    final Throwable f8123c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2947l0(boolean z, String str, Throwable th) {
        this.f8121a = z;
        this.f8122b = str;
        this.f8123c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2947l0 m31574b() {
        return f8120d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C2947l0 m31573c(String str) {
        return new C2947l0(false, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C2947l0 m31572d(String str, Throwable th) {
        return new C2947l0(false, str, th);
    }

    /* renamed from: a */
    String mo31575a() {
        return this.f8122b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m31571e() {
        if (this.f8121a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f8123c != null) {
            Log.d("GoogleCertificatesRslt", mo31575a(), this.f8123c);
        } else {
            Log.d("GoogleCertificatesRslt", mo31575a());
        }
    }
}
