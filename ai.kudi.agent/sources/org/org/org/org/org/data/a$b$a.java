package org.org.org.org.org.data;

import a.a.b.a.b.d.d.f;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.Sequence;
import lombok.org.libs.org.objectweb.asm.asm.Type;
/* loaded from: classes.dex */
public final class a$b$a extends AbstractC11802m implements InterfaceC11767l<f<? extends e.a.a.a.b.d.b.b>, C13666w> {

    /* renamed from: k */
    public final /* synthetic */ C14698e f32733k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$b$a(C14698e c14698e) {
        super(1);
        this.f32733k = c14698e;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m722a(Sequence sequence) {
        Log_OC.getArray(sequence, "it");
        Label $r1 = this.f32733k.f32742c;
        $r1.m754a(sequence);
        boolean $z0 = sequence instanceof Type;
        if ($z0) {
            C14698e $r4 = this.f32733k;
            Label $r12 = $r4.f32742c;
            String $r5 = $r4.f32743g;
            Type $r6 = (Type) sequence;
            Object $r2 = $r6.getValue();
            org.org.org.org.internal.app.api.Label $r7 = (org.org.org.org.internal.app.api.Label) $r2;
            $r12.m756a($r5, $r7);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(f<? extends e.a.a.a.b.d.b.b> fVar) {
        Sequence $r2 = (Sequence) fVar;
        m722a($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }
}
