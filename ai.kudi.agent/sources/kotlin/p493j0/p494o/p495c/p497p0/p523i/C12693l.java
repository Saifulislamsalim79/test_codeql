package kotlin.p493j0.p494o.p495c.p497p0.p523i;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13722p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.utils.C13658h;
/* compiled from: overridingUtils.kt */
/* renamed from: kotlin.j0.o.c.p0.i.l */
/* loaded from: classes3.dex */
public final class C12693l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: overridingUtils.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.l$a */
    /* loaded from: classes3.dex */
    public static final class C12694a extends AbstractC11802m implements InterfaceC11767l<H, C13666w> {

        /* renamed from: c */
        final /* synthetic */ C13658h<H> f28559c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12694a(C13658h<H> c13658h) {
            super(1);
            this.f28559c = c13658h;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Object obj) {
            invoke2((C12694a) obj);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(H h) {
            AbstractCollection abstractCollection = this.f28559c;
            l.e(h, "it");
            abstractCollection.add(h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <H> Collection<H> m6940a(Collection<? extends H> collection, InterfaceC11767l<? super H, ? extends InterfaceC13293a> interfaceC11767l) {
        l.f(collection, "<this>");
        l.f(interfaceC11767l, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C13658h m4236a = C13658h.f30099e.m4236a();
        while (!linkedList.isEmpty()) {
            Object m3954R = C13722p.m3954R(linkedList);
            C13658h m4236a2 = C13658h.f30099e.m4236a();
            Collection<? super H> m6964q = C12681j.m6964q(m3954R, linkedList, interfaceC11767l, new C12694a(m4236a2));
            l.e(m6964q, "val conflictedHandles = SmartSet.create<H>()\n\n        val overridableGroup =\n            OverridingUtil.extractMembersOverridableInBothWays(nextHandle, queue, descriptorByHandle) { conflictedHandles.add(it) }");
            if (m6964q.size() == 1 && m4236a2.isEmpty()) {
                Object m3919p0 = C13722p.m3919p0(m6964q);
                l.e(m3919p0, "overridableGroup.single()");
                m4236a.add(m3919p0);
            } else {
                Object obj = (Object) C12681j.m6981M(m6964q, interfaceC11767l);
                l.e(obj, "selectMostSpecificMember(overridableGroup, descriptorByHandle)");
                InterfaceC13293a invoke = interfaceC11767l.invoke(obj);
                for (Object obj2 : m6964q) {
                    l.e(obj2, "it");
                    if (!C12681j.m6991C(invoke, interfaceC11767l.invoke(obj2))) {
                        m4236a2.add(obj2);
                    }
                }
                if (!m4236a2.isEmpty()) {
                    m4236a.addAll(m4236a2);
                }
                m4236a.add(obj);
            }
        }
        return m4236a;
    }
}
