package com.google.firebase.auth;

import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* renamed from: com.google.firebase.auth.h */
/* loaded from: classes2.dex */
public class C5207h {

    /* renamed from: a */
    private String f12973a;

    /* renamed from: b */
    private Map<String, Object> f12974b;

    public C5207h(String str, Map<String, Object> map) {
        this.f12973a = str;
        this.f12974b = map;
    }

    /* renamed from: a */
    public Map<String, Object> m25361a() {
        return this.f12974b;
    }

    /* renamed from: b */
    public String m25360b() {
        Map map = (Map) this.f12974b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    /* renamed from: c */
    public String m25359c() {
        return this.f12973a;
    }
}
