package ai.kudi.agent.login.p011ui.p012v2.viewModels;

import ai.kudi.agent.login.domain.usecases.SetNewPin;
import ai.kudi.agent.login.navigators.ForgotPasswordNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.ui.v2.viewModels.ResetPinViewModel_Factory */
/* loaded from: classes.dex */
public final class ResetPinViewModel_Factory implements InterfaceC9468d<ResetPinViewModel> {
    private final InterfaceC11700a<ForgotPasswordNavigator> forgotPasswordNavigatorProvider;
    private final InterfaceC11700a<SetNewPin> setNewPinProvider;

    public ResetPinViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.setNewPinProvider = interfaceC11700a;
        this.forgotPasswordNavigatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResetPinViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        ResetPinViewModel_Factory $r2 = new ResetPinViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResetPinViewModel newInstance(SetNewPin setNewPin, ForgotPasswordNavigator forgotPasswordNavigator) {
        ResetPinViewModel $r2 = new ResetPinViewModel(setNewPin, forgotPasswordNavigator);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ResetPinViewModel multiply() {
        InterfaceC11700a $r1 = this.setNewPinProvider;
        Object $r2 = $r1.get();
        SetNewPin $r3 = (SetNewPin) $r2;
        InterfaceC11700a $r12 = this.forgotPasswordNavigatorProvider;
        Object $r22 = $r12.get();
        ForgotPasswordNavigator $r4 = (ForgotPasswordNavigator) $r22;
        ResetPinViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39810multiply() {
        ResetPinViewModel $r1 = multiply();
        return $r1;
    }
}
