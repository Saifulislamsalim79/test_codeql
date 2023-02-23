package p565l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p565l.p566g0.C14148c;
import p576m.C14342c;
import p576m.InterfaceC14346e;
/* compiled from: ResponseBody.java */
/* renamed from: l.d0 */
/* loaded from: classes3.dex */
public abstract class AbstractC14135d0 implements Closeable {

    /* renamed from: c */
    private Reader f30877c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResponseBody.java */
    /* renamed from: l.d0$a */
    /* loaded from: classes3.dex */
    public class C14136a extends AbstractC14135d0 {

        /* renamed from: d */
        final /* synthetic */ C14235v f30878d;

        /* renamed from: e */
        final /* synthetic */ long f30879e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC14346e f30880f;

        C14136a(C14235v c14235v, long j, InterfaceC14346e interfaceC14346e) {
            this.f30878d = c14235v;
            this.f30879e = j;
            this.f30880f = interfaceC14346e;
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: F */
        public C14235v mo311F() {
            return this.f30878d;
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: O */
        public InterfaceC14346e mo310O() {
            return this.f30880f;
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: m */
        public long mo309m() {
            return this.f30879e;
        }
    }

    /* compiled from: ResponseBody.java */
    /* renamed from: l.d0$b */
    /* loaded from: classes3.dex */
    static final class C14137b extends Reader {

        /* renamed from: c */
        private final InterfaceC14346e f30881c;

        /* renamed from: d */
        private final Charset f30882d;

        /* renamed from: e */
        private boolean f30883e;

        /* renamed from: f */
        private Reader f30884f;

        C14137b(InterfaceC14346e interfaceC14346e, Charset charset) {
            this.f30881c = interfaceC14346e;
            this.f30882d = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f30883e = true;
            Reader reader = this.f30884f;
            if (reader != null) {
                reader.close();
            } else {
                this.f30881c.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.f30883e) {
                Reader reader = this.f30884f;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.f30881c.mo1997D(), C14148c.m2805c(this.f30881c, this.f30882d));
                    this.f30884f = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: I */
    public static AbstractC14135d0 m2837I(C14235v c14235v, long j, InterfaceC14346e interfaceC14346e) {
        if (interfaceC14346e != null) {
            return new C14136a(c14235v, j, interfaceC14346e);
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: J */
    public static AbstractC14135d0 m2836J(C14235v c14235v, byte[] bArr) {
        C14342c c14342c = new C14342c();
        c14342c.m2064U0(bArr);
        return m2837I(c14235v, bArr.length, c14342c);
    }

    /* renamed from: g */
    private Charset m2833g() {
        C14235v mo311F = mo311F();
        return mo311F != null ? mo311F.m2476b(C14148c.f30913i) : C14148c.f30913i;
    }

    /* renamed from: F */
    public abstract C14235v mo311F();

    /* renamed from: O */
    public abstract InterfaceC14346e mo310O();

    /* renamed from: P */
    public final String m2835P() throws IOException {
        InterfaceC14346e mo310O = mo310O();
        try {
            return mo310O.mo1983s(C14148c.m2805c(mo310O, m2833g()));
        } finally {
            C14148c.m2801g(mo310O);
        }
    }

    /* renamed from: c */
    public final Reader m2834c() {
        Reader reader = this.f30877c;
        if (reader != null) {
            return reader;
        }
        C14137b c14137b = new C14137b(mo310O(), m2833g());
        this.f30877c = c14137b;
        return c14137b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C14148c.m2801g(mo310O());
    }

    /* renamed from: m */
    public abstract long mo309m();
}
