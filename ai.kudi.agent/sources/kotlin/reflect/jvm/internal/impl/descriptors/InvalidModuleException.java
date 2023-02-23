package kotlin.reflect.jvm.internal.impl.descriptors;

import io.intercom.android.sdk.metrics.MetricTracker;
/* compiled from: InvalidModuleException.kt */
/* loaded from: classes3.dex */
public final class InvalidModuleException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String str) {
        super(str);
        kotlin.e0.d.l.f(str, MetricTracker.Object.MESSAGE);
    }
}
