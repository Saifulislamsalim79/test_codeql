package com.google.firebase.database.tubesock;

import com.google.firebase.database.tubesock.C5902a;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
/* compiled from: WebSocketReceiver.java */
/* renamed from: com.google.firebase.database.tubesock.g */
/* loaded from: classes2.dex */
class C5917g {

    /* renamed from: b */
    private C5909c f14530b;

    /* renamed from: e */
    private C5902a.InterfaceC5904b f14533e;

    /* renamed from: a */
    private DataInputStream f14529a = null;

    /* renamed from: c */
    private InterfaceC5914d f14531c = null;

    /* renamed from: d */
    private byte[] f14532d = new byte[112];

    /* renamed from: f */
    private volatile boolean f14534f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5917g(C5909c c5909c) {
        this.f14530b = null;
        this.f14530b = c5909c;
    }

    /* renamed from: a */
    private void m23319a(boolean z, byte b, byte[] bArr) {
        if (b == 9) {
            if (z) {
                m23317c(bArr);
                return;
            }
            throw new WebSocketException("PING must not fragment across frames");
        } else if (this.f14533e != null && b != 0) {
            throw new WebSocketException("Failed to continue outstanding frame");
        } else {
            if (this.f14533e == null && b == 0) {
                throw new WebSocketException("Received continuing frame, but there's nothing to continue");
            }
            if (this.f14533e == null) {
                this.f14533e = C5902a.m23355a(b);
            }
            if (!this.f14533e.mo23354a(bArr)) {
                throw new WebSocketException("Failed to decode frame");
            }
            if (z) {
                C5916f mo23353b = this.f14533e.mo23353b();
                this.f14533e = null;
                if (mo23353b != null) {
                    this.f14531c.mo23328c(mo23353b);
                    return;
                }
                throw new WebSocketException("Failed to decode whole message");
            }
        }
    }

    /* renamed from: b */
    private void m23318b(WebSocketException webSocketException) {
        m23312h();
        this.f14530b.m23339k(webSocketException);
    }

    /* renamed from: c */
    private void m23317c(byte[] bArr) {
        if (bArr.length <= 125) {
            this.f14530b.m23337m(bArr);
            return;
        }
        throw new WebSocketException("PING frame too long");
    }

    /* renamed from: d */
    private long m23316d(byte[] bArr, int i) {
        return (bArr[i + 0] << 56) + ((bArr[i + 1] & 255) << 48) + ((bArr[i + 2] & 255) << 40) + ((bArr[i + 3] & 255) << 32) + ((bArr[i + 4] & 255) << 24) + ((bArr[i + 5] & 255) << 16) + ((bArr[i + 6] & 255) << 8) + ((bArr[i + 7] & 255) << 0);
    }

    /* renamed from: e */
    private int m23315e(byte[] bArr, int i, int i2) throws IOException {
        this.f14529a.readFully(bArr, i, i2);
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m23314f() {
        boolean z;
        this.f14531c = this.f14530b.m23343g();
        while (!this.f14534f) {
            try {
                m23315e(this.f14532d, 0, 1);
                z = (this.f14532d[0] & 128) != 0;
            } catch (WebSocketException e) {
                m23318b(e);
            } catch (SocketTimeoutException unused) {
            } catch (IOException e2) {
                m23318b(new WebSocketException("IO Error", e2));
            }
            if (!((this.f14532d[0] & 112) != 0)) {
                byte b = (byte) (this.f14532d[0] & 15);
                m23315e(this.f14532d, 1, 1);
                byte b2 = this.f14532d[1];
                long j = 0;
                if (b2 < 126) {
                    j = b2;
                } else if (b2 == 126) {
                    m23315e(this.f14532d, 2, 2);
                    j = ((this.f14532d[2] & 255) << 8) | (this.f14532d[3] & 255);
                } else if (b2 == Byte.MAX_VALUE) {
                    m23315e(this.f14532d, 2, 8);
                    j = m23316d(this.f14532d, 2);
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                m23315e(bArr, 0, i);
                if (b == 8) {
                    this.f14530b.m23338l();
                } else if (b != 10) {
                    if (b != 1 && b != 2 && b != 9 && b != 0) {
                        throw new WebSocketException("Unsupported opcode: " + ((int) b));
                    }
                    m23319a(z, b, bArr);
                }
            } else {
                throw new WebSocketException("Invalid frame received");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m23313g(DataInputStream dataInputStream) {
        this.f14529a = dataInputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m23312h() {
        this.f14534f = true;
    }
}
