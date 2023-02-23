package io.intercom.okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import p425j.p429b.p433b.InterfaceC11151e;
/* loaded from: classes3.dex */
public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() { // from class: io.intercom.okhttp3.internal.http2.PushObserver.1
        @Override // io.intercom.okhttp3.internal.http2.PushObserver
        public boolean onData(int i, InterfaceC11151e interfaceC11151e, int i2, boolean z) throws IOException {
            interfaceC11151e.mo11499a(i2);
            return true;
        }

        @Override // io.intercom.okhttp3.internal.http2.PushObserver
        public boolean onHeaders(int i, List<Header> list, boolean z) {
            return true;
        }

        @Override // io.intercom.okhttp3.internal.http2.PushObserver
        public boolean onRequest(int i, List<Header> list) {
            return true;
        }

        @Override // io.intercom.okhttp3.internal.http2.PushObserver
        public void onReset(int i, ErrorCode errorCode) {
        }
    };

    boolean onData(int i, InterfaceC11151e interfaceC11151e, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
