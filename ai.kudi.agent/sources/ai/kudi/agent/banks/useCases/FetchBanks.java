package ai.kudi.agent.banks.useCases;

import ai.kudi.agent.banks.domain.BanksRepository;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.usecases.NoInputUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: FetchBanks.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH\u0016J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/banks/useCases/FetchBanks;", "Lai/kudi/agent/core/usecases/NoInputUseCase;", "", "Lai/kudi/agent/core/domain/room_entities/Bank;", "banksRepository", "Lai/kudi/agent/banks/domain/BanksRepository;", "(Lai/kudi/agent/banks/domain/BanksRepository;)V", "execute", "Lio/reactivex/Observable;", "findByCode", "Lio/reactivex/Single;", "bankCode", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchBanks implements NoInputUseCase<List<? extends Bank>> {
    private final BanksRepository banksRepository;

    public FetchBanks(BanksRepository banksRepository) {
        Log_OC.getArray(banksRepository, "banksRepository");
        this.banksRepository = banksRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.NoInputUseCase
    public AbstractC11688p execute() {
        BanksRepository $r1 = this.banksRepository;
        AbstractC11688p $r2 = $r1.getBanks();
        Item $r3 = ClassWriter.LogError();
        AbstractC11688p $r22 = $r2.h0($r3);
        Item $r32 = ContextUtils.LogError();
        AbstractC11688p $r23 = $r22.R($r32);
        Log_OC.loadImage($r23, "banksRepository.getBanks().subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r23;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11696w findByCode(String str) {
        Log_OC.getArray(str, "bankCode");
        BanksRepository $r3 = this.banksRepository;
        AbstractC11696w $r1 = $r3.locateBankByCode(str);
        return $r1;
    }
}
