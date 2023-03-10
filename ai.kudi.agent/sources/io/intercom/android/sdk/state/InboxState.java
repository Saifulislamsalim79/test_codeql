package io.intercom.android.sdk.state;

import io.intercom.android.sdk.models.Conversation;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class InboxState {

    /* loaded from: classes3.dex */
    public enum Status {
        INITIAL,
        LOADING,
        SUCCESS,
        FAILED
    }

    public static InboxState create(List<Conversation> list, Status status, boolean z) {
        return new AutoValue_InboxState(list, status, z);
    }

    public abstract List<Conversation> conversations();

    public abstract boolean hasMorePages();

    public abstract Status status();
}
