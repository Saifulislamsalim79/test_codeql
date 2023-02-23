package com.google.android.gms.internal.measurement;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.y6 */
/* loaded from: classes2.dex */
public final class C4082y6 {
    /* renamed from: a */
    public static <T> InterfaceC4018u6<T> m28601a(InterfaceC4018u6<T> interfaceC4018u6) {
        if ((interfaceC4018u6 instanceof C4050w6) || (interfaceC4018u6 instanceof C4034v6)) {
            return interfaceC4018u6;
        }
        if (interfaceC4018u6 instanceof Serializable) {
            return new C4034v6(interfaceC4018u6);
        }
        return new C4050w6(interfaceC4018u6);
    }

    /* renamed from: b */
    public static <T> InterfaceC4018u6<T> m28600b(T t) {
        return new C4066x6(t);
    }
}
