package io.intercom.android.sdk.middleware;

import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes3.dex */
public class MetricTrackerMiddleware implements Store.Middleware<State> {
    private final Set<Object> trackedPartIds = new HashSet();
    private final Provider<MetricTracker> trackerProvider;

    /* renamed from: io.intercom.android.sdk.middleware.MetricTrackerMiddleware$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C103141 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.UNREAD_CONVERSATIONS_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public MetricTrackerMiddleware(Provider<MetricTracker> provider) {
        this.trackerProvider = provider;
    }

    private void trackReceivedPart(Part part, String str) {
        boolean hasAttachments = part.hasAttachments();
        boolean isLinkCard = part.isLinkCard();
        String id = part.getId();
        String messageStyle = part.getMessageStyle();
        if (Part.DeliveryOption.SUMMARY != part.getDeliveryOption()) {
            tracker().receivedMessageFromFullWhenClosed(hasAttachments, isLinkCard, str, id, messageStyle);
        } else if (part.isInitialMessage()) {
            tracker().receivedMessageFromSnippetWhenClosed(hasAttachments, isLinkCard, str, id, messageStyle);
        } else {
            tracker().receivedReplyFromSnippetWhenClosed(hasAttachments, isLinkCard, str, id);
        }
    }

    private MetricTracker tracker() {
        return this.trackerProvider.get();
    }

    @Override // io.intercom.android.sdk.store.Store.Middleware
    public void dispatch(Store<State> store, Action<?> action, Store.NextDispatcher nextDispatcher) {
        if (C103141.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()] == 1) {
            for (Conversation conversation : ((UsersResponse) action.value()).getUnreadConversations().getConversations()) {
                Part lastPart = conversation.getLastPart();
                if (!this.trackedPartIds.contains(lastPart.getId())) {
                    this.trackedPartIds.add(lastPart.getId());
                    trackReceivedPart(lastPart, conversation.getId());
                }
            }
        }
        nextDispatcher.dispatch(action);
    }
}
