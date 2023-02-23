package com.bumptech.glide.load.engine.p067a0;

import android.util.Log;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.engine.p067a0.InterfaceC2012a;
import com.bumptech.glide.p064j.C1956a;
import java.io.File;
import java.io.IOException;
/* compiled from: DiskLruCacheWrapper.java */
/* renamed from: com.bumptech.glide.load.engine.a0.e */
/* loaded from: classes2.dex */
public class C2021e implements InterfaceC2012a {

    /* renamed from: b */
    private final File f6120b;

    /* renamed from: c */
    private final long f6121c;

    /* renamed from: e */
    private C1956a f6123e;

    /* renamed from: d */
    private final C2016c f6122d = new C2016c();

    /* renamed from: a */
    private final C2031j f6119a = new C2031j();

    @Deprecated
    protected C2021e(File file, long j) {
        this.f6120b = file;
        this.f6121c = j;
    }

    /* renamed from: c */
    public static InterfaceC2012a m33916c(File file, long j) {
        return new C2021e(file, j);
    }

    /* renamed from: d */
    private synchronized C1956a m33915d() throws IOException {
        if (this.f6123e == null) {
            this.f6123e = C1956a.m34084w0(this.f6120b, 1, 1, this.f6121c);
        }
        return this.f6123e;
    }

    @Override // com.bumptech.glide.load.engine.p067a0.InterfaceC2012a
    /* renamed from: a */
    public void mo33918a(InterfaceC2118f interfaceC2118f, InterfaceC2012a.InterfaceC2014b interfaceC2014b) {
        C1956a m33915d;
        String m33896b = this.f6119a.m33896b(interfaceC2118f);
        this.f6122d.m33922a(m33896b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + m33896b + " for for Key: " + interfaceC2118f);
            }
            try {
                m33915d = m33915d();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            if (m33915d.m34086o0(m33896b) != null) {
                return;
            }
            C1956a.C1959c m34090g0 = m33915d.m34090g0(m33896b);
            if (m34090g0 != null) {
                try {
                    if (interfaceC2014b.mo33879a(m34090g0.m34075f(0))) {
                        m34090g0.m34076e();
                    }
                    m34090g0.m34079b();
                    return;
                } catch (Throwable th) {
                    m34090g0.m34079b();
                    throw th;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + m33896b);
        } finally {
            this.f6122d.m33921b(m33896b);
        }
    }

    @Override // com.bumptech.glide.load.engine.p067a0.InterfaceC2012a
    /* renamed from: b */
    public File mo33917b(InterfaceC2118f interfaceC2118f) {
        String m33896b = this.f6119a.m33896b(interfaceC2118f);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + m33896b + " for for Key: " + interfaceC2118f);
        }
        try {
            C1956a.C1961e m34086o0 = m33915d().m34086o0(m33896b);
            if (m34086o0 != null) {
                return m34086o0.m34060a(0);
            }
            return null;
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
                return null;
            }
            return null;
        }
    }
}
