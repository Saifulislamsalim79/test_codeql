package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.biometric.security.IPFSecurityUtils;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.login.domain.usecases.SetNewPin;
import ai.kudi.agent.register.PinRepositoryImpl;
import ai.kudi.agent.register.domain.usecases.OnboardMerchant;
import ai.kudi.agent.register.domain.usecases.RegisterNewAgent;
import ai.kudi.agent.register.domain.usecases.RegisterNewUser;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.users.domain.usecases.LoginUser;
import android.app.Application;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.ui.viewmodels.CreatePinViewModel_Factory */
/* loaded from: classes.dex */
public final class CreatePinViewModel_Factory implements InterfaceC9468d<CreatePinViewModel> {
    private final InterfaceC11700a<RegisterNewAgent> agentRegisterProvider;
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<Application> contextProvider;
    private final InterfaceC11700a<SharedPreferences> devicePrefsProvider;
    private final InterfaceC11700a<IPFSecurityUtils> facProvider;
    private final InterfaceC11700a<LoginUser> loginUserProvider;
    private final InterfaceC11700a<OnboardMerchant> merchantRegisterProvider;
    private final InterfaceC11700a<PinRepositoryImpl> pinRepositoryImplProvider;
    private final InterfaceC11700a<RegisterNavigator> registerNavigatorProvider;
    private final InterfaceC11700a<SetNewPin> setNewPinProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPrefsProvider;
    private final InterfaceC11700a<RegisterNewUser> userRegisterProvider;

    public CreatePinViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9, InterfaceC11700a interfaceC11700a10, InterfaceC11700a interfaceC11700a11, InterfaceC11700a interfaceC11700a12) {
        this.setNewPinProvider = interfaceC11700a;
        this.agentRegisterProvider = interfaceC11700a2;
        this.userRegisterProvider = interfaceC11700a3;
        this.merchantRegisterProvider = interfaceC11700a4;
        this.loginUserProvider = interfaceC11700a5;
        this.registerNavigatorProvider = interfaceC11700a6;
        this.analyticsProvider = interfaceC11700a7;
        this.sharedPrefsProvider = interfaceC11700a8;
        this.devicePrefsProvider = interfaceC11700a9;
        this.pinRepositoryImplProvider = interfaceC11700a10;
        this.contextProvider = interfaceC11700a11;
        this.facProvider = interfaceC11700a12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreatePinViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9, InterfaceC11700a interfaceC11700a10, InterfaceC11700a interfaceC11700a11, InterfaceC11700a interfaceC11700a12) {
        CreatePinViewModel_Factory $r12 = new CreatePinViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8, interfaceC11700a9, interfaceC11700a10, interfaceC11700a11, interfaceC11700a12);
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreatePinViewModel newInstance(SetNewPin setNewPin, RegisterNewAgent registerNewAgent, RegisterNewUser registerNewUser, OnboardMerchant onboardMerchant, LoginUser loginUser, RegisterNavigator registerNavigator, Analytics analytics, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, PinRepositoryImpl pinRepositoryImpl, Application application, IPFSecurityUtils iPFSecurityUtils) {
        CreatePinViewModel $r12 = new CreatePinViewModel(setNewPin, registerNewAgent, registerNewUser, onboardMerchant, loginUser, registerNavigator, analytics, sharedPreferences, sharedPreferences2, pinRepositoryImpl, application, iPFSecurityUtils);
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreatePinViewModel multiply() {
        InterfaceC11700a $r1 = this.setNewPinProvider;
        Object $r2 = $r1.get();
        SetNewPin $r3 = (SetNewPin) $r2;
        InterfaceC11700a $r12 = this.agentRegisterProvider;
        Object $r22 = $r12.get();
        RegisterNewAgent registerNewAgent = (RegisterNewAgent) $r22;
        InterfaceC11700a $r13 = this.userRegisterProvider;
        Object $r23 = $r13.get();
        RegisterNewUser registerNewUser = (RegisterNewUser) $r23;
        InterfaceC11700a $r14 = this.merchantRegisterProvider;
        Object $r24 = $r14.get();
        OnboardMerchant onboardMerchant = (OnboardMerchant) $r24;
        InterfaceC11700a $r15 = this.loginUserProvider;
        Object $r25 = $r15.get();
        LoginUser loginUser = (LoginUser) $r25;
        InterfaceC11700a $r16 = this.registerNavigatorProvider;
        Object $r26 = $r16.get();
        RegisterNavigator registerNavigator = (RegisterNavigator) $r26;
        InterfaceC11700a $r17 = this.analyticsProvider;
        Object $r27 = $r17.get();
        Analytics $r9 = (Analytics) $r27;
        InterfaceC11700a $r18 = this.sharedPrefsProvider;
        Object $r28 = $r18.get();
        SharedPreferences $r10 = (SharedPreferences) $r28;
        InterfaceC11700a $r19 = this.devicePrefsProvider;
        Object $r29 = $r19.get();
        SharedPreferences $r11 = (SharedPreferences) $r29;
        InterfaceC11700a $r110 = this.pinRepositoryImplProvider;
        Object $r210 = $r110.get();
        PinRepositoryImpl $r122 = (PinRepositoryImpl) $r210;
        InterfaceC11700a $r111 = this.contextProvider;
        Object $r211 = $r111.get();
        Application $r132 = (Application) $r211;
        InterfaceC11700a $r112 = this.facProvider;
        Object $r212 = $r112.get();
        IPFSecurityUtils $r142 = (IPFSecurityUtils) $r212;
        CreatePinViewModel $r152 = newInstance($r3, registerNewAgent, registerNewUser, onboardMerchant, loginUser, registerNavigator, $r9, $r10, $r11, $r122, $r132, $r142);
        return $r152;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40417multiply() {
        CreatePinViewModel $r1 = multiply();
        return $r1;
    }
}
