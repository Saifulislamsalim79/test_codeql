package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i2 */
/* loaded from: classes2.dex */
public abstract class AbstractC3228i2<PrimitiveT, KeyT> {

    /* renamed from: a */
    private final Class<PrimitiveT> f8577a;

    public AbstractC3228i2(Class<PrimitiveT> cls) {
        this.f8577a = cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Class<PrimitiveT> m30984a() {
        return this.f8577a;
    }

    /* renamed from: b */
    public abstract PrimitiveT mo29907b(KeyT keyt) throws GeneralSecurityException;
}
