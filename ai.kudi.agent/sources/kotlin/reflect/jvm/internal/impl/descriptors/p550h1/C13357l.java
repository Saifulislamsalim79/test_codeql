package kotlin.reflect.jvm.internal.impl.descriptors.p550h1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
/* compiled from: Annotations.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.l */
/* loaded from: classes3.dex */
public final class C13357l implements InterfaceC13346g {

    /* renamed from: c */
    private final InterfaceC13346g f29528c;

    /* renamed from: d */
    private final boolean f29529d;

    /* renamed from: e */
    private final InterfaceC11767l<C12609c, Boolean> f29530e;

    /* JADX WARN: Multi-variable type inference failed */
    public C13357l(InterfaceC13346g interfaceC13346g, boolean z, InterfaceC11767l<? super C12609c, Boolean> interfaceC11767l) {
        l.f(interfaceC13346g, "delegate");
        l.f(interfaceC11767l, "fqNameFilter");
        this.f29528c = interfaceC13346g;
        this.f29529d = z;
        this.f29530e = interfaceC11767l;
    }

    /* renamed from: e */
    private final boolean m5303e(InterfaceC13340c interfaceC13340c) {
        C12609c mo5309f = interfaceC13340c.mo5309f();
        return mo5309f != null && this.f29530e.invoke(mo5309f).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: Q */
    public boolean mo5304Q(C12609c c12609c) {
        l.f(c12609c, "fqName");
        if (this.f29530e.invoke(c12609c).booleanValue()) {
            return this.f29528c.mo5304Q(c12609c);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    public boolean isEmpty() {
        boolean z;
        InterfaceC13346g<InterfaceC13340c> interfaceC13346g = this.f29528c;
        if (!(interfaceC13346g instanceof Collection) || !((Collection) interfaceC13346g).isEmpty()) {
            for (InterfaceC13340c interfaceC13340c : interfaceC13346g) {
                if (m5303e(interfaceC13340c)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return this.f29529d ? !z : z;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC13340c> iterator() {
        InterfaceC13346g interfaceC13346g = this.f29528c;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC13340c interfaceC13340c : interfaceC13346g) {
            if (m5303e(interfaceC13340c)) {
                arrayList.add(interfaceC13340c);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: r */
    public InterfaceC13340c mo5302r(C12609c c12609c) {
        l.f(c12609c, "fqName");
        if (this.f29530e.invoke(c12609c).booleanValue()) {
            return this.f29528c.mo5302r(c12609c);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13357l(InterfaceC13346g interfaceC13346g, InterfaceC11767l<? super C12609c, Boolean> interfaceC11767l) {
        this(interfaceC13346g, false, interfaceC11767l);
        l.f(interfaceC13346g, "delegate");
        l.f(interfaceC11767l, "fqNameFilter");
    }
}
