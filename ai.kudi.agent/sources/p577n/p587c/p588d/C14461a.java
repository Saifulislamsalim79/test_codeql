package p577n.p587c.p588d;
/* compiled from: FormattingTuple.java */
/* renamed from: n.c.d.a */
/* loaded from: classes3.dex */
public class C14461a {

    /* renamed from: a */
    private String f31830a;

    /* renamed from: b */
    private Throwable f31831b;

    /* renamed from: c */
    private Object[] f31832c;

    static {
        new C14461a(null);
    }

    public C14461a(String str) {
        this(str, null, null);
    }

    /* renamed from: c */
    static Object[] m1670c(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            return objArr2;
        }
        throw new IllegalStateException("non-sensical empty or null argument array");
    }

    /* renamed from: a */
    public String m1672a() {
        return this.f31830a;
    }

    /* renamed from: b */
    public Throwable m1671b() {
        return this.f31831b;
    }

    public C14461a(String str, Object[] objArr, Throwable th) {
        this.f31830a = str;
        this.f31831b = th;
        if (th == null) {
            this.f31832c = objArr;
        } else {
            this.f31832c = m1670c(objArr);
        }
    }
}
