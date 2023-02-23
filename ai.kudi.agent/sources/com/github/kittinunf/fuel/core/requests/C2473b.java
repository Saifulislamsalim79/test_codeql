package com.github.kittinunf.fuel.core.requests;

import com.github.kittinunf.fuel.core.InterfaceC2464q;
import kotlin.e0.d.l;
/* compiled from: CancellableRequest.kt */
/* renamed from: com.github.kittinunf.fuel.core.requests.b */
/* loaded from: classes2.dex */
public final class C2473b {
    /* renamed from: a */
    public static final boolean m32785a(InterfaceC2464q interfaceC2464q) {
        l.g(interfaceC2464q, "$this$isCancelled");
        FutureC2469a m32788c = FutureC2469a.f7070y.m32788c(interfaceC2464q.getRequest());
        if (m32788c != null) {
            return m32788c.isCancelled();
        }
        return false;
    }
}
