package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.domain.room_entities.KycLevelsModel;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.NoInputUseCase;
import ai.kudi.agent.settings.domain.repositories.KycLevelRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: GetKycLevels.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/settings/domain/useCases/GetKycLevels;", "Lai/kudi/agent/core/usecases/NoInputUseCase;", "", "Lai/kudi/agent/core/domain/room_entities/KycLevelsModel;", "kycLevelRepository", "Lai/kudi/agent/settings/domain/repositories/KycLevelRepository;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/settings/domain/repositories/KycLevelRepository;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetKycLevels implements NoInputUseCase<List<? extends KycLevelsModel>> {
    private final KycLevelRepository kycLevelRepository;
    private final RxSchedulers rxSchedulers;

    public GetKycLevels(KycLevelRepository kycLevelRepository, RxSchedulers rxSchedulers) {
        Log_OC.getArray(kycLevelRepository, "kycLevelRepository");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.kycLevelRepository = kycLevelRepository;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.NoInputUseCase
    public AbstractC11688p execute() {
        KycLevelRepository $r1 = this.kycLevelRepository;
        AbstractC11688p $r2 = $r1.getKycLevels();
        RxSchedulers $r3 = this.rxSchedulers;
        p425j.p444e.Item $r4 = $r3.setSettings();
        AbstractC11688p $r22 = $r2.h0($r4);
        RxSchedulers $r32 = this.rxSchedulers;
        p425j.p444e.Item $r42 = $r32.main();
        AbstractC11688p $r23 = $r22.R($r42);
        Log_OC.loadImage($r23, "kycLevelRepository.getKycLevels().subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r23;
    }
}
