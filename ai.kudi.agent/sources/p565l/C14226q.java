package p565l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p565l.p566g0.C14148c;
import p576m.C14342c;
import p576m.InterfaceC14345d;
/* compiled from: FormBody.java */
/* renamed from: l.q */
/* loaded from: classes3.dex */
public final class C14226q extends AbstractC14120b0 {

    /* renamed from: c */
    private static final C14235v f31140c = C14235v.m2475c("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final List<String> f31141a;

    /* renamed from: b */
    private final List<String> f31142b;

    /* compiled from: FormBody.java */
    /* renamed from: l.q$a */
    /* loaded from: classes3.dex */
    public static final class C14227a {

        /* renamed from: a */
        private final List<String> f31143a;

        /* renamed from: b */
        private final List<String> f31144b;

        /* renamed from: c */
        private final Charset f31145c;

        public C14227a() {
            this(null);
        }

        /* renamed from: a */
        public C14227a m2561a(String str, String str2) {
            if (str != null) {
                if (str2 != null) {
                    this.f31143a.add(C14231t.m2526c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f31145c));
                    this.f31144b.add(C14231t.m2526c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f31145c));
                    return this;
                }
                throw new NullPointerException("value == null");
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: b */
        public C14227a m2560b(String str, String str2) {
            if (str != null) {
                if (str2 != null) {
                    this.f31143a.add(C14231t.m2526c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f31145c));
                    this.f31144b.add(C14231t.m2526c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f31145c));
                    return this;
                }
                throw new NullPointerException("value == null");
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: c */
        public C14226q m2559c() {
            return new C14226q(this.f31143a, this.f31144b);
        }

        public C14227a(Charset charset) {
            this.f31143a = new ArrayList();
            this.f31144b = new ArrayList();
            this.f31145c = charset;
        }
    }

    C14226q(List<String> list, List<String> list2) {
        this.f31141a = C14148c.m2788t(list);
        this.f31142b = C14148c.m2788t(list2);
    }

    /* renamed from: a */
    private long m2562a(InterfaceC14345d interfaceC14345d, boolean z) {
        C14342c mo1992d;
        if (z) {
            mo1992d = new C14342c();
        } else {
            mo1992d = interfaceC14345d.mo1992d();
        }
        int size = this.f31141a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                mo1992d.m2061Z0(38);
            }
            mo1992d.m2050h1(this.f31141a.get(i));
            mo1992d.m2061Z0(61);
            mo1992d.m2050h1(this.f31142b.get(i));
        }
        if (z) {
            long m2072F0 = mo1992d.m2072F0();
            mo1992d.m2058c();
            return m2072F0;
        }
        return 0L;
    }

    @Override // p565l.AbstractC14120b0
    public long contentLength() {
        return m2562a(null, true);
    }

    @Override // p565l.AbstractC14120b0
    public C14235v contentType() {
        return f31140c;
    }

    @Override // p565l.AbstractC14120b0
    public void writeTo(InterfaceC14345d interfaceC14345d) throws IOException {
        m2562a(interfaceC14345d, false);
    }
}
