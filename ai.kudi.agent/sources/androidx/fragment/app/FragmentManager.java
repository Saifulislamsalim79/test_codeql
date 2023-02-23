package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.AbstractC0893b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0904c;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0901a;
import androidx.activity.result.C0905e;
import androidx.activity.result.InterfaceC0903b;
import androidx.activity.result.p053f.AbstractC0908a;
import androidx.activity.result.p053f.C0910b;
import androidx.activity.result.p053f.C0911c;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.C1515c;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1566i0;
import androidx.lifecycle.InterfaceC1572l;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p201g.p248l.C7802b;
/* loaded from: classes2.dex */
public abstract class FragmentManager {

    /* renamed from: N */
    private static boolean f4394N = false;

    /* renamed from: A */
    private AbstractC0904c<String[]> f4395A;

    /* renamed from: C */
    private boolean f4397C;

    /* renamed from: D */
    private boolean f4398D;

    /* renamed from: E */
    private boolean f4399E;

    /* renamed from: F */
    private boolean f4400F;

    /* renamed from: G */
    private boolean f4401G;

    /* renamed from: H */
    private ArrayList<C1453d> f4402H;

    /* renamed from: I */
    private ArrayList<Boolean> f4403I;

    /* renamed from: J */
    private ArrayList<Fragment> f4404J;

    /* renamed from: K */
    private C1519t f4405K;

    /* renamed from: L */
    private C1515c.C1518c f4406L;

    /* renamed from: b */
    private boolean f4409b;

    /* renamed from: d */
    ArrayList<C1453d> f4411d;

    /* renamed from: e */
    private ArrayList<Fragment> f4412e;

    /* renamed from: g */
    private OnBackPressedDispatcher f4414g;

    /* renamed from: m */
    private ArrayList<InterfaceC1443m> f4420m;

    /* renamed from: q */
    private AbstractC1505o<?> f4424q;

    /* renamed from: r */
    private AbstractC1499k f4425r;

    /* renamed from: s */
    private Fragment f4426s;

    /* renamed from: t */
    Fragment f4427t;

    /* renamed from: y */
    private AbstractC0904c<Intent> f4432y;

    /* renamed from: z */
    private AbstractC0904c<C0905e> f4433z;

    /* renamed from: a */
    private final ArrayList<InterfaceC1444n> f4408a = new ArrayList<>();

    /* renamed from: c */
    private final C1447a0 f4410c = new C1447a0();

    /* renamed from: f */
    private final LayoutInflater$Factory2C1506p f4413f = new LayoutInflater$Factory2C1506p(this);

    /* renamed from: h */
    private final AbstractC0893b f4415h = new C1430a(false);

    /* renamed from: i */
    private final AtomicInteger f4416i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, C1465f> f4417j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map<String, Bundle> f4418k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    private final Map<String, C1442l> f4419l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final C1508q f4421n = new C1508q(this);

    /* renamed from: o */
    private final CopyOnWriteArrayList<InterfaceC1521u> f4422o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    int f4423p = -1;

    /* renamed from: u */
    private C1504n f4428u = null;

    /* renamed from: v */
    private C1504n f4429v = new C1431b();

    /* renamed from: w */
    private InterfaceC1498j0 f4430w = null;

    /* renamed from: x */
    private InterfaceC1498j0 f4431x = new C1432c(this);

    /* renamed from: B */
    ArrayDeque<C1440k> f4396B = new ArrayDeque<>();

