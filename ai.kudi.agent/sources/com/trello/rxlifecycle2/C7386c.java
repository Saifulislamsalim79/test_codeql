package com.trello.rxlifecycle2;

import com.trello.rxlifecycle2.p193f.C7391a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11694t;
/* compiled from: LifecycleTransformer.java */
/* renamed from: com.trello.rxlifecycle2.c */
/* loaded from: classes2.dex */
public final class C7386c<T> implements InterfaceC11694t<T, T> {

    /* renamed from: a */
    final AbstractC11688p<?> f17540a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7386c(AbstractC11688p<?> abstractC11688p) {
        C7391a.m18816a(abstractC11688p, "observable == null");
        this.f17540a = abstractC11688p;
    }

    @Override // p425j.p444e.InterfaceC11694t
    /* renamed from: a */
    public InterfaceC11692s<T> mo10452a(AbstractC11688p<T> abstractC11688p) {
        return abstractC11688p.m10505k0(this.f17540a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7386c.class != obj.getClass()) {
            return false;
        }
        return this.f17540a.equals(((C7386c) obj).f17540a);
    }

    public int hashCode() {
        return this.f17540a.hashCode();
    }

    public String toString() {
        return "LifecycleTransformer{observable=" + this.f17540a + '}';
    }
}
