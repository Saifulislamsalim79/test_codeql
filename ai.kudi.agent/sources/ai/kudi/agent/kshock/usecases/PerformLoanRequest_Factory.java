package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.api.KshockApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PerformLoanRequest_Factory implements InterfaceC9468d<PerformLoanRequest> {
    private final InterfaceC11700a<DeviceInformation> deviceInformationProvider;
    private final InterfaceC11700a<KshockApi> kshockApiProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public PerformLoanRequest_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.kshockApiProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
        this.deviceInformationProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PerformLoanRequest_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        PerformLoanRequest_Factory $r3 = new PerformLoanRequest_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PerformLoanRequest newInstance(ai.kudi.agent.kshock.data.domain.attention.KshockApi kshockApi, RxSchedulers rxSchedulers, DeviceInformation deviceInformation) {
        PerformLoanRequest $r3 = new PerformLoanRequest(kshockApi, rxSchedulers, deviceInformation);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PerformLoanRequest multiply() {
        InterfaceC11700a $r1 = this.kshockApiProvider;
        Object $r2 = $r1.get();
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = (ai.kudi.agent.kshock.data.domain.attention.KshockApi) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        InterfaceC11700a $r13 = this.deviceInformationProvider;
        Object $r23 = $r13.get();
        DeviceInformation $r5 = (DeviceInformation) $r23;
        PerformLoanRequest $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39702multiply() {
        PerformLoanRequest $r1 = multiply();
        return $r1;
    }
}
