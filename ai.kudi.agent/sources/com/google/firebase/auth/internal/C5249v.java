package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C2757c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.v */
/* loaded from: classes2.dex */
public final class C5249v implements ComponentCallbacks2C2757c.InterfaceC2758a {

    /* renamed from: a */
    final /* synthetic */ C5250w f13056a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5249v(C5250w c5250w) {
        this.f13056a = c5250w;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2757c.InterfaceC2758a
    /* renamed from: a */
    public final void mo23077a(boolean z) {
        boolean m25265g;
        C5233l c5233l;
        if (z) {
            this.f13056a.f13059c = true;
            this.f13056a.m25270b();
            return;
        }
        this.f13056a.f13059c = false;
        m25265g = this.f13056a.m25265g();
        if (m25265g) {
            c5233l = this.f13056a.f13058b;
            c5233l.m25319c();
        }
    }
}
