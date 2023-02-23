package ai.kudi.agent.help.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.help.di.usecase.FetchPhoneNumbers;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class HelpPresenter_Factory implements InterfaceC9468d<HelpPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchPhoneNumbers> fetchPhoneNumbersProvider;

    public HelpPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchPhoneNumbersProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static HelpPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        HelpPresenter_Factory $r3 = new HelpPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static HelpPresenter newInstance(ai.kudi.agent.help.scalar.usecase.FetchPhoneNumbers fetchPhoneNumbers, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        HelpPresenter $r3 = new HelpPresenter(fetchPhoneNumbers, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public HelpPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchPhoneNumbersProvider;
        Object $r2 = $r1.get();
        ai.kudi.agent.help.scalar.usecase.FetchPhoneNumbers $r3 = (ai.kudi.agent.help.scalar.usecase.FetchPhoneNumbers) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        HelpPresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39265multiply() {
        HelpPresenter $r1 = multiply();
        return $r1;
    }
}
