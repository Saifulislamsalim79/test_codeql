package io.intercom.android.sdk.state;

import io.intercom.android.sdk.models.Part;
/* loaded from: classes3.dex */
public class ReplyPart {
    private final String conversationId;
    private final Part part;

    public ReplyPart(Part part, String str) {
        this.part = part;
        this.conversationId = str;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public Part getPart() {
        return this.part;
    }
}
