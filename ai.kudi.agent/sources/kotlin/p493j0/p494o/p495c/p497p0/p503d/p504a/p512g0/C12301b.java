package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0;

import java.util.Iterator;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.g0.b */
/* loaded from: classes3.dex */
final class C12301b implements InterfaceC13346g {

    /* renamed from: c */
    private final C12609c f27341c;

    public C12301b(C12609c c12609c) {
        l.f(c12609c, "fqNameToMatch");
        this.f27341c = c12609c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: Q */
    public boolean mo5304Q(C12609c c12609c) {
        return InterfaceC13346g.C13349b.m5314b(this, c12609c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: e */
    public C12300a mo5302r(C12609c c12609c) {
        l.f(c12609c, "fqName");
        if (l.b(c12609c, this.f27341c)) {
            return C12300a.f27340a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC13340c> iterator() {
        List m3891e;
        m3891e = C13726r.m3891e();
        return m3891e.iterator();
    }
}
