package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.w9 */
/* loaded from: classes2.dex */
public final class C4053w9 {

    /* renamed from: c */
    private static final C4053w9 f9823c = new C4053w9();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, InterfaceC4101z9<?>> f9825b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC3707aa f9824a = new C3784f9();

    private C4053w9() {
    }

    /* renamed from: a */
    public static C4053w9 m28691a() {
        return f9823c;
    }

    /* renamed from: b */
    public final <T> InterfaceC4101z9<T> m28690b(Class<T> cls) {
        C4004t8.m28904f(cls, "messageType");
        InterfaceC4101z9<T> interfaceC4101z9 = (InterfaceC4101z9<T>) this.f9825b.get(cls);
        if (interfaceC4101z9 == null) {
            interfaceC4101z9 = this.f9824a.mo29608b(cls);
            C4004t8.m28904f(cls, "messageType");
            C4004t8.m28904f(interfaceC4101z9, "schema");
            InterfaceC4101z9 putIfAbsent = this.f9825b.putIfAbsent(cls, interfaceC4101z9);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return interfaceC4101z9;
    }
}
