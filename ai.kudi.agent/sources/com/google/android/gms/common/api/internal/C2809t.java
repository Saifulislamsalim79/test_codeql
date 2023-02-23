package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.InterfaceC4454e;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.t */
/* loaded from: classes2.dex */
public final class C2809t implements InterfaceC4454e {

    /* renamed from: a */
    final /* synthetic */ C4465k f7869a;

    /* renamed from: b */
    final /* synthetic */ C2811u f7870b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2809t(C2811u c2811u, C4465k c4465k) {
        this.f7870b = c2811u;
        this.f7869a = c4465k;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4454e
    /* renamed from: a */
    public final void mo21856a(com.google.android.gms.tasks.j jVar) {
        Map map;
        map = this.f7870b.f7873b;
        map.remove(this.f7869a);
    }
}
