package io.intercom.com.bumptech.glide.load.engine;

import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import java.io.File;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataCacheGenerator.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.b */
/* loaded from: classes3.dex */
public class C10526b implements InterfaceC10530e, InterfaceC10631b.InterfaceC10632a<Object> {

    /* renamed from: A */
    private File f24148A;

    /* renamed from: c */
    private final List<InterfaceC10622g> f24149c;

    /* renamed from: d */
    private final C10532f<?> f24150d;

    /* renamed from: e */
    private final InterfaceC10530e.InterfaceC10531a f24151e;

    /* renamed from: f */
    private int f24152f;

    /* renamed from: w */
    private InterfaceC10622g f24153w;

    /* renamed from: x */
    private List<InterfaceC10697n<File, ?>> f24154x;

    /* renamed from: y */
    private int f24155y;

    /* renamed from: z */
    private volatile InterfaceC10697n.C10698a<?> f24156z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10526b(C10532f<?> c10532f, InterfaceC10530e.InterfaceC10531a interfaceC10531a) {
        this(c10532f.m12834c(), c10532f, interfaceC10531a);
    }

    /* renamed from: b */
    private boolean m12837b() {
        return this.f24155y < this.f24154x.size();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e
    /* renamed from: a */
    public boolean mo12719a() {
        while (true) {
            boolean z = false;
            if (this.f24154x != null && m12837b()) {
                this.f24156z = null;
                while (!z && m12837b()) {
                    List<InterfaceC10697n<File, ?>> list = this.f24154x;
                    int i = this.f24155y;
                    this.f24155y = i + 1;
                    this.f24156z = list.get(i).mo12456b(this.f24148A, this.f24150d.m12820q(), this.f24150d.m12831f(), this.f24150d.m12827j());
                    if (this.f24156z != null && this.f24150d.m12819r(this.f24156z.f24507c.mo12474a())) {
                        this.f24156z.f24507c.mo12472e(this.f24150d.m12826k(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f24152f + 1;
            this.f24152f = i2;
            if (i2 >= this.f24149c.size()) {
                return false;
            }
            InterfaceC10622g interfaceC10622g = this.f24149c.get(this.f24152f);
            File mo12637a = this.f24150d.m12833d().mo12637a(new C10528c(interfaceC10622g, this.f24150d.m12823n()));
            this.f24148A = mo12637a;
            if (mo12637a != null) {
                this.f24153w = interfaceC10622g;
                this.f24154x = this.f24150d.m12828i(mo12637a);
                this.f24155y = 0;
            }
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b.InterfaceC10632a
    /* renamed from: c */
    public void mo12497c(Exception exc) {
        this.f24151e.mo12717e(this.f24153w, exc, this.f24156z.f24507c, EnumC10507a.DATA_DISK_CACHE);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e
    public void cancel() {
        InterfaceC10697n.C10698a<?> c10698a = this.f24156z;
        if (c10698a != null) {
            c10698a.f24507c.cancel();
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b.InterfaceC10632a
    /* renamed from: d */
    public void mo12496d(Object obj) {
        this.f24151e.mo12714h(this.f24153w, obj, this.f24156z.f24507c, EnumC10507a.DATA_DISK_CACHE, this.f24153w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10526b(List<InterfaceC10622g> list, C10532f<?> c10532f, InterfaceC10530e.InterfaceC10531a interfaceC10531a) {
        this.f24152f = -1;
        this.f24149c = list;
        this.f24150d = c10532f;
        this.f24151e = interfaceC10531a;
    }
}
