package lombok.org.asm.menu;

import a.a.a.a2.a;
import a.a.a.a2.r;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11767l;
import lombok.org.asm.InterfaceC14270g;
import lombok.org.asm.asm.C14254e;
/* renamed from: lombok.org.asm.menu.e */
/* loaded from: classes.dex */
public interface InterfaceC14282e<E> extends r<E> {

    /* renamed from: lombok.org.asm.menu.e$a */
    /* loaded from: classes.dex */
    public final class C14283a<E> extends a.a<E> {

        /* renamed from: a */
        public final InterfaceC11767l<E, C13666w> f31437a;

        public C14283a(InterfaceC14270g interfaceC14270g, int i, InterfaceC11767l interfaceC11767l) {
            super(interfaceC14270g, i);
            this.f31437a = interfaceC11767l;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: a */
        public InterfaceC11767l m2233a(java.lang.Object obj) {
            InterfaceC11767l $r2 = this.f31437a;
            InterfaceC11719g $r4 = this.f31454a.getContext();
            C14254e $r3 = new C14254e($r2, obj, $r4);
            return $r3;
        }
    }

    /* renamed from: a */
    InterfaceC14277a m2234a();
}
