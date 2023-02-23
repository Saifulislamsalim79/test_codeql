package io.intercom.android.sdk.push;
/* loaded from: classes3.dex */
final class AutoValue_PushPayload extends PushPayload {
    private final String appName;
    private final String authorName;
    private final String body;
    private final String conversationId;
    private final String conversationPartType;
    private final String imageUrl;
    private final String instanceId;
    private final String intercomPushType;
    private final String message;
    private final int priority;
    private final String pushOnlyConversationId;
    private final String receiver;
    private final String title;
    private final String uri;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PushPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i) {
        if (str != null) {
            this.conversationId = str;
            if (str2 != null) {
                this.message = str2;
                if (str3 != null) {
                    this.body = str3;
                    if (str4 != null) {
                        this.authorName = str4;
                        if (str5 != null) {
                            this.imageUrl = str5;
                            if (str6 != null) {
                                this.appName = str6;
                                if (str7 != null) {
                                    this.receiver = str7;
                                    if (str8 != null) {
                                        this.conversationPartType = str8;
                                        if (str9 != null) {
                                            this.intercomPushType = str9;
                                            if (str10 != null) {
                                                this.uri = str10;
                                                if (str11 != null) {
                                                    this.pushOnlyConversationId = str11;
                                                    if (str12 != null) {
                                                        this.instanceId = str12;
                                                        if (str13 != null) {
                                                            this.title = str13;
                                                            this.priority = i;
                                                            return;
                                                        }
                                                        throw new NullPointerException("Null title");
                                                    }
                                                    throw new NullPointerException("Null instanceId");
                                                }
                                                throw new NullPointerException("Null pushOnlyConversationId");
                                            }
                                            throw new NullPointerException("Null uri");
                                        }
                                        throw new NullPointerException("Null intercomPushType");
                                    }
                                    throw new NullPointerException("Null conversationPartType");
                                }
                                throw new NullPointerException("Null receiver");
                            }
                            throw new NullPointerException("Null appName");
                        }
                        throw new NullPointerException("Null imageUrl");
                    }
                    throw new NullPointerException("Null authorName");
                }
                throw new NullPointerException("Null body");
            }
            throw new NullPointerException("Null message");
        }
        throw new NullPointerException("Null conversationId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PushPayload) {
            PushPayload pushPayload = (PushPayload) obj;
            return this.conversationId.equals(pushPayload.getConversationId()) && this.message.equals(pushPayload.getMessage()) && this.body.equals(pushPayload.getBody()) && this.authorName.equals(pushPayload.getAuthorName()) && this.imageUrl.equals(pushPayload.getImageUrl()) && this.appName.equals(pushPayload.getAppName()) && this.receiver.equals(pushPayload.getReceiver()) && this.conversationPartType.equals(pushPayload.getConversationPartType()) && this.intercomPushType.equals(pushPayload.getIntercomPushType()) && this.uri.equals(pushPayload.getUri()) && this.pushOnlyConversationId.equals(pushPayload.getPushOnlyConversationId()) && this.instanceId.equals(pushPayload.getInstanceId()) && this.title.equals(pushPayload.getTitle()) && this.priority == pushPayload.getPriority();
        }
        return false;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getAppName() {
        return this.appName;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getAuthorName() {
        return this.authorName;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getBody() {
        return this.body;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getConversationId() {
        return this.conversationId;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getConversationPartType() {
        return this.conversationPartType;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getInstanceId() {
        return this.instanceId;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getIntercomPushType() {
        return this.intercomPushType;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getMessage() {
        return this.message;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public int getPriority() {
        return this.priority;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getPushOnlyConversationId() {
        return this.pushOnlyConversationId;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getReceiver() {
        return this.receiver;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getTitle() {
        return this.title;
    }

    @Override // io.intercom.android.sdk.push.PushPayload
    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((this.conversationId.hashCode() ^ 1000003) * 1000003) ^ this.message.hashCode()) * 1000003) ^ this.body.hashCode()) * 1000003) ^ this.authorName.hashCode()) * 1000003) ^ this.imageUrl.hashCode()) * 1000003) ^ this.appName.hashCode()) * 1000003) ^ this.receiver.hashCode()) * 1000003) ^ this.conversationPartType.hashCode()) * 1000003) ^ this.intercomPushType.hashCode()) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.pushOnlyConversationId.hashCode()) * 1000003) ^ this.instanceId.hashCode()) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.priority;
    }

    public String toString() {
        return "PushPayload{conversationId=" + this.conversationId + ", message=" + this.message + ", body=" + this.body + ", authorName=" + this.authorName + ", imageUrl=" + this.imageUrl + ", appName=" + this.appName + ", receiver=" + this.receiver + ", conversationPartType=" + this.conversationPartType + ", intercomPushType=" + this.intercomPushType + ", uri=" + this.uri + ", pushOnlyConversationId=" + this.pushOnlyConversationId + ", instanceId=" + this.instanceId + ", title=" + this.title + ", priority=" + this.priority + "}";
    }
}
