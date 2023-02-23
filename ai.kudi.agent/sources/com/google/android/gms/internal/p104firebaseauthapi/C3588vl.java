package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.util.n;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vl */
/* loaded from: classes2.dex */
public final class C3588vl extends AbstractC2916a implements InterfaceC3030ak<C3588vl> {

    /* renamed from: c */
    private C3692zl f9034c;

    /* renamed from: d */
    private static final String f9033d = C3588vl.class.getSimpleName();
    public static final Parcelable.Creator<C3588vl> CREATOR = new C3614wl();

    public C3588vl() {
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3588vl mo29936e(String str) throws zzpz {
        C3692zl c3692zl;
        int i;
        C3640xl c3640xl;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("users")) {
                this.f9034c = new C3692zl();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                Parcelable.Creator<C3692zl> creator = C3692zl.CREATOR;
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z = false;
                    int i2 = 0;
                    while (i2 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        if (jSONObject2 == null) {
                            c3640xl = new C3640xl();
                            i = i2;
                        } else {
                            i = i2;
                            c3640xl = new C3640xl(n.a(jSONObject2.optString("localId", null)), n.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z), n.a(jSONObject2.optString("displayName", null)), n.a(jSONObject2.optString("photoUrl", null)), C3355mm.m30657f(jSONObject2.optJSONArray("providerUserInfo")), n.a(jSONObject2.optString("rawPassword", null)), n.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, C3248im.m30955u(jSONObject2.optJSONArray("mfaInfo")));
                        }
                        arrayList.add(c3640xl);
                        i2 = i + 1;
                        z = false;
                    }
                    c3692zl = new C3692zl(arrayList);
                    this.f9034c = c3692zl;
                }
                c3692zl = new C3692zl(new ArrayList());
                this.f9034c = c3692zl;
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f9033d, str);
        }
    }

    /* renamed from: f */
    public final List<C3640xl> m30121f() {
        return this.f9034c.m29883h();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 2, this.f9034c, i, false);
        C2917b.m31664b(parcel, m31665a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3588vl(C3692zl c3692zl) {
        C3692zl m29884f;
        if (c3692zl == null) {
            m29884f = new C3692zl();
        } else {
            m29884f = C3692zl.m29884f(c3692zl);
        }
        this.f9034c = m29884f;
    }
}
