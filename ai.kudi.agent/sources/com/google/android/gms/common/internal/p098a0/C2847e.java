package com.google.android.gms.common.internal.p098a0;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.api.internal.C2766f;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.AbstractC2880i;
import com.google.android.gms.common.internal.C2867e;
import com.google.android.gms.common.internal.C2938z;
import p272h.p286c.p287a.p300b.p307d.p310c.C8414d;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.a0.e */
/* loaded from: classes2.dex */
public final class C2847e extends AbstractC2880i<C2843a> {

    /* renamed from: A */
    private final C2938z f7938A;

    public C2847e(Context context, Looper looper, C2867e c2867e, C2938z c2938z, C2766f c2766f, l lVar) {
        super(context, looper, 270, c2867e, c2766f, lVar);
        this.f7938A = c2938z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: D */
    public final String mo15471D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: E */
    protected final String mo15470E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: H */
    protected final boolean mo31812H() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c, com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: k */
    public final int mo15469k() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo15466r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C2843a ? (C2843a) queryLocalInterface : new C2843a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: u */
    public final C2830d[] mo16127u() {
        return C8414d.f20090b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: z */
    public final Bundle mo15465z() {
        return this.f7938A.m31593d();
    }
}
