package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.bills.data.remote.BillsService;
import ai.kudi.agent.core.data.remote.CoreApiService;
import ai.kudi.agent.issues.data.remote.IssuesApiService;
import ai.kudi.agent.savings.data.worker.SavingsApi;
import ai.kudi.agent.users.data.network.UserService;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import retrofit2.C14841m;
/* compiled from: NetworkServicesModule.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u000f0\u000f2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/NetworkServicesModule;", "", "()V", "providesBillsService", "Lai/kudi/agent/bills/data/remote/BillsService;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "providesCoreApiService", "Lai/kudi/agent/core/data/remote/CoreApiService;", "providesIssuesApiService", "Lai/kudi/agent/issues/data/remote/IssuesApiService;", "providesSavingApi", "Lai/kudi/agent/savings/data/api/SavingsApi;", "providesUserService", "Lai/kudi/agent/users/data/network/UserService;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkServicesModule {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BillsService providesBillsService(C14841m c14841m) {
        Log_OC.getArray(c14841m, "retrofit");
        Object $r1 = c14841m.m274d(BillsService.class);
        BillsService $r3 = (BillsService) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CoreApiService providesCoreApiService(C14841m c14841m) {
        Log_OC.getArray(c14841m, "retrofit");
        Object $r1 = c14841m.m274d(CoreApiService.class);
        CoreApiService $r3 = (CoreApiService) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssuesApiService providesIssuesApiService(C14841m c14841m) {
        Log_OC.getArray(c14841m, "retrofit");
        Object $r1 = c14841m.m274d(IssuesApiService.class);
        IssuesApiService $r3 = (IssuesApiService) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SavingsApi providesSavingApi(C14841m c14841m) {
        Log_OC.getArray(c14841m, "retrofit");
        Object $r1 = c14841m.m274d(ai.kudi.agent.savings.data.api.SavingsApi.class);
        Log_OC.loadImage($r1, "retrofit.create(SavingsApi::class.java)");
        SavingsApi $r3 = (SavingsApi) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserService providesUserService(C14841m c14841m) {
        Log_OC.getArray(c14841m, "retrofit");
        Object $r1 = c14841m.m274d(UserService.class);
        UserService $r3 = (UserService) $r1;
        return $r3;
    }
}
