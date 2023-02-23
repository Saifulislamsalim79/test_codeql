package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.internal.AbstractC2796p;
import com.google.android.gms.tasks.C4465k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.x0 */
/* loaded from: classes2.dex */
public final class C2817x0 extends AbstractC2796p {

    /* renamed from: d */
    final /* synthetic */ AbstractC2796p.C2797a f7888d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2817x0(AbstractC2796p.C2797a c2797a, C2830d[] c2830dArr, boolean z, int i) {
        super(c2830dArr, z, i);
        this.f7888d = c2797a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC2796p
    /* renamed from: b */
    public final void mo28489b(C2730a.InterfaceC2732b interfaceC2732b, C4465k c4465k) throws RemoteException {
        InterfaceC2790n interfaceC2790n;
        interfaceC2790n = this.f7888d.f7840a;
        interfaceC2790n.mo16126a(interfaceC2732b, c4465k);
    }
}
