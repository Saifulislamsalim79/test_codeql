package p201g.p262t.p263a.p264l;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import p201g.p262t.p263a.C8087a;
import p201g.p262t.p263a.C8088b;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8100j;
import p201g.p262t.p263a.InterfaceC8101k;
/* compiled from: FrameworkSQLiteDatabase.java */
/* renamed from: g.t.a.l.a */
/* loaded from: classes2.dex */
class C8102a implements InterfaceC8093g {

    /* renamed from: d */
    private static final String[] f19459d = new String[0];

    /* renamed from: c */
    private final SQLiteDatabase f19460c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: g.t.a.l.a$a */
    /* loaded from: classes2.dex */
    public class C8103a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8100j f19461a;

        C8103a(C8102a c8102a, InterfaceC8100j interfaceC8100j) {
            this.f19461a = interfaceC8100j;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f19461a.mo16755g(new C8109d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: g.t.a.l.a$b */
    /* loaded from: classes2.dex */
    class C8104b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8100j f19462a;

        C8104b(C8102a c8102a, InterfaceC8100j interfaceC8100j) {
            this.f19462a = interfaceC8100j;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f19462a.mo16755g(new C8109d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8102a(SQLiteDatabase sQLiteDatabase) {
        this.f19460c = sQLiteDatabase;
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    /* renamed from: B0 */
    public Cursor mo16754B0(InterfaceC8100j interfaceC8100j) {
        return this.f19460c.rawQueryWithFactory(new C8103a(this, interfaceC8100j), interfaceC8100j.mo16756c(), f19459d, null);
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    /* renamed from: L */
    public InterfaceC8101k mo16753L(String str) {
        return new C8110e(this.f19460c.compileStatement(str));
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    /* renamed from: T */
    public Cursor mo16752T(InterfaceC8100j interfaceC8100j, CancellationSignal cancellationSignal) {
        return C8088b.m16775c(this.f19460c, interfaceC8100j.mo16756c(), f19459d, null, cancellationSignal, new C8104b(this, interfaceC8100j));
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public void beginTransaction() {
        this.f19460c.beginTransaction();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public void beginTransactionNonExclusive() {
        this.f19460c.beginTransactionNonExclusive();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m16751c(SQLiteDatabase sQLiteDatabase) {
        return this.f19460c == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19460c.close();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public void endTransaction() {
        this.f19460c.endTransaction();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public void execSQL(String str) throws SQLException {
        this.f19460c.execSQL(str);
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f19460c.getAttachedDbs();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public String getPath() {
        return this.f19460c.getPath();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public boolean inTransaction() {
        return this.f19460c.inTransaction();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public boolean isOpen() {
        return this.f19460c.isOpen();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public boolean isWriteAheadLoggingEnabled() {
        return C8088b.m16776b(this.f19460c);
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    /* renamed from: j0 */
    public Cursor mo16750j0(String str) {
        return mo16754B0(new C8087a(str));
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public void setTransactionSuccessful() {
        this.f19460c.setTransactionSuccessful();
    }
}
