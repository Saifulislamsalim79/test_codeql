package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q5 */
/* loaded from: classes2.dex */
public final class C3442q5 implements InterfaceC3335m2 {

    /* renamed from: a */
    private final SharedPreferences.Editor f8883a;

    /* renamed from: b */
    private final String f8884b = "GenericIdpKeyset";

    public C3442q5(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f8883a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f8883a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3335m2
    /* renamed from: a */
    public final void mo30146a(C3236ia c3236ia) throws IOException {
        if (!this.f8883a.putString(this.f8884b, C3371nc.m30565a(c3236ia.mo30000p())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3335m2
    /* renamed from: b */
    public final void mo30145b(C3208h9 c3208h9) throws IOException {
        if (!this.f8883a.putString(this.f8884b, C3371nc.m30565a(c3208h9.mo30000p())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
