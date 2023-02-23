package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.settings.domain.repositories.KycLevelRepository;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: GetKycLevels.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/settings/domain/useCases/GetMonthlyKycLevels;", "", "kycLevelRepository", "Lai/kudi/agent/settings/domain/repositories/KycLevelRepository;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/settings/domain/repositories/KycLevelRepository;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/room_entities/KycLevelsModel;", "sessionId", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetMonthlyKycLevels {
    private final KycLevelRepository kycLevelRepository;
    private final RxSchedulers rxSchedulers;

    public GetMonthlyKycLevels(KycLevelRepository kycLevelRepository, RxSchedulers rxSchedulers) {
        Log_OC.getArray(kycLevelRepository, "kycLevelRepository");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.kycLevelRepository = kycLevelRepository;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "sessionId");
        KycLevelRepository $r2 = this.kycLevelRepository;
        AbstractC11688p $r3 = $r2.getMonthlyKycLevels(str);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        RxSchedulers $r5 = this.rxSchedulers;
        p425j.p444e.Item $r42 = $r5.main();
        AbstractC11688p $r33 = $r32.R($r42);
        Log_OC.loadImage($r33, "kycLevelRepository.getMonthlyKycLevels(sessionId)\n            .subscribeOn(Schedulers.io()).observeOn(rxSchedulers.main())");
        return $r33;
    }
}
