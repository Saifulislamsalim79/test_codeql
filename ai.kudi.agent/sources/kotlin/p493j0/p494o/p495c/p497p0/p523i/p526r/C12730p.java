package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: IntegerValueTypeConstructor.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.p */
/* loaded from: classes3.dex */
public final class C12730p implements InterfaceC13125t0 {

    /* renamed from: a */
    private final long f28592a;

    /* renamed from: b */
    private final InterfaceC13305c0 f28593b;

    /* renamed from: c */
    private final ArrayList<AbstractC12965b0> f28594c;

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: a */
    public Collection<AbstractC12965b0> mo5218a() {
        return this.f28594c;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: b */
    public InterfaceC13125t0 mo5217b(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: c */
    public List<InterfaceC13562z0> mo5207c() {
        List<InterfaceC13562z0> m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC13334h mo5206d() {
        return (InterfaceC13334h) m6883g();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: e */
    public boolean mo5205e() {
        return false;
    }

    /* renamed from: g */
    public Void m6883g() {
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: s */
    public AbstractC12046h mo5199s() {
        return this.f28593b.mo4979s();
    }

    public String toString() {
        return "IntegerValueType(" + this.f28592a + ')';
    }
}
