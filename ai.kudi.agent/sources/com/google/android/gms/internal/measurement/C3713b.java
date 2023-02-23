package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.b */
/* loaded from: classes2.dex */
public final class C3713b {

    /* renamed from: a */
    private String f9190a;

    /* renamed from: b */
    private final long f9191b;

    /* renamed from: c */
    private final Map<String, Object> f9192c;

    public C3713b(String str, long j, Map<String, Object> map) {
        this.f9190a = str;
        this.f9191b = j;
        HashMap hashMap = new HashMap();
        this.f9192c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long m29838a() {
        return this.f9191b;
    }

    /* renamed from: b */
    public final C3713b clone() {
        return new C3713b(this.f9190a, this.f9191b, new HashMap(this.f9192c));
    }

    /* renamed from: c */
    public final Object m29836c(String str) {
        if (this.f9192c.containsKey(str)) {
            return this.f9192c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String m29835d() {
        return this.f9190a;
    }

    /* renamed from: e */
    public final Map<String, Object> m29834e() {
        return this.f9192c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3713b) {
            C3713b c3713b = (C3713b) obj;
            if (this.f9191b == c3713b.f9191b && this.f9190a.equals(c3713b.f9190a)) {
                return this.f9192c.equals(c3713b.f9192c);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final void m29833f(String str) {
        this.f9190a = str;
    }

    /* renamed from: g */
    public final void m29832g(String str, Object obj) {
        if (obj == null) {
            this.f9192c.remove(str);
        } else {
            this.f9192c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f9190a.hashCode();
        long j = this.f9191b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f9192c.hashCode();
    }

    public final String toString() {
        String str = this.f9190a;
        long j = this.f9191b;
        String obj = this.f9192c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + obj.length());
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
