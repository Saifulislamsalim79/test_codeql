package com.google.android.gms.internal.p104firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u2 */
/* loaded from: classes2.dex */
public final class C3543u2<P> {

    /* renamed from: a */
    private final ConcurrentMap<C3517t2, List<C3491s2<P>>> f8994a = new ConcurrentHashMap();

    /* renamed from: b */
    private final Class<P> f8995b;

    private C3543u2(Class<P> cls) {
        this.f8995b = cls;
    }

    /* renamed from: b */
    public static <P> C3543u2<P> m30204b(Class<P> cls) {
        return new C3543u2<>(cls);
    }

    /* renamed from: a */
    public final C3491s2<P> m30205a(P p, C3209ha c3209ha) throws GeneralSecurityException {
        byte[] array;
        if (c3209ha.m31067B() == EnumC3628x9.ENABLED) {
            EnumC3048bb enumC3048bb = EnumC3048bb.UNKNOWN_PREFIX;
            int ordinal = c3209ha.m31064E().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        array = C3620x1.f9072a;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                array = ByteBuffer.allocate(5).put((byte) 0).putInt(c3209ha.m31058z()).array();
            } else {
                array = ByteBuffer.allocate(5).put((byte) 1).putInt(c3209ha.m31058z()).array();
            }
            C3491s2<P> c3491s2 = new C3491s2<>(p, array, c3209ha.m31067B(), c3209ha.m31064E(), c3209ha.m31058z());
            ArrayList arrayList = new ArrayList();
            arrayList.add(c3491s2);
            C3517t2 c3517t2 = new C3517t2(c3491s2.m30287d(), null);
            List<C3491s2<P>> put = this.f8994a.put(c3517t2, Collections.unmodifiableList(arrayList));
            if (put != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(put);
                arrayList2.add(c3491s2);
                this.f8994a.put(c3517t2, Collections.unmodifiableList(arrayList2));
            }
            return c3491s2;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    /* renamed from: c */
    public final Class<P> m30203c() {
        return this.f8995b;
    }

    /* renamed from: d */
    public final List<C3491s2<P>> m30202d(byte[] bArr) {
        List<C3491s2<P>> list = this.f8994a.get(new C3517t2(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    /* renamed from: e */
    public final void m30201e(C3491s2<P> c3491s2) {
        if (c3491s2.m30290a() == EnumC3628x9.ENABLED) {
            if (m30202d(c3491s2.m30287d()).isEmpty()) {
                throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
            }
            return;
        }
        throw new IllegalArgumentException("the primary entry has to be ENABLED");
    }
}
