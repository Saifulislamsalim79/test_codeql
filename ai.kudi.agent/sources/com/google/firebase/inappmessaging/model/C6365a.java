package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
/* compiled from: Action.java */
/* renamed from: com.google.firebase.inappmessaging.model.a */
/* loaded from: classes2.dex */
public class C6365a {

    /* renamed from: a */
    private final String f15406a;

    /* renamed from: b */
    private final C6374d f15407b;

    /* compiled from: Action.java */
    /* renamed from: com.google.firebase.inappmessaging.model.a$b */
    /* loaded from: classes2.dex */
    public static class C6367b {

        /* renamed from: a */
        private String f15408a;

        /* renamed from: b */
        private C6374d f15409b;

        /* renamed from: a */
        public C6365a m22200a() {
            return new C6365a(this.f15408a, this.f15409b);
        }

        /* renamed from: b */
        public C6367b m22199b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f15408a = str;
            }
            return this;
        }

        /* renamed from: c */
        public C6367b m22198c(C6374d c6374d) {
            this.f15409b = c6374d;
            return this;
        }
    }

    /* renamed from: a */
    public static C6367b m22203a() {
        return new C6367b();
    }

    /* renamed from: b */
    public String m22202b() {
        return this.f15406a;
    }

    /* renamed from: c */
    public C6374d m22201c() {
        return this.f15407b;
    }

    public boolean equals(Object obj) {
        String str;
        C6374d c6374d;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6365a) {
            C6365a c6365a = (C6365a) obj;
            if (hashCode() != c6365a.hashCode()) {
                return false;
            }
            if ((this.f15406a != null || c6365a.f15406a == null) && ((str = this.f15406a) == null || str.equals(c6365a.f15406a))) {
                return (this.f15407b == null && c6365a.f15407b == null) || ((c6374d = this.f15407b) != null && c6374d.equals(c6365a.f15407b));
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15406a;
        int hashCode = str != null ? str.hashCode() : 0;
        C6374d c6374d = this.f15407b;
        return hashCode + (c6374d != null ? c6374d.hashCode() : 0);
    }

    private C6365a(String str, C6374d c6374d) {
        this.f15406a = str;
        this.f15407b = c6374d;
    }
}
