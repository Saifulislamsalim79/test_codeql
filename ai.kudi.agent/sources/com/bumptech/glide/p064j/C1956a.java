package com.bumptech.glide.p064j;

import android.os.Build;
import android.os.StrictMode;
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
/* renamed from: com.bumptech.glide.j.a */
/* loaded from: classes2.dex */
public final class C1956a implements Closeable {

    /* renamed from: A */
    private Writer f5953A;

    /* renamed from: C */
    private int f5955C;

    /* renamed from: c */
    private final File f5959c;

    /* renamed from: d */
    private final File f5960d;

    /* renamed from: e */
    private final File f5961e;

    /* renamed from: f */
    private final File f5962f;

    /* renamed from: w */
    private final int f5963w;

    /* renamed from: x */
    private long f5964x;

    /* renamed from: y */
    private final int f5965y;

    /* renamed from: z */
    private long f5966z = 0;

    /* renamed from: B */
    private final LinkedHashMap<String, C1960d> f5954B = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: D */
    private long f5956D = 0;

    /* renamed from: E */
    final ThreadPoolExecutor f5957E = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1958b(null));

    /* renamed from: F */
    private final Callable<Void> f5958F = new CallableC1957a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.j.a$a */
    /* loaded from: classes2.dex */
    public class CallableC1957a implements Callable<Void> {
        CallableC1957a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (C1956a.this) {
                if (C1956a.this.f5953A == null) {
                    return null;
                }
                C1956a.this.m34102F0();
                if (C1956a.this.m34085u0()) {
                    C1956a.this.m34106C0();
                    C1956a.this.f5955C = 0;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.j.a$b */
    /* loaded from: classes2.dex */
    private static final class ThreadFactoryC1958b implements ThreadFactory {
        private ThreadFactoryC1958b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ ThreadFactoryC1958b(CallableC1957a callableC1957a) {
            this();
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.j.a$c */
    /* loaded from: classes2.dex */
    public final class C1959c {

        /* renamed from: a */
        private final C1960d f5968a;

        /* renamed from: b */
        private final boolean[] f5969b;

        /* renamed from: c */
        private boolean f5970c;

        /* synthetic */ C1959c(C1956a c1956a, C1960d c1960d, CallableC1957a callableC1957a) {
            this(c1960d);
        }

        /* renamed from: a */
        public void m34080a() throws IOException {
            C1956a.this.m34095Z(this, false);
        }

        /* renamed from: b */
        public void m34079b() {
            if (this.f5970c) {
                return;
            }
            try {
                m34080a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m34076e() throws IOException {
            C1956a.this.m34095Z(this, true);
            this.f5970c = true;
        }

        /* renamed from: f */
        public File m34075f(int i) throws IOException {
            File m34064k;
            synchronized (C1956a.this) {
                if (this.f5968a.f5977f == this) {
                    if (!this.f5968a.f5976e) {
                        this.f5969b[i] = true;
                    }
                    m34064k = this.f5968a.m34064k(i);
                    if (!C1956a.this.f5959c.exists()) {
                        C1956a.this.f5959c.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return m34064k;
        }

        private C1959c(C1960d c1960d) {
            this.f5968a = c1960d;
            this.f5969b = c1960d.f5976e ? null : new boolean[C1956a.this.f5965y];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.j.a$d */
    /* loaded from: classes2.dex */
    public final class C1960d {

        /* renamed from: a */
        private final String f5972a;

        /* renamed from: b */
        private final long[] f5973b;

        /* renamed from: c */
        File[] f5974c;

        /* renamed from: d */
        File[] f5975d;

        /* renamed from: e */
        private boolean f5976e;

        /* renamed from: f */
        private C1959c f5977f;

        /* renamed from: g */
        private long f5978g;

        /* synthetic */ C1960d(C1956a c1956a, String str, CallableC1957a callableC1957a) {
            this(str);
        }

        /* renamed from: m */
        private IOException m34062m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public void m34061n(String[] strArr) throws IOException {
            if (strArr.length == C1956a.this.f5965y) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f5973b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        m34062m(strArr);
                        throw null;
                    }
                }
                return;
            }
            m34062m(strArr);
            throw null;
        }

        /* renamed from: j */
        public File m34065j(int i) {
            return this.f5974c[i];
        }

        /* renamed from: k */
        public File m34064k(int i) {
            return this.f5975d[i];
        }

        /* renamed from: l */
        public String m34063l() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f5973b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private C1960d(String str) {
            this.f5972a = str;
            this.f5973b = new long[C1956a.this.f5965y];
            this.f5974c = new File[C1956a.this.f5965y];
            this.f5975d = new File[C1956a.this.f5965y];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C1956a.this.f5965y; i++) {
                sb.append(i);
                this.f5974c[i] = new File(C1956a.this.f5959c, sb.toString());
                sb.append(".tmp");
                this.f5975d[i] = new File(C1956a.this.f5959c, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.j.a$e */
    /* loaded from: classes2.dex */
    public final class C1961e {

        /* renamed from: a */
        private final File[] f5980a;

        /* synthetic */ C1961e(C1956a c1956a, String str, long j, File[] fileArr, long[] jArr, CallableC1957a callableC1957a) {
            this(c1956a, str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File m34060a(int i) {
            return this.f5980a[i];
        }

        private C1961e(C1956a c1956a, String str, long j, File[] fileArr, long[] jArr) {
            this.f5980a = fileArr;
        }
    }

    private C1956a(File file, int i, int i2, long j) {
        this.f5959c = file;
        this.f5963w = i;
        this.f5960d = new File(file, "journal");
        this.f5961e = new File(file, "journal.tmp");
        this.f5962f = new File(file, "journal.bkp");
        this.f5965y = i2;
        this.f5964x = j;
    }

    /* renamed from: A0 */
    private void m34107A0(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f5954B.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C1960d c1960d = this.f5954B.get(substring);
            if (c1960d == null) {
                c1960d = new C1960d(this, substring, null);
                this.f5954B.put(substring, c1960d);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c1960d.f5976e = true;
                c1960d.f5977f = null;
                c1960d.m34061n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c1960d.f5977f = new C1959c(this, c1960d, null);
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
    /* renamed from: C0 */
    public synchronized void m34106C0() throws IOException {
        if (this.f5953A != null) {
            m34096X(this.f5953A);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5961e), C1964c.f5987a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f5963w));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f5965y));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C1960d c1960d : this.f5954B.values()) {
            if (c1960d.f5977f != null) {
                bufferedWriter.write("DIRTY " + c1960d.f5972a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c1960d.f5972a + c1960d.m34063l() + '\n');
            }
        }
        m34096X(bufferedWriter);
        if (this.f5960d.exists()) {
            m34104E0(this.f5960d, this.f5962f, true);
        }
        m34104E0(this.f5961e, this.f5960d, false);
        this.f5962f.delete();
        this.f5953A = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5960d, true), C1964c.f5987a));
    }

    /* renamed from: E0 */
    private static void m34104E0(File file, File file2, boolean z) throws IOException {
        if (z) {
            m34092f0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public void m34102F0() throws IOException {
        while (this.f5966z > this.f5964x) {
            m34105D0(this.f5954B.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: V */
    private void m34097V() {
        if (this.f5953A == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: X */
    private static void m34096X(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public synchronized void m34095Z(C1959c c1959c, boolean z) throws IOException {
        C1960d c1960d = c1959c.f5968a;
        if (c1960d.f5977f == c1959c) {
            if (z && !c1960d.f5976e) {
                for (int i = 0; i < this.f5965y; i++) {
                    if (c1959c.f5969b[i]) {
                        if (!c1960d.m34064k(i).exists()) {
                            c1959c.m34080a();
                            return;
                        }
                    } else {
                        c1959c.m34080a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f5965y; i2++) {
                File m34064k = c1960d.m34064k(i2);
                if (z) {
                    if (m34064k.exists()) {
                        File m34065j = c1960d.m34065j(i2);
                        m34064k.renameTo(m34065j);
                        long j = c1960d.f5973b[i2];
                        long length = m34065j.length();
                        c1960d.f5973b[i2] = length;
                        this.f5966z = (this.f5966z - j) + length;
                    }
                } else {
                    m34092f0(m34064k);
                }
            }
            this.f5955C++;
            c1960d.f5977f = null;
            if (c1960d.f5976e | z) {
                c1960d.f5976e = true;
                this.f5953A.append((CharSequence) "CLEAN");
                this.f5953A.append(' ');
                this.f5953A.append((CharSequence) c1960d.f5972a);
                this.f5953A.append((CharSequence) c1960d.m34063l());
                this.f5953A.append('\n');
                if (z) {
                    long j2 = this.f5956D;
                    this.f5956D = 1 + j2;
                    c1960d.f5978g = j2;
                }
            } else {
                this.f5954B.remove(c1960d.f5972a);
                this.f5953A.append((CharSequence) "REMOVE");
                this.f5953A.append(' ');
                this.f5953A.append((CharSequence) c1960d.f5972a);
                this.f5953A.append('\n');
            }
            m34088k0(this.f5953A);
            if (this.f5966z > this.f5964x || m34085u0()) {
                this.f5957E.submit(this.f5958F);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: f0 */
    private static void m34092f0(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: i0 */
    private synchronized C1959c m34089i0(String str, long j) throws IOException {
        m34097V();
        C1960d c1960d = this.f5954B.get(str);
        if (j == -1 || (c1960d != null && c1960d.f5978g == j)) {
            if (c1960d != null) {
                if (c1960d.f5977f != null) {
                    return null;
                }
            } else {
                c1960d = new C1960d(this, str, null);
                this.f5954B.put(str, c1960d);
            }
            C1959c c1959c = new C1959c(this, c1960d, null);
            c1960d.f5977f = c1959c;
            this.f5953A.append((CharSequence) "DIRTY");
            this.f5953A.append(' ');
            this.f5953A.append((CharSequence) str);
            this.f5953A.append('\n');
            m34088k0(this.f5953A);
            return c1959c;
        }
        return null;
    }

    /* renamed from: k0 */
    private static void m34088k0(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public boolean m34085u0() {
        int i = this.f5955C;
        return i >= 2000 && i >= this.f5954B.size();
    }

    /* renamed from: w0 */
    public static C1956a m34084w0(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        m34104E0(file2, file3, false);
                    }
                }
                C1956a c1956a = new C1956a(file, i, i2, j);
                if (c1956a.f5960d.exists()) {
                    try {
                        c1956a.m34082z0();
                        c1956a.m34083x0();
                        return c1956a;
                    } catch (IOException e) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        c1956a.m34094b0();
                    }
                }
                file.mkdirs();
                C1956a c1956a2 = new C1956a(file, i, i2, j);
                c1956a2.m34106C0();
                return c1956a2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: x0 */
    private void m34083x0() throws IOException {
        m34092f0(this.f5961e);
        Iterator<C1960d> it = this.f5954B.values().iterator();
        while (it.hasNext()) {
            C1960d next = it.next();
            int i = 0;
            if (next.f5977f != null) {
                next.f5977f = null;
                while (i < this.f5965y) {
                    m34092f0(next.m34065j(i));
                    m34092f0(next.m34064k(i));
                    i++;
                }
                it.remove();
            } else {
                while (i < this.f5965y) {
                    this.f5966z += next.f5973b[i];
                    i++;
                }
            }
        }
    }

    /* renamed from: z0 */
    private void m34082z0() throws IOException {
        C1962b c1962b = new C1962b(new FileInputStream(this.f5960d), C1964c.f5987a);
        try {
            String m34059F = c1962b.m34059F();
            String m34059F2 = c1962b.m34059F();
            String m34059F3 = c1962b.m34059F();
            String m34059F4 = c1962b.m34059F();
            String m34059F5 = c1962b.m34059F();
            if (!"libcore.io.DiskLruCache".equals(m34059F) || !"1".equals(m34059F2) || !Integer.toString(this.f5963w).equals(m34059F3) || !Integer.toString(this.f5965y).equals(m34059F4) || !"".equals(m34059F5)) {
                throw new IOException("unexpected journal header: [" + m34059F + ", " + m34059F2 + ", " + m34059F4 + ", " + m34059F5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m34107A0(c1962b.m34059F());
                    i++;
                } catch (EOFException unused) {
                    this.f5955C = i - this.f5954B.size();
                    if (c1962b.m34056m()) {
                        m34106C0();
                    } else {
                        this.f5953A = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5960d, true), C1964c.f5987a));
                    }
                    C1964c.m34055a(c1962b);
                    return;
                }
            }
        } catch (Throwable th) {
            C1964c.m34055a(c1962b);
            throw th;
        }
    }

    /* renamed from: D0 */
    public synchronized boolean m34105D0(String str) throws IOException {
        m34097V();
        C1960d c1960d = this.f5954B.get(str);
        if (c1960d != null && c1960d.f5977f == null) {
            for (int i = 0; i < this.f5965y; i++) {
                File m34065j = c1960d.m34065j(i);
                if (m34065j.exists() && !m34065j.delete()) {
                    throw new IOException("failed to delete " + m34065j);
                }
                this.f5966z -= c1960d.f5973b[i];
                c1960d.f5973b[i] = 0;
            }
            this.f5955C++;
            this.f5953A.append((CharSequence) "REMOVE");
            this.f5953A.append(' ');
            this.f5953A.append((CharSequence) str);
            this.f5953A.append('\n');
            this.f5954B.remove(str);
            if (m34085u0()) {
                this.f5957E.submit(this.f5958F);
            }
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    public void m34094b0() throws IOException {
        close();
        C1964c.m34054b(this.f5959c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f5953A == null) {
            return;
        }
        Iterator it = new ArrayList(this.f5954B.values()).iterator();
        while (it.hasNext()) {
            C1960d c1960d = (C1960d) it.next();
            if (c1960d.f5977f != null) {
                c1960d.f5977f.m34080a();
            }
        }
        m34102F0();
        m34096X(this.f5953A);
        this.f5953A = null;
    }

    /* renamed from: g0 */
    public C1959c m34090g0(String str) throws IOException {
        return m34089i0(str, -1L);
    }

    /* renamed from: o0 */
    public synchronized C1961e m34086o0(String str) throws IOException {
        m34097V();
        C1960d c1960d = this.f5954B.get(str);
        if (c1960d == null) {
            return null;
        }
        if (c1960d.f5976e) {
            for (File file : c1960d.f5974c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f5955C++;
            this.f5953A.append((CharSequence) "READ");
            this.f5953A.append(' ');
            this.f5953A.append((CharSequence) str);
            this.f5953A.append('\n');
            if (m34085u0()) {
                this.f5957E.submit(this.f5958F);
            }
            return new C1961e(this, str, c1960d.f5978g, c1960d.f5974c, c1960d.f5973b, null);
        }
        return null;
    }
}
