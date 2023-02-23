package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.ConfirmOtp;
import ai.kudi.agent.savings.usecase.CreateSavingPin;
import ai.kudi.agent.savings.usecase.CreateSavings;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CreateSavingPinViewModel_Factory implements InterfaceC9468d<CreateSavingPinViewModel> {
    private final InterfaceC11700a<ConfirmOtp> confirmOtpProvider;
    private final InterfaceC11700a<CreateSavingPin> createSavingPinProvider;
    private final InterfaceC11700a<CreateSavings> createSavingsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<SavingsNavigator> savingsNavigatorProvider;
    private final InterfaceC11700a<UserRepository> userRepositoryProvider;

    public CreateSavingPinViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.createSavingPinProvider = interfaceC11700a2;
        this.confirmOtpProvider = interfaceC11700a3;
        this.savingsNavigatorProvider = interfaceC11700a4;
        this.createSavingsProvider = interfaceC11700a5;
        this.userRepositoryProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateSavingPinViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        CreateSavingPinViewModel_Factory $r6 = new CreateSavingPinViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateSavingPinViewModel newInstance(FetchCurrentUser fetchCurrentUser, CreateSavingPin createSavingPin, ConfirmOtp confirmOtp, SavingsNavigator savingsNavigator, CreateSavings createSavings, UserRepository userRepository) {
        CreateSavingPinViewModel $r6 = new CreateSavingPinViewModel(fetchCurrentUser, createSavingPin, confirmOtp, savingsNavigator, createSavings, userRepository);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateSavingPinViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.createSavingPinProvider;
        Object $r22 = $r12.get();
        CreateSavingPin $r4 = (CreateSavingPin) $r22;
        InterfaceC11700a $r13 = this.confirmOtpProvider;
        Object $r23 = $r13.get();
        ConfirmOtp $r5 = (ConfirmOtp) $r23;
        InterfaceC11700a $r14 = this.savingsNavigatorProvider;
        Object $r24 = $r14.get();
        SavingsNavigator $r6 = (SavingsNavigator) $r24;
        InterfaceC11700a $r15 = this.createSavingsProvider;
        Object $r25 = $r15.get();
        CreateSavings createSavings = (CreateSavings) $r25;
        InterfaceC11700a $r16 = this.userRepositoryProvider;
        Object $r26 = $r16.get();
        CreateSavingPinViewModel $r9 = newInstance($r3, $r4, $r5, $r6, createSavings, (UserRepository) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40613multiply() {
        CreateSavingPinViewModel $r1 = multiply();
        return $r1;
    }
}
