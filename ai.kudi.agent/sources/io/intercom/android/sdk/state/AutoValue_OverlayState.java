package io.intercom.android.sdk.state;

import android.app.Activity;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.state.OverlayState;
import java.util.List;
import java.util.Set;
/* loaded from: classes3.dex */
final class AutoValue_OverlayState extends OverlayState {
    private final int bottomPadding;
    private final List<Conversation> conversations;
    private final Set<String> dismissedPartIds;
    private final Intercom.Visibility launcherVisibility;
    private final Intercom.Visibility notificationVisibility;
    private final Activity pausedHostActivity;
    private final Activity resumedHostActivity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class Builder extends OverlayState.Builder {
        private Integer bottomPadding;
        private List<Conversation> conversations;
        private Set<String> dismissedPartIds;
        private Intercom.Visibility launcherVisibility;
        private Intercom.Visibility notificationVisibility;
        private Activity pausedHostActivity;
        private Activity resumedHostActivity;

        @Override // io.intercom.android.sdk.state.OverlayState.Builder
        public OverlayState.Builder bottomPadding(int i) {
            this.bottomPadding = Integer.valueOf(i);
            return this;
        }

        @Override // io.intercom.android.sdk.state.OverlayState.Builder
        public OverlayState build() {
            String str = "";
            if (this.conversations == null) {
                str = " conversations";
            }
            if (this.dismissedPartIds == null) {
                str = str + " dismissedPartIds";
            }
            if (this.notificationVisibility == null) {
                str = str + " notificationVisibility";
            }
            if (this.launcherVisibility == null) {
                str = str + " launcherVisibility";
            }
            if (this.bottomPadding == null) {
                str = str + " bottomPadding";
            }
            if (str.isEmpty()) {
                return new AutoValue_OverlayState(this.conversations, this.dismissedPartIds, this.notificationVisibility, this.launcherVisibility, this.bottomPadding.intValue(), this.resumedHostActivity, this.pausedHostActivity);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // io.intercom.android.sdk.state.OverlayState.Builder
        public OverlayState.Builder conversations(List<Conversation> list) {
            if (list != null) {
                this.conversations = list;
                return this;
            }
            throw new NullPointerException("Null conversations");
        }

        @Override // io.intercom.android.sdk.state.OverlayState.Builder
        public OverlayState.Builder dismissedPartIds(Set<String> set) {
            if (set != null) {
                this.dismissedPartIds = set;
                return this;
            }
            throw new NullPointerException("Null dismissedPartIds");
        }

        @Override // io.intercom.android.sdk.state.OverlayState.Builder
        public OverlayState.Builder launcherVisibility(Intercom.Visibility visibility) {
            if (visibility != null) {
                this.launcherVisibility = visibility;
                return this;
            }
            throw new NullPointerException("Null launcherVisibility");
        }

        @Override // io.intercom.android.sdk.state.OverlayState.Builder
        public OverlayState.Builder notificationVisibility(Intercom.Visibility visibility) {
            if (visibility != null) {
                this.notificationVisibility = visibility;
                return this;
            }
            throw new NullPointerException("Null notificationVisibility");
        }

        @Override // io.intercom.android.sdk.state.OverlayState.Builder
        public OverlayState.Builder pausedHostActivity(Activity activity) {
            this.pausedHostActivity = activity;
            return this;
        }

        @Override // io.intercom.android.sdk.state.OverlayState.Builder
        public OverlayState.Builder resumedHostActivity(Activity activity) {
            this.resumedHostActivity = activity;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(OverlayState overlayState) {
            this.conversations = overlayState.conversations();
            this.dismissedPartIds = overlayState.dismissedPartIds();
            this.notificationVisibility = overlayState.notificationVisibility();
            this.launcherVisibility = overlayState.launcherVisibility();
            this.bottomPadding = Integer.valueOf(overlayState.bottomPadding());
            this.resumedHostActivity = overlayState.resumedHostActivity();
            this.pausedHostActivity = overlayState.pausedHostActivity();
        }
    }

    @Override // io.intercom.android.sdk.state.OverlayState
    public int bottomPadding() {
        return this.bottomPadding;
    }

    @Override // io.intercom.android.sdk.state.OverlayState
    public List<Conversation> conversations() {
        return this.conversations;
    }

    @Override // io.intercom.android.sdk.state.OverlayState
    public Set<String> dismissedPartIds() {
        return this.dismissedPartIds;
    }

    public boolean equals(Object obj) {
        Activity activity;
        if (obj == this) {
            return true;
        }
        if (obj instanceof OverlayState) {
            OverlayState overlayState = (OverlayState) obj;
            if (this.conversations.equals(overlayState.conversations()) && this.dismissedPartIds.equals(overlayState.dismissedPartIds()) && this.notificationVisibility.equals(overlayState.notificationVisibility()) && this.launcherVisibility.equals(overlayState.launcherVisibility()) && this.bottomPadding == overlayState.bottomPadding() && ((activity = this.resumedHostActivity) != null ? activity.equals(overlayState.resumedHostActivity()) : overlayState.resumedHostActivity() == null)) {
                Activity activity2 = this.pausedHostActivity;
                if (activity2 == null) {
                    if (overlayState.pausedHostActivity() == null) {
                        return true;
                    }
                } else if (activity2.equals(overlayState.pausedHostActivity())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((this.conversations.hashCode() ^ 1000003) * 1000003) ^ this.dismissedPartIds.hashCode()) * 1000003) ^ this.notificationVisibility.hashCode()) * 1000003) ^ this.launcherVisibility.hashCode()) * 1000003) ^ this.bottomPadding) * 1000003;
        Activity activity = this.resumedHostActivity;
        int hashCode2 = (hashCode ^ (activity == null ? 0 : activity.hashCode())) * 1000003;
        Activity activity2 = this.pausedHostActivity;
        return hashCode2 ^ (activity2 != null ? activity2.hashCode() : 0);
    }

    @Override // io.intercom.android.sdk.state.OverlayState
    public Intercom.Visibility launcherVisibility() {
        return this.launcherVisibility;
    }

    @Override // io.intercom.android.sdk.state.OverlayState
    public Intercom.Visibility notificationVisibility() {
        return this.notificationVisibility;
    }

    @Override // io.intercom.android.sdk.state.OverlayState
    public Activity pausedHostActivity() {
        return this.pausedHostActivity;
    }

    @Override // io.intercom.android.sdk.state.OverlayState
    public Activity resumedHostActivity() {
        return this.resumedHostActivity;
    }

    @Override // io.intercom.android.sdk.state.OverlayState
    public OverlayState.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "OverlayState{conversations=" + this.conversations + ", dismissedPartIds=" + this.dismissedPartIds + ", notificationVisibility=" + this.notificationVisibility + ", launcherVisibility=" + this.launcherVisibility + ", bottomPadding=" + this.bottomPadding + ", resumedHostActivity=" + this.resumedHostActivity + ", pausedHostActivity=" + this.pausedHostActivity + "}";
    }

    private AutoValue_OverlayState(List<Conversation> list, Set<String> set, Intercom.Visibility visibility, Intercom.Visibility visibility2, int i, Activity activity, Activity activity2) {
        this.conversations = list;
        this.dismissedPartIds = set;
        this.notificationVisibility = visibility;
        this.launcherVisibility = visibility2;
        this.bottomPadding = i;
        this.resumedHostActivity = activity;
        this.pausedHostActivity = activity2;
    }
}
