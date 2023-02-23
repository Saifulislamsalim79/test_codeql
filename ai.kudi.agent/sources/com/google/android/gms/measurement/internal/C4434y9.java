package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.y9 */
/* loaded from: classes2.dex */
public final class C4434y9 implements InterfaceC4236ha {

    /* renamed from: a */
    final /* synthetic */ C4168ba f10843a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4434y9(C4168ba c4168ba) {
        this.f10843a = c4168ba;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4236ha
    /* renamed from: a */
    public final void mo27807a(String str, String str2, Bundle bundle) {
        b5 b5Var;
        b5 b5Var2;
        if (!TextUtils.isEmpty(str)) {
            this.f10843a.m28373a().m27810z(new RunnableC4422x9(this, str, "_err", bundle));
            return;
        }
        b5Var = this.f10843a.f10059l;
        if (b5Var != null) {
            b5Var2 = this.f10843a.f10059l;
            b5Var2.b().r().m28013b("AppId not known when logging event", "_err");
        }
    }
}
