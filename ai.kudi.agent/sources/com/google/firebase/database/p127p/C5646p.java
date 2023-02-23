package com.google.firebase.database.p127p;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.p131s.C5737e;
import com.google.firebase.database.p131s.C5743g;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.C5895z;
import com.google.firebase.database.p131s.p133h0.C5760g;
import com.google.firebase.database.p131s.p133h0.C5764h;
import com.google.firebase.database.p131s.p133h0.InterfaceC5759f;
import com.google.firebase.database.p131s.p134i0.C5779d;
import com.google.firebase.database.p131s.p134i0.C5783e;
import com.google.firebase.database.p131s.p134i0.C5785g;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.C5814i;
import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5924c;
import com.google.firebase.database.p139u.C5936g;
import com.google.firebase.database.p139u.C5944m;
import com.google.firebase.database.p139u.C5948o;
import com.google.firebase.database.p139u.InterfaceC5945n;
import com.google.firebase.database.p140v.C5957b;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: SqlPersistenceStorageEngine.java */
/* renamed from: com.google.firebase.database.p.p */
/* loaded from: classes2.dex */
public class C5646p implements InterfaceC5759f {

    /* renamed from: e */
    private static final Charset f13883e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final SQLiteDatabase f13884a;

    /* renamed from: b */
    private final C5899c f13885b;

    /* renamed from: c */
    private boolean f13886c;

    /* renamed from: d */
    private long f13887d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SqlPersistenceStorageEngine.java */
    /* renamed from: com.google.firebase.database.p.p$a */
    /* loaded from: classes2.dex */
    public class C5647a implements C5779d.InterfaceC5782c<Void, Integer> {

        /* renamed from: a */
        final /* synthetic */ C5779d f13888a;

