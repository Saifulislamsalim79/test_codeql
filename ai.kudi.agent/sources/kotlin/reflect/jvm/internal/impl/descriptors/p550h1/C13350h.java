package kotlin.reflect.jvm.internal.impl.descriptors.p550h1;

import java.util.Iterator;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: AnnotationsImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.h */
/* loaded from: classes3.dex */
public final class C13350h implements InterfaceC13346g {

    /* renamed from: c */
    private final List<InterfaceC13340c> f29519c;

    /* JADX WARN: Multi-variable type inference failed */
    public C13350h(List<? extends InterfaceC13340c> list) {
        l.f(list, "annotations");
        this.f29519c = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: Q */
    public boolean mo5304Q(C12609c c12609c) {
        return InterfaceC13346g.C13349b.m5314b(this, c12609c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    public boolean isEmpty() {
        return this.f29519c.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC13340c> iterator() {
        return this.f29519c.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: r */
    public InterfaceC13340c mo5302r(C12609c c12609c) {
        return InterfaceC13346g.C13349b.m5315a(this, c12609c);
    }

    public String toString() {
        return this.f29519c.toString();
    }
}
