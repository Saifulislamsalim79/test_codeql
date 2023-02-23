package ai.kudi.agent.withdraw_cash.domain.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.withdraw_cash.domain.repositories.UssdWithdrawalRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UssdWithdrawalRepository_LocalSource_Factory implements InterfaceC9468d<UssdWithdrawalRepository.LocalSource> {
    private final InterfaceC11700a<CoreAppDatabase> dbProvider;

    public UssdWithdrawalRepository_LocalSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.dbProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalRepository_LocalSource_Factory create(InterfaceC11700a interfaceC11700a) {
        UssdWithdrawalRepository_LocalSource_Factory $r1 = new UssdWithdrawalRepository_LocalSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalRepository.LocalSource newInstance(CoreAppDatabase coreAppDatabase) {
        UssdWithdrawalRepository.LocalSource $r1 = new UssdWithdrawalRepository.LocalSource(coreAppDatabase);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UssdWithdrawalRepository.LocalSource multiply() {
        InterfaceC11700a $r1 = this.dbProvider;
        Object $r2 = $r1.get();
        CoreAppDatabase $r3 = (CoreAppDatabase) $r2;
        UssdWithdrawalRepository.LocalSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41794multiply() {
        UssdWithdrawalRepository.LocalSource $r1 = multiply();
        return $r1;
    }
}
