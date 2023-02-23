package com.github.kittinunf.fuel.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* compiled from: Progress.kt */
/* renamed from: com.github.kittinunf.fuel.core.p */
/* loaded from: classes2.dex */
public final class C2463p implements InterfaceC11771p<Long, Long, C13666w> {

    /* renamed from: c */
    private final Collection<InterfaceC11771p<Long, Long, C13666w>> f7048c;

    public C2463p() {
        this(null, 1, null);
    }

    public C2463p(Collection<InterfaceC11771p<Long, Long, C13666w>> collection) {
        kotlin.e0.d.l.g(collection, "handlers");
        this.f7048c = collection;
    }

    /* renamed from: a */
    public void m32821a(long j, long j2) {
        Iterator<T> it = this.f7048c.iterator();
        while (it.hasNext()) {
            ((InterfaceC11771p) it.next()).invoke(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    /* renamed from: b */
    public final boolean m32820b() {
        return this.f7048c.isEmpty();
    }

    /* renamed from: c */
    public final void m32819c(InterfaceC11771p<? super Long, ? super Long, C13666w> interfaceC11771p) {
        kotlin.e0.d.l.g(interfaceC11771p, "handler");
        this.f7048c.add(interfaceC11771p);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2463p) && kotlin.e0.d.l.b(this.f7048c, ((C2463p) obj).f7048c);
        }
        return true;
    }

    public int hashCode() {
        Collection<InterfaceC11771p<Long, Long, C13666w>> collection = this.f7048c;
        if (collection != null) {
            return collection.hashCode();
        }
        return 0;
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(Long l, Long l2) {
        m32821a(l.longValue(), l2.longValue());
        return C13666w.f30112a;
    }

    public String toString() {
        return "Progress(handlers=" + this.f7048c + ")";
    }

    public /* synthetic */ C2463p(Collection collection, int i, kotlin.e0.d.g gVar) {
        this((i & 1) != 0 ? new ArrayList() : collection);
    }
}
