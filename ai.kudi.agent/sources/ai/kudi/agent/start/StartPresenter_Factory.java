package ai.kudi.agent.start;

import f.a.a.a.d;
import p198f.p199a.objectweb.asm.AnnotationVisitor;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class StartPresenter_Factory implements InterfaceC9468d<StartPresenter> {
    private final InterfaceC11700a<d> refreshProvider;

    public StartPresenter_Factory(InterfaceC11700a interfaceC11700a) {
        this.refreshProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static StartPresenter_Factory create(InterfaceC11700a interfaceC11700a) {
        StartPresenter_Factory $r1 = new StartPresenter_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static StartPresenter newInstance(AnnotationVisitor annotationVisitor) {
        StartPresenter $r1 = new StartPresenter(annotationVisitor);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public StartPresenter multiply() {
        InterfaceC11700a $r1 = this.refreshProvider;
        Object $r2 = $r1.get();
        AnnotationVisitor $r3 = (AnnotationVisitor) $r2;
        StartPresenter $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40941multiply() {
        StartPresenter $r1 = multiply();
        return $r1;
    }
}
