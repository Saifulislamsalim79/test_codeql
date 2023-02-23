package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.r3 */
/* loaded from: classes2.dex */
public final class C4347r3 {

    /* renamed from: a */
    public final String f10631a;

    /* renamed from: b */
    public final String f10632b;

    /* renamed from: c */
    public final long f10633c;

    /* renamed from: d */
    public final Bundle f10634d;

    public C4347r3(String str, String str2, Bundle bundle, long j) {
        this.f10631a = str;
        this.f10632b = str2;
        this.f10634d = bundle;
        this.f10633c = j;
    }

    /* renamed from: b */
    public static C4347r3 m27988b(C4379u c4379u) {
        return new C4347r3(c4379u.f10698c, c4379u.f10700e, c4379u.f10699d.m27977k(), c4379u.f10701f);
    }

    /* renamed from: a */
    public final C4379u m27989a() {
        return new C4379u(this.f10631a, new C4355s(new Bundle(this.f10634d)), this.f10632b, this.f10633c);
    }

    public final String toString() {
        String str = this.f10632b;
        String str2 = this.f10631a;
        String obj = this.f10634d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + obj.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(obj);
        return sb.toString();
    }
}
