package io.intercom.android.sdk.nexus;

import io.intercom.android.sdk.twig.Twig;
import io.intercom.okhttp3.OkHttpClient;
import io.intercom.okhttp3.Request;
import io.intercom.okhttp3.Response;
import io.intercom.okhttp3.WebSocket;
import io.intercom.okhttp3.WebSocketListener;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p425j.p429b.p433b.C11152f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class NexusSocket {
    private static final WebSocket CLOSED_SOCKET = new WebSocket() { // from class: io.intercom.android.sdk.nexus.NexusSocket.4
        @Override // io.intercom.okhttp3.WebSocket
        public void cancel() {
        }

        @Override // io.intercom.okhttp3.WebSocket
        public boolean close(int i, String str) {
            return false;
        }

        @Override // io.intercom.okhttp3.WebSocket
        public long queueSize() {
            return 0L;
        }

        @Override // io.intercom.okhttp3.WebSocket
        public Request request() {
            throw new NullPointerException("ClosedSocket has no request");
        }

        @Override // io.intercom.okhttp3.WebSocket
        public boolean send(C11152f c11152f) {
            return false;
        }

        @Override // io.intercom.okhttp3.WebSocket
        public boolean send(String str) {
            return false;
        }
    };
    private static final String HEADER = "?X-Nexus-Version=android.5.3.0";
    private static final int MAX_RECONNECT_TIME_SECONDS = 900;
    private static final int N_TIMEOUT_DISCONNECT = 4001;
    private static final int OK_CLIENT_DISCONNECT = 4000;

    /* renamed from: client  reason: collision with root package name */
    private final OkHttpClient f33384client;
    private final long connectionTimeoutSeconds;
    private final NexusListener listener;
    private ScheduledFuture reconnectFuture;
    private final boolean shouldSendPresence;
    private final ScheduledExecutorService timeoutExecutor;
    private ScheduledFuture timeoutFuture;
    private final NexusTopicProvider topicProvider;
    private final Twig twig;
    private final String url;
    private WebSocket socket = CLOSED_SOCKET;
    private final Runnable timeoutRunnable = new Runnable() { // from class: io.intercom.android.sdk.nexus.NexusSocket.1
        @Override // java.lang.Runnable
        public void run() {
            NexusSocket.this.timedOut();
        }
    };
    private long lastReconnectAt = 0;
    private int reconnectAttempts = 0;
    private final WebSocketListener webSocketListener = new WebSocketListener() { // from class: io.intercom.android.sdk.nexus.NexusSocket.3
        private void parseJsonString(String str) {
            if (str.isEmpty() || str.equals(" ") || str.endsWith("|")) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("eventName");
                if (!optString.isEmpty() && !optString.equals("ACK")) {
                    Twig twig = NexusSocket.this.twig;
                    twig.internal("onMessage TEXT: " + str);
                    NexusSocket.this.listener.notifyEvent(new NexusEvent(jSONObject));
                }
                Twig twig2 = NexusSocket.this.twig;
                twig2.internal("onMessage ACK: " + str);
            } catch (JSONException e) {
                Twig twig3 = NexusSocket.this.twig;
                twig3.internal("onMessage: json parse exception for message: '" + str + " " + e);
            }
        }

        @Override // io.intercom.okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i, String str) {
            if (i != NexusSocket.OK_CLIENT_DISCONNECT) {
                NexusSocket.this.scheduleReconnect();
            } else {
                NexusSocket.this.shutdown();
            }
            Twig twig = NexusSocket.this.twig;
            twig.internal("onClose code: " + i + " reason: " + str);
        }

        @Override // io.intercom.okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i, String str) {
            Twig twig = NexusSocket.this.twig;
            twig.internal("Server requested close:  " + i + " - '" + str + "'");
            webSocket.close(i, str);
        }

        @Override // io.intercom.okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            if (NexusSocket.shouldReconnectFromFailure(response)) {
                NexusSocket.this.scheduleReconnect();
            } else {
                NexusSocket.this.shutdown();
            }
            Twig twig = NexusSocket.this.twig;
            twig.internal("onFailure: " + th.getMessage());
            NexusSocket.this.listener.onConnectFailed();
        }

        @Override // io.intercom.okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            NexusSocket.this.resetTimeout();
            parseJsonString(str);
        }

        @Override // io.intercom.okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            Twig twig = NexusSocket.this.twig;
            twig.internal("onOpen: " + response.message());
            NexusSocket.this.socket = webSocket;
            NexusSocket.this.resetTimeout();
            List<String> topics = NexusSocket.this.topicProvider.getTopics();
            if (!topics.isEmpty()) {
                NexusSocket.this.fire(NexusEvent.getSubscribeEvent(topics).toStringEncodedJsonObject());
            }
            if (NexusSocket.this.shouldSendPresence) {
                NexusSocket.this.fire(NexusEvent.getUserPresenceEvent().toStringEncodedJsonObject());
            }
            NexusSocket.this.listener.onConnect();
        }

        @Override // io.intercom.okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, C11152f c11152f) {
            Twig twig = NexusSocket.this.twig;
            twig.internal("Received bytes message " + c11152f + ", resetting timeout");
            NexusSocket.this.resetTimeout();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public NexusSocket(String str, int i, boolean z, Twig twig, ScheduledExecutorService scheduledExecutorService, OkHttpClient okHttpClient, NexusListener nexusListener, NexusTopicProvider nexusTopicProvider) {
        this.url = str;
        this.connectionTimeoutSeconds = i;
        this.shouldSendPresence = z;
        this.twig = twig;
        this.listener = nexusListener;
        this.topicProvider = nexusTopicProvider;
        this.f33384client = okHttpClient;
        this.timeoutExecutor = scheduledExecutorService;
    }

    static long calculateReconnectTimerInSeconds(int i) {
        int min = (int) Math.min(Math.pow(2.0d, i), 900.0d);
        return min + new Random().nextInt(min + 1);
    }

    private void modifyReconnectAttempts() {
        if (System.currentTimeMillis() - this.lastReconnectAt > TimeUnit.SECONDS.toMillis(900L) * 2) {
            this.twig.m13071d("resetting reconnection attempts", new Object[0]);
            this.reconnectAttempts = 1;
        } else {
            this.twig.m13071d("incrementing reconnection attempts", new Object[0]);
            this.reconnectAttempts++;
        }
        this.lastReconnectAt = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetTimeout() {
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleReconnect() {
        if (this.reconnectFuture != null) {
            return;
        }
        modifyReconnectAttempts();
        long calculateReconnectTimerInSeconds = calculateReconnectTimerInSeconds(this.reconnectAttempts);
        Twig twig = this.twig;
        twig.internal("Scheduling reconnect in: " + calculateReconnectTimerInSeconds + " for attempt: " + this.reconnectAttempts);
        this.reconnectFuture = this.timeoutExecutor.schedule(new Runnable() { // from class: io.intercom.android.sdk.nexus.NexusSocket.2
            @Override // java.lang.Runnable
            public void run() {
                NexusSocket.this.connect();
                NexusSocket.this.reconnectFuture = null;
            }
        }, calculateReconnectTimerInSeconds, TimeUnit.SECONDS);
    }

    static boolean shouldReconnectFromFailure(Response response) {
        if (response != null) {
            int code = response.code();
            return code >= 500 && code <= 599;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdown() {
        this.socket = CLOSED_SOCKET;
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.listener.onShutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void timedOut() {
        if (this.socket == CLOSED_SOCKET) {
            scheduleReconnect();
        } else {
            disconnect(N_TIMEOUT_DISCONNECT, "Socket timed out");
        }
        this.listener.onConnectFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void connect() {
        this.twig.m13071d("connecting to a socket...", new Object[0]);
        Request.Builder builder = new Request.Builder();
        this.f33384client.newWebSocket(builder.url(this.url + HEADER).build(), this.webSocketListener);
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void disconnect() {
        disconnect(OK_CLIENT_DISCONNECT, "Disconnect called by client");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fire(String str) {
        if (str.isEmpty()) {
            return;
        }
        try {
            Twig twig = this.twig;
            twig.internal("firing: " + str);
            this.socket.send(str);
        } catch (IllegalStateException e) {
            Twig twig2 = this.twig;
            twig2.internal("Error when firing '" + str + "': " + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isConnected() {
        return this.socket != CLOSED_SOCKET;
    }

    private void disconnect(int i, String str) {
        if (this.socket.close(i, str)) {
            return;
        }
        this.twig.internal("Could not close socket while disconnecting, it may be already closed");
    }
}
