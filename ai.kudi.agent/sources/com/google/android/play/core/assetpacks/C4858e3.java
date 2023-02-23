package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.C4958a0;
import com.google.android.play.core.internal.C4987n;
import com.google.android.play.core.internal.InterfaceC4961b0;
/* renamed from: com.google.android.play.core.assetpacks.e3 */
/* loaded from: classes2.dex */
public final class C4858e3 implements InterfaceC4961b0<InterfaceC4883j3> {

    /* renamed from: a */
    private final InterfaceC4961b0<Context> f12297a;

    /* renamed from: b */
    private final InterfaceC4961b0<C4910q> f12298b;

    /* renamed from: c */
    private final InterfaceC4961b0<C4924t1> f12299c;

    public C4858e3(InterfaceC4961b0<Context> interfaceC4961b0, InterfaceC4961b0<C4910q> interfaceC4961b02, InterfaceC4961b0<C4924t1> interfaceC4961b03) {
        this.f12297a = interfaceC4961b0;
        this.f12298b = interfaceC4961b02;
        this.f12299c = interfaceC4961b03;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC4883j3 mo15000a() {
        InterfaceC4883j3 interfaceC4883j3 = (InterfaceC4883j3) (C4838a3.m26170b(((C4863f3) this.f12297a).mo15000a()) == null ? C4958a0.m25951b(this.f12298b).m25876a() : C4958a0.m25951b(this.f12299c).m25876a());
        C4987n.m25911g(interfaceC4883j3);
        return interfaceC4883j3;
    }
}
