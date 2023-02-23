package io.intercom.com.bumptech.glide.load.engine;

import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import java.io.File;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourceCacheGenerator.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.u */
/* loaded from: classes3.dex */
public class C10570u implements InterfaceC10530e, InterfaceC10631b.InterfaceC10632a<Object> {

    /* renamed from: A */
    private File f24314A;

    /* renamed from: B */
    private C10571v f24315B;

    /* renamed from: c */
    private final InterfaceC10530e.InterfaceC10531a f24316c;

    /* renamed from: d */
    private final C10532f<?> f24317d;

    /* renamed from: e */
    private int f24318e = 0;

    /* renamed from: f */
    private int f24319f = -1;

    /* renamed from: w */
    private InterfaceC10622g f24320w;

    /* renamed from: x */
    private List<InterfaceC10697n<File, ?>> f24321x;

    /* renamed from: y */
    private int f24322y;

    /* renamed from: z */
    private volatile InterfaceC10697n.C10698a<?> f24323z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10570u(C10532f<?> c10532f, InterfaceC10530e.InterfaceC10531a interfaceC10531a) {
        this.f24317d = c10532f;
        this.f24316c = interfaceC10531a;
    }

    /* renamed from: b */
    private boolean m12722b() {
        return this.f24322y < this.f24321x.size();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e
    /* renamed from: a */
    public boolean mo12719a() {
        List<InterfaceC10622g> m12834c = this.f24317d.m12834c();
        boolean z = false;
        if (m12834c.isEmpty()) {
            return false;
        }
        List<Class<?>> m12825l = this.f24317d.m12825l();
        while (true) {
            if (this.f24321x != null && m12722b()) {
                this.f24323z = null;
                while (!z && m12722b()) {
                    List<InterfaceC10697n<File, ?>> list = this.f24321x;
                    int i = this.f24322y;
                    this.f24322y = i + 1;
                    this.f24323z = list.get(i).mo12456b(this.f24314A, this.f24317d.m12820q(), this.f24317d.m12831f(), this.f24317d.m12827j());
                    if (this.f24323z != null && this.f24317d.m12819r(this.f24323z.f24507c.mo12474a())) {
                        this.f24323z.f24507c.mo12472e(this.f24317d.m12826k(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f24319f + 1;
            this.f24319f = i2;
            if (i2 >= m12825l.size()) {
                int i3 = this.f24318e + 1;
                this.f24318e = i3;
                if (i3 >= m12834c.size()) {
                    return false;
                }
                this.f24319f = 0;
            }
            InterfaceC10622g interfaceC10622g = m12834c.get(this.f24318e);
            Class<?> cls = m12825l.get(this.f24319f);
            this.f24315B = new C10571v(this.f24317d.m12835b(), interfaceC10622g, this.f24317d.m12823n(), this.f24317d.m12820q(), this.f24317d.m12831f(), this.f24317d.m12821p(cls), cls, this.f24317d.m12827j());
            File mo12637a = this.f24317d.m12833d().mo12637a(this.f24315B);
            this.f24314A = mo12637a;
            if (mo12637a != null) {
                this.f24320w = interfaceC10622g;
                this.f24321x = this.f24317d.m12828i(mo12637a);
                this.f24322y = 0;
            }
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b.InterfaceC10632a
    /* renamed from: c */
    public void mo12497c(Exception exc) {
        this.f24316c.mo12717e(this.f24315B, exc, this.f24323z.f24507c, EnumC10507a.RESOURCE_DISK_CACHE);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e
    public void cancel() {
        InterfaceC10697n.C10698a<?> c10698a = this.f24323z;
        if (c10698a != null) {
            c10698a.f24507c.cancel();
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b.InterfaceC10632a
    /* renamed from: d */
    public void mo12496d(Object obj) {
        this.f24316c.mo12714h(this.f24320w, obj, this.f24323z.f24507c, EnumC10507a.RESOURCE_DISK_CACHE, this.f24315B);
    }
}
