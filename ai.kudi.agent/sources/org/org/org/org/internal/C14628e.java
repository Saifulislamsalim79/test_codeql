package org.org.org.org.internal;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.Handle;
/* renamed from: org.org.org.org.internal.e */
/* loaded from: classes.dex */
public final class C14628e extends AbstractC11802m implements InterfaceC11767l<Exception, C13666w> {

    /* renamed from: d */
    public final /* synthetic */ InterfaceC11767l f32460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14628e(InterfaceC11767l interfaceC11767l) {
        super(1);
        this.f32460d = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m994a(Exception exc) {
        Log_OC.getArray(exc, "exception");
        InterfaceC11767l $r3 = this.f32460d;
        Handle $r2 = new Handle(-1, null, exc, 2, null);
        $r3.invoke($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Exception exc) {
        Exception $r2 = exc;
        m994a($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }
}
