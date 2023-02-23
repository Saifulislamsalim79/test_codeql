package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class Profile_Factory implements InterfaceC9468d<Profile> {
    private final InterfaceC11700a<UserRepository> userRepositoryProvider;

    public Profile_Factory(InterfaceC11700a interfaceC11700a) {
        this.userRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Profile_Factory create(InterfaceC11700a interfaceC11700a) {
        Profile_Factory $r1 = new Profile_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Profile newInstance(UserRepository userRepository) {
        Profile $r1 = new Profile(userRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Profile createCopy() {
        InterfaceC11700a $r1 = this.userRepositoryProvider;
        Object $r2 = $r1.get();
        UserRepository $r3 = (UserRepository) $r2;
        Profile $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createCopy  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40758createCopy() {
        Profile $r1 = createCopy();
        return $r1;
    }
}
