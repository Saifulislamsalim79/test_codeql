package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h2 */
/* loaded from: classes2.dex */
public abstract class AbstractC3201h2<KeyFormatProtoT extends InterfaceC3644y, KeyT> {

    /* renamed from: a */
    private final Class<KeyFormatProtoT> f8526a;

    public AbstractC3201h2(Class<KeyFormatProtoT> cls) {
        this.f8526a = cls;
    }

    /* renamed from: a */
    public abstract KeyFormatProtoT mo30067a(AbstractC3223ho abstractC3223ho) throws zzaae;

    /* renamed from: b */
    public final Class<KeyFormatProtoT> m31085b() {
        return this.f8526a;
    }

    /* renamed from: c */
    public abstract KeyT mo30066c(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    /* renamed from: d */
    public Map<String, C3174g2<KeyFormatProtoT>> mo30065d() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    /* renamed from: e */
    public abstract void mo30064e(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
}
