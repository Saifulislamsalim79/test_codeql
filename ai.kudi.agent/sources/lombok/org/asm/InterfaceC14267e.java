package lombok.org.asm;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* renamed from: lombok.org.asm.e */
/* loaded from: classes.dex */
public interface InterfaceC14267e {

    /* renamed from: lombok.org.asm.e$a */
    /* loaded from: classes.dex */
    public final class C14268a extends FieldVisitor {

        /* renamed from: b */
        public final InterfaceC11714d<C13666w> f31385b;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public C14268a(InterfaceC11719g interfaceC11719g, InterfaceC11771p interfaceC11771p) {
            super(interfaceC11719g, false);
            InterfaceC11714d $r2;
            $r2 = C11729c.m10389b(interfaceC11771p, this, this);
            this.f31385b = $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: b */
        public void m2304b() {
            InterfaceC11714d $r1 = this.f31385b;
            lombok.org.asm.tree.Label.m2171a($r1, this);
        }
    }

    /* renamed from: a */
    C14247a mo2173a();

    /* renamed from: b */
    boolean mo2172b();
}
