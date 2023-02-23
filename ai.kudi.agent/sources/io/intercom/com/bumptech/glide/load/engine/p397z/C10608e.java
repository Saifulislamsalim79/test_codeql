package io.intercom.com.bumptech.glide.load.engine.p397z;

import android.util.Log;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10599a;
import io.intercom.com.bumptech.glide.p392k.C10492a;
import java.io.File;
import java.io.IOException;
/* compiled from: DiskLruCacheWrapper.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.z.e */
/* loaded from: classes3.dex */
public class C10608e implements InterfaceC10599a {

    /* renamed from: b */
    private final File f24393b;

    /* renamed from: c */
    private final long f24394c;

    /* renamed from: e */
    private C10492a f24396e;

    /* renamed from: d */
    private final C10603c f24395d = new C10603c();

    /* renamed from: a */
    private final C10618j f24392a = new C10618j();

    @Deprecated
    protected C10608e(File file, long j) {
        this.f24393b = file;
        this.f24394c = j;
    }

    /* renamed from: c */
    public static InterfaceC10599a m12635c(File file, long j) {
        return new C10608e(file, j);
    }

    /* renamed from: d */
    private synchronized C10492a m12634d() throws IOException {
        if (this.f24396e == null) {
            this.f24396e = C10492a.m12947o0(this.f24393b, 1, 1, this.f24394c);
        }
        return this.f24396e;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10599a
    /* renamed from: a */
    public File mo12637a(InterfaceC10622g interfaceC10622g) {
        String m12605b = this.f24392a.m12605b(interfaceC10622g);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + m12605b + " for for Key: " + interfaceC10622g);
        }
        try {
            C10492a.C10497e m12950i0 = m12634d().m12950i0(m12605b);
            if (m12950i0 != null) {
                return m12950i0.m12921a(0);
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

    @Override // io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10599a
    /* renamed from: b */
    public void mo12636b(InterfaceC10622g interfaceC10622g, InterfaceC10599a.InterfaceC10601b interfaceC10601b) {
        C10492a m12634d;
        String m12605b = this.f24392a.m12605b(interfaceC10622g);
        this.f24395d.m12641a(m12605b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + m12605b + " for for Key: " + interfaceC10622g);
            }
            try {
                m12634d = m12634d();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            if (m12634d.m12950i0(m12605b) != null) {
                return;
            }
            C10492a.C10495c m12953f0 = m12634d.m12953f0(m12605b);
            if (m12953f0 != null) {
                try {
                    if (interfaceC10601b.mo12642a(m12953f0.m12936f(0))) {
                        m12953f0.m12937e();
                    }
                    m12953f0.m12940b();
                    return;
                } catch (Throwable th) {
                    m12953f0.m12940b();
                    throw th;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + m12605b);
        } finally {
            this.f24395d.m12640b(m12605b);
        }
    }
}
