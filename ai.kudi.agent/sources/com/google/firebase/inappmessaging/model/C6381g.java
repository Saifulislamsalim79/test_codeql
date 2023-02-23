package com.google.firebase.inappmessaging.model;

import android.graphics.Bitmap;
import android.text.TextUtils;
/* compiled from: ImageData.java */
/* renamed from: com.google.firebase.inappmessaging.model.g */
/* loaded from: classes2.dex */
public class C6381g {

    /* renamed from: a */
    private final String f15447a;

    /* renamed from: b */
    private final Bitmap f15448b;

    /* compiled from: ImageData.java */
    /* renamed from: com.google.firebase.inappmessaging.model.g$a */
    /* loaded from: classes2.dex */
    public static class C6382a {

        /* renamed from: a */
        private String f15449a;

        /* renamed from: b */
        private Bitmap f15450b;

        /* renamed from: a */
        public C6381g m22159a() {
            if (!TextUtils.isEmpty(this.f15449a)) {
                return new C6381g(this.f15449a, this.f15450b);
            }
            throw new IllegalArgumentException("ImageData model must have an imageUrl");
        }

        /* renamed from: b */
        public C6382a m22158b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f15449a = str;
            }
            return this;
        }
    }

    public C6381g(String str, Bitmap bitmap) {
        this.f15447a = str;
        this.f15448b = bitmap;
    }

    /* renamed from: a */
    public static C6382a m22161a() {
        return new C6382a();
    }

    /* renamed from: b */
    public String m22160b() {
        return this.f15447a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6381g) {
            C6381g c6381g = (C6381g) obj;
            return hashCode() == c6381g.hashCode() && this.f15447a.equals(c6381g.f15447a);
        }
        return false;
    }

    public int hashCode() {
        Bitmap bitmap = this.f15448b;
        return this.f15447a.hashCode() + (bitmap != null ? bitmap.hashCode() : 0);
    }
}
