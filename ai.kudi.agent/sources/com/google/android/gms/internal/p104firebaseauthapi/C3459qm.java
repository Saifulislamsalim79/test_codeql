package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.util.n;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qm */
/* loaded from: classes2.dex */
public final class C3459qm extends AbstractC2916a implements InterfaceC3030ak<C3459qm> {

    /* renamed from: c */
    private String f8897c;

    /* renamed from: d */
    private String f8898d;

    /* renamed from: e */
    private String f8899e;

    /* renamed from: f */
    private C3248im f8900f;

    /* renamed from: w */
    private static final String f8896w = C3459qm.class.getSimpleName();
    public static final Parcelable.Creator<C3459qm> CREATOR = new C3485rm();

    public C3459qm() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3459qm mo29936e(String str) throws zzpz {
        String str2;
        char c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8897c = n.a(jSONObject.optString("email"));
            this.f8898d = n.a(jSONObject.optString("newEmail"));
            int optInt = jSONObject.optInt("reqType");
            if (optInt != 1) {
                switch (optInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.f8899e = str2;
            if (TextUtils.isEmpty(str2)) {
                String optString = jSONObject.optString("requestType");
                switch (optString.hashCode()) {
                    case -1874510116:
                        if (optString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1452371317:
                        if (optString.equals("PASSWORD_RESET")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1341836234:
                        if (optString.equals("VERIFY_EMAIL")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1099157829:
                        if (optString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 870738373:
                        if (optString.equals("EMAIL_SIGNIN")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 970484929:
                        if (optString.equals("RECOVER_EMAIL")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                this.f8899e = (c == 0 || c == 1 || c == 2 || c == 3 || c == 4 || c == 5) ? optString : null;
            }
            if (jSONObject.has("mfaInfo")) {
                this.f8900f = C3248im.m30959h(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3512sn.m30265a(e, f8896w, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 2, this.f8897c, false);
        C2917b.m31651o(parcel, 3, this.f8898d, false);
        C2917b.m31651o(parcel, 4, this.f8899e, false);
        C2917b.m31652n(parcel, 5, this.f8900f, i, false);
        C2917b.m31664b(parcel, m31665a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3459qm(String str, String str2, String str3, C3248im c3248im) {
        this.f8897c = str;
        this.f8898d = str2;
        this.f8899e = str3;
        this.f8900f = c3248im;
    }
}
