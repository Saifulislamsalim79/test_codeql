package p565l.p566g0.p567e;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p565l.p566g0.C14148c;
import p565l.p566g0.p570h.InterfaceC14187a;
import p565l.p566g0.p571i.C14198f;
import p576m.C14353l;
import p576m.InterfaceC14345d;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14364r;
import p576m.InterfaceC14365s;
/* compiled from: DiskLruCache.java */
/* renamed from: l.g0.e.d */
/* loaded from: classes3.dex */
public final class C14157d implements Closeable, Flushable {

    /* renamed from: M */
    static final Pattern f30943M = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: B */
    InterfaceC14345d f30945B;

    /* renamed from: D */
    int f30947D;

    /* renamed from: E */
    boolean f30948E;

    /* renamed from: F */
    boolean f30949F;

    /* renamed from: G */
    boolean f30950G;

    /* renamed from: H */
    boolean f30951H;

    /* renamed from: I */
    boolean f30952I;

    /* renamed from: K */
    private final Executor f30954K;

    /* renamed from: c */
    final InterfaceC14187a f30956c;

    /* renamed from: d */
    final File f30957d;

    /* renamed from: e */
    private final File f30958e;

    /* renamed from: f */
    private final File f30959f;

    /* renamed from: w */
    private final File f30960w;

    /* renamed from: x */
    private final int f30961x;

    /* renamed from: y */
    private long f30962y;

    /* renamed from: z */
    final int f30963z;

    /* renamed from: A */
    private long f30944A = 0;

    /* renamed from: C */
    final LinkedHashMap<String, C14162d> f30946C = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: J */
    private long f30953J = 0;

    /* renamed from: L */
    private final Runnable f30955L = new RunnableC14158a();

