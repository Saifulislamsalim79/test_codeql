package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jl */
/* loaded from: classes2.dex */
public final class C3274jl extends AbstractC2916a implements InterfaceC3030ak<C3274jl> {

    /* renamed from: c */
    private String f8642c;

    /* renamed from: d */
    private boolean f8643d;

    /* renamed from: e */
    private String f8644e;

    /* renamed from: f */
    private boolean f8645f;

    /* renamed from: w */
    private C3114dn f8646w;

    /* renamed from: x */
    private List<String> f8647x;

    /* renamed from: y */
    private static final String f8641y = C3274jl.class.getSimpleName();
    public static final Parcelable.Creator<C3274jl> CREATOR = new C3301kl();

    public C3274jl() {
        this.f8646w = new C3114dn(null);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3274jl mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8642c = jSONObject.optString("authUri", null);
            this.f8643d = jSONObject.optBoolean("registered", false);
            this.f8644e = jSONObject.optString("providerId", null);
            this.f8645f = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.f8646w = new C3114dn(null);
            } else {
                this.f8646w = new C3114dn(1, C3512sn.m30264b(jSONObject.optJSONArray("allProviders")));
            }
            this.f8647x = C3512sn.m30264b(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8641y, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 2, this.f8642c, false);
        C2917b.m31663c(parcel, 3, this.f8643d);
        C2917b.m31651o(parcel, 4, this.f8644e, false);
        C2917b.m31663c(parcel, 5, this.f8645f);
        C2917b.m31652n(parcel, 6, this.f8646w, i, false);
        C2917b.m31650p(parcel, 7, this.f8647x, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public C3274jl(String str, boolean z, String str2, boolean z2, C3114dn c3114dn, List<String> list) {
        C3114dn m31230f;
        this.f8642c = str;
        this.f8643d = z;
        this.f8644e = str2;
        this.f8645f = z2;
        if (c3114dn == null) {
            m31230f = new C3114dn(null);
        } else {
            m31230f = C3114dn.m31230f(c3114dn);
        }
        this.f8646w = m31230f;
        this.f8647x = list;
    }
}
