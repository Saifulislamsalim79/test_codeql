package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.h0 */
/* loaded from: classes2.dex */
final class C2878h0 extends AbstractDialogInterface$OnClickListenerC2884j0 {

    /* renamed from: c */
    final /* synthetic */ Intent f8006c;

    /* renamed from: d */
    final /* synthetic */ Activity f8007d;

    /* renamed from: e */
    final /* synthetic */ int f8008e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2878h0(Intent intent, Activity activity, int i) {
        this.f8006c = intent;
        this.f8007d = activity;
        this.f8008e = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC2884j0
    /* renamed from: a */
    public final void mo31721a() {
        Intent intent = this.f8006c;
        if (intent != null) {
            this.f8007d.startActivityForResult(intent, this.f8008e);
        }
    }
}
