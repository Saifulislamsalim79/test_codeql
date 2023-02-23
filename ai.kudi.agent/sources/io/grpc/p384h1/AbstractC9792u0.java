package io.grpc.p384h1;

import com.google.common.base.C5034d;
import com.google.common.base.C5051n;
import io.grpc.C10049s0;
import io.grpc.C9497c1;
import io.grpc.C9897i0;
import io.grpc.C9987k0;
import io.grpc.p384h1.AbstractC9527a;
import io.intercom.okhttp3.internal.http2.Header;
import java.nio.charset.Charset;
/* compiled from: Http2ClientStreamTransportState.java */
/* renamed from: io.grpc.h1.u0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9792u0 extends AbstractC9527a.AbstractC9530c {

    /* renamed from: v */
    private static final C9897i0.InterfaceC9898a<Integer> f22999v;

    /* renamed from: w */
    private static final C10049s0.AbstractC10055f<Integer> f23000w;

    /* renamed from: r */
    private C9497c1 f23001r;

    /* renamed from: s */
    private C10049s0 f23002s;

    /* renamed from: t */
    private Charset f23003t;

    /* renamed from: u */
    private boolean f23004u;

    /* compiled from: Http2ClientStreamTransportState.java */
    /* renamed from: io.grpc.h1.u0$a */
    /* loaded from: classes2.dex */
    class C9793a implements C9897i0.InterfaceC9898a<Integer> {
        C9793a() {
        }

        @Override // io.grpc.C10049s0.InterfaceC10058i
        /* renamed from: a */
        public /* bridge */ /* synthetic */ byte[] mo13173a(Object obj) {
            m13966d((Integer) obj);
            throw null;
        }

        @Override // io.grpc.C10049s0.InterfaceC10058i
        /* renamed from: c */
        public Integer mo13172b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, C9897i0.f23241a));
        }

        /* renamed from: d */
        public byte[] m13966d(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        C9793a c9793a = new C9793a();
        f22999v = c9793a;
        f23000w = C9897i0.m13744b(Header.RESPONSE_STATUS_UTF8, c9793a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9792u0(int i, C9676i2 c9676i2, C9730o2 c9730o2) {
        super(i, c9676i2, c9730o2);
        this.f23003t = C5034d.f12686b;
    }

    /* renamed from: O */
    private static Charset m13974O(C10049s0 c10049s0) {
        String str = (String) c10049s0.m13211f(C9755r0.f22907g);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return C5034d.f12686b;
    }

    /* renamed from: Q */
    private C9497c1 m13973Q(C10049s0 c10049s0) {
        C9497c1 m14578r;
        C9497c1 c9497c1 = (C9497c1) c10049s0.m13211f(C9987k0.f23702b);
        if (c9497c1 != null) {
            return c9497c1.m14578r((String) c10049s0.m13211f(C9987k0.f23701a));
        }
        if (this.f23004u) {
            return C9497c1.f22189h.m14578r("missing GRPC status in response");
        }
        Integer num = (Integer) c10049s0.m13211f(f23000w);
        if (num != null) {
            m14578r = C9755r0.m14056l(num.intValue());
        } else {
            m14578r = C9497c1.f22194m.m14578r("missing HTTP status code");
        }
        return m14578r.m14590f("missing GRPC status, inferred error from HTTP status code");
    }

    /* renamed from: R */
    private static void m13972R(C10049s0 c10049s0) {
        c10049s0.m13213d(f23000w);
        c10049s0.m13213d(C9987k0.f23702b);
        c10049s0.m13213d(C9987k0.f23701a);
    }

    /* renamed from: V */
    private C9497c1 m13968V(C10049s0 c10049s0) {
        Integer num = (Integer) c10049s0.m13211f(f23000w);
        if (num == null) {
            return C9497c1.f22194m.m14578r("Missing HTTP status code");
        }
        String str = (String) c10049s0.m13211f(C9755r0.f22907g);
        if (C9755r0.m14055m(str)) {
            return null;
        }
        C9497c1 m14056l = C9755r0.m14056l(num.intValue());
        return m14056l.m14590f("invalid content-type: " + str);
    }

    /* renamed from: P */
    protected abstract void mo13683P(C9497c1 c9497c1, boolean z, C10049s0 c10049s0);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public void m13971S(InterfaceC9802v1 interfaceC9802v1, boolean z) {
        C9497c1 c9497c1 = this.f23001r;
        if (c9497c1 != null) {
            this.f23001r = c9497c1.m14590f("DATA-----------------------------\n" + C9806w1.m13943e(interfaceC9802v1, this.f23003t));
            interfaceC9802v1.close();
            if (this.f23001r.m14581o().length() > 1000 || z) {
                mo13683P(this.f23001r, false, this.f23002s);
            }
        } else if (!this.f23004u) {
            mo13683P(C9497c1.f22194m.m14578r("headers not received before payload"), false, new C10049s0());
        } else {
            int mo13566h = interfaceC9802v1.mo13566h();
            m14515D(interfaceC9802v1);
            if (z) {
                if (mo13566h > 0) {
                    this.f23001r = C9497c1.f22194m.m14578r("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f23001r = C9497c1.f22194m.m14578r("Received unexpected EOS on empty DATA frame from server");
                }
                C10049s0 c10049s0 = new C10049s0();
                this.f23002s = c10049s0;
                m14505N(this.f23001r, false, c10049s0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Finally extract failed */
    /* renamed from: T */
    public void m13970T(C10049s0 c10049s0) {
        C5051n.m25779o(c10049s0, "headers");
        C9497c1 c9497c1 = this.f23001r;
        if (c9497c1 != null) {
            this.f23001r = c9497c1.m14590f("headers: " + c10049s0);
            return;
        }
        try {
            if (this.f23004u) {
                C9497c1 m14578r = C9497c1.f22194m.m14578r("Received headers twice");
                this.f23001r = m14578r;
                if (m14578r != null) {
                    this.f23001r = m14578r.m14590f("headers: " + c10049s0);
                    this.f23002s = c10049s0;
                    this.f23003t = m13974O(c10049s0);
                    return;
                }
                return;
            }
            Integer num = (Integer) c10049s0.m13211f(f23000w);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                C9497c1 c9497c12 = this.f23001r;
                if (c9497c12 != null) {
                    this.f23001r = c9497c12.m14590f("headers: " + c10049s0);
                    this.f23002s = c10049s0;
                    this.f23003t = m13974O(c10049s0);
                    return;
                }
                return;
            }
            this.f23004u = true;
            C9497c1 m13968V = m13968V(c10049s0);
            this.f23001r = m13968V;
            if (m13968V != null) {
                if (m13968V != null) {
                    this.f23001r = m13968V.m14590f("headers: " + c10049s0);
                    this.f23002s = c10049s0;
                    this.f23003t = m13974O(c10049s0);
                    return;
                }
                return;
            }
            m13972R(c10049s0);
            m14514E(c10049s0);
            C9497c1 c9497c13 = this.f23001r;
            if (c9497c13 != null) {
                this.f23001r = c9497c13.m14590f("headers: " + c10049s0);
                this.f23002s = c10049s0;
                this.f23003t = m13974O(c10049s0);
            }
        } catch (Throwable th) {
            C9497c1 c9497c14 = this.f23001r;
            if (c9497c14 != null) {
                this.f23001r = c9497c14.m14590f("headers: " + c10049s0);
                this.f23002s = c10049s0;
                this.f23003t = m13974O(c10049s0);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public void m13969U(C10049s0 c10049s0) {
        C5051n.m25779o(c10049s0, "trailers");
        if (this.f23001r == null && !this.f23004u) {
            C9497c1 m13968V = m13968V(c10049s0);
            this.f23001r = m13968V;
            if (m13968V != null) {
                this.f23002s = c10049s0;
            }
        }
        C9497c1 c9497c1 = this.f23001r;
        if (c9497c1 != null) {
            C9497c1 m14590f = c9497c1.m14590f("trailers: " + c10049s0);
            this.f23001r = m14590f;
            mo13683P(m14590f, false, this.f23002s);
            return;
        }
        C9497c1 m13973Q = m13973Q(c10049s0);
        m13972R(c10049s0);
        m14513F(c10049s0, m13973Q);
    }
}
