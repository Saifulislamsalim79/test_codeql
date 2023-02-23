package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4958a0;
import com.google.android.play.core.internal.InterfaceC4961b0;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.play.core.assetpacks.m1 */
/* loaded from: classes2.dex */
public final class C4896m1 implements InterfaceC4961b0<C4891l1> {

    /* renamed from: a */
    private final InterfaceC4961b0<C4840b0> f12407a;

    /* renamed from: b */
    private final InterfaceC4961b0<InterfaceC4883j3> f12408b;

    /* renamed from: c */
    private final InterfaceC4961b0<C4939x0> f12409c;

    /* renamed from: d */
    private final InterfaceC4961b0<Executor> f12410d;

    public C4896m1(InterfaceC4961b0<C4840b0> interfaceC4961b0, InterfaceC4961b0<InterfaceC4883j3> interfaceC4961b02, InterfaceC4961b0<C4939x0> interfaceC4961b03, InterfaceC4961b0<Executor> interfaceC4961b04) {
        this.f12407a = interfaceC4961b0;
        this.f12408b = interfaceC4961b02;
        this.f12409c = interfaceC4961b03;
        this.f12410d = interfaceC4961b04;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4891l1 mo15000a() {
        C4840b0 mo15000a = this.f12407a.mo15000a();
        return new C4891l1(mo15000a, C4958a0.m25951b(this.f12408b), this.f12409c.mo15000a(), C4958a0.m25951b(this.f12410d));
    }
}
