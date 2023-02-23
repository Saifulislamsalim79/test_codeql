package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.settings.domain.repositories.AccountRepository;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import android.content.SharedPreferences;
import com.google.firebase.auth.FirebaseAuth;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class LoginUser_Factory implements InterfaceC9468d<LoginUser> {
    private final InterfaceC11700a<AccountRepository> accountRepositoryProvider;
    private final InterfaceC11700a<FirebaseAuth> firebaseAuthProvider;
    private final InterfaceC11700a<UserService> networkServiceProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public LoginUser_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.networkServiceProvider = interfaceC11700a;
        this.userRepoProvider = interfaceC11700a2;
        this.firebaseAuthProvider = interfaceC11700a3;
        this.accountRepositoryProvider = interfaceC11700a4;
        this.sharedPreferencesProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LoginUser_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        LoginUser_Factory $r5 = new LoginUser_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LoginUser newInstance(UserService userService, UserRepository userRepository, FirebaseAuth firebaseAuth, AccountRepository accountRepository, SharedPreferences sharedPreferences) {
        LoginUser $r5 = new LoginUser(userService, userRepository, firebaseAuth, accountRepository, sharedPreferences);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LoginUser multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        UserService $r3 = (UserService) $r2;
        InterfaceC11700a $r12 = this.userRepoProvider;
        Object $r22 = $r12.get();
        UserRepository $r4 = (UserRepository) $r22;
        InterfaceC11700a $r13 = this.firebaseAuthProvider;
        Object $r23 = $r13.get();
        FirebaseAuth $r5 = (FirebaseAuth) $r23;
        InterfaceC11700a $r14 = this.accountRepositoryProvider;
        Object $r24 = $r14.get();
        AccountRepository $r6 = (AccountRepository) $r24;
        InterfaceC11700a $r15 = this.sharedPreferencesProvider;
        Object $r25 = $r15.get();
        SharedPreferences $r7 = (SharedPreferences) $r25;
        LoginUser $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41450multiply() {
        LoginUser $r1 = multiply();
        return $r1;
    }
}
