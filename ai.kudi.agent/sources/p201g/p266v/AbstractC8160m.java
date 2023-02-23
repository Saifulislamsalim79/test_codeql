package p201g.p266v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p201g.p218e.C7521a;
import p201g.p218e.C7526d;
import p201g.p227h.p238l.C7759x;
/* compiled from: Transition.java */
/* renamed from: g.v.m */
/* loaded from: classes2.dex */
public abstract class AbstractC8160m implements Cloneable {

    /* renamed from: Y */
    private static final int[] f19567Y = {2, 1, 3, 4};

    /* renamed from: Z */
    private static final AbstractC8145g f19568Z = new C8161a();

    /* renamed from: a0 */
    private static ThreadLocal<C7521a<Animator, C8164d>> f19569a0 = new ThreadLocal<>();

    /* renamed from: L */
    private ArrayList<C8177s> f19581L;

    /* renamed from: M */
    private ArrayList<C8177s> f19582M;

    /* renamed from: U */
    AbstractC8172p f19590U;

    /* renamed from: V */
    private AbstractC8165e f19591V;

    /* renamed from: W */
    private C7521a<String, String> f19592W;

    /* renamed from: c */
    private String f19594c = getClass().getName();

    /* renamed from: d */
    private long f19595d = -1;

    /* renamed from: e */
    long f19596e = -1;

    /* renamed from: f */
    private TimeInterpolator f19597f = null;

    /* renamed from: w */
    ArrayList<Integer> f19598w = new ArrayList<>();

    /* renamed from: x */
    ArrayList<View> f19599x = new ArrayList<>();

    /* renamed from: y */
    private ArrayList<String> f19600y = null;

    /* renamed from: z */
    private ArrayList<Class<?>> f19601z = null;

    /* renamed from: A */
    private ArrayList<Integer> f19570A = null;

    /* renamed from: B */
    private ArrayList<View> f19571B = null;

    /* renamed from: C */
    private ArrayList<Class<?>> f19572C = null;

    /* renamed from: D */
    private ArrayList<String> f19573D = null;

    /* renamed from: E */
    private ArrayList<Integer> f19574E = null;

    /* renamed from: F */
    private ArrayList<View> f19575F = null;

    /* renamed from: G */
    private ArrayList<Class<?>> f19576G = null;

    /* renamed from: H */
    private C8178t f19577H = new C8178t();

    /* renamed from: I */
    private C8178t f19578I = new C8178t();

    /* renamed from: J */
    C8173q f19579J = null;

    /* renamed from: K */
    private int[] f19580K = f19567Y;

    /* renamed from: N */
    boolean f19583N = false;

    /* renamed from: O */
    ArrayList<Animator> f19584O = new ArrayList<>();

    /* renamed from: P */
    private int f19585P = 0;

    /* renamed from: Q */
    private boolean f19586Q = false;

    /* renamed from: R */
    private boolean f19587R = false;

    /* renamed from: S */
    private ArrayList<InterfaceC8166f> f19588S = null;

    /* renamed from: T */
    private ArrayList<Animator> f19589T = new ArrayList<>();

    /* renamed from: X */
    private AbstractC8145g f19593X = f19568Z;

    /* compiled from: Transition.java */
    /* renamed from: g.v.m$a */
    /* loaded from: classes2.dex */
    static class C8161a extends AbstractC8145g {
        C8161a() {
        }

        @Override // p201g.p266v.AbstractC8145g
        /* renamed from: a */
        public Path mo16621a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* renamed from: g.v.m$b */
    /* loaded from: classes2.dex */
    public class C8162b extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ C7521a f19602c;

