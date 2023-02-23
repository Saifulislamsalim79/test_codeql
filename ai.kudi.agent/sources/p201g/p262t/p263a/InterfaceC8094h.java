package p201g.p262t.p263a;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
/* compiled from: SupportSQLiteOpenHelper.java */
/* renamed from: g.t.a.h */
/* loaded from: classes2.dex */
public interface InterfaceC8094h extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: g.t.a.h$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8095a {

        /* renamed from: a */
        public final int f19450a;

        public AbstractC8095a(int i) {
            this.f19450a = i;
        }

        /* renamed from: a */
        private void m16767a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    C8088b.m16777a(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e);
                    }
                }
            } catch (Exception e2) {
                Log.w("SupportSQLite", "delete failed: ", e2);
            }
        }

        /* renamed from: b */
        public void mo16766b(InterfaceC8093g interfaceC8093g) {
        }

        /* renamed from: c */
        public void m16765c(InterfaceC8093g interfaceC8093g) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + interfaceC8093g.getPath());
            if (!interfaceC8093g.isOpen()) {
                m16767a(interfaceC8093g.getPath());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = interfaceC8093g.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    interfaceC8093g.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    for (Pair<String, String> next : list) {
                        m16767a((String) next.second);
                    }
                } else {
                    m16767a(interfaceC8093g.getPath());
                }
            }
        }

        /* renamed from: d */
        public abstract void mo16764d(InterfaceC8093g interfaceC8093g);

        /* renamed from: e */
        public void mo16763e(InterfaceC8093g interfaceC8093g, int i, int i2) {
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        /* renamed from: f */
        public void mo16762f(InterfaceC8093g interfaceC8093g) {
        }

        /* renamed from: g */
        public abstract void mo16761g(InterfaceC8093g interfaceC8093g, int i, int i2);
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: g.t.a.h$b */
    /* loaded from: classes2.dex */
    public static class C8096b {

        /* renamed from: a */
        public final Context f19451a;

        /* renamed from: b */
        public final String f19452b;

        /* renamed from: c */
        public final AbstractC8095a f19453c;

        /* renamed from: d */
        public final boolean f19454d;

        /* compiled from: SupportSQLiteOpenHelper.java */
        /* renamed from: g.t.a.h$b$a */
        /* loaded from: classes2.dex */
        public static class C8097a {

            /* renamed from: a */
            Context f19455a;

            /* renamed from: b */
            String f19456b;

            /* renamed from: c */
            AbstractC8095a f19457c;

            /* renamed from: d */
            boolean f19458d;

            C8097a(Context context) {
                this.f19455a = context;
            }

            /* renamed from: a */
            public C8096b m16759a() {
                if (this.f19457c != null) {
                    if (this.f19455a != null) {
                        if (this.f19458d && TextUtils.isEmpty(this.f19456b)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new C8096b(this.f19455a, this.f19456b, this.f19457c, this.f19458d);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            /* renamed from: b */
            public C8097a m16758b(AbstractC8095a abstractC8095a) {
                this.f19457c = abstractC8095a;
                return this;
            }

            /* renamed from: c */
            public C8097a m16757c(String str) {
                this.f19456b = str;
                return this;
            }
        }

        C8096b(Context context, String str, AbstractC8095a abstractC8095a, boolean z) {
            this.f19451a = context;
            this.f19452b = str;
            this.f19453c = abstractC8095a;
            this.f19454d = z;
        }

        /* renamed from: a */
        public static C8097a m16760a(Context context) {
            return new C8097a(context);
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: g.t.a.h$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC8098c {
        /* renamed from: a */
        InterfaceC8094h mo16742a(C8096b c8096b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: e0 */
    InterfaceC8093g mo16748e0();

    String getDatabaseName();

    /* renamed from: h0 */
    InterfaceC8093g mo16747h0();

    void setWriteAheadLoggingEnabled(boolean z);
}
