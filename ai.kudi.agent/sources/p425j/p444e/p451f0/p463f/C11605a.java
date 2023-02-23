package p425j.p444e.p451f0.p463f;

import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p451f0.p454c.InterfaceC11321i;
/* compiled from: MpscLinkedQueue.java */
/* renamed from: j.e.f0.f.a */
/* loaded from: classes3.dex */
public final class C11605a<T> implements InterfaceC11321i<T> {

    /* renamed from: c */
    private final AtomicReference<C11606a<T>> f26190c = new AtomicReference<>();

    /* renamed from: d */
    private final AtomicReference<C11606a<T>> f26191d = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MpscLinkedQueue.java */
    /* renamed from: j.e.f0.f.a$a */
    /* loaded from: classes3.dex */
    public static final class C11606a<E> extends AtomicReference<C11606a<E>> {

        /* renamed from: c */
        private E f26192c;

        C11606a() {
        }

        /* renamed from: a */
        public E m10783a() {
            E m10782b = m10782b();
            m10779e(null);
            return m10782b;
        }

        /* renamed from: b */
        public E m10782b() {
            return this.f26192c;
        }

        /* renamed from: c */
        public C11606a<E> m10781c() {
            return get();
        }

        /* renamed from: d */
        public void m10780d(C11606a<E> c11606a) {
            lazySet(c11606a);
        }

        /* renamed from: e */
        public void m10779e(E e) {
            this.f26192c = e;
        }

        C11606a(E e) {
            m10779e(e);
        }
    }

    public C11605a() {
        C11606a<T> c11606a = new C11606a<>();
        m10785d(c11606a);
        m10784e(c11606a);
    }

    /* renamed from: a */
    C11606a<T> m10788a() {
        return this.f26191d.get();
    }

    /* renamed from: b */
    C11606a<T> m10787b() {
        return this.f26191d.get();
    }

    /* renamed from: c */
    C11606a<T> m10786c() {
        return this.f26190c.get();
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    /* renamed from: d */
    void m10785d(C11606a<T> c11606a) {
        this.f26191d.lazySet(c11606a);
    }

    /* renamed from: e */
    C11606a<T> m10784e(C11606a<T> c11606a) {
        return this.f26190c.getAndSet(c11606a);
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean isEmpty() {
        return m10787b() == m10786c();
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean offer(T t) {
        if (t != null) {
            C11606a<T> c11606a = new C11606a<>(t);
            m10784e(c11606a).m10780d(c11606a);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11321i, p425j.p444e.p451f0.p454c.InterfaceC11322j
    public T poll() {
        C11606a<T> m10781c;
        C11606a<T> m10788a = m10788a();
        C11606a<T> m10781c2 = m10788a.m10781c();
        if (m10781c2 != null) {
            T m10783a = m10781c2.m10783a();
            m10785d(m10781c2);
            return m10783a;
        } else if (m10788a != m10786c()) {
            do {
                m10781c = m10788a.m10781c();
            } while (m10781c == null);
            T m10783a2 = m10781c.m10783a();
            m10785d(m10781c);
            return m10783a2;
        } else {
            return null;
        }
    }
}
