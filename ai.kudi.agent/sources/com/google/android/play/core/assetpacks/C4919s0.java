package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4958a0;
import com.google.android.play.core.internal.InterfaceC4961b0;
/* renamed from: com.google.android.play.core.assetpacks.s0 */
/* loaded from: classes2.dex */
public final class C4919s0 implements InterfaceC4961b0<C4915r0> {

    /* renamed from: a */
    private final InterfaceC4961b0<C4840b0> f12497a;

    /* renamed from: b */
    private final InterfaceC4961b0<InterfaceC4883j3> f12498b;

    /* renamed from: c */
    private final InterfaceC4961b0<C4930v> f12499c;

    /* renamed from: d */
    private final InterfaceC4961b0<C4939x0> f12500d;

    public C4919s0(InterfaceC4961b0<C4840b0> interfaceC4961b0, InterfaceC4961b0<InterfaceC4883j3> interfaceC4961b02, InterfaceC4961b0<C4930v> interfaceC4961b03, InterfaceC4961b0<C4939x0> interfaceC4961b04) {
        this.f12497a = interfaceC4961b0;
        this.f12498b = interfaceC4961b02;
        this.f12499c = interfaceC4961b03;
        this.f12500d = interfaceC4961b04;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4915r0 mo15000a() {
        return new C4915r0(this.f12497a.mo15000a(), C4958a0.m25951b(this.f12498b), C4958a0.m25951b(this.f12499c), this.f12500d.mo15000a());
    }
}
