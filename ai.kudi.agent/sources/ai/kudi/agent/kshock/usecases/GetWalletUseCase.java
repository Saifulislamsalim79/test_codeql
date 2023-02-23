package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: GetAllWalletsUseCase.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/kshock/usecases/GetWalletUseCase;", "", "kshockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/kshock/data/domain/api/KshockApi;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/kshock/data/model/Wallet;", "phoneNumber", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetWalletUseCase {
    private final FetchCurrentUser fetchCurrentUser;
    private final KshockApi kshockApi;

    public GetWalletUseCase(KshockApi kshockApi, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(kshockApi, "kshockApi");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.kshockApi = kshockApi;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39692execute$lambda0(GetWalletUseCase getWalletUseCase, String str, User user) {
        Log_OC.getArray(getWalletUseCase, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(user, "user");
        KshockApi $r3 = getWalletUseCase.kshockApi;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "user.sessionId");
        AbstractC11688p $r5 = $r3.getWalletByPhoneNumber($r4, str);
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        return $r52.R($r62);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(final String str) {
        Log_OC.getArray(str, "phoneNumber");
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.usecases.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                GetWalletUseCase $r1 = GetWalletUseCase.this;
                String $r22 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = GetWalletUseCase.m39692execute$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        return $r52.R($r62);
    }
}
