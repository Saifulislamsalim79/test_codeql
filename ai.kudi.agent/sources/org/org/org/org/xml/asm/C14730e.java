package org.org.org.org.xml.asm;

import a.a.a.w;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.Number;
import org.org.org.org.xml.core.Attribute;
@kotlin.c0.k.a.f(c = "com.smartlook.sdk.smartlook.job.worker.OldUploadWorker$uploadRecord$1", f = "OldUploadWorker.kt", l = {}, m = "invokeSuspend")
/* renamed from: org.org.org.org.xml.asm.e */
/* loaded from: classes.dex */
public final class C14730e extends AbstractC11745k implements InterfaceC11771p<w, InterfaceC11714d<? super C13666w>, Object> {

    /* renamed from: j */
    public final /* synthetic */ Attribute f32936j;

    /* renamed from: l */
    public final /* synthetic */ ByteVector f32937l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14730e(ByteVector byteVector, Attribute attribute, InterfaceC11714d interfaceC11714d) {
        super(2, interfaceC11714d);
        this.f32937l = byteVector;
        this.f32936j = attribute;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final InterfaceC11714d create(Object obj, InterfaceC11714d interfaceC11714d) {
        Log_OC.getArray(interfaceC11714d, "completion");
        ByteVector $r2 = this.f32937l;
        Attribute $r3 = this.f32936j;
        InterfaceC11714d r7 = new C14730e($r2, $r3, interfaceC11714d);
        Number number = (Number) obj;
        InterfaceC11714d $r1 = r7;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public final Object invoke(w wVar, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC11714d<? super C13666w> $r3 = interfaceC11714d;
        C14730e $r0 = (C14730e) create(wVar, $r3);
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
        ByteVector $r4 = this.f32937l;
        Attribute $r5 = this.f32936j;
        org.org.org.org.xml.core.util.Label $r2 = $r5.m450a();
        c$a$a $r1 = new c$a$a(this);
        $r4.m475a($r2, $r1);
        C13666w r6 = C13666w.f30112a;
        return r6;
    }
}
