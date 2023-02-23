package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.api.KshockApi;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OtpStatusCheck_Factory implements InterfaceC9468d<OtpStatusCheck> {
    private final InterfaceC11700a<DeviceInformation> deviceInformationProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<KshockApi> kShockApiProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public OtpStatusCheck_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.deviceInformationProvider = interfaceC11700a2;
        this.kShockApiProvider = interfaceC11700a3;
        this.rxSchedulersProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OtpStatusCheck_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        OtpStatusCheck_Factory $r4 = new OtpStatusCheck_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OtpStatusCheck newInstance(FetchCurrentUser fetchCurrentUser, DeviceInformation deviceInformation, ai.kudi.agent.kshock.data.domain.attention.KshockApi kshockApi, RxSchedulers rxSchedulers) {
        OtpStatusCheck $r4 = new OtpStatusCheck(fetchCurrentUser, deviceInformation, kshockApi, rxSchedulers);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OtpStatusCheck multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.deviceInformationProvider;
        Object $r22 = $r12.get();
        DeviceInformation $r4 = (DeviceInformation) $r22;
        InterfaceC11700a $r13 = this.kShockApiProvider;
        Object $r23 = $r13.get();
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r5 = (ai.kudi.agent.kshock.data.domain.attention.KshockApi) $r23;
        InterfaceC11700a $r14 = this.rxSchedulersProvider;
        Object $r24 = $r14.get();
        RxSchedulers $r6 = (RxSchedulers) $r24;
        OtpStatusCheck $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39696multiply() {
        OtpStatusCheck $r1 = multiply();
        return $r1;
    }
}
