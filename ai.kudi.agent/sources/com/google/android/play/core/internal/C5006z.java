package com.google.android.play.core.internal;
/* renamed from: com.google.android.play.core.internal.z */
/* loaded from: classes2.dex */
public final class C5006z<T> implements InterfaceC4961b0<T> {

    /* renamed from: a */
    private InterfaceC4961b0<T> f12655a;

    /* renamed from: b */
    public static <T> void m25875b(InterfaceC4961b0<T> interfaceC4961b0, InterfaceC4961b0<T> interfaceC4961b02) {
        C4987n.m25915c(interfaceC4961b02);
        C5006z c5006z = (C5006z) interfaceC4961b0;
        if (c5006z.f12655a != null) {
            throw new IllegalStateException();
        }
        c5006z.f12655a = interfaceC4961b02;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final T mo15000a() {
        InterfaceC4961b0<T> interfaceC4961b0 = this.f12655a;
        if (interfaceC4961b0 != null) {
            return interfaceC4961b0.mo15000a();
        }
        throw new IllegalStateException();
    }
}
