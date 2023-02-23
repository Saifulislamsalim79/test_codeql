package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.biometric.security.IPFSecurityUtils;
import com.google.firebase.crashlytics.C5325g;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvidePFSecurityUtilsFactoryFactory implements InterfaceC9468d<IPFSecurityUtils> {
    private final InterfaceC11700a<C5325g> firebaseCrashlyticsProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidePFSecurityUtilsFactoryFactory(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        this.module = applicationModule;
        this.firebaseCrashlyticsProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvidePFSecurityUtilsFactoryFactory create(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        ApplicationModule_ProvidePFSecurityUtilsFactoryFactory $r2 = new ApplicationModule_ProvidePFSecurityUtilsFactoryFactory(applicationModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IPFSecurityUtils providePFSecurityUtilsFactory(ApplicationModule applicationModule, C5325g c5325g) {
        IPFSecurityUtils $r1 = applicationModule.providePFSecurityUtilsFactory(c5325g);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IPFSecurityUtils getItemForId() {
        ApplicationModule $r1 = this.module;
        InterfaceC11700a $r2 = this.firebaseCrashlyticsProvider;
        Object $r3 = $r2.get();
        C5325g $r4 = (C5325g) $r3;
        IPFSecurityUtils $r5 = providePFSecurityUtilsFactory($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getItemForId  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39141getItemForId() {
        IPFSecurityUtils $r1 = getItemForId();
        return $r1;
    }
}