        C5647a(C5646p c5646p, C5779d c5779d) {
            this.f13888a = c5779d;
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5779d.InterfaceC5782c
        /* renamed from: b */
        public Integer mo23405a(C5830l c5830l, Void r2, Integer num) {
            return Integer.valueOf(this.f13888a.m23779s(c5830l) == null ? num.intValue() + 1 : num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SqlPersistenceStorageEngine.java */
    /* renamed from: com.google.firebase.database.p.p$b */
    /* loaded from: classes2.dex */
    public class C5648b implements C5779d.InterfaceC5782c<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ C5779d f13889a;

        /* renamed from: b */
        final /* synthetic */ List f13890b;

        /* renamed from: c */
        final /* synthetic */ C5830l f13891c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC5945n f13892d;

        C5648b(C5646p c5646p, C5779d c5779d, List list, C5830l c5830l, InterfaceC5945n interfaceC5945n) {
            this.f13889a = c5779d;
            this.f13890b = list;
            this.f13891c = c5830l;
            this.f13892d = interfaceC5945n;
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5779d.InterfaceC5782c
        /* renamed from: b */
        public Void mo23405a(C5830l c5830l, Void r4, Void r5) {
            if (this.f13889a.m23779s(c5830l) == null) {
                this.f13890b.add(new C5785g(this.f13891c.m23593I(c5830l), this.f13892d.mo23220B(c5830l)));
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SqlPersistenceStorageEngine.java */
    /* renamed from: com.google.firebase.database.p.p$c */
    /* loaded from: classes2.dex */
    public static class C5649c extends SQLiteOpenHelper {
        public C5649c(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        }

        /* renamed from: c */
        private void m24259c(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C5795m.m23744g(i2 == 2, "Why is onUpgrade() called with a different version?");
            if (i <= 1) {
                m24259c(sQLiteDatabase, "serverCache");
                sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
                m24259c(sQLiteDatabase, "complete");
                sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
                return;
            }
            throw new AssertionError("We don't handle upgrading to " + i2);
        }
    }

    public C5646p(Context context, C5743g c5743g, String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            this.f13885b = c5743g.m23924p("Persistence");
            this.f13884a = m24263y(context, encode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: A */
    private static String m24281A(String str) {
        C5795m.m23744g(str.endsWith("/"), "Path keys must end with a '/'");
        return str.substring(0, str.length() - 1) + '0';
    }

    /* renamed from: B */
    private static String m24280B(C5830l c5830l) {
        if (c5830l.isEmpty()) {
            return "/";
        }
        return c5830l.toString() + "/";
    }

    /* renamed from: C */
    private void m24279C(C5830l c5830l, C5830l c5830l2, C5779d<Long> c5779d, C5779d<Long> c5779d2, C5760g c5760g, List<C5785g<C5830l, InterfaceC5945n>> list) {
        if (c5779d.getValue() != null) {
            int intValue = ((Integer) c5760g.m23854b(0, new C5647a(this, c5779d2))).intValue();
            if (intValue > 0) {
                C5830l m23593I = c5830l.m23593I(c5830l2);
                if (this.f13885b.m23362f()) {
                    this.f13885b.m23366b(String.format(Locale.US, "Need to rewrite %d nodes below path %s", Integer.valueOf(intValue), m23593I), new Object[0]);
                }
                c5760g.m23854b(null, new C5648b(this, c5779d2, list, c5830l2, m24265w(m23593I)));
                return;
            }
            return;
        }
        Iterator<Map.Entry<C5921b, C5779d<Long>>> it = c5779d.m23795E().iterator();
        while (it.hasNext()) {
            Map.Entry<C5921b, C5779d<Long>> next = it.next();
            C5921b key = next.getKey();
            m24279C(c5830l, c5830l2.m23592J(key), next.getValue(), c5779d2.m23778u(key), c5760g.m23855a(next.getKey()), list);
        }
    }

    /* renamed from: D */
    private int m24278D(String str, C5830l c5830l) {
        String m24280B = m24280B(c5830l);
        return this.f13884a.delete(str, "path >= ? AND path < ?", new String[]{m24280B, m24281A(m24280B)});
    }

    /* renamed from: E */
    private int m24277E(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        long m23774b = C5783e.m23774b(interfaceC5945n);
        if ((interfaceC5945n instanceof C5924c) && m23774b > 16384) {
            int i = 0;
            if (this.f13885b.m23362f()) {
                this.f13885b.m23366b(String.format(Locale.US, "Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", c5830l, Long.valueOf(m23774b), 16384), new Object[0]);
            }
            for (C5944m c5944m : interfaceC5945n) {
                i += m24277E(c5830l.m23592J(c5944m.m23222c()), c5944m.m23221d());
            }
            if (!interfaceC5945n.mo23208x().isEmpty()) {
                m24276F(c5830l.m23592J(C5921b.m23293j()), interfaceC5945n.mo23208x());
                i++;
            }
            m24276F(c5830l, C5936g.m23249P());
            return i + 1;
        }
        m24276F(c5830l, interfaceC5945n);
        return 1;
    }

    /* renamed from: F */
    private void m24276F(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        byte[] m24274H = m24274H(interfaceC5945n.mo23215W(true));
        if (m24274H.length >= 262144) {
            List<byte[]> m24273I = m24273I(m24274H, 262144);
            if (this.f13885b.m23362f()) {
                C5899c c5899c = this.f13885b;
                c5899c.m23366b("Saving huge leaf node with " + m24273I.size() + " parts.", new Object[0]);
            }
            for (int i = 0; i < m24273I.size(); i++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("path", m24262z(c5830l, i));
                contentValues.put("value", m24273I.get(i));
                this.f13884a.insertWithOnConflict("serverCache", null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("path", m24280B(c5830l));
        contentValues2.put("value", m24274H);
        this.f13884a.insertWithOnConflict("serverCache", null, contentValues2, 5);
    }

    /* renamed from: G */
    private void m24275G(C5830l c5830l, long j, String str, byte[] bArr) {
        m24270L();
        this.f13884a.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        if (bArr.length >= 262144) {
            List<byte[]> m24273I = m24273I(bArr, 262144);
            for (int i = 0; i < m24273I.size(); i++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", Long.valueOf(j));
                contentValues.put("path", m24280B(c5830l));
                contentValues.put("type", str);
                contentValues.put("part", Integer.valueOf(i));
                contentValues.put("node", m24273I.get(i));
                this.f13884a.insertWithOnConflict("writes", null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("id", Long.valueOf(j));
        contentValues2.put("path", m24280B(c5830l));
        contentValues2.put("type", str);
        contentValues2.put("part", (Integer) null);
        contentValues2.put("node", bArr);
        this.f13884a.insertWithOnConflict("writes", null, contentValues2, 5);
    }

    /* renamed from: H */
    private byte[] m24274H(Object obj) {
        try {
            return C5957b.m23177d(obj).getBytes(f13883e);
        } catch (IOException e) {
            throw new RuntimeException("Could not serialize leaf node", e);
        }
    }

    /* renamed from: I */
    private static List<byte[]> m24273I(byte[] bArr, int i) {
        int length = ((bArr.length - 1) / i) + 1;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * i;
            int min = Math.min(i, bArr.length - i3);
            byte[] bArr2 = new byte[min];
            System.arraycopy(bArr, i3, bArr2, 0, min);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    /* renamed from: J */
    private int m24272J(C5830l c5830l, List<String> list, int i) {
        int i2 = i + 1;
        String m24280B = m24280B(c5830l);
        if (list.get(i).startsWith(m24280B)) {
            while (i2 < list.size() && list.get(i2).equals(m24262z(c5830l, i2 - i))) {
                i2++;
            }
            if (i2 < list.size()) {
                if (list.get(i2).startsWith(m24280B + ".part-")) {
                    throw new IllegalStateException("Run did not finish with all parts");
                }
            }
            return i2 - i;
        }
        throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
    }

    /* renamed from: K */
    private void m24271K(C5830l c5830l, InterfaceC5945n interfaceC5945n, boolean z) {
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (!z) {
            i2 = m24278D("serverCache", c5830l);
            i = m24277E(c5830l, interfaceC5945n);
        } else {
            int i3 = 0;
            int i4 = 0;
            for (C5944m c5944m : interfaceC5945n) {
                i4 += m24278D("serverCache", c5830l.m23592J(c5944m.m23222c()));
                i3 += m24277E(c5830l.m23592J(c5944m.m23222c()), c5944m.m23221d());
            }
            i = i3;
            i2 = i4;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", Integer.valueOf(i), Integer.valueOf(i2), c5830l.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    /* renamed from: L */
    private void m24270L() {
        C5795m.m23744g(this.f13886c, "Transaction expected to already be in progress.");
    }

    /* renamed from: s */
    private static String m24269s(C5830l c5830l, String[] strArr) {
        int i = 0;
        C5795m.m23745f(strArr.length >= c5830l.size() + 1);
        StringBuilder sb = new StringBuilder("(");
        while (!c5830l.isEmpty()) {
            sb.append("path");
            sb.append(" = ? OR ");
            strArr[i] = m24280B(c5830l);
            c5830l = c5830l.m23586b0();
            i++;
        }
        sb.append("path");
        sb.append(" = ?)");
        strArr[i] = m24280B(C5830l.m23588X());
        return sb.toString();
    }

    /* renamed from: t */
    private String m24268t(Collection<Long> collection) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Long l : collection) {
            long longValue = l.longValue();
            if (!z) {
                sb.append(",");
            }
            z = false;
            sb.append(longValue);
        }
        return sb.toString();
    }

    /* renamed from: u */
    private InterfaceC5945n m24267u(byte[] bArr) {
        try {
            return C5948o.m23207a(C5957b.m23179b(new String(bArr, f13883e)));
        } catch (IOException e) {
            String str = new String(bArr, f13883e);
            throw new RuntimeException("Could not deserialize node: " + str, e);
        }
    }

    /* renamed from: v */
    private byte[] m24266v(List<byte[]> list) {
        int i = 0;
        for (byte[] bArr : list) {
            i += bArr.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : list) {
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 += bArr3.length;
        }
        return bArr2;
    }

    /* renamed from: w */
    private InterfaceC5945n m24265w(C5830l c5830l) {
        long j;
        InterfaceC5945n m24267u;
        C5830l c5830l2;
        int i;
        C5830l c5830l3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor m24264x = m24264x(c5830l, new String[]{"path", "value"});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (m24264x.moveToNext()) {
            try {
                arrayList.add(m24264x.getString(0));
                arrayList2.add(m24264x.getBlob(1));
            } catch (Throwable th) {
                m24264x.close();
                throw th;
            }
        }
        m24264x.close();
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        InterfaceC5945n m23249P = C5936g.m23249P();
        HashMap hashMap = new HashMap();
        int i2 = 0;
        boolean z = false;
        while (true) {
            long j2 = currentTimeMillis4;
            if (i2 < arrayList2.size()) {
                if (arrayList.get(i2).endsWith(".part-0000")) {
                    String str = arrayList.get(i2);
                    j = currentTimeMillis2;
                    C5830l c5830l4 = new C5830l(str.substring(0, str.length() - 10));
                    int m24272J = m24272J(c5830l4, arrayList, i2);
                    if (this.f13885b.m23362f()) {
                        C5899c c5899c = this.f13885b;
                        c5830l3 = c5830l4;
                        c5899c.m23366b("Loading split node with " + m24272J + " parts.", new Object[0]);
                    } else {
                        c5830l3 = c5830l4;
                    }
                    int i3 = m24272J + i2;
                    m24267u = m24267u(m24266v(arrayList2.subList(i2, i3)));
                    i2 = i3 - 1;
                    c5830l2 = c5830l3;
                } else {
                    j = currentTimeMillis2;
                    m24267u = m24267u((byte[]) arrayList2.get(i2));
                    c5830l2 = new C5830l(arrayList.get(i2));
                }
                if (c5830l2.m23589V() != null && c5830l2.m23589V().m23292p()) {
                    hashMap.put(c5830l2, m24267u);
                } else if (c5830l2.m23590P(c5830l)) {
                    C5795m.m23744g(!z, "Descendants of path must come after ancestors.");
                    m23249P = m24267u.mo23220B(C5830l.m23585d0(c5830l2, c5830l));
                } else if (c5830l.m23590P(c5830l2)) {
                    m23249P = m23249P.mo23218H(C5830l.m23585d0(c5830l, c5830l2), m24267u);
                    i = 1;
                    z = true;
                    i2 += i;
                    currentTimeMillis4 = j2;
                    currentTimeMillis2 = j;
                } else {
                    throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", c5830l2, c5830l));
                }
                i = 1;
                i2 += i;
                currentTimeMillis4 = j2;
                currentTimeMillis2 = j;
            } else {
                long j3 = currentTimeMillis2;
                for (Map.Entry entry : hashMap.entrySet()) {
                    m23249P = m23249P.mo23218H(C5830l.m23585d0(c5830l, (C5830l) entry.getKey()), (InterfaceC5945n) entry.getValue());
                }
                long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
                long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
                if (this.f13885b.m23362f()) {
                    this.f13885b.m23366b(String.format(Locale.US, "Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", Integer.valueOf(arrayList2.size()), Integer.valueOf(C5783e.m23773c(m23249P)), c5830l, Long.valueOf(currentTimeMillis7), Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(currentTimeMillis6)), new Object[0]);
                }
                return m23249P;
            }
        }
    }

    /* renamed from: x */
    private Cursor m24264x(C5830l c5830l, String[] strArr) {
        String m24280B = m24280B(c5830l);
        String m24281A = m24281A(m24280B);
        String[] strArr2 = new String[c5830l.size() + 3];
        String str = m24269s(c5830l, strArr2) + " OR (path > ? AND path < ?)";
        strArr2[c5830l.size() + 1] = m24280B;
        strArr2[c5830l.size() + 2] = m24281A;
        return this.f13884a.query("serverCache", strArr, str, strArr2, null, null, "path");
    }

    /* renamed from: y */
    private SQLiteDatabase m24263y(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new C5649c(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (SQLiteException e) {
            if (e instanceof SQLiteDatabaseLockedException) {
                throw new DatabaseException("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e);
            }
            throw e;
        }
    }

    /* renamed from: z */
    private String m24262z(C5830l c5830l, int i) {
        return m24280B(c5830l) + String.format(Locale.US, ".part-%04d", Integer.valueOf(i));
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: a */
    public void mo23873a(long j) {
        m24270L();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.f13884a.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Deleted %d write(s) with writeId %d in %dms", Integer.valueOf(delete), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: b */
    public void mo23872b(C5830l c5830l, InterfaceC5945n interfaceC5945n, long j) {
        m24270L();
        long currentTimeMillis = System.currentTimeMillis();
        m24275G(c5830l, j, "o", m24274H(interfaceC5945n.mo23215W(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Persisted user overwrite in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    public void beginTransaction() {
        C5795m.m23744g(!this.f13886c, "runInTransaction called when an existing transaction is already in progress.");
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b("Starting transaction.", new Object[0]);
        }
        this.f13884a.beginTransaction();
        this.f13886c = true;
        this.f13887d = System.currentTimeMillis();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: c */
    public void mo23871c(C5830l c5830l, C5737e c5737e, long j) {
        m24270L();
        long currentTimeMillis = System.currentTimeMillis();
        m24275G(c5830l, j, "m", m24274H(c5737e.m23974J(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Persisted user merge in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: d */
    public List<C5895z> mo23870d() {
        byte[] m24266v;
        C5895z c5895z;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f13884a.query("writes", new String[]{"id", "path", "type", "part", "node"}, null, null, null, null, "id, part");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    long j = query.getLong(0);
                    C5830l c5830l = new C5830l(query.getString(1));
                    String string = query.getString(2);
                    if (query.isNull(3)) {
                        m24266v = query.getBlob(4);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            arrayList2.add(query.getBlob(4));
                            if (!query.moveToNext()) {
                                break;
                            }
                        } while (query.getLong(0) == j);
                        query.moveToPrevious();
                        m24266v = m24266v(arrayList2);
                    }
                    Object m23179b = C5957b.m23179b(new String(m24266v, f13883e));
                    if ("o".equals(string)) {
                        c5895z = new C5895z(j, c5830l, C5948o.m23207a(m23179b), true);
                    } else if ("m".equals(string)) {
                        c5895z = new C5895z(j, c5830l, C5737e.m23977E((Map) m23179b));
                    } else {
                        throw new IllegalStateException("Got invalid write type: " + string);
                    }
                    arrayList.add(c5895z);
                } catch (IOException e) {
                    throw new RuntimeException("Failed to load writes", e);
                }
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Loaded %d writes in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: e */
    public void mo23869e(long j) {
        m24270L();
        String valueOf = String.valueOf(j);
        this.f13884a.delete("trackedQueries", "id = ?", new String[]{valueOf});
        this.f13884a.delete("trackedKeys", "id = ?", new String[]{valueOf});
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    public void endTransaction() {
        this.f13884a.endTransaction();
        this.f13886c = false;
        long currentTimeMillis = System.currentTimeMillis() - this.f13887d;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Transaction completed. Elapsed: %dms", Long.valueOf(currentTimeMillis)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: f */
    public Set<C5921b> mo23868f(long j) {
        return mo23865i(Collections.singleton(Long.valueOf(j)));
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: g */
    public void mo23867g(C5830l c5830l, C5737e c5737e) {
        m24270L();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<Map.Entry<C5830l, InterfaceC5945n>> it = c5737e.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry<C5830l, InterfaceC5945n> next = it.next();
            i += m24278D("serverCache", c5830l.m23593I(next.getKey()));
            i2 += m24277E(c5830l.m23593I(next.getKey()), next.getValue());
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", Integer.valueOf(i2), Integer.valueOf(i), c5830l.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: h */
    public InterfaceC5945n mo23866h(C5830l c5830l) {
        return m24265w(c5830l);
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: i */
    public Set<C5921b> mo23865i(Set<Long> set) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f13884a.query(true, "trackedKeys", new String[]{"key"}, "id IN (" + m24268t(set) + ")", null, null, null, null, null);
        HashSet hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                hashSet.add(C5921b.m23296g(query.getString(0)));
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Loaded %d tracked queries keys for tracked queries %s in %dms", Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return hashSet;
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: j */
    public void mo23864j(long j) {
        m24270L();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.FALSE);
        contentValues.put("lastUse", Long.valueOf(j));
        this.f13884a.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Reset active tracked queries in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: k */
    public void mo23863k(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        m24270L();
        m24271K(c5830l, interfaceC5945n, true);
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: l */
    public void mo23862l(long j, Set<C5921b> set) {
        m24270L();
        long currentTimeMillis = System.currentTimeMillis();
        this.f13884a.delete("trackedKeys", "id = ?", new String[]{String.valueOf(j)});
        for (C5921b c5921b : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", c5921b.m23298b());
            this.f13884a.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Set %d tracked query keys for tracked query %d in %dms", Integer.valueOf(set.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: m */
    public void mo23861m(C5764h c5764h) {
        m24270L();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(c5764h.f14185a));
        contentValues.put("path", m24280B(c5764h.f14186b.m23643e()));
        contentValues.put("queryParams", c5764h.f14186b.m23644d().m23648q());
        contentValues.put("lastUse", Long.valueOf(c5764h.f14187c));
        contentValues.put("complete", Boolean.valueOf(c5764h.f14188d));
        contentValues.put("active", Boolean.valueOf(c5764h.f14189e));
        this.f13884a.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Saved new tracked query in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: n */
    public void mo23860n(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        m24270L();
        m24271K(c5830l, interfaceC5945n, false);
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: o */
    public long mo23859o() {
        Cursor rawQuery = this.f13884a.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", "value", "path", "serverCache"), null);
        try {
            if (rawQuery.moveToFirst()) {
                return rawQuery.getLong(0);
            }
            throw new IllegalStateException("Couldn't read database result!");
        } finally {
            rawQuery.close();
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: p */
    public List<C5764h> mo23858p() {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f13884a.query("trackedQueries", new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"}, null, null, null, null, "id");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    arrayList.add(new C5764h(query.getLong(0), C5814i.m23646b(new C5830l(query.getString(1)), C5957b.m23180a(query.getString(2))), query.getLong(3), query.getInt(4) != 0, query.getInt(5) != 0));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Loaded %d tracked queries in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: q */
    public void mo23857q(long j, Set<C5921b> set, Set<C5921b> set2) {
        m24270L();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(j);
        Iterator<C5921b> it = set2.iterator();
        while (it.hasNext()) {
            this.f13884a.delete("trackedKeys", "id = ? AND key = ?", new String[]{valueOf, it.next().m23298b()});
        }
        for (C5921b c5921b : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", c5921b.m23298b());
            this.f13884a.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f13885b.m23362f()) {
            this.f13885b.m23366b(String.format(Locale.US, "Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    /* renamed from: r */
    public void mo23856r(C5830l c5830l, C5760g c5760g) {
        int i;
        int i2;
        if (c5760g.m23851e()) {
            m24270L();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor m24264x = m24264x(c5830l, new String[]{"rowid", "path"});
            C5779d<Long> c5779d = new C5779d<>(null);
            C5779d<Long> c5779d2 = new C5779d<>(null);
            while (m24264x.moveToNext()) {
                long j = m24264x.getLong(0);
                C5830l c5830l2 = new C5830l(m24264x.getString(1));
                if (!c5830l.m23590P(c5830l2)) {
                    C5899c c5899c = this.f13885b;
                    c5899c.m23359i("We are pruning at " + c5830l + " but we have data stored higher up at " + c5830l2 + ". Ignoring.");
                } else {
                    C5830l m23585d0 = C5830l.m23585d0(c5830l, c5830l2);
                    if (c5760g.m23849g(m23585d0)) {
                        c5779d = c5779d.m23790P(m23585d0, Long.valueOf(j));
                    } else if (c5760g.m23850f(m23585d0)) {
                        c5779d2 = c5779d2.m23790P(m23585d0, Long.valueOf(j));
                    } else {
                        C5899c c5899c2 = this.f13885b;
                        c5899c2.m23359i("We are pruning at " + c5830l + " and have data at " + c5830l2 + " that isn't marked for pruning or keeping. Ignoring.");
                    }
                }
            }
            if (c5779d.isEmpty()) {
                i = 0;
                i2 = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                m24279C(c5830l, C5830l.m23588X(), c5779d, c5779d2, c5760g, arrayList);
                Collection<Long> m23787Z = c5779d.m23787Z();
                this.f13884a.delete("serverCache", "rowid IN (" + m24268t(m23787Z) + ")", null);
                for (C5785g<C5830l, InterfaceC5945n> c5785g : arrayList) {
                    m24277E(c5830l.m23593I(c5785g.m23770a()), c5785g.m23769b());
                }
                i = m23787Z.size();
                i2 = arrayList.size();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.f13885b.m23362f()) {
                this.f13885b.m23366b(String.format(Locale.US, "Pruned %d rows with %d nodes resaved in %dms", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(currentTimeMillis2)), new Object[0]);
            }
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5759f
    public void setTransactionSuccessful() {
        this.f13884a.setTransactionSuccessful();
    }
}
