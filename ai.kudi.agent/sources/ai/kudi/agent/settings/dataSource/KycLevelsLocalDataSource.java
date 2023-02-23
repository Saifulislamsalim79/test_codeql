package ai.kudi.agent.settings.dataSource;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
/* compiled from: KycLevelsLocalDataSource.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/settings/dataSource/KycLevelsLocalDataSource;", "", "coreAppDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/domain/db/CoreAppDatabase;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "getKycLevels", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/room_entities/KycLevelsModel;", "updateKycLevels", "", "kycLevels", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KycLevelsLocalDataSource {
    private final CoreAppDatabase coreAppDatabase;
    private final RxSchedulers rxSchedulers;

    public KycLevelsLocalDataSource(CoreAppDatabase coreAppDatabase, RxSchedulers rxSchedulers) {
        Log_OC.getArray(coreAppDatabase, "coreAppDatabase");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.coreAppDatabase = coreAppDatabase;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getKycLevels() {
        CoreAppDatabase $r1 = this.coreAppDatabase;
        KycLevelsDao $r2 = $r1.getKycLevelsDao();
        AbstractC11688p $r3 = $r2.getKycLevels();
        RxSchedulers $r4 = this.rxSchedulers;
        Item $r5 = $r4.setSettings();
        AbstractC11688p $r32 = $r3.h0($r5);
        Log_OC.loadImage($r32, "coreAppDatabase.kycLevelsDao.getKycLevels().subscribeOn(rxSchedulers.io())");
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateKycLevels(List list) {
        Log_OC.getArray(list, "kycLevels");
        CoreAppDatabase $r2 = this.coreAppDatabase;
        KycLevelsDao $r3 = $r2.getKycLevelsDao();
        $r3.deleteAll();
        CoreAppDatabase $r22 = this.coreAppDatabase;
        KycLevelsDao $r32 = $r22.getKycLevelsDao();
        $r32.addAllLevels(list);
    }
}
