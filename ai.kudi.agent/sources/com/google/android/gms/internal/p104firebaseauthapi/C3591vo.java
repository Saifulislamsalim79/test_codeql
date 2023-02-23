package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vo */
/* loaded from: classes2.dex */
final class C3591vo {

    /* renamed from: a */
    private final Object f9045a;

    /* renamed from: b */
    private final int f9046b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3591vo(Object obj, int i) {
        this.f9045a = obj;
        this.f9046b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3591vo) {
            C3591vo c3591vo = (C3591vo) obj;
            return this.f9045a == c3591vo.f9045a && this.f9046b == c3591vo.f9046b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f9045a) * 65535) + this.f9046b;
    }
}
