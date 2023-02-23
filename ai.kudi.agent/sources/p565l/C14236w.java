package p565l;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p565l.p566g0.C14148c;
import p576m.C14342c;
import p576m.C14347f;
import p576m.InterfaceC14345d;
/* compiled from: MultipartBody.java */
/* renamed from: l.w */
/* loaded from: classes3.dex */
public final class C14236w extends AbstractC14120b0 {

    /* renamed from: e */
    public static final C14235v f31175e = C14235v.m2475c("multipart/mixed");

    /* renamed from: f */
    public static final C14235v f31176f;

    /* renamed from: g */
    private static final byte[] f31177g;

    /* renamed from: h */
    private static final byte[] f31178h;

    /* renamed from: i */
    private static final byte[] f31179i;

    /* renamed from: a */
    private final C14347f f31180a;

    /* renamed from: b */
    private final C14235v f31181b;

    /* renamed from: c */
    private final List<C14238b> f31182c;

    /* renamed from: d */
    private long f31183d = -1;

    /* compiled from: MultipartBody.java */
    /* renamed from: l.w$a */
    /* loaded from: classes3.dex */
    public static final class C14237a {

        /* renamed from: a */
        private final C14347f f31184a;

        /* renamed from: b */
        private C14235v f31185b;

        /* renamed from: c */
        private final List<C14238b> f31186c;

        public C14237a() {
            this(UUID.randomUUID().toString());
        }

        /* renamed from: a */
        public C14237a m2470a(C14229s c14229s, AbstractC14120b0 abstractC14120b0) {
            m2469b(C14238b.m2466a(c14229s, abstractC14120b0));
            return this;
        }

        /* renamed from: b */
        public C14237a m2469b(C14238b c14238b) {
            if (c14238b != null) {
                this.f31186c.add(c14238b);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        /* renamed from: c */
        public C14236w m2468c() {
            if (!this.f31186c.isEmpty()) {
                return new C14236w(this.f31184a, this.f31185b, this.f31186c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        /* renamed from: d */
        public C14237a m2467d(C14235v c14235v) {
            if (c14235v != null) {
                if (c14235v.m2473e().equals("multipart")) {
                    this.f31185b = c14235v;
                    return this;
                }
                throw new IllegalArgumentException("multipart != " + c14235v);
            }
            throw new NullPointerException("type == null");
        }

        public C14237a(String str) {
            this.f31185b = C14236w.f31175e;
            this.f31186c = new ArrayList();
            this.f31184a = C14347f.m2035m(str);
        }
    }

    /* compiled from: MultipartBody.java */
    /* renamed from: l.w$b */
    /* loaded from: classes3.dex */
    public static final class C14238b {

        /* renamed from: a */
        final C14229s f31187a;

        /* renamed from: b */
        final AbstractC14120b0 f31188b;

        private C14238b(C14229s c14229s, AbstractC14120b0 abstractC14120b0) {
            this.f31187a = c14229s;
            this.f31188b = abstractC14120b0;
        }

        /* renamed from: a */
        public static C14238b m2466a(C14229s c14229s, AbstractC14120b0 abstractC14120b0) {
            if (abstractC14120b0 != null) {
                if (c14229s != null && c14229s.m2550c("Content-Type") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if (c14229s != null && c14229s.m2550c("Content-Length") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                return new C14238b(c14229s, abstractC14120b0);
            }
            throw new NullPointerException("body == null");
        }

        /* renamed from: b */
        public static C14238b m2465b(String str, String str2, AbstractC14120b0 abstractC14120b0) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                C14236w.m2472a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    C14236w.m2472a(sb, str2);
                }
                return m2466a(C14229s.m2546g("Content-Disposition", sb.toString()), abstractC14120b0);
            }
            throw new NullPointerException("name == null");
        }
    }

    static {
        C14235v.m2475c("multipart/alternative");
        C14235v.m2475c("multipart/digest");
        C14235v.m2475c("multipart/parallel");
        f31176f = C14235v.m2475c("multipart/form-data");
        f31177g = new byte[]{58, 32};
        f31178h = new byte[]{PrinterCommands.KING, 10};
        f31179i = new byte[]{45, 45};
    }

    C14236w(C14347f c14347f, C14235v c14235v, List<C14238b> list) {
        this.f31180a = c14347f;
        this.f31181b = C14235v.m2475c(c14235v + "; boundary=" + c14347f.mo1965M());
        this.f31182c = C14148c.m2788t(list);
    }

    /* renamed from: a */
    static StringBuilder m2472a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private long m2471b(InterfaceC14345d interfaceC14345d, boolean z) throws IOException {
        C14342c c14342c;
        if (z) {
            interfaceC14345d = new C14342c();
            c14342c = interfaceC14345d;
        } else {
            c14342c = 0;
        }
        int size = this.f31182c.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C14238b c14238b = this.f31182c.get(i);
            C14229s c14229s = c14238b.f31187a;
            AbstractC14120b0 abstractC14120b0 = c14238b.f31188b;
            interfaceC14345d.mo2000x(f31179i);
            interfaceC14345d.mo2009I0(this.f31180a);
            interfaceC14345d.mo2000x(f31178h);
            if (c14229s != null) {
                int m2545h = c14229s.m2545h();
                for (int i2 = 0; i2 < m2545h; i2++) {
                    interfaceC14345d.mo2003r(c14229s.m2548e(i2)).mo2000x(f31177g).mo2003r(c14229s.m2544i(i2)).mo2000x(f31178h);
                }
            }
            C14235v contentType = abstractC14120b0.contentType();
            if (contentType != null) {
                interfaceC14345d.mo2003r("Content-Type: ").mo2003r(contentType.toString()).mo2000x(f31178h);
            }
            long contentLength = abstractC14120b0.contentLength();
            if (contentLength != -1) {
                interfaceC14345d.mo2003r("Content-Length: ").mo2010A(contentLength).mo2000x(f31178h);
            } else if (z) {
                c14342c.m2058c();
                return -1L;
            }
            interfaceC14345d.mo2000x(f31178h);
            if (z) {
                j += contentLength;
            } else {
                abstractC14120b0.writeTo(interfaceC14345d);
            }
            interfaceC14345d.mo2000x(f31178h);
        }
        interfaceC14345d.mo2000x(f31179i);
        interfaceC14345d.mo2009I0(this.f31180a);
        interfaceC14345d.mo2000x(f31179i);
        interfaceC14345d.mo2000x(f31178h);
        if (z) {
            long m2072F0 = j + c14342c.m2072F0();
            c14342c.m2058c();
            return m2072F0;
        }
        return j;
    }

    @Override // p565l.AbstractC14120b0
    public long contentLength() throws IOException {
        long j = this.f31183d;
        if (j != -1) {
            return j;
        }
        long m2471b = m2471b(null, true);
        this.f31183d = m2471b;
        return m2471b;
    }

    @Override // p565l.AbstractC14120b0
    public C14235v contentType() {
        return this.f31181b;
    }

    @Override // p565l.AbstractC14120b0
    public void writeTo(InterfaceC14345d interfaceC14345d) throws IOException {
        m2471b(interfaceC14345d, false);
    }
}
