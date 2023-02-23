package io.intercom.android.sdk.nexus;

import android.util.LruCache;
import io.intercom.android.sdk.twig.Twig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes3.dex */
class NexusEventPropagator implements NexusListener {
    private final LruCache<String, Boolean> cache = new LruCache<>(100);
    private final List<NexusListener> listeners = new CopyOnWriteArrayList();
    private final Twig twig;

    public NexusEventPropagator(Twig twig) {
        this.twig = twig;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addListener(NexusListener nexusListener) {
        this.listeners.add(nexusListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cacheEvent(NexusEvent nexusEvent) {
        this.cache.put(nexusEvent.getGuid(), Boolean.TRUE);
    }

    @Override // io.intercom.android.sdk.nexus.NexusListener
    public void notifyEvent(NexusEvent nexusEvent) {
        if (nexusEvent.getEventType() != NexusEventType.UNKNOWN) {
            synchronized (this.cache) {
                if (this.cache.get(nexusEvent.getGuid()) == null) {
                    this.cache.put(nexusEvent.getGuid(), Boolean.TRUE);
                    Twig twig = this.twig;
                    twig.internal("notifying listeners of event: " + nexusEvent.getEventType());
                    for (NexusListener nexusListener : this.listeners) {
                        nexusListener.notifyEvent(nexusEvent);
                    }
                } else {
                    Twig twig2 = this.twig;
                    twig2.internal("dropping event, already in cache: " + nexusEvent.toStringEncodedJsonObject());
                }
            }
        }
    }

    @Override // io.intercom.android.sdk.nexus.NexusListener
    public void onConnect() {
        this.twig.m13071d("notifying listeners that a connection opened", new Object[0]);
        for (NexusListener nexusListener : this.listeners) {
            nexusListener.onConnect();
        }
    }

    @Override // io.intercom.android.sdk.nexus.NexusListener
    public void onConnectFailed() {
        this.twig.m13071d("notifying listeners that a connection failed to open", new Object[0]);
        for (NexusListener nexusListener : this.listeners) {
            nexusListener.onConnectFailed();
        }
    }

    @Override // io.intercom.android.sdk.nexus.NexusListener
    public void onShutdown() {
        this.twig.m13071d("notifying listeners that a connection has shutdown", new Object[0]);
        for (NexusListener nexusListener : this.listeners) {
            nexusListener.onShutdown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeListener(NexusListener nexusListener) {
        this.listeners.remove(nexusListener);
    }
}
