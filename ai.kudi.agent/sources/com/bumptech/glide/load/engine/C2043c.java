package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.engine.InterfaceC2046f;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import java.io.File;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataCacheGenerator.java */
/* renamed from: com.bumptech.glide.load.engine.c */
/* loaded from: classes2.dex */
public class C2043c implements InterfaceC2046f, InterfaceC2130d.InterfaceC2131a<Object> {

    /* renamed from: A */
    private File f6162A;

    /* renamed from: c */
    private final List<InterfaceC2118f> f6163c;

    /* renamed from: d */
    private final C2048g<?> f6164d;

    /* renamed from: e */
    private final InterfaceC2046f.InterfaceC2047a f6165e;

    /* renamed from: f */
    private int f6166f;

    /* renamed from: w */
    private InterfaceC2118f f6167w;

    /* renamed from: x */
    private List<InterfaceC2199n<File, ?>> f6168x;

    /* renamed from: y */
    private int f6169y;

    /* renamed from: z */
    private volatile InterfaceC2199n.C2200a<?> f6170z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2043c(C2048g<?> c2048g, InterfaceC2046f.InterfaceC2047a interfaceC2047a) {
        this(c2048g.m33876c(), c2048g, interfaceC2047a);
    }

    /* renamed from: b */
    private boolean m33880b() {
        return this.f6169y < this.f6168x.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f
    /* renamed from: a */
    public boolean mo33751a() {
        while (true) {
            boolean z = false;
            if (this.f6168x != null && m33880b()) {
                this.f6170z = null;
                while (!z && m33880b()) {
                    List<InterfaceC2199n<File, ?>> list = this.f6168x;
                    int i = this.f6169y;
                    this.f6169y = i + 1;
                    this.f6170z = list.get(i).mo33499b(this.f6162A, this.f6164d.m33860s(), this.f6164d.m33873f(), this.f6164d.m33868k());
                    if (this.f6170z != null && this.f6164d.m33859t(this.f6170z.f6513c.mo33507a())) {
                        this.f6170z.f6513c.mo33503e(this.f6164d.m33867l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f6166f + 1;
            this.f6166f = i2;
            if (i2 >= this.f6163c.size()) {
                return false;
            }
            InterfaceC2118f interfaceC2118f = this.f6163c.get(this.f6166f);
            File mo33917b = this.f6164d.m33875d().mo33917b(new C2044d(interfaceC2118f, this.f6164d.m33864o()));
            this.f6162A = mo33917b;
            if (mo33917b != null) {
                this.f6167w = interfaceC2118f;
                this.f6168x = this.f6164d.m33869j(mo33917b);
                this.f6169y = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d.InterfaceC2131a
    /* renamed from: c */
    public void mo33546c(Exception exc) {
        this.f6165e.mo33747e(this.f6167w, exc, this.f6170z.f6513c, EnumC1993a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f
    public void cancel() {
        InterfaceC2199n.C2200a<?> c2200a = this.f6170z;
        if (c2200a != null) {
            c2200a.f6513c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d.InterfaceC2131a
    /* renamed from: d */
    public void mo33545d(Object obj) {
        this.f6165e.mo33744h(this.f6167w, obj, this.f6170z.f6513c, EnumC1993a.DATA_DISK_CACHE, this.f6167w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2043c(List<InterfaceC2118f> list, C2048g<?> c2048g, InterfaceC2046f.InterfaceC2047a interfaceC2047a) {
        this.f6166f = -1;
        this.f6163c = list;
        this.f6164d = c2048g;
        this.f6165e = interfaceC2047a;
    }
}
