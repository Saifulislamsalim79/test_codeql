package io.intercom.com.google.gson;

import io.intercom.com.google.gson.p418t.C10968h;
import java.util.Map;
import java.util.Set;
/* compiled from: JsonObject.java */
/* renamed from: io.intercom.com.google.gson.l */
/* loaded from: classes3.dex */
public final class C10929l extends AbstractC10927j {

    /* renamed from: a */
    private final C10968h<String, AbstractC10927j> f24893a = new C10968h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C10929l) && ((C10929l) obj).f24893a.equals(this.f24893a));
    }

    public int hashCode() {
        return this.f24893a.hashCode();
    }

    /* renamed from: s */
    public void m11924s(String str, AbstractC10927j abstractC10927j) {
        if (abstractC10927j == null) {
            abstractC10927j = C10928k.f24892a;
        }
        this.f24893a.put(str, abstractC10927j);
    }

    /* renamed from: u */
    public Set<Map.Entry<String, AbstractC10927j>> m11923u() {
        return this.f24893a.entrySet();
    }
}
