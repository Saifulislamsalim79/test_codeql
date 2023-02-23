package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC2744e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2910r;
import com.google.android.gms.tasks.C4465k;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.p0 */
/* loaded from: classes2.dex */
final class C2904p0 implements AbstractC2744e.InterfaceC2745a {

    /* renamed from: a */
    final /* synthetic */ AbstractC2744e f8051a;

    /* renamed from: b */
    final /* synthetic */ C4465k f8052b;

    /* renamed from: c */
    final /* synthetic */ C2910r.InterfaceC2911a f8053c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2904p0(AbstractC2744e abstractC2744e, C4465k c4465k, C2910r.InterfaceC2911a interfaceC2911a, InterfaceC2912r0 interfaceC2912r0) {
        this.f8051a = abstractC2744e;
        this.f8052b = c4465k;
        this.f8053c = interfaceC2911a;
    }

    @Override // com.google.android.gms.common.api.AbstractC2744e.InterfaceC2745a
    /* renamed from: a */
    public final void mo31702a(Status status) {
        if (status.m32094s()) {
            this.f8052b.m27775c(this.f8053c.mo31695a(this.f8051a.mo32068c(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f8052b.m27776b(C2850b.m31817a(status));
    }
}
