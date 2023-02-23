package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.util.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mm */
/* loaded from: classes2.dex */
public final class C3355mm extends AbstractC2916a {
    public static final Parcelable.Creator<C3355mm> CREATOR = new C3381nm();

    /* renamed from: c */
    private final List<C3302km> f8734c;

    public C3355mm() {
        this.f8734c = new ArrayList();
    }

    /* renamed from: f */
    public static C3355mm m30657f(JSONArray jSONArray) throws JSONException {
        C3302km c3302km;
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject == null) {
                    c3302km = new C3302km();
                } else {
                    c3302km = new C3302km(n.a(jSONObject.optString("federatedId", null)), n.a(jSONObject.optString("displayName", null)), n.a(jSONObject.optString("photoUrl", null)), n.a(jSONObject.optString("providerId", null)), null, n.a(jSONObject.optString("phoneNumber", null)), n.a(jSONObject.optString("email", null)));
                }
                arrayList.add(c3302km);
            }
            return new C3355mm(arrayList);
        }
        return new C3355mm(new ArrayList());
    }

    /* renamed from: h */
    public static C3355mm m30656h(C3355mm c3355mm) {
        List<C3302km> list = c3355mm.f8734c;
        C3355mm c3355mm2 = new C3355mm();
        if (list != null) {
            c3355mm2.f8734c.addAll(list);
        }
        return c3355mm2;
    }

    /* renamed from: k */
    public final List<C3302km> m30655k() {
        return this.f8734c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31648r(parcel, 2, this.f8734c, false);
        C2917b.m31664b(parcel, m31665a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3355mm(List<C3302km> list) {
        if (list != null && !list.isEmpty()) {
            this.f8734c = Collections.unmodifiableList(list);
        } else {
            this.f8734c = Collections.emptyList();
        }
    }
}
