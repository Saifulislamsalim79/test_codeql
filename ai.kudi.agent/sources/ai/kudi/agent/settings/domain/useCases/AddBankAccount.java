package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.settings.domain.package_4.AddBankAcctRequest;
import ai.kudi.agent.settings.domain.package_4.AddBankAcctResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
import retrofit2.C14840l;
/* compiled from: AddBankAccount.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/settings/domain/useCases/AddBankAccount;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/settings/domain/dto/AddBankAcctResponse;", "addBankAcctRequest", "Lai/kudi/agent/settings/domain/dto/AddBankAcctRequest;", "sessionId", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AddBankAccount {
    private final NetworkService networkService;

    public AddBankAccount(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final AddBankAcctResponse m40742execute$lambda0(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        Object $r0 = c14840l.m284a();
        Log_OC.append($r0);
        AddBankAcctResponse $r2 = (AddBankAcctResponse) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(AddBankAcctRequest addBankAcctRequest, String str) {
        Log_OC.getArray(addBankAcctRequest, "addBankAcctRequest");
        Log_OC.getArray(str, "sessionId");
        NetworkService $r3 = this.networkService;
        AddNoteCommand $r4 = $r3.getApi();
        AbstractC11688p $r5 = $r4.addBankAcct(addBankAcctRequest, str);
        Type $r6 = Type.GRIDSET;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r54 = $r53.R($r72);
        Log_OC.loadImage($r54, "networkService.api.addBankAcct(addBankAcctRequest, sessionId)\n                .map {\n                    it.body()!!\n                }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r54;
    }
}
