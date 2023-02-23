package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.util.n;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jn */
/* loaded from: classes2.dex */
public final class C3276jn extends AbstractC2916a implements InterfaceC3030ak<C3276jn> {

    /* renamed from: c */
    private String f8649c;

    /* renamed from: d */
    private String f8650d;

    /* renamed from: e */
    private long f8651e;

    /* renamed from: f */
    private boolean f8652f;

    /* renamed from: w */
    private static final String f8648w = C3276jn.class.getSimpleName();
    public static final Parcelable.Creator<C3276jn> CREATOR = new C3303kn();

    public C3276jn() {
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3276jn mo29936e(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8649c = n.a(jSONObject.optString("idToken", null));
            this.f8650d = n.a(jSONObject.optString("refreshToken", null));
            this.f8651e = jSONObject.optLong("expiresIn", 0L);
            this.f8652f = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8648w, str);
        }
    }

    /* renamed from: f */
    public final long m30895f() {
        return this.f8651e;
    }

    /* renamed from: h */
    public final String m30894h() {
        return this.f8649c;
    }

    /* renamed from: k */
    public final String m30893k() {
        return this.f8650d;
    }

    /* renamed from: l */
    public final boolean m30892l() {
        return this.f8652f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 2, this.f8649c, false);
        C2917b.m31651o(parcel, 3, this.f8650d, false);
        C2917b.m31654l(parcel, 4, this.f8651e);
        C2917b.m31663c(parcel, 5, this.f8652f);
        C2917b.m31664b(parcel, m31665a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3276jn(String str, String str2, long j, boolean z) {
        this.f8649c = str;
        this.f8650d = str2;
        this.f8651e = j;
        this.f8652f = z;
    }
}
