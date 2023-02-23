package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.s;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wj */
/* loaded from: classes2.dex */
public final class C3612wj extends AbstractC3402oh implements C2730a.InterfaceC2734d {

    /* renamed from: d */
    private final String f9059d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3612wj(String str, C3560uj c3560uj) {
        s.g(str, "A valid API key must be provided");
        this.f9059d = str;
    }

    /* renamed from: c */
    public final C3612wj clone() {
        String str = this.f9059d;
        s.f(str);
        return new C3612wj(str, null);
    }

    /* renamed from: d */
    public final String m30079d() {
        return this.f9059d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3612wj) {
            C3612wj c3612wj = (C3612wj) obj;
            return C2906q.m31701a(this.f9059d, c3612wj.f9059d) && this.f8801c == c3612wj.f8801c;
        }
        return false;
    }

    public final int hashCode() {
        return C2906q.m31700b(this.f9059d) + (1 ^ (this.f8801c ? 1 : 0));
    }
}
