package ai.kudi.agent.withdraw_cash.domain.repositories;

import ai.kudi.agent.withdraw_cash.domain.repositories.UssdWithdrawalRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UssdWithdrawalRepository_Factory implements InterfaceC9468d<UssdWithdrawalRepository> {
    private final InterfaceC11700a<UssdWithdrawalRepository.LocalSource> localSourceProvider;
    private final InterfaceC11700a<UssdWithdrawalRepository.RemoteSource> remoteSourceProvider;

    public UssdWithdrawalRepository_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.localSourceProvider = interfaceC11700a;
        this.remoteSourceProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalRepository_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        UssdWithdrawalRepository_Factory $r2 = new UssdWithdrawalRepository_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalRepository newInstance(UssdWithdrawalRepository.LocalSource localSource, UssdWithdrawalRepository.RemoteSource remoteSource) {
        UssdWithdrawalRepository $r2 = new UssdWithdrawalRepository(localSource, remoteSource);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UssdWithdrawalRepository multiply() {
        InterfaceC11700a $r1 = this.localSourceProvider;
        Object $r2 = $r1.get();
        UssdWithdrawalRepository.LocalSource $r3 = (UssdWithdrawalRepository.LocalSource) $r2;
        InterfaceC11700a $r12 = this.remoteSourceProvider;
        Object $r22 = $r12.get();
        UssdWithdrawalRepository.RemoteSource $r4 = (UssdWithdrawalRepository.RemoteSource) $r22;
        UssdWithdrawalRepository $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41793multiply() {
        UssdWithdrawalRepository $r1 = multiply();
        return $r1;
    }
}
