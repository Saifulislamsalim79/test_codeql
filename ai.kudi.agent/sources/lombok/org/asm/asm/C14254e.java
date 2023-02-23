package lombok.org.asm.asm;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* renamed from: lombok.org.asm.asm.e */
/* loaded from: classes.dex */
public final class C14254e extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {

    /* renamed from: d */
    public final /* synthetic */ InterfaceC11719g f31343d;

    /* renamed from: e */
    public final /* synthetic */ Object f31344e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC11767l f31345f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14254e(InterfaceC11767l interfaceC11767l, Object obj, InterfaceC11719g interfaceC11719g) {
        super(1);
        this.f31345f = interfaceC11767l;
        this.f31344e = obj;
        this.f31343d = interfaceC11719g;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public C13666w invoke(Throwable th) {
        InterfaceC11767l $r5 = this.f31345f;
        Object $r1 = this.f31344e;
        InterfaceC11719g $r2 = this.f31343d;
        C14263p $r3 = Handler.m2340a($r5, $r1, null);
        if ($r3 != null) {
            lombok.org.asm.ClassReader.m2380a($r2, $r3);
        }
        C13666w r6 = C13666w.f30112a;
        return r6;
    }
}
