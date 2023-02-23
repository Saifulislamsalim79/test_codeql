package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C5266p;
import io.intercom.android.sdk.views.holder.AttributeType;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jg */
/* loaded from: classes2.dex */
final class C3269jg implements InterfaceC3431pk<C3408on> {

    /* renamed from: a */
    final /* synthetic */ InterfaceC3431pk f8632a;

    /* renamed from: b */
    final /* synthetic */ C3296kg f8633b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3269jg(C3296kg c3296kg, InterfaceC3431pk interfaceC3431pk) {
        this.f8633b = c3296kg;
        this.f8632a = interfaceC3431pk;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3408on c3408on) {
        C3408on c3408on2 = c3408on;
        if (!TextUtils.isEmpty(c3408on2.m30487f())) {
            this.f8633b.f8679b.m31388g(new Status(17025), C5266p.m25249u(c3408on2.m30489c(), c3408on2.m30487f()));
            return;
        }
        this.f8633b.f8680c.m30670o(new C3140em(c3408on2.m30488d(), c3408on2.m30490b(), Long.valueOf(c3408on2.m30491a()), "Bearer"), null, AttributeType.PHONE, Boolean.valueOf(c3408on2.m30486g()), null, this.f8633b.f8679b, this.f8632a);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8632a.mo29885e(str);
    }
}
