package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.internal.InterfaceC4961b0;
/* renamed from: com.google.android.play.core.splitinstall.b */
/* loaded from: classes2.dex */
public final class C5008b implements InterfaceC4961b0<C5007a> {

    /* renamed from: a */
    private final InterfaceC4961b0<Context> f12656a;

    public C5008b(InterfaceC4961b0<Context> interfaceC4961b0) {
        this.f12656a = interfaceC4961b0;
    }

    /* renamed from: a */
    public static C5008b m25872a(InterfaceC4961b0<Context> interfaceC4961b0) {
        return new C5008b(interfaceC4961b0);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5007a mo15000a() {
        return new C5007a(this.f12656a.mo15000a());
    }
}
