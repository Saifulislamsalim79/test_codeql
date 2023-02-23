package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.C11781b;
import kotlin.p483e0.p485d.C11782b0;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13741y0;
/* compiled from: SmartSet.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.h */
/* loaded from: classes3.dex */
public final class C13658h<T> extends AbstractSet<T> {

    /* renamed from: e */
    public static final C13660b f30099e = new C13660b(null);

    /* renamed from: c */
    private Object f30100c;

    /* renamed from: d */
    private int f30101d;

    /* compiled from: SmartSet.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.h$a */
    /* loaded from: classes3.dex */
    private static final class C13659a<T> implements Iterator<T>, Object {

        /* renamed from: c */
        private final Iterator<T> f30102c;

        public C13659a(T[] tArr) {
            l.f(tArr, "array");
            this.f30102c = C11781b.m10351a(tArr);
        }

        /* renamed from: a */
        public Void m4237a() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30102c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f30102c.next();
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            m4237a();
            throw null;
        }
    }

    /* compiled from: SmartSet.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.h$b */
    /* loaded from: classes3.dex */
    public static final class C13660b {
        private C13660b() {
        }

        public /* synthetic */ C13660b(kotlin.e0.d.g gVar) {
            this();
        }

        /* renamed from: a */
        public final <T> C13658h<T> m4236a() {
            return new C13658h<>(null);
        }

        /* renamed from: b */
        public final <T> C13658h<T> m4235b(Collection<? extends T> collection) {
            l.f(collection, "set");
            C13658h<T> c13658h = new C13658h<>(null);
            c13658h.addAll(collection);
            return c13658h;
        }
    }

    /* compiled from: SmartSet.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.h$c */
    /* loaded from: classes3.dex */
    private static final class C13661c<T> implements Iterator<T>, Object {

        /* renamed from: c */
        private final T f30103c;

        /* renamed from: d */
        private boolean f30104d = true;

        public C13661c(T t) {
            this.f30103c = t;
        }

        /* renamed from: a */
        public Void m4234a() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30104d;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f30104d) {
                this.f30104d = false;
                return this.f30103c;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            m4234a();
            throw null;
        }
    }

    private C13658h() {
    }

    public /* synthetic */ C13658h(kotlin.e0.d.g gVar) {
        this();
    }

    /* renamed from: d */
    public static final <T> C13658h<T> m4240d() {
        return f30099e.m4236a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        boolean m4006s;
        Object[] objArr;
        LinkedHashSet m3830c;
        if (size() == 0) {
            this.f30100c = t;
        } else if (size() == 1) {
            if (l.b(this.f30100c, t)) {
                return false;
            }
            this.f30100c = new Object[]{this.f30100c, t};
        } else if (size() < 5) {
            Object obj = this.f30100c;
            if (obj != null) {
                Object[] objArr2 = (Object[]) obj;
                m4006s = C13715n.m4006s(objArr2, t);
                if (m4006s) {
                    return false;
                }
                if (size() == 4) {
                    Object[] objArr3 = new Object[objArr2.length];
                    System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                    m3830c = C13741y0.m3830c(objArr3);
                    m3830c.add(t);
                    C13666w c13666w = C13666w.f30112a;
                    objArr = m3830c;
                } else {
                    Object[] copyOf = Arrays.copyOf(objArr2, size() + 1);
                    l.e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                    copyOf[copyOf.length - 1] = t;
                    C13666w c13666w2 = C13666w.f30112a;
                    objArr = copyOf;
                }
                this.f30100c = objArr;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            }
        } else {
            Object obj2 = this.f30100c;
            if (obj2 != null) {
                if (!C11782b0.m10346e(obj2).add(t)) {
                    return false;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            }
        }
        m4238f(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f30100c = null;
        m4238f(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        boolean m4006s;
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return l.b(this.f30100c, obj);
        }
        if (size() >= 5) {
            Object obj2 = this.f30100c;
            if (obj2 != null) {
                return ((Set) obj2).contains(obj);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        }
        Object obj3 = this.f30100c;
        if (obj3 != null) {
            m4006s = C13715n.m4006s((Object[]) obj3, obj);
            return m4006s;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
    }

    /* renamed from: e */
    public int m4239e() {
        return this.f30101d;
    }

    /* renamed from: f */
    public void m4238f(int i) {
        this.f30101d = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new C13661c(this.f30100c);
        }
        if (size() < 5) {
            Object obj = this.f30100c;
            if (obj != null) {
                return new C13659a((Object[]) obj);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
        }
        Object obj2 = this.f30100c;
        if (obj2 != null) {
            return C11782b0.m10346e(obj2).iterator();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m4239e();
    }
}
