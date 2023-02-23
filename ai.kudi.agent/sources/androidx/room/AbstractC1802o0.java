package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.p062y0.AbstractC1850b;
import androidx.room.p062y0.InterfaceC1849a;
import androidx.room.p063z0.C1856e;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p201g.p210b.p211a.p212a.C7498a;
import p201g.p210b.p211a.p214c.InterfaceC7511a;
import p201g.p262t.p263a.C8087a;
import p201g.p262t.p263a.C8089c;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8094h;
import p201g.p262t.p263a.InterfaceC8100j;
import p201g.p262t.p263a.InterfaceC8101k;
import p201g.p262t.p263a.p264l.C8108c;
/* compiled from: RoomDatabase.java */
/* renamed from: androidx.room.o0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1802o0 {
    private static final String DB_IMPL_SUFFIX = "_Impl";
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;
    private C1838w mAutoCloser;
    @Deprecated
    protected List<AbstractC1804b> mCallbacks;
    @Deprecated
    protected volatile InterfaceC8093g mDatabase;
    private InterfaceC8094h mOpenHelper;
    private Executor mQueryExecutor;
    private Executor mTransactionExecutor;
    boolean mWriteAheadLoggingEnabled;
    private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    private final Map<String, Object> mBackingFieldMap = Collections.synchronizedMap(new HashMap());
    private final C1775g0 mInvalidationTracker = createInvalidationTracker();
    private final Map<Class<?>, Object> mTypeConverters = new HashMap();
    protected Map<Class<? extends InterfaceC1849a>, InterfaceC1849a> mAutoMigrationSpecs = new HashMap();

    /* compiled from: RoomDatabase.java */
    /* renamed from: androidx.room.o0$a */
    /* loaded from: classes2.dex */
    public static class C1803a<T extends AbstractC1802o0> {

        /* renamed from: a */
        private final Class<T> f5484a;

        /* renamed from: b */
        private final String f5485b;

        /* renamed from: c */
        private final Context f5486c;

        /* renamed from: d */
        private ArrayList<AbstractC1804b> f5487d;

        /* renamed from: e */
        private AbstractC1807e f5488e;

        /* renamed from: f */
        private InterfaceC1808f f5489f;

        /* renamed from: g */
        private Executor f5490g;

        /* renamed from: h */
        private List<Object> f5491h;

        /* renamed from: i */
        private List<InterfaceC1849a> f5492i;

        /* renamed from: j */
        private Executor f5493j;

        /* renamed from: k */
        private Executor f5494k;

        /* renamed from: l */
        private InterfaceC8094h.InterfaceC8098c f5495l;

        /* renamed from: m */
        private boolean f5496m;

        /* renamed from: o */
        private boolean f5498o;

        /* renamed from: q */
        private boolean f5500q;

        /* renamed from: s */
        private TimeUnit f5502s;

        /* renamed from: u */
        private Set<Integer> f5504u;

        /* renamed from: v */
        private Set<Integer> f5505v;

        /* renamed from: w */
        private String f5506w;

        /* renamed from: x */
        private File f5507x;

        /* renamed from: y */
        private Callable<InputStream> f5508y;

        /* renamed from: r */
        private long f5501r = -1;

        /* renamed from: n */
        private EnumC1805c f5497n = EnumC1805c.AUTOMATIC;

        /* renamed from: p */
        private boolean f5499p = true;

        /* renamed from: t */
        private final C1806d f5503t = new C1806d();

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1803a(Context context, Class<T> cls, String str) {
            this.f5486c = context;
            this.f5484a = cls;
            this.f5485b = str;
        }

        /* renamed from: a */
        public C1803a<T> m34489a(AbstractC1850b... abstractC1850bArr) {
            if (this.f5505v == null) {
                this.f5505v = new HashSet();
            }
            for (AbstractC1850b abstractC1850b : abstractC1850bArr) {
                this.f5505v.add(Integer.valueOf(abstractC1850b.startVersion));
                this.f5505v.add(Integer.valueOf(abstractC1850b.endVersion));
            }
            this.f5503t.m34481b(abstractC1850bArr);
            return this;
        }

        /* renamed from: b */
        public T m34488b() {
            Executor executor;
            if (this.f5486c != null) {
                if (this.f5484a != null) {
                    if (this.f5493j == null && this.f5494k == null) {
                        Executor m18548e = C7498a.m18548e();
                        this.f5494k = m18548e;
                        this.f5493j = m18548e;
                    } else {
                        Executor executor2 = this.f5493j;
                        if (executor2 != null && this.f5494k == null) {
                            this.f5494k = executor2;
                        } else if (this.f5493j == null && (executor = this.f5494k) != null) {
                            this.f5493j = executor;
                        }
                    }
                    Set<Integer> set = this.f5505v;
                    if (set != null && this.f5504u != null) {
                        for (Integer num : set) {
                            if (this.f5504u.contains(num)) {
                                throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                            }
                        }
                    }
                    C1848y c1848y = this.f5495l;
                    if (c1848y == null) {
                        c1848y = new C8108c();
                    }
                    long j = this.f5501r;
                    if (j > 0) {
                        if (this.f5485b != null) {
                            c1848y = new C1848y(c1848y, new C1838w(j, this.f5502s, this.f5494k));
                        } else {
                            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                        }
                    }
                    if (this.f5506w != null || this.f5507x != null || this.f5508y != null) {
                        if (this.f5485b == null) {
                            throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                        }
                        if ((this.f5506w == null ? 0 : 1) + (this.f5507x == null ? 0 : 1) + (this.f5508y != null ? 1 : 0) == 1) {
                            c1848y = new C1837v0(this.f5506w, this.f5507x, this.f5508y, c1848y);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                        }
                    }
                    InterfaceC1808f interfaceC1808f = this.f5489f;
                    C1794k0 c1794k0 = interfaceC1808f != null ? new C1794k0(c1848y, interfaceC1808f, this.f5490g) : c1848y;
                    Context context = this.f5486c;
                    C1851z c1851z = new C1851z(context, this.f5485b, c1794k0, this.f5503t, this.f5487d, this.f5496m, this.f5497n.m34483b(context), this.f5493j, this.f5494k, this.f5498o, this.f5499p, this.f5500q, this.f5504u, this.f5506w, this.f5507x, this.f5508y, this.f5488e, this.f5491h, this.f5492i);
                    T t = (T) C1800n0.m34492b(this.f5484a, AbstractC1802o0.DB_IMPL_SUFFIX);
                    t.init(c1851z);
                    return t;
                }
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
    }

    /* compiled from: RoomDatabase.java */
    /* renamed from: androidx.room.o0$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1804b {
        /* renamed from: a */
        public void m34487a(InterfaceC8093g interfaceC8093g) {
        }

        /* renamed from: b */
        public void m34486b(InterfaceC8093g interfaceC8093g) {
        }

        /* renamed from: c */
        public void m34485c(InterfaceC8093g interfaceC8093g) {
        }
    }

    /* compiled from: RoomDatabase.java */
    /* renamed from: androidx.room.o0$c */
    /* loaded from: classes2.dex */
    public enum EnumC1805c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: a */
        private static boolean m34484a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return C8089c.m16772b(activityManager);
            }
            return false;
        }

        /* renamed from: b */
        EnumC1805c m34483b(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT >= 16 && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && !m34484a(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* compiled from: RoomDatabase.java */
    /* renamed from: androidx.room.o0$d */
    /* loaded from: classes2.dex */
    public static class C1806d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, AbstractC1850b>> f5513a = new HashMap<>();

        /* renamed from: a */
        private void m34482a(AbstractC1850b abstractC1850b) {
            int i = abstractC1850b.startVersion;
            int i2 = abstractC1850b.endVersion;
            TreeMap<Integer, AbstractC1850b> treeMap = this.f5513a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f5513a.put(Integer.valueOf(i), treeMap);
            }
            AbstractC1850b abstractC1850b2 = treeMap.get(Integer.valueOf(i2));
            if (abstractC1850b2 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC1850b2 + " with " + abstractC1850b);
            }
            treeMap.put(Integer.valueOf(i2), abstractC1850b);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.util.List<androidx.room.p062y0.AbstractC1850b> m34479d(java.util.List<androidx.room.p062y0.AbstractC1850b> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L5a
                goto L7
            L5:
                if (r9 <= r10) goto L5a
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.y0.b>> r0 = r6.f5513a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L56
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = 1
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                androidx.room.y0.b r9 = (androidx.room.p062y0.AbstractC1850b) r9
                r7.add(r9)
                r9 = r3
                goto L57
            L56:
                r4 = 0
            L57:
                if (r4 != 0) goto L0
                return r1
            L5a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.AbstractC1802o0.C1806d.m34479d(java.util.List, boolean, int, int):java.util.List");
        }

        /* renamed from: b */
        public void m34481b(AbstractC1850b... abstractC1850bArr) {
            for (AbstractC1850b abstractC1850b : abstractC1850bArr) {
                m34482a(abstractC1850b);
            }
        }

        /* renamed from: c */
        public List<AbstractC1850b> m34480c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m34479d(new ArrayList(), i2 > i, i, i2);
        }

        /* renamed from: e */
        public Map<Integer, Map<Integer, AbstractC1850b>> m34478e() {
            return Collections.unmodifiableMap(this.f5513a);
        }
    }

    /* compiled from: RoomDatabase.java */
    /* renamed from: androidx.room.o0$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1807e {
        /* renamed from: a */
        public abstract void m34477a(InterfaceC8093g interfaceC8093g);
    }

    /* compiled from: RoomDatabase.java */
    /* renamed from: androidx.room.o0$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC1808f {
        /* renamed from: a */
        void m34476a(String str, List<Object> list);
    }

    private void internalBeginTransaction() {
        assertNotMainThread();
        InterfaceC8093g mo16747h0 = this.mOpenHelper.mo16747h0();
        this.mInvalidationTracker.m34519s(mo16747h0);
        if (Build.VERSION.SDK_INT >= 16 && mo16747h0.isWriteAheadLoggingEnabled()) {
            mo16747h0.beginTransactionNonExclusive();
        } else {
            mo16747h0.beginTransaction();
        }
    }

    private void internalEndTransaction() {
        this.mOpenHelper.mo16747h0().endTransaction();
        if (inTransaction()) {
            return;
        }
        this.mInvalidationTracker.m34528j();
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T unwrapOpenHelper(Class<T> cls, InterfaceC8094h interfaceC8094h) {
        if (cls.isInstance(interfaceC8094h)) {
            return interfaceC8094h;
        }
        if (interfaceC8094h instanceof InterfaceC1759a0) {
            return (T) unwrapOpenHelper(cls, ((InterfaceC1759a0) interfaceC8094h).mo34441c());
        }
        return null;
    }

    /* renamed from: a */
    public /* synthetic */ Object m34491a(InterfaceC8093g interfaceC8093g) {
        internalBeginTransaction();
        return null;
    }

    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* renamed from: b */
    public /* synthetic */ Object m34490b(InterfaceC8093g interfaceC8093g) {
        internalEndTransaction();
        return null;
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        C1838w c1838w = this.mAutoCloser;
        if (c1838w == null) {
            internalBeginTransaction();
        } else {
            c1838w.m34447c(new InterfaceC7511a() { // from class: androidx.room.s
                @Override // p201g.p210b.p211a.p214c.InterfaceC7511a
                /* renamed from: a */
                public final Object mo18527a(Object obj) {
                    return AbstractC1802o0.this.m34491a((InterfaceC8093g) obj);
                }
            });
        }
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            writeLock.lock();
            try {
                this.mInvalidationTracker.m34522p();
                this.mOpenHelper.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public InterfaceC8101k compileStatement(String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.mo16747h0().mo16753L(str);
    }

    protected abstract C1775g0 createInvalidationTracker();

    protected abstract InterfaceC8094h createOpenHelper(C1851z c1851z);

    @Deprecated
    public void endTransaction() {
        C1838w c1838w = this.mAutoCloser;
        if (c1838w == null) {
            internalEndTransaction();
        } else {
            c1838w.m34447c(new InterfaceC7511a() { // from class: androidx.room.t
                @Override // p201g.p210b.p211a.p214c.InterfaceC7511a
                /* renamed from: a */
                public final Object mo18527a(Object obj) {
                    return AbstractC1802o0.this.m34490b((InterfaceC8093g) obj);
                }
            });
        }
    }

    public List<AbstractC1850b> getAutoMigrations(Map<Class<? extends InterfaceC1849a>, InterfaceC1849a> map) {
        return Collections.emptyList();
    }

    Map<String, Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    public C1775g0 getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public InterfaceC8094h getOpenHelper() {
        return this.mOpenHelper;
    }

    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    public Set<Class<? extends InterfaceC1849a>> getRequiredAutoMigrationSpecs() {
        return Collections.emptySet();
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return Collections.emptyMap();
    }

    ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        return (T) this.mTypeConverters.get(cls);
    }

    public boolean inTransaction() {
        return this.mOpenHelper.mo16747h0().inTransaction();
    }

    public void init(C1851z c1851z) {
        boolean z;
        this.mOpenHelper = createOpenHelper(c1851z);
        Set<Class<? extends InterfaceC1849a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends InterfaceC1849a>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class<? extends InterfaceC1849a> next = it.next();
                int size = c1851z.f5612h.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (next.isAssignableFrom(c1851z.f5612h.get(size).getClass())) {
                        bitSet.set(size);
                        i = size;
                        break;
                    } else {
                        size--;
                    }
                }
                if (i >= 0) {
                    this.mAutoMigrationSpecs.put(next, c1851z.f5612h.get(i));
                } else {
                    throw new IllegalArgumentException("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.");
                }
            } else {
                for (int size2 = c1851z.f5612h.size() - 1; size2 >= 0; size2--) {
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                Iterator<AbstractC1850b> it2 = getAutoMigrations(this.mAutoMigrationSpecs).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC1850b next2 = it2.next();
                    if (!c1851z.f5608d.m34478e().containsKey(Integer.valueOf(next2.startVersion))) {
                        c1851z.f5608d.m34481b(next2);
                    }
                }
                C1834u0 c1834u0 = (C1834u0) unwrapOpenHelper(C1834u0.class, this.mOpenHelper);
                if (c1834u0 != null) {
                    c1834u0.m34453I(c1851z);
                }
                C1842x c1842x = (C1842x) unwrapOpenHelper(C1842x.class, this.mOpenHelper);
                if (c1842x != null) {
                    C1838w m34440g = c1842x.m34440g();
                    this.mAutoCloser = m34440g;
                    this.mInvalidationTracker.m34525m(m34440g);
                }
                if (Build.VERSION.SDK_INT >= 16) {
                    z = c1851z.f5614j == EnumC1805c.WRITE_AHEAD_LOGGING;
                    this.mOpenHelper.setWriteAheadLoggingEnabled(z);
                }
                this.mCallbacks = c1851z.f5609e;
                this.mQueryExecutor = c1851z.f5615k;
                this.mTransactionExecutor = new ExecutorC1846x0(c1851z.f5616l);
                this.mAllowMainThreadQueries = c1851z.f5613i;
                this.mWriteAheadLoggingEnabled = z;
                if (c1851z.f5617m) {
                    this.mInvalidationTracker.m34524n(c1851z.f5606b, c1851z.f5607c);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = c1851z.f5611g.size() - 1;
                        while (true) {
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            } else if (cls.isAssignableFrom(c1851z.f5611g.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                size3--;
                            }
                        }
                        if (size3 >= 0) {
                            this.mTypeConverters.put(cls, c1851z.f5611g.get(size3));
                        } else {
                            throw new IllegalArgumentException("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                        }
                    }
                }
                for (int size4 = c1851z.f5611g.size() - 1; size4 >= 0; size4--) {
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + c1851z.f5611g.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void internalInitInvalidationTracker(InterfaceC8093g interfaceC8093g) {
        this.mInvalidationTracker.m34531g(interfaceC8093g);
    }

    public boolean isOpen() {
        C1838w c1838w = this.mAutoCloser;
        if (c1838w != null) {
            return c1838w.m34443g();
        }
        InterfaceC8093g interfaceC8093g = this.mDatabase;
        return interfaceC8093g != null && interfaceC8093g.isOpen();
    }

    public Cursor query(String str, Object[] objArr) {
        return this.mOpenHelper.mo16747h0().mo16754B0(new C8087a(str, objArr));
    }

    public void runInTransaction(Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.mo16747h0().setTransactionSuccessful();
    }

    public Cursor query(InterfaceC8100j interfaceC8100j) {
        return query(interfaceC8100j, (CancellationSignal) null);
    }

    public Cursor query(InterfaceC8100j interfaceC8100j, CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null && Build.VERSION.SDK_INT >= 16) {
            return this.mOpenHelper.mo16747h0().mo16752T(interfaceC8100j, cancellationSignal);
        }
        return this.mOpenHelper.mo16747h0().mo16754B0(interfaceC8100j);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        beginTransaction();
        try {
            try {
                V call = callable.call();
                setTransactionSuccessful();
                return call;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                C1856e.m34416a(e2);
                throw null;
            }
        } finally {
            endTransaction();
        }
    }
}
