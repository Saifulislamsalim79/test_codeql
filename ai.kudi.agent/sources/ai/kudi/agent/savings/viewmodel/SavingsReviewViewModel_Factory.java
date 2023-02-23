package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.CreateSavings;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SavingsReviewViewModel_Factory implements InterfaceC9468d<SavingsReviewViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<CreateSavings> createSavingsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<SavingsNavigator> navigatorProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public SavingsReviewViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.createSavingsProvider = interfaceC11700a;
        this.navigatorProvider = interfaceC11700a2;
        this.currentUserProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
        this.sharedPreferencesProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingsReviewViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        SavingsReviewViewModel_Factory $r5 = new SavingsReviewViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingsReviewViewModel newInstance(CreateSavings createSavings, SavingsNavigator savingsNavigator, FetchCurrentUser fetchCurrentUser, Analytics analytics, SharedPreferences sharedPreferences) {
        SavingsReviewViewModel $r5 = new SavingsReviewViewModel(createSavings, savingsNavigator, fetchCurrentUser, analytics, sharedPreferences);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SavingsReviewViewModel multiply() {
        InterfaceC11700a $r1 = this.createSavingsProvider;
        Object $r2 = $r1.get();
        CreateSavings $r3 = (CreateSavings) $r2;
        InterfaceC11700a $r12 = this.navigatorProvider;
        Object $r22 = $r12.get();
        SavingsNavigator $r4 = (SavingsNavigator) $r22;
        InterfaceC11700a $r13 = this.currentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        InterfaceC11700a $r15 = this.sharedPreferencesProvider;
        Object $r25 = $r15.get();
        SharedPreferences $r7 = (SharedPreferences) $r25;
        SavingsReviewViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40639multiply() {
        SavingsReviewViewModel $r1 = multiply();
        return $r1;
    }
}
