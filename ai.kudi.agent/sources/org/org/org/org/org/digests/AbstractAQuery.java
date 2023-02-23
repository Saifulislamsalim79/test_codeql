package org.org.org.org.org.digests;

import e.a.a.a.e.d.b.a;
import kotlin.C13287o;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.xml.core.util.Context;
@kotlin.c0.k.a.f(c = "com.smartlook.sdk.smartlook.core.record.RecordHandler$1", f = "RecordHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AbstractAQuery extends AbstractC11745k implements InterfaceC11771p<C13287o<? extends Boolean, ? extends a>, InterfaceC11714d<? super C13666w>, Object> {

    /* renamed from: c */
    public final /* synthetic */ C14704f f32751c;

    /* renamed from: o */
    public C13287o f32752o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractAQuery(C14704f c14704f, InterfaceC11714d interfaceC11714d) {
        super(2, interfaceC11714d);
        this.f32751c = c14704f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final InterfaceC11714d create(Object obj, InterfaceC11714d interfaceC11714d) {
        Log_OC.getArray(interfaceC11714d, "completion");
        C14704f $r2 = this.f32751c;
        AbstractAQuery r6 = new AbstractAQuery($r2, interfaceC11714d);
        C13287o $r5 = (C13287o) obj;
        r6.f32752o = $r5;
        AbstractAQuery $r1 = r6;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public final Object invoke(C13287o<? extends Boolean, ? extends a> c13287o, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC11714d<? super C13666w> $r3 = interfaceC11714d;
        AbstractAQuery $r0 = (AbstractAQuery) create(c13287o, $r3);
        C13666w $r4 = C13666w.f30112a;
        Object $r1 = $r0.invokeSuspend($r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final Object invokeSuspend(Object obj) {
        C11734d.m10387d();
        C13291q.m5357b(obj);
        C13287o $r3 = this.f32752o;
        C14704f $r1 = this.f32751c;
        Object $r2 = $r3.m5364c();
        Boolean $r4 = (Boolean) $r2;
        boolean $z0 = $r4.booleanValue();
        Object $r22 = $r3.m5363d();
        Context $r5 = (Context) $r22;
        $r1.m693e($z0, $r5);
        C13666w r6 = C13666w.f30112a;
        return r6;
    }
}
