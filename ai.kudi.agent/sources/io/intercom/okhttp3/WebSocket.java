package io.intercom.okhttp3;

import p425j.p429b.p433b.C11152f;
/* loaded from: classes3.dex */
public interface WebSocket {

    /* loaded from: classes3.dex */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(C11152f c11152f);

    boolean send(String str);
}
