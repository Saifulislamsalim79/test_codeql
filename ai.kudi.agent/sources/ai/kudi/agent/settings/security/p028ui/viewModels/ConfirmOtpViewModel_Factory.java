package ai.kudi.agent.settings.security.p028ui.viewModels;

import ai.kudi.agent.settings.domain.useCases.ResendOtp;
import ai.kudi.agent.settings.domain.useCases.ResetSavingsPin;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.security.ui.viewModels.ConfirmOtpViewModel_Factory */
/* loaded from: classes.dex */
public final class ConfirmOtpViewModel_Factory implements InterfaceC9468d<ConfirmOtpViewModel> {
    private final InterfaceC11700a<ResendOtp> resendOtpProvider;
    private final InterfaceC11700a<ResetSavingsPin> resetSavingsPinProvider;
    private final InterfaceC11700a<SettingsNavigator> settingsNavigatorProvider;

    public ConfirmOtpViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.settingsNavigatorProvider = interfaceC11700a;
        this.resetSavingsPinProvider = interfaceC11700a2;
        this.resendOtpProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ConfirmOtpViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        ConfirmOtpViewModel_Factory $r3 = new ConfirmOtpViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ConfirmOtpViewModel newInstance(SettingsNavigator settingsNavigator, ResetSavingsPin resetSavingsPin, ResendOtp resendOtp) {
        ConfirmOtpViewModel $r3 = new ConfirmOtpViewModel(settingsNavigator, resetSavingsPin, resendOtp);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ConfirmOtpViewModel multiply() {
        InterfaceC11700a $r1 = this.settingsNavigatorProvider;
        Object $r2 = $r1.get();
        SettingsNavigator $r3 = (SettingsNavigator) $r2;
        InterfaceC11700a $r12 = this.resetSavingsPinProvider;
        Object $r22 = $r12.get();
        ResetSavingsPin $r4 = (ResetSavingsPin) $r22;
        InterfaceC11700a $r13 = this.resendOtpProvider;
        Object $r23 = $r13.get();
        ResendOtp $r5 = (ResendOtp) $r23;
        ConfirmOtpViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40884multiply() {
        ConfirmOtpViewModel $r1 = multiply();
        return $r1;
    }
}
