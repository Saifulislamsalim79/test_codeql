package p272h.p286c.p287a.p288a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_Event.java */
/* renamed from: h.c.a.a.a */
/* loaded from: classes2.dex */
public final class C8235a<T> extends AbstractC8237c<T> {

    /* renamed from: a */
    private final Integer f19803a;

    /* renamed from: b */
    private final T f19804b;

    /* renamed from: c */
    private final EnumC8238d f19805c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8235a(Integer num, T t, EnumC8238d enumC8238d) {
        this.f19803a = num;
        if (t != null) {
            this.f19804b = t;
            if (enumC8238d != null) {
                this.f19805c = enumC8238d;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // p272h.p286c.p287a.p288a.AbstractC8237c
    /* renamed from: a */
    public Integer mo16443a() {
        return this.f19803a;
    }

    @Override // p272h.p286c.p287a.p288a.AbstractC8237c
    /* renamed from: b */
    public T mo16442b() {
        return this.f19804b;
    }

    @Override // p272h.p286c.p287a.p288a.AbstractC8237c
    /* renamed from: c */
    public EnumC8238d mo16441c() {
        return this.f19805c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8237c) {
            AbstractC8237c abstractC8237c = (AbstractC8237c) obj;
            Integer num = this.f19803a;
            if (num != null ? num.equals(abstractC8237c.mo16443a()) : abstractC8237c.mo16443a() == null) {
                if (this.f19804b.equals(abstractC8237c.mo16442b()) && this.f19805c.equals(abstractC8237c.mo16441c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f19803a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f19804b.hashCode()) * 1000003) ^ this.f19805c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f19803a + ", payload=" + this.f19804b + ", priority=" + this.f19805c + "}";
    }
}
