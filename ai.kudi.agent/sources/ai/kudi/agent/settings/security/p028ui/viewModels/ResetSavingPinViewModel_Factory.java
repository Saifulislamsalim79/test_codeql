package ai.kudi.agent.settings.security.p028ui.viewModels;

import ai.kudi.agent.settings.domain.useCases.RequestPinResetOtp;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.security.ui.viewModels.ResetSavingPinViewModel_Factory */
/* loaded from: classes.dex */
public final class ResetSavingPinViewModel_Factory implements InterfaceC9468d<ResetSavingPinViewModel> {
    private final InterfaceC11700a<RequestPinResetOtp> requestOtpProvider;
    private final InterfaceC11700a<SettingsNavigator> settingsNavigatorProvider;

    public ResetSavingPinViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.requestOtpProvider = interfaceC11700a;
        this.settingsNavigatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResetSavingPinViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        ResetSavingPinViewModel_Factory $r2 = new ResetSavingPinViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResetSavingPinViewModel newInstance(RequestPinResetOtp requestPinResetOtp, SettingsNavigator settingsNavigator) {
        ResetSavingPinViewModel $r2 = new ResetSavingPinViewModel(requestPinResetOtp, settingsNavigator);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ResetSavingPinViewModel multiply() {
        InterfaceC11700a $r1 = this.requestOtpProvider;
        Object $r2 = $r1.get();
        RequestPinResetOtp $r3 = (RequestPinResetOtp) $r2;
        InterfaceC11700a $r12 = this.settingsNavigatorProvider;
        Object $r22 = $r12.get();
        SettingsNavigator $r4 = (SettingsNavigator) $r22;
        ResetSavingPinViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40894multiply() {
        ResetSavingPinViewModel $r1 = multiply();
        return $r1;
    }
}
