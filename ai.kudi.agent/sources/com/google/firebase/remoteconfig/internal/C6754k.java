package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ConfigContainer.java */
/* renamed from: com.google.firebase.remoteconfig.internal.k */
/* loaded from: classes2.dex */
public class C6754k {

    /* renamed from: f */
    private static final Date f16248f = new Date(0);

    /* renamed from: a */
    private JSONObject f16249a;

    /* renamed from: b */
    private JSONObject f16250b;

    /* renamed from: c */
    private Date f16251c;

    /* renamed from: d */
    private JSONArray f16252d;

    /* renamed from: e */
    private JSONObject f16253e;

    /* compiled from: ConfigContainer.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.k$b */
    /* loaded from: classes2.dex */
    public static class C6756b {

        /* renamed from: a */
        private JSONObject f16254a;

        /* renamed from: b */
        private Date f16255b;

        /* renamed from: c */
        private JSONArray f16256c;

        /* renamed from: d */
        private JSONObject f16257d;

        /* renamed from: a */
        public C6754k m20872a() throws JSONException {
            return new C6754k(this.f16254a, this.f16255b, this.f16256c, this.f16257d);
        }

        /* renamed from: b */
        public C6756b m20871b(Map<String, String> map) {
            this.f16254a = new JSONObject(map);
            return this;
        }

        /* renamed from: c */
        public C6756b m20870c(JSONObject jSONObject) {
            try {
                this.f16254a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: d */
        public C6756b m20869d(JSONArray jSONArray) {
            try {
                this.f16256c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: e */
        public C6756b m20868e(Date date) {
            this.f16255b = date;
            return this;
        }

        /* renamed from: f */
        public C6756b m20867f(JSONObject jSONObject) {
            try {
                this.f16257d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        private C6756b() {
            this.f16254a = new JSONObject();
            this.f16255b = C6754k.f16248f;
            this.f16256c = new JSONArray();
            this.f16257d = new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C6754k m20878b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new C6754k(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    /* renamed from: g */
    public static C6756b m20873g() {
        return new C6756b();
    }

    /* renamed from: c */
    public JSONArray m20877c() {
        return this.f16252d;
    }

    /* renamed from: d */
    public JSONObject m20876d() {
        return this.f16250b;
    }

    /* renamed from: e */
    public Date m20875e() {
        return this.f16251c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6754k) {
            return this.f16249a.toString().equals(((C6754k) obj).toString());
        }
        return false;
    }

    /* renamed from: f */
    public JSONObject m20874f() {
        return this.f16253e;
    }

    public int hashCode() {
        return this.f16249a.hashCode();
    }

    public String toString() {
        return this.f16249a.toString();
    }

    private C6754k(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f16250b = jSONObject;
        this.f16251c = date;
        this.f16252d = jSONArray;
        this.f16253e = jSONObject2;
        this.f16249a = jSONObject3;
    }
}
