package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.core.usecases.MultiPartFileHandling;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* loaded from: classes.dex */
public final class MultiPartFileHandlingModule_ProvidesMultiPartFileHandlingFactory implements InterfaceC9468d<MultiPartFileHandling> {
    private final MultiPartFileHandlingModule module;

    public MultiPartFileHandlingModule_ProvidesMultiPartFileHandlingFactory(MultiPartFileHandlingModule multiPartFileHandlingModule) {
        this.module = multiPartFileHandlingModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MultiPartFileHandlingModule_ProvidesMultiPartFileHandlingFactory create(MultiPartFileHandlingModule multiPartFileHandlingModule) {
        MultiPartFileHandlingModule_ProvidesMultiPartFileHandlingFactory $r1 = new MultiPartFileHandlingModule_ProvidesMultiPartFileHandlingFactory(multiPartFileHandlingModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MultiPartFileHandling providesMultiPartFileHandling(MultiPartFileHandlingModule multiPartFileHandlingModule) {
        MultiPartFileHandling $r0 = multiPartFileHandlingModule.providesMultiPartFileHandling();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MultiPartFileHandling cbrt() {
        MultiPartFileHandlingModule $r2 = this.module;
        MultiPartFileHandling $r1 = providesMultiPartFileHandling($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39147cbrt() {
        MultiPartFileHandling $r1 = cbrt();
        return $r1;
    }
}
