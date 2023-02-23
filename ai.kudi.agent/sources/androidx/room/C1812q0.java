package androidx.room;

import android.database.Cursor;
import androidx.room.p062y0.AbstractC1850b;
import java.util.List;
import p201g.p262t.p263a.C8087a;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8094h;
/* compiled from: RoomOpenHelper.java */
/* renamed from: androidx.room.q0 */
/* loaded from: classes2.dex */
public class C1812q0 extends InterfaceC8094h.AbstractC8095a {

    /* renamed from: b */
    private C1851z f5516b;

    /* renamed from: c */
    private final AbstractC1813a f5517c;

    /* renamed from: d */
    private final String f5518d;

    /* renamed from: e */
    private final String f5519e;

    /* compiled from: RoomOpenHelper.java */
    /* renamed from: androidx.room.q0$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1813a {
        public final int version;

        public AbstractC1813a(int i) {
            this.version = i;
        }

        protected abstract void createAllTables(InterfaceC8093g interfaceC8093g);

        protected abstract void dropAllTables(InterfaceC8093g interfaceC8093g);

        protected abstract void onCreate(InterfaceC8093g interfaceC8093g);

        protected abstract void onOpen(InterfaceC8093g interfaceC8093g);

        protected abstract void onPostMigrate(InterfaceC8093g interfaceC8093g);

        protected abstract void onPreMigrate(InterfaceC8093g interfaceC8093g);

        protected abstract C1814b onValidateSchema(InterfaceC8093g interfaceC8093g);

        @Deprecated
        protected void validateMigration(InterfaceC8093g interfaceC8093g) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: RoomOpenHelper.java */
    /* renamed from: androidx.room.q0$b */
    /* loaded from: classes2.dex */
    public static class C1814b {

        /* renamed from: a */
        public final boolean f5520a;

        /* renamed from: b */
        public final String f5521b;

        public C1814b(boolean z, String str) {
            this.f5520a = z;
            this.f5521b = str;
        }
    }

    public C1812q0(C1851z c1851z, AbstractC1813a abstractC1813a, String str, String str2) {
        super(abstractC1813a.version);
        this.f5516b = c1851z;
        this.f5517c = abstractC1813a;
        this.f5518d = str;
        this.f5519e = str2;
    }

    /* renamed from: h */
    private void m34474h(InterfaceC8093g interfaceC8093g) {
        if (m34471k(interfaceC8093g)) {
            Cursor mo16754B0 = interfaceC8093g.mo16754B0(new C8087a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                String string = mo16754B0.moveToFirst() ? mo16754B0.getString(0) : null;
                mo16754B0.close();
                if (!this.f5518d.equals(string) && !this.f5519e.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
                return;
            } catch (Throwable th) {
                mo16754B0.close();
                throw th;
            }
        }
        C1814b onValidateSchema = this.f5517c.onValidateSchema(interfaceC8093g);
        if (onValidateSchema.f5520a) {
            this.f5517c.onPostMigrate(interfaceC8093g);
            m34470l(interfaceC8093g);
            return;
        }
        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f5521b);
    }

    /* renamed from: i */
    private void m34473i(InterfaceC8093g interfaceC8093g) {
        interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    private static boolean m34472j(InterfaceC8093g interfaceC8093g) {
        Cursor mo16750j0 = interfaceC8093g.mo16750j0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (mo16750j0.moveToFirst()) {
                if (mo16750j0.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            mo16750j0.close();
        }
    }

    /* renamed from: k */
    private static boolean m34471k(InterfaceC8093g interfaceC8093g) {
        Cursor mo16750j0 = interfaceC8093g.mo16750j0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (mo16750j0.moveToFirst()) {
                if (mo16750j0.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            mo16750j0.close();
        }
    }

    /* renamed from: l */
    private void m34470l(InterfaceC8093g interfaceC8093g) {
        m34473i(interfaceC8093g);
        interfaceC8093g.execSQL(C1810p0.m34475a(this.f5518d));
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h.AbstractC8095a
    /* renamed from: b */
    public void mo16766b(InterfaceC8093g interfaceC8093g) {
        super.mo16766b(interfaceC8093g);
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h.AbstractC8095a
    /* renamed from: d */
    public void mo16764d(InterfaceC8093g interfaceC8093g) {
        boolean m34472j = m34472j(interfaceC8093g);
        this.f5517c.createAllTables(interfaceC8093g);
        if (!m34472j) {
            C1814b onValidateSchema = this.f5517c.onValidateSchema(interfaceC8093g);
            if (!onValidateSchema.f5520a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f5521b);
            }
        }
        m34470l(interfaceC8093g);
        this.f5517c.onCreate(interfaceC8093g);
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h.AbstractC8095a
    /* renamed from: e */
    public void mo16763e(InterfaceC8093g interfaceC8093g, int i, int i2) {
        mo16761g(interfaceC8093g, i, i2);
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h.AbstractC8095a
    /* renamed from: f */
    public void mo16762f(InterfaceC8093g interfaceC8093g) {
        super.mo16762f(interfaceC8093g);
        m34474h(interfaceC8093g);
        this.f5517c.onOpen(interfaceC8093g);
        this.f5516b = null;
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h.AbstractC8095a
    /* renamed from: g */
    public void mo16761g(InterfaceC8093g interfaceC8093g, int i, int i2) {
        boolean z;
        List<AbstractC1850b> m34480c;
        C1851z c1851z = this.f5516b;
        if (c1851z == null || (m34480c = c1851z.f5608d.m34480c(i, i2)) == null) {
            z = false;
        } else {
            this.f5517c.onPreMigrate(interfaceC8093g);
            for (AbstractC1850b abstractC1850b : m34480c) {
                abstractC1850b.migrate(interfaceC8093g);
            }
            C1814b onValidateSchema = this.f5517c.onValidateSchema(interfaceC8093g);
            if (onValidateSchema.f5520a) {
                this.f5517c.onPostMigrate(interfaceC8093g);
                m34470l(interfaceC8093g);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f5521b);
            }
        }
        if (z) {
            return;
        }
        C1851z c1851z2 = this.f5516b;
        if (c1851z2 != null && !c1851z2.m34429a(i, i2)) {
            this.f5517c.dropAllTables(interfaceC8093g);
            this.f5517c.createAllTables(interfaceC8093g);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
