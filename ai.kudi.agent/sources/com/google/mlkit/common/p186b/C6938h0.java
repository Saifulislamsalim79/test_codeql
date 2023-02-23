package com.google.mlkit.common.p186b;

import com.google.android.gms.common.internal.s;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.h0 */
/* loaded from: classes2.dex */
final class C6938h0 implements Closeable {

    /* renamed from: c */
    final /* synthetic */ C6945o f16630c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C6938h0(C6945o c6945o, C6936g0 c6936g0) {
        AtomicReference atomicReference;
        this.f16630c = c6945o;
        atomicReference = c6945o.f16652d;
        s.m(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.f16630c.f16652d;
        atomicReference.set(null);
        this.f16630c.m20428d();
    }
}
