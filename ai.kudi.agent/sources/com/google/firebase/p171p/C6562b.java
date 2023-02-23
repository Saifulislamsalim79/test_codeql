package com.google.firebase.p171p;

import com.google.android.gms.common.internal.C2906q;
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* renamed from: com.google.firebase.p.b */
/* loaded from: classes2.dex */
public class C6562b {

    /* renamed from: a */
    private String f15836a;

    public C6562b(String str) {
        this.f15836a = str;
    }

    /* renamed from: a */
    public String m21633a() {
        return this.f15836a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6562b) {
            return C2906q.m31701a(this.f15836a, ((C6562b) obj).f15836a);
        }
        return false;
    }

    public int hashCode() {
        return C2906q.m31700b(this.f15836a);
    }

    public String toString() {
        C2906q.C2907a m31699c = C2906q.m31699c(this);
        m31699c.m31698a("token", this.f15836a);
        return m31699c.toString();
    }
}
