package com.smartlook.sdk.smartlook.core.api.model;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/core/api/model/LogListener;", "Lkotlin/Any;", "", "logAspect", "logSeverity", "tag", MetricTracker.Object.MESSAGE, "", "onLog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public interface LogListener {
    void onLog(String str, String str2, String str3, String str4);
}
