package io.intercom.android.sdk.nexus;

import io.intercom.android.sdk.twig.Twig;
import io.intercom.okhttp3.OkHttpClient;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class NexusClient implements NexusTopicProvider {
    private ScheduledExecutorService backgroundTaskExecutor;

    /* renamed from: client  reason: collision with root package name */
    private final OkHttpClient f33383client;
    private final NexusEventPropagator eventPropagator;
    private ScheduledFuture future;
    private long presenceInterval;
    private final List<NexusSocket> sockets;
    private final List<String> topics;
    private final Twig twig;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class NexusThreadFactory implements ThreadFactory {
        private final ThreadFactory defaultFactory;
        private int threadCount;

        private NexusThreadFactory() {
            this.defaultFactory = Executors.defaultThreadFactory();
            this.threadCount = 0;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.defaultFactory.newThread(runnable);
            this.threadCount++;
            newThread.setName("IntercomNexus-" + this.threadCount);
            return newThread;
        }
    }

    public NexusClient(Twig twig) {
        this(twig, defaultOkHttpClientBuilder().build());
    }

    public static OkHttpClient.Builder defaultOkHttpClientBuilder() {
        return new OkHttpClient.Builder().readTimeout(130L, TimeUnit.SECONDS).writeTimeout(130L, TimeUnit.SECONDS).connectTimeout(20L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void schedulePresence() {
        if (this.presenceInterval > 0) {
            this.future = this.backgroundTaskExecutor.schedule(new Runnable() { // from class: io.intercom.android.sdk.nexus.NexusClient.1
                @Override // java.lang.Runnable
                public void run() {
                    NexusClient.this.fire(NexusEvent.getUserPresenceEvent());
                    NexusClient.this.schedulePresence();
                }
            }, this.presenceInterval, TimeUnit.SECONDS);
        }
    }

    private void subscribeToTopics(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        fire(NexusEvent.getSubscribeEvent(list));
    }

    private void unSubscribeFromTopics(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        fire(NexusEvent.getUnsubscribeEvent(list));
    }

    public void addEventListener(NexusListener nexusListener) {
        this.eventPropagator.addListener(nexusListener);
    }

    public synchronized void addTopics(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(this.topics);
        subscribeToTopics(arrayList);
        this.topics.addAll(arrayList);
    }

    public synchronized void clearTopics() {
        unSubscribeFromTopics(this.topics);
        this.topics.clear();
    }

    public void connect(NexusConfig nexusConfig, boolean z) {
        if (nexusConfig.getEndpoints().isEmpty()) {
            this.twig.m13068e("No endpoints present", new Object[0]);
            return;
        }
        if (this.backgroundTaskExecutor == null) {
            this.backgroundTaskExecutor = Executors.newScheduledThreadPool(nexusConfig.getEndpoints().size() + 1, new NexusThreadFactory());
        }
        for (String str : nexusConfig.getEndpoints()) {
            this.twig.m13065i("Adding socket", new Object[0]);
            NexusSocket nexusSocket = new NexusSocket(str, nexusConfig.getConnectionTimeout(), z, this.twig, this.backgroundTaskExecutor, this.f33383client, this.eventPropagator, this);
            nexusSocket.connect();
            this.sockets.add(nexusSocket);
        }
        this.presenceInterval = nexusConfig.getPresenceHeartbeatInterval();
        if (z) {
            schedulePresence();
        }
    }

    public synchronized void disconnect() {
        if (!this.sockets.isEmpty()) {
            for (NexusSocket nexusSocket : this.sockets) {
                this.twig.m13065i("disconnecting socket", new Object[0]);
                nexusSocket.disconnect();
            }
            this.sockets.clear();
            this.twig.m13065i("client disconnected", new Object[0]);
        }
        if (this.future != null) {
            this.future.cancel(true);
        }
    }

    public synchronized void fire(NexusEvent nexusEvent) {
        this.eventPropagator.cacheEvent(nexusEvent);
        String stringEncodedJsonObject = nexusEvent.toStringEncodedJsonObject();
        if (!stringEncodedJsonObject.isEmpty()) {
            for (NexusSocket nexusSocket : this.sockets) {
                nexusSocket.fire(stringEncodedJsonObject);
            }
        }
    }

    @Override // io.intercom.android.sdk.nexus.NexusTopicProvider
    public synchronized List<String> getTopics() {
        return this.topics;
    }

    public synchronized boolean isConnected() {
        for (NexusSocket nexusSocket : this.sockets) {
            if (nexusSocket.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public synchronized void localUpdate(NexusEvent nexusEvent) {
        this.eventPropagator.notifyEvent(nexusEvent);
    }

    public void removeEventListener(NexusListener nexusListener) {
        this.eventPropagator.removeListener(nexusListener);
    }

    public synchronized void removeTopics(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (this.topics.contains(str)) {
                arrayList.add(str);
            }
        }
        unSubscribeFromTopics(arrayList);
        this.topics.removeAll(arrayList);
    }

    public synchronized void setTopics(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(this.topics);
        ArrayList arrayList2 = new ArrayList(this.topics);
        arrayList2.removeAll(list);
        subscribeToTopics(arrayList);
        unSubscribeFromTopics(arrayList2);
        this.topics.clear();
        this.topics.addAll(list);
    }

    public NexusClient(Twig twig, OkHttpClient okHttpClient) {
        this(twig, okHttpClient, new NexusEventPropagator(twig));
    }

    NexusClient(Twig twig, OkHttpClient okHttpClient, NexusEventPropagator nexusEventPropagator) {
        this.sockets = new ArrayList();
        this.topics = new ArrayList();
        this.twig = twig;
        this.eventPropagator = nexusEventPropagator;
        this.f33383client = okHttpClient;
    }
}
