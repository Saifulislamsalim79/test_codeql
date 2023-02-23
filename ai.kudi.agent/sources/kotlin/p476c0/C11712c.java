package kotlin.p476c0;

import java.io.Serializable;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: CoroutineContextImpl.kt */
/* renamed from: kotlin.c0.c */
/* loaded from: classes3.dex */
public final class C11712c implements InterfaceC11719g, Serializable {

    /* renamed from: c */
    private final InterfaceC11719g f26440c;

    /* renamed from: d */
    private final InterfaceC11719g.InterfaceC11722b f26441d;

    /* compiled from: CoroutineContextImpl.kt */
    /* renamed from: kotlin.c0.c$a */
    /* loaded from: classes3.dex */
    static final class C11713a extends AbstractC11802m implements InterfaceC11771p<String, InterfaceC11719g.InterfaceC11722b, String> {

        /* renamed from: c */
        public static final C11713a f26442c = new C11713a();

        C11713a() {
            super(2);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: a */
        public final String invoke(String str, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
            l.f(str, "acc");
            l.f(interfaceC11722b, "element");
            if (str.length() == 0) {
                return interfaceC11722b.toString();
            }
            return str + ", " + interfaceC11722b;
        }
    }

    public C11712c(InterfaceC11719g interfaceC11719g, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
        l.f(interfaceC11719g, "left");
        l.f(interfaceC11722b, "element");
        this.f26440c = interfaceC11719g;
        this.f26441d = interfaceC11722b;
    }

    /* renamed from: a */
    private final boolean m10408a(InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
        return l.b(get(interfaceC11722b.getKey()), interfaceC11722b);
    }

    /* renamed from: b */
    private final boolean m10407b(C11712c c11712c) {
        while (m10408a(c11712c.f26441d)) {
            InterfaceC11719g interfaceC11719g = c11712c.f26440c;
            if (!(interfaceC11719g instanceof C11712c)) {
                if (interfaceC11719g != null) {
                    return m10408a((InterfaceC11719g.InterfaceC11722b) interfaceC11719g);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
            c11712c = (C11712c) interfaceC11719g;
        }
        return false;
    }

    /* renamed from: d */
    private final int m10406d() {
        int i = 2;
        C11712c c11712c = this;
        while (true) {
            InterfaceC11719g interfaceC11719g = c11712c.f26440c;
            if (!(interfaceC11719g instanceof C11712c)) {
                interfaceC11719g = null;
            }
            c11712c = (C11712c) interfaceC11719g;
            if (c11712c == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11712c) {
                C11712c c11712c = (C11712c) obj;
                if (c11712c.m10406d() != m10406d() || !c11712c.m10407b(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public <R> R fold(R r, InterfaceC11771p<? super R, ? super InterfaceC11719g.InterfaceC11722b, ? extends R> interfaceC11771p) {
        l.f(interfaceC11771p, "operation");
        return interfaceC11771p.invoke((Object) this.f26440c.fold(r, interfaceC11771p), this.f26441d);
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public <E extends InterfaceC11719g.InterfaceC11722b> E get(InterfaceC11719g.InterfaceC11724c<E> interfaceC11724c) {
        l.f(interfaceC11724c, "key");
        C11712c c11712c = this;
        while (true) {
            E e = (E) c11712c.f26441d.get(interfaceC11724c);
            if (e != null) {
                return e;
            }
            InterfaceC11719g interfaceC11719g = c11712c.f26440c;
            if (interfaceC11719g instanceof C11712c) {
                c11712c = (C11712c) interfaceC11719g;
            } else {
                return (E) interfaceC11719g.get(interfaceC11724c);
            }
        }
    }

    public int hashCode() {
        return this.f26440c.hashCode() + this.f26441d.hashCode();
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g minusKey(InterfaceC11719g.InterfaceC11724c<?> interfaceC11724c) {
        l.f(interfaceC11724c, "key");
        if (this.f26441d.get(interfaceC11724c) != null) {
            return this.f26440c;
        }
        InterfaceC11719g minusKey = this.f26440c.minusKey(interfaceC11724c);
        return minusKey == this.f26440c ? this : minusKey == C11725h.f26446c ? this.f26441d : new C11712c(minusKey, this.f26441d);
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g plus(InterfaceC11719g interfaceC11719g) {
        l.f(interfaceC11719g, "context");
        return InterfaceC11719g.C11720a.m10401a(this, interfaceC11719g);
    }

    public String toString() {
        return "[" + ((String) fold("", C11713a.f26442c)) + "]";
    }
}
