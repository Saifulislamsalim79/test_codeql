package com.google.firebase.database.p140v;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;
/* compiled from: JsonMapper.java */
/* renamed from: com.google.firebase.database.v.b */
/* loaded from: classes2.dex */
public class C5957b {
    /* renamed from: a */
    public static Map<String, Object> m23180a(String str) throws IOException {
        try {
            return m23173h(new JSONObject(str));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: b */
    public static Object m23179b(String str) throws IOException {
        try {
            return m23175f(new JSONTokener(str).nextValue());
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: c */
    public static String m23178c(Map<String, Object> map) throws IOException {
        return m23177d(map);
    }

    /* renamed from: d */
    public static String m23177d(Object obj) throws IOException {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e) {
                throw new IOException("Could not serialize number", e);
            }
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        } else {
            try {
                JSONStringer jSONStringer = new JSONStringer();
                m23176e(obj, jSONStringer);
                return jSONStringer.toString();
            } catch (JSONException e2) {
                throw new IOException("Failed to serialize JSON", e2);
            }
        }
    }

    /* renamed from: e */
    private static void m23176e(Object obj, JSONStringer jSONStringer) throws IOException, JSONException {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                m23176e(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
        } else if (obj instanceof Collection) {
            jSONStringer.array();
            for (Object obj2 : (Collection) obj) {
                m23176e(obj2, jSONStringer);
            }
            jSONStringer.endArray();
        } else {
            jSONStringer.value(obj);
        }
    }

    /* renamed from: f */
    private static Object m23175f(Object obj) throws JSONException {
        if (obj instanceof JSONObject) {
            return m23173h((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return m23174g((JSONArray) obj);
        }
        if (obj.equals(JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    private static List<Object> m23174g(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m23175f(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: h */
    private static Map<String, Object> m23173h(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m23175f(jSONObject.get(next)));
        }
        return hashMap;
    }
}
