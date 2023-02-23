package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.AbstractC7377y;
import com.squareup.picasso.C7360t;
import java.io.IOException;
import p565l.AbstractC14135d0;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14133d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NetworkRequestHandler.java */
/* renamed from: com.squareup.picasso.r */
/* loaded from: classes2.dex */
public class C7356r extends AbstractC7377y {

    /* renamed from: a */
    private final InterfaceC7345j f17424a;

    /* renamed from: b */
    private final C7318a0 f17425b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NetworkRequestHandler.java */
    /* renamed from: com.squareup.picasso.r$a */
    /* loaded from: classes2.dex */
    public static class C7357a extends IOException {
        C7357a(String str) {
            super(str);
        }
    }

    /* compiled from: NetworkRequestHandler.java */
    /* renamed from: com.squareup.picasso.r$b */
    /* loaded from: classes2.dex */
    static final class C7358b extends IOException {

        /* renamed from: c */
        final int f17426c;

        /* renamed from: d */
        final int f17427d;

        C7358b(int i, int i2) {
            super("HTTP " + i);
            this.f17426c = i;
            this.f17427d = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7356r(InterfaceC7345j interfaceC7345j, C7318a0 c7318a0) {
        this.f17424a = interfaceC7345j;
        this.f17425b = c7318a0;
    }

    /* renamed from: j */
    private static C14116a0 m18889j(C7373w c7373w, int i) {
        C14133d c14133d;
        if (i == 0) {
            c14133d = null;
        } else if (EnumC7355q.m18892a(i)) {
            c14133d = C14133d.f30855n;
        } else {
            C14133d.C14134a c14134a = new C14133d.C14134a();
            if (!EnumC7355q.m18891b(i)) {
                c14134a.m2840c();
            }
            if (!EnumC7355q.m18890e(i)) {
                c14134a.m2839d();
            }
            c14133d = c14134a.m2842a();
        }
        C14116a0.C14117a c14117a = new C14116a0.C14117a();
        c14117a.m2905h(c7373w.f17482d.toString());
        if (c14133d != null) {
            c14117a.m2910c(c14133d);
        }
        return c14117a.m2911b();
    }

    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: c */
    public boolean mo18830c(C7373w c7373w) {
        String scheme = c7373w.f17482d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: e */
    public int mo18838e() {
        return 2;
    }

    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: f */
    public AbstractC7377y.C7378a mo18829f(C7373w c7373w, int i) throws IOException {
        C14131c0 mo18888a = this.f17424a.mo18888a(m18889j(c7373w, i));
        AbstractC14135d0 m2878c = mo18888a.m2878c();
        if (mo18888a.m2882V()) {
            C7360t.EnumC7366e enumC7366e = mo18888a.m2872m() == null ? C7360t.EnumC7366e.NETWORK : C7360t.EnumC7366e.DISK;
            if (enumC7366e == C7360t.EnumC7366e.DISK && m2878c.mo309m() == 0) {
                m2878c.close();
                throw new C7357a("Received response with 0 content-length header.");
            }
            if (enumC7366e == C7360t.EnumC7366e.NETWORK && m2878c.mo309m() > 0) {
                this.f17425b.m18993f(m2878c.mo309m());
            }
            return new AbstractC7377y.C7378a(m2878c.mo310O(), enumC7366e);
        }
        m2878c.close();
        throw new C7358b(mo18888a.m2887F(), c7373w.f17481c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: h */
    public boolean mo18836h(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: i */
    public boolean mo18835i() {
        return true;
    }
}
