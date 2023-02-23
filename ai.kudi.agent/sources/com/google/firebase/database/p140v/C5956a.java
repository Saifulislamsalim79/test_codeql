package com.google.firebase.database.p140v;

import java.io.IOException;
import java.util.Map;
/* compiled from: GAuthToken.java */
/* renamed from: com.google.firebase.database.v.a */
/* loaded from: classes2.dex */
public class C5956a {

    /* renamed from: a */
    private final String f14602a;

    /* renamed from: b */
    private final Map<String, Object> f14603b;

    public C5956a(String str, Map<String, Object> map) {
        this.f14602a = str;
        this.f14603b = map;
    }

    /* renamed from: c */
    public static C5956a m23181c(String str) {
        if (str.startsWith("gauth|")) {
            try {
                Map<String, Object> m23180a = C5957b.m23180a(str.substring(6));
                return new C5956a((String) m23180a.get("token"), (Map) m23180a.get("auth"));
            } catch (IOException e) {
                throw new RuntimeException("Failed to parse gauth token", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public Map<String, Object> m23183a() {
        return this.f14603b;
    }

    /* renamed from: b */
    public String m23182b() {
        return this.f14602a;
    }
}
