package lombok.org.libs.org.objectweb.asm;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m10421d2 = {"a/a/b/a/b/d/a$d", "Ljava/lang/Exception;", "", MetricTracker.Object.MESSAGE, "<init>", "(Ljava/lang/String;)V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes.dex */
public final class Type extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Type(String str) {
        super(str);
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
    }
}
