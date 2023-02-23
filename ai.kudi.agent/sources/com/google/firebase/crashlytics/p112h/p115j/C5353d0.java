package com.google.firebase.crashlytics.p112h.p115j;

import com.google.firebase.crashlytics.p112h.C5335f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: KeysMap.java */
/* renamed from: com.google.firebase.crashlytics.h.j.d0 */
/* loaded from: classes2.dex */
public class C5353d0 {

    /* renamed from: a */
    private final Map<String, String> f13209a = new HashMap();

    /* renamed from: b */
    private final int f13210b;

    /* renamed from: c */
    private final int f13211c;

    public C5353d0(int i, int i2) {
        this.f13210b = i;
        this.f13211c = i2;
    }

    /* renamed from: c */
    private String m25068c(String str) {
        if (str != null) {
            return m25069b(str);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: a */
    public synchronized Map<String, String> m25070a() {
        return Collections.unmodifiableMap(new HashMap(this.f13209a));
    }

    /* renamed from: b */
    public String m25069b(String str) {
        if (str != null) {
            String trim = str.trim();
            int length = trim.length();
            int i = this.f13211c;
            return length > i ? trim.substring(0, i) : trim;
        }
        return str;
    }

    /* renamed from: d */
    public synchronized void m25067d(String str, String str2) {
        String m25068c = m25068c(str);
        if (this.f13209a.size() >= this.f13210b && !this.f13209a.containsKey(m25068c)) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25097k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f13210b);
        }
        this.f13209a.put(m25068c, str2 == null ? "" : m25069b(str2));
    }

    /* renamed from: e */
    public synchronized void m25066e(Map<String, String> map) {
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String m25068c = m25068c(entry.getKey());
            if (this.f13209a.size() >= this.f13210b && !this.f13209a.containsKey(m25068c)) {
                i++;
            }
            String value = entry.getValue();
            this.f13209a.put(m25068c, value == null ? "" : m25069b(value));
        }
        if (i > 0) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25097k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f13210b);
        }
    }
}
