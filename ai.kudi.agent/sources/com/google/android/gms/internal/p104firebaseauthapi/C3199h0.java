package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h0 */
/* loaded from: classes2.dex */
public final class C3199h0 {

    /* renamed from: c */
    private static final C3199h0 f8523c = new C3199h0();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, InterfaceC3307l0<?>> f8525b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC3333m0 f8524a = new C3436q();

    private C3199h0() {
    }

    /* renamed from: a */
    public static C3199h0 m31087a() {
        return f8523c;
    }

    /* renamed from: b */
    public final <T> InterfaceC3307l0<T> m31086b(Class<T> cls) {
        C3117e.m31220f(cls, "messageType");
        InterfaceC3307l0<T> interfaceC3307l0 = (InterfaceC3307l0<T>) this.f8525b.get(cls);
        if (interfaceC3307l0 == null) {
            interfaceC3307l0 = this.f8524a.mo30455b(cls);
            C3117e.m31220f(cls, "messageType");
            C3117e.m31220f(interfaceC3307l0, "schema");
            InterfaceC3307l0 putIfAbsent = this.f8525b.putIfAbsent(cls, interfaceC3307l0);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return interfaceC3307l0;
    }
}
