package com.google.gson;

import com.google.gson.internal.C6876g;
import java.util.Map;
import java.util.Set;
/* compiled from: JsonObject.java */
/* renamed from: com.google.gson.n */
/* loaded from: classes2.dex */
public final class C6902n extends AbstractC6900l {

    /* renamed from: a */
    private final C6876g<String, AbstractC6900l> f16552a = new C6876g<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C6902n) && ((C6902n) obj).f16552a.equals(this.f16552a));
    }

    public int hashCode() {
        return this.f16552a.hashCode();
    }

    /* renamed from: s */
    public void m20543s(String str, AbstractC6900l abstractC6900l) {
        C6876g<String, AbstractC6900l> c6876g = this.f16552a;
        if (abstractC6900l == null) {
            abstractC6900l = C6901m.f16551a;
        }
        c6876g.put(str, abstractC6900l);
    }

    /* renamed from: u */
    public Set<Map.Entry<String, AbstractC6900l>> m20542u() {
        return this.f16552a.entrySet();
    }
}
