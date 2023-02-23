package com.google.common.collect;

import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import com.google.common.base.InterfaceC5039g;
import java.io.Serializable;
/* compiled from: ByFunctionOrdering.java */
/* renamed from: com.google.common.collect.c */
/* loaded from: classes2.dex */
final class C5067c<F, T> extends AbstractC5125s<F> implements Serializable {

    /* renamed from: c */
    final InterfaceC5039g<F, ? extends T> f12710c;

    /* renamed from: d */
    final AbstractC5125s<T> f12711d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5067c(InterfaceC5039g<F, ? extends T> interfaceC5039g, AbstractC5125s<T> abstractC5125s) {
        C5051n.m25780n(interfaceC5039g);
        this.f12710c = interfaceC5039g;
        C5051n.m25780n(abstractC5125s);
        this.f12711d = abstractC5125s;
    }

    @Override // com.google.common.collect.AbstractC5125s, java.util.Comparator
    public int compare(F f, F f2) {
        return this.f12711d.compare(this.f12710c.mo25585a(f), this.f12710c.mo25585a(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5067c) {
            C5067c c5067c = (C5067c) obj;
            return this.f12710c.equals(c5067c.f12710c) && this.f12711d.equals(c5067c.f12711d);
        }
        return false;
    }

    public int hashCode() {
        return C5046k.m25799b(this.f12710c, this.f12711d);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f12711d);
        String valueOf2 = String.valueOf(this.f12710c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
