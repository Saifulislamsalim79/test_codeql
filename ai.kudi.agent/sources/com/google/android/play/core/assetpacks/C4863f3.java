package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.C4987n;
import com.google.android.play.core.internal.InterfaceC4961b0;
/* renamed from: com.google.android.play.core.assetpacks.f3 */
/* loaded from: classes2.dex */
public final class C4863f3 implements InterfaceC4961b0<Context> {

    /* renamed from: a */
    private final C4838a3 f12311a;

    public C4863f3(C4838a3 c4838a3) {
        this.f12311a = c4838a3;
    }

    /* renamed from: a */
    public static Context m26121a(C4838a3 c4838a3) {
        Context m26171a = c4838a3.m26171a();
        C4987n.m25911g(m26171a);
        return m26171a;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: b */
    public final Context mo15000a() {
        return m26121a(this.f12311a);
    }
}
