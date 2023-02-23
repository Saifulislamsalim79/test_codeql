package p201g.p262t.p263a.p264l;

import android.database.sqlite.SQLiteProgram;
import p201g.p262t.p263a.InterfaceC8099i;
/* compiled from: FrameworkSQLiteProgram.java */
/* renamed from: g.t.a.l.d */
/* loaded from: classes2.dex */
class C8109d implements InterfaceC8099i {

    /* renamed from: c */
    private final SQLiteProgram f19475c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8109d(SQLiteProgram sQLiteProgram) {
        this.f19475c = sQLiteProgram;
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindBlob(int i, byte[] bArr) {
        this.f19475c.bindBlob(i, bArr);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindDouble(int i, double d) {
        this.f19475c.bindDouble(i, d);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindLong(int i, long j) {
        this.f19475c.bindLong(i, j);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindNull(int i) {
        this.f19475c.bindNull(i);
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindString(int i, String str) {
        this.f19475c.bindString(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19475c.close();
    }
}
