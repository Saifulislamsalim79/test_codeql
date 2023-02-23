package kotlinx.coroutines.internal;

import kotlin.C11709c;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlinx.coroutines.C13917j0;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: OnUndeliveredElement.kt */
/* renamed from: kotlinx.coroutines.internal.t */
/* loaded from: classes3.dex */
public final class C13908t {

    /* compiled from: OnUndeliveredElement.kt */
    /* renamed from: kotlinx.coroutines.internal.t$a */
    /* loaded from: classes3.dex */
    static final class C13909a extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11767l<E, C13666w> f30397c;

        /* renamed from: d */
        final /* synthetic */ E f30398d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC11719g f30399e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13909a(InterfaceC11767l<? super E, C13666w> interfaceC11767l, E e, InterfaceC11719g interfaceC11719g) {
            super(1);
            this.f30397c = interfaceC11767l;
            this.f30398d = e;
            this.f30399e = interfaceC11719g;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
            invoke2(th);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C13908t.m3441b(this.f30397c, this.f30398d, this.f30399e);
        }
    }

    /* renamed from: a */
    public static final <E> InterfaceC11767l<Throwable, C13666w> m3442a(InterfaceC11767l<? super E, C13666w> interfaceC11767l, E e, InterfaceC11719g interfaceC11719g) {
        return new C13909a(interfaceC11767l, e, interfaceC11719g);
    }

    /* renamed from: b */
    public static final <E> void m3441b(InterfaceC11767l<? super E, C13666w> interfaceC11767l, E e, InterfaceC11719g interfaceC11719g) {
        UndeliveredElementException m3440c = m3440c(interfaceC11767l, e, null);
        if (m3440c == null) {
            return;
        }
        C13917j0.m3410a(interfaceC11719g, m3440c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <E> UndeliveredElementException m3440c(InterfaceC11767l<? super E, C13666w> interfaceC11767l, E e, UndeliveredElementException undeliveredElementException) {
        try {
            interfaceC11767l.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                C11709c.m10411a(undeliveredElementException, th);
            } else {
                return new UndeliveredElementException(kotlin.e0.d.l.m("Exception in undelivered element handler for ", e), th);
            }
        }
        return undeliveredElementException;
    }

    /* renamed from: d */
    public static /* synthetic */ UndeliveredElementException m3439d(InterfaceC11767l interfaceC11767l, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return m3440c(interfaceC11767l, obj, undeliveredElementException);
    }
}
