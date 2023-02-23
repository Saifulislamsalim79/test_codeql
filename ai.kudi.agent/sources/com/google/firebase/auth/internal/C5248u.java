package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.p099l.C2946a;
import com.google.android.gms.internal.p104firebaseauthapi.C3140em;
import com.google.android.gms.internal.p104firebaseauthapi.zzll;
import com.google.firebase.auth.AbstractC5203f;
import com.google.firebase.auth.AbstractC5258l;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.u */
/* loaded from: classes2.dex */
public final class C5248u {

    /* renamed from: a */
    private final Context f13052a;

    /* renamed from: b */
    private final String f13053b;

    /* renamed from: c */
    private final SharedPreferences f13054c;

    /* renamed from: d */
    private final C2946a f13055d;

    public C5248u(Context context, String str) {
        com.google.android.gms.common.internal.s.j(context);
        com.google.android.gms.common.internal.s.f(str);
        this.f13053b = str;
        this.f13052a = context.getApplicationContext();
        this.f13054c = this.f13052a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f13053b), 0);
        this.f13055d = new C2946a("StorageHelpers", new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce A[Catch: zzll -> 0x0135, IllegalArgumentException -> 0x0137, ArrayIndexOutOfBoundsException -> 0x0139, JSONException -> 0x013b, TRY_ENTER, TryCatch #3 {JSONException -> 0x013b, blocks: (B:3:0x0008, B:6:0x0025, B:10:0x003b, B:12:0x0079, B:14:0x0080, B:15:0x008c, B:16:0x008d, B:18:0x009c, B:20:0x00a5, B:21:0x00a8, B:23:0x00b1, B:28:0x00ce, B:29:0x00d1, B:31:0x00d7, B:33:0x00dd, B:34:0x00e3, B:36:0x00e9, B:38:0x0100, B:40:0x0108, B:44:0x012b, B:41:0x0122, B:42:0x0129, B:45:0x0131), top: B:59:0x0008 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.firebase.auth.internal.C5240o0 m25272f(org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.C5248u.m25272f(org.json.JSONObject):com.google.firebase.auth.internal.o0");
    }

    /* renamed from: a */
    public final AbstractC5203f m25277a() {
        String string = this.f13054c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return m25272f(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: b */
    public final C3140em m25276b(AbstractC5203f abstractC5203f) {
        com.google.android.gms.common.internal.s.j(abstractC5203f);
        String string = this.f13054c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC5203f.mo25302l()), null);
        if (string != null) {
            return C3140em.m31174k(string);
        }
        return null;
    }

    /* renamed from: c */
    public final void m25275c(String str) {
        this.f13054c.edit().remove(str).apply();
    }

    /* renamed from: d */
    public final void m25274d(AbstractC5203f abstractC5203f) {
        String str;
        com.google.android.gms.common.internal.s.j(abstractC5203f);
        JSONObject jSONObject = new JSONObject();
        if (C5240o0.class.isAssignableFrom(abstractC5203f.getClass())) {
            C5240o0 c5240o0 = (C5240o0) abstractC5203f;
            try {
                jSONObject.put("cachedTokenState", c5240o0.mo25305h0());
                jSONObject.put("applicationName", c5240o0.m25298p0().m23090l());
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (c5240o0.m25291v0() != null) {
                    JSONArray jSONArray = new JSONArray();
                    List<C5234l0> m25291v0 = c5240o0.m25291v0();
                    for (int i = 0; i < m25291v0.size(); i++) {
                        jSONArray.put(m25291v0.get(i).m25316h());
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", c5240o0.mo25295s());
                jSONObject.put("version", "2");
                if (c5240o0.m25299n0() != null) {
                    jSONObject.put("userMetadata", ((C5244q0) c5240o0.m25299n0()).m25283a());
                }
                List<AbstractC5258l> mo25260a = new C5217d(c5240o0).mo25260a();
                if (!mo25260a.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i2 = 0; i2 < mo25260a.size(); i2++) {
                        jSONArray2.put(mo25260a.get(i2).mo25243f());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                str = jSONObject.toString();
            } catch (Exception e) {
                this.f13055d.m31577i("Failed to turn object into JSON", e, new Object[0]);
                throw new zzll(e);
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13054c.edit().putString("com.google.firebase.auth.FIREBASE_USER", str).apply();
    }

    /* renamed from: e */
    public final void m25273e(AbstractC5203f abstractC5203f, C3140em c3140em) {
        com.google.android.gms.common.internal.s.j(abstractC5203f);
        com.google.android.gms.common.internal.s.j(c3140em);
        this.f13054c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC5203f.mo25302l()), c3140em.m31179E()).apply();
    }
}
