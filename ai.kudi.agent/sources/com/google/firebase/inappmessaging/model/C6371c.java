package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: BannerMessage.java */
/* renamed from: com.google.firebase.inappmessaging.model.c */
/* loaded from: classes2.dex */
public class C6371c extends AbstractC6386i {

    /* renamed from: d */
    private final C6397n f15416d;

    /* renamed from: e */
    private final C6397n f15417e;

    /* renamed from: f */
    private final C6381g f15418f;

    /* renamed from: g */
    private final C6365a f15419g;

    /* renamed from: h */
    private final String f15420h;

    /* compiled from: BannerMessage.java */
    /* renamed from: com.google.firebase.inappmessaging.model.c$b */
    /* loaded from: classes2.dex */
    public static class C6373b {

        /* renamed from: a */
        C6397n f15421a;

        /* renamed from: b */
        C6397n f15422b;

        /* renamed from: c */
        C6381g f15423c;

        /* renamed from: d */
        C6365a f15424d;

        /* renamed from: e */
        String f15425e;

        /* renamed from: a */
        public C6371c m22192a(C6377e c6377e, Map<String, String> map) {
            if (this.f15421a != null) {
                if (!TextUtils.isEmpty(this.f15425e)) {
                    return new C6371c(c6377e, this.f15421a, this.f15422b, this.f15423c, this.f15424d, this.f15425e, map);
                }
                throw new IllegalArgumentException("Banner model must have a background color");
            }
            throw new IllegalArgumentException("Banner model must have a title");
        }

        /* renamed from: b */
        public C6373b m22191b(C6365a c6365a) {
            this.f15424d = c6365a;
            return this;
        }

        /* renamed from: c */
        public C6373b m22190c(String str) {
            this.f15425e = str;
            return this;
        }

        /* renamed from: d */
        public C6373b m22189d(C6397n c6397n) {
            this.f15422b = c6397n;
            return this;
        }

        /* renamed from: e */
        public C6373b m22188e(C6381g c6381g) {
            this.f15423c = c6381g;
            return this;
        }

        /* renamed from: f */
        public C6373b m22187f(C6397n c6397n) {
            this.f15421a = c6397n;
            return this;
        }
    }

    /* renamed from: d */
    public static C6373b m22197d() {
        return new C6373b();
    }

    @Override // com.google.firebase.inappmessaging.model.AbstractC6386i
    /* renamed from: b */
    public C6381g mo22150b() {
        return this.f15418f;
    }

    /* renamed from: e */
    public C6365a m22196e() {
        return this.f15419g;
    }

    public boolean equals(Object obj) {
        C6397n c6397n;
        C6381g c6381g;
        C6365a c6365a;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6371c) {
            C6371c c6371c = (C6371c) obj;
            if (hashCode() != c6371c.hashCode()) {
                return false;
            }
            if ((this.f15417e != null || c6371c.f15417e == null) && ((c6397n = this.f15417e) == null || c6397n.equals(c6371c.f15417e))) {
                if ((this.f15418f != null || c6371c.f15418f == null) && ((c6381g = this.f15418f) == null || c6381g.equals(c6371c.f15418f))) {
                    return (this.f15419g != null || c6371c.f15419g == null) && ((c6365a = this.f15419g) == null || c6365a.equals(c6371c.f15419g)) && this.f15416d.equals(c6371c.f15416d) && this.f15420h.equals(c6371c.f15420h);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public String m22195f() {
        return this.f15420h;
    }

    /* renamed from: g */
    public C6397n m22194g() {
        return this.f15417e;
    }

    /* renamed from: h */
    public C6397n m22193h() {
        return this.f15416d;
    }

    public int hashCode() {
        C6397n c6397n = this.f15417e;
        int hashCode = c6397n != null ? c6397n.hashCode() : 0;
        C6381g c6381g = this.f15418f;
        int hashCode2 = c6381g != null ? c6381g.hashCode() : 0;
        C6365a c6365a = this.f15419g;
        return this.f15416d.hashCode() + hashCode + hashCode2 + (c6365a != null ? c6365a.hashCode() : 0) + this.f15420h.hashCode();
    }

    private C6371c(C6377e c6377e, C6397n c6397n, C6397n c6397n2, C6381g c6381g, C6365a c6365a, String str, Map<String, String> map) {
        super(c6377e, MessageType.BANNER, map);
        this.f15416d = c6397n;
        this.f15417e = c6397n2;
        this.f15418f = c6381g;
        this.f15419g = c6365a;
        this.f15420h = str;
    }
}
