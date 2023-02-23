package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nn */
/* loaded from: classes2.dex */
public final class C3382nn implements InterfaceC3690zj {

    /* renamed from: c */
    private String f8788c;

    /* renamed from: d */
    private String f8789d;

    /* renamed from: e */
    private String f8790e;

    /* renamed from: f */
    private String f8791f;

    /* renamed from: w */
    private String f8792w;

    /* renamed from: x */
    private boolean f8793x;

    private C3382nn() {
    }

    /* renamed from: a */
    public static C3382nn m30530a(String str, String str2, boolean z) {
        C3382nn c3382nn = new C3382nn();
        s.f(str);
        c3382nn.f8789d = str;
        s.f(str2);
        c3382nn.f8790e = str2;
        c3382nn.f8793x = z;
        return c3382nn;
    }

    /* renamed from: b */
    public static C3382nn m30529b(String str, String str2, boolean z) {
        C3382nn c3382nn = new C3382nn();
        s.f(str);
        c3382nn.f8788c = str;
        s.f(str2);
        c3382nn.f8791f = str2;
        c3382nn.f8793x = z;
        return c3382nn;
    }

    /* renamed from: c */
    public final void m30528c(String str) {
        this.f8792w = str;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f8791f)) {
            jSONObject.put("phoneNumber", this.f8788c);
            jSONObject.put("temporaryProof", this.f8791f);
        } else {
            jSONObject.put("sessionInfo", this.f8789d);
            jSONObject.put("code", this.f8790e);
        }
        String str = this.f8792w;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.f8793x) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
