package p272h.p286c.p287a.p288a.p289i.p290a0.p291j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.InterfaceC2676a;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.p289i.AbstractC8342j;
import p272h.p286c.p287a.p288a.p289i.AbstractC8352p;
import p272h.p286c.p287a.p288a.p289i.C8341i;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
import p272h.p286c.p287a.p288a.p289i.p293c0.C8329a;
import p272h.p286c.p287a.p288a.p289i.p294w.InterfaceC8361a;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8366a;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8368b;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8370c;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8373d;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8375e;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8377f;
import p272h.p286c.p287a.p288a.p289i.p298y.C8379a;
/* compiled from: SQLiteEventStore.java */
/* renamed from: h.c.a.a.i.a0.j.q0 */
/* loaded from: classes2.dex */
public class C8292q0 implements InterfaceC8272i0, InterfaceC2676a, InterfaceC8270h0 {

    /* renamed from: x */
    private static final C8236b f19890x = C8236b.m16444b("proto");

    /* renamed from: c */
    private final C8300s0 f19891c;

    /* renamed from: d */
    private final InterfaceC8318a f19892d;

    /* renamed from: e */
    private final InterfaceC8318a f19893e;

    /* renamed from: f */
    private final AbstractC8274j0 f19894f;

    /* renamed from: w */
    private final InterfaceC8361a<String> f19895w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SQLiteEventStore.java */
    /* renamed from: h.c.a.a.i.a0.j.q0$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC8294b<T, U> {
        /* renamed from: a */
        U mo16314a(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SQLiteEventStore.java */
    /* renamed from: h.c.a.a.i.a0.j.q0$c */
    /* loaded from: classes2.dex */
    public static class C8295c {

        /* renamed from: a */
        final String f19896a;

        /* renamed from: b */
        final String f19897b;

        private C8295c(String str, String str2) {
            this.f19896a = str;
            this.f19897b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SQLiteEventStore.java */
    /* renamed from: h.c.a.a.i.a0.j.q0$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC8296d<T> {
        /* renamed from: a */
        T mo16329a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8292q0(InterfaceC8318a interfaceC8318a, InterfaceC8318a interfaceC8318a2, AbstractC8274j0 abstractC8274j0, C8300s0 c8300s0, InterfaceC8361a<String> interfaceC8361a) {
        this.f19891c = c8300s0;
        this.f19892d = interfaceC8318a;
        this.f19893e = interfaceC8318a2;
        this.f19894f = abstractC8274j0;
        this.f19895w = interfaceC8361a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public static /* synthetic */ Long m16387A0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public static /* synthetic */ C8377f m16386C0(long j, Cursor cursor) {
        cursor.moveToNext();
        long j2 = cursor.getLong(0);
        C8377f.C8378a m16171c = C8377f.m16171c();
        m16171c.m16168c(j2);
        m16171c.m16169b(j);
        return m16171c.m16170a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public static /* synthetic */ C8377f m16385D0(final long j, SQLiteDatabase sQLiteDatabase) {
        return (C8377f) m16334o1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.o
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.m16386C0(j, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public static /* synthetic */ Long m16384E0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* renamed from: F */
    private C8370c.EnumC8372b m16383F(int i) {
        if (i == C8370c.EnumC8372b.REASON_UNKNOWN.mo16186d()) {
            return C8370c.EnumC8372b.REASON_UNKNOWN;
        }
        if (i == C8370c.EnumC8372b.MESSAGE_TOO_OLD.mo16186d()) {
            return C8370c.EnumC8372b.MESSAGE_TOO_OLD;
        }
        if (i == C8370c.EnumC8372b.CACHE_FULL.mo16186d()) {
            return C8370c.EnumC8372b.CACHE_FULL;
        }
        if (i == C8370c.EnumC8372b.PAYLOAD_TOO_BIG.mo16186d()) {
            return C8370c.EnumC8372b.PAYLOAD_TOO_BIG;
        }
        if (i == C8370c.EnumC8372b.MAX_RETRIES_REACHED.mo16186d()) {
            return C8370c.EnumC8372b.MAX_RETRIES_REACHED;
        }
        if (i == C8370c.EnumC8372b.INVALID_PAYLOD.mo16186d()) {
            return C8370c.EnumC8372b.INVALID_PAYLOD;
        }
        if (i == C8370c.EnumC8372b.SERVER_ERROR.mo16186d()) {
            return C8370c.EnumC8372b.SERVER_ERROR;
        }
        C8379a.m16167a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return C8370c.EnumC8372b.REASON_UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public static /* synthetic */ List m16378H0(SQLiteDatabase sQLiteDatabase) {
        return (List) m16334o1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C8253a.f19835a);
    }

    /* renamed from: I */
    private void m16377I(final SQLiteDatabase sQLiteDatabase) {
        m16339l1(new InterfaceC8296d() { // from class: h.c.a.a.i.a0.j.q
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8296d
            /* renamed from: a */
            public final Object mo16329a() {
                return sQLiteDatabase.beginTransaction();
            }
        }, C8302t.f19916a);
    }

    /* renamed from: J */
    private long m16376J(SQLiteDatabase sQLiteDatabase, AbstractC8352p abstractC8352p) {
        Long m16350f0 = m16350f0(sQLiteDatabase, abstractC8352p);
        if (m16350f0 != null) {
            return m16350f0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC8352p.mo16241b());
        contentValues.put("priority", Integer.valueOf(C8329a.m16294a(abstractC8352p.mo16239d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC8352p.mo16240c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC8352p.mo16240c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public static /* synthetic */ List m16375J0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            AbstractC8352p.AbstractC8353a m16242a = AbstractC8352p.m16242a();
            m16242a.mo16235b(cursor.getString(1));
            m16242a.mo16233d(C8329a.m16293b(cursor.getInt(2)));
            m16242a.mo16234c(m16343i1(cursor.getString(3)));
            arrayList.add(m16242a.mo16236a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public static /* synthetic */ Object m16363U0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C8295c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* renamed from: V */
    private C8368b m16362V() {
        C8368b.C8369a m16195b = C8368b.m16195b();
        C8375e.C8376a m16177c = C8375e.m16177c();
        m16177c.m16175b(m16370O());
        m16177c.m16174c(AbstractC8274j0.f19877a.mo16417f());
        m16195b.m16193b(m16177c.m16176a());
        return m16195b.m16194a();
    }

    /* renamed from: X */
    private long m16360X() {
        return m16369P().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: Z */
    private long m16358Z() {
        return m16369P().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public static /* synthetic */ byte[] m16357Z0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: b0 */
    private C8377f m16356b0() {
        final long mo16295a = this.f19892d.mo16295a();
        return (C8377f) m16347g0(new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.u
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.m16385D0(mo16295a, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e1 */
    public static /* synthetic */ Object m16351e1(String str, C8370c.EnumC8372b enumC8372b, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m16334o1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC8372b.mo16186d())}), C8289p.f19888a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(enumC8372b.mo16186d()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC8372b.mo16186d())});
        }
        return null;
    }

    /* renamed from: f0 */
    private Long m16350f0(SQLiteDatabase sQLiteDatabase, AbstractC8352p abstractC8352p) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC8352p.mo16241b(), String.valueOf(C8329a.m16294a(abstractC8352p.mo16239d()))));
        if (abstractC8352p.mo16240c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC8352p.mo16240c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m16334o1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), C8281m.f19881a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f1 */
    public static /* synthetic */ Object m16349f1(long j, AbstractC8352p abstractC8352p, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC8352p.mo16241b(), String.valueOf(C8329a.m16294a(abstractC8352p.mo16239d()))}) < 1) {
            contentValues.put("backend_name", abstractC8352p.mo16241b());
            contentValues.put("priority", Integer.valueOf(C8329a.m16294a(abstractC8352p.mo16239d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* renamed from: g1 */
    private List<AbstractC8290p0> m16346g1(SQLiteDatabase sQLiteDatabase, final AbstractC8352p abstractC8352p) {
        final ArrayList arrayList = new ArrayList();
        Long m16350f0 = m16350f0(sQLiteDatabase, abstractC8352p);
        if (m16350f0 == null) {
            return arrayList;
        }
        m16334o1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m16350f0.toString()}, null, null, null, String.valueOf(this.f19894f.mo16419d())), new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.h
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.this.m16366Q0(arrayList, abstractC8352p, (Cursor) obj);
            }
        });
        return arrayList;
    }

    /* renamed from: h1 */
    private Map<Long, Set<C8295c>> m16345h1(SQLiteDatabase sQLiteDatabase, List<AbstractC8290p0> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo16389c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m16334o1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.l
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.m16363U0(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    /* renamed from: i0 */
    private boolean m16344i0() {
        return m16360X() * m16358Z() >= this.f19894f.mo16417f();
    }

    /* renamed from: i1 */
    private static byte[] m16343i1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: j1 */
    private void m16342j1(C8366a.C8367a c8367a, Map<String, List<C8370c>> map) {
        for (Map.Entry<String, List<C8370c>> entry : map.entrySet()) {
            C8373d.C8374a m16183c = C8373d.m16183c();
            m16183c.m16180c(entry.getKey());
            m16183c.m16181b(entry.getValue());
            c8367a.m16201a(m16183c.m16182a());
        }
    }

    /* renamed from: k0 */
    private List<AbstractC8290p0> m16341k0(List<AbstractC8290p0> list, Map<Long, Set<C8295c>> map) {
        ListIterator<AbstractC8290p0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC8290p0 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo16389c()))) {
                AbstractC8342j.AbstractC8343a m16274l = next.mo16390b().m16274l();
                for (C8295c c8295c : map.get(Long.valueOf(next.mo16389c()))) {
                    m16274l.m16271c(c8295c.f19896a, c8295c.f19897b);
                }
                listIterator.set(AbstractC8290p0.m16391a(next.mo16389c(), next.mo16388d(), m16274l.mo16270d()));
            }
        }
        return list;
    }

    /* renamed from: k1 */
    private byte[] m16340k1(long j) {
        return (byte[]) m16334o1(m16369P().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), C8276k.f19878a);
    }

    /* renamed from: l1 */
    private <T> T m16339l1(InterfaceC8296d<T> interfaceC8296d, InterfaceC8294b<Throwable, T> interfaceC8294b) {
        long mo16295a = this.f19893e.mo16295a();
        while (true) {
            try {
                return interfaceC8296d.mo16329a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f19893e.mo16295a() >= this.f19894f.mo16421b() + mo16295a) {
                    return interfaceC8294b.mo16314a(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: m1 */
    private static C8236b m16337m1(String str) {
        if (str == null) {
            return f19890x;
        }
        return C8236b.m16444b(str);
    }

    /* renamed from: n1 */
    private static String m16336n1(Iterable<AbstractC8290p0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC8290p0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo16389c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: o1 */
    static <T> T m16334o1(Cursor cursor, InterfaceC8294b<Cursor, T> interfaceC8294b) {
        try {
            return interfaceC8294b.mo16314a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public static /* synthetic */ Object m16331x0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public static /* synthetic */ SQLiteDatabase m16330z0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* renamed from: F0 */
    public /* synthetic */ Boolean m16382F0(AbstractC8352p abstractC8352p, SQLiteDatabase sQLiteDatabase) {
        Long m16350f0 = m16350f0(sQLiteDatabase, abstractC8352p);
        if (m16350f0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m16334o1(m16369P().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m16350f0.toString()}), C8262e0.f19852a);
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0
    /* renamed from: G */
    public int mo16381G() {
        final long mo16295a = this.f19892d.mo16295a() - this.f19894f.mo16420c();
        return ((Integer) m16347g0(new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.n
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.this.m16333u0(mo16295a, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0
    /* renamed from: G0 */
    public AbstractC8290p0 mo16380G0(final AbstractC8352p abstractC8352p, final AbstractC8342j abstractC8342j) {
        C8379a.m16166b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC8352p.mo16239d(), abstractC8342j.mo16276j(), abstractC8352p.mo16241b());
        long longValue = ((Long) m16347g0(new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.j
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.this.m16359X0(abstractC8342j, abstractC8352p, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC8290p0.m16391a(longValue, abstractC8352p, abstractC8342j);
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0
    /* renamed from: H */
    public void mo16379H(Iterable<AbstractC8290p0> iterable) {
        if (iterable.iterator().hasNext()) {
            m16369P().compileStatement("DELETE FROM events WHERE _id in " + m16336n1(iterable)).execute();
        }
    }

    /* renamed from: K0 */
    public /* synthetic */ List m16374K0(AbstractC8352p abstractC8352p, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC8290p0> m16346g1 = m16346g1(sQLiteDatabase, abstractC8352p);
        return m16341k0(m16346g1, m16345h1(sQLiteDatabase, m16346g1));
    }

    /* renamed from: L0 */
    public /* synthetic */ C8366a m16373L0(Map map, C8366a.C8367a c8367a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C8370c.EnumC8372b m16383F = m16383F(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            C8370c.C8371a m16190c = C8370c.m16190c();
            m16190c.m16187c(m16383F);
            m16190c.m16188b(j);
            ((List) map.get(string)).add(m16190c.m16189a());
        }
        m16342j1(c8367a, map);
        c8367a.m16197e(m16356b0());
        c8367a.m16198d(m16362V());
        c8367a.m16199c(this.f19895w.get());
        return c8367a.m16200b();
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0
    /* renamed from: M0 */
    public long mo16372M0(AbstractC8352p abstractC8352p) {
        return ((Long) m16334o1(m16369P().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC8352p.mo16241b(), String.valueOf(C8329a.m16294a(abstractC8352p.mo16239d()))}), C8306w.f19923a)).longValue();
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0
    /* renamed from: N */
    public Iterable<AbstractC8290p0> mo16371N(final AbstractC8352p abstractC8352p) {
        return (Iterable) m16347g0(new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.v
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.this.m16374K0(abstractC8352p, (SQLiteDatabase) obj);
            }
        });
    }

    /* renamed from: O */
    long m16370O() {
        return m16360X() * m16358Z();
    }

    /* renamed from: P */
    SQLiteDatabase m16369P() {
        final C8300s0 c8300s0 = this.f19891c;
        Objects.requireNonNull(c8300s0);
        return (SQLiteDatabase) m16339l1(new InterfaceC8296d() { // from class: h.c.a.a.i.a0.j.d0
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8296d
            /* renamed from: a */
            public final Object mo16329a() {
                return C8300s0.this.getWritableDatabase();
            }
        }, C8297r.f19898a);
    }

    /* renamed from: P0 */
    public /* synthetic */ C8366a m16368P0(String str, final Map map, final C8366a.C8367a c8367a, SQLiteDatabase sQLiteDatabase) {
        return (C8366a) m16334o1(sQLiteDatabase.rawQuery(str, new String[0]), new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.b
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.this.m16373L0(map, c8367a, (Cursor) obj);
            }
        });
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0
    /* renamed from: Q */
    public void mo16367Q(final AbstractC8352p abstractC8352p, final long j) {
        m16347g0(new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.s
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.m16349f1(j, abstractC8352p, (SQLiteDatabase) obj);
            }
        });
    }

    /* renamed from: Q0 */
    public /* synthetic */ Object m16366Q0(List list, AbstractC8352p abstractC8352p, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            AbstractC8342j.AbstractC8343a m16285a = AbstractC8342j.m16285a();
            m16285a.mo16264j(cursor.getString(1));
            m16285a.mo16265i(cursor.getLong(2));
            m16285a.mo16263k(cursor.getLong(3));
            if (z) {
                m16285a.mo16266h(new C8341i(m16337m1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                m16285a.mo16266h(new C8341i(m16337m1(cursor.getString(4)), m16340k1(j)));
            }
            if (!cursor.isNull(6)) {
                m16285a.mo16267g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC8290p0.m16391a(j, abstractC8352p, m16285a.mo16270d()));
        }
        return null;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0
    /* renamed from: T0 */
    public boolean mo16365T0(final AbstractC8352p abstractC8352p) {
        return ((Boolean) m16347g0(new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.c
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.this.m16382F0(abstractC8352p, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0
    /* renamed from: U */
    public Iterable<AbstractC8352p> mo16364U() {
        return (Iterable) m16347g0(C8271i.f19873a);
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0
    /* renamed from: V0 */
    public void mo16361V0(Iterable<AbstractC8290p0> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m16336n1(iterable);
            m16347g0(new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.e
                @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
                /* renamed from: a */
                public final Object mo16314a(Object obj) {
                    return C8292q0.this.m16353c1(str, r3, (SQLiteDatabase) obj);
                }
            });
        }
    }

    /* renamed from: X0 */
    public /* synthetic */ Long m16359X0(AbstractC8342j abstractC8342j, AbstractC8352p abstractC8352p, SQLiteDatabase sQLiteDatabase) {
        if (m16344i0()) {
            mo16338m(1L, C8370c.EnumC8372b.CACHE_FULL, abstractC8342j.mo16276j());
            return -1L;
        }
        long m16376J = m16376J(sQLiteDatabase, abstractC8352p);
        int mo16418e = this.f19894f.mo16418e();
        byte[] m16287a = abstractC8342j.mo16281e().m16287a();
        boolean z = m16287a.length <= mo16418e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m16376J));
        contentValues.put("transport_name", abstractC8342j.mo16276j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC8342j.mo16280f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC8342j.mo16275k()));
        contentValues.put("payload_encoding", abstractC8342j.mo16281e().m16286b().m16445a());
        contentValues.put("code", abstractC8342j.mo16282d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? m16287a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            double length = m16287a.length;
            double d = mo16418e;
            Double.isNaN(length);
            Double.isNaN(d);
            int ceil = (int) Math.ceil(length / d);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(m16287a, (i - 1) * mo16418e, Math.min(i * mo16418e, m16287a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC8342j.m16277i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: b1 */
    public /* synthetic */ Object m16355b1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo16338m(i, C8370c.EnumC8372b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a
    /* renamed from: c */
    public <T> T mo16354c(InterfaceC2676a.InterfaceC2677a<T> interfaceC2677a) {
        SQLiteDatabase m16369P = m16369P();
        m16377I(m16369P);
        try {
            T execute = interfaceC2677a.execute();
            m16369P.setTransactionSuccessful();
            return execute;
        } finally {
            m16369P.endTransaction();
        }
    }

    /* renamed from: c1 */
    public /* synthetic */ Object m16353c1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m16334o1(sQLiteDatabase.rawQuery(str2, null), new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.x
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.this.m16355b1((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19891c.close();
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8270h0
    /* renamed from: g */
    public C8366a mo16348g() {
        final C8366a.C8367a m16203e = C8366a.m16203e();
        final HashMap hashMap = new HashMap();
        return (C8366a) m16347g0(new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.d
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.this.m16368P0(r2, hashMap, m16203e, (SQLiteDatabase) obj);
            }
        });
    }

    /* renamed from: g0 */
    <T> T m16347g0(InterfaceC8294b<SQLiteDatabase, T> interfaceC8294b) {
        SQLiteDatabase m16369P = m16369P();
        m16369P.beginTransaction();
        try {
            T mo16314a = interfaceC8294b.mo16314a(m16369P);
            m16369P.setTransactionSuccessful();
            return mo16314a;
        } finally {
            m16369P.endTransaction();
        }
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8270h0
    /* renamed from: m */
    public void mo16338m(final long j, final C8370c.EnumC8372b enumC8372b, final String str) {
        m16347g0(new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.f
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.m16351e1(str, enumC8372b, j, (SQLiteDatabase) obj);
            }
        });
    }

    /* renamed from: o0 */
    public /* synthetic */ Object m16335o0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo16338m(i, C8370c.EnumC8372b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: u0 */
    public /* synthetic */ Integer m16333u0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m16334o1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new InterfaceC8294b() { // from class: h.c.a.a.i.a0.j.g
            @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0.InterfaceC8294b
            /* renamed from: a */
            public final Object mo16314a(Object obj) {
                return C8292q0.this.m16335o0((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }
}
