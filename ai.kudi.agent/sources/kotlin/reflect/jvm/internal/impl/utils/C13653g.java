package kotlin.reflect.jvm.internal.impl.utils;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
/* compiled from: SmartList.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.g */
/* loaded from: classes3.dex */
public class C13653g<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: c */
    private int f30093c;

    /* renamed from: d */
    private Object f30094d;

    /* compiled from: SmartList.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.g$b */
    /* loaded from: classes3.dex */
    private static class C13655b<T> implements Iterator<T> {

        /* renamed from: c */
        private static final C13655b f30095c = new C13655b();

        private C13655b() {
        }

        /* renamed from: a */
        public static <T> C13655b<T> m4243a() {
            return f30095c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* compiled from: SmartList.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.g$c */
    /* loaded from: classes3.dex */
    private class C13656c extends AbstractC13657d<E> {

        /* renamed from: d */
        private final int f30096d;

        public C13656c() {
            super();
            this.f30096d = ((AbstractList) C13653g.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C13653g.AbstractC13657d
        /* renamed from: a */
        protected void mo4242a() {
            if (((AbstractList) C13653g.this).modCount == this.f30096d) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) C13653g.this).modCount + "; expected: " + this.f30096d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C13653g.AbstractC13657d
        /* renamed from: b */
        protected E mo4241b() {
            return (E) C13653g.this.f30094d;
        }

        @Override // java.util.Iterator
        public void remove() {
            mo4242a();
            C13653g.this.clear();
        }
    }

    /* compiled from: SmartList.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.g$d */
    /* loaded from: classes3.dex */
    private static abstract class AbstractC13657d<T> implements Iterator<T> {

        /* renamed from: c */
        private boolean f30098c;

        private AbstractC13657d() {
        }

        /* renamed from: a */
        protected abstract void mo4242a();

        /* renamed from: b */
        protected abstract T mo4241b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f30098c;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f30098c) {
                this.f30098c = true;
                mo4242a();
                return mo4241b();
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    private static /* synthetic */ void m4248d(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        int i = this.f30093c;
        if (i == 0) {
            this.f30094d = e;
        } else if (i == 1) {
            this.f30094d = new Object[]{this.f30094d, e};
        } else {
            Object[] objArr = (Object[]) this.f30094d;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f30094d = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f30093c] = e;
        }
        this.f30093c++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f30094d = null;
        this.f30093c = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f30093c)) {
            if (i2 == 1) {
                return (E) this.f30094d;
            }
            return (E) ((Object[]) this.f30094d)[i];
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f30093c);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        int i = this.f30093c;
        if (i == 0) {
            C13655b m4243a = C13655b.m4243a();
            if (m4243a != null) {
                return m4243a;
            }
            m4248d(2);
            throw null;
        } else if (i == 1) {
            return new C13656c();
        } else {
            Iterator<E> it = super.iterator();
            if (it != null) {
                return it;
            }
            m4248d(3);
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        E e;
        if (i >= 0 && i < (i2 = this.f30093c)) {
            if (i2 == 1) {
                e = (E) this.f30094d;
                this.f30094d = null;
            } else {
                Object[] objArr = (Object[]) this.f30094d;
                Object obj = objArr[i];
                if (i2 == 2) {
                    this.f30094d = objArr[1 - i];
                } else {
                    int i3 = (i2 - i) - 1;
                    if (i3 > 0) {
                        System.arraycopy(objArr, i + 1, objArr, i, i3);
                    }
                    objArr[this.f30093c - 1] = null;
                }
                e = (E) obj;
            }
            this.f30093c--;
            ((AbstractList) this).modCount++;
            return e;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f30093c);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f30093c)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f30093c);
        } else if (i2 == 1) {
            E e2 = (E) this.f30094d;
            this.f30094d = e;
            return e2;
        } else {
            Object[] objArr = (Object[]) this.f30094d;
            E e3 = (E) objArr[i];
            objArr[i] = e;
            return e3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f30093c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr != 0) {
            int length = tArr.length;
            int i = this.f30093c;
            if (i == 1) {
                if (length != 0) {
                    tArr[0] = this.f30094d;
                } else {
                    T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                    tArr2[0] = this.f30094d;
                    if (tArr2 != 0) {
                        return tArr2;
                    }
                    m4248d(5);
                    throw null;
                }
            } else if (length < i) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f30094d, i, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                m4248d(6);
                throw null;
            } else if (i != 0) {
                System.arraycopy(this.f30094d, 0, tArr, 0, i);
            }
            int i2 = this.f30093c;
            if (length > i2) {
                tArr[i2] = 0;
            }
            if (tArr != 0) {
                return tArr;
            }
            m4248d(7);
            throw null;
        }
        m4248d(4);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f30093c)) {
            if (i2 == 0) {
                this.f30094d = e;
            } else if (i2 == 1 && i == 0) {
                this.f30094d = new Object[]{e, this.f30094d};
            } else {
                int i3 = this.f30093c;
                Object[] objArr = new Object[i3 + 1];
                if (i3 == 1) {
                    objArr[0] = this.f30094d;
                } else {
                    Object[] objArr2 = (Object[]) this.f30094d;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.f30093c - i);
                }
                objArr[i] = e;
                this.f30094d = objArr;
            }
            this.f30093c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f30093c);
    }
}
