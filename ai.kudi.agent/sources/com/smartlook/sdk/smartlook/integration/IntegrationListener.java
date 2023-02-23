package com.smartlook.sdk.smartlook.integration;

import kotlin.Metadata;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/integration/IntegrationListener;", "Lkotlin/Any;", "", "dashboardSessionUrl", "", "onSessionReady", "(Ljava/lang/String;)V", "dashboardVisitorUrl", "onVisitorReady", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public interface IntegrationListener {
    void onSessionReady(String str);

    void onVisitorReady(String str);
}
