package ai.kudi.agent.p036v2.common.bitmaps.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.sources.localSources.ProductSectorLocalSource;
import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductSectorRemoteSource;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.RoomUserRepository;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MarketplaceProductModule.kt */
@Metadata(m10422d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u001a\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0007¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/v2/common/di/modules/MarketplaceProductModule;", "", "()V", "provideSharedPrefsName", "", "context", "Landroid/content/Context;", "providesDeviceSecuritySharedPrefs", "Landroid/content/SharedPreferences;", "providesLocationModule", "Lai/kudi/agent/register/domain/usecases/FetchLocation;", "userService", "Lai/kudi/agent/users/data/network/UserService;", "providesProductSectorLocalSourceModule", "Lai/kudi/agent/v2/common/domain/sources/localSources/ProductSectorLocalSource;", "appCoreAppDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "providesProductSectorRemoteSourceModule", "Lai/kudi/agent/v2/common/domain/sources/remoteSources/ProductSectorRemoteSource;", "marketplaceApi", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "providesSharedPrefs", "prefsName", "providesUserRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "appRoomDatabase", "service", "providesUserRepositoryModule", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "userRepository", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.MarketplaceProductModule */
/* loaded from: classes.dex */
public final class MarketplaceProductModule {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String provideSharedPrefsName(Context context) {
        Log_OC.getArray(context, "context");
        String $r2 = context.getPackageName();
        return Log_OC.m10359a($r2, (Object) "_shared_prefs");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences providesDeviceSecuritySharedPrefs(Context context) {
        Log_OC.getArray(context, "context");
        SharedPreferences $r1 = context.getSharedPreferences(ManageDevice.SECURE_DEVICE_PREFERENCE, 0);
        Log_OC.loadImage($r1, "context.getSharedPreferences(\n            ManageDevice.SECURE_DEVICE_PREFERENCE,\n            Context.MODE_PRIVATE\n        )");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchLocation providesLocationModule(UserService userService) {
        Log_OC.getArray(userService, "userService");
        FetchLocation $r2 = new FetchLocation(userService);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductSectorLocalSource providesProductSectorLocalSourceModule(CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(coreAppDatabase, "appCoreAppDatabase");
        ProductSectorLocalSource $r2 = new ProductSectorLocalSource(coreAppDatabase);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductSectorRemoteSource providesProductSectorRemoteSourceModule(MarketPlaceApi marketPlaceApi) {
        Log_OC.getArray(marketPlaceApi, "marketplaceApi");
        ProductSectorRemoteSource $r2 = new ProductSectorRemoteSource(marketPlaceApi);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences providesSharedPrefs(String str, Context context) {
        Log_OC.getArray(str, "prefsName");
        Log_OC.getArray(context, "context");
        SharedPreferences $r1 = context.getSharedPreferences(str, 0);
        Log_OC.loadImage($r1, "context.getSharedPreferences(prefsName, Context.MODE_PRIVATE)");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserRepository providesUserRepository(CoreAppDatabase coreAppDatabase, UserService userService) {
        Log_OC.getArray(coreAppDatabase, "appRoomDatabase");
        Log_OC.getArray(userService, "service");
        RoomUserRepository $r3 = new RoomUserRepository(coreAppDatabase, userService);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser providesUserRepositoryModule(UserRepository userRepository) {
        Log_OC.getArray(userRepository, "userRepository");
        FetchCurrentUser $r2 = new FetchCurrentUser(userRepository);
        return $r2;
    }
}
