package org.org.org.org.xml.asm.signature;

import a.a.b.a.b.d.d.f;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.Handle;
import lombok.org.libs.org.objectweb.asm.asm.Sequence;
import lombok.org.libs.org.objectweb.asm.asm.Type;
import org.org.org.org.org.common.screens.InterfaceC14645a;
import org.org.org.org.xml.core.util.Label;
/* loaded from: classes.dex */
public final class a$b$a extends AbstractC11802m implements InterfaceC11767l<f<? extends C13666w>, C13666w> {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11767l f32939c;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC14732a f32940j;

    /* renamed from: k */
    public final /* synthetic */ Label f32941k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$b$a(InterfaceC14732a interfaceC14732a, Label label, InterfaceC11767l interfaceC11767l) {
        super(1);
        this.f32940j = interfaceC14732a;
        this.f32941k = label;
        this.f32939c = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m464a(Sequence sequence) {
        Log_OC.getArray(sequence, "it");
        boolean $z0 = sequence instanceof Type;
        if ($z0) {
            InterfaceC14732a $r2 = this.f32940j;
            Label $r3 = this.f32941k;
            C14736e.m458b($r2, $r3);
            InterfaceC11767l $r4 = this.f32939c;
            $r4.invoke(sequence);
            return;
        }
        boolean $z02 = sequence instanceof Handle;
        if ($z02) {
            InterfaceC14732a $r22 = this.f32940j;
            Handle $r5 = (Handle) sequence;
            boolean $z03 = $r22.mo456a($r5);
            if ($z03) {
                InterfaceC14732a $r23 = this.f32940j;
                InterfaceC14645a $r6 = $r23.mo455b();
                Label $r32 = this.f32941k;
                String $r7 = $r32.m448a();
                $r6.mo912d($r7);
            }
            InterfaceC11767l $r42 = this.f32939c;
            $r42.invoke(sequence);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(f<? extends C13666w> fVar) {
        Sequence $r2 = (Sequence) fVar;
        m464a($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }
}
