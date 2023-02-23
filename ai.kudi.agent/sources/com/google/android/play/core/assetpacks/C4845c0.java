package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.InterfaceC4961b0;
/* renamed from: com.google.android.play.core.assetpacks.c0 */
/* loaded from: classes2.dex */
public final class C4845c0 implements InterfaceC4961b0<C4840b0> {

    /* renamed from: a */
    private final InterfaceC4961b0<Context> f12266a;

    /* renamed from: b */
    private final InterfaceC4961b0<C4862f2> f12267b;

    public C4845c0(InterfaceC4961b0<Context> interfaceC4961b0, InterfaceC4961b0<C4862f2> interfaceC4961b02) {
        this.f12266a = interfaceC4961b0;
        this.f12267b = interfaceC4961b02;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4840b0 mo15000a() {
        return new C4840b0(((C4863f3) this.f12266a).mo15000a(), this.f12267b.mo15000a());
    }
}
