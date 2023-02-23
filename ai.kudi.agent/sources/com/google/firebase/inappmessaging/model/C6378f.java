package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: CardMessage.java */
/* renamed from: com.google.firebase.inappmessaging.model.f */
/* loaded from: classes2.dex */
public class C6378f extends AbstractC6386i {

    /* renamed from: d */
    private final C6397n f15433d;

    /* renamed from: e */
    private final C6397n f15434e;

    /* renamed from: f */
    private final String f15435f;

    /* renamed from: g */
    private final C6365a f15436g;

    /* renamed from: h */
    private final C6365a f15437h;

    /* renamed from: i */
    private final C6381g f15438i;

    /* renamed from: j */
    private final C6381g f15439j;

    /* compiled from: CardMessage.java */
    /* renamed from: com.google.firebase.inappmessaging.model.f$b */
    /* loaded from: classes2.dex */
    public static class C6380b {

        /* renamed from: a */
        C6381g f15440a;

        /* renamed from: b */
        C6381g f15441b;

        /* renamed from: c */
        String f15442c;

        /* renamed from: d */
        C6365a f15443d;

        /* renamed from: e */
        C6397n f15444e;

        /* renamed from: f */
        C6397n f15445f;

        /* renamed from: g */
        C6365a f15446g;

        /* renamed from: a */
        public C6378f m22169a(C6377e c6377e, Map<String, String> map) {
            C6365a c6365a = this.f15443d;
            if (c6365a != null) {
                if (c6365a.m22201c() != null) {
                    C6365a c6365a2 = this.f15446g;
                    if (c6365a2 != null && c6365a2.m22201c() == null) {
                        throw new IllegalArgumentException("Card model secondary action must be null or have a button");
                    }
                    if (this.f15444e != null) {
                        if (this.f15440a == null && this.f15441b == null) {
                            throw new IllegalArgumentException("Card model must have at least one image");
                        }
                        if (!TextUtils.isEmpty(this.f15442c)) {
                            return new C6378f(c6377e, this.f15444e, this.f15445f, this.f15440a, this.f15441b, this.f15442c, this.f15443d, this.f15446g, map);
                        }
                        throw new IllegalArgumentException("Card model must have a background color");
                    }
                    throw new IllegalArgumentException("Card model must have a title");
                }
                throw new IllegalArgumentException("Card model must have a primary action button");
            }
            throw new IllegalArgumentException("Card model must have a primary action");
        }

        /* renamed from: b */
        public C6380b m22168b(String str) {
            this.f15442c = str;
            return this;
        }

        /* renamed from: c */
        public C6380b m22167c(C6397n c6397n) {
            this.f15445f = c6397n;
            return this;
        }

        /* renamed from: d */
        public C6380b m22166d(C6381g c6381g) {
            this.f15441b = c6381g;
            return this;
        }

        /* renamed from: e */
        public C6380b m22165e(C6381g c6381g) {
            this.f15440a = c6381g;
            return this;
        }

        /* renamed from: f */
        public C6380b m22164f(C6365a c6365a) {
            this.f15443d = c6365a;
            return this;
        }

        /* renamed from: g */
        public C6380b m22163g(C6365a c6365a) {
            this.f15446g = c6365a;
            return this;
        }

        /* renamed from: h */
        public C6380b m22162h(C6397n c6397n) {
            this.f15444e = c6397n;
            return this;
        }
    }

    /* renamed from: d */
    public static C6380b m22177d() {
        return new C6380b();
    }

    @Override // com.google.firebase.inappmessaging.model.AbstractC6386i
    @Deprecated
    /* renamed from: b */
    public C6381g mo22150b() {
        return this.f15438i;
    }

    /* renamed from: e */
    public String m22176e() {
        return this.f15435f;
    }

    public boolean equals(Object obj) {
        C6397n c6397n;
        C6365a c6365a;
        C6381g c6381g;
        C6381g c6381g2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6378f) {
            C6378f c6378f = (C6378f) obj;
            if (hashCode() != c6378f.hashCode()) {
                return false;
            }
            if ((this.f15434e != null || c6378f.f15434e == null) && ((c6397n = this.f15434e) == null || c6397n.equals(c6378f.f15434e))) {
                if ((this.f15437h != null || c6378f.f15437h == null) && ((c6365a = this.f15437h) == null || c6365a.equals(c6378f.f15437h))) {
                    if ((this.f15438i != null || c6378f.f15438i == null) && ((c6381g = this.f15438i) == null || c6381g.equals(c6378f.f15438i))) {
                        return (this.f15439j != null || c6378f.f15439j == null) && ((c6381g2 = this.f15439j) == null || c6381g2.equals(c6378f.f15439j)) && this.f15433d.equals(c6378f.f15433d) && this.f15436g.equals(c6378f.f15436g) && this.f15435f.equals(c6378f.f15435f);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public C6397n m22175f() {
        return this.f15434e;
    }

    /* renamed from: g */
    public C6381g m22174g() {
        return this.f15439j;
    }

    /* renamed from: h */
    public C6381g m22173h() {
        return this.f15438i;
    }

    public int hashCode() {
        C6397n c6397n = this.f15434e;
        int hashCode = c6397n != null ? c6397n.hashCode() : 0;
        C6365a c6365a = this.f15437h;
        int hashCode2 = c6365a != null ? c6365a.hashCode() : 0;
        C6381g c6381g = this.f15438i;
        int hashCode3 = c6381g != null ? c6381g.hashCode() : 0;
        C6381g c6381g2 = this.f15439j;
        return this.f15433d.hashCode() + hashCode + this.f15435f.hashCode() + this.f15436g.hashCode() + hashCode2 + hashCode3 + (c6381g2 != null ? c6381g2.hashCode() : 0);
    }

    /* renamed from: i */
    public C6365a m22172i() {
        return this.f15436g;
    }

    /* renamed from: j */
    public C6365a m22171j() {
        return this.f15437h;
    }

    /* renamed from: k */
    public C6397n m22170k() {
        return this.f15433d;
    }

    private C6378f(C6377e c6377e, C6397n c6397n, C6397n c6397n2, C6381g c6381g, C6381g c6381g2, String str, C6365a c6365a, C6365a c6365a2, Map<String, String> map) {
        super(c6377e, MessageType.CARD, map);
        this.f15433d = c6397n;
        this.f15434e = c6397n2;
        this.f15438i = c6381g;
        this.f15439j = c6381g2;
        this.f15435f = str;
        this.f15436g = c6365a;
        this.f15437h = c6365a2;
    }
}
