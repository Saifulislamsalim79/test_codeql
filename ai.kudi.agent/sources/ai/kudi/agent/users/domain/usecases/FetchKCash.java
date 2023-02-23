package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.dto.KCashInstruction;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: FetchKCash.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/FetchKCash;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "Lai/kudi/agent/users/domain/dto/KCashInstruction;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", TransactionField.AMOUNT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchKCash implements OneInputUseCase<List<? extends KCashInstruction>, Integer> {
    private final NetworkService networkService;

    public FetchKCash(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(int i) {
        NetworkService $r1 = this.networkService;
        AddNoteCommand $r2 = $r1.getApi();
        String $r3 = String.valueOf(i);
        AbstractC11688p $r4 = $r2.getKCashInstructions($r3);
        p425j.p444e.Item $r5 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r42 = $r4.h0($r5);
        p425j.p444e.Item $r52 = ContextUtils.LogError();
        AbstractC11688p $r43 = $r42.R($r52);
        Log_OC.loadImage($r43, "networkService.api.getKCashInstructions(amount.toString())\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r43;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        Number $r2 = (Number) obj;
        int $i0 = $r2.intValue();
        AbstractC11688p $r3 = execute($i0);
        return $r3;
    }
}
