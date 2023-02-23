package com.uber.autodispose.lifecycle;

import com.uber.autodispose.C7407i;
import com.uber.autodispose.OutsideScopeException;
import java.util.Comparator;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.p450e0.InterfaceC11292g;
/* compiled from: LifecycleScopes.java */
/* renamed from: com.uber.autodispose.lifecycle.f */
/* loaded from: classes2.dex */
public final class C7417f {

    /* renamed from: a */
    private static final Comparator<Comparable<Object>> f17578a = C7414c.f17577c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m18774a(Comparator comparator, Object obj, Object obj2) throws Exception {
        return comparator.compare(obj2, obj) >= 0;
    }

    /* renamed from: c */
    public static <E> InterfaceC11284d m18772c(InterfaceC7416e<E> interfaceC7416e) throws OutsideScopeException {
        return m18771d(interfaceC7416e, true);
    }

    /* renamed from: d */
    public static <E> InterfaceC11284d m18771d(InterfaceC7416e<E> interfaceC7416e, boolean z) throws OutsideScopeException {
        E mo18777a = interfaceC7416e.mo18777a();
        InterfaceC7415d<E> mo18775c = interfaceC7416e.mo18775c();
        if (mo18777a != null) {
            try {
                return m18770e(interfaceC7416e.mo18776b(), mo18775c.mo10663a(mo18777a));
            } catch (Exception e) {
                if (z && (e instanceof LifecycleEndedException)) {
                    j.e.e0.e<? super OutsideScopeException> m18791b = C7407i.m18791b();
                    if (m18791b != null) {
                        try {
                            m18791b.accept((LifecycleEndedException) e);
                            return AbstractC11271b.m11246e();
                        } catch (Exception e2) {
                            return AbstractC11271b.m11241j(e2);
                        }
                    }
                    throw e;
                }
                return AbstractC11271b.m11241j(e);
            }
        }
        throw new LifecycleNotStartedException();
    }

    /* renamed from: e */
    public static <E> InterfaceC11284d m18770e(AbstractC11688p<E> abstractC11688p, E e) {
        return m18769f(abstractC11688p, e, e instanceof Comparable ? f17578a : null);
    }

    /* renamed from: f */
    public static <E> InterfaceC11284d m18769f(AbstractC11688p<E> abstractC11688p, final E e, final Comparator<E> comparator) {
        InterfaceC11292g<? super E> interfaceC11292g;
        if (comparator != null) {
            interfaceC11292g = new InterfaceC11292g() { // from class: com.uber.autodispose.lifecycle.a
                @Override // p425j.p444e.p450e0.InterfaceC11292g
                /* renamed from: c */
                public final boolean mo10557c(Object obj) {
                    return C7417f.m18774a(comparator, e, obj);
                }
            };
        } else {
            interfaceC11292g = new InterfaceC11292g() { // from class: com.uber.autodispose.lifecycle.b
                @Override // p425j.p444e.p450e0.InterfaceC11292g
                /* renamed from: c */
                public final boolean mo10557c(Object obj) {
                    boolean equals;
                    equals = obj.equals(e);
                    return equals;
                }
            };
        }
        return abstractC11688p.m10518b0(1L).m10503l0(interfaceC11292g).m10533M();
    }
}
