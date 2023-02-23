package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC2775i;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.i0 */
/* loaded from: classes2.dex */
final class C2881i0 extends AbstractDialogInterface$OnClickListenerC2884j0 {

    /* renamed from: c */
    final /* synthetic */ Intent f8011c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC2775i f8012d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2881i0(Intent intent, InterfaceC2775i interfaceC2775i, int i) {
        this.f8011c = intent;
        this.f8012d = interfaceC2775i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC2884j0
    /* renamed from: a */
    public final void mo31721a() {
        Intent intent = this.f8011c;
        if (intent != null) {
            this.f8012d.startActivityForResult(intent, 2);
        }
    }
}
