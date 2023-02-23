package androidx.room;

import androidx.room.AbstractC1802o0;
import java.util.concurrent.Executor;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8094h;
/* compiled from: QueryInterceptorOpenHelper.java */
/* renamed from: androidx.room.j0 */
/* loaded from: classes2.dex */
final class C1792j0 implements InterfaceC8094h, InterfaceC1759a0 {

    /* renamed from: c */
    private final InterfaceC8094h f5464c;

    /* renamed from: d */
    private final AbstractC1802o0.InterfaceC1808f f5465d;

    /* renamed from: e */
    private final Executor f5466e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1792j0(InterfaceC8094h interfaceC8094h, AbstractC1802o0.InterfaceC1808f interfaceC1808f, Executor executor) {
        this.f5464c = interfaceC8094h;
        this.f5465d = interfaceC1808f;
        this.f5466e = executor;
    }

    @Override // androidx.room.InterfaceC1759a0
    /* renamed from: c */
    public InterfaceC8094h mo34441c() {
        return this.f5464c;
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5464c.close();
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    /* renamed from: e0 */
    public InterfaceC8093g mo16748e0() {
        return new C1790i0(this.f5464c.mo16748e0(), this.f5465d, this.f5466e);
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    public String getDatabaseName() {
        return this.f5464c.getDatabaseName();
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    /* renamed from: h0 */
    public InterfaceC8093g mo16747h0() {
        return new C1790i0(this.f5464c.mo16747h0(), this.f5465d, this.f5466e);
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f5464c.setWriteAheadLoggingEnabled(z);
    }
}
