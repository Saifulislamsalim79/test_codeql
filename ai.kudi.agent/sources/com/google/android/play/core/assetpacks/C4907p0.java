package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.C4951b;
import com.google.android.play.core.common.C4953d;
import com.google.android.play.core.internal.C4958a0;
import com.google.android.play.core.internal.C5006z;
import com.google.android.play.core.internal.InterfaceC4961b0;
import com.google.android.play.core.splitinstall.C5007a;
import com.google.android.play.core.splitinstall.C5008b;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.play.core.assetpacks.p0 */
/* loaded from: classes2.dex */
public final class C4907p0 implements InterfaceC4849d {

    /* renamed from: a */
    private final C4838a3 f12430a;

    /* renamed from: b */
    private InterfaceC4961b0<Context> f12431b;

    /* renamed from: c */
    private InterfaceC4961b0<C4862f2> f12432c;

    /* renamed from: d */
    private InterfaceC4961b0<C4840b0> f12433d;

    /* renamed from: e */
    private InterfaceC4961b0<C4939x0> f12434e;

    /* renamed from: f */
    private InterfaceC4961b0<C4910q> f12435f;

    /* renamed from: g */
    private InterfaceC4961b0<String> f12436g;

    /* renamed from: h */
    private InterfaceC4961b0<InterfaceC4883j3> f12437h;

    /* renamed from: i */
    private InterfaceC4961b0<Executor> f12438i;

    /* renamed from: j */
    private InterfaceC4961b0<C4891l1> f12439j;

    /* renamed from: k */
    private InterfaceC4961b0<C4930v> f12440k;

    /* renamed from: l */
    private InterfaceC4961b0<C4915r0> f12441l;

    /* renamed from: m */
    private InterfaceC4961b0<C4909p2> f12442m;

    /* renamed from: n */
    private InterfaceC4961b0<C4948z1> f12443n;

    /* renamed from: o */
    private InterfaceC4961b0<C4852d2> f12444o;

    /* renamed from: p */
    private InterfaceC4961b0<C4951b> f12445p;

    /* renamed from: q */
    private InterfaceC4961b0<C4877i2> f12446q;

    /* renamed from: r */
    private InterfaceC4961b0<C4875i0> f12447r;

    /* renamed from: s */
    private InterfaceC4961b0<C4904o1> f12448s;

    /* renamed from: t */
    private InterfaceC4961b0<C4927u0> f12449t;

    /* renamed from: u */
    private InterfaceC4961b0<C4890l0> f12450u;

    /* renamed from: v */
    private InterfaceC4961b0<Executor> f12451v;

    /* renamed from: w */
    private InterfaceC4961b0<C4924t1> f12452w;

    /* renamed from: x */
    private InterfaceC4961b0<C5007a> f12453x;

    /* renamed from: y */
    private InterfaceC4961b0<C4933v2> f12454y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4907p0(C4838a3 c4838a3) {
        C4947z0 c4947z0;
        C4848c3 c4848c3;
        C4899n0 c4899n0;
        C4878i3 c4878i3;
        this.f12430a = c4838a3;
        C4863f3 c4863f3 = new C4863f3(c4838a3);
        this.f12431b = c4863f3;
        InterfaceC4961b0<C4862f2> m25952a = C4958a0.m25952a(new C4867g2(c4863f3));
        this.f12432c = m25952a;
        this.f12433d = C4958a0.m25952a(new C4845c0(this.f12431b, m25952a));
        c4947z0 = C4943y0.f12596a;
        InterfaceC4961b0<C4939x0> m25952a2 = C4958a0.m25952a(c4947z0);
        this.f12434e = m25952a2;
        this.f12435f = C4958a0.m25952a(new C4914r(this.f12431b, m25952a2));
        this.f12436g = C4958a0.m25952a(new C4868g3(this.f12431b));
        this.f12437h = new C5006z();
        c4848c3 = C4843b3.f12265a;
        InterfaceC4961b0<Executor> m25952a3 = C4958a0.m25952a(c4848c3);
        this.f12438i = m25952a3;
        this.f12439j = C4958a0.m25952a(new C4896m1(this.f12433d, this.f12437h, this.f12434e, m25952a3));
        C5006z c5006z = new C5006z();
        this.f12440k = c5006z;
        this.f12441l = C4958a0.m25952a(new C4919s0(this.f12433d, this.f12437h, c5006z, this.f12434e));
        this.f12442m = C4958a0.m25952a(new C4913q2(this.f12433d));
        this.f12443n = C4958a0.m25952a(new C4837a2(this.f12433d));
        this.f12444o = C4958a0.m25952a(new C4857e2(this.f12433d, this.f12437h, this.f12439j, this.f12438i, this.f12434e));
        InterfaceC4961b0<C4951b> m25952a4 = C4958a0.m25952a(C4953d.m25968b());
        this.f12445p = m25952a4;
        this.f12446q = C4958a0.m25952a(new C4882j2(this.f12433d, this.f12437h, m25952a4));
        InterfaceC4961b0<C4875i0> m25952a5 = C4958a0.m25952a(new C4880j0(this.f12437h));
        this.f12447r = m25952a5;
        InterfaceC4961b0<C4904o1> m25952a6 = C4958a0.m25952a(new C4908p1(this.f12439j, this.f12433d, m25952a5));
        this.f12448s = m25952a6;
        this.f12449t = C4958a0.m25952a(new C4931v0(this.f12439j, this.f12437h, this.f12441l, this.f12442m, this.f12443n, this.f12444o, this.f12446q, m25952a6));
        c4899n0 = C4895m0.f12406a;
        this.f12450u = C4958a0.m25952a(c4899n0);
        c4878i3 = C4873h3.f12347a;
        InterfaceC4961b0<Executor> m25952a7 = C4958a0.m25952a(c4878i3);
        this.f12451v = m25952a7;
        C5006z.m25875b(this.f12440k, C4958a0.m25952a(new C4934w(this.f12431b, this.f12439j, this.f12449t, this.f12437h, this.f12434e, this.f12450u, this.f12445p, this.f12438i, m25952a7)));
        InterfaceC4961b0<C4924t1> m25952a8 = C4958a0.m25952a(new C4928u1(this.f12436g, this.f12440k, this.f12434e, this.f12431b, this.f12432c, this.f12438i));
        this.f12452w = m25952a8;
        C5006z.m25875b(this.f12437h, C4958a0.m25952a(new C4858e3(this.f12431b, this.f12435f, m25952a8)));
        InterfaceC4961b0<C5007a> m25952a9 = C4958a0.m25952a(C5008b.m25872a(this.f12431b));
        this.f12453x = m25952a9;
        InterfaceC4961b0<C4933v2> m25952a10 = C4958a0.m25952a(new C4937w2(this.f12433d, this.f12437h, this.f12440k, m25952a9, this.f12439j, this.f12434e, this.f12450u, this.f12438i));
        this.f12454y = m25952a10;
        C4958a0.m25952a(new C4853d3(m25952a10, this.f12431b));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4849d
    /* renamed from: a */
    public final void mo26051a(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f12248d = C4863f3.m26121a(this.f12430a);
        assetPackExtractionService.f12249e = this.f12454y.mo15000a();
        assetPackExtractionService.f12250f = this.f12433d.mo15000a();
    }
}
