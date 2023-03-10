package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.e0.d.l;
/* compiled from: TargetFragmentUsageViolation.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m10421d2 = {"Landroidx/fragment/app/strictmode/TargetFragmentUsageViolation;", "Landroidx/fragment/app/strictmode/Violation;", "fragment", "Landroidx/fragment/app/Fragment;", MetricTracker.Object.MESSAGE, "", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "fragment_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class TargetFragmentUsageViolation extends Violation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetFragmentUsageViolation(Fragment fragment, String str) {
        super(fragment, str);
        l.f(fragment, "fragment");
    }
}
