package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.settings.domain.useCases.UpgradeUserKyc;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.UpdateUser;
import android.app.Application;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.UpgradeViewModel_Factory */
/* loaded from: classes.dex */
public final class UpgradeViewModel_Factory implements InterfaceC9468d<UpgradeViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<Application> appProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<UpdateUser> updateUserProvider;
    private final InterfaceC11700a<UpgradeUserKyc> upgradeUserKycProvider;

    public UpgradeViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.appProvider = interfaceC11700a;
        this.upgradeUserKycProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.updateUserProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpgradeViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        UpgradeViewModel_Factory $r5 = new UpgradeViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpgradeViewModel newInstance(Application application, UpgradeUserKyc upgradeUserKyc, FetchCurrentUser fetchCurrentUser, UpdateUser updateUser, Analytics analytics) {
        UpgradeViewModel $r5 = new UpgradeViewModel(application, upgradeUserKyc, fetchCurrentUser, updateUser, analytics);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UpgradeViewModel multiply() {
        InterfaceC11700a $r1 = this.appProvider;
        Object $r2 = $r1.get();
        Application $r3 = (Application) $r2;
        InterfaceC11700a $r12 = this.upgradeUserKycProvider;
        Object $r22 = $r12.get();
        UpgradeUserKyc $r4 = (UpgradeUserKyc) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.updateUserProvider;
        Object $r24 = $r14.get();
        UpdateUser $r6 = (UpdateUser) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics $r7 = (Analytics) $r25;
        UpgradeViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40868multiply() {
        UpgradeViewModel $r1 = multiply();
        return $r1;
    }
}
