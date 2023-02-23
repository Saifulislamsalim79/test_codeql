package com.smartlook.sdk.smartlook.integration.model;

import com.mixpanel.android.mpmetrics.MixpanelAPI;
import kotlin.Metadata;
import kotlin.e0.d.l;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/integration/model/MixpanelIntegration;", "Lcom/smartlook/sdk/smartlook/integration/model/Integration;", "", "name", "()Ljava/lang/String;", "printName", "", "instanceHashCode", "()I", "Lcom/mixpanel/android/mpmetrics/MixpanelAPI;", "instance", "Lcom/mixpanel/android/mpmetrics/MixpanelAPI;", "getInstance", "()Lcom/mixpanel/android/mpmetrics/MixpanelAPI;", "<init>", "(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class MixpanelIntegration extends Integration {
    private final MixpanelAPI instance;

    public MixpanelIntegration(MixpanelAPI mixpanelAPI) {
        l.f(mixpanelAPI, "instance");
        this.instance = mixpanelAPI;
    }

    public final MixpanelAPI getInstance() {
        return this.instance;
    }

    @Override // com.smartlook.sdk.smartlook.integration.model.Integration
    public int instanceHashCode() {
        return this.instance.hashCode();
    }

    @Override // com.smartlook.sdk.smartlook.integration.model.Integration
    public String name() {
        return "mixpanel";
    }

    @Override // com.smartlook.sdk.smartlook.integration.model.Integration
    public String printName() {
        return "Mixpanel";
    }
}
