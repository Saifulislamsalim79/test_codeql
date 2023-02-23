package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.User;
/* loaded from: classes3.dex */
public abstract class BaseResponse {
    private final Config config;
    private final boolean hasConversations;
    private final User user;

    /* loaded from: classes3.dex */
    static abstract class Builder {
        Config.Builder config;
        boolean has_conversations;
        User.Builder user;

        public abstract BaseResponse build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseResponse(Builder builder) {
        Config.Builder builder2 = builder.config;
        this.config = builder2 == null ? Config.NULL : builder2.build();
        this.hasConversations = builder.has_conversations;
        User.Builder builder3 = builder.user;
        this.user = builder3 == null ? User.NULL : builder3.build();
    }

    public Config getConfig() {
        return this.config;
    }

    public User getUser() {
        return this.user;
    }

    public boolean hasConversations() {
        return this.hasConversations;
    }
}
