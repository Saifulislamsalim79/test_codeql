package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.common.util.C2970h;
import com.google.android.gms.common.util.InterfaceC2966d;
import com.google.android.gms.common.util.InterfaceC2967e;
import com.google.android.gms.tasks.C4469m;
import com.google.firebase.C5988g;
import com.google.firebase.abt.C5171b;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.remoteconfig.internal.C6751j;
import com.google.firebase.remoteconfig.internal.C6754k;
import com.google.firebase.remoteconfig.internal.C6757l;
import com.google.firebase.remoteconfig.internal.C6759m;
import com.google.firebase.remoteconfig.internal.C6760n;
import com.google.firebase.remoteconfig.internal.C6762o;
import com.google.firebase.remoteconfig.internal.C6768s;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: RemoteConfigComponent.java */
/* renamed from: com.google.firebase.remoteconfig.o */
/* loaded from: classes2.dex */
public class C6772o {

    /* renamed from: j */
    private static final InterfaceC2967e f16297j = C2970h.m31533c();

    /* renamed from: k */
    private static final Random f16298k = new Random();

    /* renamed from: a */
    private final Map<String, k> f16299a;

    /* renamed from: b */
    private final Context f16300b;

    /* renamed from: c */
    private final ExecutorService f16301c;

    /* renamed from: d */
    private final C5988g f16302d;

    /* renamed from: e */
    private final InterfaceC6432h f16303e;

    /* renamed from: f */
    private final C5171b f16304f;

    /* renamed from: g */
    private final InterfaceC6560b<InterfaceC5174a> f16305g;

    /* renamed from: h */
    private final String f16306h;

    /* renamed from: i */
    private Map<String, String> f16307i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6772o(Context context, C5988g c5988g, InterfaceC6432h interfaceC6432h, C5171b c5171b, InterfaceC6560b<InterfaceC5174a> interfaceC6560b) {
        this(context, Executors.newCachedThreadPool(), c5988g, interfaceC6432h, c5171b, interfaceC6560b, true);
    }

    /* renamed from: c */
    private C6751j m20792c(String str, String str2) {
        return C6751j.m20887f(Executors.newCachedThreadPool(), C6762o.m20812c(this.f16300b, String.format("%s_%s_%s_%s.json", "frc", this.f16306h, str, str2)));
    }

    /* renamed from: g */
    private C6759m m20788g(C6751j c6751j, C6751j c6751j2) {
        return new C6759m(this.f16301c, c6751j, c6751j2);
    }

    /* renamed from: h */
    static C6760n m20787h(Context context, String str, String str2) {
        return new C6760n(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    /* renamed from: i */
    private static C6768s m20786i(C5988g c5988g, String str, InterfaceC6560b<InterfaceC5174a> interfaceC6560b) {
        if (m20784k(c5988g) && str.equals("firebase")) {
            return new C6768s(interfaceC6560b);
        }
        return null;
    }

    /* renamed from: j */
    private static boolean m20785j(C5988g c5988g, String str) {
        return str.equals("firebase") && m20784k(c5988g);
    }

    /* renamed from: k */
    private static boolean m20784k(C5988g c5988g) {
        return c5988g.m23090l().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static /* synthetic */ InterfaceC5174a m20783l() {
        return null;
    }

    /* renamed from: a */
    synchronized k m20794a(C5988g c5988g, String str, InterfaceC6432h interfaceC6432h, C5171b c5171b, Executor executor, C6751j c6751j, C6751j c6751j2, C6751j c6751j3, C6757l c6757l, C6759m c6759m, C6760n c6760n) {
        if (!this.f16299a.containsKey(str)) {
            k kVar = new k(this.f16300b, c5988g, interfaceC6432h, m20785j(c5988g, str) ? c5171b : null, executor, c6751j, c6751j2, c6751j3, c6757l, c6759m, c6760n);
            kVar.u();
            this.f16299a.put(str, kVar);
        }
        return this.f16299a.get(str);
    }

    /* renamed from: b */
    public synchronized k m20793b(String str) {
        C6751j m20792c;
        C6751j m20792c2;
        C6751j m20792c3;
        C6760n m20787h;
        C6759m m20788g;
        m20792c = m20792c(str, "fetch");
        m20792c2 = m20792c(str, "activate");
        m20792c3 = m20792c(str, "defaults");
        m20787h = m20787h(this.f16300b, this.f16306h, str);
        m20788g = m20788g(m20792c2, m20792c3);
        final C6768s m20786i = m20786i(this.f16302d, str, this.f16305g);
        if (m20786i != null) {
            Objects.requireNonNull(m20786i);
            m20788g.m20840a(new InterfaceC2966d() { // from class: com.google.firebase.remoteconfig.i
                @Override // com.google.android.gms.common.util.InterfaceC2966d
                /* renamed from: a */
                public final void mo20907a(Object obj, Object obj2) {
                    C6768s.this.m20801a((String) obj, (C6754k) obj2);
                }
            });
        }
        return m20794a(this.f16302d, str, this.f16303e, this.f16304f, this.f16301c, m20792c, m20792c2, m20792c3, m20790e(str, m20792c, m20787h), m20788g, m20787h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public k m20791d() {
        return m20793b("firebase");
    }

    /* renamed from: e */
    synchronized C6757l m20790e(String str, C6751j c6751j, C6760n c6760n) {
        return new C6757l(this.f16303e, m20784k(this.f16302d) ? this.f16305g : C6739g.f16212a, this.f16301c, f16297j, f16298k, c6751j, m20789f(this.f16302d.m23089m().m23069b(), str, c6760n), c6760n, this.f16307i);
    }

    /* renamed from: f */
    ConfigFetchHttpClient m20789f(String str, String str2, C6760n c6760n) {
        return new ConfigFetchHttpClient(this.f16300b, this.f16302d.m23089m().m23068c(), str, str2, c6760n.m20828b(), c6760n.m20828b());
    }

    protected C6772o(Context context, ExecutorService executorService, C5988g c5988g, InterfaceC6432h interfaceC6432h, C5171b c5171b, InterfaceC6560b<InterfaceC5174a> interfaceC6560b, boolean z) {
        this.f16299a = new HashMap();
        this.f16307i = new HashMap();
        this.f16300b = context;
        this.f16301c = executorService;
        this.f16302d = c5988g;
        this.f16303e = interfaceC6432h;
        this.f16304f = c5171b;
        this.f16305g = interfaceC6560b;
        this.f16306h = c5988g.m23089m().m23068c();
        if (z) {
            C4469m.m27768c(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.j
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C6772o.this.m20791d();
                }
            });
        }
    }
}
