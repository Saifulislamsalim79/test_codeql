package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p058os.C1373c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p201g.p227h.p238l.C7759x;
import p201g.p248l.C7802b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpecialEffectsController.java */
/* renamed from: androidx.fragment.app.i0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1486i0 {

    /* renamed from: a */
    private final ViewGroup f4579a;

    /* renamed from: b */
    final ArrayList<C1491e> f4580b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<C1491e> f4581c = new ArrayList<>();

    /* renamed from: d */
    boolean f4582d = false;

    /* renamed from: e */
    boolean f4583e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.i0$a */
    /* loaded from: classes2.dex */
    public class RunnableC1487a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C1490d f4584c;

        RunnableC1487a(C1490d c1490d) {
            this.f4584c = c1490d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC1486i0.this.f4580b.contains(this.f4584c)) {
                this.f4584c.m35726e().m35717a(this.f4584c.m35725f().mView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.i0$b */
    /* loaded from: classes2.dex */
    public class RunnableC1488b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C1490d f4586c;

        RunnableC1488b(C1490d c1490d) {
            this.f4586c = c1490d;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1486i0.this.f4580b.remove(this.f4586c);
            AbstractC1486i0.this.f4581c.remove(this.f4586c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.i0$c */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1489c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4588a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4589b;

        static {
            int[] iArr = new int[C1491e.EnumC1493b.values().length];
            f4589b = iArr;
            try {
                iArr[C1491e.EnumC1493b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4589b[C1491e.EnumC1493b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4589b[C1491e.EnumC1493b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C1491e.EnumC1494c.values().length];
            f4588a = iArr2;
            try {
                iArr2[C1491e.EnumC1494c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4588a[C1491e.EnumC1494c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4588a[C1491e.EnumC1494c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4588a[C1491e.EnumC1494c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.i0$d */
    /* loaded from: classes2.dex */
    public static class C1490d extends C1491e {

        /* renamed from: h */
        private final C1526y f4590h;

        C1490d(C1491e.EnumC1494c enumC1494c, C1491e.EnumC1493b enumC1493b, C1526y c1526y, C1373c c1373c) {
            super(enumC1494c, enumC1493b, c1526y.m35597k(), c1373c);
            this.f4590h = c1526y;
        }

        @Override // androidx.fragment.app.AbstractC1486i0.C1491e
        /* renamed from: c */
        public void mo35728c() {
            super.mo35728c();
            this.f4590h.m35595m();
        }

        @Override // androidx.fragment.app.AbstractC1486i0.C1491e
        /* renamed from: l */
        void mo35719l() {
            if (m35724g() == C1491e.EnumC1493b.ADDING) {
                Fragment m35597k = this.f4590h.m35597k();
                View findFocus = m35597k.mView.findFocus();
                if (findFocus != null) {
                    m35597k.setFocusedView(findFocus);
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + m35597k);
                    }
                }
                View requireView = m35725f().requireView();
                if (requireView.getParent() == null) {
                    this.f4590h.m35606b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(m35597k.getPostOnViewCreatedAlpha());
            } else if (m35724g() == C1491e.EnumC1493b.REMOVING) {
                Fragment m35597k2 = this.f4590h.m35597k();
                View requireView2 = m35597k2.requireView();
                if (FragmentManager.m35996G0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + m35597k2);
                }
                requireView2.clearFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.i0$e */
    /* loaded from: classes2.dex */
    public static class C1491e {

        /* renamed from: a */
        private EnumC1494c f4591a;

        /* renamed from: b */
        private EnumC1493b f4592b;

        /* renamed from: c */
        private final Fragment f4593c;

        /* renamed from: d */
        private final List<Runnable> f4594d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C1373c> f4595e = new HashSet<>();

        /* renamed from: f */
        private boolean f4596f = false;

        /* renamed from: g */
        private boolean f4597g = false;

        /* compiled from: SpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.i0$e$a */
        /* loaded from: classes2.dex */
        class C1492a implements C1373c.InterfaceC1374a {
            C1492a() {
            }

            @Override // androidx.core.p058os.C1373c.InterfaceC1374a
            /* renamed from: a */
            public void mo35718a() {
                C1491e.this.m35729b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.i0$e$b */
        /* loaded from: classes2.dex */
        public enum EnumC1493b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.i0$e$c */
        /* loaded from: classes2.dex */
        public enum EnumC1494c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: b */
            public static EnumC1494c m35716b(int i) {
                if (i != 0) {
                    if (i != 4) {
                        if (i == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: e */
            public static EnumC1494c m35715e(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return m35716b(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: a */
            public void m35717a(View view) {
                int i = C1489c.f4588a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m35996G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i != 4) {
                } else {
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        C1491e(EnumC1494c enumC1494c, EnumC1493b enumC1493b, Fragment fragment, C1373c c1373c) {
            this.f4591a = enumC1494c;
            this.f4592b = enumC1493b;
            this.f4593c = fragment;
            c1373c.m36171c(new C1492a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final void m35730a(Runnable runnable) {
            this.f4594d.add(runnable);
        }

        /* renamed from: b */
        final void m35729b() {
            if (m35723h()) {
                return;
            }
            this.f4596f = true;
            if (this.f4595e.isEmpty()) {
                mo35728c();
                return;
            }
            Iterator it = new ArrayList(this.f4595e).iterator();
            while (it.hasNext()) {
                ((C1373c) it.next()).m36173a();
            }
        }

        /* renamed from: c */
        public void mo35728c() {
            if (this.f4597g) {
                return;
            }
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4597g = true;
            for (Runnable runnable : this.f4594d) {
                runnable.run();
            }
        }

        /* renamed from: d */
        public final void m35727d(C1373c c1373c) {
            if (this.f4595e.remove(c1373c) && this.f4595e.isEmpty()) {
                mo35728c();
            }
        }

        /* renamed from: e */
        public EnumC1494c m35726e() {
            return this.f4591a;
        }

        /* renamed from: f */
        public final Fragment m35725f() {
            return this.f4593c;
        }

        /* renamed from: g */
        EnumC1493b m35724g() {
            return this.f4592b;
        }

        /* renamed from: h */
        final boolean m35723h() {
            return this.f4596f;
        }

        /* renamed from: i */
        final boolean m35722i() {
            return this.f4597g;
        }

        /* renamed from: j */
        public final void m35721j(C1373c c1373c) {
            mo35719l();
            this.f4595e.add(c1373c);
        }

        /* renamed from: k */
        final void m35720k(EnumC1494c enumC1494c, EnumC1493b enumC1493b) {
            int i = C1489c.f4589b[enumC1493b.ordinal()];
            if (i == 1) {
                if (this.f4591a == EnumC1494c.REMOVED) {
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4593c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4592b + " to ADDING.");
                    }
                    this.f4591a = EnumC1494c.VISIBLE;
                    this.f4592b = EnumC1493b.ADDING;
                }
            } else if (i != 2) {
                if (i == 3 && this.f4591a != EnumC1494c.REMOVED) {
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4593c + " mFinalState = " + this.f4591a + " -> " + enumC1494c + ". ");
                    }
                    this.f4591a = enumC1494c;
                }
            } else {
                if (FragmentManager.m35996G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4593c + " mFinalState = " + this.f4591a + " -> REMOVED. mLifecycleImpact  = " + this.f4592b + " to REMOVING.");
                }
                this.f4591a = EnumC1494c.REMOVED;
                this.f4592b = EnumC1493b.REMOVING;
            }
        }

        /* renamed from: l */
        void mo35719l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f4591a + "} {mLifecycleImpact = " + this.f4592b + "} {mFragment = " + this.f4593c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1486i0(ViewGroup viewGroup) {
        this.f4579a = viewGroup;
    }

    /* renamed from: a */
    private void m35748a(C1491e.EnumC1494c enumC1494c, C1491e.EnumC1493b enumC1493b, C1526y c1526y) {
        synchronized (this.f4580b) {
            C1373c c1373c = new C1373c();
            C1491e m35741h = m35741h(c1526y.m35597k());
            if (m35741h != null) {
                m35741h.m35720k(enumC1494c, enumC1493b);
                return;
            }
            C1490d c1490d = new C1490d(enumC1494c, enumC1493b, c1526y, c1373c);
            this.f4580b.add(c1490d);
            c1490d.m35730a(new RunnableC1487a(c1490d));
            c1490d.m35730a(new RunnableC1488b(c1490d));
        }
    }

    /* renamed from: h */
    private C1491e m35741h(Fragment fragment) {
        Iterator<C1491e> it = this.f4580b.iterator();
        while (it.hasNext()) {
            C1491e next = it.next();
            if (next.m35725f().equals(fragment) && !next.m35723h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C1491e m35740i(Fragment fragment) {
        Iterator<C1491e> it = this.f4581c.iterator();
        while (it.hasNext()) {
            C1491e next = it.next();
            if (next.m35725f().equals(fragment) && !next.m35723h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static AbstractC1486i0 m35735n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m35734o(viewGroup, fragmentManager.m35884y0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static AbstractC1486i0 m35734o(ViewGroup viewGroup, InterfaceC1498j0 interfaceC1498j0) {
        Object tag = viewGroup.getTag(C7802b.special_effects_controller_view_tag);
        if (tag instanceof AbstractC1486i0) {
            return (AbstractC1486i0) tag;
        }
        AbstractC1486i0 mo35710a = interfaceC1498j0.mo35710a(viewGroup);
        viewGroup.setTag(C7802b.special_effects_controller_view_tag, mo35710a);
        return mo35710a;
    }

    /* renamed from: q */
    private void m35732q() {
        Iterator<C1491e> it = this.f4580b.iterator();
        while (it.hasNext()) {
            C1491e next = it.next();
            if (next.m35724g() == C1491e.EnumC1493b.ADDING) {
                next.m35720k(C1491e.EnumC1494c.m35716b(next.m35725f().requireView().getVisibility()), C1491e.EnumC1493b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35747b(C1491e.EnumC1494c enumC1494c, C1526y c1526y) {
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c1526y.m35597k());
        }
        m35748a(enumC1494c, C1491e.EnumC1493b.ADDING, c1526y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m35746c(C1526y c1526y) {
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c1526y.m35597k());
        }
        m35748a(C1491e.EnumC1494c.GONE, C1491e.EnumC1493b.NONE, c1526y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m35745d(C1526y c1526y) {
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c1526y.m35597k());
        }
        m35748a(C1491e.EnumC1494c.REMOVED, C1491e.EnumC1493b.REMOVING, c1526y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m35744e(C1526y c1526y) {
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c1526y.m35597k());
        }
        m35748a(C1491e.EnumC1494c.VISIBLE, C1491e.EnumC1493b.NONE, c1526y);
    }

    /* renamed from: f */
    abstract void mo35743f(List<C1491e> list, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m35742g() {
        if (this.f4583e) {
            return;
        }
        if (!C7759x.m17536T(this.f4579a)) {
            m35739j();
            this.f4582d = false;
            return;
        }
        synchronized (this.f4580b) {
            if (!this.f4580b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f4581c);
                this.f4581c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1491e c1491e = (C1491e) it.next();
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c1491e);
                    }
                    c1491e.m35729b();
                    if (!c1491e.m35722i()) {
                        this.f4581c.add(c1491e);
                    }
                }
                m35732q();
                ArrayList arrayList2 = new ArrayList(this.f4580b);
                this.f4580b.clear();
                this.f4581c.addAll(arrayList2);
                if (FragmentManager.m35996G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((C1491e) it2.next()).mo35719l();
                }
                mo35743f(arrayList2, this.f4582d);
                this.f4582d = false;
                if (FragmentManager.m35996G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m35739j() {
        String str;
        String str2;
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean m17536T = C7759x.m17536T(this.f4579a);
        synchronized (this.f4580b) {
            m35732q();
            Iterator<C1491e> it = this.f4580b.iterator();
            while (it.hasNext()) {
                it.next().mo35719l();
            }
            Iterator it2 = new ArrayList(this.f4581c).iterator();
            while (it2.hasNext()) {
                C1491e c1491e = (C1491e) it2.next();
                if (FragmentManager.m35996G0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (m17536T) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f4579a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(c1491e);
                    Log.v("FragmentManager", sb.toString());
                }
                c1491e.m35729b();
            }
            Iterator it3 = new ArrayList(this.f4580b).iterator();
            while (it3.hasNext()) {
                C1491e c1491e2 = (C1491e) it3.next();
                if (FragmentManager.m35996G0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m17536T) {
                        str = "";
                    } else {
                        str = "Container " + this.f4579a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(c1491e2);
                    Log.v("FragmentManager", sb2.toString());
                }
                c1491e2.m35729b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m35738k() {
        if (this.f4583e) {
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f4583e = false;
            m35742g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C1491e.EnumC1493b m35737l(C1526y c1526y) {
        C1491e m35741h = m35741h(c1526y.m35597k());
        C1491e.EnumC1493b m35724g = m35741h != null ? m35741h.m35724g() : null;
        C1491e m35740i = m35740i(c1526y.m35597k());
        return (m35740i == null || !(m35724g == null || m35724g == C1491e.EnumC1493b.NONE)) ? m35724g : m35740i.m35724g();
    }

    /* renamed from: m */
    public ViewGroup m35736m() {
        return this.f4579a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m35733p() {
        synchronized (this.f4580b) {
            m35732q();
            this.f4583e = false;
            int size = this.f4580b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C1491e c1491e = this.f4580b.get(size);
                C1491e.EnumC1494c m35715e = C1491e.EnumC1494c.m35715e(c1491e.m35725f().mView);
                if (c1491e.m35726e() == C1491e.EnumC1494c.VISIBLE && m35715e != C1491e.EnumC1494c.VISIBLE) {
                    this.f4583e = c1491e.m35725f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m35731r(boolean z) {
        this.f4582d = z;
    }
}
