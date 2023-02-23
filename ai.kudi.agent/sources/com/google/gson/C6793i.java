package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: JsonArray.java */
/* renamed from: com.google.gson.i */
/* loaded from: classes2.dex */
public final class C6793i extends AbstractC6900l implements Iterable<AbstractC6900l> {

    /* renamed from: c */
    private final List<AbstractC6900l> f16347c = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C6793i) && ((C6793i) obj).f16347c.equals(this.f16347c));
    }

    public int hashCode() {
        return this.f16347c.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC6900l> iterator() {
        return this.f16347c.iterator();
    }

    /* renamed from: s */
    public void m20730s(AbstractC6900l abstractC6900l) {
        if (abstractC6900l == null) {
            abstractC6900l = C6901m.f16551a;
        }
        this.f16347c.add(abstractC6900l);
    }
}
