package retrofit2.p605p.p606a;

import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.stream.C6914c;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import p565l.AbstractC14120b0;
import p565l.C14235v;
import p576m.C14342c;
import retrofit2.InterfaceC14805e;
/* compiled from: GsonRequestBodyConverter.java */
/* renamed from: retrofit2.p.a.b */
/* loaded from: classes3.dex */
final class C14851b<T> implements InterfaceC14805e<T, AbstractC14120b0> {

    /* renamed from: c */
    private static final C14235v f33210c = C14235v.m2474d("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f33211d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C6784f f33212a;

    /* renamed from: b */
    private final AbstractC6909s<T> f33213b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14851b(C6784f c6784f, AbstractC6909s<T> abstractC6909s) {
        this.f33212a = c6784f;
        this.f33213b = abstractC6909s;
    }

    @Override // retrofit2.InterfaceC14805e
    /* renamed from: a */
    public AbstractC14120b0 convert(T t) throws IOException {
        C14342c c14342c = new C14342c();
        C6914c m20753s = this.f33212a.m20753s(new OutputStreamWriter(c14342c.m2060b0(), f33211d));
        this.f33213b.mo20527d(m20753s, t);
        m20753s.close();
        return AbstractC14120b0.create(f33210c, c14342c.m2046o0());
    }
}
