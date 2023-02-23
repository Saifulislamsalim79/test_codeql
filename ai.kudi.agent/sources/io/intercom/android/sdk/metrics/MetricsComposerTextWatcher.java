package io.intercom.android.sdk.metrics;

import android.text.Editable;
import android.text.TextUtils;
import io.intercom.android.sdk.utilities.SimpleTextWatcher;
/* loaded from: classes3.dex */
public class MetricsComposerTextWatcher extends SimpleTextWatcher {
    private String conversationId;
    private boolean hasTrackedEvent;
    private final MetricTracker metricTracker;

    public MetricsComposerTextWatcher(MetricTracker metricTracker) {
        this.metricTracker = metricTracker;
    }

    @Override // io.intercom.android.sdk.utilities.SimpleTextWatcher, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.hasTrackedEvent || editable.length() == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.conversationId)) {
            this.metricTracker.typeInNewConversation();
        } else {
            this.metricTracker.typeInConversation(this.conversationId);
        }
        this.hasTrackedEvent = true;
    }

    public void reset() {
        this.hasTrackedEvent = false;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }
}
