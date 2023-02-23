package io.grpc.p384h1;

import io.grpc.C10043s;
/* compiled from: ContextRunnable.java */
/* renamed from: io.grpc.h1.x */
/* loaded from: classes2.dex */
abstract class AbstractRunnableC9810x implements Runnable {

    /* renamed from: c */
    private final C10043s f23033c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractRunnableC9810x(C10043s c10043s) {
        this.f23033c = c10043s;
    }

    /* renamed from: a */
    public abstract void mo13845a();

    @Override // java.lang.Runnable
    public final void run() {
        C10043s m13232g = this.f23033c.m13232g();
        try {
            mo13845a();
        } finally {
            this.f23033c.m13236J(m13232g);
        }
    }
}
