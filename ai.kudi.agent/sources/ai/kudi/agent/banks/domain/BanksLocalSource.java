package ai.kudi.agent.banks.domain;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.BanksDao;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
/* compiled from: BanksLocalSource.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/banks/domain/BanksLocalSource;", "", "appRoomDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "(Lai/kudi/agent/core/domain/db/CoreAppDatabase;)V", "addBanks", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/room_entities/Bank;", "banks", "findByBankCode", "Lio/reactivex/Single;", "bankCode", "", "getBanks", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BanksLocalSource {
    private final CoreAppDatabase appRoomDatabase;

    public BanksLocalSource(CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(coreAppDatabase, "appRoomDatabase");
        this.appRoomDatabase = coreAppDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: addBanks$lambda-0  reason: not valid java name */
    public static final C13666w m39001addBanks$lambda0(BanksLocalSource banksLocalSource) {
        Log_OC.getArray(banksLocalSource, "this$0");
        CoreAppDatabase $r2 = banksLocalSource.appRoomDatabase;
        BanksDao $r0 = $r2.getBanksDao();
        $r0.deleteBanks();
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: addBanks$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m39002addBanks$lambda1(BanksLocalSource banksLocalSource, List list) {
        Log_OC.getArray(banksLocalSource, "this$0");
        Log_OC.getArray(list, "$banks");
        CoreAppDatabase $r2 = banksLocalSource.appRoomDatabase;
        BanksDao $r3 = $r2.getBanksDao();
        $r3.insertBanks(list);
        AbstractC11688p $r4 = AbstractC11688p.m10532N(list);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p addBanks(final List list) {
        Log_OC.getArray(list, "banks");
        AbstractC11271b $r4 = AbstractC11271b.m11239l(new Callable() { // from class: ai.kudi.agent.banks.domain.Preferences$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BanksLocalSource $r2 = BanksLocalSource.this;
                C13666w $r1 = BanksLocalSource.m39001addBanks$lambda0($r2);
                return $r1;
            }
        });
        AbstractC11688p $r5 = $r4.m11247d(AbstractC11688p.m10488t(new Callable() { // from class: ai.kudi.agent.banks.domain.DatabaseHelper$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BanksLocalSource $r3 = BanksLocalSource.this;
                List $r1 = list;
                InterfaceC11692s $r2 = BanksLocalSource.m39002addBanks$lambda1($r3, $r1);
                return $r2;
            }
        }));
        Log_OC.loadImage($r5, "fromCallable {\n            appRoomDatabase.banksDao.deleteBanks()\n        }.andThen(\n            Observable.defer {\n                appRoomDatabase.banksDao.insertBanks(banks)\n                Observable.just(banks)\n            }\n        )");
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11696w findByBankCode(String str) {
        Log_OC.getArray(str, "bankCode");
        CoreAppDatabase $r2 = this.appRoomDatabase;
        BanksDao $r3 = $r2.getBanksDao();
        AbstractC11696w $r4 = $r3.getBankByCode(str);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getBanks() {
        CoreAppDatabase $r1 = this.appRoomDatabase;
        BanksDao $r2 = $r1.getBanksDao();
        AbstractC11688p $r3 = $r2.getBanks();
        return $r3;
    }
}
