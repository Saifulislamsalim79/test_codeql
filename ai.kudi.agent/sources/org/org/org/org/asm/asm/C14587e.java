package org.org.org.org.asm.asm;

import kotlin.C13287o;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: org.org.org.org.asm.asm.e */
/* loaded from: classes.dex */
public final class C14587e extends AbstractC11802m implements InterfaceC11767l<C13287o<? extends Class<?>, ? extends H>, Boolean> {

    /* renamed from: c */
    public final /* synthetic */ Class f32338c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14587e(Class cls) {
        super(1);
        this.f32338c = cls;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m1128a(C13287o c13287o) {
        Log_OC.getArray(c13287o, "it");
        Object $r2 = c13287o.m5364c();
        Class $r3 = (Class) $r2;
        Class $r4 = this.f32338c;
        boolean $z0 = Log_OC.append($r3, $r4);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        C13287o $r2 = (C13287o) obj;
        boolean $z0 = m1128a($r2);
        Boolean $r3 = Boolean.valueOf($z0);
        return $r3;
    }
}
