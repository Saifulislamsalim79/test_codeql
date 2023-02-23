package lombok.org.libs.org.objectweb.tree;

import a.a.b.a.b.d.d.f;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.Sequence;
/* loaded from: classes.dex */
public final class ArraysKt___ArraysKt$withIndex$6 extends AbstractC11802m implements InterfaceC11767l<f<? extends e.a.a.a.b.d.b.b>, C13666w> {
    public final /* synthetic */ InterfaceC11767l receiver$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$6(InterfaceC11767l interfaceC11767l) {
        super(1);
        this.receiver$0 = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(f<? extends e.a.a.a.b.d.b.b> fVar) {
        Sequence $r2 = (Sequence) fVar;
        invoke($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(Sequence sequence) {
        Log_OC.getArray(sequence, "it");
        InterfaceC11767l $r2 = this.receiver$0;
        $r2.invoke(sequence);
    }
}
