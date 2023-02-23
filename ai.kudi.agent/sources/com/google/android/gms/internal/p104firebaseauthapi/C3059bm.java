package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.C5192a;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bm */
/* loaded from: classes2.dex */
public final class C3059bm implements InterfaceC3690zj {

    /* renamed from: c */
    private final String f8254c;

    /* renamed from: d */
    private String f8255d;

    /* renamed from: e */
    private String f8256e;

    /* renamed from: f */
    private String f8257f;

    /* renamed from: w */
    private C5192a f8258w;

    /* renamed from: x */
    private String f8259x;

    public C3059bm(int i) {
        this.f8254c = i != 1 ? i != 4 ? i != 6 ? i != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    private C3059bm(int i, C5192a c5192a, String str, String str2, String str3, String str4) {
        this.f8254c = "VERIFY_AND_CHANGE_EMAIL";
        s.j(c5192a);
        this.f8258w = c5192a;
        this.f8255d = null;
        this.f8256e = str2;
        this.f8257f = str3;
        this.f8259x = null;
    }

    /* renamed from: b */
    public static C3059bm m31361b(C5192a c5192a, String str, String str2) {
        s.f(str);
        s.f(str2);
        s.j(c5192a);
        return new C3059bm(7, c5192a, null, str2, str, null);
    }

    /* renamed from: a */
    public final C5192a m31362a() {
        return this.f8258w;
    }

    /* renamed from: c */
    public final C3059bm m31360c(C5192a c5192a) {
        s.j(c5192a);
        this.f8258w = c5192a;
        return this;
    }

    /* renamed from: d */
    public final C3059bm m31359d(String str) {
        s.f(str);
        this.f8255d = str;
        return this;
    }

    /* renamed from: e */
    public final C3059bm m31358e(String str) {
        this.f8259x = str;
        return this;
    }

    /* renamed from: f */
    public final C3059bm m31357f(String str) {
        s.f(str);
        this.f8257f = str;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        char c;
        JSONObject jSONObject = new JSONObject();
        String str = this.f8254c;
        int i = 0;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i = 1;
        } else if (c == 1) {
            i = 4;
        } else if (c == 2) {
            i = 6;
        } else if (c == 3) {
            i = 7;
        }
        jSONObject.put("requestType", i);
        String str2 = this.f8255d;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.f8256e;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.f8257f;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        C5192a c5192a = this.f8258w;
        if (c5192a != null) {
            jSONObject.put("androidInstallApp", c5192a.m25384h());
            jSONObject.put("canHandleCodeInApp", this.f8258w.m25385f());
            if (this.f8258w.m25379u() != null) {
                jSONObject.put("continueUrl", this.f8258w.m25379u());
            }
            if (this.f8258w.m25380s() != null) {
                jSONObject.put("iosBundleId", this.f8258w.m25380s());
            }
            if (this.f8258w.m25386e0() != null) {
                jSONObject.put("iosAppStoreId", this.f8258w.m25386e0());
            }
            if (this.f8258w.m25381l() != null) {
                jSONObject.put("androidPackageName", this.f8258w.m25381l());
            }
            if (this.f8258w.m25382k() != null) {
                jSONObject.put("androidMinimumVersion", this.f8258w.m25382k());
            }
            if (this.f8258w.m25387d0() != null) {
                jSONObject.put("dynamicLinkDomain", this.f8258w.m25387d0());
            }
        }
        String str5 = this.f8259x;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        return jSONObject.toString();
    }
}
