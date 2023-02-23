package com.google.firebase.database.p131s.p132g0;

import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.C5811h;
/* compiled from: OperationSource.java */
/* renamed from: com.google.firebase.database.s.g0.e */
/* loaded from: classes2.dex */
public class C5750e {

    /* renamed from: d */
    public static final C5750e f14163d = new C5750e(EnumC5751a.User, null, false);

    /* renamed from: e */
    public static final C5750e f14164e = new C5750e(EnumC5751a.Server, null, false);

    /* renamed from: a */
    private final EnumC5751a f14165a;

    /* renamed from: b */
    private final C5811h f14166b;

    /* renamed from: c */
    private final boolean f14167c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OperationSource.java */
    /* renamed from: com.google.firebase.database.s.g0.e$a */
    /* loaded from: classes2.dex */
    public enum EnumC5751a {
        User,
        Server
    }

    public C5750e(EnumC5751a enumC5751a, C5811h c5811h, boolean z) {
        this.f14165a = enumC5751a;
        this.f14166b = c5811h;
        this.f14167c = z;
        C5795m.m23745f(!z || m23903c());
    }

    /* renamed from: a */
    public static C5750e m23905a(C5811h c5811h) {
        return new C5750e(EnumC5751a.Server, c5811h, true);
    }

    /* renamed from: b */
    public C5811h m23904b() {
        return this.f14166b;
    }

    /* renamed from: c */
    public boolean m23903c() {
        return this.f14165a == EnumC5751a.Server;
    }

    /* renamed from: d */
    public boolean m23902d() {
        return this.f14165a == EnumC5751a.User;
    }

    /* renamed from: e */
    public boolean m23901e() {
        return this.f14167c;
    }

    public String toString() {
        return "OperationSource{source=" + this.f14165a + ", queryParams=" + this.f14166b + ", tagged=" + this.f14167c + '}';
    }
}
