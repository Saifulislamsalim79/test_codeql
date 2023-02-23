package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.C2826b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.n1 */
/* loaded from: classes2.dex */
public final class C2899n1 extends AbstractC2930w0 {

    /* renamed from: g */
    final /* synthetic */ AbstractC2854c f8034g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2899n1(AbstractC2854c abstractC2854c, int i, Bundle bundle) {
        super(abstractC2854c, i, null);
        this.f8034g = abstractC2854c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2930w0
    /* renamed from: f */
    protected final void mo31612f(C2826b c2826b) {
        if (this.f8034g.m31775s() && AbstractC2854c.m31782g0(this.f8034g)) {
            AbstractC2854c.m31789c0(this.f8034g, 16);
            return;
        }
        this.f8034g.f7949j.mo31771a(c2826b);
        this.f8034g.m31809K(c2826b);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2930w0
    /* renamed from: g */
    protected final boolean mo31611g() {
        this.f8034g.f7949j.mo31771a(C2826b.f7892w);
        return true;
    }
}
