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
import org.org.org.org.internal.app.api.C14623a;
import org.org.org.org.internal.app.api.Label;
/* loaded from: classes.dex */
public final class NavigationMenuPresenter extends AbstractC11802m implements InterfaceC11767l<d, C13666w> {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11767l f32404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationMenuPresenter(InterfaceC11767l interfaceC11767l) {
        super(1);
        this.f32404c = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [lombok.org.libs.org.objectweb.asm.asm.Type] */
    /* renamed from: a */
    public final void m1025a(C14326a c14326a) {
        Handle handle;
        Log_OC.getArray(c14326a, "response");
        boolean $z0 = ClassReader.m2123a(c14326a);
        if ($z0) {
            int $i0 = c14326a.getGroupId();
            C14623a $r2 = Label.f32410j;
            String $r3 = c14326a.getValue();
            Object $r4 = $r2.m1015b($r3);
            Label $r5 = (Label) $r4;
            handle = r14;
            ?? type = new lombok.org.libs.org.objectweb.asm.asm.Type($i0, $r5);
        } else {
            handle = r11;
            int $i02 = c14326a.getGroupId();
            C14625h $r7 = org.org.org.org.internal.app.Label.f32406b;
            String $r32 = c14326a.getValue();
            Object $r42 = $r7.m997b($r32);
            Handle r11 = new Handle($i02, (org.org.org.org.internal.app.Label) $r42, null, 4, null);
        }
        InterfaceC11767l $r9 = this.f32404c;
        $r9.invoke(handle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(d dVar) {
        C14326a $r2 = (C14326a) dVar;
        m1025a($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }
}
