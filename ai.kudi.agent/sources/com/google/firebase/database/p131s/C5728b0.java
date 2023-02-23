package com.google.firebase.database.p131s;

import com.google.firebase.database.C5611c;
import com.google.firebase.database.C5617i;
import com.google.firebase.database.InterfaceC5627o;
import com.google.firebase.database.p131s.p136j0.C5803c;
import com.google.firebase.database.p131s.p136j0.C5804d;
import com.google.firebase.database.p131s.p136j0.C5814i;
import com.google.firebase.database.p131s.p136j0.InterfaceC5805e;
/* compiled from: ValueEventRegistration.java */
/* renamed from: com.google.firebase.database.s.b0 */
/* loaded from: classes2.dex */
public class C5728b0 extends AbstractC5772i {

    /* renamed from: d */
    private final C5833n f14104d;

    /* renamed from: e */
    private final InterfaceC5627o f14105e;

    /* renamed from: f */
    private final C5814i f14106f;

    public C5728b0(C5833n c5833n, InterfaceC5627o interfaceC5627o, C5814i c5814i) {
        this.f14104d = c5833n;
        this.f14105e = interfaceC5627o;
        this.f14106f = c5814i;
    }

    @Override // com.google.firebase.database.p131s.AbstractC5772i
    /* renamed from: a */
    public AbstractC5772i mo23812a(C5814i c5814i) {
        return new C5728b0(this.f14104d, this.f14105e, c5814i);
    }

    @Override // com.google.firebase.database.p131s.AbstractC5772i
    /* renamed from: b */
    public C5804d mo23811b(C5803c c5803c, C5814i c5814i) {
        return new C5804d(InterfaceC5805e.EnumC5806a.VALUE, this, C5617i.m24313a(C5617i.m24311c(this.f14104d, c5814i.m23643e()), c5803c.m23678k()), null);
    }

    @Override // com.google.firebase.database.p131s.AbstractC5772i
    /* renamed from: c */
    public void mo23810c(C5611c c5611c) {
        this.f14105e.onCancelled(c5611c);
    }

    @Override // com.google.firebase.database.p131s.AbstractC5772i
    /* renamed from: d */
    public void mo23809d(C5804d c5804d) {
        if (m23805h()) {
            return;
        }
        this.f14105e.onDataChange(c5804d.m23674c());
    }

    @Override // com.google.firebase.database.p131s.AbstractC5772i
    /* renamed from: e */
    public C5814i mo23808e() {
        return this.f14106f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5728b0) {
            C5728b0 c5728b0 = (C5728b0) obj;
            if (c5728b0.f14105e.equals(this.f14105e) && c5728b0.f14104d.equals(this.f14104d) && c5728b0.f14106f.equals(this.f14106f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.database.p131s.AbstractC5772i
    /* renamed from: f */
    public boolean mo23807f(AbstractC5772i abstractC5772i) {
        return (abstractC5772i instanceof C5728b0) && ((C5728b0) abstractC5772i).f14105e.equals(this.f14105e);
    }

    public int hashCode() {
        return (((this.f14105e.hashCode() * 31) + this.f14104d.hashCode()) * 31) + this.f14106f.hashCode();
    }

    @Override // com.google.firebase.database.p131s.AbstractC5772i
    /* renamed from: i */
    public boolean mo23804i(InterfaceC5805e.EnumC5806a enumC5806a) {
        return enumC5806a == InterfaceC5805e.EnumC5806a.VALUE;
    }

    public String toString() {
        return "ValueEventRegistration";
    }
}
