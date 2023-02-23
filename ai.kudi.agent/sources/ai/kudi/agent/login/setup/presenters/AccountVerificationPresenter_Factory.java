package ai.kudi.agent.login.setup.presenters;

import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import ai.kudi.agent.users.domain.usecases.LoginUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AccountVerificationPresenter_Factory implements InterfaceC9468d<AccountVerificationPresenter> {
    private final InterfaceC11700a<BaseOtpUtil> baseOtpUtilProvider;
    private final InterfaceC11700a<LoginUser> loginUserProvider;

    public AccountVerificationPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.baseOtpUtilProvider = interfaceC11700a;
        this.loginUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AccountVerificationPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        AccountVerificationPresenter_Factory $r2 = new AccountVerificationPresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AccountVerificationPresenter newInstance(BaseOtpUtil baseOtpUtil, LoginUser loginUser) {
        AccountVerificationPresenter $r2 = new AccountVerificationPresenter(baseOtpUtil, loginUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountVerificationPresenter multiply() {
        InterfaceC11700a $r1 = this.baseOtpUtilProvider;
        Object $r2 = $r1.get();
        BaseOtpUtil $r3 = (BaseOtpUtil) $r2;
        InterfaceC11700a $r12 = this.loginUserProvider;
        Object $r22 = $r12.get();
        LoginUser $r4 = (LoginUser) $r22;
        AccountVerificationPresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39753multiply() {
        AccountVerificationPresenter $r1 = multiply();
        return $r1;
    }
}
