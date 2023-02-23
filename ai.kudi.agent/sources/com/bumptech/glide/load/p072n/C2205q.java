package com.bumptech.glide.load.p072n;

import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.p086q.C2380j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: MultiModelLoader.java */
/* renamed from: com.bumptech.glide.load.n.q */
/* loaded from: classes2.dex */
class C2205q<Model, Data> implements InterfaceC2199n<Model, Data> {

    /* renamed from: a */
    private final List<InterfaceC2199n<Model, Data>> f6518a;

    /* renamed from: b */
    private final InterfaceC7672e<List<Throwable>> f6519b;

    /* compiled from: MultiModelLoader.java */
    /* renamed from: com.bumptech.glide.load.n.q$a */
    /* loaded from: classes2.dex */
    static class C2206a<Data> implements InterfaceC2130d<Data>, InterfaceC2130d.InterfaceC2131a<Data> {

        /* renamed from: c */
        private final List<InterfaceC2130d<Data>> f6520c;

        /* renamed from: d */
        private final InterfaceC7672e<List<Throwable>> f6521d;

        /* renamed from: e */
        private int f6522e;

        /* renamed from: f */
        private EnumC1949f f6523f;

        /* renamed from: w */
        private InterfaceC2130d.InterfaceC2131a<? super Data> f6524w;

        /* renamed from: x */
        private List<Throwable> f6525x;

        /* renamed from: y */
        private boolean f6526y;

        C2206a(List<InterfaceC2130d<Data>> list, InterfaceC7672e<List<Throwable>> interfaceC7672e) {
            this.f6521d = interfaceC7672e;
            C2380j.m33130c(list);
            this.f6520c = list;
            this.f6522e = 0;
        }

        /* renamed from: f */
        private void m33544f() {
            if (this.f6526y) {
                return;
            }
            if (this.f6522e < this.f6520c.size() - 1) {
                this.f6522e++;
                mo33503e(this.f6523f, this.f6524w);
                return;
            }
            C2380j.m33129d(this.f6525x);
            this.f6524w.mo33546c(new GlideException("Fetch failed", new ArrayList(this.f6525x)));
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: a */
        public Class<Data> mo33507a() {
            return this.f6520c.get(0).mo33507a();
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: b */
        public void mo33506b() {
            List<Throwable> list = this.f6525x;
            if (list != null) {
                this.f6521d.mo11983a(list);
            }
            this.f6525x = null;
            for (InterfaceC2130d<Data> interfaceC2130d : this.f6520c) {
                interfaceC2130d.mo33506b();
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d.InterfaceC2131a
        /* renamed from: c */
        public void mo33546c(Exception exc) {
            List<Throwable> list = this.f6525x;
            C2380j.m33129d(list);
            list.add(exc);
            m33544f();
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public void cancel() {
            this.f6526y = true;
            for (InterfaceC2130d<Data> interfaceC2130d : this.f6520c) {
                interfaceC2130d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d.InterfaceC2131a
        /* renamed from: d */
        public void mo33545d(Data data) {
            if (data != null) {
                this.f6524w.mo33545d(data);
            } else {
                m33544f();
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: e */
        public void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super Data> interfaceC2131a) {
            this.f6523f = enumC1949f;
            this.f6524w = interfaceC2131a;
            this.f6525x = this.f6521d.mo11982b();
            this.f6520c.get(this.f6522e).mo33503e(enumC1949f, this);
            if (this.f6526y) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public EnumC1993a getDataSource() {
            return this.f6520c.get(0).getDataSource();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2205q(List<InterfaceC2199n<Model, Data>> list, InterfaceC7672e<List<Throwable>> interfaceC7672e) {
        this.f6518a = list;
        this.f6519b = interfaceC7672e;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: a */
    public boolean mo33500a(Model model) {
        for (InterfaceC2199n<Model, Data> interfaceC2199n : this.f6518a) {
            if (interfaceC2199n.mo33500a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: b */
    public InterfaceC2199n.C2200a<Data> mo33499b(Model model, int i, int i2, C2122h c2122h) {
        InterfaceC2199n.C2200a<Data> mo33499b;
        int size = this.f6518a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC2118f interfaceC2118f = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC2199n<Model, Data> interfaceC2199n = this.f6518a.get(i3);
            if (interfaceC2199n.mo33500a(model) && (mo33499b = interfaceC2199n.mo33499b(model, i, i2, c2122h)) != null) {
                interfaceC2118f = mo33499b.f6511a;
                arrayList.add(mo33499b.f6513c);
            }
        }
        if (arrayList.isEmpty() || interfaceC2118f == null) {
            return null;
        }
        return new InterfaceC2199n.C2200a<>(interfaceC2118f, new C2206a(arrayList, this.f6519b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f6518a.toArray()) + '}';
    }
}
