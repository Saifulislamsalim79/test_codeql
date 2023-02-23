package ai.kudi.agent.settings.domain.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.IdTypeDao;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11696w;
/* compiled from: IdtypeRepository.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/settings/domain/repositories/IdtypeRepository;", "", "appRoomDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "(Lai/kudi/agent/core/domain/db/CoreAppDatabase;)V", "getIdTypes", "Lio/reactivex/Flowable;", "", "Lai/kudi/agent/core/domain/room_entities/IdType;", "saveIdTypes", "Lio/reactivex/Single;", "", "idTypes", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IdtypeRepository {
    private final CoreAppDatabase appRoomDatabase;

    public IdtypeRepository(CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(coreAppDatabase, "appRoomDatabase");
        this.appRoomDatabase = coreAppDatabase;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11293f getIdTypes() {
        CoreAppDatabase $r1 = this.appRoomDatabase;
        IdTypeDao $r2 = $r1.getIdTypeDao();
        AbstractC11293f $r3 = $r2.getIdTypes();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11696w saveIdTypes(List list) {
        Log_OC.getArray(list, "idTypes");
        CoreAppDatabase $r2 = this.appRoomDatabase;
        IdTypeDao $r3 = $r2.getIdTypeDao();
        AbstractC11696w $r4 = $r3.insertIdTypes(list);
        return $r4;
    }
}
