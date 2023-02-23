package ai.kudi.agent.core.internal.modules;

import f.a.a.a.d;
import f.a.a.a.g.b;
import p198f.p199a.objectweb.asm.AnnotationVisitor;
import p198f.p199a.objectweb.asm.signature.InterfaceC7447b;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RefreshModule_ProvidesRefreshFactory implements InterfaceC9468d<d> {
    private final InterfaceC11700a<b> checkerProvider;
    private final RefreshModule module;

    public RefreshModule_ProvidesRefreshFactory(RefreshModule refreshModule, InterfaceC11700a interfaceC11700a) {
        this.module = refreshModule;
        this.checkerProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RefreshModule_ProvidesRefreshFactory create(RefreshModule refreshModule, InterfaceC11700a interfaceC11700a) {
        RefreshModule_ProvidesRefreshFactory $r2 = new RefreshModule_ProvidesRefreshFactory(refreshModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AnnotationVisitor providesRefresh(RefreshModule refreshModule, InterfaceC7447b interfaceC7447b) {
        AnnotationVisitor $r1 = refreshModule.providesRefresh(interfaceC7447b);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AnnotationVisitor visitArray() {
        RefreshModule $r1 = this.module;
        InterfaceC11700a $r2 = this.checkerProvider;
        Object $r3 = $r2.get();
        InterfaceC7447b $r4 = (InterfaceC7447b) $r3;
        AnnotationVisitor $r5 = providesRefresh($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: visitArray  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39149visitArray() {
        AnnotationVisitor $r1 = visitArray();
        return $r1;
    }
}
