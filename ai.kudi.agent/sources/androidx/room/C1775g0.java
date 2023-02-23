package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p201g.p210b.p211a.p213b.C7504b;
import p201g.p262t.p263a.C8087a;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8101k;
/* compiled from: InvalidationTracker.java */
/* renamed from: androidx.room.g0 */
/* loaded from: classes2.dex */
public class C1775g0 {

    /* renamed from: n */
    private static final String[] f5409n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b */
    final String[] f5411b;

    /* renamed from: c */
    private Map<String, Set<String>> f5412c;

    /* renamed from: e */
    final AbstractC1802o0 f5414e;

    /* renamed from: h */
    volatile InterfaceC8101k f5417h;

    /* renamed from: i */
    private C1777b f5418i;

    /* renamed from: j */
    private final C1773f0 f5419j;

    /* renamed from: l */
    private C1782h0 f5421l;

    /* renamed from: d */
    C1838w f5413d = null;

    /* renamed from: f */
    AtomicBoolean f5415f = new AtomicBoolean(false);

    /* renamed from: g */
    private volatile boolean f5416g = false;

    /* renamed from: k */
    final C7504b<AbstractC1778c, C1779d> f5420k = new C7504b<>();

    /* renamed from: m */
    Runnable f5422m = new RunnableC1776a();

    /* renamed from: a */
    final HashMap<String, Integer> f5410a = new HashMap<>();

    /* compiled from: InvalidationTracker.java */
    /* renamed from: androidx.room.g0$a */
    /* loaded from: classes2.dex */
    class RunnableC1776a implements Runnable {
        RunnableC1776a() {
        }

