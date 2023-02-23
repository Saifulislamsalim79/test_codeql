package com.google.mlkit.common.p186b;

import com.google.firebase.p170o.InterfaceC6560b;
import java.util.concurrent.Executor;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.d */
/* loaded from: classes2.dex */
public class C6929d {

    /* renamed from: a */
    private final InterfaceC6560b f16621a;

    public C6929d(InterfaceC6560b interfaceC6560b) {
        this.f16621a = interfaceC6560b;
    }

    /* renamed from: a */
    public Executor m20455a(Executor executor) {
        return executor != null ? executor : (Executor) this.f16621a.get();
    }
}
