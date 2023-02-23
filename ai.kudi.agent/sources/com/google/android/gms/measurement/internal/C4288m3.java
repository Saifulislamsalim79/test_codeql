package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2838h;
import com.google.android.gms.common.internal.AbstractC2854c;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.m3 */
/* loaded from: classes2.dex */
public final class C4288m3 extends AbstractC2854c<InterfaceC4219g3> {
    public C4288m3(Context context, Looper looper, AbstractC2854c.InterfaceC2855a interfaceC2855a, AbstractC2854c.InterfaceC2856b interfaceC2856b) {
        super(context, looper, 93, interfaceC2855a, interfaceC2856b, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: D */
    public final String mo15471D() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: E */
    protected final String mo15470E() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c, com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: k */
    public final int mo15469k() {
        return C2838h.f7921a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: r */
    public final /* synthetic */ InterfaceC4219g3 mo15466r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC4219g3 ? (InterfaceC4219g3) queryLocalInterface : new C4185d3(iBinder);
    }
}
