package org.org.org.org.xml.asm;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.Handle;
import lombok.org.libs.org.objectweb.asm.asm.Sequence;
import lombok.org.libs.org.objectweb.asm.asm.Type;
import org.org.org.org.xml.core.Attribute;
/* loaded from: classes.dex */
public final class c$a$a extends AbstractC11802m implements InterfaceC11767l<a.a.b.a.b.d.d.f<? extends C13666w>, C13666w> {

    /* renamed from: k */
    public final /* synthetic */ C14730e f32935k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c$a$a(C14730e c14730e) {
        super(1);
        this.f32935k = c14730e;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m470a(Sequence sequence) {
        Log_OC.getArray(sequence, "it");
        boolean $z0 = sequence instanceof Handle;
        if (!$z0) {
            boolean $z02 = sequence instanceof Type;
            if ($z02) {
                ByteVector $r4 = this.f32935k.f32937l;
                $r4.add();
                return;
            }
            return;
        }
        Handle $r2 = (Handle) sequence;
        int $i0 = $r2.getName();
        if ($i0 != -1) {
            C14730e $r3 = this.f32935k;
            ByteVector $r42 = $r3.f32937l;
            Attribute $r5 = $r3.f32936j;
            $r42.read($r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(a.a.b.a.b.d.d.f<? extends C13666w> fVar) {
        Sequence $r2 = (Sequence) fVar;
        m470a($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }
}
