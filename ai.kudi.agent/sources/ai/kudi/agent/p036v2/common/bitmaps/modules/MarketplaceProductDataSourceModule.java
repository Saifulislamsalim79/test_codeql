package ai.kudi.agent.p036v2.common.bitmaps.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.users.data.network.UserService;
import android.content.Context;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import retrofit2.C14841m;
/* compiled from: MarketplaceProductDataSourceModule.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/v2/common/di/modules/MarketplaceProductDataSourceModule;", "", "()V", "provideMarketPlaceApi", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "retrofit", "Lretrofit2/Retrofit;", "provideUserService", "Lai/kudi/agent/users/data/network/UserService;", "providesCoreAppDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "context", "Landroid/content/Context;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.MarketplaceProductDataSourceModule */
/* loaded from: classes.dex */
public final class MarketplaceProductDataSourceModule {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketPlaceApi provideMarketPlaceApi(C14841m c14841m) {
        Log_OC.getArray(c14841m, "retrofit");
        Object $r1 = c14841m.m274d(MarketPlaceApi.class);
        Log_OC.loadImage($r1, "retrofit.create(MarketPlaceApi::class.java)");
        MarketPlaceApi $r3 = (MarketPlaceApi) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserService provideUserService(C14841m c14841m) {
        Log_OC.getArray(c14841m, "retrofit");
        Object $r1 = c14841m.m274d(UserService.class);
        Log_OC.loadImage($r1, "retrofit.create(UserService::class.java)");
        UserService $r3 = (UserService) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CoreAppDatabase providesCoreAppDatabase(Context context) {
        Log_OC.getArray(context, "context");
        CoreAppDatabase.Companion $r3 = CoreAppDatabase.Companion;
        CoreAppDatabase $r1 = $r3.getInstance(context);
        Log_OC.append($r1);
        return $r1;
    }
}
