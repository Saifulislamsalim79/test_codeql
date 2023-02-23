package p198f.p199a.objectweb.asm;

import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p198f.p199a.objectweb.asm.signature.InterfaceC7449e;
import p198f.p199a.objectweb.asm.signature.Label;
/* compiled from: Refresh.kt */
/* renamed from: f.a.objectweb.asm.AnnotationWriter */
/* loaded from: classes.dex */
public final class AnnotationWriter implements InterfaceC7449e {

    /* renamed from: g */
    final /* synthetic */ AnnotationVisitor f17657g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnnotationWriter(AnnotationVisitor annotationVisitor) {
        this.f17657g = annotationVisitor;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p198f.p199a.objectweb.asm.signature.InterfaceC7449e
    /* renamed from: a */
    public void mo18696a(Label label) {
        Log_OC.getArray(label, "result");
        boolean $z0 = label.m18700a();
        if ($z0) {
            AnnotationVisitor $r2 = this.f17657g;
            $r2.visitArray();
        } else {
            boolean $z02 = label.m18699b();
            if ($z02) {
                AnnotationVisitor $r22 = this.f17657g;
                $r22.visitEnum();
            }
        }
        AnnotationVisitor $r23 = this.f17657g;
        InterfaceC11767l $r3 = $r23.visitAnnotation();
        if ($r3 == null) {
            return;
        }
        $r3.invoke(label);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p198f.p199a.objectweb.asm.signature.InterfaceC7449e
    /* renamed from: a */
    public void mo18695a(Throwable th) {
        Log_OC.getArray(th, "throwable");
        AnnotationVisitor $r3 = this.f17657g;
        InterfaceC11767l $r2 = $r3.visitEnd();
        if ($r2 == null) {
            return;
        }
        $r2.invoke(th);
    }
}
