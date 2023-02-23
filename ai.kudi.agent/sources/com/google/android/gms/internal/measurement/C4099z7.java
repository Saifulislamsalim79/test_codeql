package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.z7 */
/* loaded from: classes2.dex */
public final class C4099z7 {

    /* renamed from: b */
    private static volatile C4099z7 f9875b;

    /* renamed from: c */
    private static volatile C4099z7 f9876c;

    /* renamed from: d */
    static final C4099z7 f9877d = new C4099z7(true);

    /* renamed from: a */
    private final Map<C4083y7, C3879l8<?, ?>> f9878a;

    C4099z7() {
        this.f9878a = new HashMap();
    }

    /* renamed from: a */
    public static C4099z7 m28538a() {
        C4099z7 c4099z7 = f9875b;
        if (c4099z7 == null) {
            synchronized (C4099z7.class) {
                c4099z7 = f9875b;
                if (c4099z7 == null) {
                    c4099z7 = f9877d;
                    f9875b = c4099z7;
                }
            }
        }
        return c4099z7;
    }

    /* renamed from: b */
    public static C4099z7 m28537b() {
        C4099z7 c4099z7 = f9876c;
        if (c4099z7 != null) {
            return c4099z7;
        }
        synchronized (C4099z7.class) {
            C4099z7 c4099z72 = f9876c;
            if (c4099z72 != null) {
                return c4099z72;
            }
            C4099z7 m29555b = AbstractC3815h8.m29555b(C4099z7.class);
            f9876c = m29555b;
            return m29555b;
        }
    }

    /* renamed from: c */
    public final <ContainingType extends InterfaceC3927o9> C3879l8<ContainingType, ?> m28536c(ContainingType containingtype, int i) {
        return (C3879l8<ContainingType, ?>) this.f9878a.get(new C4083y7(containingtype, i));
    }

    C4099z7(boolean z) {
        this.f9878a = Collections.emptyMap();
    }
}
