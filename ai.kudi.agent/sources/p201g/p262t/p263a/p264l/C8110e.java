package p201g.p262t.p263a.p264l;

import android.database.sqlite.SQLiteStatement;
import p201g.p262t.p263a.InterfaceC8101k;
/* compiled from: FrameworkSQLiteStatement.java */
/* renamed from: g.t.a.l.e */
/* loaded from: classes2.dex */
class C8110e extends C8109d implements InterfaceC8101k {

    /* renamed from: d */
    private final SQLiteStatement f19476d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8110e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f19476d = sQLiteStatement;
    }

    @Override // p201g.p262t.p263a.InterfaceC8101k
    public long executeInsert() {
        return this.f19476d.executeInsert();
    }

    @Override // p201g.p262t.p263a.InterfaceC8101k
    public int executeUpdateDelete() {
        return this.f19476d.executeUpdateDelete();
    }
}
