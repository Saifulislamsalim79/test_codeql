package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
/* compiled from: Text.java */
/* renamed from: com.google.firebase.inappmessaging.model.n */
/* loaded from: classes2.dex */
public class C6397n {

    /* renamed from: a */
    private final String f15470a;

    /* renamed from: b */
    private final String f15471b;

    /* compiled from: Text.java */
    /* renamed from: com.google.firebase.inappmessaging.model.n$b */
    /* loaded from: classes2.dex */
    public static class C6399b {

        /* renamed from: a */
        private String f15472a;

        /* renamed from: b */
        private String f15473b;

        /* renamed from: a */
        public C6397n m22115a() {
            if (!TextUtils.isEmpty(this.f15473b)) {
                return new C6397n(this.f15472a, this.f15473b);
            }
            throw new IllegalArgumentException("Text model must have a color");
        }

        /* renamed from: b */
        public C6399b m22114b(String str) {
            this.f15473b = str;
            return this;
        }

        /* renamed from: c */
        public C6399b m22113c(String str) {
            this.f15472a = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C6399b m22118a() {
        return new C6399b();
    }

    /* renamed from: b */
    public String m22117b() {
        return this.f15471b;
    }

    /* renamed from: c */
    public String m22116c() {
        return this.f15470a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6397n) {
            C6397n c6397n = (C6397n) obj;
            if (hashCode() != c6397n.hashCode()) {
                return false;
            }
            return (this.f15470a != null || c6397n.f15470a == null) && ((str = this.f15470a) == null || str.equals(c6397n.f15470a)) && this.f15471b.equals(c6397n.f15471b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15470a;
        return str != null ? str.hashCode() + this.f15471b.hashCode() : this.f15471b.hashCode();
    }

    private C6397n(String str, String str2) {
        this.f15470a = str;
        this.f15471b = str2;
    }
}
