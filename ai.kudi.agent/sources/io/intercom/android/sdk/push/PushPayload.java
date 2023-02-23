package io.intercom.android.sdk.push;

import ai.kudi.agent.pin.KudiPin;
import android.os.Bundle;
/* loaded from: classes3.dex */
public abstract class PushPayload {
    private static final String MESSAGE_TYPE = "message";
    private static final String PUSH_ONLY = "push_only";

    public static PushPayload create(Bundle bundle) {
        if (bundle == null) {
            return create(Bundle.EMPTY);
        }
        return new AutoValue_PushPayload(stringOrEmpty(bundle, "conversation_id"), stringOrEmpty(bundle, "message"), stringOrEmpty(bundle, "body"), stringOrEmpty(bundle, "author_name"), stringOrEmpty(bundle, "image_url"), stringOrEmpty(bundle, "app_name"), stringOrEmpty(bundle, "receiver"), stringOrEmpty(bundle, "conversation_part_type"), stringOrEmpty(bundle, "intercom_push_type"), stringOrEmpty(bundle, "uri"), stringOrEmpty(bundle, "push_only_conv_id"), stringOrEmpty(bundle, "instance_id"), stringOrEmpty(bundle, KudiPin.KUDI_PIN_TITLE), bundle.getInt("intercom_priority_type", 1));
    }

    private static String stringOrEmpty(Bundle bundle, String str) {
        return bundle.getString(str, "");
    }

    public abstract String getAppName();

    public abstract String getAuthorName();

    public abstract String getBody();

    public abstract String getConversationId();

    public abstract String getConversationPartType();

    public abstract String getImageUrl();

    public abstract String getInstanceId();

    public abstract String getIntercomPushType();

    public abstract String getMessage();

    public abstract int getPriority();

    public abstract String getPushOnlyConversationId();

    public abstract String getReceiver();

    public abstract String getTitle();

    public abstract String getUri();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isFirstPart() {
        return "message".equals(getConversationPartType());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isIntercomPush() {
        return !getIntercomPushType().isEmpty() && "intercom_sdk".equals(getReceiver());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isPushOnly() {
        return PUSH_ONLY.equals(getIntercomPushType());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String messageOrBody() {
        return getMessage().isEmpty() ? getBody() : getMessage();
    }
}
