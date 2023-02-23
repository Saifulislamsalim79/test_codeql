package com.google.firebase.inappmessaging.p154j0;

import android.text.TextUtils;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.inappmessaging.C6359k;
import java.util.HashSet;
import java.util.Set;
import p272h.p286c.p355d.p356a.p357a.p358a.C9370c;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9388e;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.EnumC11269a;
import p425j.p444e.InterfaceC11672h;
import p425j.p444e.InterfaceC11675i;
import p425j.p444e.p449d0.AbstractC11285a;
/* compiled from: AnalyticsEventsManager.java */
/* renamed from: com.google.firebase.inappmessaging.j0.j2 */
/* loaded from: classes2.dex */
public class C6202j2 {

    /* renamed from: a */
    private final InterfaceC5174a f15070a;

    /* renamed from: b */
    private final AbstractC11285a<String> f15071b;

    /* renamed from: c */
    private InterfaceC5174a.InterfaceC5175a f15072c;

    /* compiled from: AnalyticsEventsManager.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.j2$a */
    /* loaded from: classes2.dex */
    private class C6203a implements InterfaceC11675i<String> {
        C6203a() {
        }

        @Override // p425j.p444e.InterfaceC11675i
        public void subscribe(InterfaceC11672h<String> interfaceC11672h) {
            C6163c3.m22621a("Subscribing to analytics events.");
            C6202j2 c6202j2 = C6202j2.this;
            c6202j2.f15072c = c6202j2.f15070a.mo22583g("fiam", new C6331t2(interfaceC11672h));
        }
    }

    public C6202j2(InterfaceC5174a interfaceC5174a) {
        this.f15070a = interfaceC5174a;
        AbstractC11285a<String> m11194E = AbstractC11293f.m11179f(new C6203a(), EnumC11269a.BUFFER).m11194E();
        this.f15071b = m11194E;
        m11194E.m11201Q();
    }

    /* renamed from: c */
    static Set<String> m22576c(C9388e c9388e) {
        HashSet hashSet = new HashSet();
        for (C9370c c9370c : c9388e.m14869V()) {
            for (C6359k c6359k : c9370c.m14930Y()) {
                if (!TextUtils.isEmpty(c6359k.m22209S().m22644T())) {
                    hashSet.add(c6359k.m22209S().m22644T());
                }
            }
        }
        if (hashSet.size() > 50) {
            C6163c3.m22619c("Too many contextual triggers defined - limiting to 50");
        }
        return hashSet;
    }

    /* renamed from: d */
    public AbstractC11285a<String> m22575d() {
        return this.f15071b;
    }

    /* renamed from: e */
    public void m22574e(C9388e c9388e) {
        Set<String> m22576c = m22576c(c9388e);
        C6163c3.m22621a("Updating contextual triggers for the following analytics events: " + m22576c);
        this.f15072c.mo22580a(m22576c);
    }
}
