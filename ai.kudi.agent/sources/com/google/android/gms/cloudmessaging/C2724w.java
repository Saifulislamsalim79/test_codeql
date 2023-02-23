package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.p103q.ThreadFactoryC2978a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p272h.p286c.p287a.p300b.p307d.p311d.C8421e;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.w */
/* loaded from: classes2.dex */
public final class C2724w {

    /* renamed from: e */
    private static C2724w f7671e;

    /* renamed from: a */
    private final Context f7672a;

    /* renamed from: b */
    private final ScheduledExecutorService f7673b;

    /* renamed from: c */
    private ServiceConnectionC2719r f7674c = new ServiceConnectionC2719r(this, null);

    /* renamed from: d */
    private int f7675d = 1;

    C2724w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7673b = scheduledExecutorService;
        this.f7672a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m32116a(C2724w c2724w) {
        return c2724w.f7672a;
    }

    /* renamed from: b */
    public static synchronized C2724w m32115b(Context context) {
        C2724w c2724w;
        synchronized (C2724w.class) {
            if (f7671e == null) {
                C8421e.m16116a();
                f7671e = new C2724w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC2978a("MessengerIpcClient"))));
            }
            c2724w = f7671e;
        }
        return c2724w;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ ScheduledExecutorService m32112e(C2724w c2724w) {
        return c2724w.f7673b;
    }

    /* renamed from: f */
    private final synchronized int m32111f() {
        int i;
        i = this.f7675d;
        this.f7675d = i + 1;
        return i;
    }

    /* renamed from: g */
    private final synchronized <T> com.google.android.gms.tasks.j<T> m32110g(AbstractC2722u<T> abstractC2722u) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(abstractC2722u);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f7674c.m32122g(abstractC2722u)) {
            ServiceConnectionC2719r serviceConnectionC2719r = new ServiceConnectionC2719r(this, null);
            this.f7674c = serviceConnectionC2719r;
            serviceConnectionC2719r.m32122g(abstractC2722u);
        }
        return abstractC2722u.f7668b.m27777a();
    }

    /* renamed from: c */
    public final com.google.android.gms.tasks.j<Void> m32114c(int i, Bundle bundle) {
        return m32110g(new C2721t(m32111f(), 2, bundle));
    }

    /* renamed from: d */
    public final com.google.android.gms.tasks.j<Bundle> m32113d(int i, Bundle bundle) {
        return m32110g(new C2723v(m32111f(), 1, bundle));
    }
}
