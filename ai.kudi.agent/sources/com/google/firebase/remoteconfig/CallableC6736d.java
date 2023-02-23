package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;
/* compiled from: lambda */
/* renamed from: com.google.firebase.remoteconfig.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC6736d implements Callable {

    /* renamed from: c */
    public final /* synthetic */ k f16208c;

    /* renamed from: d */
    public final /* synthetic */ m f16209d;

    public /* synthetic */ CallableC6736d(k kVar, m mVar) {
        this.f16208c = kVar;
        this.f16209d = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f16208c.o(this.f16209d);
    }
}
