package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.util.C2970h;
import com.google.android.gms.common.util.InterfaceC2967e;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C4316o7;
import com.google.android.gms.measurement.internal.C4384u4;
import com.google.android.gms.measurement.internal.InterfaceC4188d6;
import com.google.android.gms.measurement.p105a.C4140a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.w2 */
/* loaded from: classes2.dex */
public final class C4046w2 {

    /* renamed from: i */
    private static volatile C4046w2 f9806i;

    /* renamed from: a */
    private final String f9807a;

    /* renamed from: b */
    protected final InterfaceC2967e f9808b;

    /* renamed from: c */
    protected final ExecutorService f9809c;

    /* renamed from: d */
    private final C4140a f9810d;

    /* renamed from: e */
    private final List<Pair<InterfaceC4188d6, C3888m2>> f9811e;

    /* renamed from: f */
    private int f9812f;

    /* renamed from: g */
    private boolean f9813g;

    /* renamed from: h */
    private volatile f1 f9814h;

    protected C4046w2(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str != null && m28711n(str2, str3)) {
            this.f9807a = str;
        } else {
            this.f9807a = "FA";
        }
        this.f9808b = C2970h.m31533c();
        this.f9809c = C4092z0.m28584a().mo28617a(new ThreadFactoryC3777f2(this), 1);
        this.f9810d = new C4140a(this);
        this.f9811e = new ArrayList();
        try {
            if (C4316o7.m28008c(context, "google_app_id", C4384u4.m27951a(context)) != null && !m28715j()) {
                this.f9813g = true;
                Log.w(this.f9807a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m28711n(str2, str3)) {
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f9807a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f9807a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        m28712m(new C4029v1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f9807a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C4030v2(this));
        }
    }

    /* renamed from: j */
    protected static final boolean m28715j() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m28714k(Exception exc, boolean z, boolean z2) {
        this.f9813g |= z;
        if (z) {
            Log.w(this.f9807a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            m28724a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f9807a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: l */
    private final void m28713l(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m28712m(new C3841j2(this, l, str, str2, bundle, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m28712m(AbstractRunnableC3873l2 abstractRunnableC3873l2) {
        this.f9809c.execute(abstractRunnableC3873l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final boolean m28711n(String str, String str2) {
        return (str2 == null || str == null || m28715j()) ? false : true;
    }

    /* renamed from: t */
    public static C4046w2 m28705t(Context context, String str, String str2, String str3, Bundle bundle) {
        com.google.android.gms.common.internal.s.j(context);
        if (f9806i == null) {
            synchronized (C4046w2.class) {
                if (f9806i == null) {
                    f9806i = new C4046w2(context, str, str2, str3, bundle);
                }
            }
        }
        return f9806i;
    }

    /* renamed from: A */
    public final Map<String, Object> m28733A(String str, String str2, boolean z) {
        C3715b1 c3715b1 = new C3715b1();
        m28712m(new C3748d2(this, str, str2, z, c3715b1));
        Bundle m29831n = c3715b1.m29831n(5000L);
        if (m29831n != null && m29831n.size() != 0) {
            HashMap hashMap = new HashMap(m29831n.size());
            for (String str3 : m29831n.keySet()) {
                Object obj = m29831n.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    /* renamed from: E */
    public final void m28729E(String str) {
        m28712m(new C4045w1(this, str));
    }

    /* renamed from: F */
    public final void m28728F(String str, String str2, Bundle bundle) {
        m28712m(new C3965r1(this, str, str2, bundle));
    }

    /* renamed from: G */
    public final void m28727G(String str) {
        m28712m(new C4061x1(this, str));
    }

    /* renamed from: H */
    public final void m28726H(String str, Bundle bundle) {
        m28713l(null, str, bundle, false, true, null);
    }

    /* renamed from: I */
    public final void m28725I(String str, String str2, Bundle bundle) {
        m28713l(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    public final void m28724a(int i, String str, Object obj, Object obj2, Object obj3) {
        m28712m(new C3763e2(this, false, 5, str, obj, null, null));
    }

    /* renamed from: b */
    public final void m28723b(InterfaceC4188d6 interfaceC4188d6) {
        com.google.android.gms.common.internal.s.j(interfaceC4188d6);
        synchronized (this.f9811e) {
            for (int i = 0; i < this.f9811e.size(); i++) {
                if (interfaceC4188d6.equals(this.f9811e.get(i).first)) {
                    Log.w(this.f9807a, "OnEventListener already registered.");
                    return;
                }
            }
            C3888m2 c3888m2 = new C3888m2(interfaceC4188d6);
            this.f9811e.add(new Pair<>(interfaceC4188d6, c3888m2));
            if (this.f9814h != null) {
                try {
                    this.f9814h.registerOnMeasurementEventListener(c3888m2);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f9807a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m28712m(new C3825i2(this, c3888m2));
        }
    }

    /* renamed from: c */
    public final void m28722c(Bundle bundle) {
        m28712m(new C3949q1(this, bundle));
    }

    /* renamed from: d */
    public final void m28721d(Activity activity, String str, String str2) {
        m28712m(new C4013u1(this, activity, str, str2));
    }

    /* renamed from: e */
    public final void m28720e(boolean z) {
        m28712m(new C3809h2(this, z));
    }

    /* renamed from: f */
    public final void m28719f(String str) {
        m28712m(new C3997t1(this, str));
    }

    /* renamed from: g */
    public final void m28718g(String str, String str2, Object obj, boolean z) {
        m28712m(new C3857k2(this, str, str2, obj, z));
    }

    /* renamed from: o */
    public final int m28710o(String str) {
        C3715b1 c3715b1 = new C3715b1();
        m28712m(new C3793g2(this, str, c3715b1));
        Integer num = (Integer) C3715b1.m29829p1(c3715b1.m29831n(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: p */
    public final long m28709p() {
        C3715b1 c3715b1 = new C3715b1();
        m28712m(new C3699a2(this, c3715b1));
        Long l = (Long) C3715b1.m29829p1(c3715b1.m29831n(500L), Long.class);
        if (l == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f9808b.currentTimeMillis()).nextLong();
            int i = this.f9812f + 1;
            this.f9812f = i;
            return nextLong + i;
        }
        return l.longValue();
    }

    /* renamed from: q */
    public final C4140a m28708q() {
        return this.f9810d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final f1 m28706s(Context context, boolean z) {
        try {
            return e1.asInterface(DynamiteModule.m31489e(context, DynamiteModule.f8162d, ModuleDescriptor.MODULE_ID).m31490d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            m28714k(e, true, false);
            return null;
        }
    }

    /* renamed from: v */
    public final String m28703v() {
        C3715b1 c3715b1 = new C3715b1();
        m28712m(new C4093z1(this, c3715b1));
        return c3715b1.m29830o(50L);
    }

    /* renamed from: w */
    public final String m28702w() {
        C3715b1 c3715b1 = new C3715b1();
        m28712m(new C3732c2(this, c3715b1));
        return c3715b1.m29830o(500L);
    }

    /* renamed from: x */
    public final String m28701x() {
        C3715b1 c3715b1 = new C3715b1();
        m28712m(new C3716b2(this, c3715b1));
        return c3715b1.m29830o(500L);
    }

    /* renamed from: y */
    public final String m28700y() {
        C3715b1 c3715b1 = new C3715b1();
        m28712m(new C4077y1(this, c3715b1));
        return c3715b1.m29830o(500L);
    }

    /* renamed from: z */
    public final List<Bundle> m28699z(String str, String str2) {
        C3715b1 c3715b1 = new C3715b1();
        m28712m(new C3981s1(this, str, str2, c3715b1));
        List<Bundle> list = (List) C3715b1.m29829p1(c3715b1.m29831n(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }
}
