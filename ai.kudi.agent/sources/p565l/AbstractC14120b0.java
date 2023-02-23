package p565l;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import p565l.p566g0.C14148c;
import p576m.C14347f;
import p576m.C14353l;
import p576m.InterfaceC14345d;
import p576m.InterfaceC14365s;
/* compiled from: RequestBody.java */
/* renamed from: l.b0 */
/* loaded from: classes3.dex */
public abstract class AbstractC14120b0 {

    /* compiled from: RequestBody.java */
    /* renamed from: l.b0$a */
    /* loaded from: classes3.dex */
    class C14121a extends AbstractC14120b0 {

        /* renamed from: a */
        final /* synthetic */ C14235v f30790a;

        /* renamed from: b */
        final /* synthetic */ C14347f f30791b;

        C14121a(C14235v c14235v, C14347f c14347f) {
            this.f30790a = c14235v;
            this.f30791b = c14347f;
        }

        @Override // p565l.AbstractC14120b0
        public long contentLength() throws IOException {
            return this.f30791b.mo1969A();
        }

        @Override // p565l.AbstractC14120b0
        public C14235v contentType() {
            return this.f30790a;
        }

        @Override // p565l.AbstractC14120b0
        public void writeTo(InterfaceC14345d interfaceC14345d) throws IOException {
            interfaceC14345d.mo2009I0(this.f30791b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestBody.java */
    /* renamed from: l.b0$b */
    /* loaded from: classes3.dex */
    public class C14122b extends AbstractC14120b0 {

        /* renamed from: a */
        final /* synthetic */ C14235v f30792a;

        /* renamed from: b */
        final /* synthetic */ int f30793b;

        /* renamed from: c */
        final /* synthetic */ byte[] f30794c;

        /* renamed from: d */
        final /* synthetic */ int f30795d;

        C14122b(C14235v c14235v, int i, byte[] bArr, int i2) {
            this.f30792a = c14235v;
            this.f30793b = i;
            this.f30794c = bArr;
            this.f30795d = i2;
        }

        @Override // p565l.AbstractC14120b0
        public long contentLength() {
            return this.f30793b;
        }

        @Override // p565l.AbstractC14120b0
        public C14235v contentType() {
            return this.f30792a;
        }

        @Override // p565l.AbstractC14120b0
        public void writeTo(InterfaceC14345d interfaceC14345d) throws IOException {
            interfaceC14345d.mo2008b(this.f30794c, this.f30795d, this.f30793b);
        }
    }

    /* compiled from: RequestBody.java */
    /* renamed from: l.b0$c */
    /* loaded from: classes3.dex */
    class C14123c extends AbstractC14120b0 {

        /* renamed from: a */
        final /* synthetic */ C14235v f30796a;

        /* renamed from: b */
        final /* synthetic */ File f30797b;

        C14123c(C14235v c14235v, File file) {
            this.f30796a = c14235v;
            this.f30797b = file;
        }

        @Override // p565l.AbstractC14120b0
        public long contentLength() {
            return this.f30797b.length();
        }

        @Override // p565l.AbstractC14120b0
        public C14235v contentType() {
            return this.f30796a;
        }

        @Override // p565l.AbstractC14120b0
        public void writeTo(InterfaceC14345d interfaceC14345d) throws IOException {
            InterfaceC14365s interfaceC14365s = null;
            try {
                interfaceC14365s = C14353l.m2015j(this.f30797b);
                interfaceC14345d.mo2002s0(interfaceC14365s);
            } finally {
                C14148c.m2801g(interfaceC14365s);
            }
        }
    }

    public static AbstractC14120b0 create(C14235v c14235v, String str) {
        Charset charset = C14148c.f30913i;
        if (c14235v != null && (charset = c14235v.m2477a()) == null) {
            charset = C14148c.f30913i;
            c14235v = C14235v.m2474d(c14235v + "; charset=utf-8");
        }
        return create(c14235v, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract C14235v contentType();

    public abstract void writeTo(InterfaceC14345d interfaceC14345d) throws IOException;

    public static AbstractC14120b0 create(C14235v c14235v, C14347f c14347f) {
        return new C14121a(c14235v, c14347f);
    }

    public static AbstractC14120b0 create(C14235v c14235v, byte[] bArr) {
        return create(c14235v, bArr, 0, bArr.length);
    }

    public static AbstractC14120b0 create(C14235v c14235v, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C14148c.m2802f(bArr.length, i, i2);
            return new C14122b(c14235v, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    public static AbstractC14120b0 create(C14235v c14235v, File file) {
        if (file != null) {
            return new C14123c(c14235v, file);
        }
        throw new NullPointerException("file == null");
    }
}
