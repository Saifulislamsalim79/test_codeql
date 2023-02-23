package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.j6 */
/* loaded from: classes2.dex */
public final class C3845j6 {

    /* renamed from: a */
    final String f9424a;

    /* renamed from: b */
    final Uri f9425b;

    /* renamed from: c */
    final String f9426c;

    /* renamed from: d */
    final String f9427d;

    /* renamed from: e */
    final boolean f9428e;

    /* renamed from: f */
    final boolean f9429f;

    /* renamed from: g */
    final boolean f9430g;

    /* renamed from: h */
    final boolean f9431h;

    /* renamed from: i */
    final InterfaceC3954q6<Context, Boolean> f9432i;

    public C3845j6(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private C3845j6(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC3954q6<Context, Boolean> interfaceC3954q6) {
        this.f9424a = null;
        this.f9425b = uri;
        this.f9426c = "";
        this.f9427d = "";
        this.f9428e = z;
        this.f9429f = false;
        this.f9430g = false;
        this.f9431h = false;
        this.f9432i = null;
    }

    /* renamed from: a */
    public final C3845j6 m29462a() {
        if (this.f9426c.isEmpty()) {
            return new C3845j6(null, this.f9425b, this.f9426c, this.f9427d, true, false, false, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: b */
    public final AbstractC3892m6<Double> m29461b(String str, double d) {
        return new C3813h6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: c */
    public final AbstractC3892m6<Long> m29460c(String str, long j) {
        return new C3781f6(this, str, Long.valueOf(j), true);
    }

    /* renamed from: d */
    public final AbstractC3892m6<String> m29459d(String str, String str2) {
        return new C3829i6(this, str, str2, true);
    }

    /* renamed from: e */
    public final AbstractC3892m6<Boolean> m29458e(String str, boolean z) {
        return new C3797g6(this, str, Boolean.valueOf(z), true);
    }
}
