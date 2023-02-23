package ai.kudi.agent.kshock.labs;

import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import retrofit2.C14841m;
/* compiled from: KShockModule.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/kshock/di/KShockModule;", "", "()V", "providesKShockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "retrofit", "Lretrofit2/Retrofit;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KShockModule {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KshockApi providesKShockApi(C14841m c14841m) {
        Log_OC.getArray(c14841m, "retrofit");
        Object $r1 = c14841m.m274d(ai.kudi.agent.kshock.data.domain.api.KshockApi.class);
        Log_OC.loadImage($r1, "retrofit.create(KshockApi::class.java)");
        KshockApi $r3 = (KshockApi) $r1;
        return $r3;
    }
}