    /* renamed from: M */
    private Runnable f4407M = new RunnableC1433d();

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    /* loaded from: classes2.dex */
    class C1430a extends AbstractC0893b {
        C1430a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.AbstractC0893b
        public void handleOnBackPressed() {
            FragmentManager.this.m36004C0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    /* loaded from: classes2.dex */
    class C1431b extends C1504n {
        C1431b() {
        }

        @Override // androidx.fragment.app.C1504n
        /* renamed from: a */
        public Fragment mo35684a(ClassLoader classLoader, String str) {
            return FragmentManager.this.m35899t0().m35709b(FragmentManager.this.m35899t0().m35677f(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    /* loaded from: classes2.dex */
    class C1432c implements InterfaceC1498j0 {
        C1432c(FragmentManager fragmentManager) {
        }

        @Override // androidx.fragment.app.InterfaceC1498j0
        /* renamed from: a */
        public AbstractC1486i0 mo35710a(ViewGroup viewGroup) {
            return new C1468g(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    /* loaded from: classes2.dex */
    class RunnableC1433d implements Runnable {
        RunnableC1433d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m35961Y(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$e */
    /* loaded from: classes2.dex */
    public class C1434e implements InterfaceC1521u {

        /* renamed from: c */
        final /* synthetic */ Fragment f4441c;

        C1434e(FragmentManager fragmentManager, Fragment fragment) {
            this.f4441c = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC1521u
        /* renamed from: a */
        public void mo35612a(FragmentManager fragmentManager, Fragment fragment) {
            this.f4441c.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$f */
    /* loaded from: classes2.dex */
    public class C1435f implements InterfaceC0903b<C0901a> {
        C1435f() {
        }

        @Override // androidx.activity.result.InterfaceC0903b
        /* renamed from: b */
        public void mo35879a(C0901a c0901a) {
            C1440k pollFirst = FragmentManager.this.f4396B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f4445c;
            int i = pollFirst.f4446d;
            Fragment m35848i = FragmentManager.this.f4410c.m35848i(str);
            if (m35848i == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            m35848i.onActivityResult(i, c0901a.m37857b(), c0901a.m37858a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$g */
    /* loaded from: classes2.dex */
    public class C1436g implements InterfaceC0903b<C0901a> {
        C1436g() {
        }

        @Override // androidx.activity.result.InterfaceC0903b
        /* renamed from: b */
        public void mo35879a(C0901a c0901a) {
            C1440k pollFirst = FragmentManager.this.f4396B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f4445c;
            int i = pollFirst.f4446d;
            Fragment m35848i = FragmentManager.this.f4410c.m35848i(str);
            if (m35848i == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            m35848i.onActivityResult(i, c0901a.m37857b(), c0901a.m37858a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$h */
    /* loaded from: classes2.dex */
    public class C1437h implements InterfaceC0903b<Map<String, Boolean>> {
        C1437h() {
        }

        @Override // androidx.activity.result.InterfaceC0903b
        /* renamed from: b */
        public void mo35879a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            C1440k pollFirst = FragmentManager.this.f4396B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f4445c;
            int i2 = pollFirst.f4446d;
            Fragment m35848i = FragmentManager.this.f4410c.m35848i(str);
            if (m35848i == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            m35848i.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$i */
    /* loaded from: classes2.dex */
    public static class C1438i extends AbstractC0908a<C0905e, C0901a> {
        C1438i() {
        }

        @Override // androidx.activity.result.p053f.AbstractC0908a
        /* renamed from: d */
        public Intent mo35877a(Context context, C0905e c0905e) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m37852a = c0905e.m37852a();
            if (m37852a != null && (bundleExtra = m37852a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                m37852a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (m37852a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    C0905e.C0907b c0907b = new C0905e.C0907b(c0905e.m37849d());
                    c0907b.m37845b(null);
                    c0907b.m37844c(c0905e.m37850c(), c0905e.m37851b());
                    c0905e = c0907b.m37846a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0905e);
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.p053f.AbstractC0908a
        /* renamed from: e */
        public C0901a mo35876c(int i, Intent intent) {
            return new C0901a(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1439j {
        @Deprecated
        /* renamed from: a */
        public void m35873a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: b */
        public void m35872b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: c */
        public void m35871c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void m35870d(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: e */
        public void m35869e(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo974f(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: g */
        public void m35868g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: h */
        public void m35867h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: i */
        public void mo973i(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: j */
        public void m35866j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo972k(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: l */
        public void m35865l(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: m */
        public void mo34270m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: n */
        public void m35864n(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    /* loaded from: classes2.dex */
    private static class C1442l implements InterfaceC1523w {

        /* renamed from: a */
        private final AbstractC1565i f4447a;

        /* renamed from: b */
        private final InterfaceC1523w f4448b;

        /* renamed from: c */
        private final InterfaceC1572l f4449c;

        C1442l(AbstractC1565i abstractC1565i, InterfaceC1523w interfaceC1523w, InterfaceC1572l interfaceC1572l) {
            this.f4447a = abstractC1565i;
            this.f4448b = interfaceC1523w;
            this.f4449c = interfaceC1572l;
        }

        @Override // androidx.fragment.app.InterfaceC1523w
        /* renamed from: a */
        public void mo35611a(String str, Bundle bundle) {
            this.f4448b.mo35611a(str, bundle);
        }

        /* renamed from: b */
        public boolean m35861b(AbstractC1565i.c cVar) {
            return this.f4447a.mo35505b().a(cVar);
        }

        /* renamed from: c */
        public void m35860c() {
            this.f4447a.mo35504c(this.f4449c);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    /* loaded from: classes2.dex */
    public interface InterfaceC1443m {
        /* renamed from: a */
        void m35859a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$n */
    /* loaded from: classes2.dex */
    public interface InterfaceC1444n {
        /* renamed from: a */
        boolean mo35806a(ArrayList<C1453d> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    /* loaded from: classes2.dex */
    private class C1445o implements InterfaceC1444n {

        /* renamed from: a */
        final String f4450a;

        /* renamed from: b */
        final int f4451b;

        /* renamed from: c */
        final int f4452c;

        C1445o(String str, int i, int i2) {
            this.f4450a = str;
            this.f4451b = i;
            this.f4452c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC1444n
        /* renamed from: a */
        public boolean mo35806a(ArrayList<C1453d> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f4427t;
            if (fragment == null || this.f4451b >= 0 || this.f4450a != null || !fragment.getChildFragmentManager().m35960Y0()) {
                return FragmentManager.this.m35952b1(arrayList, arrayList2, this.f4450a, this.f4451b, this.f4452c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public static Fragment m36008A0(View view) {
        Object tag = view.getTag(C7802b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: G0 */
    public static boolean m35996G0(int i) {
        return f4394N || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: H0 */
    private boolean m35994H0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m35921m();
    }

    /* renamed from: J */
    private void m35991J(Fragment fragment) {
        if (fragment == null || !fragment.equals(m35947d0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* renamed from: Q */
    private void m35977Q(int i) {
        try {
            this.f4409b = true;
            this.f4410c.m35853d(i);
            m35974R0(i, false);
            for (AbstractC1486i0 abstractC1486i0 : m35906r()) {
                abstractC1486i0.m35739j();
            }
            this.f4409b = false;
            m35961Y(true);
        } catch (Throwable th) {
            this.f4409b = false;
            throw th;
        }
    }

    /* renamed from: T */
    private void m35971T() {
        if (this.f4401G) {
            this.f4401G = false;
            m35895u1();
        }
    }

    /* renamed from: V */
    private void m35967V() {
        for (AbstractC1486i0 abstractC1486i0 : m35906r()) {
            abstractC1486i0.m35739j();
        }
    }

    /* renamed from: X */
    private void m35963X(boolean z) {
        if (!this.f4409b) {
            if (this.f4424q == null) {
                if (this.f4400F) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f4424q.m35676g().getLooper()) {
                if (!z) {
                    m35918n();
                }
                if (this.f4402H == null) {
                    this.f4402H = new ArrayList<>();
                    this.f4403I = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* renamed from: a0 */
    private static void m35956a0(ArrayList<C1453d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C1453d c1453d = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                c1453d.m35796w(-1);
                c1453d.m35811B();
            } else {
                c1453d.m35796w(1);
                c1453d.m35812A();
            }
            i++;
        }
    }

    /* renamed from: a1 */
    private boolean m35955a1(String str, int i, int i2) {
        m35961Y(false);
        m35963X(true);
        Fragment fragment = this.f4427t;
        if (fragment == null || i >= 0 || str != null || !fragment.getChildFragmentManager().m35960Y0()) {
            boolean m35952b1 = m35952b1(this.f4402H, this.f4403I, str, i, i2);
            if (m35952b1) {
                this.f4409b = true;
                try {
                    m35940f1(this.f4402H, this.f4403I);
                } finally {
                    m35915o();
                }
            }
            m35886x1();
            m35971T();
            this.f4410c.m35855b();
            return m35952b1;
        }
        return true;
    }

    /* renamed from: b0 */
    private void m35953b0(ArrayList<C1453d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        boolean z = arrayList.get(i).f4475p;
        ArrayList<Fragment> arrayList3 = this.f4404J;
        if (arrayList3 == null) {
            this.f4404J = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f4404J.addAll(this.f4410c.m35842o());
        Fragment m35887x0 = m35887x0();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            C1453d c1453d = arrayList.get(i3);
            if (!arrayList2.get(i3).booleanValue()) {
                m35887x0 = c1453d.m35810C(this.f4404J, m35887x0);
            } else {
                m35887x0 = c1453d.m35807F(this.f4404J, m35887x0);
            }
            z2 = z2 || c1453d.f4466g;
        }
        this.f4404J.clear();
        if (!z && this.f4423p >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator<AbstractC1449b0.C1450a> it = arrayList.get(i4).f4460a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f4478b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f4410c.m35839r(m35900t(fragment));
                    }
                }
            }
        }
        m35956a0(arrayList, arrayList2, i, i2);
        boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
        for (int i5 = i; i5 < i2; i5++) {
            C1453d c1453d2 = arrayList.get(i5);
            if (booleanValue) {
                for (int size = c1453d2.f4460a.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = c1453d2.f4460a.get(size).f4478b;
                    if (fragment2 != null) {
                        m35900t(fragment2).m35595m();
                    }
                }
            } else {
                Iterator<AbstractC1449b0.C1450a> it2 = c1453d2.f4460a.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f4478b;
                    if (fragment3 != null) {
                        m35900t(fragment3).m35595m();
                    }
                }
            }
        }
        m35974R0(this.f4423p, true);
        for (AbstractC1486i0 abstractC1486i0 : m35903s(arrayList, i, i2)) {
            abstractC1486i0.m35731r(booleanValue);
            abstractC1486i0.m35733p();
            abstractC1486i0.m35742g();
        }
        while (i < i2) {
            C1453d c1453d3 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && c1453d3.f4491t >= 0) {
                c1453d3.f4491t = -1;
            }
            c1453d3.m35808E();
            i++;
        }
        if (z2) {
            m35934h1();
        }
    }

    /* renamed from: e0 */
    private int m35944e0(String str, int i, boolean z) {
        ArrayList<C1453d> arrayList = this.f4411d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.f4411d.size() - 1;
        }
        int size = this.f4411d.size() - 1;
        while (size >= 0) {
            C1453d c1453d = this.f4411d.get(size);
            if ((str != null && str.equals(c1453d.m35809D())) || (i >= 0 && i == c1453d.f4491t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.f4411d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C1453d c1453d2 = this.f4411d.get(size - 1);
            if ((str == null || !str.equals(c1453d2.m35809D())) && (i < 0 || i != c1453d2.f4491t)) {
                return size;
            }
            size--;
        }
        return size;
    }

    /* renamed from: f1 */
    private void m35940f1(ArrayList<C1453d> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f4475p) {
                    if (i2 != i) {
                        m35953b0(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f4475p) {
                            i2++;
                        }
                    }
                    m35953b0(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m35953b0(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    /* renamed from: h1 */
    private void m35934h1() {
        if (this.f4420m != null) {
            for (int i = 0; i < this.f4420m.size(); i++) {
                this.f4420m.get(i).m35859a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public static FragmentManager m35932i0(View view) {
        Fragment m35929j0 = m35929j0(view);
        if (m35929j0 != null) {
            if (m35929j0.isAdded()) {
                return m35929j0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + m35929j0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        i context = view.getContext();
        i iVar = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof i) {
                iVar = context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (iVar != null) {
            return iVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    /* renamed from: j0 */
    private static Fragment m35929j0(View view) {
        while (view != null) {
            Fragment m36008A0 = m36008A0(view);
            if (m36008A0 != null) {
                return m36008A0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1 */
    public static int m35928j1(int i) {
        if (i != 4097) {
            if (i != 8194) {
                if (i != 8197) {
                    if (i != 4099) {
                        return i != 4100 ? 0 : 8197;
                    }
                    return 4099;
                }
                return 4100;
            }
            return 4097;
        }
        return 8194;
    }

    /* renamed from: k0 */
    private void m35926k0() {
        for (AbstractC1486i0 abstractC1486i0 : m35906r()) {
            abstractC1486i0.m35738k();
        }
    }

    /* renamed from: l0 */
    private boolean m35923l0(ArrayList<C1453d> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f4408a) {
            if (this.f4408a.isEmpty()) {
                return false;
            }
            int size = this.f4408a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f4408a.get(i).mo35806a(arrayList, arrayList2);
            }
            this.f4408a.clear();
            this.f4424q.m35676g().removeCallbacks(this.f4407M);
            return z;
        }
    }

    /* renamed from: n */
    private void m35918n() {
        if (m35984M0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: n0 */
    private C1519t m35917n0(Fragment fragment) {
        return this.f4405K.m35620f(fragment);
    }

    /* renamed from: o */
    private void m35915o() {
        this.f4409b = false;
        this.f4403I.clear();
        this.f4402H.clear();
    }

    /* renamed from: p */
    private void m35912p() {
        AbstractC1505o<?> abstractC1505o = this.f4424q;
        boolean z = true;
        if (abstractC1505o instanceof androidx.lifecycle.j0) {
            z = this.f4410c.m35841p().m35616j();
        } else if (abstractC1505o.m35677f() instanceof Activity) {
            z = true ^ ((Activity) this.f4424q.m35677f()).isChangingConfigurations();
        }
        if (z) {
            for (C1465f c1465f : this.f4417j.values()) {
                for (String str : c1465f.f4524c) {
                    this.f4410c.m35841p().m35623c(str);
                }
            }
        }
    }

    /* renamed from: q0 */
    private ViewGroup m35908q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f4425r.mo35679d()) {
            View mo35680c = this.f4425r.mo35680c(fragment.mContainerId);
            if (mo35680c instanceof ViewGroup) {
                return (ViewGroup) mo35680c;
            }
        }
        return null;
    }

    /* renamed from: r */
    private Set<AbstractC1486i0> m35906r() {
        HashSet hashSet = new HashSet();
        for (C1526y c1526y : this.f4410c.m35846k()) {
            ViewGroup viewGroup = c1526y.m35597k().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC1486i0.m35734o(viewGroup, m35884y0()));
            }
        }
        return hashSet;
    }

    /* renamed from: s */
    private Set<AbstractC1486i0> m35903s(ArrayList<C1453d> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<AbstractC1449b0.C1450a> it = arrayList.get(i).f4460a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f4478b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC1486i0.m35735n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: s1 */
    private void m35901s1(Fragment fragment) {
        ViewGroup m35908q0 = m35908q0(fragment);
        if (m35908q0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (m35908q0.getTag(C7802b.visible_removing_fragment_view_tag) == null) {
            m35908q0.setTag(C7802b.visible_removing_fragment_view_tag, fragment);
        }
        ((Fragment) m35908q0.getTag(C7802b.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
    }

    /* renamed from: u1 */
    private void m35895u1() {
        for (C1526y c1526y : this.f4410c.m35846k()) {
            m35968U0(c1526y);
        }
    }

    /* renamed from: v1 */
    private void m35892v1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C1485h0("FragmentManager"));
        AbstractC1505o<?> abstractC1505o = this.f4424q;
        if (abstractC1505o != null) {
            try {
                abstractC1505o.mo35675h("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                m35969U("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: x1 */
    private void m35886x1() {
        synchronized (this.f4408a) {
            boolean z = true;
            if (!this.f4408a.isEmpty()) {
                this.f4415h.setEnabled(true);
            } else {
                this.f4415h.setEnabled((m35920m0() <= 0 || !m35988K0(this.f4426s)) ? false : false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m36009A(Menu menu, MenuInflater menuInflater) {
        if (this.f4423p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f4410c.m35842o()) {
            if (fragment != null && m35990J0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f4412e != null) {
            for (int i = 0; i < this.f4412e.size(); i++) {
                Fragment fragment2 = this.f4412e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4412e = arrayList;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m36007B() {
        this.f4400F = true;
        m35961Y(true);
        m35967V();
        m35912p();
        m35977Q(-1);
        this.f4424q = null;
        this.f4425r = null;
        this.f4426s = null;
        if (this.f4414g != null) {
            this.f4415h.remove();
            this.f4414g = null;
        }
        AbstractC0904c<Intent> abstractC0904c = this.f4432y;
        if (abstractC0904c != null) {
            abstractC0904c.mo36015c();
            this.f4433z.mo36015c();
            this.f4395A.mo36015c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public C1566i0 m36006B0(Fragment fragment) {
        return this.f4405K.m35617i(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m36005C() {
        m35977Q(1);
    }

    /* renamed from: C0 */
    void m36004C0() {
        m35961Y(true);
        if (this.f4415h.isEnabled()) {
            m35960Y0();
        } else {
            this.f4414g.m37878c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m36003D() {
        for (Fragment fragment : this.f4410c.m35842o()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void m36002D0(Fragment fragment) {
        if (m35996G0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m35901s1(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m36001E(boolean z) {
        for (Fragment fragment : this.f4410c.m35842o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void m36000E0(Fragment fragment) {
        if (fragment.mAdded && m35994H0(fragment)) {
            this.f4397C = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m35999F(Fragment fragment) {
        Iterator<InterfaceC1521u> it = this.f4422o.iterator();
        while (it.hasNext()) {
            it.next().mo35612a(this, fragment);
        }
    }

    /* renamed from: F0 */
    public boolean m35998F0() {
        return this.f4400F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m35997G() {
        for (Fragment fragment : this.f4410c.m35845l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.m35997G();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean m35995H(MenuItem menuItem) {
        if (this.f4423p < 1) {
            return false;
        }
        for (Fragment fragment : this.f4410c.m35842o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m35993I(Menu menu) {
        if (this.f4423p < 1) {
            return;
        }
        for (Fragment fragment : this.f4410c.m35842o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I0 */
    public boolean m35992I0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public boolean m35990J0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m35989K() {
        m35977Q(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public boolean m35988K0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.m35887x0()) && m35988K0(fragmentManager.f4426s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m35987L(boolean z) {
        for (Fragment fragment : this.f4410c.m35842o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public boolean m35986L0(int i) {
        return this.f4423p >= i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean m35985M(Menu menu) {
        boolean z = false;
        if (this.f4423p < 1) {
            return false;
        }
        for (Fragment fragment : this.f4410c.m35842o()) {
            if (fragment != null && m35990J0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: M0 */
    public boolean m35984M0() {
        return this.f4398D || this.f4399E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m35983N() {
        m35886x1();
        m35991J(this.f4427t);
    }

    /* renamed from: N0 */
    public /* synthetic */ Bundle m35982N0() {
        Bundle bundle = new Bundle();
        Parcelable m35925k1 = m35925k1();
        if (m35925k1 != null) {
            bundle.putParcelable("android:support:fragments", m35925k1);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m35981O() {
        this.f4398D = false;
        this.f4399E = false;
        this.f4405K.m35614l(false);
        m35977Q(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void m35980O0(Fragment fragment, String[] strArr, int i) {
        if (this.f4395A != null) {
            this.f4396B.addLast(new C1440k(fragment.mWho, i));
            this.f4395A.m37853a(strArr);
            return;
        }
        this.f4424q.m35672k(fragment, strArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m35979P() {
        this.f4398D = false;
        this.f4399E = false;
        this.f4405K.m35614l(false);
        m35977Q(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void m35978P0(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (this.f4432y != null) {
            this.f4396B.addLast(new C1440k(fragment.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f4432y.m37853a(intent);
            return;
        }
        this.f4424q.m35670m(fragment, intent, i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void m35976Q0(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.f4433z != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m35996G0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            C0905e.C0907b c0907b = new C0905e.C0907b(intentSender);
            c0907b.m37845b(intent2);
            c0907b.m37844c(i3, i2);
            C0905e m37846a = c0907b.m37846a();
            this.f4396B.addLast(new C1440k(fragment.mWho, i));
            if (m35996G0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.f4433z.m37853a(m37846a);
            return;
        }
        this.f4424q.m35669n(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m35975R() {
        this.f4399E = true;
        this.f4405K.m35614l(true);
        m35977Q(4);
    }

    /* renamed from: R0 */
    void m35974R0(int i, boolean z) {
        AbstractC1505o<?> abstractC1505o;
        if (this.f4424q == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f4423p) {
            this.f4423p = i;
            this.f4410c.m35837t();
            m35895u1();
            if (this.f4397C && (abstractC1505o = this.f4424q) != null && this.f4423p == 7) {
                abstractC1505o.mo35668o();
                this.f4397C = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m35973S() {
        m35977Q(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void m35972S0() {
        if (this.f4424q == null) {
            return;
        }
        this.f4398D = false;
        this.f4399E = false;
        this.f4405K.m35614l(false);
        for (Fragment fragment : this.f4410c.m35842o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void m35970T0(C1501l c1501l) {
        View view;
        for (C1526y c1526y : this.f4410c.m35846k()) {
            Fragment m35597k = c1526y.m35597k();
            if (m35597k.mContainerId == c1501l.getId() && (view = m35597k.mView) != null && view.getParent() == null) {
                m35597k.mContainer = c1501l;
                c1526y.m35606b();
            }
        }
    }

    /* renamed from: U */
    public void m35969U(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f4410c.m35852e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f4412e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f4412e.get(i).toString());
            }
        }
        ArrayList<C1453d> arrayList2 = this.f4411d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C1453d c1453d = this.f4411d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c1453d.toString());
                c1453d.m35794y(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4416i.get());
        synchronized (this.f4408a) {
            int size3 = this.f4408a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f4408a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4424q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4425r);
        if (this.f4426s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4426s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4423p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4398D);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4399E);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4400F);
        if (this.f4397C) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4397C);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void m35968U0(C1526y c1526y) {
        Fragment m35597k = c1526y.m35597k();
        if (m35597k.mDeferStart) {
            if (this.f4409b) {
                this.f4401G = true;
                return;
            }
            m35597k.mDeferStart = false;
            c1526y.m35595m();
        }
    }

    /* renamed from: V0 */
    public void m35966V0() {
        m35965W(new C1445o(null, -1, 0), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m35965W(InterfaceC1444n interfaceC1444n, boolean z) {
        if (!z) {
            if (this.f4424q == null) {
                if (this.f4400F) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            m35918n();
        }
        synchronized (this.f4408a) {
            if (this.f4424q == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f4408a.add(interfaceC1444n);
            m35919m1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void m35964W0(int i, int i2, boolean z) {
        if (i >= 0) {
            m35965W(new C1445o(null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: X0 */
    public void m35962X0(String str, int i) {
        m35965W(new C1445o(str, -1, i), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean m35961Y(boolean z) {
        m35963X(z);
        boolean z2 = false;
        while (m35923l0(this.f4402H, this.f4403I)) {
            this.f4409b = true;
            try {
                m35940f1(this.f4402H, this.f4403I);
                m35915o();
                z2 = true;
            } catch (Throwable th) {
                m35915o();
                throw th;
            }
        }
        m35886x1();
        m35971T();
        this.f4410c.m35855b();
        return z2;
    }

    /* renamed from: Y0 */
    public boolean m35960Y0() {
        return m35955a1(null, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public void m35959Z(InterfaceC1444n interfaceC1444n, boolean z) {
        if (z && (this.f4424q == null || this.f4400F)) {
            return;
        }
        m35963X(z);
        if (interfaceC1444n.mo35806a(this.f4402H, this.f4403I)) {
            this.f4409b = true;
            try {
                m35940f1(this.f4402H, this.f4403I);
            } finally {
                m35915o();
            }
        }
        m35886x1();
        m35971T();
        this.f4410c.m35855b();
    }

    /* renamed from: Z0 */
    public boolean m35958Z0(String str, int i) {
        return m35955a1(str, -1, i);
    }

    /* renamed from: b1 */
    boolean m35952b1(ArrayList<C1453d> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int m35944e0 = m35944e0(str, i, (i2 & 1) != 0);
        if (m35944e0 < 0) {
            return false;
        }
        for (int size = this.f4411d.size() - 1; size >= m35944e0; size--) {
            arrayList.add(this.f4411d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: c0 */
    public boolean m35950c0() {
        boolean m35961Y = m35961Y(true);
        m35926k0();
        return m35961Y;
    }

    /* renamed from: c1 */
    public void m35949c1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
            return;
        }
        m35892v1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m35948d(C1453d c1453d) {
        if (this.f4411d == null) {
            this.f4411d = new ArrayList<>();
        }
        this.f4411d.add(c1453d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public Fragment m35947d0(String str) {
        return this.f4410c.m35851f(str);
    }

    /* renamed from: d1 */
    public void m35946d1(AbstractC1439j abstractC1439j, boolean z) {
        this.f4421n.m35653o(abstractC1439j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C1526y m35945e(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            C1515c.m35641h(fragment, str);
        }
        if (m35996G0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C1526y m35900t = m35900t(fragment);
        fragment.mFragmentManager = this;
        this.f4410c.m35839r(m35900t);
        if (!fragment.mDetached) {
            this.f4410c.m35856a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m35994H0(fragment)) {
                this.f4397C = true;
            }
        }
        return m35900t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void m35943e1(Fragment fragment) {
        if (m35996G0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f4410c.m35836u(fragment);
            if (m35994H0(fragment)) {
                this.f4397C = true;
            }
            fragment.mRemoving = true;
            m35901s1(fragment);
        }
    }

    /* renamed from: f */
    public void m35942f(InterfaceC1521u interfaceC1521u) {
        this.f4422o.add(interfaceC1521u);
    }

    /* renamed from: f0 */
    public Fragment m35941f0(int i) {
        return this.f4410c.m35850g(i);
    }

    /* renamed from: g */
    public void m35939g(InterfaceC1443m interfaceC1443m) {
        if (this.f4420m == null) {
            this.f4420m = new ArrayList<>();
        }
        this.f4420m.add(interfaceC1443m);
    }

    /* renamed from: g0 */
    public Fragment m35938g0(String str) {
        return this.f4410c.m35849h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void m35937g1(Fragment fragment) {
        this.f4405K.m35615k(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m35936h(Fragment fragment) {
        this.f4405K.m35625a(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public Fragment m35935h0(String str) {
        return this.f4410c.m35848i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m35933i() {
        return this.f4416i.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void m35931i1(Parcelable parcelable) {
        C1511s c1511s;
        ArrayList<C1524x> arrayList;
        C1526y c1526y;
        if (parcelable == null || (arrayList = (c1511s = (C1511s) parcelable).f4636c) == null) {
            return;
        }
        this.f4410c.m35833x(arrayList);
        this.f4410c.m35835v();
        Iterator<String> it = c1511s.f4637d.iterator();
        while (it.hasNext()) {
            C1524x m35857B = this.f4410c.m35857B(it.next(), null);
            if (m35857B != null) {
                Fragment m35621e = this.f4405K.m35621e(m35857B.f4678d);
                if (m35621e != null) {
                    if (m35996G0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m35621e);
                    }
                    c1526y = new C1526y(this.f4421n, this.f4410c, m35621e, m35857B);
                } else {
                    c1526y = new C1526y(this.f4421n, this.f4410c, this.f4424q.m35677f().getClassLoader(), m35905r0(), m35857B);
                }
                Fragment m35597k = c1526y.m35597k();
                m35597k.mFragmentManager = this;
                if (m35996G0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m35597k.mWho + "): " + m35597k);
                }
                c1526y.m35593o(this.f4424q.m35677f().getClassLoader());
                this.f4410c.m35839r(c1526y);
                c1526y.m35587u(this.f4423p);
            }
        }
        for (Fragment fragment : this.f4405K.m35618h()) {
            if (!this.f4410c.m35854c(fragment.mWho)) {
                if (m35996G0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + c1511s.f4637d);
                }
                this.f4405K.m35615k(fragment);
                fragment.mFragmentManager = this;
                C1526y c1526y2 = new C1526y(this.f4421n, this.f4410c, fragment);
                c1526y2.m35587u(1);
                c1526y2.m35595m();
                fragment.mRemoving = true;
                c1526y2.m35595m();
            }
        }
        this.f4410c.m35834w(c1511s.f4638e);
        if (c1511s.f4639f != null) {
            this.f4411d = new ArrayList<>(c1511s.f4639f.length);
            int i = 0;
            while (true) {
                C1461e[] c1461eArr = c1511s.f4639f;
                if (i >= c1461eArr.length) {
                    break;
                }
                C1453d m35787b = c1461eArr[i].m35787b(this);
                if (m35996G0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + m35787b.f4491t + "): " + m35787b);
                    PrintWriter printWriter = new PrintWriter(new C1485h0("FragmentManager"));
                    m35787b.m35793z("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4411d.add(m35787b);
                i++;
            }
        } else {
            this.f4411d = null;
        }
        this.f4416i.set(c1511s.f4640w);
        String str = c1511s.f4641x;
        if (str != null) {
            Fragment m35947d0 = m35947d0(str);
            this.f4427t = m35947d0;
            m35991J(m35947d0);
        }
        ArrayList<String> arrayList2 = c1511s.f4642y;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.f4417j.put(arrayList2.get(i2), c1511s.f4643z.get(i2));
            }
        }
        ArrayList<String> arrayList3 = c1511s.f4633A;
        if (arrayList3 != null) {
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                Bundle bundle = c1511s.f4634B.get(i3);
                bundle.setClassLoader(this.f4424q.m35677f().getClassLoader());
                this.f4418k.put(arrayList3.get(i3), bundle);
            }
        }
        this.f4396B = new ArrayDeque<>(c1511s.f4635C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m35930j(AbstractC1505o<?> abstractC1505o, AbstractC1499k abstractC1499k, Fragment fragment) {
        String str;
        if (this.f4424q == null) {
            this.f4424q = abstractC1505o;
            this.f4425r = abstractC1499k;
            this.f4426s = fragment;
            if (fragment != null) {
                m35942f(new C1434e(this, fragment));
            } else if (abstractC1505o instanceof InterfaceC1521u) {
                m35942f((InterfaceC1521u) abstractC1505o);
            }
            if (this.f4426s != null) {
                m35886x1();
            }
            if (abstractC1505o instanceof androidx.activity.c) {
                androidx.lifecycle.o oVar = (androidx.activity.c) abstractC1505o;
                this.f4414g = oVar.getOnBackPressedDispatcher();
                if (fragment != null) {
                    oVar = fragment;
                }
                this.f4414g.m37880a(oVar, this.f4415h);
            }
            if (fragment != null) {
                this.f4405K = fragment.mFragmentManager.m35917n0(fragment);
            } else if (abstractC1505o instanceof androidx.lifecycle.j0) {
                this.f4405K = C1519t.m35619g(((androidx.lifecycle.j0) abstractC1505o).getViewModelStore());
            } else {
                this.f4405K = new C1519t(false);
            }
            this.f4405K.m35614l(m35984M0());
            this.f4410c.m35858A(this.f4405K);
            androidx.savedstate.c cVar = this.f4424q;
            if ((cVar instanceof androidx.savedstate.c) && fragment == null) {
                SavedStateRegistry savedStateRegistry = cVar.getSavedStateRegistry();
                savedStateRegistry.m34396d("android:support:fragments", new SavedStateRegistry.InterfaceC1866b() { // from class: androidx.fragment.app.c
                    @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1866b
                    public final Bundle saveState() {
                        return FragmentManager.this.m35982N0();
                    }
                });
                Bundle m34399a = savedStateRegistry.m34399a("android:support:fragments");
                if (m34399a != null) {
                    m35931i1(m34399a.getParcelable("android:support:fragments"));
                }
            }
            androidx.activity.result.d dVar = this.f4424q;
            if (dVar instanceof androidx.activity.result.d) {
                ActivityResultRegistry activityResultRegistry = dVar.getActivityResultRegistry();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f4432y = activityResultRegistry.m37864i(str2 + "StartActivityForResult", new C0911c(), new C1435f());
                this.f4433z = activityResultRegistry.m37864i(str2 + "StartIntentSenderForResult", new C1438i(), new C1436g());
                this.f4395A = activityResultRegistry.m37864i(str2 + "RequestPermissions", new C0910b(), new C1437h());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m35927k(Fragment fragment) {
        if (m35996G0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f4410c.m35856a(fragment);
            if (m35996G0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m35994H0(fragment)) {
                this.f4397C = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1 */
    public Parcelable m35925k1() {
        int size;
        m35926k0();
        m35967V();
        m35961Y(true);
        this.f4398D = true;
        this.f4405K.m35614l(true);
        ArrayList<String> m35832y = this.f4410c.m35832y();
        ArrayList<C1524x> m35844m = this.f4410c.m35844m();
        C1461e[] c1461eArr = null;
        if (m35844m.isEmpty()) {
            if (m35996G0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> m35831z = this.f4410c.m35831z();
        ArrayList<C1453d> arrayList = this.f4411d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            c1461eArr = new C1461e[size];
            for (int i = 0; i < size; i++) {
                c1461eArr[i] = new C1461e(this.f4411d.get(i));
                if (m35996G0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f4411d.get(i));
                }
            }
        }
        C1511s c1511s = new C1511s();
        c1511s.f4636c = m35844m;
        c1511s.f4637d = m35832y;
        c1511s.f4638e = m35831z;
        c1511s.f4639f = c1461eArr;
        c1511s.f4640w = this.f4416i.get();
        Fragment fragment = this.f4427t;
        if (fragment != null) {
            c1511s.f4641x = fragment.mWho;
        }
        c1511s.f4642y.addAll(this.f4417j.keySet());
        c1511s.f4643z.addAll(this.f4417j.values());
        c1511s.f4633A.addAll(this.f4418k.keySet());
        c1511s.f4634B.addAll(this.f4418k.values());
        c1511s.f4635C = new ArrayList<>(this.f4396B);
        return c1511s;
    }

    /* renamed from: l */
    public AbstractC1449b0 m35924l() {
        return new C1453d(this);
    }

    /* renamed from: l1 */
    public Fragment.C1427l m35922l1(Fragment fragment) {
        C1526y m35843n = this.f4410c.m35843n(fragment.mWho);
        if (m35843n != null && m35843n.m35597k().equals(fragment)) {
            return m35843n.m35590r();
        }
        m35892v1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* renamed from: m */
    boolean m35921m() {
        boolean z = false;
        for (Fragment fragment : this.f4410c.m35845l()) {
            if (fragment != null) {
                z = m35994H0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m0 */
    public int m35920m0() {
        ArrayList<C1453d> arrayList = this.f4411d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: m1 */
    void m35919m1() {
        synchronized (this.f4408a) {
            boolean z = true;
            if (this.f4408a.size() != 1) {
                z = false;
            }
            if (z) {
                this.f4424q.m35676g().removeCallbacks(this.f4407M);
                this.f4424q.m35676g().post(this.f4407M);
                m35886x1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void m35916n1(Fragment fragment, boolean z) {
        ViewGroup m35908q0 = m35908q0(fragment);
        if (m35908q0 == null || !(m35908q0 instanceof C1501l)) {
            return;
        }
        ((C1501l) m35908q0).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0 */
    public AbstractC1499k m35914o0() {
        return this.f4425r;
    }

    /* renamed from: o1 */
    public final void m35913o1(String str, Bundle bundle) {
        C1442l c1442l = this.f4419l.get(str);
        if (c1442l != null && c1442l.m35861b(AbstractC1565i.c.f)) {
            c1442l.mo35611a(str, bundle);
        } else {
            this.f4418k.put(str, bundle);
        }
        if (m35996G0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* renamed from: p0 */
    public Fragment m35911p0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment m35947d0 = m35947d0(string);
        if (m35947d0 != null) {
            return m35947d0;
        }
        m35892v1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    /* renamed from: p1 */
    public final void m35910p1(final String str, androidx.lifecycle.o oVar, final InterfaceC1523w interfaceC1523w) {
        final AbstractC1565i lifecycle = oVar.getLifecycle();
        if (lifecycle.mo35505b() == AbstractC1565i.c.c) {
            return;
        }
        InterfaceC1572l interfaceC1572l = new InterfaceC1572l() { // from class: androidx.fragment.app.FragmentManager.5
            @Override // androidx.lifecycle.InterfaceC1572l
            /* renamed from: m */
            public void mo34271m(androidx.lifecycle.o oVar2, AbstractC1565i.b bVar) {
                Bundle bundle;
                if (bVar == AbstractC1565i.b.ON_START && (bundle = (Bundle) FragmentManager.this.f4418k.get(str)) != null) {
                    interfaceC1523w.mo35611a(str, bundle);
                    FragmentManager.this.m35909q(str);
                }
                if (bVar == AbstractC1565i.b.ON_DESTROY) {
                    lifecycle.mo35504c(this);
                    FragmentManager.this.f4419l.remove(str);
                }
            }
        };
        lifecycle.mo35506a(interfaceC1572l);
        C1442l put = this.f4419l.put(str, new C1442l(lifecycle, interfaceC1523w, interfaceC1572l));
        if (put != null) {
            put.m35860c();
        }
        if (m35996G0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + interfaceC1523w);
        }
    }

    /* renamed from: q */
    public final void m35909q(String str) {
        this.f4418k.remove(str);
        if (m35996G0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void m35907q1(Fragment fragment, AbstractC1565i.c cVar) {
        if (fragment.equals(m35947d0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: r0 */
    public C1504n m35905r0() {
        C1504n c1504n = this.f4428u;
        if (c1504n != null) {
            return c1504n;
        }
        Fragment fragment = this.f4426s;
        if (fragment != null) {
            return fragment.mFragmentManager.m35905r0();
        }
        return this.f4429v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void m35904r1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(m35947d0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f4427t;
        this.f4427t = fragment;
        m35991J(fragment2);
        m35991J(this.f4427t);
    }

    /* renamed from: s0 */
    public List<Fragment> m35902s0() {
        return this.f4410c.m35842o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public C1526y m35900t(Fragment fragment) {
        C1526y m35843n = this.f4410c.m35843n(fragment.mWho);
        if (m35843n != null) {
            return m35843n;
        }
        C1526y c1526y = new C1526y(this.f4421n, this.f4410c, fragment);
        c1526y.m35593o(this.f4424q.m35677f().getClassLoader());
        c1526y.m35587u(this.f4423p);
        return c1526y;
    }

    /* renamed from: t0 */
    public AbstractC1505o<?> m35899t0() {
        return this.f4424q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void m35898t1(Fragment fragment) {
        if (m35996G0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f4426s;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4426s)));
            sb.append("}");
        } else {
            AbstractC1505o<?> abstractC1505o = this.f4424q;
            if (abstractC1505o != null) {
                sb.append(abstractC1505o.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f4424q)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m35897u(Fragment fragment) {
        if (m35996G0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m35996G0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f4410c.m35836u(fragment);
            if (m35994H0(fragment)) {
                this.f4397C = true;
            }
            m35901s1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public LayoutInflater.Factory2 m35896u0() {
        return this.f4413f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m35894v() {
        this.f4398D = false;
        this.f4399E = false;
        this.f4405K.m35614l(false);
        m35977Q(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public C1508q m35893v0() {
        return this.f4421n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m35891w() {
        this.f4398D = false;
        this.f4399E = false;
        this.f4405K.m35614l(false);
        m35977Q(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public Fragment m35890w0() {
        return this.f4426s;
    }

    /* renamed from: w1 */
    public void m35889w1(AbstractC1439j abstractC1439j) {
        this.f4421n.m35652p(abstractC1439j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m35888x(Configuration configuration) {
        for (Fragment fragment : this.f4410c.m35842o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: x0 */
    public Fragment m35887x0() {
        return this.f4427t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m35885y(MenuItem menuItem) {
        if (this.f4423p < 1) {
            return false;
        }
        for (Fragment fragment : this.f4410c.m35842o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public InterfaceC1498j0 m35884y0() {
        InterfaceC1498j0 interfaceC1498j0 = this.f4430w;
        if (interfaceC1498j0 != null) {
            return interfaceC1498j0;
        }
        Fragment fragment = this.f4426s;
        if (fragment != null) {
            return fragment.mFragmentManager.m35884y0();
        }
        return this.f4431x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m35883z() {
        this.f4398D = false;
        this.f4399E = false;
        this.f4405K.m35614l(false);
        m35977Q(1);
    }

    /* renamed from: z0 */
    public C1515c.C1518c m35882z0() {
        return this.f4406L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$k */
    /* loaded from: classes2.dex */
    public static class C1440k implements Parcelable {
        public static final Parcelable.Creator<C1440k> CREATOR = new C1441a();

        /* renamed from: c */
        String f4445c;

        /* renamed from: d */
        int f4446d;

        /* renamed from: androidx.fragment.app.FragmentManager$k$a */
        /* loaded from: classes2.dex */
        class C1441a implements Parcelable.Creator<C1440k> {
            C1441a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1440k createFromParcel(Parcel parcel) {
                return new C1440k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1440k[] newArray(int i) {
                return new C1440k[i];
            }
        }

        C1440k(String str, int i) {
            this.f4445c = str;
            this.f4446d = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f4445c);
            parcel.writeInt(this.f4446d);
        }

        C1440k(Parcel parcel) {
            this.f4445c = parcel.readString();
            this.f4446d = parcel.readInt();
        }
    }
}