        C8162b(C7521a c7521a) {
            this.f19602c = c7521a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19602c.remove(animator);
            AbstractC8160m.this.f19584O.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC8160m.this.f19584O.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* renamed from: g.v.m$c */
    /* loaded from: classes2.dex */
    public class C8163c extends AnimatorListenerAdapter {
        C8163c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC8160m.this.m16632p();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Transition.java */
    /* renamed from: g.v.m$d */
    /* loaded from: classes2.dex */
    public static class C8164d {

        /* renamed from: a */
        View f19605a;

        /* renamed from: b */
        String f19606b;

        /* renamed from: c */
        C8177s f19607c;

        /* renamed from: d */
        InterfaceC8167m0 f19608d;

        /* renamed from: e */
        AbstractC8160m f19609e;

        C8164d(View view, String str, AbstractC8160m abstractC8160m, InterfaceC8167m0 interfaceC8167m0, C8177s c8177s) {
            this.f19605a = view;
            this.f19606b = str;
            this.f19607c = c8177s;
            this.f19608d = interfaceC8167m0;
            this.f19609e = abstractC8160m;
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: g.v.m$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8165e {
    }

    /* compiled from: Transition.java */
    /* renamed from: g.v.m$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC8166f {
        /* renamed from: a */
        void mo16577a(AbstractC8160m abstractC8160m);

        /* renamed from: b */
        void mo16620b(AbstractC8160m abstractC8160m);

        /* renamed from: c */
        void mo16576c(AbstractC8160m abstractC8160m);

        /* renamed from: d */
        void mo16619d(AbstractC8160m abstractC8160m);

        /* renamed from: e */
        void mo16618e(AbstractC8160m abstractC8160m);
    }

    /* renamed from: H */
    private static boolean m16648H(C8177s c8177s, C8177s c8177s2, String str) {
        Object obj = c8177s.f19627a.get(str);
        Object obj2 = c8177s2.f19627a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: I */
    private void m16647I(C7521a<View, C8177s> c7521a, C7521a<View, C8177s> c7521a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && m16649G(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && m16649G(view)) {
                C8177s c8177s = c7521a.get(valueAt);
                C8177s c8177s2 = c7521a2.get(view);
                if (c8177s != null && c8177s2 != null) {
                    this.f19581L.add(c8177s);
                    this.f19582M.add(c8177s2);
                    c7521a.remove(valueAt);
                    c7521a2.remove(view);
                }
            }
        }
    }

    /* renamed from: K */
    private void m16646K(C7521a<View, C8177s> c7521a, C7521a<View, C8177s> c7521a2) {
        C8177s remove;
        for (int size = c7521a.size() - 1; size >= 0; size--) {
            View m18452k = c7521a.m18452k(size);
            if (m18452k != null && m16649G(m18452k) && (remove = c7521a2.remove(m18452k)) != null && m16649G(remove.f19628b)) {
                this.f19581L.add(c7521a.mo18450m(size));
                this.f19582M.add(remove);
            }
        }
    }

    /* renamed from: L */
    private void m16645L(C7521a<View, C8177s> c7521a, C7521a<View, C8177s> c7521a2, C7526d<View> c7526d, C7526d<View> c7526d2) {
        View m18499f;
        int m18491o = c7526d.m18491o();
        for (int i = 0; i < m18491o; i++) {
            View m18490p = c7526d.m18490p(i);
            if (m18490p != null && m16649G(m18490p) && (m18499f = c7526d2.m18499f(c7526d.m18495j(i))) != null && m16649G(m18499f)) {
                C8177s c8177s = c7521a.get(m18490p);
                C8177s c8177s2 = c7521a2.get(m18499f);
                if (c8177s != null && c8177s2 != null) {
                    this.f19581L.add(c8177s);
                    this.f19582M.add(c8177s2);
                    c7521a.remove(m18490p);
                    c7521a2.remove(m18499f);
                }
            }
        }
    }

    /* renamed from: M */
    private void m16644M(C7521a<View, C8177s> c7521a, C7521a<View, C8177s> c7521a2, C7521a<String, View> c7521a3, C7521a<String, View> c7521a4) {
        View view;
        int size = c7521a3.size();
        for (int i = 0; i < size; i++) {
            View m18448o = c7521a3.m18448o(i);
            if (m18448o != null && m16649G(m18448o) && (view = c7521a4.get(c7521a3.m18452k(i))) != null && m16649G(view)) {
                C8177s c8177s = c7521a.get(m18448o);
                C8177s c8177s2 = c7521a2.get(view);
                if (c8177s != null && c8177s2 != null) {
                    this.f19581L.add(c8177s);
                    this.f19582M.add(c8177s2);
                    c7521a.remove(m18448o);
                    c7521a2.remove(view);
                }
            }
        }
    }

    /* renamed from: N */
    private void m16643N(C8178t c8178t, C8178t c8178t2) {
        C7521a<View, C8177s> c7521a = new C7521a<>(c8178t.f19630a);
        C7521a<View, C8177s> c7521a2 = new C7521a<>(c8178t2.f19630a);
        int i = 0;
        while (true) {
            int[] iArr = this.f19580K;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m16646K(c7521a, c7521a2);
                } else if (i2 == 2) {
                    m16644M(c7521a, c7521a2, c8178t.f19633d, c8178t2.f19633d);
                } else if (i2 == 3) {
                    m16647I(c7521a, c7521a2, c8178t.f19631b, c8178t2.f19631b);
                } else if (i2 == 4) {
                    m16645L(c7521a, c7521a2, c8178t.f19632c, c8178t2.f19632c);
                }
                i++;
            } else {
                m16640c(c7521a, c7521a2);
                return;
            }
        }
    }

    /* renamed from: T */
    private void m16641T(Animator animator, C7521a<Animator, C8164d> c7521a) {
        if (animator != null) {
            animator.addListener(new C8162b(c7521a));
            m16637e(animator);
        }
    }

    /* renamed from: c */
    private void m16640c(C7521a<View, C8177s> c7521a, C7521a<View, C8177s> c7521a2) {
        for (int i = 0; i < c7521a.size(); i++) {
            C8177s m18448o = c7521a.m18448o(i);
            if (m16649G(m18448o.f19628b)) {
                this.f19581L.add(m18448o);
                this.f19582M.add(null);
            }
        }
        for (int i2 = 0; i2 < c7521a2.size(); i2++) {
            C8177s m18448o2 = c7521a2.m18448o(i2);
            if (m16649G(m18448o2.f19628b)) {
                this.f19582M.add(m18448o2);
                this.f19581L.add(null);
            }
        }
    }

    /* renamed from: d */
    private static void m16639d(C8178t c8178t, View view, C8177s c8177s) {
        c8178t.f19630a.put(view, c8177s);
        int id = view.getId();
        if (id >= 0) {
            if (c8178t.f19631b.indexOfKey(id) >= 0) {
                c8178t.f19631b.put(id, null);
            } else {
                c8178t.f19631b.put(id, view);
            }
        }
        String m17543M = C7759x.m17543M(view);
        if (m17543M != null) {
            if (c8178t.f19633d.containsKey(m17543M)) {
                c8178t.f19633d.put(m17543M, null);
            } else {
                c8178t.f19633d.put(m17543M, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c8178t.f19632c.m18497h(itemIdAtPosition) >= 0) {
                    View m18499f = c8178t.f19632c.m18499f(itemIdAtPosition);
                    if (m18499f != null) {
                        C7759x.m17480y0(m18499f, false);
                        c8178t.f19632c.m18494k(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C7759x.m17480y0(view, true);
                c8178t.f19632c.m18494k(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: g */
    private void m16636g(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f19570A;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.f19571B;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f19572C;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f19572C.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C8177s c8177s = new C8177s(view);
                    if (z) {
                        mo16591i(c8177s);
                    } else {
                        mo16595f(c8177s);
                    }
                    c8177s.f19629c.add(this);
                    mo16593h(c8177s);
                    if (z) {
                        m16639d(this.f19577H, view, c8177s);
                    } else {
                        m16639d(this.f19578I, view, c8177s);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f19574E;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.f19575F;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f19576G;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.f19576G.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m16636g(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: x */
    private static C7521a<Animator, C8164d> m16624x() {
        C7521a<Animator, C8164d> c7521a = f19569a0.get();
        if (c7521a == null) {
            C7521a<Animator, C8164d> c7521a2 = new C7521a<>();
            f19569a0.set(c7521a2);
            return c7521a2;
        }
        return c7521a;
    }

    /* renamed from: A */
    public List<String> m16655A() {
        return this.f19600y;
    }

    /* renamed from: B */
    public List<Class<?>> m16654B() {
        return this.f19601z;
    }

    /* renamed from: C */
    public List<View> m16653C() {
        return this.f19599x;
    }

    /* renamed from: D */
    public String[] mo16652D() {
        return null;
    }

    /* renamed from: E */
    public C8177s m16651E(View view, boolean z) {
        C8173q c8173q = this.f19579J;
        if (c8173q != null) {
            return c8173q.m16651E(view, z);
        }
        return (z ? this.f19577H : this.f19578I).f19630a.get(view);
    }

    /* renamed from: F */
    public boolean mo16650F(C8177s c8177s, C8177s c8177s2) {
        if (c8177s == null || c8177s2 == null) {
            return false;
        }
        String[] mo16652D = mo16652D();
        if (mo16652D != null) {
            for (String str : mo16652D) {
                if (!m16648H(c8177s, c8177s2, str)) {
                }
            }
            return false;
        }
        for (String str2 : c8177s.f19627a.keySet()) {
            if (m16648H(c8177s, c8177s2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean m16649G(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f19570A;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.f19571B;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.f19572C;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f19572C.get(i).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.f19573D == null || C7759x.m17543M(view) == null || !this.f19573D.contains(C7759x.m17543M(view))) {
                    if ((this.f19598w.size() == 0 && this.f19599x.size() == 0 && (((arrayList = this.f19601z) == null || arrayList.isEmpty()) && ((arrayList2 = this.f19600y) == null || arrayList2.isEmpty()))) || this.f19598w.contains(Integer.valueOf(id)) || this.f19599x.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.f19600y;
                    if (arrayList6 == null || !arrayList6.contains(C7759x.m17543M(view))) {
                        if (this.f19601z != null) {
                            for (int i2 = 0; i2 < this.f19601z.size(); i2++) {
                                if (this.f19601z.get(i2).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: O */
    public void mo16609O(View view) {
        if (this.f19587R) {
            return;
        }
        C7521a<Animator, C8164d> m16624x = m16624x();
        int size = m16624x.size();
        InterfaceC8167m0 m16710d = C8130c0.m16710d(view);
        for (int i = size - 1; i >= 0; i--) {
            C8164d m18448o = m16624x.m18448o(i);
            if (m18448o.f19605a != null && m16710d.equals(m18448o.f19608d)) {
                C8113a.m16733b(m16624x.m18452k(i));
            }
        }
        ArrayList<InterfaceC8166f> arrayList = this.f19588S;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f19588S.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC8166f) arrayList2.get(i2)).mo16620b(this);
            }
        }
        this.f19586Q = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m16642P(ViewGroup viewGroup) {
        C8164d c8164d;
        this.f19581L = new ArrayList<>();
        this.f19582M = new ArrayList<>();
        m16643N(this.f19577H, this.f19578I);
        C7521a<Animator, C8164d> m16624x = m16624x();
        int size = m16624x.size();
        InterfaceC8167m0 m16710d = C8130c0.m16710d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator m18452k = m16624x.m18452k(i);
            if (m18452k != null && (c8164d = m16624x.get(m18452k)) != null && c8164d.f19605a != null && m16710d.equals(c8164d.f19608d)) {
                C8177s c8177s = c8164d.f19607c;
                View view = c8164d.f19605a;
                C8177s m16651E = m16651E(view, true);
                C8177s m16628t = m16628t(view, true);
                if (m16651E == null && m16628t == null) {
                    m16628t = this.f19578I.f19630a.get(view);
                }
                if (!(m16651E == null && m16628t == null) && c8164d.f19609e.mo16650F(c8177s, m16628t)) {
                    if (!m18452k.isRunning() && !m18452k.isStarted()) {
                        m16624x.remove(m18452k);
                    } else {
                        m18452k.cancel();
                    }
                }
            }
        }
        mo16584o(viewGroup, this.f19577H, this.f19578I, this.f19581L, this.f19582M);
        mo16605U();
    }

    /* renamed from: Q */
    public AbstractC8160m mo16608Q(InterfaceC8166f interfaceC8166f) {
        ArrayList<InterfaceC8166f> arrayList = this.f19588S;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC8166f);
        if (this.f19588S.size() == 0) {
            this.f19588S = null;
        }
        return this;
    }

    /* renamed from: R */
    public AbstractC8160m mo16607R(View view) {
        this.f19599x.remove(view);
        return this;
    }

    /* renamed from: S */
    public void mo16606S(View view) {
        if (this.f19586Q) {
            if (!this.f19587R) {
                C7521a<Animator, C8164d> m16624x = m16624x();
                int size = m16624x.size();
                InterfaceC8167m0 m16710d = C8130c0.m16710d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C8164d m18448o = m16624x.m18448o(i);
                    if (m18448o.f19605a != null && m16710d.equals(m18448o.f19608d)) {
                        C8113a.m16732c(m16624x.m18452k(i));
                    }
                }
                ArrayList<InterfaceC8166f> arrayList = this.f19588S;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f19588S.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC8166f) arrayList2.get(i2)).mo16618e(this);
                    }
                }
            }
            this.f19586Q = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public void mo16605U() {
        m16638d0();
        C7521a<Animator, C8164d> m16624x = m16624x();
        Iterator<Animator> it = this.f19589T.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m16624x.containsKey(next)) {
                m16638d0();
                m16641T(next, m16624x);
            }
        }
        this.f19589T.clear();
        m16632p();
    }

    /* renamed from: W */
    public AbstractC8160m mo16604W(long j) {
        this.f19596e = j;
        return this;
    }

    /* renamed from: X */
    public void mo16603X(AbstractC8165e abstractC8165e) {
        this.f19591V = abstractC8165e;
    }

    /* renamed from: Y */
    public AbstractC8160m mo16602Y(TimeInterpolator timeInterpolator) {
        this.f19597f = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public AbstractC8160m mo16601a(InterfaceC8166f interfaceC8166f) {
        if (this.f19588S == null) {
            this.f19588S = new ArrayList<>();
        }
        this.f19588S.add(interfaceC8166f);
        return this;
    }

    /* renamed from: a0 */
    public void mo16600a0(AbstractC8145g abstractC8145g) {
        if (abstractC8145g == null) {
            this.f19593X = f19568Z;
        } else {
            this.f19593X = abstractC8145g;
        }
    }

    /* renamed from: b */
    public AbstractC8160m mo16599b(View view) {
        this.f19599x.add(view);
        return this;
    }

    /* renamed from: b0 */
    public void mo16598b0(AbstractC8172p abstractC8172p) {
        this.f19590U = abstractC8172p;
    }

    /* renamed from: c0 */
    public AbstractC8160m mo16597c0(long j) {
        this.f19595d = j;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f19584O.size() - 1; size >= 0; size--) {
            this.f19584O.get(size).cancel();
        }
        ArrayList<InterfaceC8166f> arrayList = this.f19588S;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f19588S.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((InterfaceC8166f) arrayList2.get(i)).mo16619d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d0 */
    public void m16638d0() {
        if (this.f19585P == 0) {
            ArrayList<InterfaceC8166f> arrayList = this.f19588S;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19588S.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC8166f) arrayList2.get(i)).mo16577a(this);
                }
            }
            this.f19587R = false;
        }
        this.f19585P++;
    }

    /* renamed from: e */
    protected void m16637e(Animator animator) {
        if (animator == null) {
            m16632p();
            return;
        }
        if (m16631q() >= 0) {
            animator.setDuration(m16631q());
        }
        if (m16623y() >= 0) {
            animator.setStartDelay(m16623y() + animator.getStartDelay());
        }
        if (m16629s() != null) {
            animator.setInterpolator(m16629s());
        }
        animator.addListener(new C8163c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public String mo16596e0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f19596e != -1) {
            str2 = str2 + "dur(" + this.f19596e + ") ";
        }
        if (this.f19595d != -1) {
            str2 = str2 + "dly(" + this.f19595d + ") ";
        }
        if (this.f19597f != null) {
            str2 = str2 + "interp(" + this.f19597f + ") ";
        }
        if (this.f19598w.size() > 0 || this.f19599x.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f19598w.size() > 0) {
                for (int i = 0; i < this.f19598w.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f19598w.get(i);
                }
            }
            if (this.f19599x.size() > 0) {
                for (int i2 = 0; i2 < this.f19599x.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f19599x.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* renamed from: f */
    public abstract void mo16595f(C8177s c8177s);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo16593h(C8177s c8177s) {
        String[] m16611b;
        if (this.f19590U == null || c8177s.f19627a.isEmpty() || (m16611b = this.f19590U.m16611b()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= m16611b.length) {
                z = true;
                break;
            } else if (!c8177s.f19627a.containsKey(m16611b[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.f19590U.m16612a(c8177s);
    }

    /* renamed from: i */
    public abstract void mo16591i(C8177s c8177s);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m16635j(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C7521a<String, String> c7521a;
        m16634k(z);
        if ((this.f19598w.size() <= 0 && this.f19599x.size() <= 0) || (((arrayList = this.f19600y) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f19601z) != null && !arrayList2.isEmpty()))) {
            m16636g(viewGroup, z);
        } else {
            for (int i = 0; i < this.f19598w.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f19598w.get(i).intValue());
                if (findViewById != null) {
                    C8177s c8177s = new C8177s(findViewById);
                    if (z) {
                        mo16591i(c8177s);
                    } else {
                        mo16595f(c8177s);
                    }
                    c8177s.f19629c.add(this);
                    mo16593h(c8177s);
                    if (z) {
                        m16639d(this.f19577H, findViewById, c8177s);
                    } else {
                        m16639d(this.f19578I, findViewById, c8177s);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f19599x.size(); i2++) {
                View view = this.f19599x.get(i2);
                C8177s c8177s2 = new C8177s(view);
                if (z) {
                    mo16591i(c8177s2);
                } else {
                    mo16595f(c8177s2);
                }
                c8177s2.f19629c.add(this);
                mo16593h(c8177s2);
                if (z) {
                    m16639d(this.f19577H, view, c8177s2);
                } else {
                    m16639d(this.f19578I, view, c8177s2);
                }
            }
        }
        if (z || (c7521a = this.f19592W) == null) {
            return;
        }
        int size = c7521a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.f19577H.f19633d.remove(this.f19592W.m18452k(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.f19577H.f19633d.put(this.f19592W.m18448o(i4), view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m16634k(boolean z) {
        if (z) {
            this.f19577H.f19630a.clear();
            this.f19577H.f19631b.clear();
            this.f19577H.f19632c.m18503b();
            return;
        }
        this.f19578I.f19630a.clear();
        this.f19578I.f19631b.clear();
        this.f19578I.f19632c.m18503b();
    }

    @Override // 
    /* renamed from: l */
    public AbstractC8160m clone() {
        try {
            AbstractC8160m abstractC8160m = (AbstractC8160m) super.clone();
            abstractC8160m.f19589T = new ArrayList<>();
            abstractC8160m.f19577H = new C8178t();
            abstractC8160m.f19578I = new C8178t();
            abstractC8160m.f19581L = null;
            abstractC8160m.f19582M = null;
            return abstractC8160m;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public Animator mo16633n(ViewGroup viewGroup, C8177s c8177s, C8177s c8177s2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void mo16584o(ViewGroup viewGroup, C8178t c8178t, C8178t c8178t2, ArrayList<C8177s> arrayList, ArrayList<C8177s> arrayList2) {
        Animator mo16633n;
        int i;
        int i2;
        View view;
        Animator animator;
        C8177s c8177s;
        Animator animator2;
        C8177s c8177s2;
        C7521a<Animator, C8164d> m16624x = m16624x();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C8177s c8177s3 = arrayList.get(i3);
            C8177s c8177s4 = arrayList2.get(i3);
            if (c8177s3 != null && !c8177s3.f19629c.contains(this)) {
                c8177s3 = null;
            }
            if (c8177s4 != null && !c8177s4.f19629c.contains(this)) {
                c8177s4 = null;
            }
            if (c8177s3 != null || c8177s4 != null) {
                if ((c8177s3 == null || c8177s4 == null || mo16650F(c8177s3, c8177s4)) && (mo16633n = mo16633n(viewGroup, c8177s3, c8177s4)) != null) {
                    if (c8177s4 != null) {
                        view = c8177s4.f19628b;
                        String[] mo16652D = mo16652D();
                        if (mo16652D != null && mo16652D.length > 0) {
                            c8177s2 = new C8177s(view);
                            i = size;
                            C8177s c8177s5 = c8178t2.f19630a.get(view);
                            if (c8177s5 != null) {
                                int i4 = 0;
                                while (i4 < mo16652D.length) {
                                    c8177s2.f19627a.put(mo16652D[i4], c8177s5.f19627a.get(mo16652D[i4]));
                                    i4++;
                                    i3 = i3;
                                    c8177s5 = c8177s5;
                                }
                            }
                            i2 = i3;
                            int size2 = m16624x.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = mo16633n;
                                    break;
                                }
                                C8164d c8164d = m16624x.get(m16624x.m18452k(i5));
                                if (c8164d.f19607c != null && c8164d.f19605a == view && c8164d.f19606b.equals(m16627u()) && c8164d.f19607c.equals(c8177s2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator2 = mo16633n;
                            c8177s2 = null;
                        }
                        animator = animator2;
                        c8177s = c8177s2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c8177s3.f19628b;
                        animator = mo16633n;
                        c8177s = null;
                    }
                    if (animator != null) {
                        AbstractC8172p abstractC8172p = this.f19590U;
                        if (abstractC8172p != null) {
                            long m16610c = abstractC8172p.m16610c(viewGroup, this, c8177s3, c8177s4);
                            sparseIntArray.put(this.f19589T.size(), (int) m16610c);
                            j = Math.min(m16610c, j);
                        }
                        m16624x.put(animator, new C8164d(view, m16627u(), this, C8130c0.m16710d(viewGroup), c8177s));
                        this.f19589T.add(animator);
                        j = j;
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.f19589T.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((sparseIntArray.valueAt(i6) - j) + animator3.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m16632p() {
        int i = this.f19585P - 1;
        this.f19585P = i;
        if (i == 0) {
            ArrayList<InterfaceC8166f> arrayList = this.f19588S;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19588S.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC8166f) arrayList2.get(i2)).mo16576c(this);
                }
            }
            for (int i3 = 0; i3 < this.f19577H.f19632c.m18491o(); i3++) {
                View m18490p = this.f19577H.f19632c.m18490p(i3);
                if (m18490p != null) {
                    C7759x.m17480y0(m18490p, false);
                }
            }
            for (int i4 = 0; i4 < this.f19578I.f19632c.m18491o(); i4++) {
                View m18490p2 = this.f19578I.f19632c.m18490p(i4);
                if (m18490p2 != null) {
                    C7759x.m17480y0(m18490p2, false);
                }
            }
            this.f19587R = true;
        }
    }

    /* renamed from: q */
    public long m16631q() {
        return this.f19596e;
    }

    /* renamed from: r */
    public AbstractC8165e m16630r() {
        return this.f19591V;
    }

    /* renamed from: s */
    public TimeInterpolator m16629s() {
        return this.f19597f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public C8177s m16628t(View view, boolean z) {
        C8173q c8173q = this.f19579J;
        if (c8173q != null) {
            return c8173q.m16628t(view, z);
        }
        ArrayList<C8177s> arrayList = z ? this.f19581L : this.f19582M;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C8177s c8177s = arrayList.get(i2);
            if (c8177s == null) {
                return null;
            }
            if (c8177s.f19628b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.f19582M : this.f19581L).get(i);
        }
        return null;
    }

    public String toString() {
        return mo16596e0("");
    }

    /* renamed from: u */
    public String m16627u() {
        return this.f19594c;
    }

    /* renamed from: v */
    public AbstractC8145g m16626v() {
        return this.f19593X;
    }

    /* renamed from: w */
    public AbstractC8172p m16625w() {
        return this.f19590U;
    }

    /* renamed from: y */
    public long m16623y() {
        return this.f19595d;
    }

    /* renamed from: z */
    public List<Integer> m16622z() {
        return this.f19598w;
    }
}
