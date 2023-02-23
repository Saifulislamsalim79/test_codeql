package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sc */
/* loaded from: classes2.dex */
public final class C3501sc extends ThreadLocal<Mac> {

    /* renamed from: a */
    final /* synthetic */ C3527tc f8941a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3501sc(C3527tc c3527tc) {
        this.f8941a = c3527tc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            C3184gc<C3319lc, Mac> c3184gc = C3184gc.f8505f;
            str = this.f8941a.f8978b;
            Mac m31099a = c3184gc.m31099a(str);
            key = this.f8941a.f8979c;
            m31099a.init(key);
            return m31099a;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
