package p201g.p266v;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p201g.p266v.AbstractC8160m;
/* compiled from: TransitionSet.java */
/* renamed from: g.v.q */
/* loaded from: classes2.dex */
public class C8173q extends AbstractC8160m {

    /* renamed from: d0 */
    int f19619d0;

    /* renamed from: b0 */
    private ArrayList<AbstractC8160m> f19617b0 = new ArrayList<>();

    /* renamed from: c0 */
    private boolean f19618c0 = true;

    /* renamed from: e0 */
    boolean f19620e0 = false;

    /* renamed from: f0 */
    private int f19621f0 = 0;

    /* compiled from: TransitionSet.java */
    /* renamed from: g.v.q$a */
    /* loaded from: classes2.dex */
    class C8174a extends C8168n {

        /* renamed from: c */
        final /* synthetic */ AbstractC8160m f19622c;

        C8174a(C8173q c8173q, AbstractC8160m abstractC8160m) {
            this.f19622c = abstractC8160m;
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: c */
        public void mo16576c(AbstractC8160m abstractC8160m) {
            this.f19622c.mo16605U();
            abstractC8160m.mo16608Q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransitionSet.java */
    /* renamed from: g.v.q$b */
    /* loaded from: classes2.dex */
    public static class C8175b extends C8168n {

        /* renamed from: c */
        C8173q f19623c;

        C8175b(C8173q c8173q) {
            this.f19623c = c8173q;
        }

        @Override // p201g.p266v.C8168n, p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: a */
        public void mo16577a(AbstractC8160m abstractC8160m) {
            C8173q c8173q = this.f19623c;
            if (c8173q.f19620e0) {
                return;
            }
            c8173q.m16638d0();
            this.f19623c.f19620e0 = true;
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: c */
        public void mo16576c(AbstractC8160m abstractC8160m) {
            C8173q c8173q = this.f19623c;
            int i = c8173q.f19619d0 - 1;
            c8173q.f19619d0 = i;
            if (i == 0) {
                c8173q.f19620e0 = false;
                c8173q.m16632p();
            }
            abstractC8160m.mo16608Q(this);
        }
    }

    /* renamed from: j0 */
    private void m16589j0(AbstractC8160m abstractC8160m) {
        this.f19617b0.add(abstractC8160m);
        abstractC8160m.f19579J = this;
    }

    /* renamed from: t0 */
    private void m16578t0() {
        C8175b c8175b = new C8175b(this);
        Iterator<AbstractC8160m> it = this.f19617b0.iterator();
        while (it.hasNext()) {
            it.next().mo16601a(c8175b);
        }
        this.f19619d0 = this.f19617b0.size();
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: O */
    public void mo16609O(View view) {
        super.mo16609O(view);
        int size = this.f19617b0.size();
        for (int i = 0; i < size; i++) {
            this.f19617b0.get(i).mo16609O(view);
        }
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: S */
    public void mo16606S(View view) {
        super.mo16606S(view);
        int size = this.f19617b0.size();
        for (int i = 0; i < size; i++) {
            this.f19617b0.get(i).mo16606S(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: U */
    public void mo16605U() {
        if (this.f19617b0.isEmpty()) {
            m16638d0();
            m16632p();
            return;
        }
        m16578t0();
        if (!this.f19618c0) {
            for (int i = 1; i < this.f19617b0.size(); i++) {
                this.f19617b0.get(i - 1).mo16601a(new C8174a(this, this.f19617b0.get(i)));
            }
            AbstractC8160m abstractC8160m = this.f19617b0.get(0);
            if (abstractC8160m != null) {
                abstractC8160m.mo16605U();
                return;
            }
            return;
        }
        Iterator<AbstractC8160m> it = this.f19617b0.iterator();
        while (it.hasNext()) {
            it.next().mo16605U();
        }
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: W */
    public /* bridge */ /* synthetic */ AbstractC8160m mo16604W(long j) {
        m16582p0(j);
        return this;
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: X */
    public void mo16603X(AbstractC8160m.AbstractC8165e abstractC8165e) {
        super.mo16603X(abstractC8165e);
        this.f19621f0 |= 8;
        int size = this.f19617b0.size();
        for (int i = 0; i < size; i++) {
            this.f19617b0.get(i).mo16603X(abstractC8165e);
        }
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: a0 */
    public void mo16600a0(AbstractC8145g abstractC8145g) {
        super.mo16600a0(abstractC8145g);
        this.f19621f0 |= 4;
        if (this.f19617b0 != null) {
            for (int i = 0; i < this.f19617b0.size(); i++) {
                this.f19617b0.get(i).mo16600a0(abstractC8145g);
            }
        }
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: b0 */
    public void mo16598b0(AbstractC8172p abstractC8172p) {
        super.mo16598b0(abstractC8172p);
        this.f19621f0 |= 2;
        int size = this.f19617b0.size();
        for (int i = 0; i < size; i++) {
            this.f19617b0.get(i).mo16598b0(abstractC8172p);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p201g.p266v.AbstractC8160m
    public void cancel() {
        super.cancel();
        int size = this.f19617b0.size();
        for (int i = 0; i < size; i++) {
            this.f19617b0.get(i).cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: e0 */
    public String mo16596e0(String str) {
        String mo16596e0 = super.mo16596e0(str);
        for (int i = 0; i < this.f19617b0.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo16596e0);
            sb.append("\n");
            sb.append(this.f19617b0.get(i).mo16596e0(str + "  "));
            mo16596e0 = sb.toString();
        }
        return mo16596e0;
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: f */
    public void mo16595f(C8177s c8177s) {
        if (m16649G(c8177s.f19628b)) {
            Iterator<AbstractC8160m> it = this.f19617b0.iterator();
            while (it.hasNext()) {
                AbstractC8160m next = it.next();
                if (next.m16649G(c8177s.f19628b)) {
                    next.mo16595f(c8177s);
                    c8177s.f19629c.add(next);
                }
            }
        }
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: f0 */
    public C8173q mo16601a(AbstractC8160m.InterfaceC8166f interfaceC8166f) {
        super.mo16601a(interfaceC8166f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: h */
    public void mo16593h(C8177s c8177s) {
        super.mo16593h(c8177s);
        int size = this.f19617b0.size();
        for (int i = 0; i < size; i++) {
            this.f19617b0.get(i).mo16593h(c8177s);
        }
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: h0 */
    public C8173q mo16599b(View view) {
        for (int i = 0; i < this.f19617b0.size(); i++) {
            this.f19617b0.get(i).mo16599b(view);
        }
        super.mo16599b(view);
        return this;
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: i */
    public void mo16591i(C8177s c8177s) {
        if (m16649G(c8177s.f19628b)) {
            Iterator<AbstractC8160m> it = this.f19617b0.iterator();
            while (it.hasNext()) {
                AbstractC8160m next = it.next();
                if (next.m16649G(c8177s.f19628b)) {
                    next.mo16591i(c8177s);
                    c8177s.f19629c.add(next);
                }
            }
        }
    }

    /* renamed from: i0 */
    public C8173q m16590i0(AbstractC8160m abstractC8160m) {
        m16589j0(abstractC8160m);
        long j = this.f19596e;
        if (j >= 0) {
            abstractC8160m.mo16604W(j);
        }
        if ((this.f19621f0 & 1) != 0) {
            abstractC8160m.mo16602Y(m16629s());
        }
        if ((this.f19621f0 & 2) != 0) {
            abstractC8160m.mo16598b0(m16625w());
        }
        if ((this.f19621f0 & 4) != 0) {
            abstractC8160m.mo16600a0(m16626v());
        }
        if ((this.f19621f0 & 8) != 0) {
            abstractC8160m.mo16603X(m16630r());
        }
        return this;
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: l */
    public AbstractC8160m clone() {
        C8173q c8173q = (C8173q) super.clone();
        c8173q.f19617b0 = new ArrayList<>();
        int size = this.f19617b0.size();
        for (int i = 0; i < size; i++) {
            c8173q.m16589j0(this.f19617b0.get(i).clone());
        }
        return c8173q;
    }

    /* renamed from: l0 */
    public AbstractC8160m m16587l0(int i) {
        if (i < 0 || i >= this.f19617b0.size()) {
            return null;
        }
        return this.f19617b0.get(i);
    }

    /* renamed from: m0 */
    public int m16586m0() {
        return this.f19617b0.size();
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: n0 */
    public C8173q mo16608Q(AbstractC8160m.InterfaceC8166f interfaceC8166f) {
        super.mo16608Q(interfaceC8166f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: o */
    public void mo16584o(ViewGroup viewGroup, C8178t c8178t, C8178t c8178t2, ArrayList<C8177s> arrayList, ArrayList<C8177s> arrayList2) {
        long m16623y = m16623y();
        int size = this.f19617b0.size();
        for (int i = 0; i < size; i++) {
            AbstractC8160m abstractC8160m = this.f19617b0.get(i);
            if (m16623y > 0 && (this.f19618c0 || i == 0)) {
                long m16623y2 = abstractC8160m.m16623y();
                if (m16623y2 > 0) {
                    abstractC8160m.mo16597c0(m16623y2 + m16623y);
                } else {
                    abstractC8160m.mo16597c0(m16623y);
                }
            }
            abstractC8160m.mo16584o(viewGroup, c8178t, c8178t2, arrayList, arrayList2);
        }
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: o0 */
    public C8173q mo16607R(View view) {
        for (int i = 0; i < this.f19617b0.size(); i++) {
            this.f19617b0.get(i).mo16607R(view);
        }
        super.mo16607R(view);
        return this;
    }

    /* renamed from: p0 */
    public C8173q m16582p0(long j) {
        ArrayList<AbstractC8160m> arrayList;
        super.mo16604W(j);
        if (this.f19596e >= 0 && (arrayList = this.f19617b0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f19617b0.get(i).mo16604W(j);
            }
        }
        return this;
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: q0 */
    public C8173q mo16602Y(TimeInterpolator timeInterpolator) {
        this.f19621f0 |= 1;
        ArrayList<AbstractC8160m> arrayList = this.f19617b0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f19617b0.get(i).mo16602Y(timeInterpolator);
            }
        }
        super.mo16602Y(timeInterpolator);
        return this;
    }

    /* renamed from: r0 */
    public C8173q m16580r0(int i) {
        if (i == 0) {
            this.f19618c0 = true;
        } else if (i == 1) {
            this.f19618c0 = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: s0 */
    public C8173q mo16597c0(long j) {
        super.mo16597c0(j);
        return this;
    }
}
