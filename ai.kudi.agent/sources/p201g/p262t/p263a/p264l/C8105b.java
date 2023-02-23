package p201g.p262t.p263a.p264l;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import p201g.p262t.p263a.C8088b;
import p201g.p262t.p263a.C8090d;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8094h;
/* compiled from: FrameworkSQLiteOpenHelper.java */
/* renamed from: g.t.a.l.b */
/* loaded from: classes2.dex */
class C8105b implements InterfaceC8094h {

    /* renamed from: c */
    private final Context f19463c;

    /* renamed from: d */
    private final String f19464d;

    /* renamed from: e */
    private final InterfaceC8094h.AbstractC8095a f19465e;

    /* renamed from: f */
    private final boolean f19466f;

    /* renamed from: w */
    private final Object f19467w = new Object();

    /* renamed from: x */
    private C8106a f19468x;

    /* renamed from: y */
    private boolean f19469y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameworkSQLiteOpenHelper.java */
    /* renamed from: g.t.a.l.b$a */
    /* loaded from: classes2.dex */
    public static class C8106a extends SQLiteOpenHelper {

        /* renamed from: c */
        final C8102a[] f19470c;

        /* renamed from: d */
        final InterfaceC8094h.AbstractC8095a f19471d;

        /* renamed from: e */
        private boolean f19472e;

        /* compiled from: FrameworkSQLiteOpenHelper.java */
        /* renamed from: g.t.a.l.b$a$a */
        /* loaded from: classes2.dex */
        class C8107a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ InterfaceC8094h.AbstractC8095a f19473a;

            /* renamed from: b */
            final /* synthetic */ C8102a[] f19474b;

            C8107a(InterfaceC8094h.AbstractC8095a abstractC8095a, C8102a[] c8102aArr) {
                this.f19473a = abstractC8095a;
                this.f19474b = c8102aArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f19473a.m16765c(C8106a.m16743m(this.f19474b, sQLiteDatabase));
            }
        }

        C8106a(Context context, String str, C8102a[] c8102aArr, InterfaceC8094h.AbstractC8095a abstractC8095a) {
            super(context, str, null, abstractC8095a.f19450a, new C8107a(abstractC8095a, c8102aArr));
            this.f19471d = abstractC8095a;
            this.f19470c = c8102aArr;
        }

        /* renamed from: m */
        static C8102a m16743m(C8102a[] c8102aArr, SQLiteDatabase sQLiteDatabase) {
            C8102a c8102a = c8102aArr[0];
            if (c8102a == null || !c8102a.m16751c(sQLiteDatabase)) {
                c8102aArr[0] = new C8102a(sQLiteDatabase);
            }
            return c8102aArr[0];
        }

        /* renamed from: F */
        synchronized InterfaceC8093g m16746F() {
            this.f19472e = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f19472e) {
                close();
                return m16746F();
            }
            return m16744g(writableDatabase);
        }

        /* renamed from: c */
        synchronized InterfaceC8093g m16745c() {
            this.f19472e = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.f19472e) {
                close();
                return m16745c();
            }
            return m16744g(readableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f19470c[0] = null;
        }

        /* renamed from: g */
        C8102a m16744g(SQLiteDatabase sQLiteDatabase) {
            return m16743m(this.f19470c, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f19471d.mo16766b(m16744g(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f19471d.mo16764d(m16744g(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f19472e = true;
            this.f19471d.mo16763e(m16744g(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f19472e) {
                return;
            }
            this.f19471d.mo16762f(m16744g(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f19472e = true;
            this.f19471d.mo16761g(m16744g(sQLiteDatabase), i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8105b(Context context, String str, InterfaceC8094h.AbstractC8095a abstractC8095a, boolean z) {
        this.f19463c = context;
        this.f19464d = str;
        this.f19465e = abstractC8095a;
        this.f19466f = z;
    }

    /* renamed from: c */
    private C8106a m16749c() {
        C8106a c8106a;
        synchronized (this.f19467w) {
            if (this.f19468x == null) {
                C8102a[] c8102aArr = new C8102a[1];
                if (Build.VERSION.SDK_INT >= 23 && this.f19464d != null && this.f19466f) {
                    this.f19468x = new C8106a(this.f19463c, new File(C8090d.m16771a(this.f19463c), this.f19464d).getAbsolutePath(), c8102aArr, this.f19465e);
                } else {
                    this.f19468x = new C8106a(this.f19463c, this.f19464d, c8102aArr, this.f19465e);
                }
                if (Build.VERSION.SDK_INT >= 16) {
                    C8088b.m16774d(this.f19468x, this.f19469y);
                }
            }
            c8106a = this.f19468x;
        }
        return c8106a;
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m16749c().close();
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    /* renamed from: e0 */
    public InterfaceC8093g mo16748e0() {
        return m16749c().m16745c();
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    public String getDatabaseName() {
        return this.f19464d;
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    /* renamed from: h0 */
    public InterfaceC8093g mo16747h0() {
        return m16749c().m16746F();
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f19467w) {
            if (this.f19468x != null) {
                C8088b.m16774d(this.f19468x, z);
            }
            this.f19469y = z;
        }
    }
}
