package org.org.org.org.internal;

import a.a.b.a.b.d.d.d;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.C14326a;
import lombok.org.libs.org.objectweb.asm.asm.ClassReader;
import lombok.org.libs.org.objectweb.asm.asm.Handle;
import org.org.org.org.internal.app.C14625h;
import org.org.org.org.internal.app.Label;
/* renamed from: org.org.org.org.internal.b */
/* loaded from: classes.dex */
public final class C14626b extends AbstractC11802m implements InterfaceC11767l<d, C13666w> {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC11767l f32458b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14626b(InterfaceC11767l interfaceC11767l) {
        super(1);
        this.f32458b = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [lombok.org.libs.org.objectweb.asm.asm.Type] */
    /* renamed from: a */
    public final void m996a(C14326a c14326a) {
        Handle handle;
        Log_OC.getArray(c14326a, "response");
        boolean $z0 = ClassReader.m2123a(c14326a);
        if ($z0) {
            int $i0 = c14326a.getGroupId();
            C13666w $r2 = C13666w.f30112a;
            handle = r10;
            ?? type = new lombok.org.libs.org.objectweb.asm.asm.Type($i0, $r2);
        } else {
            handle = r10;
            int $i02 = c14326a.getGroupId();
            C14625h $r4 = Label.f32406b;
            String $r5 = c14326a.getValue();
            Object $r6 = $r4.m997b($r5);
            Handle r10 = new Handle($i02, (Label) $r6, null, 4, null);
        }
        InterfaceC11767l $r8 = this.f32458b;
        $r8.invoke(handle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(d dVar) {
        C14326a $r2 = (C14326a) dVar;
        m996a($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }
}
