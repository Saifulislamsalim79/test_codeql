package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s2 */
/* loaded from: classes2.dex */
public final class C3491s2<P> {

    /* renamed from: a */
    private final P f8934a;

    /* renamed from: b */
    private final byte[] f8935b;

    /* renamed from: c */
    private final EnumC3628x9 f8936c;

    /* renamed from: d */
    private final EnumC3048bb f8937d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3491s2(P p, byte[] bArr, EnumC3628x9 enumC3628x9, EnumC3048bb enumC3048bb, int i) {
        this.f8934a = p;
        this.f8935b = Arrays.copyOf(bArr, bArr.length);
        this.f8936c = enumC3628x9;
        this.f8937d = enumC3048bb;
    }

    /* renamed from: a */
    public final EnumC3628x9 m30290a() {
        return this.f8936c;
    }

    /* renamed from: b */
    public final EnumC3048bb m30289b() {
        return this.f8937d;
    }

    /* renamed from: c */
    public final P m30288c() {
        return this.f8934a;
    }

    /* renamed from: d */
    public final byte[] m30287d() {
        byte[] bArr = this.f8935b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
