package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j2 */
/* loaded from: classes2.dex */
public abstract class AbstractC3255j2<KeyProtoT extends InterfaceC3644y> {

    /* renamed from: a */
    private final Class<KeyProtoT> f8624a;

    /* renamed from: b */
    private final Map<Class<?>, AbstractC3228i2<?, KeyProtoT>> f8625b;

    /* renamed from: c */
    private final Class<?> f8626c;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public AbstractC3255j2(Class<KeyProtoT> cls, AbstractC3228i2<?, KeyProtoT>... abstractC3228i2Arr) {
        this.f8624a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            AbstractC3228i2<?, KeyProtoT> abstractC3228i2 = abstractC3228i2Arr[i];
            if (hashMap.containsKey(abstractC3228i2.m30984a())) {
                String valueOf = String.valueOf(abstractC3228i2.m30984a().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            hashMap.put(abstractC3228i2.m30984a(), abstractC3228i2);
        }
        this.f8626c = abstractC3228i2Arr[0].m30984a();
        this.f8625b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public AbstractC3201h2<?, KeyProtoT> mo29976a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract EnumC3576v9 mo29906b();

    /* renamed from: c */
    public abstract KeyProtoT mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final Class<?> m30907d() {
        return this.f8626c;
    }

    /* renamed from: e */
    public final Class<KeyProtoT> m30906e() {
        return this.f8624a;
    }

    /* renamed from: f */
    public final <P> P m30905f(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        AbstractC3228i2<?, KeyProtoT> abstractC3228i2 = this.f8625b.get(cls);
        if (abstractC3228i2 != null) {
            return (P) abstractC3228i2.mo29907b(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public abstract String mo29904g();

    /* renamed from: h */
    public final Set<Class<?>> m30904h() {
        return this.f8625b.keySet();
    }

    /* renamed from: i */
    public abstract void mo29903i(KeyProtoT keyprotot) throws GeneralSecurityException;
}
