package p201g.p243j.p245b;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: FocusStrategy.java */
/* renamed from: g.j.b.b */
/* loaded from: classes2.dex */
class C7788b {

    /* compiled from: FocusStrategy.java */
    /* renamed from: g.j.b.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC7789a<T> {
        /* renamed from: a */
        void mo17361a(T t, Rect rect);
    }

    /* compiled from: FocusStrategy.java */
    /* renamed from: g.j.b.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC7790b<T, V> {
        /* renamed from: a */
        V mo17360a(T t, int i);

        /* renamed from: b */
        int mo17359b(T t);
    }

    /* compiled from: FocusStrategy.java */
    /* renamed from: g.j.b.b$c */
    /* loaded from: classes2.dex */
    private static class C7791c<T> implements Comparator<T> {

        /* renamed from: c */
        private final Rect f18567c = new Rect();

        /* renamed from: d */
        private final Rect f18568d = new Rect();

        /* renamed from: e */
        private final boolean f18569e;

        /* renamed from: f */
        private final InterfaceC7789a<T> f18570f;

        C7791c(boolean z, InterfaceC7789a<T> interfaceC7789a) {
            this.f18569e = z;
            this.f18570f = interfaceC7789a;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f18567c;
            Rect rect2 = this.f18568d;
            this.f18570f.mo17361a(t, rect);
            this.f18570f.mo17361a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f18569e ? 1 : -1;
            } else if (i3 > i4) {
                return this.f18569e ? -1 : 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    return this.f18569e ? 1 : -1;
                } else if (i7 > i8) {
                    return this.f18569e ? -1 : 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m17376a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean m17375b = m17375b(i, rect, rect2);
        if (m17375b(i, rect, rect3) || !m17375b) {
            return false;
        }
        return !m17367j(i, rect, rect3) || i == 17 || i == 66 || m17366k(i, rect, rect2) < m17364m(i, rect, rect3);
    }

    /* renamed from: b */
    private static boolean m17375b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static <L, T> T m17374c(L l, InterfaceC7790b<L, T> interfaceC7790b, InterfaceC7789a<T> interfaceC7789a, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int mo17359b = interfaceC7790b.mo17359b(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < mo17359b; i2++) {
            T mo17360a = interfaceC7790b.mo17360a(l, i2);
            if (mo17360a != t) {
                interfaceC7789a.mo17361a(mo17360a, rect3);
                if (m17369h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = mo17360a;
                }
            }
        }
        return t2;
    }

    /* renamed from: d */
    public static <L, T> T m17373d(L l, InterfaceC7790b<L, T> interfaceC7790b, InterfaceC7789a<T> interfaceC7789a, T t, int i, boolean z, boolean z2) {
        int mo17359b = interfaceC7790b.mo17359b(l);
        ArrayList arrayList = new ArrayList(mo17359b);
        for (int i2 = 0; i2 < mo17359b; i2++) {
            arrayList.add(interfaceC7790b.mo17360a(l, i2));
        }
        Collections.sort(arrayList, new C7791c(z, interfaceC7789a));
        if (i != 1) {
            if (i == 2) {
                return (T) m17372e(t, arrayList, z2);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) m17371f(t, arrayList, z2);
    }

    /* renamed from: e */
    private static <T> T m17372e(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    private static <T> T m17371f(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    private static int m17370g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    private static boolean m17369h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (m17368i(rect, rect2, i)) {
            if (m17368i(rect, rect3, i) && !m17376a(i, rect, rect2, rect3)) {
                return !m17376a(i, rect, rect3, rect2) && m17370g(m17366k(i, rect, rect2), m17362o(i, rect, rect2)) < m17370g(m17366k(i, rect, rect3), m17362o(i, rect, rect3));
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m17368i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    private static boolean m17367j(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        } else if (i == 33) {
            return rect.top >= rect2.bottom;
        } else if (i == 66) {
            return rect.right <= rect2.left;
        } else if (i == 130) {
            return rect.bottom <= rect2.top;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: k */
    private static int m17366k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m17365l(i, rect, rect2));
    }

    /* renamed from: l */
    private static int m17365l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: m */
    private static int m17364m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m17363n(i, rect, rect2));
    }

    /* renamed from: n */
    private static int m17363n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: o */
    private static int m17362o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
