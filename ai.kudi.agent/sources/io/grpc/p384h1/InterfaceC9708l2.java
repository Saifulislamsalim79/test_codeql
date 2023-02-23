package io.grpc.p384h1;

import java.util.concurrent.TimeUnit;
/* compiled from: TimeProvider.java */
/* renamed from: io.grpc.h1.l2 */
/* loaded from: classes2.dex */
public interface InterfaceC9708l2 {

    /* renamed from: a */
    public static final InterfaceC9708l2 f22790a = new C9709a();

    /* compiled from: TimeProvider.java */
    /* renamed from: io.grpc.h1.l2$a */
    /* loaded from: classes2.dex */
    class C9709a implements InterfaceC9708l2 {
        C9709a() {
        }

        @Override // io.grpc.p384h1.InterfaceC9708l2
        /* renamed from: a */
        public long mo14158a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    long mo14158a();
}
