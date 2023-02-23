package ai.kudi.agent.settings.security.p028ui.viewModels;

import ai.kudi.agent.settings.domain.useCases.DeleteDevice;
import ai.kudi.agent.settings.domain.useCases.GetDevices;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.security.ui.viewModels.MyDevicesViewModel_Factory */
/* loaded from: classes.dex */
public final class MyDevicesViewModel_Factory implements InterfaceC9468d<MyDevicesViewModel> {
    private final InterfaceC11700a<DeleteDevice> deleteDeviceProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<GetDevices> getDevicesProvider;

    public MyDevicesViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.getDevicesProvider = interfaceC11700a;
        this.deleteDeviceProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MyDevicesViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        MyDevicesViewModel_Factory $r3 = new MyDevicesViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MyDevicesViewModel newInstance(GetDevices getDevices, DeleteDevice deleteDevice, FetchCurrentUser fetchCurrentUser) {
        MyDevicesViewModel $r3 = new MyDevicesViewModel(getDevices, deleteDevice, fetchCurrentUser);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MyDevicesViewModel multiply() {
        InterfaceC11700a $r1 = this.getDevicesProvider;
        Object $r2 = $r1.get();
        GetDevices $r3 = (GetDevices) $r2;
        InterfaceC11700a $r12 = this.deleteDeviceProvider;
        Object $r22 = $r12.get();
        DeleteDevice $r4 = (DeleteDevice) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        MyDevicesViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40891multiply() {
        MyDevicesViewModel $r1 = multiply();
        return $r1;
    }
}
