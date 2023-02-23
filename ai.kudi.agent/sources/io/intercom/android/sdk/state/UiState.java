package io.intercom.android.sdk.state;
/* loaded from: classes3.dex */
public abstract class UiState {

    /* loaded from: classes3.dex */
    public enum Screen {
        NONE,
        INBOX,
        HOME,
        COMPOSER,
        CONVERSATION
    }

    public static UiState create(Screen screen, String str) {
        return new AutoValue_UiState(screen, str);
    }

    public abstract String conversationId();

    public abstract Screen screen();
}
