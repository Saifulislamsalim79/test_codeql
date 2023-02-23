package org.org.org.org.org.jraf;

import a.a.a.w;
import com.smartlook.sdk.smartlook.core.bridge.model.WireframeData;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.Number;
@f(c = "com.smartlook.sdk.smartlook.core.bridge.BridgeInterfaceHandler$obtainWireframeDataBlocking$2", f = "BridgeInterfaceHandler.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AbstractAQuery extends AbstractC11745k implements InterfaceC11771p<w, InterfaceC11714d<? super WireframeData>, Object> {

    /* renamed from: c */
    public final /* synthetic */ Label f32832c;
    public Number context;
    public int proxy;
    public Object view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractAQuery(Label label, InterfaceC11714d interfaceC11714d) {
        super(2, interfaceC11714d);
        this.f32832c = label;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final InterfaceC11714d create(Object obj, InterfaceC11714d interfaceC11714d) {
        Log_OC.getArray(interfaceC11714d, "completion");
        Label $r2 = this.f32832c;
        AbstractAQuery r6 = new AbstractAQuery($r2, interfaceC11714d);
        Number $r5 = (Number) obj;
        r6.context = $r5;
        AbstractAQuery $r1 = r6;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public final Object invoke(w wVar, InterfaceC11714d<? super WireframeData> interfaceC11714d) {
        InterfaceC11714d<? super WireframeData> $r3 = interfaceC11714d;
        AbstractAQuery $r0 = (AbstractAQuery) create(wVar, $r3);
        C13666w $r4 = C13666w.f30112a;
        Object $r1 = $r0.invokeSuspend($r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final Object invokeSuspend(Object obj) {
        Object $r2;
        $r2 = C11734d.m10387d();
        int $i0 = this.proxy;
        if ($i0 != 0) {
            if ($i0 != 1) {
                IllegalStateException r6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw r6;
            }
            Number number = (Number) this.view;
            C13291q.m5357b(obj);
            return obj;
        }
        C13291q.m5357b(obj);
        Number $r3 = this.context;
        Label $r5 = this.f32832c;
        this.view = $r3;
        this.proxy = 1;
        AbstractAQuery r7 = this;
        Object $r1 = $r5.m638a(r7);
        return $r1 == $r2 ? $r2 : $r1;
    }
}