    /* compiled from: DiskLruCache.java */
    /* renamed from: l.g0.e.d$a */
    /* loaded from: classes3.dex */
    class RunnableC14158a implements Runnable {
        RunnableC14158a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C14157d.this) {
                if ((!C14157d.this.f30949F) || C14157d.this.f30950G) {
                    return;
                }
                try {
                    C14157d.this.m2751o0();
                } catch (IOException unused) {
                    C14157d.this.f30951H = true;
                }
                try {
                    if (C14157d.this.m2762V()) {
                        C14157d.this.m2755g0();
                        C14157d.this.f30947D = 0;
                    }
                } catch (IOException unused2) {
                    C14157d.this.f30952I = true;
                    C14157d.this.f30945B = C14353l.m2022c(C14353l.m2023b());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: l.g0.e.d$b */
    /* loaded from: classes3.dex */
    public class C14159b extends C14164e {
        C14159b(InterfaceC14364r interfaceC14364r) {
            super(interfaceC14364r);
        }

        @Override // p565l.p566g0.p567e.C14164e
        /* renamed from: c */
        protected void mo2739c(IOException iOException) {
            C14157d.this.f30948E = true;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: l.g0.e.d$c */
    /* loaded from: classes3.dex */
    public final class C14160c {

        /* renamed from: a */
        final C14162d f30966a;

        /* renamed from: b */
        final boolean[] f30967b;

        /* renamed from: c */
        private boolean f30968c;

        /* compiled from: DiskLruCache.java */
        /* renamed from: l.g0.e.d$c$a */
        /* loaded from: classes3.dex */
        class C14161a extends C14164e {
            C14161a(InterfaceC14364r interfaceC14364r) {
                super(interfaceC14364r);
            }

            @Override // p565l.p566g0.p567e.C14164e
            /* renamed from: c */
            protected void mo2739c(IOException iOException) {
                synchronized (C14157d.this) {
                    C14160c.this.m2747c();
                }
            }
        }

        C14160c(C14162d c14162d) {
            this.f30966a = c14162d;
            this.f30967b = c14162d.f30975e ? null : new boolean[C14157d.this.f30963z];
        }

        /* renamed from: a */
        public void m2749a() throws IOException {
            synchronized (C14157d.this) {
                if (!this.f30968c) {
                    if (this.f30966a.f30976f == this) {
                        C14157d.this.m2756g(this, false);
                    }
                    this.f30968c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: b */
        public void m2748b() throws IOException {
            synchronized (C14157d.this) {
                if (!this.f30968c) {
                    if (this.f30966a.f30976f == this) {
                        C14157d.this.m2756g(this, true);
                    }
                    this.f30968c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: c */
        void m2747c() {
            if (this.f30966a.f30976f != this) {
                return;
            }
            int i = 0;
            while (true) {
                C14157d c14157d = C14157d.this;
                if (i < c14157d.f30963z) {
                    try {
                        c14157d.f30956c.delete(this.f30966a.f30974d[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                } else {
                    this.f30966a.f30976f = null;
                    return;
                }
            }
        }

        /* renamed from: d */
        public InterfaceC14364r m2746d(int i) {
            synchronized (C14157d.this) {
                if (!this.f30968c) {
                    if (this.f30966a.f30976f != this) {
                        return C14353l.m2023b();
                    }
                    if (!this.f30966a.f30975e) {
                        this.f30967b[i] = true;
                    }
                    try {
                        return new C14161a(C14157d.this.f30956c.sink(this.f30966a.f30974d[i]));
                    } catch (FileNotFoundException unused) {
                        return C14353l.m2023b();
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: l.g0.e.d$d */
    /* loaded from: classes3.dex */
    public final class C14162d {

        /* renamed from: a */
        final String f30971a;

        /* renamed from: b */
        final long[] f30972b;

        /* renamed from: c */
        final File[] f30973c;

        /* renamed from: d */
        final File[] f30974d;

        /* renamed from: e */
        boolean f30975e;

        /* renamed from: f */
        C14160c f30976f;

        /* renamed from: g */
        long f30977g;

        C14162d(String str) {
            this.f30971a = str;
            int i = C14157d.this.f30963z;
            this.f30972b = new long[i];
            this.f30973c = new File[i];
            this.f30974d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C14157d.this.f30963z; i2++) {
                sb.append(i2);
                this.f30973c[i2] = new File(C14157d.this.f30957d, sb.toString());
                sb.append(".tmp");
                this.f30974d[i2] = new File(C14157d.this.f30957d, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        private IOException m2745a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: b */
        void m2744b(String[] strArr) throws IOException {
            if (strArr.length == C14157d.this.f30963z) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f30972b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        m2745a(strArr);
                        throw null;
                    }
                }
                return;
            }
            m2745a(strArr);
            throw null;
        }

        /* renamed from: c */
        C14163e m2743c() {
            if (Thread.holdsLock(C14157d.this)) {
                InterfaceC14365s[] interfaceC14365sArr = new InterfaceC14365s[C14157d.this.f30963z];
                long[] jArr = (long[]) this.f30972b.clone();
                for (int i = 0; i < C14157d.this.f30963z; i++) {
                    try {
                        interfaceC14365sArr[i] = C14157d.this.f30956c.source(this.f30973c[i]);
                    } catch (FileNotFoundException unused) {
                        for (int i2 = 0; i2 < C14157d.this.f30963z && interfaceC14365sArr[i2] != null; i2++) {
                            C14148c.m2801g(interfaceC14365sArr[i2]);
                        }
                        try {
                            C14157d.this.m2753k0(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new C14163e(this.f30971a, this.f30977g, interfaceC14365sArr, jArr);
            }
            throw new AssertionError();
        }

        /* renamed from: d */
        void m2742d(InterfaceC14345d interfaceC14345d) throws IOException {
            for (long j : this.f30972b) {
                interfaceC14345d.mo2005n(32).mo2010A(j);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: l.g0.e.d$e */
    /* loaded from: classes3.dex */
    public final class C14163e implements Closeable {

        /* renamed from: c */
        private final String f30979c;

        /* renamed from: d */
        private final long f30980d;

        /* renamed from: e */
        private final InterfaceC14365s[] f30981e;

        C14163e(String str, long j, InterfaceC14365s[] interfaceC14365sArr, long[] jArr) {
            this.f30979c = str;
            this.f30980d = j;
            this.f30981e = interfaceC14365sArr;
        }

        /* renamed from: c */
        public C14160c m2741c() throws IOException {
            return C14157d.this.m2765J(this.f30979c, this.f30980d);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InterfaceC14365s interfaceC14365s : this.f30981e) {
                C14148c.m2801g(interfaceC14365s);
            }
        }

        /* renamed from: g */
        public InterfaceC14365s m2740g(int i) {
            return this.f30981e[i];
        }
    }

    C14157d(InterfaceC14187a interfaceC14187a, File file, int i, int i2, long j, Executor executor) {
        this.f30956c = interfaceC14187a;
        this.f30957d = file;
        this.f30961x = i;
        this.f30958e = new File(file, "journal");
        this.f30959f = new File(file, "journal.tmp");
        this.f30960w = new File(file, "journal.bkp");
        this.f30963z = i2;
        this.f30962y = j;
        this.f30954K = executor;
    }

    /* renamed from: X */
    private InterfaceC14345d m2761X() throws FileNotFoundException {
        return C14353l.m2022c(new C14159b(this.f30956c.appendingSink(this.f30958e)));
    }

    /* renamed from: Z */
    private void m2760Z() throws IOException {
        this.f30956c.delete(this.f30959f);
        Iterator<C14162d> it = this.f30946C.values().iterator();
        while (it.hasNext()) {
            C14162d next = it.next();
            int i = 0;
            if (next.f30976f == null) {
                while (i < this.f30963z) {
                    this.f30944A += next.f30972b[i];
                    i++;
                }
            } else {
                next.f30976f = null;
                while (i < this.f30963z) {
                    this.f30956c.delete(next.f30973c[i]);
                    this.f30956c.delete(next.f30974d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: b0 */
    private void m2759b0() throws IOException {
        InterfaceC14346e m2021d = C14353l.m2021d(this.f30956c.source(this.f30958e));
        try {
            String mo1982u = m2021d.mo1982u();
            String mo1982u2 = m2021d.mo1982u();
            String mo1982u3 = m2021d.mo1982u();
            String mo1982u4 = m2021d.mo1982u();
            String mo1982u5 = m2021d.mo1982u();
            if (!"libcore.io.DiskLruCache".equals(mo1982u) || !"1".equals(mo1982u2) || !Integer.toString(this.f30961x).equals(mo1982u3) || !Integer.toString(this.f30963z).equals(mo1982u4) || !"".equals(mo1982u5)) {
                throw new IOException("unexpected journal header: [" + mo1982u + ", " + mo1982u2 + ", " + mo1982u4 + ", " + mo1982u5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m2757f0(m2021d.mo1982u());
                    i++;
                } catch (EOFException unused) {
                    this.f30947D = i - this.f30946C.size();
                    if (!m2021d.mo1987l()) {
                        m2755g0();
                    } else {
                        this.f30945B = m2761X();
                    }
                    C14148c.m2801g(m2021d);
                    return;
                }
            }
        } catch (Throwable th) {
            C14148c.m2801g(m2021d);
            throw th;
        }
    }

    /* renamed from: c */
    private synchronized void m2758c() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: f0 */
    private void m2757f0(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f30946C.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C14162d c14162d = this.f30946C.get(substring);
            if (c14162d == null) {
                c14162d = new C14162d(substring);
                this.f30946C.put(substring, c14162d);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c14162d.f30975e = true;
                c14162d.f30976f = null;
                c14162d.m2744b(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c14162d.f30976f = new C14160c(c14162d);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: m */
    public static C14157d m2752m(InterfaceC14187a interfaceC14187a, File file, int i, int i2, long j) {
        if (j > 0) {
            if (i2 > 0) {
                return new C14157d(interfaceC14187a, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C14148c.m2811G("OkHttp DiskLruCache", true)));
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: u0 */
    private void m2750u0(String str) {
        if (f30943M.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* renamed from: F */
    public void m2767F() throws IOException {
        close();
        this.f30956c.deleteContents(this.f30957d);
    }

    /* renamed from: I */
    public C14160c m2766I(String str) throws IOException {
        return m2765J(str, -1L);
    }

    /* renamed from: J */
    synchronized C14160c m2765J(String str, long j) throws IOException {
        m2763P();
        m2758c();
        m2750u0(str);
        C14162d c14162d = this.f30946C.get(str);
        if (j == -1 || (c14162d != null && c14162d.f30977g == j)) {
            if (c14162d == null || c14162d.f30976f == null) {
                if (!this.f30951H && !this.f30952I) {
                    this.f30945B.mo2003r("DIRTY").mo2005n(32).mo2003r(str).mo2005n(10);
                    this.f30945B.flush();
                    if (this.f30948E) {
                        return null;
                    }
                    if (c14162d == null) {
                        c14162d = new C14162d(str);
                        this.f30946C.put(str, c14162d);
                    }
                    C14160c c14160c = new C14160c(c14162d);
                    c14162d.f30976f = c14160c;
                    return c14160c;
                }
                this.f30954K.execute(this.f30955L);
                return null;
            }
            return null;
        }
        return null;
    }

    /* renamed from: O */
    public synchronized C14163e m2764O(String str) throws IOException {
        m2763P();
        m2758c();
        m2750u0(str);
        C14162d c14162d = this.f30946C.get(str);
        if (c14162d != null && c14162d.f30975e) {
            C14163e m2743c = c14162d.m2743c();
            if (m2743c == null) {
                return null;
            }
            this.f30947D++;
            this.f30945B.mo2003r("READ").mo2005n(32).mo2003r(str).mo2005n(10);
            if (m2762V()) {
                this.f30954K.execute(this.f30955L);
            }
            return m2743c;
        }
        return null;
    }

    /* renamed from: P */
    public synchronized void m2763P() throws IOException {
        if (this.f30949F) {
            return;
        }
        if (this.f30956c.exists(this.f30960w)) {
            if (this.f30956c.exists(this.f30958e)) {
                this.f30956c.delete(this.f30960w);
            } else {
                this.f30956c.rename(this.f30960w, this.f30958e);
            }
        }
        if (this.f30956c.exists(this.f30958e)) {
            try {
                m2759b0();
                m2760Z();
                this.f30949F = true;
                return;
            } catch (IOException e) {
                C14198f m2653j = C14198f.m2653j();
                m2653j.mo2646q(5, "DiskLruCache " + this.f30957d + " is corrupt: " + e.getMessage() + ", removing", e);
                m2767F();
                this.f30950G = false;
            }
        }
        m2755g0();
        this.f30949F = true;
    }

    /* renamed from: V */
    boolean m2762V() {
        int i = this.f30947D;
        return i >= 2000 && i >= this.f30946C.size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        C14162d[] c14162dArr;
        if (this.f30949F && !this.f30950G) {
            for (C14162d c14162d : (C14162d[]) this.f30946C.values().toArray(new C14162d[this.f30946C.size()])) {
                if (c14162d.f30976f != null) {
                    c14162d.f30976f.m2749a();
                }
            }
            m2751o0();
            this.f30945B.close();
            this.f30945B = null;
            this.f30950G = true;
            return;
        }
        this.f30950G = true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f30949F) {
            m2758c();
            m2751o0();
            this.f30945B.flush();
        }
    }

    /* renamed from: g */
    synchronized void m2756g(C14160c c14160c, boolean z) throws IOException {
        C14162d c14162d = c14160c.f30966a;
        if (c14162d.f30976f == c14160c) {
            if (z && !c14162d.f30975e) {
                for (int i = 0; i < this.f30963z; i++) {
                    if (c14160c.f30967b[i]) {
                        if (!this.f30956c.exists(c14162d.f30974d[i])) {
                            c14160c.m2749a();
                            return;
                        }
                    } else {
                        c14160c.m2749a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f30963z; i2++) {
                File file = c14162d.f30974d[i2];
                if (z) {
                    if (this.f30956c.exists(file)) {
                        File file2 = c14162d.f30973c[i2];
                        this.f30956c.rename(file, file2);
                        long j = c14162d.f30972b[i2];
                        long size = this.f30956c.size(file2);
                        c14162d.f30972b[i2] = size;
                        this.f30944A = (this.f30944A - j) + size;
                    }
                } else {
                    this.f30956c.delete(file);
                }
            }
            this.f30947D++;
            c14162d.f30976f = null;
            if (c14162d.f30975e | z) {
                c14162d.f30975e = true;
                this.f30945B.mo2003r("CLEAN").mo2005n(32);
                this.f30945B.mo2003r(c14162d.f30971a);
                c14162d.m2742d(this.f30945B);
                this.f30945B.mo2005n(10);
                if (z) {
                    long j2 = this.f30953J;
                    this.f30953J = 1 + j2;
                    c14162d.f30977g = j2;
                }
            } else {
                this.f30946C.remove(c14162d.f30971a);
                this.f30945B.mo2003r("REMOVE").mo2005n(32);
                this.f30945B.mo2003r(c14162d.f30971a);
                this.f30945B.mo2005n(10);
            }
            this.f30945B.flush();
            if (this.f30944A > this.f30962y || m2762V()) {
                this.f30954K.execute(this.f30955L);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: g0 */
    synchronized void m2755g0() throws IOException {
        if (this.f30945B != null) {
            this.f30945B.close();
        }
        InterfaceC14345d m2022c = C14353l.m2022c(this.f30956c.sink(this.f30959f));
        m2022c.mo2003r("libcore.io.DiskLruCache").mo2005n(10);
        m2022c.mo2003r("1").mo2005n(10);
        m2022c.mo2010A(this.f30961x).mo2005n(10);
        m2022c.mo2010A(this.f30963z).mo2005n(10);
        m2022c.mo2005n(10);
        for (C14162d c14162d : this.f30946C.values()) {
            if (c14162d.f30976f != null) {
                m2022c.mo2003r("DIRTY").mo2005n(32);
                m2022c.mo2003r(c14162d.f30971a);
                m2022c.mo2005n(10);
            } else {
                m2022c.mo2003r("CLEAN").mo2005n(32);
                m2022c.mo2003r(c14162d.f30971a);
                c14162d.m2742d(m2022c);
                m2022c.mo2005n(10);
            }
        }
        m2022c.close();
        if (this.f30956c.exists(this.f30958e)) {
            this.f30956c.rename(this.f30958e, this.f30960w);
        }
        this.f30956c.rename(this.f30959f, this.f30958e);
        this.f30956c.delete(this.f30960w);
        this.f30945B = m2761X();
        this.f30948E = false;
        this.f30952I = false;
    }

    /* renamed from: i0 */
    public synchronized boolean m2754i0(String str) throws IOException {
        m2763P();
        m2758c();
        m2750u0(str);
        C14162d c14162d = this.f30946C.get(str);
        if (c14162d == null) {
            return false;
        }
        boolean m2753k0 = m2753k0(c14162d);
        if (m2753k0 && this.f30944A <= this.f30962y) {
            this.f30951H = false;
        }
        return m2753k0;
    }

    public synchronized boolean isClosed() {
        return this.f30950G;
    }

    /* renamed from: k0 */
    boolean m2753k0(C14162d c14162d) throws IOException {
        C14160c c14160c = c14162d.f30976f;
        if (c14160c != null) {
            c14160c.m2747c();
        }
        for (int i = 0; i < this.f30963z; i++) {
            this.f30956c.delete(c14162d.f30973c[i]);
            long j = this.f30944A;
            long[] jArr = c14162d.f30972b;
            this.f30944A = j - jArr[i];
            jArr[i] = 0;
        }
        this.f30947D++;
        this.f30945B.mo2003r("REMOVE").mo2005n(32).mo2003r(c14162d.f30971a).mo2005n(10);
        this.f30946C.remove(c14162d.f30971a);
        if (m2762V()) {
            this.f30954K.execute(this.f30955L);
        }
        return true;
    }

    /* renamed from: o0 */
    void m2751o0() throws IOException {
        while (this.f30944A > this.f30962y) {
            m2753k0(this.f30946C.values().iterator().next());
        }
        this.f30951H = false;
    }
}
