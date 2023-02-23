package io.intercom.android.sdk.middleware;

import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.conversation.SoundPlayer;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.state.OverlayState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import java.util.Set;
import p201g.p218e.C7534g;
/* loaded from: classes3.dex */
public class AudioMiddleware implements Store.Middleware<State> {
    private final C7534g<String, String> playedPartIdsForConversations = new C7534g<>();
    private final SoundPlayer soundPlayer;
    private final Provider<UserIdentity> userIdentityProvider;

    /* renamed from: io.intercom.android.sdk.middleware.AudioMiddleware$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C103111 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.UNREAD_CONVERSATIONS_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.ACTIVITY_READY_FOR_VIEW_ATTACHMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.SET_IN_APP_NOTIFICATION_VISIBILITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.HARD_RESET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AudioMiddleware(SoundPlayer soundPlayer, Provider<UserIdentity> provider) {
        this.soundPlayer = soundPlayer;
        this.userIdentityProvider = provider;
    }

    private boolean neverPlayedAudioFor(Conversation conversation, Part part) {
        return !part.getId().equals(this.playedPartIdsForConversations.get(conversation.getId()));
    }

    private static boolean noActivityForOverlays(OverlayState overlayState) {
        return overlayState.resumedHostActivity() == null;
    }

    private static boolean notificationsDisabled(OverlayState overlayState) {
        return overlayState.notificationVisibility() != Intercom.Visibility.VISIBLE;
    }

    @Override // io.intercom.android.sdk.store.Store.Middleware
    public void dispatch(Store<State> store, Action<?> action, Store.NextDispatcher nextDispatcher) {
        nextDispatcher.dispatch(action);
        if (this.userIdentityProvider.get().isSoftReset()) {
            return;
        }
        int i = C103111.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                return;
            }
            this.playedPartIdsForConversations.clear();
            return;
        }
        OverlayState overlayState = (OverlayState) store.select(Selectors.OVERLAY);
        if (notificationsDisabled(overlayState) || noActivityForOverlays(overlayState)) {
            return;
        }
        Set<String> dismissedPartIds = overlayState.dismissedPartIds();
        boolean z = false;
        for (Conversation conversation : overlayState.conversations()) {
            Part lastPart = conversation.getLastPart();
            if (lastPart != Part.NULL && !dismissedPartIds.contains(lastPart.getId())) {
                z = z || neverPlayedAudioFor(conversation, lastPart);
                this.playedPartIdsForConversations.put(conversation.getId(), lastPart.getId());
            }
        }
        if (z) {
            this.soundPlayer.playMessageReceivedSound();
        }
    }
}
