package ai.kudi.agent.login.p011ui.p012v2.viewModels;

import ai.kudi.agent.login.navigators.ForgotPasswordNavigator;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.ui.v2.viewModels.ForgotPasswordViewModel_Factory */
/* loaded from: classes.dex */
public final class ForgotPasswordViewModel_Factory implements InterfaceC9468d<ForgotPasswordViewModel> {
    private final InterfaceC11700a<BaseOtpUtil> baseOtpUtilProvider;
    private final InterfaceC11700a<ForgotPasswordNavigator> forgotPasswordNavigatorProvider;

    public ForgotPasswordViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.baseOtpUtilProvider = interfaceC11700a;
        this.forgotPasswordNavigatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ForgotPasswordViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        ForgotPasswordViewModel_Factory $r2 = new ForgotPasswordViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ForgotPasswordViewModel newInstance(BaseOtpUtil baseOtpUtil, ForgotPasswordNavigator forgotPasswordNavigator) {
        ForgotPasswordViewModel $r2 = new ForgotPasswordViewModel(baseOtpUtil, forgotPasswordNavigator);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ForgotPasswordViewModel multiply() {
        InterfaceC11700a $r1 = this.baseOtpUtilProvider;
        Object $r2 = $r1.get();
        BaseOtpUtil $r3 = (BaseOtpUtil) $r2;
        InterfaceC11700a $r12 = this.forgotPasswordNavigatorProvider;
        Object $r22 = $r12.get();
        ForgotPasswordNavigator $r4 = (ForgotPasswordNavigator) $r22;
        ForgotPasswordViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39807multiply() {
        ForgotPasswordViewModel $r1 = multiply();
        return $r1;
    }
}
