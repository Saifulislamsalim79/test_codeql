package ai.kudi.agent.register;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.PinCredentialsDao;
import ai.kudi.agent.core.domain.room_entities.PinEntity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: PinRepositoryImpl.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/register/PinRepositoryImpl;", "", "roomDb", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "(Lai/kudi/agent/core/domain/db/CoreAppDatabase;)V", "getPin", "Lio/reactivex/Single;", "Lai/kudi/agent/core/domain/room_entities/PinEntity;", "phoneNumber", "", "savePin", "Lio/reactivex/Observable;", "", "encodedPin", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PinRepositoryImpl {
    private final CoreAppDatabase roomDb;

    public PinRepositoryImpl(CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(coreAppDatabase, "roomDb");
        this.roomDb = coreAppDatabase;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11696w getPin(String str) {
        Log_OC.getArray(str, "phoneNumber");
        CoreAppDatabase $r2 = this.roomDb;
        PinCredentialsDao $r3 = $r2.getPinCredentialsDao();
        AbstractC11696w $r4 = $r3.getPin(str);
        Item $r5 = ClassWriter.LogError();
        AbstractC11696w $r42 = $r4.u($r5);
        Item $r52 = ContextUtils.LogError();
        AbstractC11696w $r43 = $r42.n($r52);
        Log_OC.loadImage($r43, "roomDb.pinCredentialsDao.getPin(phoneNumber).subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r43;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p savePin(String str, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "encodedPin");
        CoreAppDatabase $r4 = this.roomDb;
        PinCredentialsDao $r5 = $r4.getPinCredentialsDao();
        PinEntity $r1 = new PinEntity(str, str2);
        AbstractC11696w $r6 = $r5.insertPin($r1);
        Item $r7 = ClassWriter.LogError();
        AbstractC11696w $r62 = $r6.u($r7);
        Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r8 = $r62.n($r72).m10427w();
        Log_OC.loadImage($r8, "roomDb.pinCredentialsDao.insertPin(\n            PinEntity(\n                phoneNumber,\n                encodedPin = encodedPin\n            )\n        ).subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread()).toObservable()");
        return $r8;
    }
}
