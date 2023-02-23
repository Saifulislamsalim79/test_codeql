package ai.kudi.agent.login.p011ui.p012v2.viewModels;

import ai.kudi.agent.login.domain.usecases.RequestOtp;
import ai.kudi.agent.login.navigators.ForgotPasswordNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.ui.v2.viewModels.EnterPhoneNoViewModel_Factory */
/* loaded from: classes.dex */
public final class EnterPhoneNoViewModel_Factory implements InterfaceC9468d<EnterPhoneNoViewModel> {
    private final InterfaceC11700a<ForgotPasswordNavigator> forgotPasswordNavigatorProvider;
    private final InterfaceC11700a<RequestOtp> requestOtpProvider;

    public EnterPhoneNoViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.requestOtpProvider = interfaceC11700a;
        this.forgotPasswordNavigatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EnterPhoneNoViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        EnterPhoneNoViewModel_Factory $r2 = new EnterPhoneNoViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EnterPhoneNoViewModel newInstance(RequestOtp requestOtp, ForgotPasswordNavigator forgotPasswordNavigator) {
        EnterPhoneNoViewModel $r2 = new EnterPhoneNoViewModel(requestOtp, forgotPasswordNavigator);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public EnterPhoneNoViewModel multiply() {
        InterfaceC11700a $r1 = this.requestOtpProvider;
        Object $r2 = $r1.get();
        RequestOtp $r3 = (RequestOtp) $r2;
        InterfaceC11700a $r12 = this.forgotPasswordNavigatorProvider;
        Object $r22 = $r12.get();
        ForgotPasswordNavigator $r4 = (ForgotPasswordNavigator) $r22;
        EnterPhoneNoViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39806multiply() {
        EnterPhoneNoViewModel $r1 = multiply();
        return $r1;
    }
}
