package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.C4951b;
import com.google.android.play.core.internal.C4958a0;
import com.google.android.play.core.internal.InterfaceC4961b0;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.play.core.assetpacks.w */
/* loaded from: classes2.dex */
public final class C4934w implements InterfaceC4961b0<C4930v> {

    /* renamed from: a */
    private final InterfaceC4961b0<Context> f12558a;

    /* renamed from: b */
    private final InterfaceC4961b0<C4891l1> f12559b;

    /* renamed from: c */
    private final InterfaceC4961b0<C4927u0> f12560c;

    /* renamed from: d */
    private final InterfaceC4961b0<InterfaceC4883j3> f12561d;

    /* renamed from: e */
    private final InterfaceC4961b0<C4939x0> f12562e;

    /* renamed from: f */
    private final InterfaceC4961b0<C4890l0> f12563f;

    /* renamed from: g */
    private final InterfaceC4961b0<C4951b> f12564g;

    /* renamed from: h */
    private final InterfaceC4961b0<Executor> f12565h;

    /* renamed from: i */
    private final InterfaceC4961b0<Executor> f12566i;

    public C4934w(InterfaceC4961b0<Context> interfaceC4961b0, InterfaceC4961b0<C4891l1> interfaceC4961b02, InterfaceC4961b0<C4927u0> interfaceC4961b03, InterfaceC4961b0<InterfaceC4883j3> interfaceC4961b04, InterfaceC4961b0<C4939x0> interfaceC4961b05, InterfaceC4961b0<C4890l0> interfaceC4961b06, InterfaceC4961b0<C4951b> interfaceC4961b07, InterfaceC4961b0<Executor> interfaceC4961b08, InterfaceC4961b0<Executor> interfaceC4961b09) {
        this.f12558a = interfaceC4961b0;
        this.f12559b = interfaceC4961b02;
        this.f12560c = interfaceC4961b03;
        this.f12561d = interfaceC4961b04;
        this.f12562e = interfaceC4961b05;
        this.f12563f = interfaceC4961b06;
        this.f12564g = interfaceC4961b07;
        this.f12565h = interfaceC4961b08;
        this.f12566i = interfaceC4961b09;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4930v mo15000a() {
        return new C4930v(((C4863f3) this.f12558a).mo15000a(), this.f12559b.mo15000a(), this.f12560c.mo15000a(), C4958a0.m25951b(this.f12561d), this.f12562e.mo15000a(), this.f12563f.mo15000a(), this.f12564g.mo15000a(), C4958a0.m25951b(this.f12565h), C4958a0.m25951b(this.f12566i));
    }
}
