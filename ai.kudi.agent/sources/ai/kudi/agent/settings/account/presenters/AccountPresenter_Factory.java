package ai.kudi.agent.settings.account.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.pos.usecases.GetIsSuperAgentOrAggregator;
import ai.kudi.agent.settings.domain.useCases.InsuranceRequests;
import ai.kudi.agent.settings.domain.useCases.Profile;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AccountPresenter_Factory implements InterfaceC9468d<AccountPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<GetIsSuperAgentOrAggregator> getIsSuperAgentOrAggregatorProvider;
    private final InterfaceC11700a<InsuranceRequests> insuranceRequestsProvider;
    private final InterfaceC11700a<Profile> profileProvider;
    private final InterfaceC11700a<SettingsNavigator> settingsNavigatorProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public AccountPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        this.currentUserProvider = interfaceC11700a;
        this.profileProvider = interfaceC11700a2;
        this.insuranceRequestsProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
        this.settingsNavigatorProvider = interfaceC11700a5;
        this.getIsSuperAgentOrAggregatorProvider = interfaceC11700a6;
        this.sharedPreferencesProvider = interfaceC11700a7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AccountPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        AccountPresenter_Factory $r7 = new AccountPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AccountPresenter newInstance(FetchCurrentUser fetchCurrentUser, Profile profile, InsuranceRequests insuranceRequests, Analytics analytics, SettingsNavigator settingsNavigator, GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator, SharedPreferences sharedPreferences) {
        AccountPresenter $r7 = new AccountPresenter(fetchCurrentUser, profile, insuranceRequests, analytics, settingsNavigator, getIsSuperAgentOrAggregator, sharedPreferences);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountPresenter multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.profileProvider;
        Object $r22 = $r12.get();
        Profile $r4 = (Profile) $r22;
        InterfaceC11700a $r13 = this.insuranceRequestsProvider;
        Object $r23 = $r13.get();
        InsuranceRequests $r5 = (InsuranceRequests) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics analytics = (Analytics) $r24;
        InterfaceC11700a $r15 = this.settingsNavigatorProvider;
        Object $r25 = $r15.get();
        SettingsNavigator settingsNavigator = (SettingsNavigator) $r25;
        InterfaceC11700a $r16 = this.getIsSuperAgentOrAggregatorProvider;
        Object $r26 = $r16.get();
        GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator = (GetIsSuperAgentOrAggregator) $r26;
        InterfaceC11700a $r17 = this.sharedPreferencesProvider;
        Object $r27 = $r17.get();
        SharedPreferences $r9 = (SharedPreferences) $r27;
        AccountPresenter $r10 = newInstance($r3, $r4, $r5, analytics, settingsNavigator, getIsSuperAgentOrAggregator, $r9);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40671multiply() {
        AccountPresenter $r1 = multiply();
        return $r1;
    }
}
