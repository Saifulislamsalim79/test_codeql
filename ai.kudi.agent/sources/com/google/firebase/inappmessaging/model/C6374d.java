package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
/* compiled from: Button.java */
/* renamed from: com.google.firebase.inappmessaging.model.d */
/* loaded from: classes2.dex */
public class C6374d {

    /* renamed from: a */
    private final C6397n f15426a;

    /* renamed from: b */
    private final String f15427b;

    /* compiled from: Button.java */
    /* renamed from: com.google.firebase.inappmessaging.model.d$b */
    /* loaded from: classes2.dex */
    public static class C6376b {

        /* renamed from: a */
        private C6397n f15428a;

        /* renamed from: b */
        private String f15429b;

        /* renamed from: a */
        public C6374d m22183a() {
            if (!TextUtils.isEmpty(this.f15429b)) {
                C6397n c6397n = this.f15428a;
                if (c6397n != null) {
                    return new C6374d(c6397n, this.f15429b);
                }
                throw new IllegalArgumentException("Button model must have text");
            }
            throw new IllegalArgumentException("Button model must have a color");
        }

        /* renamed from: b */
        public C6376b m22182b(String str) {
            this.f15429b = str;
            return this;
        }

        /* renamed from: c */
        public C6376b m22181c(C6397n c6397n) {
            this.f15428a = c6397n;
            return this;
        }
    }

    /* renamed from: a */
    public static C6376b m22186a() {
        return new C6376b();
    }

    /* renamed from: b */
    public String m22185b() {
        return this.f15427b;
    }

    /* renamed from: c */
    public C6397n m22184c() {
        return this.f15426a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6374d) {
            C6374d c6374d = (C6374d) obj;
            return hashCode() == c6374d.hashCode() && this.f15426a.equals(c6374d.f15426a) && this.f15427b.equals(c6374d.f15427b);
        }
        return false;
    }

    public int hashCode() {
        return this.f15426a.hashCode() + this.f15427b.hashCode();
    }

    private C6374d(C6397n c6397n, String str) {
        this.f15426a = c6397n;
        this.f15427b = str;
    }
}
