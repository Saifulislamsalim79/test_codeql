package ai.kudi.agent.login.setup.viewModels;

import ai.kudi.agent.login.setup.domain.VerifyFaceWithDob;
import ai.kudi.agent.users.domain.usecases.LoginUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UnknownDeviceDobViewModel_Factory implements InterfaceC9468d<UnknownDeviceDobViewModel> {
    private final InterfaceC11700a<LoginUser> loginUserProvider;
    private final InterfaceC11700a<VerifyFaceWithDob> verifyFaceWithDobProvider;

    public UnknownDeviceDobViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.verifyFaceWithDobProvider = interfaceC11700a;
        this.loginUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UnknownDeviceDobViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        UnknownDeviceDobViewModel_Factory $r2 = new UnknownDeviceDobViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UnknownDeviceDobViewModel newInstance(VerifyFaceWithDob verifyFaceWithDob, LoginUser loginUser) {
        UnknownDeviceDobViewModel $r2 = new UnknownDeviceDobViewModel(verifyFaceWithDob, loginUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UnknownDeviceDobViewModel multiply() {
        InterfaceC11700a $r1 = this.verifyFaceWithDobProvider;
        Object $r2 = $r1.get();
        VerifyFaceWithDob $r3 = (VerifyFaceWithDob) $r2;
        InterfaceC11700a $r12 = this.loginUserProvider;
        Object $r22 = $r12.get();
        LoginUser $r4 = (LoginUser) $r22;
        UnknownDeviceDobViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39786multiply() {
        UnknownDeviceDobViewModel $r1 = multiply();
        return $r1;
    }
}
