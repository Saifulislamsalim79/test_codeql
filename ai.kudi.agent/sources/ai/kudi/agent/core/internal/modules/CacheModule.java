package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.core.util.Pref;
import kotlin.Metadata;
/* compiled from: CacheModule.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/CacheModule;", "", "()V", "provideCacheImpl", "Lai/kudi/agent/core/util/Pref;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CacheModule {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Pref provideCacheImpl() {
        Pref.Companion $r2 = Pref.Companion;
        Pref $r1 = $r2.getInstance();
        return $r1;
    }
}
