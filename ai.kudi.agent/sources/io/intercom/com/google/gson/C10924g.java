package io.intercom.com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: JsonArray.java */
/* renamed from: io.intercom.com.google.gson.g */
/* loaded from: classes3.dex */
public final class C10924g extends AbstractC10927j implements Iterable<AbstractC10927j> {

    /* renamed from: c */
    private final List<AbstractC10927j> f24891c = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C10924g) && ((C10924g) obj).f24891c.equals(this.f24891c));
    }

    public int hashCode() {
        return this.f24891c.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC10927j> iterator() {
        return this.f24891c.iterator();
    }

    /* renamed from: s */
    public void m11933s(AbstractC10927j abstractC10927j) {
        if (abstractC10927j == null) {
            abstractC10927j = C10928k.f24892a;
        }
        this.f24891c.add(abstractC10927j);
    }
}
