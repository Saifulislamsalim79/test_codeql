package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4958a0;
import com.google.android.play.core.internal.InterfaceC4961b0;
import com.google.android.play.core.splitinstall.C5007a;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.play.core.assetpacks.w2 */
/* loaded from: classes2.dex */
public final class C4937w2 implements InterfaceC4961b0<C4933v2> {

    /* renamed from: a */
    private final InterfaceC4961b0<C4840b0> f12576a;

    /* renamed from: b */
    private final InterfaceC4961b0<InterfaceC4883j3> f12577b;

    /* renamed from: c */
    private final InterfaceC4961b0<C4930v> f12578c;

    /* renamed from: d */
    private final InterfaceC4961b0<C5007a> f12579d;

    /* renamed from: e */
    private final InterfaceC4961b0<C4891l1> f12580e;

    /* renamed from: f */
    private final InterfaceC4961b0<C4939x0> f12581f;

    /* renamed from: g */
    private final InterfaceC4961b0<C4890l0> f12582g;

    /* renamed from: h */
    private final InterfaceC4961b0<Executor> f12583h;

    public C4937w2(InterfaceC4961b0<C4840b0> interfaceC4961b0, InterfaceC4961b0<InterfaceC4883j3> interfaceC4961b02, InterfaceC4961b0<C4930v> interfaceC4961b03, InterfaceC4961b0<C5007a> interfaceC4961b04, InterfaceC4961b0<C4891l1> interfaceC4961b05, InterfaceC4961b0<C4939x0> interfaceC4961b06, InterfaceC4961b0<C4890l0> interfaceC4961b07, InterfaceC4961b0<Executor> interfaceC4961b08) {
        this.f12576a = interfaceC4961b0;
        this.f12577b = interfaceC4961b02;
        this.f12578c = interfaceC4961b03;
        this.f12579d = interfaceC4961b04;
        this.f12580e = interfaceC4961b05;
        this.f12581f = interfaceC4961b06;
        this.f12582g = interfaceC4961b07;
        this.f12583h = interfaceC4961b08;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4933v2 mo15000a() {
        return new C4933v2(this.f12576a.mo15000a(), C4958a0.m25951b(this.f12577b), this.f12578c.mo15000a(), this.f12579d.mo15000a(), this.f12580e.mo15000a(), this.f12581f.mo15000a(), this.f12582g.mo15000a(), C4958a0.m25951b(this.f12583h));
    }
}
