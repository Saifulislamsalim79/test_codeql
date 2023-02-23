package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p058os.C1373c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.ViewTreeObserver$OnPreDrawListenerC7755t;
/* compiled from: FragmentTransitionImpl.java */
/* renamed from: androidx.fragment.app.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1463e0 {

    /* compiled from: FragmentTransitionImpl.java */
    /* renamed from: androidx.fragment.app.e0$a */
    /* loaded from: classes2.dex */
    class RunnableC1464a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f4519c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f4520d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f4521e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f4522f;

        /* renamed from: w */
        final /* synthetic */ ArrayList f4523w;

        RunnableC1464a(AbstractC1463e0 abstractC1463e0, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4519c = i;
            this.f4520d = arrayList;
            this.f4521e = arrayList2;
            this.f4522f = arrayList3;
            this.f4523w = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f4519c; i++) {
                C7759x.m17552H0((View) this.f4520d.get(i), (String) this.f4521e.get(i));
                C7759x.m17552H0((View) this.f4522f.get(i), (String) this.f4523w.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static void m35784d(List<View> list, View view) {
        int size = list.size();
        if (m35783g(list, view, size)) {
            return;
        }
        if (C7759x.m17543M(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m35783g(list, childAt, size) && C7759x.m17543M(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private static boolean m35783g(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public static boolean m35781i(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo16697a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo16696b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo16695c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo16694e(Object obj);

    /* renamed from: f */
    public abstract Object mo16693f(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m35782h(View view, Rect rect) {
        if (C7759x.m17536T(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: j */
    public abstract Object mo16692j(Object obj, Object obj2, Object obj3);

    /* renamed from: k */
    public abstract Object mo16691k(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ArrayList<String> m35780l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C7759x.m17543M(view));
            C7759x.m17552H0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: m */
    public abstract void mo16690m(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: n */
    public abstract void mo16689n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: o */
    public abstract void mo16688o(Object obj, Rect rect);

    /* renamed from: p */
    public abstract void mo16687p(Object obj, View view);

    /* renamed from: q */
    public void mo35779q(Fragment fragment, Object obj, C1373c c1373c, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m35778r(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String m17543M = C7759x.m17543M(view2);
            arrayList4.add(m17543M);
            if (m17543M != null) {
                C7759x.m17552H0(view2, null);
                String str = map.get(m17543M);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C7759x.m17552H0(arrayList2.get(i2), m17543M);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC7755t.m17571a(view, new RunnableC1464a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: s */
    public abstract void mo16686s(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: t */
    public abstract void mo16685t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: u */
    public abstract Object mo16684u(Object obj);
}
