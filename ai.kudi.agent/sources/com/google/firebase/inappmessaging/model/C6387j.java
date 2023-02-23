package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: ModalMessage.java */
/* renamed from: com.google.firebase.inappmessaging.model.j */
/* loaded from: classes2.dex */
public class C6387j extends AbstractC6386i {

    /* renamed from: d */
    private final C6397n f15458d;

    /* renamed from: e */
    private final C6397n f15459e;

    /* renamed from: f */
    private final C6381g f15460f;

    /* renamed from: g */
    private final C6365a f15461g;

    /* renamed from: h */
    private final String f15462h;

    /* compiled from: ModalMessage.java */
    /* renamed from: com.google.firebase.inappmessaging.model.j$b */
    /* loaded from: classes2.dex */
    public static class C6389b {

        /* renamed from: a */
        C6397n f15463a;

        /* renamed from: b */
        C6397n f15464b;

        /* renamed from: c */
        C6381g f15465c;

        /* renamed from: d */
        C6365a f15466d;

        /* renamed from: e */
        String f15467e;

        /* renamed from: a */
        public C6387j m22144a(C6377e c6377e, Map<String, String> map) {
            if (this.f15463a != null) {
                C6365a c6365a = this.f15466d;
                if (c6365a != null && c6365a.m22201c() == null) {
                    throw new IllegalArgumentException("Modal model action must be null or have a button");
                }
                if (!TextUtils.isEmpty(this.f15467e)) {
                    return new C6387j(c6377e, this.f15463a, this.f15464b, this.f15465c, this.f15466d, this.f15467e, map);
                }
                throw new IllegalArgumentException("Modal model must have a background color");
            }
            throw new IllegalArgumentException("Modal model must have a title");
        }

        /* renamed from: b */
        public C6389b m22143b(C6365a c6365a) {
            this.f15466d = c6365a;
            return this;
        }

        /* renamed from: c */
        public C6389b m22142c(String str) {
            this.f15467e = str;
            return this;
        }

        /* renamed from: d */
        public C6389b m22141d(C6397n c6397n) {
            this.f15464b = c6397n;
            return this;
        }

        /* renamed from: e */
        public C6389b m22140e(C6381g c6381g) {
            this.f15465c = c6381g;
            return this;
        }

        /* renamed from: f */
        public C6389b m22139f(C6397n c6397n) {
            this.f15463a = c6397n;
            return this;
        }
    }

    /* renamed from: d */
    public static C6389b m22149d() {
        return new C6389b();
    }

    @Override // com.google.firebase.inappmessaging.model.AbstractC6386i
    /* renamed from: b */
    public C6381g mo22150b() {
        return this.f15460f;
    }

    /* renamed from: e */
    public C6365a m22148e() {
        return this.f15461g;
    }

    public boolean equals(Object obj) {
        C6397n c6397n;
        C6365a c6365a;
        C6381g c6381g;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6387j) {
            C6387j c6387j = (C6387j) obj;
            if (hashCode() != c6387j.hashCode()) {
                return false;
            }
            if ((this.f15459e != null || c6387j.f15459e == null) && ((c6397n = this.f15459e) == null || c6397n.equals(c6387j.f15459e))) {
                if ((this.f15461g != null || c6387j.f15461g == null) && ((c6365a = this.f15461g) == null || c6365a.equals(c6387j.f15461g))) {
                    return (this.f15460f != null || c6387j.f15460f == null) && ((c6381g = this.f15460f) == null || c6381g.equals(c6387j.f15460f)) && this.f15458d.equals(c6387j.f15458d) && this.f15462h.equals(c6387j.f15462h);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public String m22147f() {
        return this.f15462h;
    }

    /* renamed from: g */
    public C6397n m22146g() {
        return this.f15459e;
    }

    /* renamed from: h */
    public C6397n m22145h() {
        return this.f15458d;
    }

    public int hashCode() {
        C6397n c6397n = this.f15459e;
        int hashCode = c6397n != null ? c6397n.hashCode() : 0;
        C6365a c6365a = this.f15461g;
        int hashCode2 = c6365a != null ? c6365a.hashCode() : 0;
        C6381g c6381g = this.f15460f;
        return this.f15458d.hashCode() + hashCode + this.f15462h.hashCode() + hashCode2 + (c6381g != null ? c6381g.hashCode() : 0);
    }

    private C6387j(C6377e c6377e, C6397n c6397n, C6397n c6397n2, C6381g c6381g, C6365a c6365a, String str, Map<String, String> map) {
        super(c6377e, MessageType.MODAL, map);
        this.f15458d = c6397n;
        this.f15459e = c6397n2;
        this.f15460f = c6381g;
        this.f15461g = c6365a;
        this.f15462h = str;
    }
}
