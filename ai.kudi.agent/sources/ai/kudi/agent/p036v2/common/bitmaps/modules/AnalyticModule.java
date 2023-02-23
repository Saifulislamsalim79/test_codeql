package ai.kudi.agent.p036v2.common.bitmaps.modules;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.FirebaseAnalyticsImpl;
import android.content.Context;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AnalyticModule.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/v2/common/di/modules/AnalyticModule;", "", "()V", "providesAnalyticsImpl", "Lai/kudi/agent/core/analytics/Analytics;", "context", "Landroid/content/Context;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.AnalyticModule */
/* loaded from: classes.dex */
public final class AnalyticModule {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics providesAnalyticsImpl(Context context) {
        Log_OC.getArray(context, "context");
        FirebaseAnalyticsImpl $r2 = new FirebaseAnalyticsImpl(context);
        return $r2;
    }
}
