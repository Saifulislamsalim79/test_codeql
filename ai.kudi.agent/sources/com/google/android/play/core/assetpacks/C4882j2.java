package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C4951b;
import com.google.android.play.core.internal.C4958a0;
import com.google.android.play.core.internal.InterfaceC4961b0;
/* renamed from: com.google.android.play.core.assetpacks.j2 */
/* loaded from: classes2.dex */
public final class C4882j2 implements InterfaceC4961b0<C4877i2> {

    /* renamed from: a */
    private final InterfaceC4961b0<C4840b0> f12372a;

    /* renamed from: b */
    private final InterfaceC4961b0<InterfaceC4883j3> f12373b;

    /* renamed from: c */
    private final InterfaceC4961b0<C4951b> f12374c;

    public C4882j2(InterfaceC4961b0<C4840b0> interfaceC4961b0, InterfaceC4961b0<InterfaceC4883j3> interfaceC4961b02, InterfaceC4961b0<C4951b> interfaceC4961b03) {
        this.f12372a = interfaceC4961b0;
        this.f12373b = interfaceC4961b02;
        this.f12374c = interfaceC4961b03;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4877i2 mo15000a() {
        return new C4877i2(this.f12372a.mo15000a(), C4958a0.m25951b(this.f12373b), this.f12374c.mo15000a());
    }
}
