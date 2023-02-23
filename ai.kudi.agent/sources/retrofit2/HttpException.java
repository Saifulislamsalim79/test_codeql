package retrofit2;
/* loaded from: classes3.dex */
public class HttpException extends RuntimeException {

    /* renamed from: c */
    private final int f33048c;

    /* renamed from: d */
    private final String f33049d;

    /* renamed from: e */
    private final transient C14840l<?> f33050e;

    public HttpException(C14840l<?> c14840l) {
        super(m351b(c14840l));
        this.f33048c = c14840l.m283b();
        this.f33049d = c14840l.m279f();
        this.f33050e = c14840l;
    }

    /* renamed from: b */
    private static String m351b(C14840l<?> c14840l) {
        C14846o.m239b(c14840l, "response == null");
        return "HTTP " + c14840l.m283b() + " " + c14840l.m279f();
    }

    /* renamed from: a */
    public int m352a() {
        return this.f33048c;
    }

    /* renamed from: c */
    public String m350c() {
        return this.f33049d;
    }

    /* renamed from: d */
    public C14840l<?> m349d() {
        return this.f33050e;
    }
}
