package com.google.firebase.database.p138t;

import com.google.firebase.database.p138t.InterfaceC5900d;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: DefaultLogger.java */
/* renamed from: com.google.firebase.database.t.b */
/* loaded from: classes2.dex */
public class C5897b implements InterfaceC5900d {

    /* renamed from: a */
    private final Set<String> f14484a;

    /* renamed from: b */
    private final InterfaceC5900d.EnumC5901a f14485b;

    /* compiled from: DefaultLogger.java */
    /* renamed from: com.google.firebase.database.t.b$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C5898a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14486a;

        static {
            int[] iArr = new int[InterfaceC5900d.EnumC5901a.values().length];
            f14486a = iArr;
            try {
                iArr[InterfaceC5900d.EnumC5901a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14486a[InterfaceC5900d.EnumC5901a.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14486a[InterfaceC5900d.EnumC5901a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14486a[InterfaceC5900d.EnumC5901a.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C5897b(InterfaceC5900d.EnumC5901a enumC5901a, List<String> list) {
        if (list != null) {
            this.f14484a = new HashSet(list);
        } else {
            this.f14484a = null;
        }
        this.f14485b = enumC5901a;
    }

    @Override // com.google.firebase.database.p138t.InterfaceC5900d
    /* renamed from: a */
    public void mo23357a(InterfaceC5900d.EnumC5901a enumC5901a, String str, String str2, long j) {
        if (m23369g(enumC5901a, str)) {
            String mo23373c = mo23373c(enumC5901a, str, str2, j);
            int i = C5898a.f14486a[enumC5901a.ordinal()];
            if (i == 1) {
                mo23371e(str, mo23373c);
            } else if (i == 2) {
                mo23368h(str, mo23373c);
            } else if (i == 3) {
                mo23370f(str, mo23373c);
            } else if (i == 4) {
                mo23372d(str, mo23373c);
            } else {
                throw new RuntimeException("Should not reach here!");
            }
        }
    }

    @Override // com.google.firebase.database.p138t.InterfaceC5900d
    /* renamed from: b */
    public InterfaceC5900d.EnumC5901a mo23356b() {
        return this.f14485b;
    }

    /* renamed from: c */
    protected String mo23373c(InterfaceC5900d.EnumC5901a enumC5901a, String str, String str2, long j) {
        throw null;
    }

    /* renamed from: d */
    protected void mo23372d(String str, String str2) {
        throw null;
    }

    /* renamed from: e */
    protected void mo23371e(String str, String str2) {
        throw null;
    }

    /* renamed from: f */
    protected void mo23370f(String str, String str2) {
        throw null;
    }

    /* renamed from: g */
    protected boolean m23369g(InterfaceC5900d.EnumC5901a enumC5901a, String str) {
        return enumC5901a.ordinal() >= this.f14485b.ordinal() && (this.f14484a == null || enumC5901a.ordinal() > InterfaceC5900d.EnumC5901a.DEBUG.ordinal() || this.f14484a.contains(str));
    }

    /* renamed from: h */
    protected void mo23368h(String str, String str2) {
        throw null;
    }
}
