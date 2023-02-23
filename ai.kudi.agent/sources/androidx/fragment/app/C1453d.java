package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1565i;
import java.io.PrintWriter;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackStackRecord.java */
/* renamed from: androidx.fragment.app.d */
/* loaded from: classes2.dex */
public final class C1453d extends AbstractC1449b0 implements FragmentManager.InterfaceC1444n {

    /* renamed from: r */
    final FragmentManager f4489r;

    /* renamed from: s */
    boolean f4490s;

    /* renamed from: t */
    int f4491t;

    /* renamed from: u */
    boolean f4492u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1453d(FragmentManager fragmentManager) {
        super(fragmentManager.m35905r0(), fragmentManager.m35899t0() != null ? fragmentManager.m35899t0().m35677f().getClassLoader() : null);
        this.f4491t = -1;
        this.f4492u = false;
        this.f4489r = fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m35812A() {
        int size = this.f4460a.size();
        for (int i = 0; i < size; i++) {
            AbstractC1449b0.C1450a c1450a = this.f4460a.get(i);
            Fragment fragment = c1450a.f4478b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f4492u;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f4465f);
                fragment.setSharedElementNames(this.f4473n, this.f4474o);
            }
            switch (c1450a.f4477a) {
                case 1:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m35916n1(fragment, false);
                    this.f4489r.m35945e(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c1450a.f4477a);
                case 3:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m35943e1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m36002D0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m35916n1(fragment, false);
                    this.f4489r.m35898t1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m35897u(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m35916n1(fragment, false);
                    this.f4489r.m35927k(fragment);
                    break;
                case 8:
                    this.f4489r.m35904r1(fragment);
                    break;
                case 9:
                    this.f4489r.m35904r1(null);
                    break;
                case 10:
                    this.f4489r.m35907q1(fragment, c1450a.f4485i);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m35811B() {
        for (int size = this.f4460a.size() - 1; size >= 0; size--) {
            AbstractC1449b0.C1450a c1450a = this.f4460a.get(size);
            Fragment fragment = c1450a.f4478b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f4492u;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m35928j1(this.f4465f));
                fragment.setSharedElementNames(this.f4474o, this.f4473n);
            }
            switch (c1450a.f4477a) {
                case 1:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m35916n1(fragment, true);
                    this.f4489r.m35943e1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c1450a.f4477a);
                case 3:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m35945e(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m35898t1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m35916n1(fragment, true);
                    this.f4489r.m36002D0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m35927k(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c1450a.f4480d, c1450a.f4481e, c1450a.f4482f, c1450a.f4483g);
                    this.f4489r.m35916n1(fragment, true);
                    this.f4489r.m35897u(fragment);
                    break;
                case 8:
                    this.f4489r.m35904r1(null);
                    break;
                case 9:
                    this.f4489r.m35904r1(fragment);
                    break;
                case 10:
                    this.f4489r.m35907q1(fragment, c1450a.f4484h);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public Fragment m35810C(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f4460a.size()) {
            AbstractC1449b0.C1450a c1450a = this.f4460a.get(i);
            int i2 = c1450a.f4477a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = c1450a.f4478b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f4460a.add(i, new AbstractC1449b0.C1450a(9, fragment4, true));
                                    i++;
                                    fragment2 = null;
                                }
                                AbstractC1449b0.C1450a c1450a2 = new AbstractC1449b0.C1450a(3, fragment4, true);
                                c1450a2.f4480d = c1450a.f4480d;
                                c1450a2.f4482f = c1450a.f4482f;
                                c1450a2.f4481e = c1450a.f4481e;
                                c1450a2.f4483g = c1450a.f4483g;
                                this.f4460a.add(i, c1450a2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f4460a.remove(i);
                        i--;
                    } else {
                        c1450a.f4477a = 1;
                        c1450a.f4479c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(c1450a.f4478b);
                    Fragment fragment5 = c1450a.f4478b;
                    if (fragment5 == fragment2) {
                        this.f4460a.add(i, new AbstractC1449b0.C1450a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f4460a.add(i, new AbstractC1449b0.C1450a(9, fragment2, true));
                        c1450a.f4479c = true;
                        i++;
                        fragment2 = c1450a.f4478b;
                    }
                }
                i++;
            }
            arrayList.add(c1450a.f4478b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: D */
    public String m35809D() {
        return this.f4468i;
    }

    /* renamed from: E */
    public void m35808E() {
        if (this.f4476q != null) {
            for (int i = 0; i < this.f4476q.size(); i++) {
                this.f4476q.get(i).run();
            }
            this.f4476q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public Fragment m35807F(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f4460a.size() - 1; size >= 0; size--) {
            AbstractC1449b0.C1450a c1450a = this.f4460a.get(size);
            int i = c1450a.f4477a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c1450a.f4478b;
                            break;
                        case 10:
                            c1450a.f4485i = c1450a.f4484h;
                            break;
                    }
                }
                arrayList.add(c1450a.f4478b);
            }
            arrayList.remove(c1450a.f4478b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC1444n
    /* renamed from: a */
    public boolean mo35806a(ArrayList<C1453d> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f4466g) {
            this.f4489r.m35948d(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC1449b0
    /* renamed from: i */
    public int mo35805i() {
        return m35795x(false);
    }

    @Override // androidx.fragment.app.AbstractC1449b0
    /* renamed from: j */
    public int mo35804j() {
        return m35795x(true);
    }

    @Override // androidx.fragment.app.AbstractC1449b0
    /* renamed from: k */
    public void mo35803k() {
        m35822n();
        this.f4489r.m35959Z(this, false);
    }

    @Override // androidx.fragment.app.AbstractC1449b0
    /* renamed from: l */
    public void mo35802l() {
        m35822n();
        this.f4489r.m35959Z(this, true);
    }

    @Override // androidx.fragment.app.AbstractC1449b0
    /* renamed from: m */
    public AbstractC1449b0 mo35801m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f4489r) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        super.mo35801m(fragment);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.AbstractC1449b0
    /* renamed from: o */
    public void mo35800o(int i, Fragment fragment, String str, int i2) {
        super.mo35800o(i, fragment, str, i2);
        fragment.mFragmentManager = this.f4489r;
    }

    @Override // androidx.fragment.app.AbstractC1449b0
    /* renamed from: p */
    public boolean mo35799p() {
        return this.f4460a.isEmpty();
    }

    @Override // androidx.fragment.app.AbstractC1449b0
    /* renamed from: q */
    public AbstractC1449b0 mo35798q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f4489r) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        super.mo35798q(fragment);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4491t >= 0) {
            sb.append(" #");
            sb.append(this.f4491t);
        }
        if (this.f4468i != null) {
            sb.append(" ");
            sb.append(this.f4468i);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.AbstractC1449b0
    /* renamed from: u */
    public AbstractC1449b0 mo35797u(Fragment fragment, AbstractC1565i.c cVar) {
        if (fragment.mFragmentManager == this.f4489r) {
            if (cVar == AbstractC1565i.c.d && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
            } else if (cVar != AbstractC1565i.c.c) {
                super.mo35797u(fragment, cVar);
                return this;
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f4489r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m35796w(int i) {
        AbstractC1449b0.C1450a c1450a;
        if (this.f4466g) {
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f4460a.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f4460a.get(i2).f4478b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c1450a.f4478b + " to " + c1450a.f4478b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: x */
    int m35795x(boolean z) {
        if (!this.f4490s) {
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C1485h0("FragmentManager"));
                m35794y("  ", printWriter);
                printWriter.close();
            }
            this.f4490s = true;
            if (this.f4466g) {
                this.f4491t = this.f4489r.m35933i();
            } else {
                this.f4491t = -1;
            }
            this.f4489r.m35965W(this, z);
            return this.f4491t;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: y */
    public void m35794y(String str, PrintWriter printWriter) {
        m35793z(str, printWriter, true);
    }

    /* renamed from: z */
    public void m35793z(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4468i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4491t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4490s);
            if (this.f4465f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4465f));
            }
            if (this.f4461b != 0 || this.f4462c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4461b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4462c));
            }
            if (this.f4463d != 0 || this.f4464e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4463d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4464e));
            }
            if (this.f4469j != 0 || this.f4470k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4469j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4470k);
            }
            if (this.f4471l != 0 || this.f4472m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4471l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4472m);
            }
        }
        if (this.f4460a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f4460a.size();
        for (int i = 0; i < size; i++) {
            AbstractC1449b0.C1450a c1450a = this.f4460a.get(i);
            switch (c1450a.f4477a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c1450a.f4477a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c1450a.f4478b);
            if (z) {
                if (c1450a.f4480d != 0 || c1450a.f4481e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c1450a.f4480d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c1450a.f4481e));
                }
                if (c1450a.f4482f != 0 || c1450a.f4483g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c1450a.f4482f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c1450a.f4483g));
                }
            }
        }
    }
}
