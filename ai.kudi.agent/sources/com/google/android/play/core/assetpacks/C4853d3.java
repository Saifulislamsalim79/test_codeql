package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.internal.C4987n;
import com.google.android.play.core.internal.InterfaceC4961b0;
/* renamed from: com.google.android.play.core.assetpacks.d3 */
/* loaded from: classes2.dex */
public final class C4853d3 implements InterfaceC4961b0<Object> {

    /* renamed from: a */
    private final InterfaceC4961b0<C4933v2> f12282a;

    /* renamed from: b */
    private final InterfaceC4961b0<Context> f12283b;

    public C4853d3(InterfaceC4961b0<C4933v2> interfaceC4961b0, InterfaceC4961b0<Context> interfaceC4961b02) {
        this.f12282a = interfaceC4961b0;
        this.f12283b = interfaceC4961b02;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15000a() {
        C4933v2 mo15000a = this.f12282a.mo15000a();
        Context mo15000a2 = ((C4863f3) this.f12283b).mo15000a();
        C4933v2 c4933v2 = mo15000a;
        C4987n.m25917a(mo15000a2.getPackageManager(), new ComponentName(mo15000a2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        PlayCoreDialogWrapperActivity.m25972a(mo15000a2);
        C4987n.m25911g(c4933v2);
        return c4933v2;
    }
}
