package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.engine.InterfaceC2046f;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import java.io.File;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourceCacheGenerator.java */
/* renamed from: com.bumptech.glide.load.engine.v */
/* loaded from: classes2.dex */
public class C2088v implements InterfaceC2046f, InterfaceC2130d.InterfaceC2131a<Object> {

    /* renamed from: A */
    private File f6339A;

    /* renamed from: B */
    private C2089w f6340B;

    /* renamed from: c */
    private final InterfaceC2046f.InterfaceC2047a f6341c;

    /* renamed from: d */
    private final C2048g<?> f6342d;

    /* renamed from: e */
    private int f6343e;

    /* renamed from: f */
    private int f6344f = -1;

    /* renamed from: w */
    private InterfaceC2118f f6345w;

    /* renamed from: x */
    private List<InterfaceC2199n<File, ?>> f6346x;

    /* renamed from: y */
    private int f6347y;

    /* renamed from: z */
    private volatile InterfaceC2199n.C2200a<?> f6348z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2088v(C2048g<?> c2048g, InterfaceC2046f.InterfaceC2047a interfaceC2047a) {
        this.f6342d = c2048g;
        this.f6341c = interfaceC2047a;
    }

    /* renamed from: b */
    private boolean m33754b() {
        return this.f6347y < this.f6346x.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f
    /* renamed from: a */
    public boolean mo33751a() {
        List<InterfaceC2118f> m33876c = this.f6342d.m33876c();
        boolean z = false;
        if (m33876c.isEmpty()) {
            return false;
        }
        List<Class<?>> m33866m = this.f6342d.m33866m();
        if (m33866m.isEmpty()) {
            if (File.class.equals(this.f6342d.m33862q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f6342d.m33870i() + " to " + this.f6342d.m33862q());
        }
        while (true) {
            if (this.f6346x != null && m33754b()) {
                this.f6348z = null;
                while (!z && m33754b()) {
                    List<InterfaceC2199n<File, ?>> list = this.f6346x;
                    int i = this.f6347y;
                    this.f6347y = i + 1;
                    this.f6348z = list.get(i).mo33499b(this.f6339A, this.f6342d.m33860s(), this.f6342d.m33873f(), this.f6342d.m33868k());
                    if (this.f6348z != null && this.f6342d.m33859t(this.f6348z.f6513c.mo33507a())) {
                        this.f6348z.f6513c.mo33503e(this.f6342d.m33867l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f6344f + 1;
            this.f6344f = i2;
            if (i2 >= m33866m.size()) {
                int i3 = this.f6343e + 1;
                this.f6343e = i3;
                if (i3 >= m33876c.size()) {
                    return false;
                }
                this.f6344f = 0;
            }
            InterfaceC2118f interfaceC2118f = m33876c.get(this.f6343e);
            Class<?> cls = m33866m.get(this.f6344f);
            this.f6340B = new C2089w(this.f6342d.m33877b(), interfaceC2118f, this.f6342d.m33864o(), this.f6342d.m33860s(), this.f6342d.m33873f(), this.f6342d.m33861r(cls), cls, this.f6342d.m33868k());
            File mo33917b = this.f6342d.m33875d().mo33917b(this.f6340B);
            this.f6339A = mo33917b;
            if (mo33917b != null) {
                this.f6345w = interfaceC2118f;
                this.f6346x = this.f6342d.m33869j(mo33917b);
                this.f6347y = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d.InterfaceC2131a
    /* renamed from: c */
    public void mo33546c(Exception exc) {
        this.f6341c.mo33747e(this.f6340B, exc, this.f6348z.f6513c, EnumC1993a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f
    public void cancel() {
        InterfaceC2199n.C2200a<?> c2200a = this.f6348z;
        if (c2200a != null) {
            c2200a.f6513c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d.InterfaceC2131a
    /* renamed from: d */
    public void mo33545d(Object obj) {
        this.f6341c.mo33744h(this.f6345w, obj, this.f6348z.f6513c, EnumC1993a.RESOURCE_DISK_CACHE, this.f6340B);
    }
}
