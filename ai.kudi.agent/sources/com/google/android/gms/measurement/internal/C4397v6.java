package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.v6 */
/* loaded from: classes2.dex */
final class C4397v6 implements InterfaceC4236ha {

    /* renamed from: a */
    final /* synthetic */ C4245i7 f10738a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4397v6(C4245i7 c4245i7) {
        this.f10738a = c4245i7;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4236ha
    /* renamed from: a */
    public final void mo27807a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f10738a.m28127r("auto", "_err", bundle);
        } else {
            this.f10738a.m28125t("auto", "_err", bundle, str);
            throw null;
        }
    }
}
