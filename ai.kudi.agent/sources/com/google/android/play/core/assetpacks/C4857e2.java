package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4958a0;
import com.google.android.play.core.internal.InterfaceC4961b0;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.play.core.assetpacks.e2 */
/* loaded from: classes2.dex */
public final class C4857e2 implements InterfaceC4961b0<C4852d2> {

    /* renamed from: a */
    private final InterfaceC4961b0<C4840b0> f12292a;

    /* renamed from: b */
    private final InterfaceC4961b0<InterfaceC4883j3> f12293b;

    /* renamed from: c */
    private final InterfaceC4961b0<C4891l1> f12294c;

    /* renamed from: d */
    private final InterfaceC4961b0<Executor> f12295d;

    /* renamed from: e */
    private final InterfaceC4961b0<C4939x0> f12296e;

    public C4857e2(InterfaceC4961b0<C4840b0> interfaceC4961b0, InterfaceC4961b0<InterfaceC4883j3> interfaceC4961b02, InterfaceC4961b0<C4891l1> interfaceC4961b03, InterfaceC4961b0<Executor> interfaceC4961b04, InterfaceC4961b0<C4939x0> interfaceC4961b05) {
        this.f12292a = interfaceC4961b0;
        this.f12293b = interfaceC4961b02;
        this.f12294c = interfaceC4961b03;
        this.f12295d = interfaceC4961b04;
        this.f12296e = interfaceC4961b05;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4852d2 mo15000a() {
        C4840b0 mo15000a = this.f12292a.mo15000a();
        return new C4852d2(mo15000a, C4958a0.m25951b(this.f12293b), this.f12294c.mo15000a(), C4958a0.m25951b(this.f12295d), this.f12296e.mo15000a());
    }
}
