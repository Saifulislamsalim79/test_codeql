package androidx.room;

import androidx.room.AbstractC1802o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p201g.p262t.p263a.InterfaceC8101k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueryInterceptorStatement.java */
/* renamed from: androidx.room.m0 */
/* loaded from: classes2.dex */
public final class C1798m0 implements InterfaceC8101k {

    /* renamed from: c */
    private final InterfaceC8101k f5477c;

    /* renamed from: d */
    private final AbstractC1802o0.InterfaceC1808f f5478d;

    /* renamed from: e */
    private final String f5479e;

    /* renamed from: f */
    private final List<Object> f5480f = new ArrayList();

    /* renamed from: w */
    private final Executor f5481w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1798m0(InterfaceC8101k interfaceC8101k, AbstractC1802o0.InterfaceC1808f interfaceC1808f, String str, Executor executor) {
        this.f5477c = interfaceC8101k;
        this.f5478d = interfaceC1808f;
        this.f5479e = str;
        this.f5481w = executor;
    }

    /* renamed from: m */
    private void m34494m(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.f5480f.size()) {
            for (int size = this.f5480f.size(); size <= i2; size++) {
                this.f5480f.add(null);
            }
        }
        this.f5480f.set(i2, obj);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindBlob(int i, byte[] bArr) {
        m34494m(i, bArr);
        this.f5477c.bindBlob(i, bArr);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindDouble(int i, double d) {
        m34494m(i, Double.valueOf(d));
        this.f5477c.bindDouble(i, d);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindLong(int i, long j) {
        m34494m(i, Long.valueOf(j));
        this.f5477c.bindLong(i, j);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindNull(int i) {
        m34494m(i, this.f5480f.toArray());
        this.f5477c.bindNull(i);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindString(int i, String str) {
        m34494m(i, str);
        this.f5477c.bindString(i, str);
    }

    /* renamed from: c */
    public /* synthetic */ void m34496c() {
        this.f5478d.m34476a(this.f5479e, this.f5480f);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5477c.close();
    }

    @Override // p201g.p262t.p263a.InterfaceC8101k
    public long executeInsert() {
        this.f5481w.execute(new Runnable() { // from class: androidx.room.q
            @Override // java.lang.Runnable
            public final void run() {
                C1798m0.this.m34496c();
            }
        });
        return this.f5477c.executeInsert();
    }

    @Override // p201g.p262t.p263a.InterfaceC8101k
    public int executeUpdateDelete() {
        this.f5481w.execute(new Runnable() { // from class: androidx.room.r
            @Override // java.lang.Runnable
            public final void run() {
                C1798m0.this.m34495g();
            }
        });
        return this.f5477c.executeUpdateDelete();
    }

    /* renamed from: g */
    public /* synthetic */ void m34495g() {
        this.f5478d.m34476a(this.f5479e, this.f5480f);
    }
}
