package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.p101n.C2951a;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p300b.p307d.p312e.HandlerC8431i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.w1 */
/* loaded from: classes2.dex */
public final class C2931w1 extends AbstractC2883j {

    /* renamed from: g */
    private final Context f8097g;

    /* renamed from: h */
    private volatile Handler f8098h;

    /* renamed from: f */
    private final HashMap<C2915s1, ServiceConnectionC2922t1> f8096f = new HashMap<>();

    /* renamed from: i */
    private final C2928v1 f8099i = new C2928v1(this, null);

    /* renamed from: j */
    private final C2951a f8100j = C2951a.m31567b();

    /* renamed from: k */
    private final long f8101k = 5000;

    /* renamed from: l */
    private final long f8102l = 300000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2931w1(Context context, Looper looper) {
        this.f8097g = context.getApplicationContext();
        this.f8098h = new HandlerC8431i(looper, this.f8099i);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2883j
    /* renamed from: d */
    protected final void mo31610d(C2915s1 c2915s1, ServiceConnection serviceConnection, String str) {
        s.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8096f) {
            ServiceConnectionC2922t1 serviceConnectionC2922t1 = this.f8096f.get(c2915s1);
            if (serviceConnectionC2922t1 != null) {
                if (serviceConnectionC2922t1.m31628h(serviceConnection)) {
                    serviceConnectionC2922t1.m31630f(serviceConnection, str);
                    if (serviceConnectionC2922t1.m31627i()) {
                        this.f8098h.sendMessageDelayed(this.f8098h.obtainMessage(0, c2915s1), this.f8101k);
                    }
                } else {
                    String c2915s12 = c2915s1.toString();
                    StringBuilder sb = new StringBuilder(c2915s12.length() + 76);
                    sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb.append(c2915s12);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                String c2915s13 = c2915s1.toString();
                StringBuilder sb2 = new StringBuilder(c2915s13.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(c2915s13);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2883j
    /* renamed from: f */
    public final boolean mo31609f(C2915s1 c2915s1, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean m31626j;
        s.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8096f) {
            ServiceConnectionC2922t1 serviceConnectionC2922t1 = this.f8096f.get(c2915s1);
            if (serviceConnectionC2922t1 == null) {
                serviceConnectionC2922t1 = new ServiceConnectionC2922t1(this, c2915s1);
                serviceConnectionC2922t1.m31632d(serviceConnection, serviceConnection, str);
                serviceConnectionC2922t1.m31631e(str, executor);
                this.f8096f.put(c2915s1, serviceConnectionC2922t1);
            } else {
                this.f8098h.removeMessages(0, c2915s1);
                if (!serviceConnectionC2922t1.m31628h(serviceConnection)) {
                    serviceConnectionC2922t1.m31632d(serviceConnection, serviceConnection, str);
                    int m31635a = serviceConnectionC2922t1.m31635a();
                    if (m31635a == 1) {
                        serviceConnection.onServiceConnected(serviceConnectionC2922t1.m31634b(), serviceConnectionC2922t1.m31633c());
                    } else if (m31635a == 2) {
                        serviceConnectionC2922t1.m31631e(str, executor);
                    }
                } else {
                    String c2915s12 = c2915s1.toString();
                    StringBuilder sb = new StringBuilder(c2915s12.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(c2915s12);
                    throw new IllegalStateException(sb.toString());
                }
            }
            m31626j = serviceConnectionC2922t1.m31626j();
        }
        return m31626j;
    }
}
