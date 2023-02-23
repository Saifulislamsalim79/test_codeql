package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.p063z0.C1852a;
import androidx.room.p063z0.C1854c;
import androidx.room.p063z0.C1855d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8094h;
import p201g.p262t.p263a.p264l.C8108c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SQLiteCopyOpenHelper.java */
/* renamed from: androidx.room.u0 */
/* loaded from: classes2.dex */
public class C1834u0 implements InterfaceC8094h, InterfaceC1759a0 {

    /* renamed from: c */
    private final Context f5562c;

    /* renamed from: d */
    private final String f5563d;

    /* renamed from: e */
    private final File f5564e;

    /* renamed from: f */
    private final Callable<InputStream> f5565f;

    /* renamed from: w */
    private final int f5566w;

    /* renamed from: x */
    private final InterfaceC8094h f5567x;

    /* renamed from: y */
    private C1851z f5568y;

    /* renamed from: z */
    private boolean f5569z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SQLiteCopyOpenHelper.java */
    /* renamed from: androidx.room.u0$a */
    /* loaded from: classes2.dex */
    public class C1835a extends InterfaceC8094h.AbstractC8095a {
        C1835a(C1834u0 c1834u0, int i) {
            super(i);
        }

        @Override // p201g.p262t.p263a.InterfaceC8094h.AbstractC8095a
        /* renamed from: d */
        public void mo16764d(InterfaceC8093g interfaceC8093g) {
        }

        @Override // p201g.p262t.p263a.InterfaceC8094h.AbstractC8095a
        /* renamed from: g */
        public void mo16761g(InterfaceC8093g interfaceC8093g, int i, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1834u0(Context context, String str, File file, Callable<InputStream> callable, int i, InterfaceC8094h interfaceC8094h) {
        this.f5562c = context;
        this.f5563d = str;
        this.f5564e = file;
        this.f5565f = callable;
        this.f5566w = i;
        this.f5567x = interfaceC8094h;
    }

    /* renamed from: F */
    private void m34454F(File file, boolean z) {
        InterfaceC8093g mo16748e0;
        C1851z c1851z = this.f5568y;
        if (c1851z == null || c1851z.f5610f == null) {
            return;
        }
        InterfaceC8094h m34450m = m34450m(file);
        try {
            if (z) {
                mo16748e0 = m34450m.mo16747h0();
            } else {
                mo16748e0 = m34450m.mo16748e0();
            }
            this.f5568y.f5610f.m34477a(mo16748e0);
        } finally {
            m34450m.close();
        }
    }

    /* renamed from: J */
    private void m34452J(boolean z) {
        String databaseName = getDatabaseName();
        File databasePath = this.f5562c.getDatabasePath(databaseName);
        C1851z c1851z = this.f5568y;
        C1852a c1852a = new C1852a(databaseName, this.f5562c.getFilesDir(), c1851z == null || c1851z.f5617m);
        try {
            c1852a.m34427b();
            if (!databasePath.exists()) {
                try {
                    m34451g(databasePath, z);
                    c1852a.m34426c();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            } else if (this.f5568y == null) {
                c1852a.m34426c();
                return;
            } else {
                try {
                    int m34418c = C1854c.m34418c(databasePath);
                    if (m34418c == this.f5566w) {
                        c1852a.m34426c();
                        return;
                    } else if (this.f5568y.m34429a(m34418c, this.f5566w)) {
                        c1852a.m34426c();
                        return;
                    } else {
                        if (this.f5562c.deleteDatabase(databaseName)) {
                            try {
                                m34451g(databasePath, z);
                            } catch (IOException e2) {
                                Log.w("ROOM", "Unable to copy database file.", e2);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        c1852a.m34426c();
                        return;
                    }
                } catch (IOException e3) {
                    Log.w("ROOM", "Unable to read database version.", e3);
                    c1852a.m34426c();
                    return;
                }
            }
        } catch (Throwable th) {
            c1852a.m34426c();
            throw th;
        }
        c1852a.m34426c();
        throw th;
    }

    /* renamed from: g */
    private void m34451g(File file, boolean z) throws IOException {
        ReadableByteChannel newChannel;
        if (this.f5563d != null) {
            newChannel = Channels.newChannel(this.f5562c.getAssets().open(this.f5563d));
        } else if (this.f5564e != null) {
            newChannel = new FileInputStream(this.f5564e).getChannel();
        } else {
            Callable<InputStream> callable = this.f5565f;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel(callable.call());
                } catch (Exception e) {
                    throw new IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f5562c.getCacheDir());
        createTempFile.deleteOnExit();
        C1855d.m34417a(newChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        m34454F(createTempFile, z);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    /* renamed from: m */
    private InterfaceC8094h m34450m(File file) {
        String name = file.getName();
        try {
            int m34418c = C1854c.m34418c(file);
            C8108c c8108c = new C8108c();
            InterfaceC8094h.C8096b.C8097a m16760a = InterfaceC8094h.C8096b.m16760a(this.f5562c);
            m16760a.m16757c(name);
            m16760a.m16758b(new C1835a(this, m34418c));
            return c8108c.mo16742a(m16760a.m16759a());
        } catch (IOException e) {
            throw new RuntimeException("Malformed database file, unable to read version.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m34453I(C1851z c1851z) {
        this.f5568y = c1851z;
    }

    @Override // androidx.room.InterfaceC1759a0
    /* renamed from: c */
    public InterfaceC8094h mo34441c() {
        return this.f5567x;
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f5567x.close();
        this.f5569z = false;
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    /* renamed from: e0 */
    public synchronized InterfaceC8093g mo16748e0() {
        if (!this.f5569z) {
            m34452J(false);
            this.f5569z = true;
        }
        return this.f5567x.mo16748e0();
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    public String getDatabaseName() {
        return this.f5567x.getDatabaseName();
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    /* renamed from: h0 */
    public synchronized InterfaceC8093g mo16747h0() {
        if (!this.f5569z) {
            m34452J(true);
            this.f5569z = true;
        }
        return this.f5567x.mo16747h0();
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f5567x.setWriteAheadLoggingEnabled(z);
    }
}
