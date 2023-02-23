package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.register.navigators.RegisterNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.WelcomeViewModel_Factory */
/* loaded from: classes.dex */
public final class WelcomeViewModel_Factory implements InterfaceC9468d<WelcomeViewModel> {
    private final InterfaceC11700a<RegisterNavigator> registerNavigatorProvider;

    public WelcomeViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.registerNavigatorProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static WelcomeViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        WelcomeViewModel_Factory $r1 = new WelcomeViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static WelcomeViewModel newInstance(RegisterNavigator registerNavigator) {
        WelcomeViewModel $r1 = new WelcomeViewModel(registerNavigator);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public WelcomeViewModel multiply() {
        InterfaceC11700a $r1 = this.registerNavigatorProvider;
        Object $r2 = $r1.get();
        RegisterNavigator $r3 = (RegisterNavigator) $r2;
        WelcomeViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40495multiply() {
        WelcomeViewModel $r1 = multiply();
        return $r1;
    }
}
