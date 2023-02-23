package com.google.firebase.auth.api.fallback.service;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractBinderC2874g;
import com.google.android.gms.common.internal.C2877h;
import com.google.android.gms.common.internal.InterfaceC2893m;
import com.google.android.gms.internal.p104firebaseauthapi.BinderC3164fj;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.api.fallback.service.a */
/* loaded from: classes2.dex */
final class BinderC5194a extends AbstractBinderC2874g {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuthFallbackService f12957a;

    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC5194a(FirebaseAuthFallbackService firebaseAuthFallbackService, Context context) {
        this.f12957a = firebaseAuthFallbackService;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2896n
    /* renamed from: I */
    public final void mo25378I(InterfaceC2893m interfaceC2893m, C2877h c2877h) throws RemoteException {
        Bundle m31734f = c2877h.m31734f();
        if (m31734f != null) {
            String string = m31734f.getString("com.google.firebase.auth.API_KEY");
            if (!TextUtils.isEmpty(string)) {
                interfaceC2893m.mo31599r0(0, new BinderC3164fj(this.f12957a, string), null);
                return;
            }
            throw new IllegalArgumentException("ApiKey must not be empty.");
        }
        throw new IllegalArgumentException("ExtraArgs is null.");
    }
}
