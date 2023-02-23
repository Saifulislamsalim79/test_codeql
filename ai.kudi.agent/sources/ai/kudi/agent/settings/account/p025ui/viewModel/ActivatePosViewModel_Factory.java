package ai.kudi.agent.settings.account.p025ui.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.settings.domain.useCases.ActivatePos;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.account.ui.viewModel.ActivatePosViewModel_Factory */
/* loaded from: classes.dex */
public final class ActivatePosViewModel_Factory implements InterfaceC9468d<ActivatePosViewModel> {
    private final InterfaceC11700a<ActivatePos> activatePosProvider;
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public ActivatePosViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.activatePosProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivatePosViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        ActivatePosViewModel_Factory $r3 = new ActivatePosViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivatePosViewModel newInstance(ActivatePos activatePos, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        ActivatePosViewModel $r3 = new ActivatePosViewModel(activatePos, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ActivatePosViewModel multiply() {
        InterfaceC11700a $r1 = this.activatePosProvider;
        Object $r2 = $r1.get();
        ActivatePos $r3 = (ActivatePos) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        ActivatePosViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40702multiply() {
        ActivatePosViewModel $r1 = multiply();
        return $r1;
    }
}
