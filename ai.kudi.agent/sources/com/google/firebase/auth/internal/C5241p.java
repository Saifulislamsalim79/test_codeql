package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.p099l.C2946a;
import com.google.android.gms.common.util.C2965c;
import com.google.android.gms.internal.p104firebaseauthapi.C3490s1;
import com.google.android.gms.internal.p104firebaseauthapi.zzll;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p201g.p218e.C7521a;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.p */
/* loaded from: classes2.dex */
final class C5241p {

    /* renamed from: a */
    private static final C2946a f13046a = new C2946a("JSONParser", new String[0]);

    /* renamed from: a */
    static List<Object> m25289a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m25289a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m25286d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Map<String, Object> m25288b(String str) {
        com.google.android.gms.common.internal.s.f(str);
        List<String> m30291d = C3490s1.m30293b('.').m30291d(str);
        if (m30291d.size() < 2) {
            C2946a c2946a = f13046a;
            String valueOf = String.valueOf(str);
            c2946a.m31583c(valueOf.length() != 0 ? "Invalid idToken ".concat(valueOf) : new String("Invalid idToken "), new Object[0]);
            return new HashMap();
        }
        try {
            Map<String, Object> m25287c = m25287c(new String(C2965c.m31540b(m30291d.get(1)), "UTF-8"));
            return m25287c == null ? new HashMap() : m25287c;
        } catch (UnsupportedEncodingException e) {
            f13046a.m31584b("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    /* renamed from: c */
    public static Map<String, Object> m25287c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m25286d(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzll(e);
        }
    }

    /* renamed from: d */
    static Map<String, Object> m25286d(JSONObject jSONObject) throws JSONException {
        C7521a c7521a = new C7521a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m25289a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m25286d((JSONObject) obj);
            }
            c7521a.put(next, obj);
        }
        return c7521a;
    }
}
