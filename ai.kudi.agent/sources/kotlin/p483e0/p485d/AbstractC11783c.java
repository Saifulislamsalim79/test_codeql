package kotlin.p483e0.p485d;

import java.io.Serializable;
import kotlin.p483e0.C11755b;
import kotlin.p493j0.InterfaceC11862a;
import kotlin.p493j0.InterfaceC11865d;
/* compiled from: CallableReference.java */
/* renamed from: kotlin.e0.d.c */
/* loaded from: classes3.dex */
public abstract class AbstractC11783c implements InterfaceC11862a, Serializable {

    /* renamed from: y */
    public static final Object f26476y = C11784a.f26483c;

    /* renamed from: c */
    private transient InterfaceC11862a f26477c;

    /* renamed from: d */
    protected final Object f26478d;

    /* renamed from: e */
    private final Class f26479e;

    /* renamed from: f */
    private final String f26480f;

    /* renamed from: w */
    private final String f26481w;

    /* renamed from: x */
    private final boolean f26482x;

    /* compiled from: CallableReference.java */
    /* renamed from: kotlin.e0.d.c$a */
    /* loaded from: classes3.dex */
    private static class C11784a implements Serializable {

        /* renamed from: c */
        private static final C11784a f26483c = new C11784a();

        private C11784a() {
        }
    }

    public AbstractC11783c() {
        this(f26476y);
    }

    @Override // kotlin.p493j0.InterfaceC11862a
    /* renamed from: a */
    public Object mo10180a(Object... objArr) {
        return mo10319h().mo10180a(objArr);
    }

    @Override // kotlin.p493j0.InterfaceC11862a
    /* renamed from: b */
    public String mo4699b() {
        return this.f26480f;
    }

    /* renamed from: c */
    public InterfaceC11862a m10333c() {
        InterfaceC11862a interfaceC11862a = this.f26477c;
        if (interfaceC11862a == null) {
            InterfaceC11862a mo10320e = mo10320e();
            this.f26477c = mo10320e;
            return mo10320e;
        }
        return interfaceC11862a;
    }

    /* renamed from: e */
    protected abstract InterfaceC11862a mo10320e();

    /* renamed from: f */
    public Object m10332f() {
        return this.f26478d;
    }

    /* renamed from: g */
    public InterfaceC11865d mo4698g() {
        Class cls = this.f26479e;
        if (cls == null) {
            return null;
        }
        return this.f26482x ? C11813x.m10315c(cls) : C11813x.m10316b(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public InterfaceC11862a mo10319h() {
        InterfaceC11862a m10333c = m10333c();
        if (m10333c != this) {
            return m10333c;
        }
        throw new C11755b();
    }

    /* renamed from: i */
    public String mo4697i() {
        return this.f26481w;
    }

    protected AbstractC11783c(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11783c(Object obj, Class cls, String str, String str2, boolean z) {
        this.f26478d = obj;
        this.f26479e = cls;
        this.f26480f = str;
        this.f26481w = str2;
        this.f26482x = z;
    }
}
