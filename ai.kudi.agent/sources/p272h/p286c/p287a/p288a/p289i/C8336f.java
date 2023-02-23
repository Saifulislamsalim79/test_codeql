package p272h.p286c.p287a.p288a.p289i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C2641j;
import com.google.android.datatransport.runtime.backends.C2644l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2671t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2672u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2673v;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2674w;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC2675x;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p288a.p289i.AbstractC8358u;
import p272h.p286c.p287a.p288a.p289i.p290a0.C8246c;
import p272h.p286c.p287a.p288a.p289i.p290a0.C8247d;
import p272h.p286c.p287a.p288a.p289i.p290a0.C8250g;
import p272h.p286c.p287a.p288a.p289i.p290a0.C8252i;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8279l0;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8282m0;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8284n0;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8287o0;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8292q0;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8298r0;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8303t0;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
import p272h.p286c.p287a.p288a.p289i.p292b0.C8320c;
import p272h.p286c.p287a.p288a.p289i.p292b0.C8322d;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8362a;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8364c;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8365d;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerTransportRuntimeComponent.java */
/* renamed from: h.c.a.a.i.f */
/* loaded from: classes2.dex */
public final class C8336f extends AbstractC8358u {

    /* renamed from: A */
    private InterfaceC11700a<InterfaceC2675x> f19981A;

    /* renamed from: B */
    private InterfaceC11700a<C8246c> f19982B;

    /* renamed from: C */
    private InterfaceC11700a<C2671t> f19983C;

    /* renamed from: D */
    private InterfaceC11700a<C2673v> f19984D;

    /* renamed from: E */
    private InterfaceC11700a<C8357t> f19985E;

    /* renamed from: c */
    private InterfaceC11700a<Executor> f19986c;

    /* renamed from: d */
    private InterfaceC11700a<Context> f19987d;

    /* renamed from: e */
    private InterfaceC11700a f19988e;

    /* renamed from: f */
    private InterfaceC11700a f19989f;

    /* renamed from: w */
    private InterfaceC11700a f19990w;

    /* renamed from: x */
    private InterfaceC11700a<String> f19991x;

    /* renamed from: y */
    private InterfaceC11700a<C8292q0> f19992y;

    /* renamed from: z */
    private InterfaceC11700a<AbstractC2666s> f19993z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerTransportRuntimeComponent.java */
    /* renamed from: h.c.a.a.i.f$b */
    /* loaded from: classes2.dex */
    public static final class C8338b implements AbstractC8358u.InterfaceC8359a {

        /* renamed from: a */
        private Context f19994a;

        private C8338b() {
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8358u.InterfaceC8359a
        /* renamed from: a */
        public /* bridge */ /* synthetic */ AbstractC8358u.InterfaceC8359a mo16218a(Context context) {
            m16290b(context);
            return this;
        }

        /* renamed from: b */
        public C8338b m16290b(Context context) {
            C8365d.m16209b(context);
            this.f19994a = context;
            return this;
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8358u.InterfaceC8359a
        public AbstractC8358u build() {
            C8365d.m16210a(this.f19994a, Context.class);
            return new C8336f(this.f19994a);
        }
    }

    /* renamed from: F */
    private void m16292F(Context context) {
        this.f19986c = C8362a.m16213b(C8345l.m16261a());
        InterfaceC8363b m16211a = C8364c.m16211a(context);
        this.f19987d = m16211a;
        C2641j m32458a = C2641j.m32458a(m16211a, C8320c.m16303a(), C8322d.m16299a());
        this.f19988e = m32458a;
        this.f19989f = C8362a.m16213b(C2644l.m32450a(this.f19987d, m32458a));
        this.f19990w = C8303t0.m16317a(this.f19987d, C8279l0.m16406a(), C8284n0.m16399a());
        this.f19991x = C8282m0.m16402a(this.f19987d);
        this.f19992y = C8362a.m16213b(C8298r0.m16328a(C8320c.m16303a(), C8322d.m16299a(), C8287o0.m16395a(), this.f19990w, this.f19991x));
        C8250g m16428b = C8250g.m16428b(C8320c.m16303a());
        this.f19993z = m16428b;
        C8252i m16425a = C8252i.m16425a(this.f19987d, this.f19992y, m16428b, C8322d.m16299a());
        this.f19981A = m16425a;
        InterfaceC11700a<Executor> interfaceC11700a = this.f19986c;
        InterfaceC11700a interfaceC11700a2 = this.f19989f;
        InterfaceC11700a<C8292q0> interfaceC11700a3 = this.f19992y;
        this.f19982B = C8247d.m16434a(interfaceC11700a, interfaceC11700a2, m16425a, interfaceC11700a3, interfaceC11700a3);
        InterfaceC11700a<Context> interfaceC11700a4 = this.f19987d;
        InterfaceC11700a interfaceC11700a5 = this.f19989f;
        InterfaceC11700a<C8292q0> interfaceC11700a6 = this.f19992y;
        this.f19983C = C2672u.m32408a(interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, this.f19981A, this.f19986c, interfaceC11700a6, C8320c.m16303a(), C8322d.m16299a(), this.f19992y);
        InterfaceC11700a<Executor> interfaceC11700a7 = this.f19986c;
        InterfaceC11700a<C8292q0> interfaceC11700a8 = this.f19992y;
        this.f19984D = C2674w.m32402a(interfaceC11700a7, interfaceC11700a8, this.f19981A, interfaceC11700a8);
        this.f19985E = C8362a.m16213b(C8360v.m16217a(C8320c.m16303a(), C8322d.m16299a(), this.f19982B, this.f19983C, this.f19984D));
    }

    /* renamed from: m */
    public static AbstractC8358u.InterfaceC8359a m16291m() {
        return new C8338b();
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8358u
    /* renamed from: c */
    InterfaceC8272i0 mo16220c() {
        return this.f19992y.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8358u
    /* renamed from: g */
    public C8357t mo16219g() {
        return this.f19985E.get();
    }

    private C8336f(Context context) {
        m16292F(context);
    }
}
