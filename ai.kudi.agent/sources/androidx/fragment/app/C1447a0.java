package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStore.java */
/* renamed from: androidx.fragment.app.a0 */
/* loaded from: classes2.dex */
public class C1447a0 {

    /* renamed from: a */
    private final ArrayList<Fragment> f4455a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C1526y> f4456b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, C1524x> f4457c = new HashMap<>();

    /* renamed from: d */
    private C1519t f4458d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m35858A(C1519t c1519t) {
        this.f4458d = c1519t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public C1524x m35857B(String str, C1524x c1524x) {
        if (c1524x != null) {
            return this.f4457c.put(str, c1524x);
        }
        return this.f4457c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35856a(Fragment fragment) {
        if (!this.f4455a.contains(fragment)) {
            synchronized (this.f4455a) {
                this.f4455a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35855b() {
        this.f4456b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m35854c(String str) {
        return this.f4456b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m35853d(int i) {
        for (C1526y c1526y : this.f4456b.values()) {
            if (c1526y != null) {
                c1526y.m35587u(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m35852e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4456b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1526y c1526y : this.f4456b.values()) {
                printWriter.print(str);
                if (c1526y != null) {
                    Fragment m35597k = c1526y.m35597k();
                    printWriter.println(m35597k);
                    m35597k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4455a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f4455a.get(i).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment m35851f(String str) {
        C1526y c1526y = this.f4456b.get(str);
        if (c1526y != null) {
            return c1526y.m35597k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment m35850g(int i) {
        for (int size = this.f4455a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f4455a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C1526y c1526y : this.f4456b.values()) {
            if (c1526y != null) {
                Fragment m35597k = c1526y.m35597k();
                if (m35597k.mFragmentId == i) {
                    return m35597k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment m35849h(String str) {
        if (str != null) {
            for (int size = this.f4455a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f4455a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C1526y c1526y : this.f4456b.values()) {
                if (c1526y != null) {
                    Fragment m35597k = c1526y.m35597k();
                    if (str.equals(m35597k.mTag)) {
                        return m35597k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment m35848i(String str) {
        Fragment findFragmentByWho;
        for (C1526y c1526y : this.f4456b.values()) {
            if (c1526y != null && (findFragmentByWho = c1526y.m35597k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m35847j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4455a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f4455a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4455a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f4455a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public List<C1526y> m35846k() {
        ArrayList arrayList = new ArrayList();
        for (C1526y c1526y : this.f4456b.values()) {
            if (c1526y != null) {
                arrayList.add(c1526y);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Fragment> m35845l() {
        ArrayList arrayList = new ArrayList();
        for (C1526y c1526y : this.f4456b.values()) {
            if (c1526y != null) {
                arrayList.add(c1526y.m35597k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public ArrayList<C1524x> m35844m() {
        return new ArrayList<>(this.f4457c.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C1526y m35843n(String str) {
        return this.f4456b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public List<Fragment> m35842o() {
        ArrayList arrayList;
        if (this.f4455a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4455a) {
            arrayList = new ArrayList(this.f4455a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C1519t m35841p() {
        return this.f4458d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public C1524x m35840q(String str) {
        return this.f4457c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m35839r(C1526y c1526y) {
        Fragment m35597k = c1526y.m35597k();
        if (m35854c(m35597k.mWho)) {
            return;
        }
        this.f4456b.put(m35597k.mWho, c1526y);
        if (m35597k.mRetainInstanceChangedWhileDetached) {
            if (m35597k.mRetainInstance) {
                this.f4458d.m35625a(m35597k);
            } else {
                this.f4458d.m35615k(m35597k);
            }
            m35597k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + m35597k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m35838s(C1526y c1526y) {
        Fragment m35597k = c1526y.m35597k();
        if (m35597k.mRetainInstance) {
            this.f4458d.m35615k(m35597k);
        }
        if (this.f4456b.put(m35597k.mWho, null) != null && FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + m35597k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m35837t() {
        Iterator<Fragment> it = this.f4455a.iterator();
        while (it.hasNext()) {
            C1526y c1526y = this.f4456b.get(it.next().mWho);
            if (c1526y != null) {
                c1526y.m35595m();
            }
        }
        for (C1526y c1526y2 : this.f4456b.values()) {
            if (c1526y2 != null) {
                c1526y2.m35595m();
                Fragment m35597k = c1526y2.m35597k();
                if (m35597k.mRemoving && !m35597k.isInBackStack()) {
                    if (m35597k.mBeingSaved && !this.f4457c.containsKey(m35597k.mWho)) {
                        c1526y2.m35589s();
                    }
                    m35838s(c1526y2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m35836u(Fragment fragment) {
        synchronized (this.f4455a) {
            this.f4455a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m35835v() {
        this.f4456b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m35834w(List<String> list) {
        this.f4455a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment m35851f = m35851f(str);
                if (m35851f != null) {
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m35851f);
                    }
                    m35856a(m35851f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m35833x(ArrayList<C1524x> arrayList) {
        this.f4457c.clear();
        Iterator<C1524x> it = arrayList.iterator();
        while (it.hasNext()) {
            C1524x next = it.next();
            this.f4457c.put(next.f4678d, next);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public ArrayList<String> m35832y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f4456b.size());
        for (C1526y c1526y : this.f4456b.values()) {
            if (c1526y != null) {
                Fragment m35597k = c1526y.m35597k();
                c1526y.m35589s();
                arrayList.add(m35597k.mWho);
                if (FragmentManager.m35996G0(2)) {
                    Log.v("FragmentManager", "Saved state of " + m35597k + ": " + m35597k.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public ArrayList<String> m35831z() {
        synchronized (this.f4455a) {
            if (this.f4455a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f4455a.size());
            Iterator<Fragment> it = this.f4455a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.m35996G0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
