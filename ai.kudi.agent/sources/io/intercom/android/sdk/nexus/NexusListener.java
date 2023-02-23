package io.intercom.android.sdk.nexus;
/* loaded from: classes3.dex */
public interface NexusListener {
    void notifyEvent(NexusEvent nexusEvent);

    void onConnect();

    void onConnectFailed();

    void onShutdown();
}
