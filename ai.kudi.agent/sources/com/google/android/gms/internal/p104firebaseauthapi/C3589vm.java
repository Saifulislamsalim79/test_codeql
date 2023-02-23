package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vm */
/* loaded from: classes2.dex */
public final class C3589vm implements InterfaceC3690zj {

    /* renamed from: A */
    private String f9035A;

    /* renamed from: c */
    private String f9036c;

    /* renamed from: d */
    private String f9037d;

    /* renamed from: e */
    private String f9038e;

    /* renamed from: f */
    private String f9039f;

    /* renamed from: w */
    private String f9040w;

    /* renamed from: x */
    private String f9041x;

    /* renamed from: y */
    private final C3114dn f9042y = new C3114dn(null);

    /* renamed from: z */
    private final C3114dn f9043z = new C3114dn(null);

    /* renamed from: a */
    public final C3589vm m30120a(String str) {
        s.f(str);
        this.f9043z.m31229h().add(str);
        return this;
    }

    /* renamed from: b */
    public final C3589vm m30119b(String str) {
        if (str == null) {
            this.f9042y.m31229h().add("DISPLAY_NAME");
        } else {
            this.f9037d = str;
        }
        return this;
    }

    /* renamed from: c */
    public final C3589vm m30118c(String str) {
        if (str == null) {
            this.f9042y.m31229h().add("EMAIL");
        } else {
            this.f9038e = str;
        }
        return this;
    }

    /* renamed from: d */
    public final C3589vm m30117d(String str) {
        s.f(str);
        this.f9036c = str;
        return this;
    }

    /* renamed from: e */
    public final C3589vm m30116e(String str) {
        s.f(str);
        this.f9040w = str;
        return this;
    }

    /* renamed from: f */
    public final C3589vm m30115f(String str) {
        if (str == null) {
            this.f9042y.m31229h().add("PASSWORD");
        } else {
            this.f9039f = str;
        }
        return this;
    }

    /* renamed from: g */
    public final C3589vm m30114g(String str) {
        if (str == null) {
            this.f9042y.m31229h().add("PHOTO_URL");
        } else {
            this.f9041x = str;
        }
        return this;
    }

    /* renamed from: h */
    public final C3589vm m30113h(String str) {
        this.f9035A = str;
        return this;
    }

    /* renamed from: i */
    public final String m30112i() {
        return this.f9037d;
    }

    /* renamed from: j */
    public final String m30111j() {
        return this.f9038e;
    }

    /* renamed from: k */
    public final String m30110k() {
        return this.f9039f;
    }

    /* renamed from: l */
    public final String m30109l() {
        return this.f9041x;
    }

    /* renamed from: m */
    public final boolean m30108m(String str) {
        s.f(str);
        return this.f9042y.m31229h().contains(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3690zj
    public final String zza() throws JSONException {
        char c;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        if (!this.f9043z.m31229h().isEmpty()) {
            List<String> m31229h = this.f9043z.m31229h();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < m31229h.size(); i++) {
                jSONArray.put(m31229h.get(i));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List<String> m31229h2 = this.f9042y.m31229h();
        int size = m31229h2.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < m31229h2.size(); i2++) {
            String str = m31229h2.get(i2);
            int i3 = 2;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
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
                i3 = 1;
            } else if (c != 1) {
                i3 = c != 2 ? c != 3 ? 0 : 4 : 5;
            }
            iArr[i2] = i3;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i4 = 0; i4 < size; i4++) {
                jSONArray2.put(iArr[i4]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.f9036c;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.f9038e;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.f9039f;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.f9037d;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.f9041x;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.f9040w;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.f9035A;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }
}
