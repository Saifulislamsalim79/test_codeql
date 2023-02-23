package lombok.org.asm.signature;

import a.a.a.w;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import lombok.org.asm.Number;
@f(c = "com.smartlook.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MethodWriter extends AbstractC11745k implements InterfaceC11771p<w, InterfaceC11714d<? super C13666w>, Object> {

    /* renamed from: d */
    public Object f31463d;

    /* renamed from: i */
    public final /* synthetic */ Item f31464i;

    /* renamed from: p */
    public Number f31465p;

    /* renamed from: r */
    public int f31466r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodWriter(Item item, InterfaceC11714d interfaceC11714d) {
        super(2, interfaceC11714d);
        this.f31464i = item;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final InterfaceC11714d create(Object obj, InterfaceC11714d interfaceC11714d) {
        Item $r3 = this.f31464i;
        MethodWriter r6 = new MethodWriter($r3, interfaceC11714d);
        Number $r5 = (Number) obj;
        r6.f31465p = $r5;
        MethodWriter $r1 = r6;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public final Object invoke(w wVar, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC11714d<? super C13666w> $r5 = interfaceC11714d;
        Item $r2 = this.f31464i;
        MethodWriter $r1 = new MethodWriter($r2, $r5);
        Number $r6 = (Number) wVar;
        $r1.f31465p = $r6;
        C13666w $r7 = C13666w.f30112a;
        Object $r3 = $r1.invokeSuspend($r7);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final Object invokeSuspend(Object obj) {
        Object $r2;
        $r2 = C11734d.m10387d();
        int $i0 = this.f31466r;
        if ($i0 == 0) {
            C13291q.m5357b(obj);
            Number $r3 = this.f31465p;
            Item $r5 = this.f31464i;
            this.f31463d = $r3;
            this.f31466r = 1;
            MethodWriter r8 = this;
            Object $r1 = ByteVector.m2185a($r5, r8);
            if ($r1 == $r2) {
                return $r2;
            }
        } else if ($i0 != 1) {
            IllegalStateException r7 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw r7;
        } else {
            Number number = (Number) this.f31463d;
            C13291q.m5357b(obj);
        }
        C13666w r6 = C13666w.f30112a;
        return r6;
    }
}
