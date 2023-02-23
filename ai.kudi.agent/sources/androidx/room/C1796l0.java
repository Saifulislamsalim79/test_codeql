package androidx.room;

import java.util.ArrayList;
import java.util.List;
import p201g.p262t.p263a.InterfaceC8099i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueryInterceptorProgram.java */
/* renamed from: androidx.room.l0 */
/* loaded from: classes2.dex */
public final class C1796l0 implements InterfaceC8099i {

    /* renamed from: c */
    private List<Object> f5475c = new ArrayList();

    /* renamed from: g */
    private void m34497g(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.f5475c.size()) {
            for (int size = this.f5475c.size(); size <= i2; size++) {
                this.f5475c.add(null);
            }
        }
        this.f5475c.set(i2, obj);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindBlob(int i, byte[] bArr) {
        m34497g(i, bArr);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindDouble(int i, double d) {
        m34497g(i, Double.valueOf(d));
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindLong(int i, long j) {
        m34497g(i, Long.valueOf(j));
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindNull(int i) {
        m34497g(i, null);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindString(int i, String str) {
        m34497g(i, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List<Object> m34498c() {
        return this.f5475c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
