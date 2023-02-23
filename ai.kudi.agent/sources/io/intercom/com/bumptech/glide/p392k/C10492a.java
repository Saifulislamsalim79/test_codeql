package io.intercom.com.bumptech.glide.p392k;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: DiskLruCache.java */
/* renamed from: io.intercom.com.bumptech.glide.k.a */
/* loaded from: classes3.dex */
public final class C10492a implements Closeable {

    /* renamed from: A */
    private Writer f24008A;

    /* renamed from: C */
    private int f24010C;

    /* renamed from: c */
    private final File f24014c;

    /* renamed from: d */
    private final File f24015d;

    /* renamed from: e */
    private final File f24016e;

    /* renamed from: f */
    private final File f24017f;

    /* renamed from: w */
    private final int f24018w;

    /* renamed from: x */
    private long f24019x;

    /* renamed from: y */
    private final int f24020y;

    /* renamed from: z */
    private long f24021z = 0;

    /* renamed from: B */
    private final LinkedHashMap<String, C10496d> f24009B = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: D */
    private long f24011D = 0;

    /* renamed from: E */
    final ThreadPoolExecutor f24012E = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC10494b(null));

    /* renamed from: F */
    private final Callable<Void> f24013F = new CallableC10493a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: io.intercom.com.bumptech.glide.k.a$a */
    /* loaded from: classes3.dex */
    public class CallableC10493a implements Callable<Void> {
        CallableC10493a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (C10492a.this) {
                if (C10492a.this.f24008A == null) {
                    return null;
                }
                C10492a.this.m12964D0();
                if (C10492a.this.m12949k0()) {
                    C10492a.this.m12943z0();
                    C10492a.this.f24010C = 0;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: io.intercom.com.bumptech.glide.k.a$b */
    /* loaded from: classes3.dex */
    private static final class ThreadFactoryC10494b implements ThreadFactory {
        private ThreadFactoryC10494b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ ThreadFactoryC10494b(CallableC10493a callableC10493a) {
            this();
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: io.intercom.com.bumptech.glide.k.a$c */
    /* loaded from: classes3.dex */
    public final class C10495c {

        /* renamed from: a */
        private final C10496d f24023a;

        /* renamed from: b */
        private final boolean[] f24024b;

        /* renamed from: c */
        private boolean f24025c;

        /* synthetic */ C10495c(C10492a c10492a, C10496d c10496d, CallableC10493a callableC10493a) {
            this(c10496d);
        }

        /* renamed from: a */
        public void m12941a() throws IOException {
            C10492a.this.m12957X(this, false);
        }

        /* renamed from: b */
        public void m12940b() {
            if (this.f24025c) {
                return;
            }
            try {
                m12941a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m12937e() throws IOException {
            C10492a.this.m12957X(this, true);
            this.f24025c = true;
        }

        /* renamed from: f */
        public File m12936f(int i) throws IOException {
            File m12925k;
            synchronized (C10492a.this) {
                if (this.f24023a.f24032f == this) {
                    if (!this.f24023a.f24031e) {
                        this.f24024b[i] = true;
                    }
                    m12925k = this.f24023a.m12925k(i);
                    if (!C10492a.this.f24014c.exists()) {
                        C10492a.this.f24014c.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return m12925k;
        }

        private C10495c(C10496d c10496d) {
            this.f24023a = c10496d;
            this.f24024b = c10496d.f24031e ? null : new boolean[C10492a.this.f24020y];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: io.intercom.com.bumptech.glide.k.a$d */
    /* loaded from: classes3.dex */
    public final class C10496d {

        /* renamed from: a */
        private final String f24027a;

        /* renamed from: b */
        private final long[] f24028b;

        /* renamed from: c */
        File[] f24029c;

        /* renamed from: d */
        File[] f24030d;

        /* renamed from: e */
        private boolean f24031e;

        /* renamed from: f */
        private C10495c f24032f;

        /* renamed from: g */
        private long f24033g;

        /* synthetic */ C10496d(C10492a c10492a, String str, CallableC10493a callableC10493a) {
            this(str);
        }

        /* renamed from: m */
        private IOException m12923m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public void m12922n(String[] strArr) throws IOException {
            if (strArr.length == C10492a.this.f24020y) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f24028b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        m12923m(strArr);
                        throw null;
                    }
                }
                return;
            }
            m12923m(strArr);
            throw null;
        }

        /* renamed from: j */
        public File m12926j(int i) {
            return this.f24029c[i];
        }

        /* renamed from: k */
        public File m12925k(int i) {
            return this.f24030d[i];
        }

        /* renamed from: l */
        public String m12924l() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f24028b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private C10496d(String str) {
            this.f24027a = str;
            this.f24028b = new long[C10492a.this.f24020y];
            this.f24029c = new File[C10492a.this.f24020y];
            this.f24030d = new File[C10492a.this.f24020y];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C10492a.this.f24020y; i++) {
                sb.append(i);
                this.f24029c[i] = new File(C10492a.this.f24014c, sb.toString());
                sb.append(".tmp");
                this.f24030d[i] = new File(C10492a.this.f24014c, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: io.intercom.com.bumptech.glide.k.a$e */
    /* loaded from: classes3.dex */
    public final class C10497e {

        /* renamed from: a */
        private final File[] f24035a;

        /* synthetic */ C10497e(C10492a c10492a, String str, long j, File[] fileArr, long[] jArr, CallableC10493a callableC10493a) {
            this(c10492a, str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File m12921a(int i) {
            return this.f24035a[i];
        }

        private C10497e(C10492a c10492a, String str, long j, File[] fileArr, long[] jArr) {
            this.f24035a = fileArr;
        }
    }

    private C10492a(File file, int i, int i2, long j) {
        this.f24014c = file;
        this.f24018w = i;
        this.f24015d = new File(file, "journal");
        this.f24016e = new File(file, "journal.tmp");
        this.f24017f = new File(file, "journal.bkp");
        this.f24020y = i2;
        this.f24019x = j;
    }

    /* renamed from: C0 */
    private static void m12965C0(File file, File file2, boolean z) throws IOException {
        if (z) {
            m12955b0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public void m12964D0() throws IOException {
        while (this.f24021z > this.f24019x) {
            m12966A0(this.f24009B.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: V */
    private void m12958V() {
        if (this.f24008A == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public synchronized void m12957X(C10495c c10495c, boolean z) throws IOException {
        C10496d c10496d = c10495c.f24023a;
        if (c10496d.f24032f == c10495c) {
            if (z && !c10496d.f24031e) {
                for (int i = 0; i < this.f24020y; i++) {
                    if (c10495c.f24024b[i]) {
                        if (!c10496d.m12925k(i).exists()) {
                            c10495c.m12941a();
                            return;
                        }
                    } else {
                        c10495c.m12941a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f24020y; i2++) {
                File m12925k = c10496d.m12925k(i2);
                if (z) {
                    if (m12925k.exists()) {
                        File m12926j = c10496d.m12926j(i2);
                        m12925k.renameTo(m12926j);
                        long j = c10496d.f24028b[i2];
                        long length = m12926j.length();
                        c10496d.f24028b[i2] = length;
                        this.f24021z = (this.f24021z - j) + length;
                    }
                } else {
                    m12955b0(m12925k);
                }
            }
            this.f24010C++;
            c10496d.f24032f = null;
            if (c10496d.f24031e | z) {
                c10496d.f24031e = true;
                this.f24008A.append((CharSequence) "CLEAN");
                this.f24008A.append(' ');
                this.f24008A.append((CharSequence) c10496d.f24027a);
                this.f24008A.append((CharSequence) c10496d.m12924l());
                this.f24008A.append('\n');
                if (z) {
                    long j2 = this.f24011D;
                    this.f24011D = 1 + j2;
                    c10496d.f24033g = j2;
                }
            } else {
                this.f24009B.remove(c10496d.f24027a);
                this.f24008A.append((CharSequence) "REMOVE");
                this.f24008A.append(' ');
                this.f24008A.append((CharSequence) c10496d.f24027a);
                this.f24008A.append('\n');
            }
            this.f24008A.flush();
            if (this.f24021z > this.f24019x || m12949k0()) {
                this.f24012E.submit(this.f24013F);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b0 */
    private static void m12955b0(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: g0 */
    private synchronized C10495c m12951g0(String str, long j) throws IOException {
        m12958V();
        C10496d c10496d = this.f24009B.get(str);
        if (j == -1 || (c10496d != null && c10496d.f24033g == j)) {
            if (c10496d != null) {
                if (c10496d.f24032f != null) {
                    return null;
                }
            } else {
                c10496d = new C10496d(this, str, null);
                this.f24009B.put(str, c10496d);
            }
            C10495c c10495c = new C10495c(this, c10496d, null);
            c10496d.f24032f = c10495c;
            this.f24008A.append((CharSequence) "DIRTY");
            this.f24008A.append(' ');
            this.f24008A.append((CharSequence) str);
            this.f24008A.append('\n');
            this.f24008A.flush();
            return c10495c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public boolean m12949k0() {
        int i = this.f24010C;
        return i >= 2000 && i >= this.f24009B.size();
    }

    /* renamed from: o0 */
    public static C10492a m12947o0(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        m12965C0(file2, file3, false);
                    }
                }
                C10492a c10492a = new C10492a(file, i, i2, j);
                if (c10492a.f24015d.exists()) {
                    try {
                        c10492a.m12945w0();
                        c10492a.m12946u0();
                        return c10492a;
                    } catch (IOException e) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        c10492a.m12956Z();
                    }
                }
                file.mkdirs();
                C10492a c10492a2 = new C10492a(file, i, i2, j);
                c10492a2.m12943z0();
                return c10492a2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: u0 */
    private void m12946u0() throws IOException {
        m12955b0(this.f24016e);
        Iterator<C10496d> it = this.f24009B.values().iterator();
        while (it.hasNext()) {
            C10496d next = it.next();
            int i = 0;
            if (next.f24032f != null) {
                next.f24032f = null;
                while (i < this.f24020y) {
                    m12955b0(next.m12926j(i));
                    m12955b0(next.m12925k(i));
                    i++;
                }
                it.remove();
            } else {
                while (i < this.f24020y) {
                    this.f24021z += next.f24028b[i];
                    i++;
                }
            }
        }
    }

    /* renamed from: w0 */
    private void m12945w0() throws IOException {
        C10498b c10498b = new C10498b(new FileInputStream(this.f24015d), C10500c.f24042a);
        try {
            String m12920F = c10498b.m12920F();
            String m12920F2 = c10498b.m12920F();
            String m12920F3 = c10498b.m12920F();
            String m12920F4 = c10498b.m12920F();
            String m12920F5 = c10498b.m12920F();
            if (!"libcore.io.DiskLruCache".equals(m12920F) || !"1".equals(m12920F2) || !Integer.toString(this.f24018w).equals(m12920F3) || !Integer.toString(this.f24020y).equals(m12920F4) || !"".equals(m12920F5)) {
                throw new IOException("unexpected journal header: [" + m12920F + ", " + m12920F2 + ", " + m12920F4 + ", " + m12920F5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m12944x0(c10498b.m12920F());
                    i++;
                } catch (EOFException unused) {
                    this.f24010C = i - this.f24009B.size();
                    if (c10498b.m12917m()) {
                        m12943z0();
                    } else {
                        this.f24008A = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f24015d, true), C10500c.f24042a));
                    }
                    C10500c.m12916a(c10498b);
                    return;
                }
            }
        } catch (Throwable th) {
            C10500c.m12916a(c10498b);
            throw th;
        }
    }

    /* renamed from: x0 */
    private void m12944x0(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f24009B.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C10496d c10496d = this.f24009B.get(substring);
            if (c10496d == null) {
                c10496d = new C10496d(this, substring, null);
                this.f24009B.put(substring, c10496d);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c10496d.f24031e = true;
                c10496d.f24032f = null;
                c10496d.m12922n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c10496d.f24032f = new C10495c(this, c10496d, null);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public synchronized void m12943z0() throws IOException {
        if (this.f24008A != null) {
            this.f24008A.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f24016e), C10500c.f24042a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f24018w));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f24020y));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C10496d c10496d : this.f24009B.values()) {
            if (c10496d.f24032f != null) {
                bufferedWriter.write("DIRTY " + c10496d.f24027a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c10496d.f24027a + c10496d.m12924l() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f24015d.exists()) {
            m12965C0(this.f24015d, this.f24017f, true);
        }
        m12965C0(this.f24016e, this.f24015d, false);
        this.f24017f.delete();
        this.f24008A = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f24015d, true), C10500c.f24042a));
    }

    /* renamed from: A0 */
    public synchronized boolean m12966A0(String str) throws IOException {
        m12958V();
        C10496d c10496d = this.f24009B.get(str);
        if (c10496d != null && c10496d.f24032f == null) {
            for (int i = 0; i < this.f24020y; i++) {
                File m12926j = c10496d.m12926j(i);
                if (m12926j.exists() && !m12926j.delete()) {
                    throw new IOException("failed to delete " + m12926j);
                }
                this.f24021z -= c10496d.f24028b[i];
                c10496d.f24028b[i] = 0;
            }
            this.f24010C++;
            this.f24008A.append((CharSequence) "REMOVE");
            this.f24008A.append(' ');
            this.f24008A.append((CharSequence) str);
            this.f24008A.append('\n');
            this.f24009B.remove(str);
            if (m12949k0()) {
                this.f24012E.submit(this.f24013F);
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public void m12956Z() throws IOException {
        close();
        C10500c.m12915b(this.f24014c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f24008A == null) {
            return;
        }
        Iterator it = new ArrayList(this.f24009B.values()).iterator();
        while (it.hasNext()) {
            C10496d c10496d = (C10496d) it.next();
            if (c10496d.f24032f != null) {
                c10496d.f24032f.m12941a();
            }
        }
        m12964D0();
        this.f24008A.close();
        this.f24008A = null;
    }

    /* renamed from: f0 */
    public C10495c m12953f0(String str) throws IOException {
        return m12951g0(str, -1L);
    }

    /* renamed from: i0 */
    public synchronized C10497e m12950i0(String str) throws IOException {
        m12958V();
        C10496d c10496d = this.f24009B.get(str);
        if (c10496d == null) {
            return null;
        }
        if (c10496d.f24031e) {
            for (File file : c10496d.f24029c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f24010C++;
            this.f24008A.append((CharSequence) "READ");
            this.f24008A.append(' ');
            this.f24008A.append((CharSequence) str);
            this.f24008A.append('\n');
            if (m12949k0()) {
                this.f24012E.submit(this.f24013F);
            }
            return new C10497e(this, str, c10496d.f24033g, c10496d.f24029c, c10496d.f24028b, null);
        }
        return null;
    }

    public synchronized boolean isClosed() {
        return this.f24008A == null;
    }
}
