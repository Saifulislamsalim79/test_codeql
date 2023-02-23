package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.u3 */
/* loaded from: classes2.dex */
final class RunnableC4383u3 implements Runnable {

    /* renamed from: c */
    private final InterfaceC4359s3 f10705c;

    /* renamed from: d */
    private final int f10706d;

    /* renamed from: e */
    private final Throwable f10707e;

    /* renamed from: f */
    private final byte[] f10708f;

    /* renamed from: w */
    private final String f10709w;

    /* renamed from: x */
    private final Map<String, List<String>> f10710x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC4383u3(String str, InterfaceC4359s3 interfaceC4359s3, int i, Throwable th, byte[] bArr, Map map, C4371t3 c4371t3) {
        com.google.android.gms.common.internal.s.j(interfaceC4359s3);
        this.f10705c = interfaceC4359s3;
        this.f10706d = i;
        this.f10707e = th;
        this.f10708f = bArr;
        this.f10709w = str;
        this.f10710x = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10705c.mo27913a(this.f10709w, this.f10706d, this.f10707e, this.f10708f, this.f10710x);
    }
}
