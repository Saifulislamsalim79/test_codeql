package io.intercom.android.sdk.models.events;

import io.intercom.android.sdk.models.Part;
/* loaded from: classes3.dex */
public class ReplyEvent {
    private final String conversationId;
    private final String partId;
    private final int position;
    private final Part response;

    public ReplyEvent(Part part, int i, String str, String str2) {
        this.response = part;
        this.partId = str;
        this.position = i;
        this.conversationId = str2;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public String getPartId() {
        return this.partId;
    }

    public int getPosition() {
        return this.position;
    }

    public Part getResponse() {
        return this.response;
    }
}
