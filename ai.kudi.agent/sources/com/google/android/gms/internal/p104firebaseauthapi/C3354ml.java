package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.p099l.C2946a;
import com.google.firebase.auth.C5195b;
import com.google.firebase.auth.C5199d;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ml */
/* loaded from: classes2.dex */
public final class C3354ml implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8731c;

    /* renamed from: d */
    private final String f8732d;

    /* renamed from: e */
    private final String f8733e;

    static {
        new C2946a(C3354ml.class.getSimpleName(), new String[0]);
    }

    public C3354ml(C5199d c5199d, String str) {
        String m25366u = c5199d.m25366u();
        s.f(m25366u);
        this.f8731c = m25366u;
        String m25372d0 = c5199d.m25372d0();
        s.f(m25372d0);
        this.f8732d = m25372d0;
        this.f8733e = str;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        C5195b m25376b = C5195b.m25376b(this.f8732d);
        String m25377a = m25376b != null ? m25376b.m25377a() : null;
        String m25375c = m25376b != null ? m25376b.m25375c() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f8731c);
        if (m25377a != null) {
            jSONObject.put("oobCode", m25377a);
        }
        if (m25375c != null) {
            jSONObject.put("tenantId", m25375c);
        }
        String str = this.f8733e;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        return jSONObject.toString();
    }
}
