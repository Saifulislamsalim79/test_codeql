package io.intercom.android.sdk;

import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.conversation.events.AdminIsTypingEvent;
import io.intercom.android.sdk.models.events.realtime.UserContentSeenByAdminEvent;
import io.intercom.android.sdk.nexus.NexusClient;
import io.intercom.android.sdk.nexus.NexusConfig;
import io.intercom.android.sdk.nexus.NexusEvent;
import io.intercom.android.sdk.nexus.NexusEventType;
import io.intercom.android.sdk.nexus.NexusListener;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.okhttp3.OkHttpClient;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class NexusWrapper extends NexusClient implements NexusListener {
    private static final String ADMIN_AVATAR = "adminAvatar";
    private static final String ADMIN_ID = "adminId";
    private static final String ADMIN_NAME = "adminName";
    private static final String CONVERSATION_ID = "conversationId";
    private ScheduledFuture actionFuture;
    private final C11129b bus;
    private final long debouncePeriodMs;
    private final ScheduledExecutorService executor;
    private final Store<State> store;
    private final Twig twig;

    /* renamed from: io.intercom.android.sdk.NexusWrapper$3 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C101093 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$nexus$NexusEventType;

        static {
            int[] iArr = new int[NexusEventType.values().length];
            $SwitchMap$io$intercom$android$nexus$NexusEventType = iArr;
            try {
                iArr[NexusEventType.AdminIsTyping.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$nexus$NexusEventType[NexusEventType.NewComment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$nexus$NexusEventType[NexusEventType.UserContentSeenByAdmin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$nexus$NexusEventType[NexusEventType.ConversationSeen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NexusWrapper(Twig twig, OkHttpClient okHttpClient, C11129b c11129b, Store<State> store, long j) {
        super(twig, okHttpClient);
        this.executor = Executors.newSingleThreadScheduledExecutor();
        this.twig = twig;
        this.bus = c11129b;
        this.store = store;
        this.debouncePeriodMs = j;
    }

    private void logKnownEvent(NexusEvent nexusEvent) {
        Twig twig = this.twig;
        twig.internal("Nexus", "Received " + nexusEvent.getEventType() + " event");
    }

    private void removeCallbacks() {
        ScheduledFuture scheduledFuture = this.actionFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // io.intercom.android.sdk.nexus.NexusClient
    public void connect(final NexusConfig nexusConfig, final boolean z) {
        if (nexusConfig.getEndpoints().isEmpty()) {
            this.twig.m13059w("No realtime endpoints present so we can't connect", new Object[0]);
            return;
        }
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new Runnable() { // from class: io.intercom.android.sdk.NexusWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                NexusWrapper.this.connectNow(nexusConfig, z);
            }
        }, this.debouncePeriodMs, TimeUnit.MILLISECONDS);
    }

    void connectNow(NexusConfig nexusConfig, boolean z) {
        if (isConnected()) {
            return;
        }
        super.connect(nexusConfig, z);
        setTopics(Collections.singletonList("*"));
        addEventListener(this);
    }

    @Override // io.intercom.android.sdk.nexus.NexusClient
    public void disconnect() {
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new Runnable() { // from class: io.intercom.android.sdk.NexusWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                NexusWrapper.this.disconnectNow();
            }
        }, this.debouncePeriodMs, TimeUnit.MILLISECONDS);
    }

    void disconnectNow() {
        removeEventListener(this);
        super.disconnect();
    }

    @Override // io.intercom.android.sdk.nexus.NexusListener
    public void notifyEvent(NexusEvent nexusEvent) {
        String optString = nexusEvent.getEventData().optString(CONVERSATION_ID);
        int i = C101093.$SwitchMap$io$intercom$android$nexus$NexusEventType[nexusEvent.getEventType().ordinal()];
        if (i == 1) {
            logKnownEvent(nexusEvent);
            this.bus.post(new AdminIsTypingEvent(nexusEvent.getEventData().optString(ADMIN_ID), optString, nexusEvent.getEventData().optString(ADMIN_NAME), nexusEvent.getEventData().optString(ADMIN_AVATAR)));
        } else if (i == 2) {
            logKnownEvent(nexusEvent);
            this.store.dispatch(Actions.newCommentEventReceived(optString));
        } else if (i == 3) {
            logKnownEvent(nexusEvent);
            this.bus.post(new UserContentSeenByAdminEvent(optString));
        } else if (i != 4) {
            Twig twig = this.twig;
            twig.internal("Nexus", "Unexpected event: " + nexusEvent.getEventType());
        } else {
            logKnownEvent(nexusEvent);
            this.store.dispatch(Actions.conversationMarkedAsRead(optString));
        }
    }

    @Override // io.intercom.android.sdk.nexus.NexusListener
    public void onConnect() {
    }

    @Override // io.intercom.android.sdk.nexus.NexusListener
    public void onConnectFailed() {
    }

    @Override // io.intercom.android.sdk.nexus.NexusListener
    public void onShutdown() {
    }
}
