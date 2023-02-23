package ai.kudi.agent.core.internal.modules;

import f.a.a.a.g.b;
import p198f.p199a.objectweb.asm.signature.InterfaceC7447b;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* loaded from: classes.dex */
public final class RefreshModule_ProvidesCheckerFactory implements InterfaceC9468d<b> {
    private final RefreshModule module;

    public RefreshModule_ProvidesCheckerFactory(RefreshModule refreshModule) {
        this.module = refreshModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RefreshModule_ProvidesCheckerFactory create(RefreshModule refreshModule) {
        RefreshModule_ProvidesCheckerFactory $r1 = new RefreshModule_ProvidesCheckerFactory(refreshModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC7447b providesChecker(RefreshModule refreshModule) {
        InterfaceC7447b $r0 = refreshModule.providesChecker();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InterfaceC7447b cbrt() {
        RefreshModule $r2 = this.module;
        InterfaceC7447b $r1 = providesChecker($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39148cbrt() {
        InterfaceC7447b $r1 = cbrt();
        return $r1;
    }
}
