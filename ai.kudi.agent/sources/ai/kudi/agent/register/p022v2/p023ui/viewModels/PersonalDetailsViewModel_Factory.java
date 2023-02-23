package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.PersonalDetailsViewModel_Factory */
/* loaded from: classes.dex */
public final class PersonalDetailsViewModel_Factory implements InterfaceC9468d<PersonalDetailsViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<RegisterNavigator> navigatorProvider;
    private final InterfaceC11700a<UserRepository> userRepositoryProvider;

    public PersonalDetailsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.userRepositoryProvider = interfaceC11700a;
        this.navigatorProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PersonalDetailsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        PersonalDetailsViewModel_Factory $r3 = new PersonalDetailsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PersonalDetailsViewModel newInstance(UserRepository userRepository, RegisterNavigator registerNavigator, Analytics analytics) {
        PersonalDetailsViewModel $r3 = new PersonalDetailsViewModel(userRepository, registerNavigator, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PersonalDetailsViewModel multiply() {
        InterfaceC11700a $r1 = this.userRepositoryProvider;
        Object $r2 = $r1.get();
        UserRepository $r3 = (UserRepository) $r2;
        InterfaceC11700a $r12 = this.navigatorProvider;
        Object $r22 = $r12.get();
        RegisterNavigator $r4 = (RegisterNavigator) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        PersonalDetailsViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40484multiply() {
        PersonalDetailsViewModel $r1 = multiply();
        return $r1;
    }
}
