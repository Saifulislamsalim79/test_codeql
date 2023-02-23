package lombok.org.asm.asm;

import a.a.a.c2.t;
import a.a.a.o1;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.InterfaceC14296n;
/* renamed from: lombok.org.asm.asm.i */
/* loaded from: classes.dex */
public final class C14258i {

    /* renamed from: a */
    public static final InterfaceC11771p<o1<?>, InterfaceC11719g.InterfaceC11722b, o1<?>> f31358a;

    /* renamed from: b */
    public static final InterfaceC11771p<t, InterfaceC11719g.InterfaceC11722b, t> f31359b;

    /* renamed from: c */
    public static final InterfaceC11771p<t, InterfaceC11719g.InterfaceC11722b, t> f31360c;

    /* renamed from: g */
    public static final Paint f31361g;

    /* renamed from: p */
    public static final InterfaceC11771p<Object, InterfaceC11719g.InterfaceC11722b, Object> f31362p;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Paint $r0 = new Paint("ZERO");
        f31361g = $r0;
        ChildNumber $r1 = ChildNumber.ZERO;
        f31362p = $r1;
        Target $r2 = Target.f31335a;
        f31358a = $r2;
        Token $r3 = Token.PERCENT;
        f31360c = $r3;
        CloudinessUnit $r4 = CloudinessUnit.PERCENT;
        f31359b = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final Object m2319a(InterfaceC11719g interfaceC11719g) {
        InterfaceC11771p $r0 = f31362p;
        Object $r3 = interfaceC11719g.fold(0, $r0);
        Log_OC.append($r3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final void m2318a(InterfaceC11719g interfaceC11719g, Object obj) {
        Paint $r3 = f31361g;
        if (obj == $r3) {
            return;
        }
        boolean $z0 = obj instanceof C14260l;
        if ($z0) {
            C14260l $r4 = (C14260l) obj;
            $r4.f31366i = 0;
            InterfaceC11771p $r5 = f31359b;
            interfaceC11719g.fold(obj, $r5);
            return;
        }
        InterfaceC11771p $r52 = f31358a;
        Object $r0 = interfaceC11719g.fold(null, $r52);
        if ($r0 == null) {
            NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.ThreadContextElement<kotlin.Any?>");
            throw $r7;
        }
        InterfaceC14296n $r6 = (InterfaceC14296n) $r0;
        $r6.m2194a(interfaceC11719g, obj);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static final Object m2317b(InterfaceC11719g interfaceC11719g, Object $r1) {
        if ($r1 == null) {
            InterfaceC11771p $r3 = f31362p;
            Object $r4 = interfaceC11719g.fold(0, $r3);
            $r1 = $r4;
            Log_OC.append($r4);
        }
        if ($r1 == 0) {
            Paint r9 = f31361g;
            return r9;
        }
        boolean $z0 = $r1 instanceof java.lang.Integer;
        if ($z0) {
            Number $r6 = (Number) $r1;
            int $i0 = $r6.intValue();
            C14260l $r5 = new C14260l(interfaceC11719g, $i0);
            InterfaceC11771p $r32 = f31360c;
            return interfaceC11719g.fold($r5, $r32);
        } else if ($r1 != null) {
            InterfaceC14296n $r7 = (InterfaceC14296n) $r1;
            return $r7.m2195a(interfaceC11719g);
        } else {
            NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.ThreadContextElement<kotlin.Any?>");
            throw $r8;
        }
    }
}
