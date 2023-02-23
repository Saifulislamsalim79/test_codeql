package com.google.firebase.inappmessaging.display.internal.p149r.p150a;

import android.app.Application;
import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.internal.C6036a;
import com.google.firebase.inappmessaging.display.internal.C6037b;
import com.google.firebase.inappmessaging.display.internal.C6048g;
import com.google.firebase.inappmessaging.display.internal.C6051h;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6104a;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6105b;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6110g;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6112h;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6113i;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6114j;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6115k;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6116l;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6117m;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6118n;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6119o;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6120p;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6031b;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6032c;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import java.util.Map;
import p472k.p473a.InterfaceC11700a;
/* compiled from: DaggerUniversalComponent.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.a.d */
/* loaded from: classes2.dex */
public final class C6099d implements InterfaceC6103f {

    /* renamed from: a */
    private InterfaceC11700a<Application> f14918a;

    /* renamed from: b */
    private InterfaceC11700a<C6048g> f14919b;

    /* renamed from: c */
    private InterfaceC11700a<C6036a> f14920c;

    /* renamed from: d */
    private InterfaceC11700a<DisplayMetrics> f14921d;

    /* renamed from: e */
    private InterfaceC11700a<C6057l> f14922e;

    /* renamed from: f */
    private InterfaceC11700a<C6057l> f14923f;

    /* renamed from: g */
    private InterfaceC11700a<C6057l> f14924g;

    /* renamed from: h */
    private InterfaceC11700a<C6057l> f14925h;

    /* renamed from: i */
    private InterfaceC11700a<C6057l> f14926i;

    /* renamed from: j */
    private InterfaceC11700a<C6057l> f14927j;

    /* renamed from: k */
    private InterfaceC11700a<C6057l> f14928k;

    /* renamed from: l */
    private InterfaceC11700a<C6057l> f14929l;

    /* compiled from: DaggerUniversalComponent.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.r.a.d$b */
    /* loaded from: classes2.dex */
    public static final class C6101b {

        /* renamed from: a */
        private C6104a f14930a;

        /* renamed from: b */
        private C6110g f14931b;

        /* renamed from: a */
        public C6101b m22741a(C6104a c6104a) {
            C6033d.m22946b(c6104a);
            this.f14930a = c6104a;
            return this;
        }

        /* renamed from: b */
        public InterfaceC6103f m22740b() {
            C6033d.m22947a(this.f14930a, C6104a.class);
            if (this.f14931b == null) {
                this.f14931b = new C6110g();
            }
            return new C6099d(this.f14930a, this.f14931b);
        }

        private C6101b() {
        }
    }

    /* renamed from: e */
    public static C6101b m22743e() {
        return new C6101b();
    }

    /* renamed from: f */
    private void m22742f(C6104a c6104a, C6110g c6110g) {
        this.f14918a = C6031b.m22952a(C6105b.m22730a(c6104a));
        this.f14919b = C6031b.m22952a(C6051h.m22901a());
        this.f14920c = C6031b.m22952a(C6037b.m22936a(this.f14918a));
        C6116l m22697a = C6116l.m22697a(c6110g, this.f14918a);
        this.f14921d = m22697a;
        this.f14922e = C6120p.m22685a(c6110g, m22697a);
        this.f14923f = C6117m.m22694a(c6110g, this.f14921d);
        this.f14924g = C6118n.m22691a(c6110g, this.f14921d);
        this.f14925h = C6119o.m22688a(c6110g, this.f14921d);
        this.f14926i = C6114j.m22703a(c6110g, this.f14921d);
        this.f14927j = C6115k.m22700a(c6110g, this.f14921d);
        this.f14928k = C6113i.m22706a(c6110g, this.f14921d);
        this.f14929l = C6112h.m22709a(c6110g, this.f14921d);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p149r.p150a.InterfaceC6103f
    /* renamed from: a */
    public C6048g mo22735a() {
        return this.f14919b.get();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p149r.p150a.InterfaceC6103f
    /* renamed from: b */
    public Application mo22734b() {
        return this.f14918a.get();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p149r.p150a.InterfaceC6103f
    /* renamed from: c */
    public Map<String, InterfaceC11700a<C6057l>> mo22733c() {
        C6032c m22949b = C6032c.m22949b(8);
        m22949b.m22948c("IMAGE_ONLY_PORTRAIT", this.f14922e);
        m22949b.m22948c("IMAGE_ONLY_LANDSCAPE", this.f14923f);
        m22949b.m22948c("MODAL_LANDSCAPE", this.f14924g);
        m22949b.m22948c("MODAL_PORTRAIT", this.f14925h);
        m22949b.m22948c("CARD_LANDSCAPE", this.f14926i);
        m22949b.m22948c("CARD_PORTRAIT", this.f14927j);
        m22949b.m22948c("BANNER_PORTRAIT", this.f14928k);
        m22949b.m22948c("BANNER_LANDSCAPE", this.f14929l);
        return m22949b.m22950a();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p149r.p150a.InterfaceC6103f
    /* renamed from: d */
    public C6036a mo22732d() {
        return this.f14920c.get();
    }

    private C6099d(C6104a c6104a, C6110g c6110g) {
        m22742f(c6104a, c6110g);
    }
}
