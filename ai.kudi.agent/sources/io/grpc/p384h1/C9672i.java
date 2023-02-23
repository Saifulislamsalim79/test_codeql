package io.grpc.p384h1;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: AtomicLongCounter.java */
/* renamed from: io.grpc.h1.i */
/* loaded from: classes2.dex */
final class C9672i implements InterfaceC9595e1 {

    /* renamed from: a */
    private final AtomicLong f22716a = new AtomicLong();

    @Override // io.grpc.p384h1.InterfaceC9595e1
    /* renamed from: a */
    public void mo13937a(long j) {
        this.f22716a.getAndAdd(j);
    }
}
