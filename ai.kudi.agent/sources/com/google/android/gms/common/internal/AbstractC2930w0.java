package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.C2826b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.w0 */
/* loaded from: classes2.dex */
abstract class AbstractC2930w0 extends AbstractC2885j1<Boolean> {

    /* renamed from: d */
    public final int f8093d;

    /* renamed from: e */
    public final Bundle f8094e;

    /* renamed from: f */
    final /* synthetic */ AbstractC2854c f8095f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2930w0(AbstractC2854c abstractC2854c, int i, Bundle bundle) {
        super(abstractC2854c, Boolean.TRUE);
        this.f8095f = abstractC2854c;
        this.f8093d = i;
        this.f8094e = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2885j1
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ void mo31614a(Boolean bool) {
        if (this.f8093d != 0) {
            this.f8095f.m31780h0(1, null);
            Bundle bundle = this.f8094e;
            mo31612f(new C2826b(this.f8093d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else if (mo31611g()) {
        } else {
            this.f8095f.m31780h0(1, null);
            mo31612f(new C2826b(8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2885j1
    /* renamed from: b */
    public final void mo31613b() {
    }

    /* renamed from: f */
    protected abstract void mo31612f(C2826b c2826b);

    /* renamed from: g */
    protected abstract boolean mo31611g();
}
