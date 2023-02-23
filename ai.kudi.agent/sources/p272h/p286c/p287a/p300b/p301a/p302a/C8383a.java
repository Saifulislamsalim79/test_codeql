package p272h.p286c.p287a.p300b.p301a.p302a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C2834f;
import com.google.android.gms.common.C2838h;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.ServiceConnectionC2728a;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.p101n.C2951a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p272h.p286c.p287a.p300b.p307d.p308a.AbstractBinderC8397e;
import p272h.p286c.p287a.p300b.p307d.p308a.InterfaceC8396d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* renamed from: h.c.a.b.a.a.a */
/* loaded from: classes2.dex */
public class C8383a {

    /* renamed from: a */
    private ServiceConnectionC2728a f20058a;

    /* renamed from: b */
    private InterfaceC8396d f20059b;

    /* renamed from: c */
    private boolean f20060c;

    /* renamed from: d */
    private final Object f20061d = new Object();

    /* renamed from: e */
    private C8385b f20062e;

    /* renamed from: f */
    private final Context f20063f;

    /* renamed from: g */
    private final boolean f20064g;

    /* renamed from: h */
    private final long f20065h;

    /* renamed from: h.c.a.b.a.a.a$a */
    /* loaded from: classes2.dex */
    public static final class C8384a {

        /* renamed from: a */
        private final String f20066a;

        /* renamed from: b */
        private final boolean f20067b;

        public C8384a(String str, boolean z) {
            this.f20066a = str;
            this.f20067b = z;
        }

        /* renamed from: a */
        public final String m16149a() {
            return this.f20066a;
        }

        /* renamed from: b */
        public final boolean m16148b() {
            return this.f20067b;
        }

        public final String toString() {
            String str = this.f20066a;
            boolean z = this.f20067b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h.c.a.b.a.a.a$b */
    /* loaded from: classes2.dex */
    public static class C8385b extends Thread {

        /* renamed from: c */
        private WeakReference<C8383a> f20068c;

        /* renamed from: d */
        private long f20069d;

        /* renamed from: e */
        CountDownLatch f20070e = new CountDownLatch(1);

        /* renamed from: f */
        boolean f20071f = false;

        public C8385b(C8383a c8383a, long j) {
            this.f20068c = new WeakReference<>(c8383a);
            this.f20069d = j;
            start();
        }

        /* renamed from: a */
        private final void m16147a() {
            C8383a c8383a = this.f20068c.get();
            if (c8383a != null) {
                c8383a.m16158a();
                this.f20071f = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f20070e.await(this.f20069d, TimeUnit.MILLISECONDS)) {
                    return;
                }
                m16147a();
            } catch (InterruptedException unused) {
                m16147a();
            }
        }
    }

    private C8383a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        s.j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f20063f = context;
        this.f20060c = false;
        this.f20065h = j;
        this.f20064g = z2;
    }

    /* renamed from: b */
    public static C8384a m16157b(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C8387c c8387c = new C8387c(context);
        boolean m16146a = c8387c.m16146a("gads:ad_id_app_context:enabled", false);
        float m16145b = c8387c.m16145b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String m16144c = c8387c.m16144c("gads:ad_id_use_shared_preference:experiment_id", "");
        C8383a c8383a = new C8383a(context, -1L, m16146a, c8387c.m16146a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c8383a.m16151h(false);
            C8384a m16156c = c8383a.m16156c();
            c8383a.m16150i(m16156c, m16146a, m16145b, SystemClock.elapsedRealtime() - elapsedRealtime, m16144c, null);
            return m16156c;
        } finally {
        }
    }

    /* renamed from: d */
    public static void m16155d(boolean z) {
    }

    /* renamed from: e */
    private static ServiceConnectionC2728a m16154e(Context context, boolean z) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int mo31845h = C2834f.m31847f().mo31845h(context, C2838h.f7921a);
            if (mo31845h == 0 || mo31845h == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                ServiceConnectionC2728a serviceConnectionC2728a = new ServiceConnectionC2728a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C2951a.m31567b().m31568a(context, intent, serviceConnectionC2728a, 1)) {
                        return serviceConnectionC2728a;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            }
            throw new IOException("Google Play services not available");
        } catch (PackageManager.NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    /* renamed from: f */
    private static InterfaceC8396d m16153f(Context context, ServiceConnectionC2728a serviceConnectionC2728a) throws IOException {
        try {
            return AbstractBinderC8397e.m16137m(serviceConnectionC2728a.m32107a(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* renamed from: g */
    private final void m16152g() {
        synchronized (this.f20061d) {
            if (this.f20062e != null) {
                this.f20062e.f20070e.countDown();
                try {
                    this.f20062e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f20065h > 0) {
                this.f20062e = new C8385b(this, this.f20065h);
            }
        }
    }

    /* renamed from: h */
    private final void m16151h(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        s.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f20060c) {
                m16158a();
            }
            ServiceConnectionC2728a m16154e = m16154e(this.f20063f, this.f20064g);
            this.f20058a = m16154e;
            this.f20059b = m16153f(this.f20063f, m16154e);
            this.f20060c = true;
            if (z) {
                m16152g();
            }
        }
    }

    /* renamed from: i */
    private final boolean m16150i(C8384a c8384a, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (c8384a != null) {
            hashMap.put("limit_ad_tracking", c8384a.m16148b() ? "1" : "0");
        }
        if (c8384a != null && c8384a.m16149a() != null) {
            hashMap.put("ad_id_size", Integer.toString(c8384a.m16149a().length()));
        }
        if (th != null) {
            hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C8386b(this, hashMap).start();
        return true;
    }

    /* renamed from: a */
    public final void m16158a() {
        s.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f20063f == null || this.f20058a == null) {
                return;
            }
            if (this.f20060c) {
                C2951a.m31567b().m31566c(this.f20063f, this.f20058a);
            }
            this.f20060c = false;
            this.f20059b = null;
            this.f20058a = null;
        }
    }

    /* renamed from: c */
    public C8384a m16156c() throws IOException {
        C8384a c8384a;
        s.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f20060c) {
                synchronized (this.f20061d) {
                    if (this.f20062e == null || !this.f20062e.f20071f) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m16151h(false);
                    if (!this.f20060c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            s.j(this.f20058a);
            s.j(this.f20059b);
            try {
                c8384a = new C8384a(this.f20059b.mo16135h(), this.f20059b.mo16136U(true));
            } catch (RemoteException e2) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                throw new IOException("Remote exception");
            }
        }
        m16152g();
        return c8384a;
    }

    protected void finalize() throws Throwable {
        m16158a();
        super.finalize();
    }
}
