package com.google.firebase.inappmessaging.model;

import java.util.Map;
/* compiled from: ImageOnlyMessage.java */
/* renamed from: com.google.firebase.inappmessaging.model.h */
/* loaded from: classes2.dex */
public class C6383h extends AbstractC6386i {

    /* renamed from: d */
    private C6381g f15451d;

    /* renamed from: e */
    private C6365a f15452e;

    /* compiled from: ImageOnlyMessage.java */
    /* renamed from: com.google.firebase.inappmessaging.model.h$b */
    /* loaded from: classes2.dex */
    public static class C6385b {

        /* renamed from: a */
        C6381g f15453a;

        /* renamed from: b */
        C6365a f15454b;

        /* renamed from: a */
        public C6383h m22155a(C6377e c6377e, Map<String, String> map) {
            C6381g c6381g = this.f15453a;
            if (c6381g != null) {
                return new C6383h(c6377e, c6381g, this.f15454b, map);
            }
            throw new IllegalArgumentException("ImageOnly model must have image data");
        }

        /* renamed from: b */
        public C6385b m22154b(C6365a c6365a) {
            this.f15454b = c6365a;
            return this;
        }

        /* renamed from: c */
        public C6385b m22153c(C6381g c6381g) {
            this.f15453a = c6381g;
            return this;
        }
    }

    /* renamed from: d */
    public static C6385b m22157d() {
        return new C6385b();
    }

    @Override // com.google.firebase.inappmessaging.model.AbstractC6386i
    /* renamed from: b */
    public C6381g mo22150b() {
        return this.f15451d;
    }

    /* renamed from: e */
    public C6365a m22156e() {
        return this.f15452e;
    }

    public boolean equals(Object obj) {
        C6365a c6365a;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6383h) {
            C6383h c6383h = (C6383h) obj;
            if (hashCode() != c6383h.hashCode()) {
                return false;
            }
            return (this.f15452e != null || c6383h.f15452e == null) && ((c6365a = this.f15452e) == null || c6365a.equals(c6383h.f15452e)) && this.f15451d.equals(c6383h.f15451d);
        }
        return false;
    }

    public int hashCode() {
        C6365a c6365a = this.f15452e;
        return this.f15451d.hashCode() + (c6365a != null ? c6365a.hashCode() : 0);
    }

    private C6383h(C6377e c6377e, C6381g c6381g, C6365a c6365a, Map<String, String> map) {
        super(c6377e, MessageType.IMAGE_ONLY, map);
        this.f15451d = c6381g;
        this.f15452e = c6365a;
    }
}