        /* renamed from: a */
        private Set<Integer> m34517a() {
            HashSet hashSet = new HashSet();
            Cursor query = C1775g0.this.f5414e.query(new C8087a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (query.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(query.getInt(0)));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            if (!hashSet.isEmpty()) {
                C1775g0.this.f5417h.executeUpdateDelete();
            }
            return hashSet;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
            if (r0 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
            r0.m34448b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
            if (r0 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
            if (r1 == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
            if (r1.isEmpty() != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
            r0 = r5.f5423c.f5420k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
            r2 = r5.f5423c.f5420k.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
            if (r2.hasNext() == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
            r2.next().getValue().m34511a(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                androidx.room.g0 r0 = androidx.room.C1775g0.this
                androidx.room.o0 r0 = r0.f5414e
                java.util.concurrent.locks.Lock r0 = r0.getCloseLock()
                r0.lock()
                r1 = 0
                androidx.room.g0 r2 = androidx.room.C1775g0.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r2 = r2.m34532f()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 != 0) goto L21
                r0.unlock()
                androidx.room.g0 r0 = androidx.room.C1775g0.this
                androidx.room.w r0 = r0.f5413d
                if (r0 == 0) goto L20
                r0.m34448b()
            L20:
                return
            L21:
                androidx.room.g0 r2 = androidx.room.C1775g0.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f5415f     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 != 0) goto L3a
                r0.unlock()
                androidx.room.g0 r0 = androidx.room.C1775g0.this
                androidx.room.w r0 = r0.f5413d
                if (r0 == 0) goto L39
                r0.m34448b()
            L39:
                return
            L3a:
                androidx.room.g0 r2 = androidx.room.C1775g0.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                androidx.room.o0 r2 = r2.f5414e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r2 = r2.inTransaction()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 == 0) goto L51
                r0.unlock()
                androidx.room.g0 r0 = androidx.room.C1775g0.this
                androidx.room.w r0 = r0.f5413d
                if (r0 == 0) goto L50
                r0.m34448b()
            L50:
                return
            L51:
                androidx.room.g0 r2 = androidx.room.C1775g0.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                androidx.room.o0 r2 = r2.f5414e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                g.t.a.h r2 = r2.getOpenHelper()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                g.t.a.g r2 = r2.mo16747h0()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r2.beginTransactionNonExclusive()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.Set r1 = r5.m34517a()     // Catch: java.lang.Throwable -> L77
                r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L77
                r2.endTransaction()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r0.unlock()
                androidx.room.g0 r0 = androidx.room.C1775g0.this
                androidx.room.w r0 = r0.f5413d
                if (r0 == 0) goto L92
            L73:
                r0.m34448b()
                goto L92
            L77:
                r3 = move-exception
                r2.endTransaction()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                throw r3     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
            L7c:
                r1 = move-exception
                goto Lc3
            L7e:
                r2 = move-exception
                goto L81
            L80:
                r2 = move-exception
            L81:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L7c
                r0.unlock()
                androidx.room.g0 r0 = androidx.room.C1775g0.this
                androidx.room.w r0 = r0.f5413d
                if (r0 == 0) goto L92
                goto L73
            L92:
                if (r1 == 0) goto Lc2
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto Lc2
                androidx.room.g0 r0 = androidx.room.C1775g0.this
                g.b.a.b.b<androidx.room.g0$c, androidx.room.g0$d> r0 = r0.f5420k
                monitor-enter(r0)
                androidx.room.g0 r2 = androidx.room.C1775g0.this     // Catch: java.lang.Throwable -> Lbf
                g.b.a.b.b<androidx.room.g0$c, androidx.room.g0$d> r2 = r2.f5420k     // Catch: java.lang.Throwable -> Lbf
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lbf
            La7:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lbf
                if (r3 == 0) goto Lbd
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lbf
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lbf
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lbf
                androidx.room.g0$d r3 = (androidx.room.C1775g0.C1779d) r3     // Catch: java.lang.Throwable -> Lbf
                r3.m34511a(r1)     // Catch: java.lang.Throwable -> Lbf
                goto La7
            Lbd:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                goto Lc2
            Lbf:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                throw r1
            Lc2:
                return
            Lc3:
                r0.unlock()
                androidx.room.g0 r0 = androidx.room.C1775g0.this
                androidx.room.w r0 = r0.f5413d
                if (r0 == 0) goto Lcf
                r0.m34448b()
            Lcf:
                goto Ld1
            Ld0:
                throw r1
            Ld1:
                goto Ld0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1775g0.RunnableC1776a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InvalidationTracker.java */
    /* renamed from: androidx.room.g0$b */
    /* loaded from: classes2.dex */
    public static class C1777b {

        /* renamed from: a */
        final long[] f5424a;

        /* renamed from: b */
        final boolean[] f5425b;

        /* renamed from: c */
        final int[] f5426c;

        /* renamed from: d */
        boolean f5427d;

        /* renamed from: e */
        boolean f5428e;

        C1777b(int i) {
            long[] jArr = new long[i];
            this.f5424a = jArr;
            this.f5425b = new boolean[i];
            this.f5426c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(this.f5425b, false);
        }

        /* renamed from: a */
        int[] m34516a() {
            synchronized (this) {
                if (this.f5427d && !this.f5428e) {
                    int length = this.f5424a.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i < length) {
                            boolean z = this.f5424a[i] > 0;
                            if (z != this.f5425b[i]) {
                                int[] iArr = this.f5426c;
                                if (!z) {
                                    i2 = 2;
                                }
                                iArr[i] = i2;
                            } else {
                                this.f5426c[i] = 0;
                            }
                            this.f5425b[i] = z;
                            i++;
                        } else {
                            this.f5428e = true;
                            this.f5427d = false;
                            return this.f5426c;
                        }
                    }
                }
                return null;
            }
        }

        /* renamed from: b */
        boolean m34515b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f5424a[i];
                    this.f5424a[i] = 1 + j;
                    if (j == 0) {
                        this.f5427d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: c */
        boolean m34514c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f5424a[i];
                    this.f5424a[i] = j - 1;
                    if (j == 1) {
                        this.f5427d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: d */
        void m34513d() {
            synchronized (this) {
                this.f5428e = false;
            }
        }

        /* renamed from: e */
        void m34512e() {
            synchronized (this) {
                Arrays.fill(this.f5425b, false);
                this.f5427d = true;
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* renamed from: androidx.room.g0$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1778c {

        /* renamed from: a */
        final String[] f5429a;

        public AbstractC1778c(String[] strArr) {
            this.f5429a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        boolean mo34507a() {
            return false;
        }

        /* renamed from: b */
        public abstract void mo34456b(Set<String> set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InvalidationTracker.java */
    /* renamed from: androidx.room.g0$d */
    /* loaded from: classes2.dex */
    public static class C1779d {

        /* renamed from: a */
        final int[] f5430a;

        /* renamed from: b */
        private final String[] f5431b;

        /* renamed from: c */
        final AbstractC1778c f5432c;

        /* renamed from: d */
        private final Set<String> f5433d;

        C1779d(AbstractC1778c abstractC1778c, int[] iArr, String[] strArr) {
            this.f5432c = abstractC1778c;
            this.f5430a = iArr;
            this.f5431b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(this.f5431b[0]);
                this.f5433d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f5433d = null;
        }

        /* renamed from: a */
        void m34511a(Set<Integer> set) {
            int length = this.f5430a.length;
            Set<String> set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f5430a[i]))) {
                    if (length == 1) {
                        set2 = this.f5433d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f5431b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f5432c.mo34456b(set2);
            }
        }

        /* renamed from: b */
        void m34510b(String[] strArr) {
            Set<String> set = null;
            if (this.f5431b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f5431b[0])) {
                        set = this.f5433d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f5431b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            String str2 = strArr2[i2];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f5432c.mo34456b(set);
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* renamed from: androidx.room.g0$e */
    /* loaded from: classes2.dex */
    static class C1780e extends AbstractC1778c {

        /* renamed from: b */
        final C1775g0 f5434b;

        /* renamed from: c */
        final WeakReference<AbstractC1778c> f5435c;

        C1780e(C1775g0 c1775g0, AbstractC1778c abstractC1778c) {
            super(abstractC1778c.f5429a);
            this.f5434b = c1775g0;
            this.f5435c = new WeakReference<>(abstractC1778c);
        }

        @Override // androidx.room.C1775g0.AbstractC1778c
        /* renamed from: b */
        public void mo34456b(Set<String> set) {
            AbstractC1778c abstractC1778c = this.f5435c.get();
            if (abstractC1778c == null) {
                this.f5434b.m34527k(this);
            } else {
                abstractC1778c.mo34456b(set);
            }
        }
    }

    public C1775g0(AbstractC1802o0 abstractC1802o0, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f5414e = abstractC1802o0;
        this.f5418i = new C1777b(strArr.length);
        this.f5412c = map2;
        this.f5419j = new C1773f0(this.f5414e);
        int length = strArr.length;
        this.f5411b = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f5410a.put(lowerCase, Integer.valueOf(i));
            String str = map.get(strArr[i]);
            if (str != null) {
                this.f5411b[i] = str.toLowerCase(Locale.US);
            } else {
                this.f5411b[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String lowerCase2 = entry.getValue().toLowerCase(Locale.US);
            if (this.f5410a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.f5410a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: c */
    private static void m34535c(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: d */
    private static void m34534d(InterfaceC8093g interfaceC8093g) {
        if (Build.VERSION.SDK_INT >= 16 && interfaceC8093g.isWriteAheadLoggingEnabled()) {
            interfaceC8093g.beginTransactionNonExclusive();
        } else {
            interfaceC8093g.beginTransaction();
        }
    }

    /* renamed from: l */
    private String[] m34526l(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f5412c.containsKey(lowerCase)) {
                hashSet.addAll(this.f5412c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: o */
    private void m34523o(InterfaceC8093g interfaceC8093g, int i) {
        String[] strArr;
        interfaceC8093g.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f5411b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f5409n) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m34535c(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            interfaceC8093g.execSQL(sb.toString());
        }
    }

    /* renamed from: q */
    private void m34521q(InterfaceC8093g interfaceC8093g, int i) {
        String[] strArr;
        String str = this.f5411b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f5409n) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m34535c(sb, str, str2);
            interfaceC8093g.execSQL(sb.toString());
        }
    }

    /* renamed from: t */
    private String[] m34518t(String[] strArr) {
        String[] m34526l = m34526l(strArr);
        for (String str : m34526l) {
            if (!this.f5410a.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return m34526l;
    }

    /* renamed from: a */
    public void m34537a(AbstractC1778c abstractC1778c) {
        C1779d mo18535l;
        String[] m34526l = m34526l(abstractC1778c.f5429a);
        int[] iArr = new int[m34526l.length];
        int length = m34526l.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.f5410a.get(m34526l[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name " + m34526l[i]);
            }
        }
        C1779d c1779d = new C1779d(abstractC1778c, iArr, m34526l);
        synchronized (this.f5420k) {
            mo18535l = this.f5420k.mo18535l(abstractC1778c, c1779d);
        }
        if (mo18535l == null && this.f5418i.m34515b(iArr)) {
            m34520r();
        }
    }

    /* renamed from: b */
    public void m34536b(AbstractC1778c abstractC1778c) {
        m34537a(new C1780e(this, abstractC1778c));
    }

    /* renamed from: e */
    public <T> LiveData<T> m34533e(String[] strArr, boolean z, Callable<T> callable) {
        return this.f5419j.m34540a(m34518t(strArr), z, callable);
    }

    /* renamed from: f */
    boolean m34532f() {
        if (this.f5414e.isOpen()) {
            if (!this.f5416g) {
                this.f5414e.getOpenHelper().mo16747h0();
            }
            if (this.f5416g) {
                return true;
            }
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m34531g(InterfaceC8093g interfaceC8093g) {
        synchronized (this) {
            if (this.f5416g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            interfaceC8093g.execSQL("PRAGMA temp_store = MEMORY;");
            interfaceC8093g.execSQL("PRAGMA recursive_triggers='ON';");
            interfaceC8093g.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m34519s(interfaceC8093g);
            this.f5417h = interfaceC8093g.mo16753L("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f5416g = true;
        }
    }

    /* renamed from: h */
    public void m34530h(String... strArr) {
        synchronized (this.f5420k) {
            Iterator<Map.Entry<AbstractC1778c, C1779d>> it = this.f5420k.iterator();
            while (it.hasNext()) {
                Map.Entry<AbstractC1778c, C1779d> next = it.next();
                if (!next.getKey().mo34507a()) {
                    next.getValue().m34510b(strArr);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m34529i() {
        synchronized (this) {
            this.f5416g = false;
            this.f5418i.m34512e();
        }
    }

    /* renamed from: j */
    public void m34528j() {
        if (this.f5415f.compareAndSet(false, true)) {
            C1838w c1838w = this.f5413d;
            if (c1838w != null) {
                c1838w.m34445e();
            }
            this.f5414e.getQueryExecutor().execute(this.f5422m);
        }
    }

    /* renamed from: k */
    public void m34527k(AbstractC1778c abstractC1778c) {
        C1779d mo18534m;
        synchronized (this.f5420k) {
            mo18534m = this.f5420k.mo18534m(abstractC1778c);
        }
        if (mo18534m == null || !this.f5418i.m34514c(mo18534m.f5430a)) {
            return;
        }
        m34520r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m34525m(C1838w c1838w) {
        this.f5413d = c1838w;
        c1838w.m34442h(new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                C1775g0.this.m34529i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m34524n(Context context, String str) {
        this.f5421l = new C1782h0(context, str, this, this.f5414e.getQueryExecutor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m34522p() {
        C1782h0 c1782h0 = this.f5421l;
        if (c1782h0 != null) {
            c1782h0.m34509a();
            this.f5421l = null;
        }
    }

    /* renamed from: r */
    void m34520r() {
        if (this.f5414e.isOpen()) {
            m34519s(this.f5414e.getOpenHelper().mo16747h0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m34519s(InterfaceC8093g interfaceC8093g) {
        if (interfaceC8093g.inTransaction()) {
            return;
        }
        while (true) {
            try {
                Lock closeLock = this.f5414e.getCloseLock();
                closeLock.lock();
                try {
                    int[] m34516a = this.f5418i.m34516a();
                    if (m34516a == null) {
                        return;
                    }
                    int length = m34516a.length;
                    m34534d(interfaceC8093g);
                    for (int i = 0; i < length; i++) {
                        int i2 = m34516a[i];
                        if (i2 == 1) {
                            m34523o(interfaceC8093g, i);
                        } else if (i2 == 2) {
                            m34521q(interfaceC8093g, i);
                        }
                    }
                    interfaceC8093g.setTransactionSuccessful();
                    interfaceC8093g.endTransaction();
                    this.f5418i.m34513d();
                } finally {
                    closeLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }
}
