package org.org.org.org.org.digests;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
@kotlin.c0.k.a.f(c = "com.smartlook.sdk.smartlook.core.record.RecordHandler$2", f = "RecordHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Rule extends AbstractC11745k implements InterfaceC11771p<C13666w, InterfaceC11714d<? super C13666w>, Object> {

    /* renamed from: c */
    public final /* synthetic */ C14704f f32753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rule(C14704f c14704f, InterfaceC11714d interfaceC11714d) {
        super(2, interfaceC11714d);
        this.f32753c = c14704f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final InterfaceC11714d create(Object obj, InterfaceC11714d interfaceC11714d) {
        Log_OC.getArray(interfaceC11714d, "completion");
        C14704f $r2 = this.f32753c;
        InterfaceC11714d r6 = new Rule($r2, interfaceC11714d);
        C13666w c13666w = (C13666w) obj;
        InterfaceC11714d $r1 = r6;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public final Object invoke(C13666w c13666w, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC11714d<? super C13666w> $r3 = interfaceC11714d;
        Rule $r0 = (Rule) create(c13666w, $r3);
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
        C14704f $r2 = this.f32753c;
        $r2.m701a();
        C13666w r3 = C13666w.f30112a;
        return r3;
    }
}
