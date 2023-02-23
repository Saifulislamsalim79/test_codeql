package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.j;
import com.google.firebase.C5988g;
import com.google.firebase.auth.AbstractC5197c;
import com.google.firebase.auth.AbstractC5203f;
import com.google.firebase.auth.C5199d;
import com.google.firebase.auth.C5207h;
import com.google.firebase.auth.C5266p;
import com.google.firebase.auth.internal.C5234l0;
import com.google.firebase.auth.internal.C5240o0;
import com.google.firebase.auth.internal.C5243q;
import com.google.firebase.auth.internal.C5244q0;
import com.google.firebase.auth.internal.InterfaceC5216c0;
import com.google.firebase.auth.internal.InterfaceC5252y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yi */
/* loaded from: classes2.dex */
public final class C3663yi extends AbstractC3480rh<C3612wj> {

    /* renamed from: b */
    private final Context f9126b;

    /* renamed from: c */
    private final C3612wj f9127c;

    /* renamed from: d */
    private final Future<C3376nh<C3612wj>> f9128d = mo29955d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3663yi(Context context, C3612wj c3612wj) {
        this.f9126b = context;
        this.f9127c = c3612wj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C5240o0 m29949j(C5988g c5988g, C3640xl c3640xl) {
        s.j(c5988g);
        s.j(c3640xl);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5234l0(c3640xl, "firebase"));
        List<C3302km> m30005s0 = c3640xl.m30005s0();
        if (m30005s0 != null && !m30005s0.isEmpty()) {
            for (int i = 0; i < m30005s0.size(); i++) {
                arrayList.add(new C5234l0(m30005s0.get(i)));
            }
        }
        C5240o0 c5240o0 = new C5240o0(c5988g, arrayList);
        c5240o0.m25311G0(new C5244q0(c3640xl.m30017h(), c3640xl.m30018f()));
        c5240o0.m25313B0(c3640xl.m30002v0());
        c5240o0.m25290y0(c3640xl.m30013l());
        c5240o0.mo25300m0(C5243q.m25284b(c3640xl.m30007r0()));
        return c5240o0;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3480rh
    /* renamed from: d */
    final Future<C3376nh<C3612wj>> mo29955d() {
        Future<C3376nh<C3612wj>> future = this.f9128d;
        if (future != null) {
            return future;
        }
        return C3523t8.m30217a().mo30218g(2).submit(new CallableC3689zi(this.f9127c, this.f9126b));
    }

    /* renamed from: e */
    public final j<Object> m29954e(C5988g c5988g, AbstractC5197c abstractC5197c, String str, InterfaceC5216c0 interfaceC5216c0) {
        C3403oi c3403oi = new C3403oi(abstractC5197c, str);
        c3403oi.m30544d(c5988g);
        c3403oi.m30546b(interfaceC5216c0);
        return m30376b(c3403oi);
    }

    /* renamed from: f */
    public final j<Object> m29953f(C5988g c5988g, String str, String str2, InterfaceC5216c0 interfaceC5216c0) {
        C3455qi c3455qi = new C3455qi(str, str2);
        c3455qi.m30544d(c5988g);
        c3455qi.m30546b(interfaceC5216c0);
        return m30376b(c3455qi);
    }

    /* renamed from: g */
    public final j<Object> m29952g(C5988g c5988g, String str, String str2, String str3, InterfaceC5216c0 interfaceC5216c0) {
        C3507si c3507si = new C3507si(str, str2, str3);
        c3507si.m30544d(c5988g);
        c3507si.m30546b(interfaceC5216c0);
        return m30376b(c3507si);
    }

    /* renamed from: h */
    public final j<Object> m29951h(C5988g c5988g, C5199d c5199d, InterfaceC5216c0 interfaceC5216c0) {
        C3559ui c3559ui = new C3559ui(c5199d);
        c3559ui.m30544d(c5988g);
        c3559ui.m30546b(interfaceC5216c0);
        return m30376b(c3559ui);
    }

    /* renamed from: i */
    public final j<Object> m29950i(C5988g c5988g, C5266p c5266p, String str, InterfaceC5216c0 interfaceC5216c0) {
        C3587vk.m30122a();
        C3611wi c3611wi = new C3611wi(c5266p, str);
        c3611wi.m30544d(c5988g);
        c3611wi.m30546b(interfaceC5216c0);
        return m30376b(c3611wi);
    }

    /* renamed from: k */
    public final j<C5207h> m29948k(C5988g c5988g, AbstractC5203f abstractC5203f, String str, InterfaceC5252y interfaceC5252y) {
        C3558uh c3558uh = new C3558uh(str);
        c3558uh.m30544d(c5988g);
        c3558uh.m30543e(abstractC5203f);
        c3558uh.m30546b(interfaceC5252y);
        c3558uh.m30545c(interfaceC5252y);
        return m30377a(c3558uh);
    }

    /* renamed from: l */
    public final j<Object> m29947l(C5988g c5988g, AbstractC5203f abstractC5203f, AbstractC5197c abstractC5197c, InterfaceC5252y interfaceC5252y) {
        s.j(c5988g);
        s.j(abstractC5197c);
        s.j(abstractC5203f);
        s.j(interfaceC5252y);
        List<String> mo25304j0 = abstractC5203f.mo25304j0();
        if (mo25304j0 != null && mo25304j0.contains(abstractC5197c.mo25237f())) {
            return C4469m.m27766e(C3137ej.m31187a(new Status(17015)));
        }
        if (abstractC5197c instanceof C5199d) {
            C5199d c5199d = (C5199d) abstractC5197c;
            if (!c5199d.m25371e0()) {
                C3610wh c3610wh = new C3610wh(c5199d);
                c3610wh.m30544d(c5988g);
                c3610wh.m30543e(abstractC5203f);
                c3610wh.m30546b(interfaceC5252y);
                c3610wh.m30545c(interfaceC5252y);
                return m30376b(c3610wh);
            }
            C3082ci c3082ci = new C3082ci(c5199d);
            c3082ci.m30544d(c5988g);
            c3082ci.m30543e(abstractC5203f);
            c3082ci.m30546b(interfaceC5252y);
            c3082ci.m30545c(interfaceC5252y);
            return m30376b(c3082ci);
        } else if (abstractC5197c instanceof C5266p) {
            C3587vk.m30122a();
            C3028ai c3028ai = new C3028ai((C5266p) abstractC5197c);
            c3028ai.m30544d(c5988g);
            c3028ai.m30543e(abstractC5203f);
            c3028ai.m30546b(interfaceC5252y);
            c3028ai.m30545c(interfaceC5252y);
            return m30376b(c3028ai);
        } else {
            s.j(c5988g);
            s.j(abstractC5197c);
            s.j(abstractC5203f);
            s.j(interfaceC5252y);
            C3662yh c3662yh = new C3662yh(abstractC5197c);
            c3662yh.m30544d(c5988g);
            c3662yh.m30543e(abstractC5203f);
            c3662yh.m30546b(interfaceC5252y);
            c3662yh.m30545c(interfaceC5252y);
            return m30376b(c3662yh);
        }
    }

    /* renamed from: m */
    public final j<Object> m29946m(C5988g c5988g, AbstractC5203f abstractC5203f, AbstractC5197c abstractC5197c, String str, InterfaceC5252y interfaceC5252y) {
        C3163fi c3163fi = new C3163fi(abstractC5197c, str);
        c3163fi.m30544d(c5988g);
        c3163fi.m30543e(abstractC5203f);
        c3163fi.m30546b(interfaceC5252y);
        c3163fi.m30545c(interfaceC5252y);
        return m30376b(c3163fi);
    }

    /* renamed from: n */
    public final j<Object> m29945n(C5988g c5988g, AbstractC5203f abstractC5203f, C5199d c5199d, InterfaceC5252y interfaceC5252y) {
        C3217hi c3217hi = new C3217hi(c5199d);
        c3217hi.m30544d(c5988g);
        c3217hi.m30543e(abstractC5203f);
        c3217hi.m30546b(interfaceC5252y);
        c3217hi.m30545c(interfaceC5252y);
        return m30376b(c3217hi);
    }

    /* renamed from: o */
    public final j<Object> m29944o(C5988g c5988g, AbstractC5203f abstractC5203f, String str, String str2, String str3, InterfaceC5252y interfaceC5252y) {
        C3271ji c3271ji = new C3271ji(str, str2, str3);
        c3271ji.m30544d(c5988g);
        c3271ji.m30543e(abstractC5203f);
        c3271ji.m30546b(interfaceC5252y);
        c3271ji.m30545c(interfaceC5252y);
        return m30376b(c3271ji);
    }

    /* renamed from: p */
    public final j<Object> m29943p(C5988g c5988g, AbstractC5203f abstractC5203f, C5266p c5266p, String str, InterfaceC5252y interfaceC5252y) {
        C3587vk.m30122a();
        C3325li c3325li = new C3325li(c5266p, str);
        c3325li.m30544d(c5988g);
        c3325li.m30543e(abstractC5203f);
        c3325li.m30546b(interfaceC5252y);
        c3325li.m30545c(interfaceC5252y);
        return m30376b(c3325li);
    }
}
