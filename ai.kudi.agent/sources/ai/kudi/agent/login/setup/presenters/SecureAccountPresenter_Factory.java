package ai.kudi.agent.login.setup.presenters;

import ai.kudi.agent.login.setup.domain.AddDevice;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SecureAccountPresenter_Factory implements InterfaceC9468d<SecureAccountPresenter> {
    private final InterfaceC11700a<AddDevice> addDeviceProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;

    public SecureAccountPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.addDeviceProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SecureAccountPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        SecureAccountPresenter_Factory $r2 = new SecureAccountPresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SecureAccountPresenter newInstance(AddDevice addDevice, FetchCurrentUser fetchCurrentUser) {
        SecureAccountPresenter $r2 = new SecureAccountPresenter(addDevice, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SecureAccountPresenter multiply() {
        InterfaceC11700a $r1 = this.addDeviceProvider;
        Object $r2 = $r1.get();
        AddDevice $r3 = (AddDevice) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        SecureAccountPresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39763multiply() {
        SecureAccountPresenter $r1 = multiply();
        return $r1;
    }
}
