package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.C2730a.InterfaceC2734d;
import com.google.android.gms.common.internal.C2906q;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes2.dex */
public final class C2754b<O extends C2730a.InterfaceC2734d> {

    /* renamed from: a */
    private final int f7737a;

    /* renamed from: b */
    private final C2730a<O> f7738b;

    /* renamed from: c */
    private final O f7739c;

    /* renamed from: d */
    private final String f7740d;

    private C2754b(C2730a<O> c2730a, O o, String str) {
        this.f7738b = c2730a;
        this.f7739c = o;
        this.f7740d = str;
        this.f7737a = C2906q.m31700b(c2730a, o, str);
    }

    /* renamed from: a */
    public static <O extends C2730a.InterfaceC2734d> C2754b<O> m32051a(C2730a<O> c2730a, O o, String str) {
        return new C2754b<>(c2730a, o, str);
    }

    /* renamed from: b */
    public final String m32050b() {
        return this.f7738b.m32090c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2754b) {
            C2754b c2754b = (C2754b) obj;
            return C2906q.m31701a(this.f7738b, c2754b.f7738b) && C2906q.m31701a(this.f7739c, c2754b.f7739c) && C2906q.m31701a(this.f7740d, c2754b.f7740d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7737a;
    }
}
