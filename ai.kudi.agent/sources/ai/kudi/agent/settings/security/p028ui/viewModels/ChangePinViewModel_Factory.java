package ai.kudi.agent.settings.security.p028ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.register.PinRepositoryImpl;
import ai.kudi.agent.settings.domain.useCases.ChangePin;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.security.ui.viewModels.ChangePinViewModel_Factory */
/* loaded from: classes.dex */
public final class ChangePinViewModel_Factory implements InterfaceC9468d<ChangePinViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<ChangePin> changePinProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<PinRepositoryImpl> pinRepositoryImplProvider;
    private final InterfaceC11700a<SettingsNavigator> settingsNavigatorProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public ChangePinViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.changePinProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.settingsNavigatorProvider = interfaceC11700a3;
        this.sharedPreferencesProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
        this.pinRepositoryImplProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ChangePinViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        ChangePinViewModel_Factory $r6 = new ChangePinViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ChangePinViewModel newInstance(ChangePin changePin, FetchCurrentUser fetchCurrentUser, SettingsNavigator settingsNavigator, SharedPreferences sharedPreferences, Analytics analytics, PinRepositoryImpl pinRepositoryImpl) {
        ChangePinViewModel $r6 = new ChangePinViewModel(changePin, fetchCurrentUser, settingsNavigator, sharedPreferences, analytics, pinRepositoryImpl);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ChangePinViewModel multiply() {
        InterfaceC11700a $r1 = this.changePinProvider;
        Object $r2 = $r1.get();
        ChangePin $r3 = (ChangePin) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.settingsNavigatorProvider;
        Object $r23 = $r13.get();
        SettingsNavigator $r5 = (SettingsNavigator) $r23;
        InterfaceC11700a $r14 = this.sharedPreferencesProvider;
        Object $r24 = $r14.get();
        SharedPreferences $r6 = (SharedPreferences) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics analytics = (Analytics) $r25;
        InterfaceC11700a $r16 = this.pinRepositoryImplProvider;
        Object $r26 = $r16.get();
        ChangePinViewModel $r9 = newInstance($r3, $r4, $r5, $r6, analytics, (PinRepositoryImpl) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40879multiply() {
        ChangePinViewModel $r1 = multiply();
        return $r1;
    }
}
