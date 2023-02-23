package com.google.firebase.analytics.p111a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.C4046w2;
import com.google.android.gms.measurement.p105a.C4140a;
import com.google.firebase.C5987f;
import com.google.firebase.C5988g;
import com.google.firebase.analytics.connector.internal.C5185c;
import com.google.firebase.analytics.connector.internal.C5187e;
import com.google.firebase.analytics.connector.internal.C5189g;
import com.google.firebase.analytics.connector.internal.InterfaceC5183a;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.p167m.C6470a;
import com.google.firebase.p167m.InterfaceC6473d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
/* renamed from: com.google.firebase.analytics.a.b */
/* loaded from: classes2.dex */
public class C5178b implements InterfaceC5174a {

    /* renamed from: c */
    private static volatile InterfaceC5174a f12909c;

    /* renamed from: a */
    final C4140a f12910a;

    /* renamed from: b */
    final Map<String, InterfaceC5183a> f12911b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
    /* renamed from: com.google.firebase.analytics.a.b$a */
    /* loaded from: classes2.dex */
    class C5179a implements InterfaceC5174a.InterfaceC5175a {

        /* renamed from: a */
        final /* synthetic */ String f12912a;

        C5179a(String str) {
            this.f12912a = str;
        }

        @Override // com.google.firebase.analytics.p111a.InterfaceC5174a.InterfaceC5175a
        /* renamed from: a */
        public void mo22580a(Set<String> set) {
            if (!C5178b.this.m25444k(this.f12912a) || !this.f12912a.equals("fiam") || set == null || set.isEmpty()) {
                return;
            }
            C5178b.this.f12911b.get(this.f12912a).mo25416a(set);
        }
    }

    C5178b(C4140a c4140a) {
        s.j(c4140a);
        this.f12910a = c4140a;
        this.f12911b = new ConcurrentHashMap();
    }

    /* renamed from: h */
    public static InterfaceC5174a m25447h(C5988g c5988g, Context context, InterfaceC6473d interfaceC6473d) {
        s.j(c5988g);
        s.j(context);
        s.j(interfaceC6473d);
        s.j(context.getApplicationContext());
        if (f12909c == null) {
            synchronized (C5178b.class) {
                if (f12909c == null) {
                    Bundle bundle = new Bundle(1);
                    if (c5988g.m23082t()) {
                        interfaceC6473d.mo21933b(C5987f.class, ExecutorC5181d.f12915c, C5180c.f12914a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", c5988g.m23083s());
                    }
                    f12909c = new C5178b(C4046w2.m28705t(context, null, null, null, bundle).m28708q());
                }
            }
        }
        return f12909c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ void m25446i(C6470a c6470a) {
        boolean z = ((C5987f) c6470a.m21936a()).f14656a;
        synchronized (C5178b.class) {
            InterfaceC5174a interfaceC5174a = f12909c;
            s.j(interfaceC5174a);
            ((C5178b) interfaceC5174a).f12910a.m28477i(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final boolean m25444k(String str) {
        return (str.isEmpty() || !this.f12911b.containsKey(str) || this.f12911b.get(str) == null) ? false : true;
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: a */
    public Map<String, Object> mo22589a(boolean z) {
        return this.f12910a.m28482d(null, null, z);
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: b */
    public void mo22588b(InterfaceC5174a.C5177c c5177c) {
        if (C5185c.m25423i(c5177c)) {
            this.f12910a.m28479g(C5185c.m25431a(c5177c));
        }
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: c */
    public void mo22587c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C5185c.m25420l(str) && C5185c.m25422j(str2, bundle) && C5185c.m25424h(str, str2, bundle)) {
            C5185c.m25427e(str, str2, bundle);
            this.f12910a.m28481e(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || C5185c.m25422j(str2, bundle)) {
            this.f12910a.m28485a(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: d */
    public int mo22586d(String str) {
        return this.f12910a.m28483c(str);
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: e */
    public List<InterfaceC5174a.C5177c> mo22585e(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f12910a.m28484b(str, str2)) {
            arrayList.add(C5185c.m25430b(bundle));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: f */
    public void mo22584f(String str, String str2, Object obj) {
        if (C5185c.m25420l(str) && C5185c.m25419m(str, str2)) {
            this.f12910a.m28478h(str, str2, obj);
        }
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: g */
    public InterfaceC5174a.InterfaceC5175a mo22583g(String str, InterfaceC5174a.InterfaceC5176b interfaceC5176b) {
        InterfaceC5183a c5189g;
        s.j(interfaceC5176b);
        if (C5185c.m25420l(str) && !m25444k(str)) {
            C4140a c4140a = this.f12910a;
            if ("fiam".equals(str)) {
                c5189g = new C5187e(c4140a, interfaceC5176b);
            } else {
                c5189g = ("crash".equals(str) || "clx".equals(str)) ? new C5189g(c4140a, interfaceC5176b) : null;
            }
            if (c5189g != null) {
                this.f12911b.put(str, c5189g);
                return new C5179a(str);
            }
            return null;
        }
        return null;
    }
}
