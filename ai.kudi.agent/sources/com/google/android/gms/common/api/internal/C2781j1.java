package com.google.android.gms.common.api.internal;

import android.app.Dialog;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.j1 */
/* loaded from: classes2.dex */
final class C2781j1 extends AbstractC2783k0 {

    /* renamed from: a */
    final /* synthetic */ Dialog f7807a;

    /* renamed from: b */
    final /* synthetic */ RunnableC2784k1 f7808b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2781j1(RunnableC2784k1 runnableC2784k1, Dialog dialog) {
        this.f7808b = runnableC2784k1;
        this.f7807a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2783k0
    /* renamed from: a */
    public final void mo31955a() {
        this.f7808b.f7820d.m31948o();
        if (this.f7807a.isShowing()) {
            this.f7807a.dismiss();
        }
    }
}
